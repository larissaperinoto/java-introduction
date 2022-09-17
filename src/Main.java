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
    }

}