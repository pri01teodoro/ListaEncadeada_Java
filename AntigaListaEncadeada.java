public class AntigaListaEncadeada{

    public int num;
    public AntigaListaEncadeada prox; //referencia ao prox elemento da lista

    //construtor
    public AntigaListaEncadeada(int num){
        this.num = num;
    
    }

    public AntigaListaEncadeada inicio;

    public void addLista(int num){

        AntigaListaEncadeada novo = new AntigaListaEncadeada(num);

        if(inicio == null){

            inicio = novo;

        }else{
            AntigaListaEncadeada ultimo = inicio;
            while (ultimo.prox != null) {
                ultimo = ultimo.prox;
                
            }
            ultimo.prox = novo;
        }
    }

    public void exibir() {
        AntigaListaEncadeada atual = inicio;
        while (atual != null) {
            System.out.println(atual.num);
            atual = atual.prox;
        }
    }
    public static void main(String[] args) {
        AntigaListaEncadeada lista = new AntigaListaEncadeada(77);

        lista.addLista(15);
        lista.addLista(10);
        lista.addLista(25);
        lista.addLista(30);
        lista.addLista(48);
        
        lista.exibir();
        

        
       
        

    }
}