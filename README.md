# Atividade de Java - 3º Período

Repositório com as questões práticas e teóricas da disciplina de Java.

## Questões práticas
- Questão 1: Media.java - cálculo de média ponderada
- Questão 2: Multiplo.java - verificação de múltiplos de 3 e 5
- Questão 3: Primo.java - números primos entre 2 e N
- Questão 4: Asteriscos.java - impressão de asteriscos

## Questão teórica 5

O Scanner é uma classe do Java que usa pra ler o que o usuário digita no console. Pra usar, primeiro importa com `import java.util.Scanner;`, depois cria um objeto Scanner passando o `System.in`, que é a entrada do teclado.

```java
Scanner scanner = new Scanner(System.in);
double nota = scanner.nextDouble();
```

O `nextDouble()` lê um número decimal digitado e guarda numa variável double.

Já o `System.out.printf` serve pra formatar como o número vai aparecer na tela, tipo quantas casas decimais mostrar. Usa um `%` seguido de código, tipo `%.2f` que mostra o número com 2 casas depois da vírgula.

```java
System.out.printf("Nota: %.2f%n", nota);
```

O `%n` no final serve só pra pular linha depois de imprimir.

## Questão teórica 6

O código tinha 3 erros:

1. Faltou os colchetes no `main`. Tava `String args`, mas o certo é `String[] args`, porque o main recebe um array de strings, não uma string só. Sem isso o Java nem reconhece o método main.

2. Faltou ponto e vírgula depois do `System.out.println("Contador: " + contador)`. Toda linha de comando em Java precisa terminar com `;`.

3. O `contador` nunca mudava dentro do while. Como a condição era `contador <= 5` e ele sempre valia 0, o programa ficava rodando pra sempre (loop infinito).

Código corrigido:

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

O que eu adicionei foi o `contador++;` dentro do while, assim ele vai aumentando até passar de 5 e o loop parar.
