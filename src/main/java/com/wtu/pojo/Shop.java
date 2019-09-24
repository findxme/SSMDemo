package com.wtu.pojo;

public class Shop {
    private int Gid;
    private String Gname;
    private String Gprice;

    public int getGid() {
        return Gid;
    }

    public void setGid(int gid) {
        Gid = gid;
    }

    public String getGname() {
        return Gname;
    }

    public void setGname(String gname) {
        Gname = gname;
    }

    public String getGprice() {
        return Gprice;
    }

    public void setGprice(String gprice) {
        Gprice = gprice;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Gid=" + Gid +
                ", Gname='" + Gname + '\'' +
                ", Gprice='" + Gprice + '\'' +
                '}';
    }
}
