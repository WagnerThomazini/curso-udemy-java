package ExercicioPoo01;

public class Student {
    String name;
    double n1;
    double n2;
    double n3;

    public double media() {
        return n1 + n2 + n3 ;
    }

    public void passOrFailed() {
        if (media() > 60) {
            System.out.printf("FINAL GRADE = %.2f%n", media());
            System.out.println("PASS");
        } else {
            double diferenca = 60 - media();
            System.out.printf("FINAL GRADE = %.2f%n", media());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", diferenca);
        }
    }
}



