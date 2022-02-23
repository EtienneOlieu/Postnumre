package com.company;

public class City {
    private int postNummer;
    private String by;

    public City(int postNummer,String by){
        this.postNummer = postNummer;
        this.by = by;
    }

    public int getPostNummer() {
        return postNummer;
    }

    public void setPostNummer(int postNummer) {
        this.postNummer = postNummer;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }



    public String cityToString(){
        return postNummer + " " + by;
    }
}
