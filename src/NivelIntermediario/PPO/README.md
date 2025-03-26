### Orientação a objeto - Java, Kotlin, Swift, Dart

Vamos explorar os três pilares fundamentais da Orientação a Objetos (OOP) em Java: Encapsulamento, Herança e
Polimorfismo, Esses conceitos são essenciais para criar código mais organizado, reutilizável e fácil de manter. Vou te
mostrar como cada um desses pilares funciona, com exemplos práticos em Java que utilizam personagens e elementos do
mundo de Naruto, para que você possa aplicar esses princípios em seus próprios projetos.

### Encapsulamento

O encapsulamento é o princípio de esconder os detalhes internos de um objeto e expor apenas o que é necessário. Em Java,
isso é feito usando modificadores de acesso como private, protected, e public. Vamos ver como isso funciona com um
exemplo de um personagem ninja.

```java
// Exemplo de Encapsulamento em Java com Naruto
public class Ninja {
    private String nome;
    private int nivelChakra;

    public Ninja(String nome, int nivelChakraInicial) {
        this.nome = nome;
        this.nivelChakra = nivelChakraInicial;
    }

    public void treinar(int horas) {
        if (horas > 0) {
            nivelChakra += horas * 10; // Cada hora de treino aumenta o chakra
        }
    }

    public int getNivelChakra() {
        return nivelChakra;
    }

    public String getNome() {
        return nome;
    }
}
```

### Herança

A herança permite que uma classe herde propriedades e métodos de outra classe. Isso promove a reutilização de código e a
criação de hierarquias de classes. Vamos usar um exemplo onde diferentes tipos de ninjas herdam de uma classe base.

```java
// Exemplo de Herança em Java com Naruto
class Ninja {
    private String nome;

    public Ninja(String nome) {
        this.nome = nome;
    }

    public void atacar() {
        System.out.println(nome + " realiza um ataque básico!");
    }

    public String getNome() {
        return nome;
    }
}

class NinjaDeTaijutsu extends Ninja {
    public NinjaDeTaijutsu(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " realiza um poderoso golpe de Taijutsu!");
    }
}

class NinjaDeNinjutsu extends Ninja {
    public NinjaDeNinjutsu(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança um Jutsu impressionante!");
    }
}
```

### Polimorfismo

O polimorfismo permite que uma classe seja usada como se fosse uma de suas subclasses. Isso facilita o uso de métodos e
objetos de forma intercambiável. Vamos ver como isso funciona no universo de Naruto, permitindo que diferentes tipos de
ninjas executem ataques de forma polimórfica.

```java
// Exemplo de Polimorfismo em Java com Naruto
public class CampoDeBatalha {
    public static void main(String[] args) {
        Ninja naruto = new NinjaDeNinjutsu("Naruto");
        Ninja rockLee = new NinjaDeTaijutsu("Rock Lee");

        realizarAtaque(naruto);  // Output: Naruto lança um Jutsu impressionante!
        realizarAtaque(rockLee); // Output: Rock Lee realiza um poderoso golpe de Taijutsu!
    }

    public static void realizarAtaque(Ninja ninja) {
        ninja.atacar(); // Método atacar é chamado de forma polimórfica
    }
}
```

### Links Úteis

- [Guia Oficial sobre Orientação a Objetos em Java](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
- [Tutorial sobre OOP na Baeldung](https://www.baeldung.com/java-oop)
