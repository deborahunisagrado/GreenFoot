import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a nve do jogo
 * 
 * @author Deborah Bombini
 * @version 2024-04-27
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")){
            move(-10);       
        }
        if (Greenfoot.isKeyDown("right")){
            move(10);       
        }
        if(Greenfoot.isKeyDown("space")){
            //getWorld().addObject(new Bala(), getX(), getY()-45);          
            ((SpaceWorld)getWorld()).criarBala(getX(), getY()-45);
        }
        
    }
}
