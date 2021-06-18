package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerSanPham {
    static ArrayList<SanPham> list = new ArrayList<SanPham>();
    static Scanner scanner = new Scanner(System.in);
    static SortSanPham sortSanPham = new SortSanPham();

    public void addSanPham() {
        System.out.println("Id: ");
        String id = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Gia tien: ");
        int giaTien = Integer.parseInt(scanner.nextLine());
        System.out.println("Noi san xuat: ");
        String noiSanXuat = scanner.nextLine();

        SanPham sanPham = new SanPham(id, name, giaTien, noiSanXuat);
        list.add(sanPham);
    }

    public void show() {
        for (SanPham s : list) {
            System.out.println(s);
        }
    }

    public void xoaSanPham() {
            list.clear();
    }

    public void update() {
        SanPham count = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        String index4 = scanner.nextLine();

        System.out.println("fixid: ");
        String id = scanner.nextLine();
        System.out.println("fix Name");
        String name = scanner.nextLine();
        System.out.println("fix gia tien");
        int giaTien = Integer.parseInt(scanner.nextLine());
        System.out.println("fix noi san xuat");
        String noiSanXuat = scanner.nextLine();


        for (SanPham s : list) {
            if (s.getId().equals(index4)) {
                s.setId(id);
                s.setName(name);
                s.setGiaTien(giaTien);
                s.setNoiSanXuat(noiSanXuat);
            }
        }


    }

    public void timKiem(String index3) {
        for (SanPham s : list) {
            if (s.getId().equals(index3)) {
                System.out.println(s);
            }
        }
    }

    public void xapXep() {
        Collections.sort(list, sortSanPham);
    }

}
