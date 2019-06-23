package exercicioheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author claudinei
 */
public class ExercicioHeranca {

    public static void main(String[] args) {

        try {
            /**
             * Teste classe Fornecedor
             */
            System.out.println("\n");
            Fornecedor fornecedor = new Fornecedor(20000, 0, "Matias josé", "37998502122", "Avenida vasconcelos 3202 centro para de minas");
            fornecedor.setValordivida(5000);
            fornecedor.setValordivida(5000);
            fornecedor.setValordivida(5000);
            fornecedor.setValordivida(4000);

            System.out.println(fornecedor);
            System.out.println("O saldo restante é:" + fornecedor.obterSaldoRestante());;

            /**
             * Teste classe empregado
             */
            System.out.println("\n");
            Empregado empregado = new Empregado(1, 1000, 8, "Claudinei", "37998183044", "Rua panamá 42 centro igaratinga");
            empregado.aumentarSalario(200);
            empregado.aumentarSalarioPercentual(10);
            System.out.println(empregado);
            System.out.println("Salário liquido é:R$" + empregado.calcularSalario());

            /**
             * Teste classe administrador
             */
            System.out.println("\n");
            Administrador administrador = new Administrador(500, 2, 1000, 8, "Fabio junior", "37998185057", "Rua panamá 42 centro Igaratinga");
            System.out.println(administrador);
            System.out.println("Salário liquido é:" + administrador.calcularSalario());

            /**
             * Teste classe Operário
             */
            System.out.println("\n");
            Operario operario = new Operario(0, 2, 3, 1000, 8, "Elias Henrique", "37998185042", "Rua panamá 42 centro Igaratinga mg");
            operario.setValorProducao(15000);
            operario.setValorProducao(15000);
            operario.setValorProducao(15000);
            System.out.println(operario);
            System.out.println("Total de comissões:" + operario.getComissao());
            System.out.println("Total de impostos:" + operario.getImposto());
            System.out.println("Salário liquido é:" + operario.calcularSalario());

            /**
             * Teste classe Vendedor
             */
            System.out.println("\n");
            Vendedor vendedor = new Vendedor(0, 10, 4, 1000, 8, "Letícia Oliveira", "37998505152", "Rua panamá 42 centro igaratinga MG");
            vendedor.setValorVendas(1000);
            vendedor.setValorVendas(1000);
            vendedor.setValorVendas(1000);
            vendedor.setValorVendas(1000);
            System.out.println(vendedor);
            System.out.println("Total de comissões:" + vendedor.getComissao());
             System.out.println("Total de impostos:" + vendedor.getImposto());
            System.out.println("Salário liquido:" + vendedor.calcularSalario());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
