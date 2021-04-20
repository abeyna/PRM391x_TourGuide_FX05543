package funix.prm391x.tourguide;

/**
 * @author Luan N Nguyen
 * @since April 20th 2021
 *                    Object for specific place.
 */
public class GuidePlace {
    /** Place's displayed by image.*/
    private int image;

    /** Place's name.*/
    private String name;

    /** Place's address.*/
    private String address;

    /** Place's url.*/
    private String url;

    /**
     * Constructor for GuidePlace object
     * @param image
     *                     Image displays object
     * @param title
     *                     Place's name
     * @param address
     *                     Place's address
     * @param url
     *                     Place's url
     */
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
