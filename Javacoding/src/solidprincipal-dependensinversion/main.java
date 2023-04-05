public class main {
    public static void main(String[] args) {
        Money m =new Money();
        Gold g =new Gold();
        Bank  b =new Bank();
        
        m.save();
        m.buy();
        g.save();
        g.buy();
       b.addAssets();
       b.fixedDeposite();
        
        
    }
}
