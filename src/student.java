public class student {



    String FN;
    String LN;
    int sid;

    student(){
        FN = "N/A";
        LN = "N/A";
        sid = 0;

    }

    student( String FN, String LN, int sid){


        this.FN = "K";
        this.LN = "C";
        this.sid = 2020;



    }


    public static void main(String[] args){

        student s1;
        student s2;
        s1 = new student("K", "C" , 2020);
        s2 = new student();

        System.out.println(s1.FN);
        System.out.println(s2.FN);



    }


}
