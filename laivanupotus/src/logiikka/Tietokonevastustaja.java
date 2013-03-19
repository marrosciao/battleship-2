package logiikka;

public class Tietokonevastustaja {

    private Pelilauta lauta;
    private Laiva[] laivat;

    public Tietokonevastustaja() {
        lauta = new Pelilauta();
        laivat = new Laiva[5];
        laivat[0] = asetaLaiva(5);
        laivat[1] = asetaLaiva(4);
        laivat[2] = asetaLaiva(3);
        laivat[3] = asetaLaiva(3);
        laivat[4] = asetaLaiva(2);

    }

    public boolean pelaa() {
        return true;
    }

    public Laiva asetaLaiva(int pituus) {
        int alkux;
        int alkuy;
        while (true) {
            alkux = (int) (9 * Math.random());
            alkuy = (int) (9 * Math.random());
            int suunta = (int) (4 * Math.random()); // suunnat: 0=p 1=i 2=e 3=l

            boolean testimuuttuja;
            int loppux;
            int loppuy;

            if (suunta == 0) {
                loppux = alkux;
                loppuy = alkuy - pituus + 1;
            } else if (suunta == 1) {
                loppux = alkux + pituus - 1;
                loppuy = alkuy;

            } else if (suunta == 2) {
                loppux = alkux;
                loppuy = alkuy + pituus - 1;

            } else {
                loppux = alkux - pituus + 1;
                loppuy = alkuy;

            }
            if (loppux >= 0 && loppuy >= 0 && loppux <= 9 && loppuy <= 9) {
                testimuuttuja = lauta.asetaLaiva(alkux, alkuy, loppux, loppuy);
                if (testimuuttuja) {
                    break;
                }
            }

        }
        return lauta.getLauta()[alkuy][alkux].getLaiva();                  
    }

    public Laiva[] getLaivat() {
        return laivat;
    }
}