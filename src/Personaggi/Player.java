package Personaggi;

import Stanze.Stanza;

public class Player {

    protected String nome="";                              //nome giocatore
    protected int hp,sp,atk,def,expnext;     //healthpoints,skillpoints,attacco,difesa,esperienza,esperienza per il lvlup,livello
    protected int exp=0;
    protected int lvl=1;
    private Stanza posizione;

    public Player(String nome){
        this.nome=nome;
    }

    public void fight(Enemy e){
        //inizializzo tutte le variabili del nemico
        int hpe=e.getHp();
        int atke=e.getAtk();
        int defe=e.getDef();
        int expe=e.getExp();
        int dmg=0;

        System.out.printf("Appare un %s!!, inizio fase di combattimento!! %s, RIMANI DETERMINATO!! %n%n",e.getNome(),nome);
        //inizio combattimento
        do{
            //danno calcolo inflitto dal giocatore al mostro
            if(defe>atk) hpe-=dmg=1;
            else hpe-=dmg=atk-defe;
            System.out.printf("%s Ha inflitto %d a %s %n", nome,dmg,e.getNome());

            //danno calcolo inflitto dal mostro al giocatore
            if(def>atke) hp-=dmg=1;
            else hp-=dmg=atke-def;
            System.out.printf("%s Ha inflitto %d a %s %n", e.getNome(),dmg,nome);

        }while(hp>0 && hpe>0);

        //controllo fine combattimento
        if(hp<0)
            gameOver();
        else victory(expe);
    }


    //metodo di gameover per la morte del giocatore
    public void gameOver(){System.out.printf("%s fa ciao ciao con la manina al mondo dei vivi",nome);}

    //metodo in caso di vittoria
    public void victory(int expe) {
        //aggiunta punti exp
        exp+=expe;
        System.out.printf("Il nemico è stato sconfitto!! %s ha guadagnato %d punti esperienza! %n",nome,expe);

        //controllo esperienza, in caso sale di livello il giocatore
        while(exp>expnext){
            lvl++;
            expnext+=50;
        }
        System.out.printf("%s sale di livello! Livello Attuale: %d, Exp rimanente per il prossimo liv: %d %n",
                nome, lvl, (expnext-exp));
    }


    //setter e getter qua sotto
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getSp() {
        return sp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setExpnext(int expnext) {
        this.expnext = expnext;
    }
}
