package EmpTipos;

public class ListaEncadeada <T> {
    private No<T> inicio, fim;
    private int tamanho;

    public ListaEncadeada() {
        tamanho = 0;
        inicio = fim = null;
    }

    public void inserir(T v) {
        No<T> novo = new No<T>(v);
        if(fim == null) inicio = novo;
        else fim.setProx(novo);
        fim = novo;
        tamanho ++;
    }

    public void imprimir() {
        No<T> p = inicio;
        while(p != null) {
            System.out.println(p);
            p = p.getProx();
        }
    }
}
