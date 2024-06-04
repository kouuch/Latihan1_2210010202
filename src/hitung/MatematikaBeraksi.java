package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Matematika m1 = new Matematika(0,2);
        
        //menampilkan method
        System.out.println("Hasil Penjumlahan"+m1.setPenjumlahan());
        System.out.println("Hasil Pengurangan"+m1.setPengurangan());
        System.out.println("Hasil Perkalian"+m1.setPerkalian());
        System.out.println("Hasil Pembagian"+m1.setPembagian());
    }
}
