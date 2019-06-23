package exercicioheranca;

/**
 *
 * @author claudinei
 */
public final class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(double valorProducao, double comissao, int codigoSetor, double salarioBase, double imposto, String nome, String telefone, String endereco) throws Exception {
        super(codigoSetor, salarioBase, imposto, nome, telefone, endereco);
        this.setValorProducao(valorProducao);
        this.setPercentualComissao(comissao);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) throws Exception {
        if (comissao >= 0) {
            this.valorProducao += valorProducao;
        } else {
            throw new Exception("Valor da produção é inválido");
        }
    }

    public double getComissao() {

        return this.valorProducao * comissao;
    }

    public void setPercentualComissao(double comissao) throws Exception {
        if (comissao >= 0) {
            this.comissao = comissao / 100;
        } else {
            throw new Exception("Valor da comissão é inválido");
        }
    }

    @Override
    public double calcularSalario() {
        //Dúvida: acho que o imposto seria calculado sobre salario base + comissão
        return this.getSalarioBase() + this.getComissao() - super.getImposto();
    }

    @Override
    public String toString() {
        return "Operario:\n" + "valorProducao=" + valorProducao + "\ncomissao=" + comissao;
    }

}
