package EmpTipos;

public class No <T> {
    private T valor;
    private No <T> prox;
    public No(T valor) {
        this.valor = valor;
        prox = null;
    }

    public void setProx(No <T> prox) {
        this.prox = prox;
    }

    public No <T> getProx() {
        return prox;
    }

    public String toString() {
        return "" + valor;
    }
}
