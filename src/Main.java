import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try (Ressurs ressurs = new Ressurs()) {
            throw new RuntimeException();
        } catch (Exception e) {
            throw new ClassNotFoundException();
        }
    }
}

class Ressurs implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close method");
        throw new RuntimeException();
    }
}