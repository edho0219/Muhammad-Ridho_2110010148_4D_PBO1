# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa id,nama,kode member,kode barang & jumlah barang yang ingin dibeli, dan memberikan output berupa informasi dari kode yang dimasukkan di kode member dan kode barang. Juga melakukan hitung perkalian dari jumlah barang yang ingin dibeli, setelah itu dikali dengan harga benda yang sudah dipilih.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Penjualan`, `PenjualanBeraksi`, dan `PenjualanDetail` adalah contoh dari class.

```bash
public class Penjualan {
    ...
}

public class PenjualanBeraksi  {
    ...
}

public class PenjualanDetail extends Penjualan{
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `brg[0] = new PenjualanDetail(id, nama, kodeMember, kodeBarang, totalHarga);` adalah contoh pembuatan object.

```bash
brg[0] = new PenjualanDetail(id, nama, kodeMember, kodeBarang, totalHarga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `id`, `nama`, `member`, `barang`, dan `totalHarga` adalah contoh atribut.

```bash
private String id;
private String nama;
private String member;
private String barang;
int totalHarga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Penjualan` dan `PenjualanDetail`.

```bash
 public Penjualan(String id, String nama, String member, String barang, int totalHarga) {
        this.id = id;
        this.nama = nama;
        this.member = member;
        this.barang = barang;
        this.totalHarga = totalHarga;
    }

public PenjualanDetail(String id, String nama, String member, String barang, int totalHarga) {
        super(id, nama, member, barang, totalHarga);   
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `id`, `setNama`, `setMember`, `setBarang`, dan `setTotalHarga` adalah contoh method mutator.

```bash
public void setId(String id) {
        this.id = id;
    }
public void setNama(String nama) {
        this.nama = nama;
    }
public void setMember(String member) {
        this.member = member;
    }
public void setBarang(String barang) {
        this.barang = barang;
    }
public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getId`, `getNama`, `getMember`, `getBarang`, `getTotalHarga`, `getPilihMember`, `getPilihBarang` adalah contoh method accessor.

```bash
public String getId() {
        return id;
    }
public String getNama() {
        return nama;
    }
public String getMember() {
        return member;
    }
public String getBarang() {
        return barang;
    }
public int getTotalHarga() {
        return totalHarga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `id`, `nama`, `member` dan `barang` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String id;
private String nama;
private String member;
private String barang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PenjualanDetail` mewarisi `Penjualan` dengan sintaks `extends`.

```bash
public class PenjualanDetail extends Penjualan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Penjualan` merupakan overloading method `displayInfo` dan `displayInfo` di `PenjualanDetail` merupakan override dari method `displayInfo` di `Penjualan`.

```bash
public String displayInfo(String member){
    return displayInfo() + "\nStatus Member: "+member;
}

@Override
    public String displayInfo(){
        return super.displayInfo()+
                    "\nStatus Member: "+getPilihMember()+
                    "\nBarang yang dipilih: "+getPilihBarang()+
                    "\nTotal Harga: RP "+displayInfo1();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPilihMember` dan seleksi `switch` dalam method `getPilihBarang`.

```bash
 public String  getPilihMember(){
        String kodeMember = getMember().substring(0, 2);
        //seleksi if
        switch (kodeMember) {
            case "01":
                return "Active";
            case "02":
                return "Inactive";
            default:
                return "Salah Memasukkan Kode";
        }
    }

public String  getPilihBarang(){
        String kodeBarang = getBarang().substring(0, 2);
        //seleksi switch
        switch (kodeBarang) {
            case "01":
                return "Meja";
            case "02":
                return "Kursi";
            default:
                return "Barang tidak ada";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
boolean running = true;
String jawab;
while (running){
 System.out.println("Apakah Anda Ingin Keluar ?");
 System.out.print("Jawab [ya/tidak]");
    jawab = scanner.nextLine();
    if(jawab.equalsIgnoreCase("ya")){
    running = false;
    }
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner dan input` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
Scanner input = new Scanner(System.in);

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

 int barang = 0;
 if ("01".equals(kodeBarang)){
     barang = jumlahBarang * meja;
 } else if ("02".equals(kodeBarang)){
     barang = jumlahBarang * kursi;
 }        
int totalHarga = barang;

System.out.println(brg[0].displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PenjualanDetail[] brg = new PenjualanDetail[2];` adalah contoh penggunaan array.

```bash
PenjualanDetail[] brg = new PenjualanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch(StringIndexOutOfBoundsException e){
  System.out.println("Kesalahan format Member/Barang: "+e.getMessage());
} 
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Ridho
NPM: 2110010148
