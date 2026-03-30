public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah,
                           String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public double getBeasiswa() {
        if (this.ipk >= 3.0 && this.ipk < 3.5) {
            return 50;
        } else if (this.ipk >= 3.5 && this.ipk <=4) {
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "NIM: " + this.getNim() + "\n" +
               "IPK: " + this.getIpk() + "\n" +
               "Status: " + this.getStatus();
    }


    public String getStatus() {
        String nim = this.getNim();
        if (nim == null || nim.length() < 7) {
            return "NIM tidak valid"; 
        }

        String angkatanStr = nim.substring(0, 2);
        String fullAngkatan = "20" + angkatanStr; 

        char prodiDigit = nim.charAt(6);
        String prodiName;

        switch (prodiDigit) {
            case '2':
                prodiName = "Teknik Informatika";
                break;
            case '3':
                prodiName = "Teknik Komputer";
                break;
            case '4':
                prodiName = "Sistem Informasi";
                break;
            case '6':
                prodiName = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodiName = "Teknologi Informasi";
                break;
            default:
                prodiName = "Prodi tidak dikenal";
                break;
        }
        return prodiName + ", " + fullAngkatan;
    } 
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}
