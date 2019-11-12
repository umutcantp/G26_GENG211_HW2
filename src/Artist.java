import java.util.ArrayList;
import java.util.List;

public class Artist extends Person {
    private List<String> periods;

    public Artist() {
        super();
        this.periods = new ArrayList<>();
    }

    public List<String> getPeriods() {
        return periods;
    }

    public void addPeriod(String period){
        this.periods.add(period);
    }
}
