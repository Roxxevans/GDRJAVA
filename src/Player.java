public class Player {

   private String nome;                              //nome giocatore
   private int hp,sp,atk,def,exp,expnext,lvl;        //healthpoints,skillpoints,attacco,difesa,esperienza,esperienza per il lvlup,livello
   //private PlClass plclass;                        //classe giocatore (Guerriero, mago, ladro) (da implementare)
   //private Skills skills;                          //lista abilità personaggio  (da implementare)



    //visto che le classi del giocatore sono ancora da fare il costruttore metterà solo il nome
    //in futuro gli hp etc verranno dati dalla classe giocatore, exp sarà sempre inizializzata a 0 e lvl a 1
    public Player(String name){
        nome=name;
        hp=30;
        sp=10;
        atk=1;
        def=5;
        exp=0;
        expnext=50;
        lvl=1;
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
            if(defe>atk) {           //inizio calcolo danno inflitto al nemico
                dmg = 1;
                hpe -= dmg;
            }
            else{
                dmg=atk-defe;
                hpe-=dmg;
            }
            System.out.printf("%s Ha inflitto %d a %s %n", nome,dmg,e.getNome());

            if(def>atke) {          //inizio calcolo danno inflitto al giocatore
                dmg = 1;
                hp-=dmg;
            }
            else{
                dmg=atke-def;
                hp-=dmg;
            }
            System.out.printf("%s Ha inflitto %d a %s %n", e.getNome(),dmg,nome);
        }while(hp>0 && hpe>0);


        //controllo fine combattimento
        if(hp<0)
            gameOver();
        else victory(expe);
    }


    //metodo di gameover per la morte del giocatore
    public void gameOver(){
        System.out.printf("%s fa ciao ciao con la manina al mondo dei vivi",nome);
    }

    //metodo in caso di vittoria
    public void victory(int exp) {
        this.exp=+exp;                  //aggiunta punti exp
        System.out.printf("Il nemico è stato sconfitto!! %s ha guadagnato %d punti esperienza! %n",nome,exp);
        lvlup();
    }

    public void lvlup(){
        if (exp>expnext){               //controllo esperienza, in caso sale di livello il giocatore
            lvl++;
            expnext=+30;
            System.out.printf("%s sale di livello! Livello Attuale: %d, Exp rimanente per il prossimo liv: %d",
                    nome,lvl,(exp-expnext));
            lvlup();
        }
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
}
