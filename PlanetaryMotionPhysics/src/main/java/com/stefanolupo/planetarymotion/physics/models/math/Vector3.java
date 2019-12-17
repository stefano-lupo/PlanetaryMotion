package com.stefanolupo.planetarymotion.physics.models.math;

import java.util.List;

import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.stefanolupo.planetarymotion.physics.calculators.Vectors;

@Immutable
public interface Vector3 {

  @Value.Default
  default double x() {
    return 0;
  }

  @Value.Default
  default double y() {
    return 0;
  }

  @Value.Default
  default double z() {
    return 0;
  }
  
  default Vector3 negated() {
    return ImmutableVector3.builder()
        .x(-x())
        .y(-y())
        .z(-z())
        .build();
  }

  @JsonIgnore
  default List<Double> values() {
    return ImmutableList.of(x(), y(), z());
  }

  default double length() {
    return Vectors.length(this);
  }

  static Vector3 origin() {
    return ImmutableVector3.builder().build();
  }

  static Vector3 of(double x, double y, double z) {
    return ImmutableVector3.builder()
        .x(x)
        .y(y)
        .z(z)
        .build();
  }

  static Vector3 of(List<Double> values) {
    Preconditions.checkArgument(values.size() == 3, "There must be 3 elements in the vector collection");
    return of(values.get(0), values.get(1), values.get(2));
  }

  static Vector3 ofX(double x) {
    return of(x, 0, 0);
  }

  static Vector3 ofY(double y) {
    return of(0, y, 0);
  }

  static Vector3 ofZ(double z) {
    return of(0, 0, z);
  }
}
