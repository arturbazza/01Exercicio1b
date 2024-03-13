public class ContaBancaria {
    private double saldo;
    private double limiteSaque;
    private double saldoMinimo;

    public ContaBancaria(double saldoInicial, double limiteSaque, double saldoMinimo) {
        this.saldo = saldoInicial;
        this.limiteSaque = limiteSaque;
        this.saldoMinimo = saldoMinimo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > limiteSaque || saldo - valor < saldoMinimo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}
