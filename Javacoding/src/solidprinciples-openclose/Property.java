public class Property {
    int prop;
    int home =2;
    int farm =5;
    public void getproperty(){
        
       
        if(prop==home ){
            System.out.println(" child gets home from parents"); 
        }
        else if(prop==farm){
            System.out.println(" child gets farm from parents");
        }

    }
    
}// violation of open close priciple
