Exercício 1: Classe Produto
Crie uma classe Produto com os seguintes atributos privados:

nome (String)

preco (double)

quantidadeEstoque (int)

Requisitos:

Crie getters e setters para todos os atributos

O método setPreco não deve permitir valores negativos

O método setQuantidadeEstoque não deve permitir valores negativos

Crie um método chamado exibirInformacoes() que mostra na tela todos os dados do produto

Na classe principal (teste):

Crie um objeto da classe Produto

Defina valores para seus atributos

Exiba as informações do produto

🎯 Exercício 2: Classe ContaBancaria
Crie uma classe ContaBancaria com os seguintes atributos privados:

numeroConta (String)

titular (String)

saldo (double)

Requisitos:

Crie apenas getters para numeroConta e titular (não crie setters para esses)

Crie getter e setter para saldo (o setter não deve permitir saldo negativo)

Crie um método depositar(double valor) que aumenta o saldo (valor deve ser positivo)

Crie um método sacar(double valor) que diminui o saldo (não pode sacar mais que o saldo disponível)

Crie um método exibirSaldo() que mostra o saldo atual

Na classe principal (teste):

Crie uma conta com saldo inicial de R$ 1000

Faça um depósito de R$ 500

Faça um saque de R$ 200

Tente sacar um valor maior que o saldo

Exiba o saldo final

🎯 Exercício 3: Classe Aluno
Crie uma classe Aluno com os seguintes atributos privados:

nome (String)

nota1 (double)

nota2 (double)

nota3 (double)

Requisitos:

Crie getters e setters para todos os atributos

O método setNome não deve permitir nome vazio

Os métodos setNota1, setNota2 e setNota3 não devem permitir notas menores que 0 ou maiores que 10

Crie um método calcularMedia() que retorna a média das 3 notas

Crie um método verificarAprovacao() que retorna true se a média for maior ou igual a 7, e false caso contrário

Crie um método exibirSituacao() que mostra: nome, média e se está aprovado ou reprovado

Na classe principal (teste):

Crie um aluno com nome e 3 notas

Exiba a situação do aluno

Altere uma das notas e exiba a situação novamente

Bons estudos! 🚀

