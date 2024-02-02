public class Employeewager {
    private final static int is_partTime=1;
    private final static int is_fullTime=2;
    private final  String companyName;
    private final int empHrW ;
    private final int maxEmploMo;
    private final  int no_of_days;
    private int totalHr;
    public Employeewager(String name,int emphrw,int maxemplomo,int noofdays){
        this.companyName=name;
        this.empHrW=emphrw;
        this.maxEmploMo=maxemplomo;
        this.no_of_days=noofdays;
    }
    public  void calculateWage(){
        int empHr=0,totaldays=0,totalempHr=0;

        while(totalempHr<=maxEmploMo  && totaldays<no_of_days) {
            totaldays++;
            int emp = (int) Math.floor(Math.random() * 10) % 3;
            switch (emp) {
                case is_partTime:
                    empHr = 4;
                    break;
                case is_fullTime:
                    empHr = 8;
                    break;
                default:
                    empHr = 0;

            }
            totalempHr+=empHr;
            System.out.println("Day:"+totaldays+" hours:"+empHr);
        }
        totalHr=totalempHr*empHrW;
    }

    @Override
    public String toString() {
        return "Employeewager{" + "companyName='" + companyName + '\'' + ", totalHr=" + totalHr + '}';
    }
}
