Feature: Preencher o formulário "Enter Product Data".

Given: que esteja na tela inicial "http://sampleapp.tricentis.com/101/app.php"
When: preencher o campo "Start Date" com um valor válido,
And: preencher o campo "Insurance Sum [$]" com um valor válido",
And: preencher o campo "Merit Rating" com um valor válido,
And: preencher o campo "Damage Insurance" com um valor válido,
And: preencher o campo "Optional Products" com um valor válido,
And: preencher o campo "Courtesy Car" com um valor válido,
And: pressionar o botão "Next"
Then: o sistema deve direcionar para a aba "Select Price Option";
