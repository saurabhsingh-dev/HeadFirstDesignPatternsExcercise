import java.lang.String;
public abstract class Beverages {
    String description;
    public Beverages(){
        description = "No Beverages";
    }
    public abstract float cost();
    public String getDescription(){
        return description;
    }
}
