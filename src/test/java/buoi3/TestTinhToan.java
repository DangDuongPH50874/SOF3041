package buoi3;

import com.example.sof3041.buoi3.TinhToanService;
import com.example.sof3041.buoi3.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTinhToan {
    TinhToanService service = new TinhToanService();

    //Bài 1
    @Test
    public void kiemTraSoNguyen1() {
        assertTrue(service.kiemTraSoNguyen(5, 10));
    }

    @Test
    public void kiemTraSoNguyen2() {
        assertTrue(service.kiemTraSoNguyen(0, 0));
    }

    @Test
    public void kiemTraSoNguyen3() {
        assertFalse(service.kiemTraSoNguyen(5.5, 10));
    }

    @Test
    public void kiemTraSoNguyen4() {
        assertFalse(service.kiemTraSoNguyen(5, 10.7));
    }

    @Test
    public void kiemTraSoNguyen5() {
        assertTrue(service.kiemTraSoNguyen(-5, -10));
    }

    @Test
    public void kiemTraSoNguyen6() {
        assertFalse(service.kiemTraSoNguyen(-5.5, -10));
    }

    @Test
    public void kiemTraSoNguyen7() {
        assertFalse(service.kiemTraSoNguyen(0.1, 1));
    }

    @Test
    public void kiemTraSoNguyen8() {
        assertTrue(service.kiemTraSoNguyen(100, 1000));
    }

    @Test
    public void kiemTraSoNguyen9() {
        assertFalse(service.kiemTraSoNguyen(3.3, 4.4));
    }

    @Test
    public void kiemTraSoNguyen10() {
        assertTrue(service.kiemTraSoNguyen(0, -1));
    }


    //Bài 2
    @Test
    public void chiaHaiSo1() {
        assertEquals(2, service.chiaHaiSo(10, 5));
    }

    @Test
    public void chiaHaiSo2() {
        assertEquals(0, service.chiaHaiSo(0, 5));
    }

    @Test
    public void chiaHaiSo3() {
        assertEquals(-2, service.chiaHaiSo(-10, 5));
    }

    @Test
    public void chiaHaiSo4() {
        assertEquals(1, service.chiaHaiSo(5, 5));
    }

    @Test
    public void chiaHaiSo5() {
        assertThrows(ArithmeticException.class, () -> service.chiaHaiSo(5, 0));
    }

    @Test
    public void chiaHaiSo6() {
        assertEquals(-1, service.chiaHaiSo(5, -5));
    }

    @Test
    public void chiaHaiSo7() {
        assertEquals(3, service.chiaHaiSo(15, 5));
    }

    @Test
    public void chiaHaiSo8() {
        assertEquals(0, service.chiaHaiSo(1, 10));
    }

    @Test
    public void chiaHaiSo9() {
        assertEquals(7, service.chiaHaiSo(49, 7));
    }

    @Test
    public void chiaHaiSo10() {
        assertThrows(ArithmeticException.class, () -> service.chiaHaiSo(0, 0));
    }

    //Bài 3
    @Test
    public void tinhTrungBinhCong1() {
        assertEquals(3.0, service.tinhTrungBinhCong(new int[]{1, 2, 3, 4, 5}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong2() {
        assertEquals(5.0, service.tinhTrungBinhCong(new int[]{5, 5, 5, 5, 5}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong3() {
        assertEquals(0.0, service.tinhTrungBinhCong(new int[]{0, 0, 0, 0}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong4() {
        assertEquals(-3.0, service.tinhTrungBinhCong(new int[]{-1, -2, -3, -4, -5}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong5() {
        assertEquals(10.0, service.tinhTrungBinhCong(new int[]{10}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong6() {
        assertThrows(ArithmeticException.class, () -> service.tinhTrungBinhCong(new int[]{}));
    }

    @Test
    public void tinhTrungBinhCong7() {
        assertEquals(1.0, service.tinhTrungBinhCong(new int[]{1, 1, 1}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong8() {
        assertEquals(2.5, service.tinhTrungBinhCong(new int[]{1, 2, 3, 4}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong9() {
        assertEquals(0.5, service.tinhTrungBinhCong(new int[]{1, 0}), 0.01);
    }

    @Test
    public void tinhTrungBinhCong10() {
        assertEquals(4.6, service.tinhTrungBinhCong(new int[]{5, 4, 5, 4, 5}), 0.01);
    }

    //Bài 4
    @Test
    public void getElementAtIndex1() {
        assertEquals(5, service.getElementAtIndex(new int[]{5, 10, 15}, 0));
    }

    @Test
    public void getElementAtIndex2() {
        assertEquals(10, service.getElementAtIndex(new int[]{5, 10, 15}, 1));
    }

    @Test
    public void getElementAtIndex3() {
        assertEquals(15, service.getElementAtIndex(new int[]{5, 10, 15}, 2));
    }

    @Test
    public void getElementAtIndex4() {
        assertThrows(IndexOutOfBoundsException.class, () -> service.getElementAtIndex(new int[]{5, 10, 15}, 3));
    }

    @Test
    public void getElementAtIndex5() {
        assertThrows(IndexOutOfBoundsException.class, () -> service.getElementAtIndex(new int[]{5, 10, 15}, -1));
    }

    @Test
    public void getElementAtIndex6() {
        assertEquals(0, service.getElementAtIndex(new int[]{0, 1, 2}, 0));
    }

    @Test
    public void getElementAtIndex7() {
        assertEquals(1, service.getElementAtIndex(new int[]{0, 1, 2}, 1));
    }

    @Test
    public void getElementAtIndex8() {
        assertEquals(2, service.getElementAtIndex(new int[]{0, 1, 2}, 2));
    }

    @Test
    public void getElementAtIndex9() {
        assertThrows(IndexOutOfBoundsException.class, () -> service.getElementAtIndex(new int[]{}, 0));
    }

    @Test
    public void getElementAtIndex10() {
        assertEquals(100, service.getElementAtIndex(new int[]{100, 200, 300}, 0));
    }

    //Bài 5
    @Test
    public void getName1() {
        User user = new User("John");
        assertEquals("John", user.getName());
    }

    @Test
    public void getName2() {
        User user = new User("Alice");
        assertEquals("Alice", user.getName());
    }

    @Test
    public void getName3() {
        User user = new User(" ");
        assertEquals(" ", user.getName());
    }

    @Test
    public void getName4() {
        User user = new User("12345");
        assertEquals("12345", user.getName());
    }

    @Test
    public void getName5() {
        User user = new User("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void getName6() {
        User user = new User("Đặng Văn A");
        assertEquals("Đặng Văn A", user.getName());
    }

    @Test
    public void getName7() {
        User user = new User("");
        assertEquals("", user.getName());
    }

    @Test
    public void getName8() {
        User user = new User(null);
        assertThrows(NullPointerException.class, user::getName);
    }

    @Test
    public void getName9() {
        User user = new User("!@#$%^&*()");
        assertEquals("!@#$%^&*()", user.getName());
    }

    @Test
    public void getName10() {
        User user = new User("Nguyễn Văn B");
        assertEquals("Nguyễn Văn B", user.getName());
    }

    //Bài 6
    @Test
    public void timPhanTuBeNhat1() {
        assertEquals(1, service.timPhanTuBeNhat(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void timPhanTuBeNhat2() {
        assertEquals(-5, service.timPhanTuBeNhat(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void timPhanTuBeNhat3() {
        assertEquals(0, service.timPhanTuBeNhat(new int[]{0, 1, 2, 3}));
    }

    @Test
    public void timPhanTuBeNhat4() {
        assertEquals(-10, service.timPhanTuBeNhat(new int[]{-10, -5, 0, 5, 10}));
    }

    @Test
    public void timPhanTuBeNhat5() {
        assertThrows(IllegalArgumentException.class, () -> service.timPhanTuBeNhat(new int[]{}));
    }

    @Test
    public void timPhanTuBeNhat6() {
        assertEquals(10, service.timPhanTuBeNhat(new int[]{10}));
    }

    @Test
    public void timPhanTuBeNhat7() {
        assertEquals(1, service.timPhanTuBeNhat(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void timPhanTuBeNhat8() {
        assertEquals(-1, service.timPhanTuBeNhat(new int[]{0, -1}));
    }

    @Test
    public void timPhanTuBeNhat9() {
        assertEquals(5, service.timPhanTuBeNhat(new int[]{10, 5, 15}));
    }

    @Test
    public void timPhanTuBeNhat10() {
        assertEquals(0, service.timPhanTuBeNhat(new int[]{0, 0, 0}));
    }
}
