public class KueJadi extends Kue {
    private double jumlah; // buah

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2; // jumlah x harga x 2
    }

    @Override
    public String toString() {
        return String.format("KueJadi -> %s, Jumlah: %.2f buah, Total Harga: Rp%.2f", 
            super.toString(), jumlah, hitungHarga());
}


}
