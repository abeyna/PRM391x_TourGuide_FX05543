package funix.prm391x.tourguide;

public class GuidePlace {
    private int image;
    private String name;
    private String address;
    private String url;

    public GuidePlace(int image, String title, String address, String url) {
        this.image = image;
        this.name = title;
        this.address = address;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
