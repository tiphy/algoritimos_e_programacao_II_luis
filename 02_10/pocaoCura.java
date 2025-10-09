public class pocaoCura extends itemMagico {
    
    //atributo especifico da subclasse
    private int pontosCura;

    //costrutor que vai chamar o construtor da super classe 
    public pocaoCura(String nome, double peso, int pontosCura){
        super(nome, peso);
        this.pontosCura = pontosCura;
    }

    @Override
    public void usar(){
        System.out.println("\n***Item: " + nome + " ***");
        System.out.println("A poção foi bebida...");
        System.out.println("Efeito: O herói recupera " + pontosCura + " de vida!!!");
    }

    public int getPontosCura() {
        return pontosCura;
    }

    public void setPontosCura(int pontosCura) {
        this.pontosCura = pontosCura;
    }
    
    
}
