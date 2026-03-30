import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Manusia manusia1a = new Manusia(
             "Wowo",
             "3576587927111110",
             true,
              true
            );

        System.out.println("\n1a. Hasil to string Manusia 1a:");
        System.out.println(manusia1a.toString());

        Manusia manusia1b = new Manusia(
             "Titik",
             "3576656290000010", 
             false, 
             true
            );

        System.out.println("\n1b. Hasil to string Manusia 1b:");
        System.out.println(manusia1b.toString());

        Manusia manusia1c = new Manusia(
             "Teddi",
             "3266999870000001",
             true,
             false
            );

        System.out.println("\n1c. Hasil to string Manusia 1c:");
        System.out.println(manusia1c.toString());

        MahasiswaFILKOM mahasiswa2a = new MahasiswaFILKOM(
             "Raihan",
             "358109813780111",
             true,
             false,
             "255150700111034",
             2.87   
        );

        System.out.println("\n2a. Hasil to string Mahasiswa 2a:");
        System.out.println(mahasiswa2a.toString());

        MahasiswaFILKOM mahasiswa2b = new MahasiswaFILKOM(
            "Lazuardi",
            "45678983208393",
            true,
            false,
            "255150700111034",
            3.33
        );

        System.out.println("\n2b. Hasil to string Mahasiswa 2b:");
        System.out.println(mahasiswa2b.toString());

        MahasiswaFILKOM mahasiswa2c = new MahasiswaFILKOM(
            "Ahmad",
            "45678983208393",
            true,
            false,
            "255150700111034",
            3.82
        );

        System.out.println("\n2c. Hasil to string Mahasiswa 2c:");
        System.out.println(mahasiswa2c.toString());

        Pekerja pekerja3a = new Pekerja(
            "Budi",
            "1234567890123456",
            true,
            true,
            3000.0, 
            LocalDate.now().minusYears(2), 
            2
        );

        System.out.println("\n3a. Hasil to string Pekerja 3a:");
        System.out.println(pekerja3a.toString());

        Pekerja pekerja3b = new Pekerja(
            "Siti",
            "6543210987654321",
            false,
            true,
            4500.0, 
            LocalDate.now().minusYears(9), 
            0
        );

        System.out.println("\n3b. Hasil to string Pekerja 3b:");
        System.out.println(pekerja3b.toString());

        Pekerja pekerja3c = new Pekerja(
            "Joko",
            "9876543210987654",
            true,
            true,
            6000.0, 
            LocalDate.now().minusYears(20), 
            10
        );

        System.out.println("\n3c. Hasil to string Pekerja 3c:");
        System.out.println(pekerja3c.toString());
        
        Manager manager1 = new Manager(
            "Dewi",
            "1122334455667788",
            false,
            true,
            7500.0, 
            LocalDate.now().minusYears(15), 
            1, 
            "IT" 
        );

        System.out.println("\n4. Hasil to string manager:");
        System.out.println(manager1.toString());
    }
}
