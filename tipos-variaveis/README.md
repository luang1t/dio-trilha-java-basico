# 📚 Estudo: Tipos de Dados e Strings em Java

Este projeto simples demonstra os **conceitos fundamentais de tipos de dados primitivos** e a **manipulação da classe `String`** na linguagem Java. É ideal para estudantes iniciantes ou para consulta rápida.

> **Status do Projeto:** ✅ Concluído

---

## ✨ Conceitos Abordados

### 🔢 Tipos de Dados Primitivos

Abaixo, os tipos primitivos utilizados no código, com suas descrições e exemplos:

| Tipo     | Tamanho (bits) | Descrição                                                    |Exemplo                      |
|----------|----------------|--------------------------------------------------------------|-----------------------------|
| `byte`   | 8              | Armazena números inteiros pequenos (-128 a 127)              | `byte idade = 25;`          |
| `short`  | 16             | Armazena números inteiros curtos (-32.768 a 32.767)          | `short ano = 2000`          |
| `int`    | 32             | Inteiros padrão, mais usados                                 | `int salario = 2500`        |
| `long`   | 64             | Inteiros longos, com sufixo `L` no final                     | `long populacao = 2150000L` |
| `float`  | 32             | Números decimais com menor precisão, sufixo `f`              | `float temperatura = 36.5f` |
| `double` | 64             | Decimais com alta precisão                                   | `double altura = 1.68`      |
| `char`   | 16             | Um único caractere Unicode, com aspas simples                | `char genero = 'M'`         |
| `boolean`| 1              | Verdadeiro ou falso                                          | `boolean brasileiro = true` |

#### 🧠 Conversão de Tipos (Casting)
O código também mostra como forçar a conversão de tipos maiores para menores, por exemplo:
```java
int teste = (int) 3.14; // resultado: 3


📝 Manipulação de Strings
A classe String é essencial para trabalhar com texto em Java. O código cobre diversas operações básicas, como:

| Operação                 | Exemplo de Código                             | Descrição                               |
| ------------------------ | --------------------------------------------- | --------------------------------------- |
| Concatenar               | `"Olá, " + nome + "!"`                        | Junta strings com `+`                   |
| Comprimento (`length()`) | `texto.length()`                              | Retorna número de caracteres            |
| Maiúsculas/Minúsculas    | `texto.toUpperCase()` / `texto.toLowerCase()` | Converte o texto                        |
| Comparar conteúdo        | `a.equals(b)` / `equalsIgnoreCase()`          | Compara corretamente duas strings       |
| Verificar conteúdo       | `frase.contains("Java")`                      | Verifica se há um texto dentro de outro |
| Substring                | `frase.substring(0, 3)`                       | Retorna parte da string                 |
| Remover espaços          | `texto.trim()`                                | Remove espaços do início/fim            |
| Começa com               | `texto.startsWith("Luan")`                    | Verifica prefixo                        |


🚀 Como Executar

✔️ Pré-requisitos
Ter o Java JDK instalado e configurado no sistema.

🔧 Passos:

1. Clone o repositório:

    git clone <URL_DO_SEU_REPOSITORIO>

2. Acesse o diretório do projeto:

    cd <nome_da_pasta>

3. Compile o arquivo:

    javac TiposVariaveis.java

4. Execute o programa:

    java TiposVariaveis


📥 Saída Esperada

Ao rodar o programa, a saída será semelhante a:

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


🤝 Contribuição
Este projeto é educacional, mas sinta-se à vontade para sugerir melhorias ou adicionar novos exemplos com String, arrays ou outros conceitos Java.


