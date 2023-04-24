import java.util.Calendar;

public class Mensal {
    public static void main(String[] args) {
        int mes = Calendar.MONTH + 1;

        System.out.print("Estamos no mês de ");
        switch (mes) {
            case 0:
                System.out.println("JANEIRO");
                break;
            case 1:
                System.out.println("FEVEREIRO");
                break;
            case 2:
                System.out.println("MARÇO");
                break;
            case 3:
                System.out.println("ABRIL");
                break;
            case 4:
                System.out.println("MAIO");
                break;
            case 5:
                System.out.println("JUNHO");
                break;
            case 6:
                System.out.println("JULHO");
                break;
            case 7:
                System.out.println("AGOSTO");
                break;
            case 8:
                System.out.println("SETEMBRO");
                break;
            case 9:
                System.out.println("OUTUBRO");
                break;
            case 10:
                System.out.println("NOVEMBRO");
                break;
            case 11:
                System.out.println("DEZEMBRO");
                break;
        }

        System.out.println("");
    }
}