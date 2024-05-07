#!/bin/sh
echo "Initializing localstack s3"

awslocal sqs create-queue --queue-name fila_de_testes