public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Method abstract: Harus diisi oleh class anak
    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format("Nama: %s, Harga satuan: Rp%.2f", nama, harga);
    }
}
