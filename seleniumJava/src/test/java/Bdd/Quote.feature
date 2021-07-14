Feature: Preencher o formulário "Select Price Optiona".

Given: que esteja na tela inicial "http://sampleapp.tricentis.com/101/app.php"
When: preencher o campo "E-Mail" com um valor válido,
And: preencher o campo "Phone" com um valor válido",
And: preencher o campo "Username" com um valor válido,
And: preencher o campo "Password" com um valor válido,
And: preencher o campo "Confirm Password" com um valor válido,
And: preencher o campo "Comments" com um valor válido,
Then: deve trazer mensagem de sucesso "Sending e-mail success!";
