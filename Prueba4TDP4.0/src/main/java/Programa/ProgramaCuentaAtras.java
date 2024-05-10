package Programa;

public class ProgramaCuentaAtras implements Programa {
    private int valor;
    private volatile boolean reverse = false;

    public ProgramaCuentaAtras(int valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void ejecutar() {
        while (!Main.stopRequested && valor >= 0) {
            if (!reverse) {
                System.out.println("Contando hacia abajo: " + valor--);
            } else {
                System.out.println("Reversión activada - Contando hacia arriba: " + valor++);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    @Override
    public boolean seDetendra() {
        return valor < 0;  // Se detiene cuando el valor es menor que 0 y no está en reversa
    }

    @Override
    public void reverse() {
        reverse = !reverse;
        System.out.println("Estado de reversión cambiado a: " + (reverse ? "hacia arriba" : "hacia abajo"));
    }

    @Override
    public boolean isReversed() {
        return reverse;
    }

    public int getValor() {
        return valor;  // Retorna el valor actual del contador
    }
}
