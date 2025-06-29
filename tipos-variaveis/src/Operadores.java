public class Operadores {
    public static void main(String[] args) {

        // CONCATENAÇÃO
        String nomeCompleto = "Luan " + "Rodrigues";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // TRANSFORMAR UM NUMERO EM POSITIVO OU NEATIVO USANDO ELE MESMO E OPERAÇÕES
        // MATEMÁTICAS.
        int numero = 10;

        System.out.println(numero);

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        // INCREMENTAÇÃO

        int variavel = 5;
        System.out.println(variavel);

        System.out.println(++variavel);// Se o ++ estiver depois do nome da variavel no () ele vai printar somente o
                                       // valor sem incrementação, mas se ele estiver antes da variavel no () como está
                                       // acima ele faz primeiro a operação depois a atribuição.

        System.out.println(variavel--);
        System.out.println(variavel);

        // A prova na forma negativa, como o -- está depois ele primeiro printa o valor
        // da variavel e depois faz a operação e no segundo print ele ja faz o print com
        // o novo
        // valor atribuido.

        boolean constante = true;

        System.out.println(!constante);

        constante = !constante;

        System.out.println(constante);

        // Aqui mudamos a constante booleana de true para falso atravês de uma
        // atribuição com uma negação usando o símbolo "!" antes do nome da variavel.

        // Uso do operador ternário.

        int a, b;

        a = 6;
        b = 6;

        String resultado = "";

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        // Usando o ternário

        String resultadoTernario = a == b ? "verdadeiro" : "falso"; // Conseguimos identificar que o "?" seria o "if" e
                                                                    // o ":" o else. Levando em consideração tbm que a
                                                                    // primeira expressão sempre vai ser booleana, ou
                                                                    // seja, vai retornar um verdadeiro ou falso.
        System.out.println(resultadoTernario);

        // Usando Relacionais

        String nomeUm = "Luan";
        String nomeDois = new String("Luan");

        System.out.println(nomeUm.equals(nomeDois));// Para objetos é bom usar o .equals

        int numero01 = 1;
        int numero02 = 2;

        boolean simNao = numero01 == numero02;

        if (numero01 < numero02) {
            System.out.println("a nossa condição é verdadeira.");
        } else
            System.out.println("a nossa condição é falsa.");

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero01 != numero02;
        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = numero01 > numero02;
        System.out.println("numeroUm é maior que o numeroDois?" + simNao);

        simNao = numero01 < numero02;
        System.out.println("numeroUm é menor que o numeroDois?" + simNao);

        // Operadores lógicos

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) { // Se as duas forem verdadeiras
            System.out.println("As duas condições são verdadeiras");
        } else
            System.out.println("Uma delas ou as duas são falsas!");
        if (condicao1 || condicao2) { // Se uma das duas for verdadeira ou se as duas forem verdadeiras
            System.out.println("Uma das duas é verdadeira");
        } else
            System.out.println("As duas são falsas!");

    }
}