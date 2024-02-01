public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage");
        int empHrW=20,empHr=0,total=0,perday=0,totaldays=0,totalempHr=0;
        int no_of_days=20;
        while(totalempHr<=100 && totaldays<no_of_days) {
            totaldays++;
            int emp = (int) Math.floor(Math.random() * 10) % 3;
            switch (emp) {
                case 1:
                    empHr = 4;
                    break;
                case 2:
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
}