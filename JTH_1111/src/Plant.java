public class Plant {
    private String displayName;
    private int age;
    private int height;

    public Plant(String displayName, int age, int height) {
        this.displayName = displayName;
        this.age = age;
        this.height = height;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
