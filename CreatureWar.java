
import java.util.ArrayList;
/**
 * Write a description of class CreatureWar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreatureWar
{
    public static void main(String[] args)
    {
        ArrayList<Creature> good = new ArrayList<Creature>();
        for(int index = 0; index < 100; index++)
        {
            int creatureType = Randomizer.nextInt(10) + 1;
            if(creatureType < 6)
                good.add(index, new Human());
            else if(creatureType < 9)
                good.add(index, new Elf());
            else
                good.add(index, new Dwarf());
        }
        ArrayList<Creature> evil = new ArrayList<Creature>();
        for(int index = 0; index < 65; index++)
        {
            int creatureType = Randomizer.nextInt(25) + 1;
            if(creatureType < 18)
                evil.add(index, new Human());
            else if(creatureType < 25)
                evil.add(index, new CyberDemon());
            else
                evil.add(index, new Balrog());
        }
        int goodIndex = 0;
        int evilIndex = 0;
        while(good.size() != goodIndex && evil.size() != evilIndex)
        {
            while(good.get(goodIndex).isAlive() && evil.get(evilIndex).isAlive())
            {
                good.get(goodIndex).takeDamage(evil.get(evilIndex).damage());
                evil.get(evilIndex).takeDamage(good.get(goodIndex).damage());
            }
            if(good.get(goodIndex).isKnockedOut())
            {
                goodIndex++;
            }
            if(evil.get(evilIndex).isKnockedOut())
            {
                evilIndex++;
            }
        }
        if(good.size() == goodIndex && evil.size() == evilIndex)
            System.out.println("It was a tie!");
        else if(evil.size() == evilIndex)
            System.out.println("The forces of good have won!");
        else
            System.out.println("The forces of evil have won!");
    }
}
