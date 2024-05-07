package br.com.exemplo.consumersqs.listeners;

import java.util.function.Function;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Component
public class Listener implements Function<String,Void> {

    private Logger logger = Logger.getLogger("Consumer");

    @SqsListener(value="${events.queues.name}")
    public Void apply(String mensagem){
        this.logger.info("Mensagem recebida");
        this.logger.info(mensagem);
        this.logger.info("Mensagem finalizada");
        return null;
    }

}