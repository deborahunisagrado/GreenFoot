import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe abelha para ser utilizada no jogo BeeWorld
 * 
 * @author (Deborah Bombini 
 * @version 2024-04-20
 */
public class Abelha extends Actor
{   
    public int vidas;
    public int pontos;
    private GreenfootImage[] imagens;
    
    public Abelha() {
        vidas = 3;
        pontos = 0;
        imagens = new GreenfootImage[4];
        for(int i=0;i<4;i++){
            imagens[i] = new GreenfootImage("bee0" + (i+1)+ ".png");
        }
    }
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
        capturadaPelaAranha();
        mostarVidas();
        mostarPontos();
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
            Greenfoot.playSound("yoshi-tongue.mp3");
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5) + 1, Greenfoot.getRandomNumber(360)), pX, pY);
            pontos++;
        }
    }
    
    /**
     * metodo que irá ocupar a Abelha pela Aranha
     */
    public void capturadaPelaAranha(){
        if(isTouching(Aranha.class)){
            Greenfoot.playSound("yoshi-waaah.mp3");
            int pX = Greenfoot.getRandomNumber(800);
            int pY = Greenfoot.getRandomNumber(600);
            setLocation(pX, pY);
            vidas--;
        }
        if(vidas<1){
            Greenfoot.stop();
            getWorld().showText("GAME OVER", 400, 300);
        }
    }
    public void mostarVidas(){
        getWorld().showText("Vidas: " + vidas, 40, 10);
    }
        public void mostarPontos(){
        getWorld().showText("Pontos: " + pontos, 700, 10);
    }

}
