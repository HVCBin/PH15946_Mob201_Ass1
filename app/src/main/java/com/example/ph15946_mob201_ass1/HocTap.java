package com.example.ph15946_mob201_ass1;

public class HocTap {
    private int Hinhanh;
    private String Name;

    public HocTap(int hinhanh, String name) {
        Hinhanh = hinhanh;
        Name = name;
    }

    public HocTap() {
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
