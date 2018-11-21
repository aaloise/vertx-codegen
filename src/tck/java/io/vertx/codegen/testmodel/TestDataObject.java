package io.vertx.codegen.testmodel;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.Objects;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@DataObject
public class TestDataObject {

  private String foo;
  private int bar;
  private double wibble;

  public TestDataObject() {
  }

  public TestDataObject(TestDataObject other) {
    this.foo = other.foo;
    this.bar = other.bar;
    this.wibble = other.wibble;
  }

  public TestDataObject(JsonObject json) {
    this.foo = json.getString("foo", null);
    this.bar = json.getInteger("bar", 0);
    this.wibble = json.getDouble("wibble", 0d);
  }

  public String getFoo() {
    return foo;
  }

  public TestDataObject setFoo(String foo) {
    this.foo = foo;
    return this;
  }

  public int getBar() {
    return bar;
  }

  public TestDataObject setBar(int bar) {
    this.bar = bar;
    return this;
  }

  public double getWibble() {
    return wibble;
  }

  public TestDataObject setWibble(double wibble) {
    this.wibble = wibble;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestDataObject that = (TestDataObject) o;
    return getBar() == that.getBar() &&
      Double.compare(that.getWibble(), getWibble()) == 0 &&
      Objects.equals(getFoo(), that.getFoo());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFoo(), getBar(), getWibble());
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    json.put("foo", this.foo);
    json.put("bar", this.bar);
    json.put("wibble", this.wibble);
    return json;
  }
}
