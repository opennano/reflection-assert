package com.github.opennano.reflectionassert.e2etests.samplepojos;

public class DoubleObject {

  @SuppressWarnings("unused") // used only by reflection
  private double testedField;

  public DoubleObject(double testedField) {
    this.testedField = testedField;
  }
}
