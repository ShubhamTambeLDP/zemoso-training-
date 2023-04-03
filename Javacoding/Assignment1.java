




public class Assignment1 {
    public static void main(String[] args) throws Exception {
        int x=0 ;



for (int i=1; i<=100; i++) {
if (i%3==0 && i%5==0 )  {
System.out.println("FizzBuzz");
x=i;
}

else if ((!(x==i)) && i%5==0) {
System.out.println("Buzz");

}
else if (i%3==0 && (!(x==i)) ) {
System.out.println("Fizz");
}
else {
System.out.println(i);
}


}}}
    

