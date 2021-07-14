# Author
# Date
# Description


Feature: Preencher o formulario Enter Insurant Data
 Scenario: Cadastrar com dados validos a aba Enter Insurant Data

	Given que esteja na tela inicial
	When: preencher o campo First Name com um valor valido
	And: preencher o campo Last Name com um valor valido"
	And: preencher o campo Date of Birth com um valor valido
	And: preencher o campo Gender com um valor valido
	And: preencher o campo Street Address com um valor valido
	And: preencher o campo Country com um valor valido
	And: preencher o campo Zip Code com um valor valido
	And: preencher o campo City com um valor valido
	And: preencher o campo Occupation com um valor valido
	And: preencher os checkbox do campo Hobbies com um valor valido
	And: preencher o campo Website com um valor valido
	And: preencher o campo Picture com uma imagem com extensao .jpg ou .img
	And: pressionar o botao "Next
	Then: o sistema deve direcionar para a aba Enter Product Data
