public class Parent {
    public void property(){
        System.out.println(" child gets property from parents");

    }                                                                    
    public void vehicle(){
        System.out.println(" child gets vehicle from parents");

}
public void savings(){
    System.out.println(" child gets savings from parents");
    
}
public void gold(){
    System.out.println(" child gets gold from parents");
}  
public static void main(String[] args) {
Parent p=new Parent();
p.property();
p.savings();
p.vehicle();
p.gold();
    
}

}
// Violation of Single reposnsiblity principle