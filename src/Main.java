public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the employee wage");
        int is_present=1;
        double emp= Math.floor(Math.random()*10)%2;
        if(emp==is_present){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}