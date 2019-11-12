import java.util.ArrayList;
import java.util.List;

public class Vault {
    private List<Artist> artists;
    private List<Architect> architects;
    private List<Painting> paintings;
    private List<Sculpture> sculptures;
    private List<Architecture> architectures;

    public Vault() {
        this.artists = new ArrayList<>();
        this.architects = new ArrayList<>();
        this.paintings = new ArrayList<>();
        this.sculptures = new ArrayList<>();
        this.architectures = new ArrayList<>();
    }

    //Enum ile yapacaksan type tipi enum olabilir
    public void add (Object item, int type){
        if (type == 1){
            artists.add((Artist) item);
        }else if (type == 2){
            sculptures.add((Sculpture) item);
        }else if (type == 3){
            architectures.add((Architecture) item);
        }else if (type == 4){
            artists.add((Artist) item);
        }else if (type == 5){
            architects.add((Architect) item);
        }else {
            return;
        }
    }

    public Object remove(int index, int type){
        if (type == 1){
           return artists.remove(index);
        }else if (type == 2){
            return sculptures.remove(index);
        }else if (type == 3){
            architectures.remove(index);
        }else if (type == 4){
            artists.remove(index);
        }else if (type == 5){
            architects.remove(index);
        }else{
            return null;
        }
        return null;
    }
}



