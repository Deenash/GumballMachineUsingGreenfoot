import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    private ArrayList<Picker> pickers = new ArrayList<Picker>();
    
    public void addPicker(Picker obj)
    {
        pickers.add(obj);
    }
    
    public void removePicker(Picker obj)
    {
        pickers.remove(obj);
    }
    
    public void inspect(Quarter coin)
    {

                         //System.out.println("Control inside inspector inspect");
        if(coin.toString().substring(0,7).equals("Quarter"))
        {
            GumballWorld gw = (GumballWorld) getWorld();
            //Picker randomPicker=new RandomPicker(), greenPicker=new GreenPicker();
            Picker randomPicker=gw.getRandomPicker(), greenPicker=gw.getGreenPicker();
            this.addPicker(randomPicker);
            this.addPicker(greenPicker);
            int whichPicker = Greenfoot.getRandomNumber(pickers.size());
            Picker pickerChosen = pickers.get(whichPicker);
            //System.out.println("Picker chosen");
            //System.out.println("Picker: "+pickerChosen.getClass());
                         //System.out.println("calling pick function");
                         //GreenPicker gp=gw.getGreenPicker();
                         
                         //System.out.println("PRinting world inside Inspector "+gw.getClass());
            GreenfootImage gi;
            gi = new GreenfootImage(100,100);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Quarter Accepted", 0, 50 );
            Message m = new Message() ;
            m.setImage(gi);     
            World world = getWorld();
            world.addObject( m, 533, 350 ) ;
            
            if(coin.getClass()==Quarter.class)
            pickerChosen.pick();
            

            //gp.pick();
        }
        else if(coin.toString().substring(0,11).equals("FakeQuarter"))
        {
            GreenfootImage gi;
            gi = new GreenfootImage(100,100);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Fake Quarter \n  is rejected", 10, 50 );
            Message m = new Message() ;
            m.setImage(gi);     
            World world = getWorld();
            world.addObject( m, 533, 350 ) ;
        }

    }
    
    public void inspect(Penny penny)
    {
        GreenfootImage gi;
        gi = new GreenfootImage(100,100);
        gi.setColor( java.awt.Color.YELLOW ) ;
        gi.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ;
        gi.drawString( " Only Quarter \n  is Accepted", 10, 50 );
        Message m = new Message() ;
        m.setImage(gi);     
        World world = getWorld();
        world.addObject( m, 533, 350 ) ;
    }
}
