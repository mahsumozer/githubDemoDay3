package class1;

interface a{
    void tryy(); // this is already abstract wwe can just delete " abstract "
        }


public class try1 implements a {
    public static void main(String[] args) {
        System.out.println("try try try");
    }

    @Override
    public void tryy() {
        System.out.println("tryy overrideee");
    }
}
