public class ThanksgivingMadLib{
    //All instance variables (parts of speech assigned by the user.)
    private String a1;
    private String n1;
    private String a2;
    private String n2;
    private String v1;
    private String a3;
    private String a4;
    private String v2;
    private String n3;
    private String a5;
    private String v3;
    private String a6;

    //Constructor
    public ThanksgivingMadLib(String a1, String n1, String a2, String n2, String v1, String a3,
                              String a4, String v2, String n3, String a5, String v3, String a6){
        this.a1 = a1;
        this.n1 = n1;
        this.a2 = a2;
        this.n2 = n2;
        this.v1 = v1;
        this.a3 = a3;
        this.a4 = a4;
        this.v2 = v2;
        this.n3 = n3;
        this.a5 = a5;
        this.v3 = v3;
        this.a6 = a6;
    }

    //Getters and setters for all adjectives, nouns, and verbs used.
    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    //Returns the appropriate madlib with the words the user picked.
    public String madLib(){
        return String.format("""
                This Thanksgiving, my family and I gathered around a %s table, excited for the big meal.
                We started with a plate of %s, but it tasted a little %s. My %s tried to %s it to make it better,
                but that only made it more %s! When the turkey came out, it looked %s, and everyone was eager to
                %s it. But once we took a bite, we realized it tasted like %s! For dessert, Aunt Sally brought
                out a %s pie that no one could %s. By the end of the night, we were all too %s to do anything 
                except laugh about our Thanksgiving surprise!""", this.a1, this.n1, this.a2, this.n2, this.v1, this.a3, this.a4, this.v2, this.n3, this.a5, this.v3, this.a6);
    }
}