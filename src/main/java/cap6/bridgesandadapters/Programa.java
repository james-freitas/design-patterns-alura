package cap6.bridgesandadapters;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		// regra de negocio
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
		
		// ...
		
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();
		
		
		
	}
	
}
