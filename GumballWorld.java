import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{
    
    Inspector inspector;
    RandomPicker randompicker;
    GreenPicker greenpicker;
    Quarter quarter=new Quarter();
    FakeQuarter fakeQuarter=new FakeQuarter();
    Penny penny=new Penny();

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        addObject( penny, 57, 71 ) ;
        addObject( quarter, 68, 156 ) ;
        addObject( fakeQuarter, 66, 248 ) ;

        inspector = new Inspector();
        addObject(inspector, 533, 291);
        randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        Quarter quarter2 = new Quarter();
        addObject(quarter2, 157, 426);
        quarter2.setLocation(67, 354);
        removeObject(quarter2);
    }
    
    
    public Inspector getInspector()
    {
        return inspector;
    }
    public GreenPicker getGreenPicker()
    {
        return greenpicker;
    }
    public RandomPicker getRandomPicker()
    {
        return randompicker;
    }
    public Quarter getQuarter()
    {
        return quarter;
    }
        public FakeQuarter getFakeQuarter()
    {
        return fakeQuarter;
    }
        public Penny getPenny()
    {
        return penny;
    }
}
