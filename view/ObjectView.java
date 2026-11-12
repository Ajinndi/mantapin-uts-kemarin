package view;

import model.MenuItem;
import util.InputUtil;
import java.util.List;
import java.util.Scanner;

public class ObjectView {
    public void tampilkanMenu(List<MenuItem> menuItems) {
        System.out.println("\nMenu Coffee Shop");
        for (MenuItem item : menuItems) {
            System.out.println(item.getId() + ": " + item.getNama() + " | Harga: " + rupiah(item.getHargaBase()) + " | Stok: " + item.getStok());
        }
        System.out.println();
    }

    public void tampilkanMenuAwal() {
        System.out.println("\nSistem pesan coffee shop");
        System.out.println("1. Tampilkan menu");
        System.out.println("2. Pesan menu");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public String inputIdMenu(Scanner scanner) {
        System.out.print("Masukkan ID menu: ");
        return InputUtil.getString(scanner).trim();
    }

    public int inputJumlah(Scanner scanner) {
        System.out.print("Masukkan jumlah pesanan: ");
        return InputUtil.getInt(scanner);
    }

    public int inputKustomisasi(Scanner scanner, String namaKustomisasi) {
        System.out.print("Jumlah " + namaKustomisasi + ": ");
        return InputUtil.getInt(scanner);
    }

    public void tampilkanMetodeHarga(MenuItem item) {
        System.out.println("\nPilih perhitungan harga:");
        System.out.println("1. Harga standar");
        System.out.println("2. Gunakan kode promo HEMAT (ada diskon 10%)");
        if (item.bisaPilihUkuran()) System.out.println("3. Pilih ukuran minuman (SMALL/MEDIUM/LARGE)");
        System.out.print("Pilihan: ");
    }

    public String inputKodePromo(Scanner scanner) {
        System.out.print("Masukkan kode promo: ");
        return InputUtil.getString(scanner).trim();
    }

    public String inputUkuran(Scanner scanner) {
        System.out.print("Masukkan ukuran (SMALL/MEDIUM/LARGE): ");
        return InputUtil.getString(scanner).trim();
    }

    public void tampilkanStruk(MenuItem item, int jumlah, double total) {
        System.out.println("\nstruk pesan");
        System.out.println("ID Menu: " + item.getId());
        System.out.println("Detail: " + item.getOrderDetail());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + rupiah(total));
        System.out.println("Sisa stok: " + item.getStok());
        System.out.println();
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

    private String rupiah(double nilai) {
        return "Rp " + nilai;
    }
}