import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    private String name;
    private Date birthDate;
    private Date dateOfDeath;
    private String nationality;
    private SimpleDateFormat dateFormat;



    public Person() {
        this.name = null;
        this.birthDate = new Date(); //Just a placeholder.
        this.dateOfDeath = new Date(); //Just a placeholder.
        this.nationality = null;
        this.dateFormat = new SimpleDateFormat("yyyy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return dateFormat.format(birthDate);
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = dateFormat.parse(birthDate);
    }

    //String method tipini sor date ile yapılabiliyor mu?
    public String getDateOfDeath() {
        return dateFormat.format(dateOfDeath);
    }

    public void setDateOfDeath(String dateOfDeath) throws ParseException {
        this.dateOfDeath = dateFormat.parse(dateOfDeath);
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
