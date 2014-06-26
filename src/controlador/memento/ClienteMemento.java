package controlador.memento;

import negocio.Cliente;

/**
 * "Recordacao"
 * @author Luiz
 */
public class ClienteMemento {
    
    protected Cliente cli;

    public ClienteMemento(Cliente cliente) throws Exception { 
        if(cliente != null) {
            this.cli = cliente;
        }
    }

    public Cliente getCliente() {
        return cli;
    }
    
}
