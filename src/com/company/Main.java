package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Humano edi = new Humano();
        edi.nome = "Edinaelson";
        edi.idade = 19;
        edi.falar();
        edi.imprimir();

        System.out.println("------------------------------------------");
        Cachorro dog = new Cachorro();
        dog.nome = "Dog";
        dog.idade = 7;
        dog.imprimir();

        System.out.println("------------------------------------------");
        Gato cat = new Gato();
        cat.idade = 4;
        cat.nome = "Cat";
        cat.imprimir();

    }

    public static class SerVivo{
        int idade;
        String nome;

        Scanner ent = new Scanner(System.in);

        public void idade(){
            System.out.println("Informe idade: ");
            idade = ent.nextInt();
        }

        public void nome(){
            System.out.println("Informe nome: ");
            nome = ent.next();
        }

        public void falar(){
            System.out.println("Estou falando...");
        }

        public void imprimir(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }

    }

    public static class Humano extends SerVivo{
        @Override
        public void nome() {
            super.nome();
        }

        @Override
        public void idade() {
            super.idade();
        }

        @Override
        public void imprimir() {
            super.imprimir();
        }

        @Override
        public void falar() {
            super.falar();
        }
    }

    public static class Gato extends SerVivo{
        @Override
        public void idade() {
            super.idade();
        }

        @Override
        public void nome() {
            super.nome();
        }

        @Override
        public void imprimir() {
            super.imprimir();
        }
    }

    public static class Cachorro extends SerVivo{


        @Override
        public void idade() {
            super.idade();
        }

        @Override
        public void nome() {
            super.nome();
        }

        @Override
        public void imprimir() {
            super.imprimir();
        }
    }

}
