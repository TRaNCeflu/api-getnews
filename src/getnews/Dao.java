package getnews;

public class Dao {
	public static void inChannel(String channelId,String channelName) {
		SqlUtil su=new SqlUtil();
		//String sql="select * from channel";
		//ResultSet rs=su.query(sql);
		/*String orderid1=null;
		String pname1=null;*/
			/*int flag=0;
			while(rs.next()) {
				orderid1 = rs.getString("orderid");
				pname1=rs.getString("pname");
				if(orderid1.equals(orderid)||pname1.equals(pname)) {
					System.out.println("订单有重复！！");
					flag=1;
					return false;
				}
			}*/
			System.out.println("添加成功！！");
			String sql1="insert channel(channelId,channelName) values('"+channelId+"','"+channelName+"')";
			su.exec(sql1);
			
			su.close();
	}
	public static void inNews(String id,String channelId,String channelName,String content,String desc,
			String havepic,String html,String link,String nid,String pubDate,String source,String title) {
		SqlUtil su = new SqlUtil();
		/*String sql = "insert news(id,channelId,content,desc,havepic,html,pubDate,"
				+ "source,title) values('"
				+id+"','"+channelId+"','"+content+"','"+desc+"','"+havepic+"','"+html
				+"','"+pubDate+"','"+source+"','"+title+"')";*/
		String desc1 = desc.replaceAll("'", "''");
		String html1 = html.replaceAll("'", "''");
		String content1 = content.replaceAll("'", "''");
		String title1 = title.replaceAll("'", "''");
		String sql = "insert news(id,channelId,channelName,content,source,title,pubDate,link,nid,havepic,descs,htmls) values('"+id+"','"+channelId+"','"+channelName+"','"+
				content1+"','"+source+"','"+title+"','"+pubDate+"','"+link+"','"+nid+"','"+havepic+"','"+desc1+"','"+html1+"')";
		su.exec(sql);
		su.close();
	}
}
