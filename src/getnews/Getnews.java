package getnews;

import java.util.List;

import com.google.gson.Gson;
import com.show.api.ShowApiRequest;

public class Getnews {
	public static final String[] channelsStandard = new String[]{"���ʽ���" ,
            "��������" ,
            "̨������" ,
            "�۰�����" ,
            "��������" ,
            "��������" ,
            "�ƾ�����" ,
            "�������" ,
            "��۾�������" ,
            "����������" ,
            "��������" ,
            "��������" ,
            "��������" ,
            "������������" ,
            "������������" ,
            "CBA����" ,
            "�ۺ���������" ,
            "��������" ,
            "��Ӱ����" ,
            "��������" ,
            "��Ϸ����" ,
            "��������" ,
            "Ů������" ,
            "������������" ,
            "�Ƽ�����" ,
            "�������" ,
            "��������"
            };
	private static final String app_id  = "77817";
    private static final String app_secret = "60d76fa900d34bf4af4197db7c16614d";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//addToChannel();
		for(int i = 1;i<=3;i++) {
			for(int j = 0;j<channelsStandard.length;j++) {
				addToNews(channelsStandard[j], i);
				Thread.sleep(1500);
			}
		}
	}
	
	private static void addToChannel() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				String res = new ShowApiRequest("http://route.showapi.com/109-34", app_id, app_secret).post();
				Gson gson = new Gson();
				ChannelAPI channelAPI = gson.fromJson(res,ChannelAPI.class);
				List<ChannelAPI.ChannelList> channels = channelAPI.getShowapi_res_body().getChannelList();
				for(int i = 0;i<channels.size();i++) {
					ChannelAPI.ChannelList tmp = channels.get(i);
					for(int j = 0;j<channelsStandard.length;j++) {
						if(tmp.getName().equals(channelsStandard[j])) {
							Dao.inChannel(tmp.getChannelId(), tmp.getName());
						}
					}
				}
			}
		}).start();
	}
	
	private static void addToNews(String channelName,int page) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				String res = new ShowApiRequest("http://route.showapi.com/109-35",app_id,app_secret)
                        .addTextPara("channelId", "")
                        .addTextPara("channelName", channelName)
                        .addTextPara("title", "")
                        .addTextPara("page", page+"")
                        .addTextPara("needContent", "1")
                        .addTextPara("needHtml", "1")
                        .addTextPara("needAllList", "0")
                        .addTextPara("maxResult", "95")
                        .addTextPara("id", "")
                        .post();
				Gson gson = new Gson();
				NewsAPI newsAPI = gson.fromJson(res, NewsAPI.class);
				List<NewsAPI.Contentlist> contentlists = newsAPI.getShowapi_res_body().getPagebean().getContentlist();
				for(int i = 0;i<contentlists.size();i++) {
					NewsAPI.Contentlist tmp = contentlists.get(i);
					if(tmp.getContent().equals("")) {
						continue;
					}
					int havepic;
					if(tmp.getHavePic()) {
						havepic = 1;
					}
					else {
						havepic = 0;
					}
					Dao.inNews(tmp.getId(), tmp.getChannelId(), tmp.getChannelName(),tmp.getContent(),
							tmp.getDesc(), havepic+"", tmp.getHtml(),tmp.getLink(),tmp.getNid()
							, tmp.getPubDate(), tmp.getSource(), tmp.getTitle());
					
				}
				/*for(int k = 0;k<channelsStandard.length;k++) {
					String res = new ShowApiRequest("http://route.showapi.com/109-35",app_id,app_secret)
	                        .addTextPara("channelId", "")
	                        .addTextPara("channelName", channelsStandard[k])
	                        .addTextPara("title", "")
	                        .addTextPara("page", "1")
	                        .addTextPara("needContent", "1")
	                        .addTextPara("needHtml", "1")
	                        .addTextPara("needAllList", "0")
	                        .addTextPara("maxResult", "95")
	                        .addTextPara("id", "")
	                        .post();
					Gson gson = new Gson();
					NewsAPI newsAPI = gson.fromJson(res, NewsAPI.class);
					List<NewsAPI.Contentlist> contentlists = newsAPI.getShowapi_res_body().getPagebean().getContentlist();
					for(int i = 0;i<contentlists.size();i++) {
						NewsAPI.Contentlist tmp = contentlists.get(i);
						if(tmp.getContent()=="") {
							continue;
						}
						int havepic;
						if(tmp.getHavePic()) {
							havepic = 1;
						}
						else {
							havepic = 0;
						}
						//System.out.println(tmp.getDesc());
						Dao.inNews(tmp.getId(), tmp.getChannelId(), tmp.getChannelName(),tmp.getContent(),
								tmp.getDesc(), havepic+"", tmp.getHtml(),tmp.getLink(),tmp.getNid()
								, tmp.getPubDate(), tmp.getSource(), tmp.getTitle());
						
					}
				}*/
			}
		}).start();
	}

}
