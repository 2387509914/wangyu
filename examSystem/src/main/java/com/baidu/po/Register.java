package com.baidu.po;

public class Register {
    private Integer rid;

    private Integer lid;

    private String lname;

    private String passwoed;

    private String rsex;

    private String imger;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getPasswoed() {
        return passwoed;
    }

    public void setPasswoed(String passwoed) {
        this.passwoed = passwoed == null ? null : passwoed.trim();
    }

    public String getRsex() {
        return rsex;
    }

    public void setRsex(String rsex) {
        this.rsex = rsex == null ? null : rsex.trim();
    }

    public String getImger() {
        return imger;
    }

    public void setImger(String imger) {
        this.imger = imger == null ? null : imger.trim();
    }
}