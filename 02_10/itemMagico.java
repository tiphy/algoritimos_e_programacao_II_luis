public abstract class itemMagico {

    //campos comuns a todos os itens, só sao acessados quem tem relacao de heranca com os itens
    protected String nome;
    protected double peso;
    

    //metodo construtor
    public itemMagico(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //metodo concreto -- o mesmo comportamento para todos os itens 
    public void exbibirDetalhes(){
        System.out.println("------Detalhes do Item-----");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
    }

    //metodo abstrato ' este é o coração do conceito'
    //ele nao possui implementação 
    public abstract void usar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
