public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the employee wage");
        int is_present=1;
        int empHrW=20,empHr=0,total;
        double emp= Math.floor(Math.random()*10)%2;
        if(emp==is_present){
            empHr=8;
        }
        total=empHrW*empHr;
        System.out.println("Employee today wage is: "+total);
    }
}