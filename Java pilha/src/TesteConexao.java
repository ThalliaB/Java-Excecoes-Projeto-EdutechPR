
public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
		} catch (Exception ex) {
			System.out.println("Deu um erro na conexão");
		} finally {
			con.fecha();
		}
		
	}
	
}
