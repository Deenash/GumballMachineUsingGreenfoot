import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//
public class GreenPicker extends Picker
{
    public void pick()
    {

        GumballWorld world = (GumballWorld) getWorld();
        GreenGumball gb=new GreenGumball();
        //System.out.println("Inside GREENPicker"+world);
        world.addObject(gb,500,500);
        //        setMessage(gb.getClass().getName());
        GreenfootImage gi,gi1;
        gi = new GreenfootImage(100,100); gi1 = new GreenfootImage(100,100);
        gi.setColor( java.awt.Color.YELLOW ) ; gi1.setColor( java.awt.Color.YELLOW ) ;
        gi.fill() ; gi1.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ; gi1.setColor( java.awt.Color.BLACK ) ;
        gi.drawString( "You can Have \n  your Gumball", 10, 50 ); gi1.drawString( "Crank Turned!", 10, 50 );
        Message m = new Message() ; Message m1 = new Message() ;
        m.setImage(gi); m1.setImage(gi1);
        World world1 = getWorld();
        world1.addObject( m, 669, 550 ) ; world1.addObject( m1, 367, 237 ) ;
        world1.removeObject(world.getQuarter());
        Greenfoot.playSound("coin_drop.mp3");
        Greenfoot.delay(200);
        world1.removeObject(m); world1.removeObject(m1);
        world.removeObject(gb);
        

    }
    
    public void act()
    {

    }
}
