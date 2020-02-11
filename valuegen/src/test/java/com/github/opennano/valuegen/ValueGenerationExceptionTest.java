package com.github.opennano.valuegen;

import org.junit.jupiter.api.Test;

import com.github.opennano.testutils.ExceptionTestUtil;

public class ValueGenerationExceptionTest {

  @Test
  public void isValidException() {
    ExceptionTestUtil.assertValidException(ValueGenerationException.class);
  }
}
