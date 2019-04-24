/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABORATORIO_INFO
 */
public class Carro {

    private String nome;
    private String marca;
    private String cor;
    private String fabricacao;
    private String largura;
    private String peso;

    public void setNome(String nome) {
        if (nome != "") {
            this.nome = nome;
        }}
    public void setMarca(String marca){
        if (marca != "") {
            this.marca = marca;
        }}
    public void setCor(String cor){
        if (cor != "") {
            this.cor = cor;    
        }}
    public void setFabricacao(String fabricacao){
        if (fabricacao != "") {
            this.fabricacao = fabricacao;    
        }}
    public void setLargura(String largura){
        if (largura != "") {
            this.largura = largura;    
        }}
    public void setPeso(String peso){
        if (peso != "") {
            this.peso = peso;    
        }}

}
