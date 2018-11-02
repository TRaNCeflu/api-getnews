package getnews;

import java.util.List;


public class NewsAPI {
    public static class Imageurls{
        public String url;
        public int height;
        public int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
    public static class Contentlist{
        public String link;
        public String id;
        public String content;
        public String nid;
        public Boolean havePic;
        public String pubDate;
        public String title;
        public List<Imageurls> imageurls;
        public String source;
        public String html;
        public String channelName;
        public String desc;
        public String channelId;

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Boolean getHavePic() {
            return havePic;
        }

        public void setHavePic(Boolean havePic) {
            this.havePic = havePic;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Imageurls> getImageurls() {
            return imageurls;
        }

        public void setImageurls(List<Imageurls> imageurls) {
            this.imageurls = imageurls;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNid() {
            return nid;
        }

        public void setNid(String nid) {
            this.nid = nid;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
    public static class Pagebean{
        public int allNum;
        public List<Contentlist> contentlist;
        public int maxResult;
        public int allPages;
        public int currentPage;

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public List<Contentlist> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<Contentlist> contentlist) {
            this.contentlist = contentlist;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }
    }

    public static class Showapi_res_body{
        public int ret_code;
        public Pagebean pagebean;

        public Pagebean getPagebean() {
            return pagebean;
        }

        public void setPagebean(Pagebean pagebean) {
            this.pagebean = pagebean;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }
    }
    public String showapi_res_error;
    public String showapi_res_id;
    public int showapi_res_code;
    public Showapi_res_body showapi_res_body;

    public Showapi_res_body getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(Showapi_res_body showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public String getShowapi_res_id() {
        return showapi_res_id;
    }

    public void setShowapi_res_id(String showapi_res_id) {
        this.showapi_res_id = showapi_res_id;
    }
}
