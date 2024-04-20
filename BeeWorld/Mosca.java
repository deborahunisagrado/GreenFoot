import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author Deborah Bombini
 * @version 2024-04-20
 */
public class Mosca extends Actor
{
    /**
     * método act é executado sempre que apertarmos o botão act ou ficará em execução quando 
     * apertarmos o botão run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (isAtEdge()) {
            turn(180);
        }
        
    }
}
