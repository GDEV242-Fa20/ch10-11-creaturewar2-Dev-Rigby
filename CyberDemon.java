
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 25;
    private static final int MAX_DEMON_STR = 40;
    private static final int MIN_DEMON_STR = 20;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
}
