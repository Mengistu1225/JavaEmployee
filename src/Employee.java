public class Employee {
    float salary = 4000;
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String[] arg){
        Programmer p=new Programmer();
        System.out.println("programmer salary is: "+p.salary);
        System.out.println("programmer bonus is: "+p.bonus);
    }
}

