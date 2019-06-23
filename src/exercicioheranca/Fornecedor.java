package exercicioheranca;

/**
 *
 * @author claudinei
 */
public final class Fornecedor extends Pessoa {

    private double maxCredito;
    private double valordivida;

    public Fornecedor(double maxCredito, double valordivida, String nome, String telefone, String endereco) throws Exception {
        super(nome, telefone, endereco);
        this.setMaxCredito(maxCredito);
        this.setValordivida(valordivida);
    }

    public double getMaxCredito() {
        return maxCredito;
    }

    public void setMaxCredito(double maxCredito) throws Exception {
        if (maxCredito >= 0) {
            this.maxCredito = maxCredito;
        } else {
            throw new Exception("Valor do crédito é inválido");
        }
    }

    public double getValordivida() {
        return valordivida;
    }

    public void setValordivida(double valordivida) throws Exception {
        if (valordivida <= this.obterSaldoRestante()) {
            this.valordivida += valordivida;
        } else {
            throw new Exception("Limite de crédito já foi atingido");
        }
    }

    public double obterSaldoRestante() {
        return this.getMaxCredito() - this.getValordivida();
    }

    @Override
    public String toString() {
        return "Fornecedor:" + super.toString() + "\nmaxCredito=" + maxCredito + "\nvalordivida=" + valordivida;
    }

}
