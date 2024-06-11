package menu;

import menupilihan.barang;
import java.util.Scanner;

public class Menu {

    static boolean isRun = true;
    static Scanner scanner = new Scanner(System.in);

    static void showMenu() {
        System.out.println("===== Dashboard =====");
        System.out.println("[1] Barang");
        System.out.println("[2] Detail Penjualan");
        System.out.println("[3] Fatur Penjualan");
        System.out.println("[4] Jenis Barang");
        System.out.println("[5] Keluar");
        System.out.println("=====================");
        System.out.print("Pilih Menu: ");
    }

    static void handleMenu(int menuPilih) {
        switch (menuPilih) {
            case 1 -> barang.showBarang();
            case 5 -> isRun = false;
            default -> System.out.println("Pilihan tidak ada.");
        }
    }

    public static void main(String[] args) {
        while (isRun) {
            showMenu();
            try {
                int choice = scanner.nextInt();
                handleMenu(choice);
            } catch (Exception e) {
                System.out.println("Input tidak valid, masukkan angka.");
                scanner.nextLine(); // membersihkan input buffer
            }
        }
        scanner.close();
    }
}
