package moldovan.christine.lab5.ex2;

public class Main {
    public static void main(String[] args) {

        Image ri = new RealImage("Real Image");
        ri.display();
        Image ro = new RotatedImage("Rotated Image");
        ro.display();

        Image rotImage = new ProxyImage("Proxy Image", ImageType.ROTATED);
        rotImage.display();

        Image rImage = new ProxyImage("Proxy New", ImageType.REAL);
        rImage.display();
    }


}
