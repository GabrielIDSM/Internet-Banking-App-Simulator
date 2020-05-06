# Aplicação de e-Banking em Java

![Screenshot principal](https://github.com/GabrielIDSM/eBaking-Interface/blob/master/Screenshots/CombPrincipal.png)

## Sobre o projeto

O objetivo do projeto é criar uma interface para uma aplicação de internet banking e implementar suas operações de maneira funcional. O projeto é capaz de criar e gerenciar novas contas, efetuar transações como transferências e pagamentos, fornecer uma interface diferenciada para empresas, oferecer a criação de poupanças e a criação de empréstimos.

## Contas

O Projeto possui um número restrito de contas incialmente, porém, esse número pode ser facilmente expandido. A aplicação possui uma interface personalizada de criação de contas em função do tipo: **Conta comum** ou **Conta empresa**.
Cada conta é representa por 6 dígitos, sendo o primeiro o dígito verificador. O dígito 0 representa uma Conta empresa, o dígito 1 representa uma Conta comum e o dígito 2 representa uma Conta administradora. **Não** é possível criar uma Conta administradora.

![Nova conta](https://github.com/GabrielIDSM/eBaking-Interface/blob/master/Screenshots/NovaConta.png)

### Contas existentes

![ContasExistentes](https://github.com/GabrielIDSM/eBaking-Interface/blob/master/Screenshots/ContasExistentes.png)

Existem 9 contas existentes na Aplicaçâo: 3 contas representam empresas fictícias, 4 contas representam pessoas fictícias, 1 conta representa o criador do projeto e 1 conta é uma administradora de contas.

|Contas comuns| 123456 | 123123 | 123321 | 121314 | 149065
|--------|--------|--------|--------|--------|-------
|Nome     |Gabriel Inácio|Guilherme Peçanha|Suzana Lima|Márcia Araújo|Leonardo Pereira
|Senha    |Gabriel24|Guilherme04|Suzana64|Marcia17|Leonardo90

|Contas empresariais| 000000 | 000001 | 000002
|---|---|---|---
|Empresa|Rio Jóias|Pães e Bolos|Rio Verde
|Senha|Joalheria|Padaria|Mercado

|Conta administradora|200000
|---|---
|Senha|ADM

## Funcionalidades

### Transferências

Qualquer tipo de conta pode efetuar uma tranferência, contanto que haja saldo suficiente para realizar a operação e que exista uma conta destino dentro da aplicação.
Toda transferência fica registrada nos **extratos** das contas, de quem faz e de quem recebe.

### Empréstimos

Qualquer conta pode realizar um empréstimo dentro do limite ofertado, o limite do empréstimo é definido por uma conta administradora. A tava de empréstimo é fixa e de **119,5% ao ano**. É possível parcelas em até 24 vezes.
Um novo empréstimo pode ser retirado após um empréstimo ser finalizado.

### Poupanças

Qualquer conta pode criar uma poupança, desde que o valor da poupança não supere o valor do saldo. Os tipos de poupanças são definidos em função do tempo em que o dinheiro ficará aplicado.
Resgatar uma poupança antes do prazo retorna, imediatamente, **85% dos rendimentos** atuais a conta.
É possível ter **inúmeras poupanças ativas**.

## Funcionalidades Exclusivas

### Gerenciar Funcionários

**Apenas contas empresariais** podem ter e gerenciar funcionários.
A Partir dessa interface é possível:
* Modificar o salário
* Alterar o dia de Pagamento
* Pagar funcionários
* Demitir funcionários
Só é possível pagar um funcionário se houver saldo suficiente na conta.

### Contratar Funcionário

**Apenas contas empresariais** podem contratar um funcionário.
Após fazer uma proposta, a pessoa pode aceitar ou recusar. Caso a pessoas aceite a proposta, esta passará a integrar o quadro de funcionários da empresa.
O dia de pagamento é definido a partir do momento em que o funcionário aceita a proposta.

### Sistema de Pagamento Automático

O Sistema de Pagamento Automático pode ser ativado ou desativado **apenas por contas empresariais**.
Quando ativado, os funcionários recebem seus salário às 00h do dia de pagamento definido.
O Pagamento só é realizado caso haja saldo suficiente.

### Gerenciar Emprego

**Apenas contas comuns** Podem gerenciar empregos.
Caso o usuário da conta não esteja empregado, esse poderá conferir ofertas de emprego. É aceitar ou recusar as propostas de emprego existentes.
Funcionários empregados não podem gerenciar ofertas de emprego. 

Caso o usuário esteja empregado, esse poderá conferir seu cargo atual ou pedir demissâo do cargo.

##Colaboradores e Contato


