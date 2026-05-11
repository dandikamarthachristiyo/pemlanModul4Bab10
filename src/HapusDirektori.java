import java.io.File;
import java.util.Scanner;
public class HapusDirektori {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama diretori (Address Bar): ");
        String namaDirektori = sc.nextLine();

        File direktori = new File(namaDirektori);

        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();
            
            System.out.println("==========================================================");
            if (daftarFile != null) {
                for (File f : daftarFile) {
                    if (f.isFile()) {
                        f.delete();
                        System.out.println("File " + f.getName() + " berhasil dihapus.");
                    }
                }
            }
             System.out.println("==========================================================");
            boolean dirTerhapus = direktori.delete();
            if (dirTerhapus) {
                System.out.println("Direktori berhasil dihapus sepenuhnya.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
        System.out.println("----------------------------------------------------------");
        sc.close();
    }
}