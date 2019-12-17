package com.stefanolupo.planetarymotion.physics.models;

import org.immutables.value.Value.Immutable;

import com.stefanolupo.planetarymotion.physics.models.math.SphericalCoordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;

@Immutable
public interface Acceleration extends SphericalCoordinate {

  static Acceleration fromVector(Vector3 v) {
    return ImmutableAcceleration.builder()
        .from(SphericalCoordinate.fromVector3(v))
        .build();
  }
}
