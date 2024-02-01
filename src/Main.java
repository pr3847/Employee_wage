public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the employee wage");
        int is_PartTime=1;
        int is_FullTime=2;
        int empHrW=20,empHr=0,total;
        double emp= Math.floor(Math.random()*10)%3;
        if(emp==is_PartTime){
            empHr=4;
        }else if(emp==is_FullTime){
            empHr=8;
        }
        total=empHrW*empHr;
        System.out.println("Employee today wage is: "+total);
    }
}