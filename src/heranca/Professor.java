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
public class Professor extends Pessoa{
    //definindo os atributos e métodos da classe Professor
    
    private String especialidade;
    private double salario;
    
    public void receberAum(double aumento){
        // Adicionando o valor do aumento no sálario do professor
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Parabéns, seu salário agora é "+ this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
