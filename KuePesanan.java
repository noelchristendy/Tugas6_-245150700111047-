public class KuePesanan extends Kue {
    private double berat; // kg

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    @Override
    public String toString() {
        return String.format("KuePesanan -> %s, Berat: %.2f kg, Total Harga: Rp%.2f", 
            super.toString(), berat, hitungHarga());
}

}
