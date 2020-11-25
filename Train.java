public class Train {
    /*Пункт назначения, Номер поезда,
    Время отправления, Число мест (общих, купе, плацкарт, люкс).*/
    private String destination;
    private int number;
    private String time;
    private int shared;
    private int coupe;
    private int plats;
    private int luxury;

    public Train(String destination, int number, String time, int shared, int coupe, int plats, int luxury) {
        this.destination = destination;
        this.number = number;
        this.time = time;
        this.shared = shared;
        this.coupe = coupe;
        this.plats = plats;
        this.luxury = luxury;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public String getTime() {
        return time;
    }

    public int getShared() {
        return shared;
    }

    public int getCoupe() {
        return coupe;
    }

    public int getPlats() {
        return plats;
    }

    public int getLuxury() {
        return luxury;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setShared(int shared) {
        this.shared = shared;
    }

    public void setCoupe(int coupe) {
        this.coupe = coupe;
    }

    public void setPlats(int plats) {
        this.plats = plats;
    }

    public void setLuxury(int luxury) {
        this.luxury = luxury;
    }

    @Override
    public String toString() {
        return "Train: " + number + "\n" +
                "destination: " + destination + "\n" +
                "number: " + number + "\n" +
                "time: " + time + "\n" +
                "shared: " + shared + "\n" +
                "coupe: " + coupe + "\n" +
                "plats: " + plats + "\n" +
                "luxury: " + luxury + "\n";
    }
}
