public class AntigaListaEncadeada{

    public int valor;
    public AntigaListaEncadeada prox; //referencia ao prox elemento da lista

    public AntigaListaEncadeada(int valor){
        this.valor = valor;
    
    }

    public AntigaListaEncadeada adicionarNaLista(int valor){

        AntigaListaEncadeada novo = new AntigaListaEncadeada(valor);

        novo.prox = this;

        return novo;

    }
    public static void main(String[] args) {
        AntigaListaEncadeada lista = new AntigaListaEncadeada(77);

        lista = lista.adicionarNaLista(15);
        lista = lista.adicionarNaLista(10);
        lista = lista.adicionarNaLista(25);
        lista = lista.adicionarNaLista(30);
        lista = lista.adicionarNaLista(48);

        AntigaListaEncadeada atual = lista;
        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.prox;
        }

        

    }
}