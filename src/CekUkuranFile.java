import java.io.File;
import java.util.Scanner;

public class CekUkuranFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama file : ");
        String namaFile = sc.nextLine();

        File file = new File(namaFile); 

        if (file.exists() && file.isFile()) {

            double bytes = file.length(); 
            double kilobytes = bytes / 1024;
            double megabytes = kilobytes / 1024;

            System.out.println("===============================================");
            System.out.println("Nama File: " + file.getName());
            
            if (megabytes >= 1.0) {
                System.out.printf("Ukuran file: %.2f MB\n", megabytes);
            } else {
                System.out.printf("Ukuran file: %.2f KB\n", kilobytes);
            }
        } else {
            System.out.println("File tidak ditemukan atau bukan sebuah file.");
        }
        System.out.println("===============================================");
        sc.close();
    }
}