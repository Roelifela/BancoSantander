package br.com.digitalhouse;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente novoCliente, float novoSaldo) {
        super(novoCliente, novoSaldo);
    }

    @Override
    public void depositarDinheiro(float valorDeposito) {
        super.depositarDinheiro(valorDeposito);
    }

    @Override
    public void sacarDinheiro(float valorSaque) {
        super.sacarDinheiro(valorSaque);
    }

    public void recolherJuros(){

    }
}
