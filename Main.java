public class Main {
    public static void main(String[] argv) {
        Lingkaran l = new Lingkaran(14);
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilData();
        System.out.println("--------------------");
        Segitiga sg = new Segitiga(8, 3);
        sg.hitungLuas();
        sg.hitungKeliling();
        sg.tampilData();
        System.out.println("--------------------");
        Persegi ps = new Persegi(5, 8);
        ps.hitungLuas();
        ps.hitungKeliling();
        ps.hitungDiagonal();
        ps.tampilData();

    }

}
