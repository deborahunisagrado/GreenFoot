import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author Deborah Bombini
 * @version 2024-04-20
 */
public class Mosca extends Inseto
{
    private int velocidade;
    /**
     * método act é executado sempre que apertarmos o botão act ou ficará em execução quando 
     * apertarmos o botão run.
     */
    public Mosca(){
        velocidade = 1;
        this.turn(Greenfoot.getRandomNumber(180));
    }
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang);
    }
    public void act()
    {
        move(1);
        verificarCanto();
    }
}
