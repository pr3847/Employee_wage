public class EmployeeManage {

    private final static int is_partTime=1;
    private final static int is_fullTime=2;
    private int no_of_cmpny=0;
    private Employeewager[] arrayofEmployee;
    public EmployeeManage(){
        arrayofEmployee=new Employeewager[6];
    }
    public void addCompanyWage(String cmpnyname,int emphrra,int empmaxhr,int noofdays){
        arrayofEmployee[no_of_cmpny]=new Employeewager(cmpnyname,emphrra,empmaxhr,noofdays);
        no_of_cmpny++;
    }
    public void compute(){
        for(int i=0;i<no_of_cmpny;i++){
            arrayofEmployee[i].setTotalwage(this.calculateWage(arrayofEmployee[i]));
            System.out.println(arrayofEmployee[i]);
        }
    }

    private  int calculateWage(Employeewager e){
        int empHr=0,totaldays=0,totalempHr=0;

        while(totalempHr<=e.getMaxEmploMo() && totaldays<e.getNo_of_days()) {
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
        return totalempHr*e.getEmpHrW();
    }
}
