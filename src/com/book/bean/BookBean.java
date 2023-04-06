package com.book.bean;

public class BookBean {
    /**
     * 图书的数据表的bean
     */
    private int bid;//id
    private String name;//图书名称
    private String card;//图书号
    private String author;//作者
    private int num;//图书数量
    private String type;//图书的分类
    private String press;//出版社
    private boolean times;

    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCard() {
        return card;
    }
    public void setCard(String card) {
        this.card = card;
    }
    public String getAutho() {
        return author;
    }
    public void setAutho(String autho) {
        this.author = autho;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPress() {
        return press;
    }
    public void setPress(String press) {
        this.press = press;
    }

    public boolean getTimes() {
        return times;
    }

    public void setTimes(boolean times) {
        this.times = times;
    }
}
