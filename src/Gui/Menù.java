package Gui;

import Personaggi.Enemy;
import Personaggi.JobPersonaggi.Mage;
import Personaggi.JobPersonaggi.Thief;
import Personaggi.JobPersonaggi.Warrior;
import Personaggi.Player;
import java.util.Scanner;

public class Menù {

    Scanner scanner = new Scanner(System.in);
    Player p;

    public void start() {
        System.out.println("Pronto per una maggica avventura? io no, come ti chiami stronzetto?");
        String nome = (scanner.next());
        Enemy e = new Enemy();

        System.out.printf("%s....bel nome!...per uno sfigato! Scegli la classe: %n" +
                "a) Guerriero \tb) Mago \tc) Ladro %n", nome);
        boolean r;
        do {
            r=false;
            String i = scanner.next();
            switch (i) {
                case "a": p = new Warrior(nome);
                        break;
                case "b": p = new Mage(nome);
                        break;
                case "c": p = new Thief(nome);
                        break;
                default:System.out.println("Hai già detto abbastanza stronzate... la smettiamo?");
                        r=true;
                        break;

            }
        }while(r);
                    System.out.println("Pronto per partire con un combattimento? premi s e invio quando lo sei..");
                    if (scelta(scanner.next())) p.fight(e);
            }



        private boolean scelta(String s){
            if (s.equals("s") || s.equals("S"))
                return true;
            else {
                System.out.printf("lo prendo come un no allora..");
                return false;
            }
        }
        }



