/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;


public class MapTest  {
  
  private Map<String, Map<String, String>> mapMapOfString = null;

  @JsonbTypeSerializer(InnerEnum.Serializer.class)
  @JsonbTypeDeserializer(InnerEnum.Deserializer.class)
  public enum InnerEnum {

    UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("lower"));    


    String value;

    InnerEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<InnerEnum> {
        @Override
        public InnerEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
            for (InnerEnum b : InnerEnum.values()) {
                if (String.valueOf(b.value).equals(parser.getString())) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
        }
    }

    public static final class Serializer implements JsonbSerializer<InnerEnum> {
        @Override
        public void serialize(InnerEnum obj, JsonGenerator generator, SerializationContext ctx) {
            generator.write(obj.value);
        }
    }
  }

  private Map<String, InnerEnum> mapOfEnumString = null;

  private Map<String, Boolean> directMap = null;

  private Map<String, Boolean> indirectMap = null;
  
 /**
   * Get mapMapOfString
   * @return mapMapOfString
  **/
  @JsonbProperty("map_map_of_string")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }

  /**
    * Set mapMapOfString
  **/
  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  public MapTest putMapMapOfStringItem(String key, Map<String, String> mapMapOfStringItem) {
    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

 /**
   * Get mapOfEnumString
   * @return mapOfEnumString
  **/
  @JsonbProperty("map_of_enum_string")
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }

  /**
    * Set mapOfEnumString
  **/
  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }

  public MapTest mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  public MapTest putMapOfEnumStringItem(String key, InnerEnum mapOfEnumStringItem) {
    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

 /**
   * Get directMap
   * @return directMap
  **/
  @JsonbProperty("direct_map")
  public Map<String, Boolean> getDirectMap() {
    return directMap;
  }

  /**
    * Set directMap
  **/
  public void setDirectMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }

  public MapTest directMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
    return this;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    this.directMap.put(key, directMapItem);
    return this;
  }

 /**
   * Get indirectMap
   * @return indirectMap
  **/
  @JsonbProperty("indirect_map")
  public Map<String, Boolean> getIndirectMap() {
    return indirectMap;
  }

  /**
    * Set indirectMap
  **/
  public void setIndirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
  }

  public MapTest indirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
    return this;
  }

  public MapTest putIndirectMapItem(String key, Boolean indirectMapItem) {
    this.indirectMap.put(key, indirectMapItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
    sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

