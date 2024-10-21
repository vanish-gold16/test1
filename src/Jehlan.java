public class Jehlan {
    private float hrana;
    private float vyska;

    public Jehlan(float hrana, float vyska){ //konstruktor
        this.hrana = hrana;
        this.vyska = vyska;
    }

    public float objem(float hrana, float vyska){ //vypocet objemu
        this.hrana = hrana;
        this.vyska = vyska;
        return (hrana*hrana*vyska)/3;
    }

    @Override
    public String toString() {
        return "Jehlan ma " +
                "hranu " + hrana +
                "cm, vysku " + vyska +
                "cm, " + "a objem = " + objem(hrana, vyska) + "cm3";
    }
    // setters a getters
    public float getHrana() {
        return hrana;
    }

    public void setHrana(float hrana) {
        this.hrana = hrana;
    }

    public float getVyska() {
        return vyska;
    }

    public void setVyska(float vyska) {
        this.vyska = vyska;
    }
}
