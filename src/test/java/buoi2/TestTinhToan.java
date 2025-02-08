package buoi2;

import com.example.sof3041.buoi2.TinhToanService;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhToan {
    TinhToanService service = new TinhToanService();

    //Bài 1
    @Test
    public void tinhTong1() {
        assertEquals(15, service.tinhTong(5, 10));
    }

    @Test
    public void tinhTong2() {
        assertEquals(14, service.tinhTong(4, 10));
    }

    @Test
    public void tinhTong3() {
        assertEquals(16, service.tinhTong(6, 10));
    }

    @Test
    public void tinhTong4() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5() {
        assertEquals(20, service.tinhTong(10, 10));
    }

    //Bài 2
    @Test
    public void testTinhHieu1() {
        assertEquals(5, service.tinhHieu(10, 5));
    }

    @Test
    public void testTinhHieu2() {
        assertEquals(-5, service.tinhHieu(5, 10));
    }

    @Test
    public void testTinhHieu3() {
        assertEquals(0, service.tinhHieu(10, 10));
    }

    @Test
    public void testTinhHieu4() {
        assertEquals(20, service.tinhHieu(30, 10));
    }

    @Test
    public void testTinhHieu5() {
        assertEquals(-20, service.tinhHieu(-10, 10));
    }

    //Bài 3
    @Test
    public void testTinhTich1() {
        assertEquals(50, service.tinhTich(10, 5));
    }

    @Test
    public void testTinhTich2() {
        assertEquals(-50, service.tinhTich(-10, 5));
    }

    @Test
    public void testTinhTich3() {
        assertEquals(0, service.tinhTich(0, 10));
    }

    @Test
    public void testTinhTich4() {
        assertEquals(100, service.tinhTich(10, 10));
    }

    @Test
    public void testTinhTich5() {
        assertEquals(-100, service.tinhTich(10, -10));
    }

    //Bài 4
    @Test
    public void testTinhThuong1() {
        assertEquals(2.0, service.tinhThuong(10, 5));
    }

    @Test
    public void testTinhThuong2() {
        assertEquals(0.5, service.tinhThuong(5, 10));
    }

    @Test
    public void testTinhThuong3() {
        assertEquals(-1.0, service.tinhThuong(-10, 10));
    }

    @Test
    public void testTinhThuong4() {
        assertEquals(0.0, service.tinhThuong(0, 10));
    }

    @Test
    public void testTinhThuong5() {
        assertThrows(IllegalArgumentException.class, () -> service.tinhThuong(10, 0));
    }

    //Bài 5
    @Test
    public void testTinhTrungBinhCong1() {
        assertEquals(7.5, service.tinhTrungBinhCong(5, 10));
    }

    @Test
    public void testTinhTrungBinhCong2() {
        assertEquals(0, service.tinhTrungBinhCong(0, 0));
    }

    @Test
    public void testTinhTrungBinhCong3() {
        assertEquals(5.5, service.tinhTrungBinhCong(1, 10));
    }

    @Test
    public void testTinhTrungBinhCong4() {
        assertEquals(-2.5, service.tinhTrungBinhCong(-5, 0));
    }

    @Test
    public void testTinhTrungBinhCong5() {
        assertEquals(0.5, service.tinhTrungBinhCong(-1, 2));
    }

    //Bài 6
    @Test
    public void testTimViTriMang1() {
        assertEquals(2, service.timViTriMang(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testTimViTriMang2() {
        assertEquals(0, service.timViTriMang(new int[]{10, 20, 30}, 10));
    }

    @Test
    public void testTimViTriMang3() {
        assertEquals(-1, service.timViTriMang(new int[]{5, 10, 15}, 20));
    }

    @Test
    public void testTimViTriMang4() {
        assertEquals(3, service.timViTriMang(new int[]{5, 5, 5, 10}, 10));
    }

    @Test
    public void testTimViTriMang5() {
        assertEquals(-1, service.timViTriMang(new int[]{}, 10));
    }

    //Bài 7
    @Test
    public void testTinhTongNSoNguyen1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, service.tinhTongNSoNguyen(numbers));
    }

    @Test
    public void testTinhTongNSoNguyen2() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3);
        assertEquals(-6, service.tinhTongNSoNguyen(numbers));
    }

    @Test
    public void testTinhTongNSoNguyen3() {
        List<Integer> numbers = Arrays.asList(0, 0, 0);
        assertEquals(0, service.tinhTongNSoNguyen(numbers));
    }

    @Test
    public void testTinhTongNSoNguyen4() {
        List<Integer> numbers = Arrays.asList(100, 200, 300);
        assertEquals(600, service.tinhTongNSoNguyen(numbers));
    }

    @Test
    public void testTinhTongNSoNguyen5() {
        List<Integer> numbers = Arrays.asList();
        assertEquals(0, service.tinhTongNSoNguyen(numbers));
    }

    //Bài 8
    @Test
    public void testTinhTongNSoLe1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(9, service.tinhTongNSoLe(numbers));
    }

    @Test
    public void testTinhTongNSoLe2() {
        List<Integer> numbers = Arrays.asList(2, 4, 6);
        assertEquals(0, service.tinhTongNSoLe(numbers));
    }

    @Test
    public void testTinhTongNSoLe3() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(25, service.tinhTongNSoLe(numbers));
    }

    @Test
    public void testTinhTongNSoLe4() {
        List<Integer> numbers = Arrays.asList(-1, -3, -5);
        assertEquals(-9, service.tinhTongNSoLe(numbers));
    }

    @Test
    public void testTinhTongNSoLe5() {
        List<Integer> numbers = Arrays.asList();
        assertEquals(0, service.tinhTongNSoLe(numbers));
    }

    // Bài 9
    @Test
    public void testKiemTraSoAm1() {
        assertTrue(service.kiemTraSoAm(-5));
    }

    @Test
    public void testKiemTraSoAm2() {
        assertTrue(service.kiemTraSoAm(-6));
    }

    @Test
    public void testKiemTraSoAm3() {
        assertTrue(service.kiemTraSoAm(-7));
    }

    @Test
    public void testKiemTraSoAm4() {
        assertFalse(service.kiemTraSoAm(0));
    }

    @Test
    public void testKiemTraSoAm5() {
        assertTrue(service.kiemTraSoAm(-1));
    }

    // Bài 10
    @Test
    public void testKiemTraDuongHayAm1() {
        assertEquals("Dương", service.kiemTraDuongHayAm(5));
    }

    @Test
    public void testKiemTraDuongHayAm2() {
        assertEquals("Âm", service.kiemTraDuongHayAm(-5));
    }

    @Test
    public void testKiemTraDuongHayAm3() {
        assertEquals("Số 0", service.kiemTraDuongHayAm(0));
    }

    @Test
    public void testKiemTraDuongHayAm4() {
        assertEquals("Dương", service.kiemTraDuongHayAm(100));
    }

    @Test
    public void testKiemTraDuongHayAm5() {
        assertEquals("Âm", service.kiemTraDuongHayAm(-100));
    }
}
