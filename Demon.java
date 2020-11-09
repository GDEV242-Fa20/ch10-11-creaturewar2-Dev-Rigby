;
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    /**
     * Demon class no arg sonstructor
     */
    public Demon()
    {
        super();
    }
    /**
     * Demon class constructor that takes arguements
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    /**
     * demon racial damage override that 5% of the time adds 50 to the damage of the demons attack
     */
    public int damage()
    {
        if(Randomizer.nextInt(20) == 19)
            return super.damage() + 50;
        else
            return super.damage();
    }
    
}

