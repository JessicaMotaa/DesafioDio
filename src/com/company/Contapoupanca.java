package com.company;

public class Contapoupanca extends Conta {
   @Override
   public void imprimirExtrato() {
      System.out.println(" === Extrato conta Poupanca === ");
      System.out.println(String.format("Agencia: %d", super.agencia));
      System.out.println(String.format("Numero: %d", super.numero));
      System.out.println(String.format("Saldo: %d", super.saldo));
   }
   }