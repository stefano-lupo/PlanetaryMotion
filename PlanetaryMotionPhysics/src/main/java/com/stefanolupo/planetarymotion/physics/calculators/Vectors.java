package com.stefanolupo.planetarymotion.physics.calculators;

import java.util.List;
import java.util.stream.Collectors;

import com.stefanolupo.planetarymotion.physics.models.math.ImmutableVector3;
import com.stefanolupo.planetarymotion.physics.models.math.SphericalCoordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;

public class Vectors {

  public static double length(Vector3 v) {
    return euclideanDistance(v, Vector3.origin());
  }

  public static double euclideanDistance(Vector3 v1, Vector3 v2) {
    return Math.sqrt(
        squareDifference(v1.x(), v2.x()) + squareDifference(v1.y(), v2.y()) + squareDifference(v1.z(), v2.z())
    );
  }

  public static double euclideanDistance(SphericalCoordinate c1, SphericalCoordinate c2) {
    double r1Squared = Math.pow(c1.p(), 2);
    double r2Squared = Math.pow(c2.p(), 2);

    // TODO: Use second theta
    return Math.sqrt(r1Squared + r2Squared - 2 * c1.p() * c2.p() * Math.cos(c1.theta() - c2.theta()));
  }
  
  public static Vector3 add(Vector3 v1, Vector3 v2) {
    return ImmutableVector3.builder()
        .x(v1.x() + v2.x())
        .y(v1.y() + v2.y())
        .z(v1.z() + v2.z())
        .build();
  }

  public static Vector3 subtract(Vector3 destination, Vector3 current) {
    return add(destination, current.negated());
  }

  public static Vector3 scale(Vector3 v, double factor) {

    return Vector3.of(v.values().stream().map(c -> c * factor).collect(Collectors.toList()));
  }

  public static Vector3 directionVector(Vector3 v) {
    double length = length(v);
    return Vector3.of(
        v.x() / length,
        v.y() / length,
        v.z() / length
    );
  }

  public static double angleBetween(Vector3 v1, Vector3 v2) {
    double dotProduct = dotProduct(v1, v2);
    double lengthProduct = v1.length() * v2.length();

    return Math.acos(dotProduct / lengthProduct);
  }

  public static double dotProduct(Vector3 v1, Vector3 v2) {
    double result = 0;
    List<Double> v1Values = v1.values();
    List<Double> v2Values = v2.values();
    for (int i = 0; i < v1Values.size(); i++) {
      result += v1Values.get(i) * v2Values.get(i);
    }

    return result;
  }

  public static Vector3 resolveIntoComponents(SphericalCoordinate sphericalCoordinate) {
    /*
      x = r sin θ cos φ
      y = r sin θ sin φ
      z = r cos θ


      Right ones
      x = ρ sin φ cos θ
      y = ρ sin φ sin θ
      z = ρ cos φ */
    return Vector3.of(
        sphericalCoordinate.p() * Math.sin(sphericalCoordinate.phi()) * Math.cos(sphericalCoordinate.theta()),
        sphericalCoordinate.p() * Math.sin(sphericalCoordinate.phi()) * Math.sin(sphericalCoordinate.theta()),
        sphericalCoordinate.p() * Math.cos(sphericalCoordinate.phi())
    );
  }

  private static double squareDifference(double a, double b) {
    return Math.pow((a - b), 2);
  }
}
