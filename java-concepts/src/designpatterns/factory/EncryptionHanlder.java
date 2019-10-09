package designpatterns.factory;

public abstract class EncryptionHanlder {
    private EncryptionAlgorithm encryption;

    abstract EncryptionAlgorithm getEncryptionAlgorithm();

    public String encrypt(String input) {
        return this.getEncryptionAlgorithm().encrypt(input);
    }
}
