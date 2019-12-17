package com.stefanolupo.planetarymotion.physics.models;

import org.immutables.value.Value.Immutable;

import com.stefanolupo.planetarymotion.physics.models.math.SphericalCoordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;

@Immutable
public interface Velocity extends SphericalCoordinate {

  default Velocity applyAcceleration(SphericalCoordinate other) {
    return ImmutableVelocity.builder()
        .from(add(other))
        .build();
  }

  static Velocity fromVector(Vector3 v) {
    return ImmutableVelocity.builder()
        .from(SphericalCoordinate.fromVector3(v))
        .build();
  }

  static Velocity zero() {
    return ImmutableVelocity.builder()
        .from(SphericalCoordinate.zero())
        .build();
  }
}
