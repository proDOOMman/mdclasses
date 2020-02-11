package com.github._1c_syntax.mdclasses.metadata.additional;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UseMode {
  @JsonProperty("DontUse")
  DONT_USE("DontUse"),
  @JsonProperty("Use")
  USE("Use"),
  @JsonProperty("UseWithWarnings")
  USE_WITH_WARNINGS("UseWithWarnings");

  private final String value;

  UseMode(String value) {
    this.value = value;
  }

  public static UseMode fromValue(String value) {
    for (UseMode useMode : UseMode.values()) {
      if (useMode.value.equals(value)) {
        return useMode;
      }
    }
    throw new IllegalArgumentException(value);
  }

  public String value() {
    return this.value;
  }
}