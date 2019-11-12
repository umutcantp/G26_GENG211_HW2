public class Painting extends Artwork {
    private Artist artist;
    private double length;
    private double width;
    private double cost;

    public Painting() {
        super();
        this.artist = null;
        this.length = .0;
        this.width = .0;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
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

    @Override
    public double calculateCost() {
        if (super.getStyle().equals("Renaissance")){
            cost = getDimension() * 7;
        }else  if (super.getStyle().equals("Baroque")){
            cost = getDimension() * 5.5;
        }else {
            cost = getDimension() * 4.5;
        }
        return cost;
    }

    private double getDimension(){
        return (this.length * this.width);
    }
}
