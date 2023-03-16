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
public class Pessoa {
    
    //definindo os atributos e métodos que pertencem a classe pessoa e que serão herdados pelas classes filhas
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAninv(){
        //incrementando 1 ano na idada da pessoa
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabésn pelo seu "+ this.getIdade()+"º anivérsario!!!");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
