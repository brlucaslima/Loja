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
        Carro carro =new Carro();
        carro.nome = "Palio";
        carro.marca = "Fiat";
        carro.cor = "Preto";
        carro.fabricacao = "2016";
        carro.largura = "1,63MM";
        carro.peso = "940KG";
        
        System.out.print(carro.nome);
}}
