package exercicioheranca;

/**
 *
 * @author claudinei
 */
public final class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(double valorVendas, double comissão, int codigoSetor, double salarioBase, double imposto, String nome, String telefone, String endereco) throws Exception {
        super(codigoSetor, salarioBase, imposto, nome, telefone, endereco);
        this.setValorVendas(valorVendas);
        this.setPercentualComissao(comissão);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) throws Exception {
        if (valorVendas >= 0) {
            this.valorVendas += valorVendas;
        } else {
            throw new Exception("Valor de vendas é inválido");
        }
    }

    public double getComissao() {
        return this.valorVendas * comissao;
    }

    public void setPercentualComissao(double comissão) throws Exception {
        if (valorVendas >= 0) {
            this.comissao = comissão / 100;
        } else {
            throw new Exception("Valor do percentual de comissão é inválido");
        }
    }

    @Override
    public double calcularSalario() {
        //Dúvida: acho que o imposto seria calculado sobre salario base + comissão
        return super.getSalarioBase() + getComissao() - super.getImposto();
    }

    @Override
    public String toString() {
        return "Vendedor:\n" + super.toString() + "\nvalorVendas=" + valorVendas + "\ncomissao=" + comissao;
    }

}
