package com.stefanolupo.planetarymotion.physics.models.math;

import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

import com.stefanolupo.planetarymotion.physics.models.Velocity;

@Immutable
public interface Coordinate extends SphericalCoordinate {

  @Value.Default
  default CartesianCoordinate cartesian() {
    return CartesianCoordinate.fromSphericalCoordinate(this);
  }

  static Coordinate fromCartesian(CartesianCoordinate cartesianCoordinate) {
    return ImmutableCoordinate.builder()
        .from(SphericalCoordinate.fromCartesianCoordinate(cartesianCoordinate))
        .build();
  }

  static Coordinate fromSpherical(SphericalCoordinate sphericalCoordinate) {
    return ImmutableCoordinate.builder()
        .from(sphericalCoordinate)
        .build();
  }



  default Coordinate applyVelocity(Velocity velocity) {
    SphericalCoordinate result = add(velocity);
    Coordinate coordinate = fromSpherical(result);
    return coordinate;
//    SphericalCoordinate velocityPolar = SphericalCoordinate.fromVector3(velocity);
//    polarCoordinate = polarCoordinate.add(velocityPolar);
  }
}

//public class Coordinate {
//
//  private PolarCoordinate polarCoordinate;
//
//  private Coordinate(PolarCoordinate polarCoordinate) {
//    this.polarCoordinate = polarCoordinate;
//  }
//
//  public PolarCoordinate getPolarCoordinate() {
//    return polarCoordinate;
//  }
//
//  public CartesianCoordinate getCartesianCoordinate() {
//    return CartesianCoordinate.fromPolarCoordinate(polarCoordinate);
//  }
//
//  public void applyVelocity(Velocity velocity) {
//    PolarCoordinate velocityPolar = PolarCoordinate.fromVector3(velocity);
//    polarCoordinate = polarCoordinate.add(velocityPolar);
//  }
//
//  public static Coordinate fromCartesianCoordinate(CartesianCoordinate cartesianCoordinate) {
//    return new Coordinate(PolarCoordinate.fromVector3(cartesianCoordinate));
//  }
//
//  public static Coordinate fromPolarCoordinate(PolarCoordinate polarCoordinate) {
//    return new Coordinate(polarCoordinate);
//  }
//
//  @Override
//  public String toString() {
//    return CartesianCoordinate.fromPolarCoordinate(polarCoordinate).toString();
//  }
//}
