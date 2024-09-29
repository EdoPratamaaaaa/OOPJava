public class Polymorphism { // Class
    // Overloading (Yaitu 2 atau lebih method beradaa diclass yang sama dengan
    // ketentuan nama method sama tetapi parameter harus beda return types boleh
    // beda)

    // Contoh Constructor
    int num1;
    int num2;

    public void tampilan() {
        System.out.println("Nilai Penjumlahan Constructor : " + (num1 + num2));
    }

    // Contoh Polymorphism Overloading
    public int jumlah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Constructor
        Polymorphism con = new Polymorphism();
        con.num1 = 2;
        con.num2 = 3;
        con.tampilan();

        // Polymorphism Overloading
        Polymorphism Poly = new Polymorphism();
        System.out.println("Hasil jumlah menggunakan Polymorphism : " + Poly.jumlah(5, 7));

    }
}
