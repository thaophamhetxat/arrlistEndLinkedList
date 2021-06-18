package com.codegym;

import java.util.Comparator;

public class SanPham{
    String name;
    String id;
    int giaTien;
    String noiSanXuat;

    public SanPham() {
    }

    public SanPham(String name, String id, int giaTien, String noiSanXuat) {
        this.name = name;
        this.id = id;
        this.giaTien = giaTien;
        this.noiSanXuat = noiSanXuat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", giaTien='" + giaTien + '\'' +
                ", noiSanXuat='" + noiSanXuat + '\'' +
                '}';
    }

}
