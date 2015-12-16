import java.util.Scanner;
public class Menù {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Pronto per una maggica avventura? io no, come ti chiami stronzetto?");
        Player p = new Player(scanner.next());
        Enemy e = new Enemy();

        System.out.printf("%s....bel nome!...per uno sfigato! Dai sù.. di che classe vuoi essere? %n",p.getNome());
        System.out.printf("vuoi essere un %s? Benissimo... peccato che.. LE CLASSI LE DEVO ANCORA FARE! %n",scanner.next());

        System.out.println("Pronto per partire con un combattimento? premi s e invio quando lo sei..");
        if (scelta(scanner.next())) p.fight(e);
    }


    private boolean scelta(String s) {
        if(s.equals("s") || s.equals("S"))
            return true;
        else{
            System.out.printf("lo prendo come un no allora..");
            return false;
        }
    }
}


