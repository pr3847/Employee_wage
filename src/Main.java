public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage");
        int empHrW=20,empHr=0,total=0,perday=0;
        int no_of_days=20;
        for(int i=1;i<=no_of_days;i++) {
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
            perday = empHrW * empHr;
            total+=perday;
            System.out.println("Employee today wage per day is: " + perday);
        }
        System.out.println("Total wage of the month: "+total);
    }
}