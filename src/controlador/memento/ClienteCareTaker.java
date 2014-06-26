package controlador.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * "Zelador"
 *
 * @author Luiz
 */
public class ClienteCareTaker {

    protected ArrayList<ClienteMemento> estados;

    public ClienteCareTaker() {
        this.estados = new ArrayList<ClienteMemento>();
    }

    public void adicionarMemento(ClienteMemento memento) {
        this.estados.add(memento);
    }

    public ClienteMemento getUltimoEstadoSalvo() throws Exception {
        if (estados.size() <= 0) {
            return null;
        }
        ClienteMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }

}
