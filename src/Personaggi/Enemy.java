package Personaggi;

public class Enemy {

    //per prova del combattimento esisterà un solo tipo di nemico, più avanti pescherà gli attributi da un database

    private String nome;                              //nome nemico
    private int hp;
    private int atk;
    private int def;
    private int exp;

   //costruttore nemico, per ora i valori sono fixati a questo perchè non ho un database di mostri, li farò XD
    public Enemy() {
        nome = "mostroGENERICO";
        hp = 20;
        atk = 1;
        def = 2;
        exp =100;

    }


    //setter e getter qua sotto

    public int getExp() {
        return exp;
    }
    public String getNome() {
        return nome;
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

}
