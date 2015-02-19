import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    public void pick()
    {
    Gumball gb = new GreenGumball();
    int lottery = Greenfoot.getRandomNumber(3);
    switch(lottery)
    {
        case 0: gb = new BlueGumball(); break;
        case 1: gb = new RedGumball(); break;
        case 2: gb = new GreenGumball();break;
    }
    
    GumballWorld gw = (GumballWorld) getWorld();
    //System.out.println("Inside RandomPicker"+gw);
    gw.addObject(gb,500,500);
    //setMessage(gb.getClass().getName());
    
    GreenfootImage gi,gi1;
    gi = new GreenfootImage(100,100); gi1=new GreenfootImage(100,100);
    gi.setColor( java.awt.Color.YELLOW ) ; gi1.setColor( java.awt.Color.YELLOW );
    gi.fill() ;gi1.fill() ;
    gi.setColor( java.awt.Color.BLACK ) ; gi1.setColor( java.awt.Color.BLACK ) ;
    gi.drawString( "You can Have \n  your Gumball", 10, 50 ); gi1.drawString( "Crank Turned!", 10, 50 );
    Message m = new Message() ; Message m1 = new Message() ;
    m.setImage(gi); m1.setImage(gi1);
    World world = getWorld();
    world.addObject( m, 655, 153 ) ; world.addObject( m1, 367, 237 ) ;
    world.removeObject(gw.getQuarter());
    Greenfoot.playSound("coin_drop.mp3");
    Greenfoot.delay(200);
    world.removeObject(m); world.removeObject(m1);
    gw.removeObject(gb);
    
}
}
