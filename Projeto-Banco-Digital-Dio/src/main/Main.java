package main;

import java.util.Date;

import javax.swing.JOptionPane;

import client.Cliente;
import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		
		venilton.setNome(nome);
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Date data = new Date();

		String contacor = JOptionPane.showInputDialog("Digite o valor que quer depositar:");
		
		cc.depositar(Integer.valueOf(contacor));
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}


}
