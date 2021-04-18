package funix.prm391x.tourguide;

public class GuidePlace {
    private int image;
    private String name;
    private String address;

    public GuidePlace(int image, String title, String address) {
        this.image = image;
        this.name = title;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
