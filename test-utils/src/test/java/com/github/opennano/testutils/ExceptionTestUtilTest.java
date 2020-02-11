package com.github.opennano.testutils;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionTestUtilTest {

  @Test
  public void assertValidException_minimalist() {
    ExceptionTestUtil.assertValidException(SimpleException.class);
  }

  @Test
  public void assertValidException_full() {
    ExceptionTestUtil.assertValidException(FullException.class);
  }

  @Test
  public void assertValidException_weird() {
    ExceptionTestUtil.assertValidException(WeirdException.class);
  }

  @Test
  public void assertValidException_throws() {
    assertThrows(
        IllegalArgumentException.class,
        () -> ExceptionTestUtil.assertValidException(WeirderException.class));
  }

  /** Has only a no-arg exception constructor */
  public static class SimpleException extends Throwable {

    private static final long serialVersionUID = 1L;

    public SimpleException() {}
  }

  /** Has all 4 java exception constructors */
  public static class FullException extends Throwable {

    private static final long serialVersionUID = 1L;

    public FullException() {}

    public FullException(String message, Throwable cause) {
      super(message, cause);
    }

    public FullException(String message) {
      super(message);
    }

    public FullException(Throwable cause) {
      super(cause);
    }
  }

  /** Has full constructor but no others */
  public static class WeirdException extends WeirderException {

    private static final long serialVersionUID = 1L;

    public WeirdException(String message, Throwable cause) {
      super(message, cause);
    }
  }

  /** no-arg constructor will throw if ever called */
  public static class WeirderException extends Throwable {

    private static final long serialVersionUID = 1L;

    public WeirderException() {
      throw new IllegalStateException("super type constructor should have been ignored!");
    }

    public WeirderException(String message, Throwable cause) {
      super(message, cause);
    }
  }
}
