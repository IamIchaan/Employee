package mangan.employee;
public class CleaningService extends Employee {
    @Override
    public void datadiri(){
        nip = 8126453;
        jeneng = "Messi Kimochi";
        status = false;
        waktuKerja = 5;
        super.datadiri();
        super.totalGajiCS();
    }
}
