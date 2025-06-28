public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        byte idade = 25; // tamanho na memória de 8 bits usado para numeros inteiros pequenos de -128 a
                         // 127
        short anoNascimento = 2000; // tamanho na memória de 16 bits usado para numeros inteiros curtos de -32.768 a
                                    // 32.767
        int salario = 2500; // tamanho na memória de 32 bits o tipo padrão mais usado
        long populacao = 215000000L; // tamanho na memória de 64 bits é um inteiro mais longo e usa um L no final da
                                     // atribuição

        float temperatura = 36.5f; // tamanho na memória de 32 bits usado para números decimais e usa o f no final
                                   // da atribuição
        double altura = 1.68; // tamanho na memória de 64 bits usado para ter um decimal com mais precisão

        char genero = 'M'; // tamanho na memória de 16 bits geralmente usado para um unico caractere
                           // Unicode
        boolean brasileiro = true; // tamanho na memória de 1 bit tem como output um valor falso ou verdadeiro.

        // int para números inteiros em geral.
        // double para decimais, a menos que precise economizar memória (use float)
        // char é sempre declarado com aspas simples 'A'
        // boolean aceita apenas true ou false

        // CONVERSÕES
        // De tipos menores para maiores: automático (ex: int -> long).
        // De tipos maiores para menores: explícita, com casting:
        int teste = (int) 3.14;

        System.out.println("Casting, transformando número float em inteiro antes era 3.14 agora é: " + teste);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Salário: " + salario);
        System.out.println("População: " + populacao);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + genero);
        System.out.println("É brasileiro? " + brasileiro);

        // String, usado para armazenar palavras, frases, nomes, senha, comandos...
        // praticamente tudo que é texto, sempre em aspas duplas. String nome =
        // "LuanZra"

        String sobrenome = "Rodrigues";
        String curso = "Dio Java Developer";

        // Principais operações com String:

        // Concatenar (juntar) Strings

        String nome = "Luan";
        String saudacao = "Olá, " + nome + " " + sobrenome + "!";
        System.out.println(saudacao);

        // Tamanho da string

        String texto = "Back-end Java";
        int tamanho = texto.length();

        // Transforma maiúscula/minúscula

        texto.toUpperCase();
        texto.toLowerCase();

        // Comparar Strings

        String a = "java";
        String b = "Java";

        a.equals(b);
        a.equalsIgnoreCase(b);

        // Não usar "==" para comparar strings! Isso compara endereço de memória, não o
        // conteúdo

        // Ver se contém algo na String
        String frase = "Eu estou aprendendo Java";
        boolean temJava = frase.contains("Java");

        // Pegar parte da string
        String fraseDiferente = "Olá mundo!";
        String parte = frase.substring(4);
        String trecho = frase.substring(0, 3);

        // Remover espaços
        String nomeSujo = "  Luan  ";
        String nomeLimpo = nomeSujo.trim();

        // Exemplo prático:

        String nomeCompleto = "Luan Rodrigues";
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Seu nome tem " + nomeCompleto.length() + " caracteres!");
        System.out.println("Em maiúscula: " + nomeCompleto.toUpperCase());
        System.out.println("Começa com 'Luan'? " + nomeCompleto.startsWith("Luan"));
        System.out.println("Contém 'Rod'? " + nomeCompleto.contains("Rod"));
    }
}
