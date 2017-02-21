package shirangabai.recyclerviewmy.model;

/**
 * Created by shiran on 25/10/2016.
 */

public class User {
    private final String name;
    private final String phone;
    private final int image;
    private final boolean favorite;

    public User(String name, String phone, int image , boolean favorite) {
        this.name = name;
        this.phone = phone;
        this.image = image;
        this.favorite = favorite;
    }

    public User getUser(){
        return this;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getImage() {
        return image;
    }

    public boolean isFavorite() {
        return favorite;
    }
}
