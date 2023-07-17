package pbo;

import java.util.Scanner;

public class PenjualanBeraksi {
    
    public static void main(String[] args) {
        
            //Penjualan pertama = new Penjualan ("1","Edho","0102");
        
            //System.out.println(pertama.displayInfo());
            //System.out.println(pertama.displayInfo("Aktif"));
        
            boolean running = true;

            //atribut
            int meja = 50000;
            int kursi = 30000;
            String jawab;
            
            //error handling
            try{
                
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in);

            //perualangan while
            while (running){

            //array
            PenjualanDetail[] brg = new PenjualanDetail[2];

            System.out.println("===== Jual Meja & Kursi =====");
            System.out.println("Harga Meja  : Rp50000");
            System.out.println("Harga Kursi : Rp30000");
            System.out.println("=============================");
            System.out.println("ID: ");
            String id = scanner.nextLine();
            System.out.println("Nama Pelanggan: ");
            String nama = scanner.nextLine();
            System.out.println("Member Active (01) & Inactive(02): ");
            String kodeMember = scanner.nextLine();
            System.out.println("Meja(01) & Kursi(02): ");
            String kodeBarang = scanner.nextLine();
            System.out.println("Jumlah barang yang dibeli: ");
            int jumlahBarang = input.nextInt();

            System.out.println("Apakah Anda Ingin Keluar ?");
            System.out.print("Jawab [ya/tidak]");
            jawab = scanner.nextLine();
            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }

            int barang = 0;
            if ("01".equals(kodeBarang)){
                barang = jumlahBarang * meja;
            } else if ("02".equals(kodeBarang)){
                barang = jumlahBarang * kursi;
            }        
            int totalHarga = barang;

            //objek
            brg[0] = new PenjualanDetail(id, nama, kodeMember, kodeBarang, totalHarga);
            System.out.println(brg[0].displayInfo());
            }
        } catch(StringIndexOutOfBoundsException e){
          System.out.println("Kesalahan format Member/Barang: "+e.getMessage());
        } catch(Exception e){
          System.out.println("Kesalahan Format Jumlah Barang: "+e.getMessage());  
        }
    }

    
}
