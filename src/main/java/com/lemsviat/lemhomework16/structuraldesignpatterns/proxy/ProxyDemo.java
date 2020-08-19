package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        References references = new ProxyReferencesForED("http://www.references.com");
        references.insertIntoDiploma();
    }
}
