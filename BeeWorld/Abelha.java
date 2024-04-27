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
        //verificando se esta nos cantos
        verificarPosicao();
        capturaMosca();
    
    }
    /**
     * Metodo que verifica se está na direita do mundo
     */
    public boolean isNaDireita(){
        return (getX() > getWorld().getWidth() -10);            
    }
    /**
     * Metodo que verifica se está na esquerda do mundo
     */
    public boolean isNaEsquerda(){
        return (getX() < 10);
    }
    /**
     * Metodo que verifica se está na base do mundo
     */
    public boolean isNaBase(){
        return (getY() > getWorld().getHeight() - 10);
    }
    /**
     * Metodo que verifica se está na topo do mundo
     */
    public boolean isNoTopo(){
        return (getY() < 10);
    }
    /**
     * Metodo que verifica se a abelha esta nos cantos e reposiciona ela
     */
    public void verificarPosicao(){
        if(isNaDireita()){
            setLocation(10, getY());                
        }
        if(isNaEsquerda()){
            setLocation(getWorld().getWidth() -10, getY());                
        }
        if(isNaBase()){
            setLocation(getX(), 10);                
        }
        if(isNoTopo()){
            setLocation(getX(), getWorld().getHeight() - 10);                
        }
    }
    /**
     * Metodo que captura a mosca
     */
    public void capturaMosca(){
        if(isTouching(Mosca.class)) {
            removeTouching(Mosca.class);
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
}
