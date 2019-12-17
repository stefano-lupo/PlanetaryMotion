package com.stefanolupo.planetarymotion.physics.models;

public class Size {
  public double x;
  public double y;
  public double z;

  public Size(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public static Size fromValues(double x, double y, double z) {
    return new Size(x, y, z);
  }

  public static Size fromSingleValue(double size) {
    return fromValues(size, size, size);
  }
}
