package OrientacaoAOObjeto.Exercicios;

public class ContaBancaria {
    private String numeroDaConta;
    private String titular;
    private double saldo;

    // Construtor (sem void!)
    public ContaBancaria(String numeroDaConta, String titular, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getters (sem setters para numero e titular)
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    // Getter e Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Erro: Saldo não pode ser negativo!");
        } else {
            this.saldo = saldo;
        }
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de depósito deve ser positivo!");
        } else {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }
    }

    // Método sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque deve ser positivo!");
        } else if (valor > this.saldo) {
            System.out.println("Erro: Saldo insuficiente! Saldo atual: R$ " + this.saldo);
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }

    // Método exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }
}