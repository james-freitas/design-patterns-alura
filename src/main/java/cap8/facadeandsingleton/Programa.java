package cap8.facadeandsingleton;

public class Programa {

	public static void main(String[] args) {
		
		EmpresaFacade facade = new EmpresaFacade();
		String cpf = "0";
		facade.buscaCliente(cpf);
		Cliente cliente = new Cliente();
		double valor = 0;
		facade.criaFatura(cliente, valor);
		
		
	}
	
}
