package designpatterns.factory;

public class RSAEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String encrypt) {
        return "RSA Encryption";
    }
}
