package menupilihan;

import CRUD.CRUDbarang;
import java.util.Scanner;

public class barang {
    static CRUDbarang CRUDbarang = new CRUDbarang();
    static Scanner scanner = new Scanner(System.in);

    public static void showBarang() {
        while (true) {
            System.out.println("===== Barang Menu =====");
            System.out.println("[1] Tambah Barang");
            System.out.println("[2] Lihat Barang");
            System.out.println("[3] Update Barang");
            System.out.println("[4] Hapus Barang");
            System.out.println("[5] Kembali");
            System.out.println("=======================");
            System.out.print("Pilih menu: ");

            int menuPilih = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (menuPilih) {
                case 1 -> createBarang();
                case 2 -> readBarangs();
                case 3 -> updateBarang();
                case 4 -> deleteBarang();
                case 5 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak ada.");
            }
        }
    }

    static void createBarang() {
        System.out.print("Masukkan kode barang: ");
        String kode_barang = scanner.nextLine();
        System.out.print("Masukkan ID jenis barang: ");
        String id_jns_barang = scanner.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama_barang = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok barang: ");
        int stok_barang = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan ID pemasok barang: ");
        String id_pemasok_barang = scanner.nextLine();
        System.out.print("Masukkan ID karyawan input: ");
        String id_karyawan_input = scanner.nextLine();
        System.out.print("Masukkan tanggal posting (YYYY-MM-DD): ");
        String tlg_posting = scanner.nextLine();

        CRUDbarang.createBarang(kode_barang, id_jns_barang, nama_barang, harga, stok_barang, id_pemasok_barang, id_karyawan_input, tlg_posting);
    }

    static void readBarangs() {
        CRUDbarang.readBarangs();
    }

    static void updateBarang() {
        System.out.print("Masukkan kode barang yang akan diupdate: ");
        String kode_barang = scanner.nextLine();
        System.out.print("Masukkan ID jenis barang baru: ");
        String id_jns_barang = scanner.nextLine();
        System.out.print("Masukkan nama barang baru: ");
        String nama_barang = scanner.nextLine();
        System.out.print("Masukkan harga baru: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok barang baru: ");
        int stok_barang = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan ID pemasok barang baru: ");
        String id_pemasok_barang = scanner.nextLine();
        System.out.print("Masukkan ID karyawan input baru: ");
        String id_karyawan_input = scanner.nextLine();
        System.out.print("Masukkan tanggal posting baru (YYYY-MM-DD): ");
        String tlg_posting = scanner.nextLine();

        CRUDbarang.updateBarang(kode_barang, id_jns_barang, nama_barang, harga, stok_barang, id_pemasok_barang, id_karyawan_input, tlg_posting);
    }

    static void deleteBarang() {
        System.out.print("Masukkan kode barang yang akan dihapus: ");
        String kode_barang = scanner.nextLine();
        CRUDbarang.deleteBarang(kode_barang);
    }
}