/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeInstant;
import java.util.concurrent.TimeUnit;

public class MiModelo extends Model {
  
  // Atributos
  private double tiempoEntreLlegadas;
  private double tiempoDeServicio;
  private int capacidadDelSistema;
  
  // Constructor
  public MiModelo() {
    super(null, "MiModelo", true, true);
    tiempoEntreLlegadas = 2.0;
    tiempoDeServicio = 1.5;
    capacidadDelSistema = 10;
  }
  
  // Métodos
  public void setTiempoEntreLlegadas(double tiempo) {
    tiempoEntreLlegadas = tiempo;
  }
  
  public double getTiempoEntreLlegadas() {
    return tiempoEntreLlegadas;
  }
  
  public void setTiempoDeServicio(double tiempo) {
    tiempoDeServicio = tiempo;
  }
  
  public double getTiempoDeServicio() {
    return tiempoDeServicio;
  }
  
  public void setCapacidadDelSistema(int capacidad) {
    capacidadDelSistema = capacidad;
  }
  
  public int getCapacidadDelSistema() {
    return capacidadDelSistema;
  }
  
  // Método principal
  public static void main(String[] args) {
    // Crear instancia del modelo
    MiModelo miModelo = new MiModelo();
    
    // Ejecutar simulación
    Experiment exp = new Experiment("");
      // and connect them
      miModelo.connectToExperiment(exp);

      // set experiment parameters
      exp.setShowProgressBar(true);
      TimeInstant stopTime = new TimeInstant(1440, TimeUnit.MINUTES);
      exp.tracePeriod(new TimeInstant(0), stopTime);
      exp.stop(stopTime);

      // start experiment
      exp.start();

      // generate report and shut everything off
      exp.report();
      exp.finish();
  }

    @Override
    public String description() {
        return "Simulacion";
    }

    @Override
    public void doInitialSchedules() {
        
    }

    @Override
    public void init() {
        
    }
}
