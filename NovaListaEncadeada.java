public class NovaListaEncadeada{
    public static class No{
        public int valor;
        public No proximo;

        public No(int valor){
            this.valor = valor;
        }
    }


   public No inicio; //lista criada (sem valor)

    
   //Adiciona um nó no final da lista
   //
   public void add(int valor){ //void porque não retorna valores
        
        //Criar o nó
        No novo = new No(valor); //novo elemento
        
        //Encontrar o último
        if (inicio == null) {

            inicio = novo;
            
        }
        else{
            No ultimo = inicio;
            while (ultimo.proximo != null) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novo;
        }
        
        
    }

    public void ExibirLista(){ //método para exibir a lista enquanto o prox não for nulo
        No atual = inicio;

        while (atual != null) {
            
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

   public static void main(String[] args) {
    NovaListaEncadeada lista = new NovaListaEncadeada(); //lista aponta para o nada
    lista.add(1);
    lista.add(2);
    lista.add(3); 

    lista.ExibirLista();
  }

}

  