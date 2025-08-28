package threads;

public class Principal {

    public static void main(String[] args) {
        Repetidor repetidor = new Repetidor("não paro de escrever");
        repetidor.start();
    }
}