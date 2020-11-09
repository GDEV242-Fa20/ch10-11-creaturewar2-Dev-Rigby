
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 20;
    private static final int MIN_ELF_HP = 7;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 4;
    /**
     * Constructor for the elf creature
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }
    /**
     * modified damage for the elf that 10% of the time doubles damage
     */
    public int damage()
    {
        if(Randomizer.nextInt(10) == 9)
            return super.damage() * 2;
        else
            return super.damage();
    }
}
