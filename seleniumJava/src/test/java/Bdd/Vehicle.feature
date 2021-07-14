Feature: Preencher o formulário "Enter Vehicle Data".

Given: que esteja na tela inicial "http://sampleapp.tricentis.com/101/app.php"
When: preencher o campo "Make" com um valor válido,
And: preencher o campo "Engine Performance [kW]" com um valor válido",
And: preencher o campo "Date of Manufacture" com um valor válido,
And: preencher o campo "Number of Seats" com um valor válido,
And: preencher o campo "Fuel Type" com um valor válido,
And: preencher o campo "List Price [$]" com um valor válido,
And: preencher o campo "License Plate Number" com um valor válido,
And: preencher o campo "Annual Mileage [mi]" com um valor válido,
And: pressionar o botão "Next"
Then: o sistema deve direcionar para a aba "Enter Insurant Data";
