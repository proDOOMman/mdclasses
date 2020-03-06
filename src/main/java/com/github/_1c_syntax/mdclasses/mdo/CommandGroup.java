package com.github._1c_syntax.mdclasses.mdo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Value
@EqualsAndHashCode(callSuper = true)
@JsonDeserialize(builder = CommandGroup.CommandGroupBuilderImpl.class)
@SuperBuilder
public class CommandGroup extends MDObjectBase {

  public MDOType getType() {
    return MDOType.COMMAND_GROUP;
  }

  @JsonPOJOBuilder(withPrefix = "")
  @JsonIgnoreProperties(ignoreUnknown = true)
  static final class CommandGroupBuilderImpl extends CommandGroup.CommandGroupBuilder<CommandGroup, CommandGroup.CommandGroupBuilderImpl> {

    @JsonProperty("Properties")
    @Override
    public CommandGroup.CommandGroupBuilderImpl properties(Map<String, Object> properties) {
      super.properties(properties);
      return this.self();
    }
  }
}