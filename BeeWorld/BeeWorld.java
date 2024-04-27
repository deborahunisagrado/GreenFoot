import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abelha abelha = new Abelha();
        addObject(abelha,52,29);
        Mosca mosca = new Mosca();
        addObject(mosca,71,256);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,396,92);
        Aranha aranha = new Aranha();
        addObject(aranha,384,342);
        mosca.setLocation(210,547);
        abelha.setLocation(156,247);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,646,538);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,656,185);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,132,114);
    }
}
