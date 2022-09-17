import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Declaração de variáveis de tipo primitivo
        String nome;
        nome = "João";
        nome = "Maria"; // Reatribuição
        System.out.println("Hello " + nome);

        //Operadores artméticos

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        // Operadores lógicos

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || false = false

        String menssagem = fimDeSemana ? "É fim de semana!!" : "Não é fim de semana";

        System.out.println(menssagem);

        // Estruturas condicionais

        int nota = 70;
        String graduacao;

        if (nota >= 70) {
            graduacao = "A";
        } else if (nota < 70 && nota > 60) {
            graduacao = "B";
        } else {
            graduacao = "C";
        }

        switch (graduacao) {
            case "A":
                System.out.println("Aluno aprovado!");
                break;
            case "B":
                System.out.println("Aluno em recuperação!");
                break;
            case "C":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Graduação inválida!");
        }

        // Manipulação de Strings e datas

        String name = "Larissa";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String anotherName = "leonardo";
        System.out.println(name.equals(anotherName));
        System.out.println(name.equalsIgnoreCase(anotherName));

        // Data pela ISO 8601

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale( "pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora = LocalDateTime.now();
        String saudacao = "";

        if (agora.getHour() >= 0) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s.%n", name, diaSemana, saudacao.toUpperCase());


    }

}