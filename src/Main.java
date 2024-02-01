public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage");
        int empHrW=20,empHr=0,total;
        int emp= (int)Math.floor(Math.random()*10)%3;
        switch (emp){
            case 1:
                empHr=4;
                break;
            case 2:
                empHr=8;
                break;
            default:
                empHr=0;

        }
        total=empHrW*empHr;
        System.out.println("Employee today wage is: "+total);
    }
}