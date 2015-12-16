package Personaggi.JobPersonaggi;
import Personaggi.Enemy;
import Personaggi.Player;

public class Warrior extends Player{

    //Costruttore Warrior
    public Warrior(String nome){
        super(nome);
        hp=50;
        sp=0;
        atk=20;
        def=10;
        expnext=70;
    }

    //Inizio Abilità
    public void Slash(Enemy e){
        if(lvl>3&&sp>=5){
            e.setHp(e.getHp()-20);
            sp-=5;
        }
    }



}
