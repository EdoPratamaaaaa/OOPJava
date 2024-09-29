// Subclass (Kelas Turunan)
class Kucing extends Hewan {
    // Method overriding dari superclass
    @Override
    public void suara() {
        System.out.println("Kucing Mengeong");
    }

    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        hewan1.suara();
    }
}