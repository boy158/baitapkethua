class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
    }
}

public class Main {
    public static void main(String[] args) {
        SinhVienIT sv = new SinhVienIT("Nguyen Van A", "Cong nghe thong tin", 7.5, 8.5, 6.5);
        sv.xuat();
    }
}
