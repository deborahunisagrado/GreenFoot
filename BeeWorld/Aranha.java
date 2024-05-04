import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Inseto
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (Greenfoot.getRandomNumber(100) +1 <= 10){
            turn(Greenfoot.getRandomNumber(91)-45);
        }
        verificarCanto();
        acelerarAranha();
        capturaMosca();
        interceptarAbelha();
    }
    /**
     * Metodo que ira acelerar a aranha em determinada área do tabuleiro
     */
    public void acelerarAranha(){
        if(getX()>=200 && getX()<=600 && getY()>=100 && getY()<=500){
           move(2);     
        }
    }
    /**
     * metodo que captura a mosca pela a aranha
     */
    public void capturaMosca(){
        if(isTouching(Mosca.class)) {
            removeTouching(Mosca.class);
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
    public void interceptarAbelha(){
        Abelha ab = ((BeeWorld) getWorld()).getAbelha();
        if(ab!=null){
            turnTowards(ab.getX(), ab.getY());           
        }
    }
}
