package moldovan.christine.lab5.ex2;

public class ProxyImage implements Image {
    private Image image;
    private String fileName;
    private ImageType imageType;


    public ProxyImage(String fileName, ImageType imageType) {
        this.fileName = fileName;
        this.imageType = imageType;
    }


    @Override
    public void display() {
        if (ImageType.REAL == imageType) {
            if (image == null) {
                image = new RealImage(fileName);
            }
        } else if (ImageType.ROTATED == imageType) {
            if (image == null) {
                image = new RotatedImage(fileName);
            }
        }

        image.display();
    }
}
