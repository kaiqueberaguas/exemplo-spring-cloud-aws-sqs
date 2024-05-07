package br.com.exemplo.springboot.producersqs.producers;

import java.util.function.Function;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.awspring.cloud.sqs.operations.SqsTemplate;

@Service
public class Producer implements Function<String,Void> {

    private Logger logger = Logger.getLogger("Worker");

    @Value("${spring.aws.sqs.queue}")
    private String fila;

    private SqsTemplate sqsTemplate;

    public Producer(SqsTemplate sqsTemplate) {
        this.sqsTemplate = sqsTemplate;
    }

    @Override
    public Void apply(String mensagem) {
        this.logger.info("publicando mensagem "+ mensagem);
        this.sqsTemplate.send(fila, mensagem);    
        this.logger.info("Mensagem publicada");
        return null;
    }
    
}