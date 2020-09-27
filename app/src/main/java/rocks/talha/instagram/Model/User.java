package rocks.talha.instagram.Model;

public class User {
    private String username;
    private String name;
    private String email;
    private String bio;
    private String imageurl;
    private String id;

    public User() {
    }

    public User(String username, String name, String email, String bio, String imageurl, String id) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.bio = bio;
        this.imageurl = imageurl;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}