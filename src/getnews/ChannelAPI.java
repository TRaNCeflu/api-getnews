package getnews;

import java.util.List;

public class ChannelAPI {
    public static class ChannelList{
        public String channelId;
        public String name;

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static class Showapi_res_body{
        public int totalNum;
        public int ret_code;
        public List<ChannelList> channelList;

        public List<ChannelList> getChannelList() {
            return channelList;
        }

        public void setChannelList(List<ChannelList> channelList) {
            this.channelList = channelList;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public int getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
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
