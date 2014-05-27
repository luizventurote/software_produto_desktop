package negocio;
// Generated 26/05/2014 20:36:54 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private Integer idCidade;
     private String nome;
     private String uf;
     private Set clientes = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }
    public Cidade(String nome, String uf, Set clientes) {
       this.nome = nome;
       this.uf = uf;
       this.clientes = clientes;
    }
   
    public Integer getIdCidade() {
        return this.idCidade;
    }
    
    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return nome;
    }    
    
    public Object[] toArray() {
        return new Object[]{this,this.getUf()};
    }


}


