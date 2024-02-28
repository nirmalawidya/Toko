package com.mycompany.javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
       
        Member member;
        member = new Member(){};
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        //Proses transaksi
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        //Menampilkan laporan
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi,barang);
    }
}
