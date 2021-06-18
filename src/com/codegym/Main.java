package com.codegym;

import java.util.Scanner;

public class Main {
    static ManagerSanPham managerSanPham = new ManagerSanPham();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	menu();

    }
    public static void menu() {
        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Show");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("7. Exit");
            System.out.println("Enter choise:");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1: managerSanPham.addSanPham();break;
                case 4: managerSanPham.show();break;
                case 3: managerSanPham.xoaSanPham();break;
                case 2:{

                    managerSanPham.update();
                }break;
                case 5: {
                    System.out.println("nhap id tim kiem");
                    String index3 = scanner.nextLine();
                    managerSanPham.timKiem(index3);
                }break;
                case 6:managerSanPham.xapXep();break;
            }
        }
    }
}
