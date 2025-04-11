package utp.shapes;

public class LimasPersegi {
    private double sisi, tinggi;
    private final String nama = "Limas Persegi";

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double getLs() {
        double ts = Math.sqrt((tinggi * tinggi) + Math.pow(sisi / 2.0, 2));
        return ts * sisi / 2;
    }

    public double getLa() {
        return sisi * sisi;
    }

    public double getLp() {
        return 4 * getLs() + getLa();
    }

    public double getVolume() {
        return getLa() * tinggi / 3;
    }

    public void printInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("Luas permukaan  : " + getLp());
        System.out.println("Volume          : " + getVolume());
    }
}

