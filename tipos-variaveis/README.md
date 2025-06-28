📚 Estudo: Tipos de Dados e Strings em Java

Um projeto simples para demonstrar os conceitos fundamentais dos tipos de dados primitivos e da manipulação de String na linguagem Java. Ideal para consulta rápida e para quem está iniciando os estudos.

Status do Projeto: ✅ Concluído

✨ Conceitos Abordados
1. Tipos de Dados Primitivos

A tabela abaixo resume os tipos primitivos utilizados no código, com seus respectivos tamanhos e finalidades.

Tipo	Tamanho (bits)	Descrição	Exemplo no Código
:---	:---:	:---	:---
byte	8	Armazena números inteiros pequenos.	byte idade = 25;
short	16	Armazena números inteiros curtos.	short ano = 2000;
int	32	Padrão para números inteiros.	int salario = 2500;
long	64	Para números inteiros muito longos (sufixo L).	long pop = 215000000L;
float	32	Para números decimais (sufixo f).	float temp = 36.5f;
double	64	Padrão para decimais com alta precisão.	double altura = 1.68;
char	16	Armazena um único caractere Unicode (aspas simples).	char genero = 'M';
boolean	1	Armazena valores lógicos: true ou false.	boolean brasileiro = true;

Conversão de Tipos (Casting): O código também demonstra como forçar a conversão de um tipo maior para um menor, como (int) 3.14, que resulta em 3.

2. Manipulação de Strings

A classe String é essencial para trabalhar com textos. O projeto demonstra as seguintes operações:

🤝 Concatenação: Junção de strings usando o operador +.
📏 length(): Retorna o número de caracteres da string.
🔄 toUpperCase() / toLowerCase(): Converte a string para maiúsculas ou minúsculas.
🔍 equals() / equalsIgnoreCase(): Compara o conteúdo de duas strings. Essencial para evitar o uso de ==.

🔎 contains(): Verifica se uma sequência de caracteres existe dentro da string.

✂️ substring(): Extrai um pedaço da string.
✨ trim(): Remove espaços em branco do início e do fim.
🏁 startsWith(): Verifica se a string começa com um determinado prefixo.
🚀 Como Executar
Pré-requisitos
É necessário ter o JDK (Java Development Kit) instalado e configurado no seu sistema.
Passos
Clone o repositório:

    git clone <URL_DO_SEU_REPOSITORIO>

Navegue até a pasta do projeto e compile o arquivo .java:

    cd <NOME_DA_PASTA>
    javac TiposVariaveis.java

Execute o programa:

    java TiposVariaveis

📥 Saída Esperada

A execução do código produzirá o seguinte resultado no terminal:

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
