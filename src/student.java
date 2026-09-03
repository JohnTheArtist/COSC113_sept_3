

// https://github.com/JohnTheArtist/COSC113_sept_3.git
public class student {


    String FN;
    String LN;
    int sid;

    student(){
        FN = "N/A";
        LN = "N/A";
        sid = 0;

    }

    student(String FN, String LN){
        this.FN = FN;
        this.LN = LN;

    }

    // Constructor chaining
    student( String FN, String LN, int sid ){
        this(FN,LN);
        this.sid = 2020;
    }

    student( String FN, int sid, String LN){
        this.FN = "K";
        this.LN = "C";
        this.sid = 2020;



    }

    student( int sid, String LN, String FN){


        this.FN = FN;
        this.LN = LN;
        this.sid = sid;



    }

    public String getFN() {
        return FN;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getLN() {
        return LN;
    }

    public void setLN(String LN) {
        this.LN = LN;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public static void main(String[] args){

        student s1;
        s1 = new student("K", "C" , 2020);
        System.out.println(s1.FN);
        System.out.println(s1.LN);
        System.out.println(s1.sid);
        System.out.println("-----------------------------------------------------------");

        student s2;
        s2 = new student();
        System.out.println(s2.FN);
        System.out.println(s2.LN);
        System.out.println(s2.sid);
        System.out.println("-----------------------------------------------------------");


        student s3;
        String FN = "Brian";
        String LN = "Ortega";
        int sid = 012333;
        s3 = new student(FN, LN, sid);
        System.out.println(s3.FN);
        System.out.println(s3.LN);
        System.out.println(s3.sid);
        System.out.println("-----------------------------------------------------------");

        //you can create overloaded constructors by varying 1). the parameter number. 2). Order
        student s4 = new student("Jack", "Carver");
        System.out.println(s4.FN);
        System.out.println(s4.LN);
        System.out.println(s4.sid);
        System.out.println("-----------------------------------------------------------");


        student s5 = new student( 2003, "Fish", "Joker");
        System.out.println(s5.FN);
        System.out.println(s5.LN);
        System.out.println(s5.sid);
        System.out.println("-----------------------------------------------------------");

        student s6 = new student();
        s6.FN = "Melanie";
        s6.setLN("Thomas");




    }


}
