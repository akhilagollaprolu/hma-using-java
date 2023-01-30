package com.hma.Actors;

public class Room {
    public int rid;
    public String type;
    public float price;

    public Room(int rid, String type, float price) {
        this.rid = rid;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
