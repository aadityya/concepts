package designpatterns.factory;

public class EncryptionUtil extends EncryptionHanlder {
    @Override
    EncryptionAlgorithm getEncryptionAlgorithm() {
        return new RSAEncryption();
    }

    public String encrypt(String input) {
        return super.encrypt(input);
    }
}
