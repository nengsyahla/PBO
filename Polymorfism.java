package polymorfism;

class Customer {
    String nama;
    String transaksi;
    
    void show() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("Transaksi: " + this.transaksi);
    }
}

//OVERRIDING

class Pelanggan extends Customer {
    String metode;

    void show() {
        System.out.println("Nama             : " + this.nama);
        System.out.println("Transaksi        : " + this.transaksi);
        System.out.println("Metode Pembayaran: " + this.metode);
    }
}

// OVERLOADING
class Pembeli extends Customer {
    
    public static int jumlah (int x,int y,int z){
        return x+y+z;
    }
    public static double jumlah (double x,double y,double z){
        return (double) x+y+z;
    }
    void show() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Transaksi   : " + this.transaksi);
    }
    
}
        public class Polymorfism {
    public static void main(String[] args) {
     
        System.out.println("\n");
        Customer customer = new Customer();
        customer.nama = "Risa";
        customer.transaksi = "\n 1.baju \n 2.celana \n 3.Tas";
        customer.show();
        
        Pelanggan pelanggan = new Pelanggan();
        System.out.println("\n");
        pelanggan.nama = "Sri";
        pelanggan.transaksi = "\n 1.sepatu \n 2.Jaket \n 3.Kaos";
        pelanggan.metode = "Non Tunai";
        pelanggan.show();
        
        Pembeli pembeli = new Pembeli ();
        System.out.println("\n");
        pembeli.nama = "Syahla";
        pembeli.transaksi = "\n 1.Hils \n 2.Dress \n 3.Krudung";
        pembeli.transaksi = "\n 1.Hils \n 2.Dress \n 3.Krudung";
        pembeli.show();
        System.out.println("Total Belanja Syahla ");
        int jumlah1 = Pembeli.jumlah(90000, 100000, 040000);
        System.out.println("Total Transaksi   : "+jumlah1);
        double jumlah2 = Pembeli.jumlah(50000, 4500000, 90000);
        System.out.println("Total Transaksi 2 :"+jumlah2);
        System.out.println("\n");
    }
}

