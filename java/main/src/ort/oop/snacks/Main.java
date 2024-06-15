package ort.oop.snacks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//studente
		Studente primoStudente = new Studente("Edoardo","Squillaci",20);
		
		System.out.println(primoStudente.datiCompleti());
		
		Studente secondoStudente = new Studente("Geeno","Squillaci",21);

		System.out.println(secondoStudente.datiCompleti());
		
		System.out.println("-------------------------------");

		
		
//conto Bancario
		ContoBancario primoConto = new ContoBancario(2000d, 200d, 100d);
		
		
		System.out.println("il tuo conto è il numero: " + primoConto.numeroDiConto);
		
		System.out.println("il tuo Saldo ammonta a: " + primoConto.saldo);

		System.out.println("Hai prelevato: " + primoConto.soldiPrelevati());

		System.out.println("Hai depositato: " + primoConto.soldiDepositati());

		System.out.println("Il tuo Saldo Attualmente ammonta a: " + primoConto.saldoCorrente());
		
		System.out.println("---------------------------------------");

		
		
		
		
ContoBancario secondoConto = new ContoBancario(9000d, 5000d, 465.99d);
		
		
		System.out.println("il tuo conto è il numero: " + secondoConto.numeroDiConto);
		
		System.out.println("il tuo Saldo ammonta a: " + secondoConto.saldo);

		System.out.println("Hai prelevato: " + secondoConto.soldiPrelevati());

		System.out.println("Hai depositato: " + secondoConto.soldiDepositati());

		System.out.println("Il tuo Saldo Attualmente ammonta a: " + secondoConto.saldoCorrente());

		System.out.println("---------------------------------------");

	}
	
	

}
