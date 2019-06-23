package exercicioheranca;

/**
 *
 * @author claudinei
 */
public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(double ajudaDeCusto, int codigoSetor, double salarioBase, double imposto, String nome, String telefone, String endereco) throws Exception {
        super(codigoSetor, salarioBase, imposto, nome, telefone, endereco);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) throws Exception {
        if (ajudaDeCusto > 0) {
            this.ajudaDeCusto = ajudaDeCusto;
        } else {
            throw new Exception("Valor da ajuda de custo é inválido");
        }
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + this.getAjudaDeCusto() - this.getImposto();
    }

    @Override
    public String toString() {
        return "Administrador:" + super.toString() + "\najudaDeCusto=" + ajudaDeCusto;
    }

}
