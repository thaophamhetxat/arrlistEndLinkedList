package com.codegym;

import java.util.Comparator;

public class SortSanPham implements Comparator<SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        if (o1.getGiaTien() > o2.getGiaTien()) {
            return 1;
        } else if (o1.getGiaTien() == o2.getGiaTien()) {
            return 0;
        } else {
            return -1;
        }
    }
}
