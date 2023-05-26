package mangan.employee;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner uwogh = new Scanner (System.in);
        int pilihan;
        CleaningService CS = new CleaningService();
        Manager UB = new Manager();
        Bossbeban beban = new Bossbeban();
        Employee absen = new Employee();
        System.out.println("data dirimu = \n1. Boss\n2. Manager\n3. Cleaning Service");
        System.out.print("mwu yang mana? ");
        pilihan =uwogh.nextInt();
        if (pilihan<1||pilihan>3){
            System.out.println("(Data tidak nganu)MALASSSSHHH BAMNGETT");
            System.exit(0);
        }
        switch(pilihan){
                case 1:
                    beban.datadiri();
                    break;
                case 2:
                    UB.datadiri();
                    break;
                case 3:
                    CS.datadiri();
                    break;
            }
        absen.datadiri(0);
        }
    }