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
public class Aluno extends Pessoa{
    //definindo os atributos e métodos da classe Aluni
    private int matr;
    private String curso;
    
    public void cancelarMatr(){
        // Avisando ao aluno que sua matricula foi encerrada
        System.out.println("Sua matricula foi encerrada!");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
 
}
