package com.stefanolupo.planetarymotion.physics.calculators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stefanolupo.planetarymotion.physics.models.Acceleration;
import com.stefanolupo.planetarymotion.physics.models.Body;
import com.stefanolupo.planetarymotion.physics.models.Size;
import com.stefanolupo.planetarymotion.physics.models.conversions.PlanetaryConstants;
import com.stefanolupo.planetarymotion.physics.models.math.CartesianCoordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Coordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;

/**
 * F = G m1.m2 / r^2
 */
public class Gravitational {

  private static final Logger LOG = LoggerFactory.getLogger(Gravitational.class);



  public static Acceleration getAcceleration(Body body, Body reference) {
     double force = lawOfGravitation(body, reference);

//     CartesianCoordinate direction = body.getCoordinate().cartesian();
     Vector3 towardsOrigin = Vectors.subtract(Vector3.origin(), body.getCoordinate().cartesian());
    Vector3 directionVector = Vectors.directionVector(towardsOrigin);
    Vector3 scaledDirectionVector = Vectors.scale(directionVector, force);


     // Trivial for now as always points towards the origin
//    return Acceleration.fromVector(Vector3.ofX(1));
    Acceleration acceleration = Acceleration.fromVector(scaledDirectionVector);
//    Acceleration acceleration = ImmutableAcceleration.builder()
//        .from(negated)
//        .r(force)
//        .build();
    return acceleration;
//    return Acceleration.fromVector(Vectors.resolveIntoComponents(force, body.getCoordinate().getPolarCoordinate().theta));
  }

  public static double lawOfGravitation(Body b1, Body b2) {
    double r = Vectors.euclideanDistance(b1.getCoordinate(), b2.getCoordinate());
    double r2 = Math.pow(r, 2);
    return PlanetaryConstants.GRAVITATIONAL_CONSTANT * b1.getMass() * b2.getMass() / r2;
  }

  public static void main(String[] args) {
    Body b1 = Body.staticBody(Coordinate.fromCartesian(CartesianCoordinate.origin()), Size.fromSingleValue(50));
    Body b2 = Body.staticBody(Coordinate.fromCartesian(CartesianCoordinate.fromVector3(Vector3.of(-50, -50, 0))), Size.fromSingleValue(50));
//    LOG.info("{}", getAcceleration(b1, b2));
    LOG.info("{}", CartesianCoordinate.fromSphericalCoordinate(getAcceleration(b2, b1)));
  }
}
