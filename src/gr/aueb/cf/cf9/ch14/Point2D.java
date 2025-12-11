package gr.aueb.cf.cf9.ch14;

public class Point2D extends Point {

    private double y;

    public Point2D() {
        //super();        //  Καλείται και δημιουργείται πρώτα η υπερκλάση Point
        //y = 0.0;          // Τα βάζουμε σε σχόλια γιατί γίνονται και by default
    }

    public Point2D(double x, double y) {
        super(x);           // Πρέπει να το καλέσω ρητά στον overloaded
        // Ισοδυναμεί με το από κάτω
        // setX(x);     κληρονομεί τον setter από υπερκλάση
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Override τις "από πάνω" μεθόδους
    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + y + ")";
    }
}
