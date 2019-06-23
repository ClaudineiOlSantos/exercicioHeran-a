package exercicioheranca;

/**
 *
 * @author claudinei
 */
public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(int codigoSetor, double salarioBase, double imposto, String nome, String telefone, String endereco) throws Exception {
        super(nome, telefone, endereco);
        this.setCodigoSetor(codigoSetor);
        this.salarioBase = salarioBase;
        this.setImposto(imposto);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public final void setCodigoSetor(int codigoSetor) throws Exception {
        if (codigoSetor >= 0) {
            this.codigoSetor = codigoSetor;
        } else {
            throw new Exception("Valor inválido");
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return this.salarioBase * imposto;
    }

    public final void setImposto(double imposto) throws Exception {
        if (imposto >= 0) {
            this.imposto = imposto / 100;
        } else {
            throw new Exception("Valor inválido");

        }
    }

    public void aumentarSalario(double valor) throws Exception {
        if (valor >= 0) {
            this.salarioBase += valor;
        } else {
            throw new Exception("Valor do salário é inválido");
        }
    }

    public void aumentarSalarioPercentual(double percentual) throws Exception {
        if (percentual >= 0) {
            this.salarioBase += this.salarioBase * (percentual / 100);
        } else {
            throw new Exception("Percentual é inválido");
        }
    }

    public double calcularSalario() {
        return this.salarioBase - getImposto();
    }

    @Override
    public String toString() {
        return super.toString() + "\ncodigoSetor=" + codigoSetor + "\nsalarioBase=" + salarioBase + "\nimposto=" + imposto;
    }

}
