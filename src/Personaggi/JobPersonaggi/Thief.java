package Personaggi.JobPersonaggi;
import Personaggi.Enemy;
import Personaggi.Player;

public class Thief extends Player{

    //Costruttore Thief
    public Thief(String nome){
        super(nome);
        hp=10;
        sp=0;
        atk=1;
        def=5;
        expnext=10;
    }

    //Inizio Abilità
    public void Slash(Enemy e){
        if(lvl>3&&sp>=5){
            e.setHp(e.getHp()-20);
            sp-=5;
        }
    }



}
