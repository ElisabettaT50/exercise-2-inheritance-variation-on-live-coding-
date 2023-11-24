public abstract class Forma {
    public int base;
    public int altezza;

    public Forma(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltezza() {
        return altezza;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void stampaDettagli(){
        System.out.println("Dettagli forma: " );
        System.out.println("Base = " + base);
        System.out.println("Altezza = " + altezza);

    }
    public abstract void calcolaArea();
}
