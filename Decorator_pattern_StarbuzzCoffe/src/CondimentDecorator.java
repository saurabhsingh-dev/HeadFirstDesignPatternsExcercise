import java.lang.String;
public abstract class CondimentDecorator extends Beverages{
    public Beverages beverages;
    public abstract float cost();
    public abstract String getDescription();
}
