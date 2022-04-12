package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.*;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

}
