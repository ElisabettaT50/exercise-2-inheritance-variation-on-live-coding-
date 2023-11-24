public class Rettangolo extends Forma{

    private String colore;

    public Rettangolo(int base, int altezza, String colore) {
        super(base, altezza);
        this.colore = colore;
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public void calcolaArea() {
        System.out.println(base * altezza);
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("colore: " + colore);
    }
}

