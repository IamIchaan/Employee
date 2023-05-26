package mangan.employee;
public class Bossbeban extends Employee{
    @Override
    public void datadiri(){
    nip = 1000;
    jeneng = "lil nus nus";
    status = true;
    waktuKerja = 24;
    super.datadiri();
    super.gajibos();
}
}