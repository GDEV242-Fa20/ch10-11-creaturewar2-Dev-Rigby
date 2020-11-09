
/**
 * Write a description of class Dwarf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DWARF_HP = 38;
    private static final int MIN_DWARF_HP = 15;
    private static final int MAX_DWARF_STR = 40;
    private static final int MIN_DWARF_STR = 10;

    /**
     * Constructor for the dwarf creature
     * 
     */
    public Dwarf()
    {
        
        super(
            Randomizer.nextInt(MAX_DWARF_HP-MIN_DWARF_HP)+MIN_DWARF_HP,    
            Randomizer.nextInt(MAX_DWARF_STR-MIN_DWARF_STR)+MIN_DWARF_STR
        );
          
    }
    /**
     * damage override for dwarves that 33% of the time half of their strength is added to their attack
     */
    public int damage()
    {
        if(Randomizer.nextInt(3) == 2)
            return super.damage() + (super.getStr() / 2);
        else
            return damage();
    }
}
