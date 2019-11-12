public class Sculpture extends Artwork {
    private Artist artist;
    private String material;
    private short weight;
    private double cost;

    public Sculpture(){
        super();
        this.artist = null;
        this.material = null;
        this.weight = 0;
        this.cost = 0;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    @Override
    public double calculateCost() {
        if (material.equals("marble")){
            cost = weight * 15;
        }else if (material.equals("bronze")){
            cost = weight * 18;
        }else {
            cost = -1;
        }
        return cost;
    }
}

