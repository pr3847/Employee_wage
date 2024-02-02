public class Employeewager {
    private final  String companyName;
    private final int empHrW ;
    private final int maxEmploMo;
    private final  int no_of_days;
    private int totalWage;
    public Employeewager(String name,int emphrw,int maxemplomo,int noofdays){
        this.companyName=name;
        this.empHrW=emphrw;
        this.maxEmploMo=maxemplomo;
        this.no_of_days=noofdays;
    }
    public void setTotalwage(int total){
        this.totalWage=total;
    }

    public int getEmpHrW() {
        return empHrW;
    }

    public int getMaxEmploMo() {
        return maxEmploMo;
    }

    public int getNo_of_days() {
        return no_of_days;
    }

    @Override
    public String toString() {
        return "Employeewager{" + "companyName='" + companyName + '\'' + ", totalHr=" + totalWage + '}'+'\n';
    }
}
