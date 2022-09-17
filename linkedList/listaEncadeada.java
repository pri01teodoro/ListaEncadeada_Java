package linkedList;

public class listaEncadeada {
    public static class No {
        /** Valor salvo neste nó */
        public int valor;
        /** Referência ao próximo */
        public No proximo;

        public No(int valor) {
            this.valor= valor;
        }
    }

    public No inicio;
    

    public int getLast(){
        No atual = inicio;
        while (true){
            if(atual.proximo == null)
                break;

            atual = atual.proximo;
        }
        return atual.valor;
        
    }
    /**
     * Método principal, usado aqui para testar a minha implementação da ListaEncadeada
     */
    public static void main(String[] args) {
        No no1 = new No(20);
        no1.getLast();
    }
}


