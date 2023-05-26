package mangan.employee;
public class Manager extends Employee {
    @Override
    public void datadiri(){
        nip = 1111111;
        jeneng = "ila iris ikis";
        status = true;
        waktuKerja = 10;
        super.datadiri();
        super.totalGajiManager();
    }
}
