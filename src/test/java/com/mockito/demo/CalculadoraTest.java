package com.mockito.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class CalculadoraTest {
  @Mock
  CalculadoraGoogle calculadoraGoogle;
  @InjectMocks
  Calculadora calculadora;

  @BeforeEach
  public void init() {
    MockitoAnnotations.openMocks(this);
    when(calculadoraGoogle.sumar(5, 5)).thenReturn(10);
  }

  @Test
  public void sumaNuestraTest() {
    assertEquals(10, calculadora.sumaNuestra(5, 5));
  }
}
