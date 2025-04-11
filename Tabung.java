package utp.shapes;

public class Tabung {
        private double radius, tinggi;
        private final String nama = "Tabung";
        private final double PI = 22.0 / 7.0;
    
        public Tabung(double radius, double tinggi) {
            this.radius = radius;
            this.tinggi = tinggi;
        }
    
        public double getLa() {
            return radius * radius * PI;
        }
    
        public double getK() {
            return 2 * radius * PI;
        }
    
        public double getLp() {
            return 2 * getLa() + getK() * tinggi;
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

