import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);

        Triangle triangle = new Triangle(24, 18, 30);
        System.out.println(triangle);
    }
}
