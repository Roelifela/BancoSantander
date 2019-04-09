package br.com.digitalhouse;

public class Cliente {

    public String numero;
    public String sobrenome;
    public String rgNumero;
    public String cpfNumero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRgNumero() {
        return rgNumero;
    }

    public void setRgNumero(String rgNumero) {
        this.rgNumero = rgNumero;
    }

    public String getCpfNumero() {
        return cpfNumero;
    }

    public void setCpfNumero(String cpfNumero) {
        this.cpfNumero = cpfNumero;
    }
}
