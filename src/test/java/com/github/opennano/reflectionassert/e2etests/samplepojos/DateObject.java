package com.github.opennano.reflectionassert.e2etests.samplepojos;

import java.util.Date;

public class DateObject {

  @SuppressWarnings("unused") // used only by reflection
  private Date testedField;

  public DateObject(Date testedField) {
    this.testedField = testedField;
  }
}
