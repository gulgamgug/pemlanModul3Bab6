import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() { 
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (this.jumlahAnak * 20);
    }

    public double getBonus() {
        LocalDate today = LocalDate.now();
        Period diff = Period.between(this.tahunMasuk, today);
        int lamaBekerja = diff.getYears();

        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return 0.05 * this.gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return 0.10 * this.gaji;
        } else if (lamaBekerja > 10) {
            return 0.15 * this.gaji;
        } else {
            return 0; 
        }
    }

    @Override
    public double getPendapatan() { 
        return getTunjangan() + this.gaji + getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tahun Masuk: " + this.tahunMasuk + "\n" +
               "Jumlah Anak: " + this.jumlahAnak + "\n" +
               "Gaji Pokok: " + this.gaji;
    }
}