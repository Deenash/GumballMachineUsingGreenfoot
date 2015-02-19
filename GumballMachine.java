import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.List;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
    int x, y ;
    int count=0;

    public void act() 
    {
        GumballWorld gw = (GumballWorld)getWorld();
        
        Actor coin=null, quarterCoin=null, pennyCoin=null;   
        coin = getOneIntersectingObject( Coin.class );
        if(coin!=null)
        {
                GreenfootImage gi;
                gi = new GreenfootImage(100,100);
                gi.setColor( java.awt.Color.YELLOW ) ;
                gi.fill() ;
                gi.setColor( java.awt.Color.BLACK ) ;
                gi.drawString( "Click on the coin \n to turn Crank", 10, 50 );
                Message m = new Message() ;
                m.setImage(gi);     
                World world = getWorld();
                world.addObject( m, 533, 350 ) ;
                Greenfoot.delay(5);
                world.removeObject(m);
                
                if(Greenfoot.mousePressed(gw.getQuarter()) && coin==gw.getQuarter() && (coin.toString().substring(0,7).equals("Quarter")))
                {

                    Inspector inspector= gw.getInspector();
                    Quarter q=gw.getQuarter();
                    inspector.inspect(q);
                    
                    if(gw.getQuarter()!=null)
                    {
                        world.removeObject(gw.getQuarter());
                    }
                    
                }
                else if(Greenfoot.mousePressed(gw.getFakeQuarter()) && coin==gw.getFakeQuarter() && (coin.toString().substring(0,11).equals("FakeQuarter")))
                {
                    Inspector inspector= gw.getInspector();
                    FakeQuarter fq=gw.getFakeQuarter();
                    inspector.inspect(fq);
                    
                    GreenfootImage gi2;
                    gi2 = new GreenfootImage(100,100);
                    gi2.setColor( java.awt.Color.YELLOW ) ;
                    gi2.fill() ;
                    gi2.setColor( java.awt.Color.BLACK ) ;
                    gi2.drawString( "Crank Turned!", 10, 50 );
                    Message m1 = new Message() ;
                    m1.setImage(gi2);     
                    world.addObject( m1, 367,237 ) ;
                    Greenfoot.delay(200);
                    world.removeObject(m1);
                    
                    Greenfoot.playSound("murloc.mp3");
                    world.removeObject(gw.getFakeQuarter());
                }
                else if(coin.toString().substring(0,5).equals("Penny"))
                {
                    Inspector inspector= gw.getInspector();
                    Penny p=gw.getPenny();
                    inspector.inspect(p);
                    
                    GreenfootImage gi2;
                    gi2 = new GreenfootImage(100,100);
                    gi2.setColor( java.awt.Color.YELLOW ) ;
                    gi2.fill() ;
                    gi2.setColor( java.awt.Color.BLACK ) ;
                    gi2.drawString( "Crank Turned!", 10, 50 );
                    Message m1 = new Message() ;
                    m1.setImage(gi2);     
                    world.addObject( m1, 367,237 ) ;
                    Greenfoot.delay(200);
                    world.removeObject(m1);
                    
                    Greenfoot.playSound("murloc.mp3");
                    world.removeObject(gw.getPenny());
                }
        }}
    }
        