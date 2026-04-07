# Fundamentos da Linguagem Java
Este conteúdo apresenta os conceitos fundamentais da linguagem Java, com foco na execução de programas, manipulação de dados e uso de operadores.

## Geração e execução de arquivos
- `.jar`: Arquivo executável gerado a partir da compilação do projeto
- `.zip`: Utilizado para exportar e compartilhar projetos
- Processo de build gera os arquivos na pasta `dist`
- Comando para execução:
```bash
 java -jar NomeDoPrograma.jar arg1 arg2
```

## Classe principal e método main
- Todo programa Java precisa de uma classe principal
- O método principal é o ponto de entrada da aplicação:
```java
public static void main(String[] args)
```
- Componentes do método:
  - `public`: acesso público
  - `static`: não precisa instanciar objeto
  - `void`: não retorna valor
  - `String[] args`: recebe argumentos

## Argumentos de linha de comando
- Permitem passar valores ao executar o programa
- Acessados via args[index]
- Exemplo:
```java
System.out.println(args[0]);
```

## Comentários
- Uma linha: `// comentário`
- Múltiplas linhas: `/* comentário */`

## Tipos de dados primitivos
- 8 bits: boolean, byte
- 16 bits: char, short
- 32 bits: int, float
- 64 bits: long, double

## Variáveis e constantes
- Variáveis podem ter valor alterado: `int idade = 10;`
- Constantes possuem valor fixo: `final int IDADE = 10;`

## Operadores aritméticos
- Adição: +
- Subtração: -
- Multiplicação: *
- Divisão: /
- Resto: %
- Incremento: ++
- Decremento: --

## String
- Representa texto (palavras ou frases)
- É uma classe em Java
- Facilita manipulação de caracteres

## Conversão de tipos
- Casting: `int x = (int) 3.5;`
- Métodos:
  - Integer.parseInt()
  - Float.parseFloat()
  - Double.parseDouble()
  - String.valueOf()

```java
public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 3;

    System.out.println("x=" + x);
    System.out.println("y=" + y);
    System.out.println("x/y=" + (x / y));
    System.out.println("resto=" + (x % y));

    double valor = 3.5;
    int convertido = (int) valor;

    System.out.println("convertido=" + convertido);
  }
}
```