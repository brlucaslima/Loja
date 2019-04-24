
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABORATORIO_INFO
 */
public class Principal {

    public static void main(String[] args){
        Carro carro = new Carro();        
        
        Scanner scan = new Scanner(System.in);
        
        carro.setNome(scan.next());
        
        
        
        
        
        System.out.print(carro.marca);
        carro.marca=scan1.next ();
        System.out.print(carro.cor);
        carro.cor=scan1.next ();
        System.out.print(carro.fabricacao);
        carro.fabricacao=scan1.next ();
        System.out.print(carro.largura);
        carro.largura=scan1.next ();
        System.out.print(carro.peso);
        carro.peso=scan1.next ();
        
        
        System.out.println("Nome: "+ carro.nome);
        System.out.println("Marca: "+ carro.marca);
        System.out.println("Cor: "+ carro.cor);
        System.out.println("Frabricação "+ carro.fabricacao);
        System.out.println("Largura "+ carro.largura);
        System.out.println("Peso: "+ carro.peso);

    }
    
}
