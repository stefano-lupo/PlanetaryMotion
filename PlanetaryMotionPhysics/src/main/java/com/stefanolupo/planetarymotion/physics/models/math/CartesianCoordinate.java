package com.stefanolupo.planetarymotion.physics.models.math;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stefanolupo.planetarymotion.physics.calculators.Vectors;

@Immutable
public interface CartesianCoordinate extends Vector3 {

  @JsonIgnore
  default CartesianCoordinate add(CartesianCoordinate other) {
    CartesianCoordinate result = fromVector3(Vectors.add(this, other));
    return result;
  }

  static CartesianCoordinate fromSphericalCoordinate(SphericalCoordinate sphericalCoordinate) {
    return fromVector3(Vectors.resolveIntoComponents(sphericalCoordinate));
  }

  static CartesianCoordinate fromVector3(Vector3 vector3) {
    return ImmutableCartesianCoordinate.builder()
        .x(vector3.x())
        .y(vector3.y())
        .z(vector3.z())
        .build();
  }

  static CartesianCoordinate origin() {
    return ImmutableCartesianCoordinate.builder()
        .from(Vector3.origin())
        .build();
  }
}
