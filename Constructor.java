public class Constructor {
    // Atribute or properties
    String name;
    int age;
    String name1;
    int age1;

    // Constructor Contoh 1
    public Constructor() {
        System.out.println("Constructor");
    }

    // Method untuk menampilkan detail menggunakan method publick void karena nanti
    // bakalan berfungsi sebagai tampilan
    public void tampilan() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

    // Contoh 2 constructor with parameter mengisialisasi dan mengdeskripsikan
    public Constructor(String name1, int age1) {
        this.name1 = name1;
        this.age1 = age1;
    }

    // Behavior or method Contoh 2
    void perkenalanDiri() {
        System.out.println("Hai nama saya : " + name1);
        System.out.println("Umur saya : " + age1);
    }

    // method diatas tidak akan tampil jika tidak dipanggil pada main method

    public static void main(String[] args) {
        // new oop
        Constructor con = new Constructor();
        // Contoh 1
        con.name = "eday";
        con.age = 22;
        con.tampilan();

        // Contoh 2
        Constructor jon = new Constructor("zhell", 25);
        jon.perkenalanDiri();
    }
}
