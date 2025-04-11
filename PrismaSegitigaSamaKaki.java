package utp.shapes;

public class PrismaSegitigaSamaKaki {
    private double alas, kaki, tinggi;
    private final String nama = "Prisma Segitiga Sama Kaki";

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
    }

    public double getLa() {
        double ta = Math.sqrt((kaki * kaki) - Math.pow(alas / 2.0, 2));
        return ta * alas / 2;
    }

    public double getLp() {
        double K = 2 * kaki + alas;
        return 2 * getLa() + K * tinggi;
    }

    public double getVolume() {
        return getLa() * tinggi;
    }

    public void printInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("Luas permukaan  : " + getLp());
        System.out.println("Volume          : " + getVolume());
    }
}