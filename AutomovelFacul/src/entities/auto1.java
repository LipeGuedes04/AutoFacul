package entities;

public class auto1 {

	public int tipo;
	public String modelo;
	public String cor;
	public double massa;

	public int portas;
	public int rodas;

	public String tipo() {

		if (tipo == 1) {
			return "Automóveis";
		}
		if (tipo == 2) {
			return "Moto";
		}
		return "Tipo inválido";
	}

	public String toString() {
		String info = "Tipo: " + tipo() +
					  "\nModelo: " + modelo + 
					  "\nCor: " + cor + 
					  "\nMassa: " + String.format("%.2f", massa);

		if (tipo == 1) {
			info += "\nPortas: " + portas;
		}

		if (tipo == 2) {
			info += "\nRodas: " + rodas;
		}

		return info;
	}
}