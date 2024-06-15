package ort.oop.snacks;

import java.util.Random;

//Crea una classe ContoBancario con attributi per numero di conto e saldo. 
//Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
//Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

public class ContoBancario {

	int numeroDiConto;
	
	double saldo;
	
	double saldoCorrente;
	
	double prelievo;
	
	double deposito;
	
	
	//costruttore
	public ContoBancario(double saldo, double prelievo, double deposito) {
	
	int minNumeroConto=111;
	int maxNumeroConto=999;
	
		
	Random numeroContoRandom= new Random();
		
	this.numeroDiConto = numeroContoRandom.nextInt(maxNumeroConto-minNumeroConto);
	
	this.saldo = saldo;
	
	this.saldoCorrente = saldoCorrente;
	
	this.prelievo= prelievo;
	
	this.deposito= deposito;
		
	}
	
	
	//metodi

	double soldiPrelevati() {
		
    double soldiPrelevati = prelievo;	
			
    return soldiPrelevati;	
			
		}
 
 
 
    double soldiDepositati() {
	 
    double soldiDepositati = deposito;
  
    return soldiDepositati;
 }
 
//metodo per verificare il saldo corrente
    
	double saldoCorrente() {
		
	double saldoCorrente = deposito - prelievo + saldo;
	return saldoCorrente;
		
	}
 
}
