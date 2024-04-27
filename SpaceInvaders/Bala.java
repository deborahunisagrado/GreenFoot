import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a bala no jogo
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()-5);
        removerAlien();
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        
    }
        public void removerAlien(){
        if(isTouching(Alien.class)){
            removeTouching(Alien.class);
            getWorld().addObject(new Alien(), Greenfoot.getRandomNumber(600), 50);
        }
        
    }
}
