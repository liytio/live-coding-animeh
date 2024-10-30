import java.util.ArrayList;
import java.util.Scanner;

public class ListAnime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animeList = new ArrayList<>();

        // Menu utama
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Anime");
            System.out.println("2. Lihat Daftar Anime");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul anime: ");
                    String judul = scanner.nextLine();
                    animeList.add(judul);
                    System.out.println("Anime " + judul + " telah ditambahkan!");
                    break;

                case 2:
                    if (animeList.isEmpty()) {
                        System.out.println("Daftar anime masih kosong.");
                    } else {
                        System.out.println("\nDaftar Anime:");
                        for (int i = 0; i < animeList.size(); i++) {
                            System.out.println((i + 1) + ". " + animeList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}