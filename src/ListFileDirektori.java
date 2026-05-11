import java.io.File;
import java.util.Scanner;
public class ListFileDirektori {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama diretori (Address Bar): ");
        String namaDirektori = sc.nextLine();

        File direktori = new File(namaDirektori); 

        if (direktori.exists() && direktori.isDirectory()) {
            System.out.println("==========================================================");
            System.out.println(" Daftar file di dalam direktori " + direktori.getName() + ": ");
            System.out.println("----------------------------------------------------------");
            
            File[] daftarFile = direktori.listFiles();
            
            if (daftarFile != null) {
                for (File f : daftarFile) {
                    
                    if (f.isFile()) { 
                        System.out.println("- " + f.getName());
                    }
                }
            }
        } else {
            System.out.println("Path yang dimasukkan bukan direktori atau tidak ditemukan.");
        }
        System.out.println("==========================================================");
        sc.close();
    }
}