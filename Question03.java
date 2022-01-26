package Lab04;

public class Question03 {
    public static void main(String[] args) {
        String name  = "Jameel ALi Bhutto";
        String Roll  = "K-20SW016";
        int total =600;
        int OOP = 87, OOP_Pr = 90, LAAG = 90, PS = 45, ITS = 87, PP = 80, Islamic = 45;
        System.out.println(name);
        System.out.println(Roll);
        System.out.println("Marks Obtained in Subjects");
        System.out.println("OOP Theory    : "+OOP);
        System.out.println("OOP Practical : "+OOP_Pr);
        System.out.println("LAAG Theory   : "+LAAG);
        System.out.println("Pakistan Study: "+PS);
        System.out.println("ITS Theory    : "+ITS);
        System.out.println("PP Theory     : "+PP);
        System.out.println("Islamic Study : "+Islamic);
        int Obtained = OOP+OOP_Pr+LAAG+PP+PS+ITS+Islamic;
        System.out.println("Marks Obtained: "+Obtained+"/"+total);
        double Percentage = (Obtained*100)/total;
        System.out.println("Percentage    : "+Percentage);
        if (Percentage<50){
            System.out.println("CGPA      : Fail");
        }if (Percentage<60 && Percentage>=50){
            System.out.println("CGPA      : C+");
        }if (Percentage<70 && Percentage>=60){
            System.out.println("CGPA      : B");
        }if (Percentage<80 && Percentage>=70){
            System.out.println("CGPA      : B+");
        }if (Percentage<90 && Percentage>=80){
            System.out.println("CGPA      : A");
        }if (Percentage<=100 && Percentage>=90){
            System.out.println("CGPA      : A+");
        }
    }
}
