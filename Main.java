public class Main {
    public static void main(String[] args) {
        // Buat array 20 kue
        Kue[] kueArray = new Kue[20];

        // Isi array dengan campuran KuePesanan dan KueJadi
        kueArray[0] = new KuePesanan("Kue Tart", 50000, 2);
        kueArray[1] = new KueJadi("Donat", 4000, 10);
        kueArray[2] = new KuePesanan("Kue Lapis", 30000, 1.5);
        kueArray[3] = new KueJadi("Brownies", 12000, 5);
        kueArray[4] = new KueJadi("Cupcake", 6000, 8);
        kueArray[5] = new KuePesanan("Kue Lumpur", 45000, 2.3);
        kueArray[6] = new KueJadi("Pukis", 5000, 7);
        kueArray[7] = new KuePesanan("Kue Klepon", 20000, 3);
        kueArray[8] = new KueJadi("Nastar", 8000, 6);
        kueArray[9] = new KuePesanan("Kue Putu", 25000, 1.2);

        // Tambahan kue supaya sampai 20
        for (int i = 10; i < 20; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("KuePesanan-" + i, 30000, 1.0 + (i * 0.1));
            } else {
                kueArray[i] = new KueJadi("KueJadi-" + i, 7000, 5 + i);
            }
        }

        // Hitung total
        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        Kue kueTermahal = kueArray[0];

        System.out.println("=== Daftar Semua Kue ===");
        for (Kue kue : kueArray) {
            System.out.println(kue);

            double hargaKue = kue.hitungHarga();
            totalHargaSemua += hargaKue;

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += hargaKue;
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += hargaKue;
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }

            if (hargaKue > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("\n=== Laporan ===");
        System.out.printf("Total harga semua kue: Rp%.2f\n", totalHargaSemua);
        System.out.printf("Total harga KuePesanan: Rp%.2f\n", totalHargaPesanan);
        System.out.printf("Total berat KuePesanan: %.2f kg\n", totalBeratPesanan);
        System.out.printf("Total harga KueJadi: Rp%.2f\n", totalHargaJadi);
        System.out.printf("Total jumlah KueJadi: %.2f buah\n", totalJumlahJadi);
        System.out.println("\nKue dengan harga tertinggi:");
        System.out.println(kueTermahal);
    }
}
