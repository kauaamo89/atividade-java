# Atividade de Java - 3º Período ADS

Repositório com as questões práticas e teóricas da disciplina de Java.

## Questões práticas
- Questão 1: Media.java - cálculo de média ponderada
- Questão 2: Multiplo.java - verificação de múltiplos de 3 e 5
- Questão 3: Primo.java - números primos entre 2 e N
- Questão 4: Asteriscos.java - impressão de asteriscos

## Questão teórica 5

O `Scanner` é uma classe do pacote `java.util` usada para ler dados digitados pelo usuário no console. Para usá-la, é preciso importar com `import java.util.Scanner;` e criar um objeto passando `System.in`, que representa a entrada padrão (teclado):

```java
Scanner scanner = new Scanner(System.in);
double nota = scanner.nextDouble();
```

O método `nextDouble()` lê um número decimal digitado pelo usuário e guarda na variável.

Já o `System.out.printf` serve para formatar a saída de dados no console, permitindo controlar coisas como quantas casas decimais um número vai mostrar. Ele usa um texto com marcadores especiais (como `%.2f` para número decimal com 2 casas) e depois os valores que serão inseridos nesses marcadores:

```java
System.out.printf("Nota: %.2f%n", nota);
```

O `%.2f` indica que o valor será exibido como número decimal (float/double) com 2 casas depois da vírgula, e o `%n` pula linha ao final.

## Questão teórica 6

O código original tem três problemas:

1. **Assinatura errada do main:** `public static void main(String args)` está sem os colchetes. O correto é `String[] args`, pois o `main` recebe um vetor (array) de argumentos, não uma única String. Sem isso, o Java não reconhece o método como ponto de entrada do programa.

2. **Ponto e vírgula faltando:** a linha `System.out.println("Contador: " + contador)` não termina com `;`, o que gera erro de compilação.

3. **Loop infinito (erro de lógica):** dentro do `while`, o valor de `contador` nunca é alterado. Como a condição é `contador <= 5` e `contador` sempre vale 0, o laço nunca termina.

**Código corrigido:**

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```

A correção adiciona `contador++;` dentro do laço, garantindo que a variável aumente a cada repetição até ultrapassar 5 e o loop parar.
