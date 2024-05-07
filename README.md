# Projeto de exemplo spring cloud aws sqs

## Descrição

Fluxo completo de Producer -> SQS (localstack) -> Consumer

## Ferramentas

* docker
* spring cloud aws
* spring-shell

## Para rodar

* Inicie o local stack, para isso dentro da pasta docker-compose use o comando _docker-compose up_
* Inicie o consumer, para isso dentro da pasta app-consumer use o comando mvn spring-boot:run 
* Inicie o producer em modo iterativo, para isso dentro da pasta app-producer use o comando mvn spring-boot:run
* Para publicar uma mensagem digite _Publicar + {mensagem}_ no mesmo terminal do producer
