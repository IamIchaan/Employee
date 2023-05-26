package mangan.employee;
import java.util.Scanner;
public class Employee {

        Scanner isekai = new Scanner(System.in);
        int nip;
        String jeneng;
        boolean status;
        int gaji = 1000000;
        int bonus = 2000000;
        int potongan = 50000;
        int waktuKerja;
        int lembur = 200000;
        int n=gaji+bonus+potongan+lembur;
        int gajiboss=n+(n*20/100);
        
        
        public int gajibos(){
                        System.out.println("Waktu kerja\t\t\t = "+waktuKerja+" jam");
            if (waktuKerja<8){
                gaji-=potongan;
                System.out.println("Potongan Kurang Waktu Kerja\t = " + potongan);
            }
            else if (waktuKerja>12){
                gaji+=lembur;
                System.out.println("Bonus Lembur\t\t\t = "+lembur);
            }
            if (status==true){
                gaji+=bonus;
                System.out.println("Bonus Menika\t\t\t = "+ gaji); 
            }
            System.out.println("Total Gaji\t\t\t = "+gajiboss);
            return gaji;
            
        }
        
        public int totalGajiManager(){
            System.out.println("Waktu kerja\t\t\t = "+waktuKerja+" jam");
            if (waktuKerja<8){
                gaji-=potongan;
                System.out.println("Potongan Kurang Waktu Kerja\t = " + potongan);
            }
            else if (waktuKerja>12){
                gaji+=lembur;
                System.out.println("Bonus Lembur\t\t\t = "+lembur);
            }
            if (status==true){
                gaji+=bonus;
                System.out.println("Bonus Menika\t\t\t = "+ gaji); 
            }
            System.out.println("Total Gaji\t\t\t = " + gaji);
            return gaji;
        }
        public int totalGajiCS(){
            System.out.println("Waktu kerja\t\t\t = "+waktuKerja+" jam");
            if (waktuKerja<8){
                gaji-=potongan;
                System.out.println("Potongan Kurang Waktu Kerja\t = " + potongan);
            }
            else if (waktuKerja>12){
                gaji+=lembur;
                System.out.println("Bonus Lembur\t\t\t = "+lembur);
            }
            if (status==true){
                gaji+=bonus;
                System.out.println("Bonus Menika\t\t\t = "+ gaji); 
            }
            System.out.println("Total Gaji\t\t\t = " + gaji);
            return gaji;
        }
        public void datadiri(){
            System.out.println("NIP\t\t\t\t = "+nip+"\njeneng\t\t\t\t = "+jeneng);
            if(status==true) {
                System.out.println("Status\t\t\t\t = Sudah Nganu");
            }
            else if(status==false){
                System.out.println("Status\t\t\t\t = Belum Nganu");
            }
        }
        public void datadiri(int pilih){
            System.out.println("Hari ini belum absen\n1. hadir\n2. tidak hadir");
            pilih = isekai.nextInt();
            if (pilih<1||pilih>2){
                System.out.println("bukan semacam beliau");
                System.exit(0);
            }
            if (pilih==1){
                System.out.println("Absen Hadir");
            }
            else {
                System.out.println("Absen Berhasil(MALAS Hadir)");
            }
            }
    }