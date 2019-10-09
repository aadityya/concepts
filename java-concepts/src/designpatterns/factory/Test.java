package designpatterns.factory;

public class Test {
    public static void main(String [] args) {
       EncryptionUtil util = new EncryptionUtil();
       System.out.println(util.encrypt("someinput"));
    }
}
