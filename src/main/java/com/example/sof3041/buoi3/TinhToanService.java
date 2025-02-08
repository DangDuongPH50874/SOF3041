package com.example.sof3041.buoi3;

public class TinhToanService {
    //Bài 1
    public boolean kiemTraSoNguyen(double a, double b) {
        return a == (int) a && b == (int) b;
    }

    //Bài 2
    public int chiaHaiSo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    //Bài 3
    public double tinhTrungBinhCong(int[] numbers) {
        if (numbers.length == 0) {
            throw new ArithmeticException("Danh sách trống");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    //Bài 4
    public int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Ngoài phạm vi mảng");
        }
        return array[index];
    }

    //Bài 6
    public int timPhanTuBeNhat(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Mảng trống");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
