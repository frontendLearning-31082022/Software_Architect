package b.open_close;

class OrderCalc {
    private Double calcDefaultOrder() {return null;}

    public double getSum() {
        Double calcIncapsulated = this.calcDefaultOrder();
        return calcIncapsulated;
    }
}