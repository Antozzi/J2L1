package ad.j2l1.hw2;

public class MyArrDataExcept extends RuntimeException {
    public MyArrDataExcept(String message) {
        super("Data is Wrong " + message);
    }
}
