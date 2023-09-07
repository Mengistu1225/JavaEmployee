public class Emp {
    int id;
    String name;
    Address address;
    public Emp(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;

    }
    void display(){
        System.out.println(id +""+name);
        System.out.println(address.city +""+address.state+""+address.country);
    }

    public static void main(String[] arg){
        Address a1=new Address("adama","oromia","Ethiopia");
        Address a2=new Address("mekele","tigray","usa");


        Emp e1=new Emp(1245,"gadisa",a1);
        Emp e2=new Emp(432,"mengistu",a2);

        e1.display();
        e2.display();

    }
}
