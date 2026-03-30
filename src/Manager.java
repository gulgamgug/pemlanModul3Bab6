import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, nik, jenisKelamin, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getTunjangan() {
        double tunjanganManager = super.getGaji() * 10 / 100;
        double tunjangan = super.getTunjangan() + tunjanganManager;
        return tunjangan;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Departemen: " + this.departemen;
    }
}