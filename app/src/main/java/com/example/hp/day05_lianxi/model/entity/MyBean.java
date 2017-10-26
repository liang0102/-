package com.example.hp.day05_lianxi.model.entity;

import java.util.List;

/**
 * Created by HP on 2017/10/25.
 */
public class MyBean {

    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20171025033919","title":"佟丽娅：离开陈思诚的这半年，我活成了更美的自己。","source":"红衣教主","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54880603.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025033919"},{"id":"wechat_20171025036295","title":"20亿美元！13年来，财政部将首次发行美元主权债券","source":"FM95浙江经济广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34497627.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036295"},{"id":"wechat_20171025036284","title":"马云被授予世界首个科技创业名誉博士学位 鼓励年轻人成为\u201c科技创业家\u201d","source":"FM95浙江经济广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34497627.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036284"},{"id":"wechat_20171025036285","title":"【曝光台】10月23日，吐鲁番市又有一些单位和个人不文明行为曝光啦！（附照片）","source":"吐鲁番零距离","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35004432.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036285"},{"id":"wechat_20171025036394","title":"未来十年，农村这4类农民将会成为农村的\u201c穷二代\u201d，有你吗？","source":"戏说三农","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036568.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036394"},{"id":"wechat_20171025036297","title":"【聚焦】让山川林木葱郁，让大地遍染绿色，让天空湛蓝清新！","source":"阳曲微讯","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-55470195.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036297"},{"id":"wechat_20171025036290","title":"农村这5种宅基地要遭殃了，不允许翻建，一旦发现就要拆除了！","source":"戏说三农","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036433.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036290"},{"id":"wechat_20171025036289","title":"她血压控制挺好的，为什么还会得脑卒中？","source":"全科医学周刊","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036432.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036289"},{"id":"wechat_20171025036378","title":"工信部发文：下一个万亿级产业是环保装备制造业","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036378"},{"id":"wechat_20171025036377","title":"快讯 | 万向集团董事长鲁冠球先生今日逝世，曾为中国汽车行业首富","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036377"},{"id":"wechat_20171025036379","title":"我妈妈不容易\u2026\u2026谁他妈容易？！","source":"女拳文化","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036502.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036379"},{"id":"wechat_20171025036375","title":"基金年末排名将至 四季度决定高下","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036375"},{"id":"wechat_20171025036371","title":"三星SDI天津工厂股权遭抛售 韩系动力电池在华全面溃败？","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036371"},{"id":"wechat_20171025036316","title":"没买房的不用慌，未来3年，再不用担心房价暴涨","source":"楼市时评","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036461.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036316"},{"id":"wechat_20171025036315","title":"没买房的不用慌，未来3年，再不用担心房价暴涨","source":"楼市时评","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036461.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036315"},{"id":"wechat_20171025036309","title":"国际教育变局：发展迅猛，新力量崛起","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036457.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036309"},{"id":"wechat_20171025036308","title":"商业地产投资中，如何进行资产选择","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036443.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036308"},{"id":"wechat_20171025036395","title":"哈尔滨市第13次提高城市低保标准，惠及困难群众41万人","source":"黑龙江交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37646615.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036395"},{"id":"wechat_20171025036393","title":"一张图，带你看懂新一届党的中央领导机构","source":"黑龙江交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37646615.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036393"},{"id":"wechat_20171025036373","title":"驾照扣分年底不清零！最简单的算分方法都在这里了","source":"黑龙江交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37646615.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036373"}],"totalPage":8890,"ps":20,"pno":1}
     * error_code : 0
     */

    private String reason;
    private ResultMyBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultMyBean getResult() {
        return result;
    }

    public void setResult(ResultMyBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultMyBean {
        /**
         * list : [{"id":"wechat_20171025033919","title":"佟丽娅：离开陈思诚的这半年，我活成了更美的自己。","source":"红衣教主","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-54880603.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025033919"},{"id":"wechat_20171025036295","title":"20亿美元！13年来，财政部将首次发行美元主权债券","source":"FM95浙江经济广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34497627.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036295"},{"id":"wechat_20171025036284","title":"马云被授予世界首个科技创业名誉博士学位 鼓励年轻人成为\u201c科技创业家\u201d","source":"FM95浙江经济广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-34497627.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036284"},{"id":"wechat_20171025036285","title":"【曝光台】10月23日，吐鲁番市又有一些单位和个人不文明行为曝光啦！（附照片）","source":"吐鲁番零距离","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35004432.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036285"},{"id":"wechat_20171025036394","title":"未来十年，农村这4类农民将会成为农村的\u201c穷二代\u201d，有你吗？","source":"戏说三农","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036568.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036394"},{"id":"wechat_20171025036297","title":"【聚焦】让山川林木葱郁，让大地遍染绿色，让天空湛蓝清新！","source":"阳曲微讯","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-55470195.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036297"},{"id":"wechat_20171025036290","title":"农村这5种宅基地要遭殃了，不允许翻建，一旦发现就要拆除了！","source":"戏说三农","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036433.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036290"},{"id":"wechat_20171025036289","title":"她血压控制挺好的，为什么还会得脑卒中？","source":"全科医学周刊","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036432.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036289"},{"id":"wechat_20171025036378","title":"工信部发文：下一个万亿级产业是环保装备制造业","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036378"},{"id":"wechat_20171025036377","title":"快讯 | 万向集团董事长鲁冠球先生今日逝世，曾为中国汽车行业首富","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036377"},{"id":"wechat_20171025036379","title":"我妈妈不容易\u2026\u2026谁他妈容易？！","source":"女拳文化","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036502.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036379"},{"id":"wechat_20171025036375","title":"基金年末排名将至 四季度决定高下","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036375"},{"id":"wechat_20171025036371","title":"三星SDI天津工厂股权遭抛售 韩系动力电池在华全面溃败？","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-28180983.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036371"},{"id":"wechat_20171025036316","title":"没买房的不用慌，未来3年，再不用担心房价暴涨","source":"楼市时评","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036461.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036316"},{"id":"wechat_20171025036315","title":"没买房的不用慌，未来3年，再不用担心房价暴涨","source":"楼市时评","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036461.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036315"},{"id":"wechat_20171025036309","title":"国际教育变局：发展迅猛，新力量崛起","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036457.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036309"},{"id":"wechat_20171025036308","title":"商业地产投资中，如何进行资产选择","source":"经济观察报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56036443.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036308"},{"id":"wechat_20171025036395","title":"哈尔滨市第13次提高城市低保标准，惠及困难群众41万人","source":"黑龙江交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37646615.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036395"},{"id":"wechat_20171025036393","title":"一张图，带你看懂新一届党的中央领导机构","source":"黑龙江交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37646615.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036393"},{"id":"wechat_20171025036373","title":"驾照扣分年底不清零！最简单的算分方法都在这里了","source":"黑龙江交通广播","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37646615.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171025036373"}]
         * totalPage : 8890
         * ps : 20
         * pno : 1
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListMyBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListMyBean> getList() {
            return list;
        }

        public void setList(List<ListMyBean> list) {
            this.list = list;
        }

        public static class ListMyBean {
            /**
             * id : wechat_20171025033919
             * title : 佟丽娅：离开陈思诚的这半年，我活成了更美的自己。
             * source : 红衣教主
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-54880603.jpg/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20171025033919
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
