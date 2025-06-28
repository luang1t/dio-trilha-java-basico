Estudo de Tipos de Variáveis e Strings em Java

Este repositório contém um código Java simples (TiposVariaveis.java) criado para demonstrar os tipos de dados primitivos e as operações básicas com a classe String em Java. É um projeto de estudo ideal para iniciantes que estão aprendendo os fundamentos da linguagem.

🚀 Conteúdo Abordado

O código demonstra os seguintes conceitos fundamentais:

Tipos de Dados Primitivos
byte: Para números inteiros pequenos (-128 a 127).
short: Para números inteiros curtos (-32.768 a 32.767).
int: Tipo padrão para números inteiros.
long: Para números inteiros longos (requer o sufixo L).
float: Para números de ponto flutuante (requer o sufixo f).
double: Tipo padrão para números decimais com maior precisão.
char: Para um único caractere (usando aspas simples).
boolean: Para valores true ou false.
Conversão de Tipos (Casting)
Demonstração de como converter um tipo de dado maior para um menor de forma explícita (ex: double para int).
Classe String
Declaração e Concatenação: Criação e junção de strings.
length(): Obter o tamanho da string.
toUpperCase() e toLowerCase(): Converter para maiúsculas e minúsculas.
equals() e equalsIgnoreCase(): Comparar o conteúdo de strings (a forma correta, evitando o uso de ==).
contains(): Verificar se a string contém uma sequência de caracteres.
substring(): Extrair parte de uma string.
trim(): Remover espaços em branco no início e no fim.
startsWith(): Verificar se a string começa com um determinado prefixo.
💻 Como Executar
Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
Clone este repositório:
Bash
Copiar
    git clone <URL_DO_SEU_REPOSITORIO>

Navegue até o diretório onde o arquivo foi salvo.
Compile o arquivo Java:
Bash
Copiar
    javac TiposVariaveis.java

Execute o programa:
Bash
Copiar
    java TiposVariaveis

📋 Exemplo de Saída

Ao executar o programa, você verá a seguinte saída no console:

Casting, transformando número float em inteiro antes era 3.14 agora é: 3

Idade: 25

Ano de nascimento: 2000

Salário: 2500

População: 215000000

Temperatura: 36.5

Altura: 1.68

Gênero: M

É brasileiro? true

Olá, Luan Rodrigues!

Nome completo: Luan Rodrigues

Seu nome tem 14 caracteres!

Em maiúscula: LUAN RODRIGUES

Começa com 'Luan'? true

Contém 'Rod'? true
