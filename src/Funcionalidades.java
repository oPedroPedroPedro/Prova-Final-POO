public interface Funcionalidades {
    
    public abstract void cadastrar(Produto produto); 
    public abstract void buscar(String codigoDoProduto);
    public abstract void listar();
    public abstract void relatorio(String data);
    public abstract void vender(String vendas, String data); 

}
