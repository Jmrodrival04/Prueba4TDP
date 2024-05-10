package Programa;

public class ProgramaCuentaArriba implements Programa {
    private int valor;
    private volatile boolean reverse = false;

    public ProgramaCuentaArriba(int valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void ejecutar() {
        while (true) {  // Este programa cuenta hacia arriba indefinidamente
            if (!reverse) {
                System.out.println("Contando hacia arriba: " + valor++);
            } else {
                if (valor > 0) {
                    System.out.println("Reversión activada - Contando hacia abajo: " + valor--);
                } else {
                    System.out.println("El valor ha alcanzado 0 y no puede disminuir más.");
                }
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
        return false;  // Este programa no se detiene por sí solo
    }

    @Override
    public void reverse() {
        reverse = !reverse;
        System.out.println("Estado de reversión cambiado a: " + (reverse ? "hacia abajo" : "hacia arriba"));
    }

    @Override
    public boolean isReversed() {
        return reverse;
    }

    public int getValor() {
        return valor;  // Retorna el valor actual del contador
    }
}
