package br.com.digitalhouse;

public abstract class Conta {

    private Cliente cliente;
    private float saldo;

    public Conta(Cliente novoCliente, float novoSaldo){

        cliente = novoCliente;
        saldo = novoSaldo;
    }

      public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(float valor){

        saldo = saldo + valor;

    }

    public void sacarDinheiro(float valorSaque){

        if valorSaque > getSaldo(){
            System.out.println("Saldo Insuficiente");
        }else{
            saldo = saldo - valorSaque;
            System.out.println("Novo Saldo: R$ " + saldo);
        }


    }


}
