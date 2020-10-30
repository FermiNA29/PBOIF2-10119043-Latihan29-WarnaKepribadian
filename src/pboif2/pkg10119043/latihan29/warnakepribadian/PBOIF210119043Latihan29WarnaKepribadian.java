/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan29.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program kepribadian berdasarkan warna
 */
public class PBOIF210119043Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static final String NORMAL = "\u001b[0m";

    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";

    public static final String BLINK = "\u001b[5m";
    
    public static void hasilTes(String pilihan, String nama ) {
        switch(pilihan) {
            case "MERAH" :
                System.out.println("Warna Favoritmu adalah " + RED + pilihan + "\n "
                        + "1. Periang, \n 2. Pemberani, \n 3. Berani mengambil resiko dalam setiap langkah, \n 4. Menyukai tantangan \n "
                        + "5. Kurang sabar, \n 6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahan akan sulit dikontrol, \n 7. Memiliki energi kehangatan dan energi");
                break;
            case "HIJAU" :
                System.out.println("Warna Favoritmu adalah " + GREEN + pilihan + "\n "
                        + "1. Romantis, \n 2. Menyukai hal yang berbau alami dan keindahan, \n 3. Teguh dan prinsip, \n 4. Menginginkan kesempurnaan \n "
                        + "5. Mudah cemburu, \n 6. Mudah merasa iri, \n 7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan");
                break;
            case "KUNING" :
                System.out.println("Warna Favoritmu adalah " + YELLOW + pilihan + "\n "
                        + "1. Optimis, \n 2. Suka bergaul, \n 3. Periang, \n 4. Senang menolong \n 5. Lincah dan aktif"
                        + "6. Tidak suka meremahkan kekurangan orang lain, \n 7. Loyal, \n 8. Hangat, \n 9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, \n "
                        + "10. Cenderung penakut");
                break;
            case "BIRU" :
                System.out.println("Warna Favoritmu adalah " + BLUE + pilihan + "\n "
                        + "1. Menyenangkan, \n 2. Bijaksana, \n 3. Pembawaan diri tenang saat menghadapi masalah \n 4. Dinamis \n "
                        + "5. Senang berbagi, \n 6. Bersahabat, \n 7. Tidak terlalu suka menjadi sorotan banyak orang \n 8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
                break;
            case "UNGU" :
                System.out.println("Warna Favoritmu adalah " + MAGENTA + pilihan + "\n "
                        + "1. optimis, \n 2.Tidak pernah ragu, \n 3. Menurut pasangan yang ideal adalah yang memiliki mental yang kuat \n "
                        + "4. Memiliki ambisi yang besar, \n 5. Memiliki empati yang besar \n 6. Memiliki sisi misterius sebab seringkali menutup perasaannya \n "
                        + "7. Terkadang bersikap keras kepala dan angkuh");
                break;
            default :
                System.out.println("Oops... Belum teridentifikasi");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW +  "KEPRIBADIANMU " + CYAN + "DARI " + MAGENTA + "WARNA " + MAGENTA + "FAVORITMU ");
        System.out.println(RED + "MERAH");
        System.out.println(GREEN + "HIJAU");
        System.out.println(YELLOW + "KUNING");
        System.out.println(BLUE + "BIRU");
        System.out.println(MAGENTA + "UNGU" + NORMAL);
        System.out.println();
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        String pilihan = scanner.nextLine();
        pilihan = pilihan.toUpperCase();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.nextLine();
        nama = nama.toUpperCase();
        
        System.out.println();
        System.out.println("=== HASIL TEST KEPRIBADIAN "+ nama +" ===");
        hasilTes(pilihan, nama);
        
        
        
    }
    
}
