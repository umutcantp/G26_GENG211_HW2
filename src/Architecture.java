import java.util.ArrayList;
import java.util.List;

public class Architecture extends Artwork {
    private List<Architect> architects;
    private double length;
    private double width;
    private double height;
    private double cost;

    public Architecture() {
        super();
        this.architects = new ArrayList<>();
        this.length = .0;
        this.width = .0;
        this.cost = .0;
    }

    @Override
    public double calculateCost() {
        if (super.getStyle().equals("Gothic")){
            cost = getDimension();
        }else if (super.getStyle().equals("Baroque")){
            cost = getDimension() * .8;
        }else {
            cost = getDimension() * .6;
        }
        return cost;
    }

    public List<Architect> getArchitects() {
        return architects;
    }

    public void addArchitects(Architect architect) {
        this.architects.add(architect);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double getDimension(){
        return (height * width * length);
    }
}
