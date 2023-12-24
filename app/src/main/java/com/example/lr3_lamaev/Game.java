package com.example.lr3_lamaev;

public class Game
{
    private String name; // название
    private String publisher; // издатель
    private int posterResource; // ресурс постера

    public Game(String name, String publisher, int poster )
    {
        this.name = name;
        this.publisher = publisher;
        this.posterResource = poster;
    }

    public String getName() {return  this.name;}
    public void setName (String name) {this.name = name;}
    public String getPublisher() {return this.publisher;}
    public void setPublisher (String publisher) {this.publisher = publisher;}
    public int getPosterResource() {return this.posterResource;}
    public void setPosterResource(int posterResource) {this.posterResource = posterResource;}
}
