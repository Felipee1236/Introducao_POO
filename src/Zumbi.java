public class Zumbi {
    String nome;
    int vida;
    void mostrarVida(){
        System.out.println(vida);
    }
    boolean transfereVida(Zumbi zumbiAlvo, double valor){
        if(vida > valor){
            vida -= valor;
            zumbiAlvo.vida += valor;
            return true;
        }else{
            return false;
        }

    }

}
