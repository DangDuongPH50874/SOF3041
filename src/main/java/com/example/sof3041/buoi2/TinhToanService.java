package com.example.sof3041.buoi2;

import java.util.List;

public class TinhToanService {
    public int tinhTong(int a, int b) {
        return a + b;
    }

    public int tinhHieu(int a, int b) {
        return a - b;
    }

    public int tinhTich(int a, int b) {
        return a * b;
    }

    public double tinhThuong(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }

    public double tinhTrungBinhCong(double a, double b) {
        return (a + b) / 2;
    }

    public int timViTriMang(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int tinhTongNSoNguyen(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int tinhTongNSoLe(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
    }

    public boolean kiemTraSoAm(int number) {
        return number < 0;
    }

    public String kiemTraDuongHayAm(int number) {
        if (number > 0) {
            return "Dương";
        } else if (number < 0) {
            return "Âm";
        } else {
            return "Số 0";
        }
    }

}
