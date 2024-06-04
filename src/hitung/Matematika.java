package hitung;

public class Matematika {
    //Membuat  Variabel
    private double bill1, bill2;
    
    //Membuat constructor
    public Matematika (double bill1, double bill2){
        this.bill1 = bill1;
        this.bill2 = bill2;       
    }
    //Membuat MethodPenjumlahan
    public double setPenjumlahan(){
        return bill1 + bill2;
    }
    //Membuat MethodPengurangan
    public double setPengurangan(){
        return bill1 - bill2;
    }
    //Membuat MethodPerkalian
    public double setPerkalian(){
        return bill1 * bill2;
    }
    //Membuat MethodPembagian
    public double setPembagian(){
        return bill1 / bill2;
    }
}
