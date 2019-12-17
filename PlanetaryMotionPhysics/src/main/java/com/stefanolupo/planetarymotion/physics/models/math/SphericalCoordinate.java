package com.stefanolupo.planetarymotion.physics.models.math;

import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

import com.stefanolupo.planetarymotion.physics.calculators.Vectors;

/*
  θ angle CCW between +ve x and +ve y axis
  φ angle between +ve z DOWNWARD toward y axis

  x = ρ sin φ cos θ
  y = ρ sin φ sin θ
  z = ρ cos φ

  r = ρ sin(φ)            xy plane vector
  z = ρ cos(φ)            xz plane vector

  ρ = x^2 + y^2 +z^2    =  r^2 + z^2

 */
@Immutable
public interface SphericalCoordinate {

  @Value.Default
  default double p() {
    return 0;
  }

  @Value.Default
  /**
   * CCW angle from positive x axis in xy plane
   */
  default double theta() {
    return 0;
  }

  @Value.Default
  /**
   * CW Angle from positive z axis in XZ plane
   */
  default double phi() {
    return 0;
  }

//  @Value.Default
  default SphericalCoordinate negated() {
    CartesianCoordinate cartesianCoordinate = CartesianCoordinate.fromSphericalCoordinate(this);
    CartesianCoordinate negated = CartesianCoordinate.fromVector3(cartesianCoordinate.negated());
    return SphericalCoordinate.fromCartesianCoordinate(negated);
  }

  static SphericalCoordinate fromCartesianCoordinate(CartesianCoordinate c) {
    return fromVector3(c);
  }

  static SphericalCoordinate fromVector3(Vector3 v) {
    double length = Vectors.length(v);
    if (length == 0) {
      return zero();
    }

    double theta = Math.atan2(v.y(), v.x());
    double phi = Math.acos(v.z() / length);
//    double theta = Math.acos(v.z() / length);
//    double phy = Math.asin(v.y() / Math.sqrt(Math.pow(v.x(), 2) + Math.pow(v.y(), 2)));
    return ImmutableSphericalCoordinate.builder()
        .p(length)
        .theta(theta)
        .phi(phi)
        .build();
  }

  default SphericalCoordinate add(SphericalCoordinate other) {
    // TODO
    CartesianCoordinate thisCart = CartesianCoordinate.fromSphericalCoordinate(this);
    CartesianCoordinate otherCart = CartesianCoordinate.fromSphericalCoordinate(other);
    CartesianCoordinate sum = thisCart.add(otherCart);
    SphericalCoordinate sphericalCoordinate = SphericalCoordinate.fromCartesianCoordinate(sum);
    return sphericalCoordinate;

  }

  static SphericalCoordinate zero() {
    return ImmutableSphericalCoordinate.builder().build();
  }
}

/*
public class PolarCoordinate {
  public double r, theta;

  private PolarCoordinate(double r, double theta) {
    this.r = r;
    this.theta = theta;
  }

  public PolarCoordinate add(PolarCoordinate other) {
    CartesianCoordinate thisCartesian = CartesianCoordinate.fromPolarCoordinate(this);
    CartesianCoordinate otherCartesian = CartesianCoordinate.fromPolarCoordinate(other);

    CartesianCoordinate result = thisCartesian.add(otherCartesian);
    return PolarCoordinate.fromVector3(result);
  }

  public static PolarCoordinate fromValues(double r, double theta) {
    return new PolarCoordinate(r, theta);
  }

  public static PolarCoordinate origin() {
    return new PolarCoordinate(0, 0);
  }

//  public static PolarCoordinate fromVector3(Vector3 vector3) {
//    double r = Distance.euclideanDistance(vector3, Vector3.origin());
//
//    double rise = vector3.y;
//    double run = vector3.x;
//    double theta = Math.atan2(rise, run);
//
//    return fromValues(r, theta);
//  }
}

 */
