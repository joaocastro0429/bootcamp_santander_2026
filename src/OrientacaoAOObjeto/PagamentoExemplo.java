package OrientacaoAOObjeto;

abstract class FormaPagamento {
    protected double valor;

    public FormaPagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();

    public void confirmar() {
        System.out.println("Pagamento de R$ " + valor + " confirmado.");
    }
}

class Pix extends FormaPagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix.");
    }
}

class CartaoCredito extends FormaPagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartão de crédito.");
    }
}

class Boleto extends FormaPagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando boleto bancário.");
    }
}
