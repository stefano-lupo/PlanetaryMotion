package com.stefanolupo.planetarymotion.physics.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stefanolupo.planetarymotion.physics.models.math.Coordinate;

public class Body implements Tickable {
  private static final Logger LOG = LoggerFactory.getLogger(Body.class);

  private final double mass;

  private Coordinate coordinate;
  private Velocity velocity;
  private Size size;

  public Body(Coordinate coordinate, Velocity velocity, Size size, double mass) {
    this.mass = mass;
    this.coordinate = coordinate;
    this.velocity = velocity;
    this.size = size;
  }

  @Override
  public void tick(Acceleration acceleration) {
    Velocity oldVelocity = velocity;
    Coordinate oldCoordinate = coordinate;

    velocity = velocity.applyAcceleration(acceleration);
    coordinate = coordinate.applyVelocity(velocity);

//    LOG.info("Loc: {}, Vel: {},  Accel: {} --> Loc {}, Vel {}", oldCoordinate, oldVelocity, acceleration, coordinate, velocity);

  }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public Velocity getVelocity() {
    return velocity;
  }

  public Size getSize() {
    return size;
  }

  public double getMass() {
    return mass;
  }

  public static Body staticBody(Coordinate coordinate, Size size) {
    return new Body(coordinate, Velocity.zero(), size, size.x);
  }
}
