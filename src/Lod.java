public class Lod {
    private String jmeno;
    private float maxRychlost;

    public Lod(String jmeno, float maxRychlost){ // konstruktor
        this.jmeno = jmeno;
        this.maxRychlost = maxRychlost;
    }

    public float naUzly(float rychlost){ // prevod km/hod na uzly
        return rychlost/1.851996918f;
    }

    @Override
    public String toString() {
        return "Lod ma" +
                " jmeno " + jmeno +
                ", maximalni rychlost je " + maxRychlost + "km/hod, nebo " + naUzly(maxRychlost) + " uzlu";
    }
    // setters a getters
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public float getMaxRychlost() {
        return maxRychlost;
    }

    public void setMaxRychlost(float maxRychlost) {
        this.maxRychlost = maxRychlost;
    }
}
