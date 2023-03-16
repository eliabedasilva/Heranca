/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author santo
 */
public class Funcionario extends Pessoa{
    //definindo os atributos e métodos da classe Funcionario
    
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        //mudando o estado do atributo "trabalhando" para o valor oposto
        this.setTrabalhando(!this.isTrabalhando());
        
        
        if (this.isTrabalhando() == false){
            System.out.println("Hora de descansar!");
        } else {
            System.out.println("Voltando ao trabalho");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
