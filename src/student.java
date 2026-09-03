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
        s1 = new student("K", "C" , 2020);
        System.out.println(s1.FN);
        System.out.println(s1.LN);
        System.out.println(s1.sid);

        student s2;
        s2 = new student();
        System.out.println(s2.FN);
        System.out.println(s2.LN);
        System.out.println(s2.sid);


        student s3;
        String FN = "Brian";
        String LN = "Ortega";
        int sid = 012333;
        s3 = new student(FN, LN, sid);
        System.out.println(s3.FN);

    }


}
