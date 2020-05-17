package com.example.android_lab;

import java.io.Serializable;

public class Animal implements Serializable {
    private int id;
    private String gatunek;
    private String kolor;
    private float wielkosc;
    private String opis;

    public Animal(){}

    public int getId() {
        return id;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getKolor() {
        return kolor;
    }

    public float getWielkosc() {
        return wielkosc;
    }

    public String getOpis() {
        return opis;
    }
    public void setId(int id){
        this.id = id;
    }

    public Animal(String gatunek, String kolor, float wielkosc, String opis){
        super();
        this.gatunek = gatunek;
        this.kolor = kolor;
        this.wielkosc = wielkosc;
        this.opis = opis;
    }

    @Override
    public String toString(){
        return "Zwierze: [_id=" + id + ", gatunek=" + gatunek + ", kolor=" + kolor + ", wielkosc=" + wielkosc + " ]";
    }
}
