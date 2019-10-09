package designpatterns.factory;

public class SHAEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String encrypt) {
        return "SHA Encryption";
    }
}
