/**
 * Implementujte toto rozhranie
 */
public interface ZajacieUsi {

	/**
	 * Metoda vrati pocet usi zajacov
	 *
	 * @param pocetZajacov
	 * @return pocet usi
	 */
	public int zajacieUsi(int pocetZajacov);

}

class MojeUsi implements ZajacieUsi{

	@Override
	public int zajacieUsi(int pocetZajacov) {

		if (pocetZajacov == 0){
			return 0;
		}else if (pocetZajacov % 2 == 0){
			return 3 + zajacieUsi(pocetZajacov -1);
		}else{
			return 2 + zajacieUsi(pocetZajacov -1);
		}
		//(pocetZajacov % 2 != 0)
	}
}
