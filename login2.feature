@login
Feature: login
 como usuario
 quero realizar o acessoa a página transferencia unica
 para acessar a conta
 
 Background: acessar a tela de transferencia unica
 Given dado que eu esteja logado e na tela de usar pontos

  @transferenciaunica
  Scenario: acesso valido
    
    And clicar em usar pontos
    And clicar em pontos viram dinheiro
    And clicar em transferencia unica
    And clicar quantos pontos deseja resgatar?
    And clicar em instituicao financeira
    And clicar em tipo de conta
    And preencher conta
    And preencher agencia 
    And preencher digito
    And clicar em salvar informacoes
    And clicar em continuar
    When clicar em enviar código
    Then código recebido com sucesso
    

   @transferenciarecorrente
  Scenario: acesso válido
    And clicar em usar pontos
    And clicar em pontos viram dinheiro
    And clicar em transferencia recorrente
    When clicar em ativar
    Then clicar em Ok entendi
