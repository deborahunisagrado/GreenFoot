import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{
    public Bala bala = null;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SpaceWorld()
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
        Nave nave = new Nave();
        addObject(nave,400,550);
        Alien alien = new Alien();
        addObject(alien,400,50);
    }

    public Bala getBata(){
        return bala;
    }
    public void criarBala(int pX, int pY){
        if(bala == null){
            bala = new Bala();
            addObject(bala, pX, pY);
        }
    }
    public void removerBala(){
        removeObject(bala);
        bala = null;
    }
}
