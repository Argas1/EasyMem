public class Mem {
    private String name;
    private String url;
    private boolean isFavourite;

    public Mem(String name, String url, boolean isFavourite) {
        this.name = name;
        this.url = url;
        this.isFavourite = isFavourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", isFavourite=" + isFavourite +
                '}';
    }
}
