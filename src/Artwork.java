public abstract class Artwork {
    private String name;
    private String style;

    public Artwork() {
        this.name= null;
        this.style = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public abstract double  calculateCost();
}

