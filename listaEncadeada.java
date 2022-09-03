public class listaEncadeada{

    public int valor;
    public listaEncadeada prox; //referencia ao prox elemento da lista

    public listaEncadeada(int valor){
        this.valor = valor;
    
    }

    public listaEncadeada adicionarNoInicio(int valor){

        listaEncadeada novo = new listaEncadeada(valor);

        novo.prox = this;

        return novo;

    }
    public static void main(String[] args) {
        listaEncadeada lista = new listaEncadeada(77);

        lista = lista.adicionarNoInicio(30);
        lista = lista.adicionarNoInicio(5);

        listaEncadeada atual = lista;
        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.prox;
        }

        

    }
}