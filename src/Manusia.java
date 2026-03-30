public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if (this.menikah) {
            if (this.jenisKelamin) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        String jenisKelaminStr = this.jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + this.nama + "\n" +
               "NIK: " + this.nik + "\n" +
               "Jenis Kelamin: " + jenisKelaminStr + "\n" +
               "Pendapatan: " + this.getPendapatan();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
}
