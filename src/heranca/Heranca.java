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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // apresentando as características que são herdadas e as que são inerente a cada classe

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("calebe");
        pessoa1.setIdade(17);
        pessoa1.setSexo("masculino");
        System.out.println(pessoa1.getNome()+ " é do sexo "+pessoa1.getSexo()+" e tem "+pessoa1.getIdade()+" anos");
        pessoa1.fazerAninv();
        
        System.out.println("==========================================================================");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Eliabe");
        aluno1.setIdade(19);
        aluno1.setSexo("masculino");
        System.out.println(aluno1.getNome()+ " é um aluno do sexo "+aluno1.getSexo()+" e tem "+aluno1.getIdade()+" anos");
        aluno1.cancelarMatr();
        
         
        System.out.println("==========================================================================");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Cleudina");
        funcionario1.setIdade(39);
        funcionario1.setSexo("fenimino");
        funcionario1.setTrabalhando(true);
        System.out.println(funcionario1.getNome()+ " é um funcionario do sexo "+funcionario1.getSexo()+" e tem "+funcionario1.getIdade()+" anos");
        funcionario1.mudarTrabalho();
        
        System.out.println("==========================================================================");
        Professor professor1 = new Professor();
        professor1.setNome("Artur Mácio");
        professor1.setEspecialidade("Matemática");
        professor1.setIdade(42);
        professor1.setSexo("masculino");
        professor1.setSalario(5000);
        System.out.println(professor1.getNome()+ " é um professor do sexo "+professor1.getSexo()+" e tem "+professor1.getIdade()+" anos");
        professor1.receberAum(3150f);
    }
    
    
}
