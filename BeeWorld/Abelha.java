import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe abelha para ser utilizada no jogo BeeWorld
 * 
 * @author (Deborah Bombini 
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    /**
     * Método que será executado quando apertado o botão act ou run.
     */
    public void act()
    {
        // Add your action code here.
        move(3);
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
    
    }
}
