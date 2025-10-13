package CaseMethod;
import java.util.Scanner;

public class EmillulFata07 {
  public static void main(String[] args) {
    double tugas_1, uts_1, uas_1, Nilai_Tugas_1, Nilai_UTS_1, Nilai_UAS_1;
    double tugas_2, uts_2, uas_2, Nilai_Tugas_2, Nilai_UTS_2, Nilai_UAS_2;
    double Nilai_Akhir_1, Nilai_Akhir_2, Rerata;
    String NilaiHuruf1,NilaiHuruf2,Status1,Status2,StatusSemester,getHuruf; 
    Scanner mean = new Scanner(System.in);

    System.out.println("===== INPUT DATA MAHASISWA =====");
    System.out.println("Nama             : Emillul Fata Rachman");
    System.out.println("NIM              : 254107060105");
    System.out.println("Absen dan Kelas  : 07 , SIB 1F");

    System.out.println("\n------- MATA KULIAH 1 : ALGORITMA DAN PEMROGRAMAN -------");
    System.out.print("Input Nilai Tugas : ");
    tugas_1 = mean.nextDouble();
    System.out.print("Input Nilai UTS   : ");
    uts_1 = mean.nextDouble();
    System.out.print("Input Nilai UAS   : ");
    uas_1= mean.nextDouble();

    System.out.println("\n------- MATA KULIAH 2 : STRUKTUR DATA -------");
    System.out.print("Input Nilai Tugas : ");
    tugas_2= mean.nextDouble();
    System.out.print("Input Nilai UTS   : ");
    uts_2= mean.nextDouble();
    System.out.print("Input Nilai UAS   : ");
    uas_2= mean.nextDouble();

    Nilai_Akhir_1 = (tugas_1* 0.3) + (uts_1* 0.3) + (uas_1* 0.4);
    Nilai_Akhir_2 = (tugas_2* 0.3) + (uts_2* 0.3) + (uas_2* 0.4);
    Rerata = (Nilai_Akhir_1 + Nilai_Akhir_2) / 2;

    NilaiHuruf1 = dapatHuruf(Nilai_Akhir_1);
    NilaiHuruf2 = dapatHuruf(Nilai_Akhir_2);
    Status1 = (Nilai_Akhir_1 >= 70) ? "LULUS" : "TIDAK LULUS";
    Status2 = (Nilai_Akhir_2 >= 70) ? "LULUS" : "TIDAK LULUS";
    StatusSemester = (Rerata >= 70) ? "LULUS" : "TIDAK LULUS";
    
    System.out.println("\n\n==================== HASIL PENILAIAN AKADEMIK ====================");
    System.out.println("Nama            : Emillul Fata Rachman");
    System.out.println("NIM             : 254107060105");
    System.out.println("Absen dan Kelas : 07 , SIB 1F");
    System.out.println();
    System.out.println("\nMATA KULIAH\t\tTUGAS\tUTS\tUAS\tNilai Akhir\tNilai Huruf\t STATUS");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t%14s\n",
                  tugas_1, uts_1, uas_1, Nilai_Akhir_1, NilaiHuruf1, Status1);
System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t%14s\n",
                  tugas_2, uts_2, uas_2, Nilai_Akhir_2, NilaiHuruf2, Status2);
    System.out.println("---------------------------------------------------------------------------------------");

    System.out.printf("\nRata-rata Nilai Akhir : %.2f", Rerata);
    System.out.printf("\nStatus Semester       : %s" , StatusSemester);
  }
    public static String dapatHuruf(double nilai) {
      if (nilai >= 80 && nilai <= 100) return "A";
        else if (nilai > 73 && nilai <= 80) return "B+";
        else if (nilai > 65 && nilai <= 73) return "B";
        else if (nilai > 60 && nilai <= 65) return "C+";
        else if (nilai > 50 && nilai <= 60) return "C";
        else if (nilai > 39 && nilai <= 50) return "D";
        else if (nilai <= 39 ) return "E";
        else return "DO Saja";
    }
  }


