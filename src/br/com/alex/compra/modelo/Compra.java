package br.com.alex.compra.modelo;

public class Compra implements Comparable<Compra>{

    private double valor;
    private String descricao;

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + this.getDescricao() + "valor = " + this.getValor();
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.getValor()).compareTo(Double.valueOf(o.getValor()));
    }
}
