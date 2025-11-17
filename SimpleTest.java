package hw3;

public class SimpleTest {
    public static void main(String[] args) {
	Picture p = new Picture("bridge-9599215_1920.png", 320);
	PictureIO pio = new PictureIO();
	pio.firstShow(p.getPixels());
	Picture q = p.transpose();
	PictureIO qio = new PictureIO();
	qio.firstShow(q.getPixels()); 

    }
}
