public class Inheritance extends Constructor {
    // Atribute or Properties
    String alamat;

    // contoh 1
    public Inheritance() {
        System.out.println("Constructor");
    }

    public void tampilan() {
        System.out.println("NAMA : " + name);
        System.out.println("UMUR : " + age);
        System.out.println("ALAMAT : " + alamat);
    }

    // atau menggunakan contoh 2
    public Inheritance(String name, int age, String alamat) {
        this.name = name;
        this.age = age;
        this.alamat = alamat;
    }

    void perkenalanDiri() {
        System.out.println("NAMA SAYA ADALAH : " + name);
        System.out.println("UMUR SAYA ADALAH : " + age);
        System.out.println("ALAMAT SAYA ADALAH : " + alamat);
    }

    public static void main(String[] args) {
        // Contoh 1 menggunakan new
        Inheritance in = new Inheritance();
        in.name = "Budi";
        in.age = 21;
        in.alamat = "indonesia";
        in.tampilan();

        // Contoh 2
        Inheritance edi = new Inheritance("Udin", 22, "Jakarta");
        edi.perkenalanDiri();

        // contoh 3 langsun memanggil secara seluruh class dari Constructor
        Constructor jon = new Constructor("zhell", 25);
        jon.perkenalanDiri();
    }
}
