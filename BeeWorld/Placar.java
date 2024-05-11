import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Essa classe vai representar um placar no jogo BeeWorld
 * 
 * @author Deborah Bombini
 * @version 2024-05-11
 */
public class Placar extends Actor
{
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Placar()
    {
        texto = "Score: 0";
        tamanhoTexto = 25;
        corFonte = Color.BLUE;
        atualizarImagem();
    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String value){
        texto = value;
        atualizarImagem();
    }
    public void act(){
        
    }
    public void atualizarImagem(){
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(), tamanhoTexto);
        img.setColor(corFonte);
        img.setFont(new Font("Comic Sans MS", true, false, tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img);
    }
    
}
