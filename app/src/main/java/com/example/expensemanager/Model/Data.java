package com.example.expensemanager.Model;

public class Data {
    private int amount;
    private String type;
    private String note;
    private String id;
    private String data;

    public Data(int amount, String type, String note, String id, String data) {
        this.amount = amount;
        this.type = type;
        this.note = note;
        this.id = id;
        this.data = data;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getNote() {
        return note;
    }

    public String getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }



    public Data(){

    }
}
