package br.com.exemplo.springboot.producersqs.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import br.com.exemplo.springboot.producersqs.producers.Producer;

@ShellComponent
public class ShellCommand {
    
    private Producer producer;

    public ShellCommand(Producer producer) {
        this.producer = producer;
    }

    @ShellMethod(key = "Publicar")
    public void publicarMensagem(String mensagem){
        this.producer.apply(mensagem);
    }

}
