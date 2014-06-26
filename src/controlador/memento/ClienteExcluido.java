package controlador.memento;

import java.util.ArrayList;
import java.util.List;
import negocio.Cliente;

/**
 * "Originador"
 *
 * @author Luiz
 */
public class ClienteExcluido {

    ClienteCareTaker caretaker;
    protected Cliente cli;

    public ClienteExcluido() {
        this.caretaker = new ClienteCareTaker();
    }

    public void addCliente(Cliente cliente) throws Exception {
        this.caretaker.adicionarMemento(new ClienteMemento(cliente));
    }

    public boolean desfazerCliente() throws Exception {

        ClienteMemento client = caretaker.getUltimoEstadoSalvo();

        if (client != null) {

            this.cli = client.getCliente();

            return true;
        }
        
        return false;
        
    }

    public Cliente getCliente() {
        return this.cli;
    }

}
