package com.mockito.demo;

public class Calculadora {
  CalculadoraGoogle calculadoraGoogle;

  public int sumaNuestra(int a, int b) {
    return calculadoraGoogle.sumar(a, b);
  }
}
