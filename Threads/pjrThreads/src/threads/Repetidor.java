package threads;

public class Repetidor extends Thread {
    private String mensagem;

    public Repetidor(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(mensagem);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}