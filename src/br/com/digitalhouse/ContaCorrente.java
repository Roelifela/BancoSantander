package br.com.digitalhouse;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente novoCliente, float novoSaldo) {
        super(novoCliente, novoSaldo);
    }

    @Override
    public void depositarDinheiro(float valor) {
        super.depositarDinheiro(valor);
    }

    @Override
    public void sacarDinheiro(float valorSaque) {
        super.sacarDinheiro(valorSaque);
    }

    public void depositarCheque(){

    }

}
