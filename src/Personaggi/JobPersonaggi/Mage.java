package Personaggi.JobPersonaggi;
import Personaggi.Enemy;
import Personaggi.Player;

public class Mage extends Player{

    //Costruttore Mage
    public Mage(String nome){
        super(nome);
        hp=20;
        sp=30;
        atk=10;
        def=10;
        expnext=30;
    }

    //Inizio Abilità
    public void Fireball(Enemy e){
        if(sp>=8){
            e.setHp(e.getHp()-9);
            sp-=8;
        }
    }



}
