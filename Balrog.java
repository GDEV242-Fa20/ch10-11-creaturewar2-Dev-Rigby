
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 200;
    private static final int MIN_DEMON_HP = 80;
    private static final int MAX_DEMON_STR = 100;
    private static final int MIN_DEMON_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
    /**
     * Damage override for the Balrog that lets it attack twice.
     */
    public int damage()
    {
        return super.damage() + super.damage();
    }
}
