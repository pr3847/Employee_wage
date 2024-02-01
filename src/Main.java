public class Main {
    public static final int is_partTime=1;
    public static final int is_fullTime=2;
    public static final int empHrW=20;
    public static final int no_of_days=20;
    public static void calculateWage(){
        int empHr=0,total=0,totaldays=0,totalempHr=0;

        while(totalempHr<=100 && totaldays<no_of_days) {
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
        total=totalempHr*empHrW;
        System.out.println("Total wage for working "+totalempHr+"hrs in a month "+total);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage");
        calculateWage();
    }
}