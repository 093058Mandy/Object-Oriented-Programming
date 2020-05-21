public class m {
    public static void m(String[] args){
        
        MultiplicationTable K = new MultiplicationTable(3, 17, 25);
        System.out.println(K.printTable());

        MultiplicationTable N = new MultiplicationTable(17, 3, 49);
        System.out.println(N.printTable());

        MultiplicationTable Z = new MultiplicationTable(0, 1, 5);
        System.out.println(Z.printTable());

    }
}