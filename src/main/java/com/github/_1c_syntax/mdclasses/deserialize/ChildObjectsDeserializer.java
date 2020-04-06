package com.github._1c_syntax.mdclasses.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.github._1c_syntax.mdclasses.mdo.Attribute;
import com.github._1c_syntax.mdclasses.mdo.Command;
import com.github._1c_syntax.mdclasses.mdo.Dimension;
import com.github._1c_syntax.mdclasses.mdo.Resource;
import com.github._1c_syntax.mdclasses.mdo.TabularSection;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;

import java.io.IOException;
import java.util.Map;

public class ChildObjectsDeserializer extends AbstractDeserializer {

  private static final String COMMAND_KEY = "Command";
  private static final String SUBSYSTEM_KEY = "Subsystem";
  private static final String DIMENSION_KEY = "Dimension";
  private static final String RESOURCE_KEY = "Resource";
  private static final String ATTRIBUTE_KEY = "Attribute";
  private static final String TABULAR_SECTION_KEY = "TabularSection";

  public ChildObjectsDeserializer() {
    super("ChildObjects");
  }

  @Override
  protected void readToken(JsonParser parser,
                           Map<String, Object> childObjects,
                           String name,
                           DeserializationContext context) throws IOException {
    if (name.equals(COMMAND_KEY)) {
      parser.nextToken();
      var newValue = getValueFromNode(parser.readValueAsTree(), Command.class);
      addProperty(childObjects, name, newValue);
    } else if (name.equals(SUBSYSTEM_KEY)) {
      parser.nextToken();
      var newValue = MDOType.SUBSYSTEM.getClassName() + "." + getValueFromNode(parser.readValueAsTree());
      addProperty(childObjects, name, newValue);
    } else if (name.equals(DIMENSION_KEY)) {
      parser.nextToken();
      var newValue = getValueFromNode(parser.readValueAsTree(), Dimension.class);
      addProperty(childObjects, ATTRIBUTE_KEY, newValue);
    } else if (name.equals(RESOURCE_KEY)) {
      parser.nextToken();
      var newValue = getValueFromNode(parser.readValueAsTree(), Resource.class);
      addProperty(childObjects, ATTRIBUTE_KEY, newValue);
    } else if (name.equals(ATTRIBUTE_KEY)) {
      parser.nextToken();
      var newValue = getValueFromNode(parser.readValueAsTree(), Attribute.class);
      addProperty(childObjects, ATTRIBUTE_KEY, newValue);
    } else if (name.equals(TABULAR_SECTION_KEY)) {
      parser.nextToken();
      var newValue = readValueByType(parser, TabularSection.class);
      addProperty(childObjects, ATTRIBUTE_KEY, newValue);
    }
  }
}
