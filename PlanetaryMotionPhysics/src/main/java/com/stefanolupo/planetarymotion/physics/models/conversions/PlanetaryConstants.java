package com.stefanolupo.planetarymotion.physics.models.conversions;

public class PlanetaryConstants {

//  public static final double GRAVITATIONAL_CONSTANT = 0.5; // x10-11

//  private static final double MASS_DIVISOR = 1e24;
  private static final double MASS_DIVISOR = 1;
  public static final double EARTH_MASS = 5.97e24 / MASS_DIVISOR;
  public static final double SUN_MASS = 1.989e30 / MASS_DIVISOR;

  // km --> m
//  private static final double DISTANCE_DIVISOR = 1e6;
  private static final double DISTANCE_DIVISOR = 1;
  public static final double EARTH_DIAMETER = (12.742e3 * 1e3) / DISTANCE_DIVISOR;
  public static final double SUN_DIAMETER = (1.391e6 * 1e3) / DISTANCE_DIVISOR;

  private static final double DISTANCE_FROM_SUN_TO_EARTH_SI = (147.23e6 * 1e3);
  public static final double DISTANCE_FROM_SUN_TO_EARTH = DISTANCE_FROM_SUN_TO_EARTH_SI / DISTANCE_DIVISOR;

  private static final double GRAVITATIONAL_CONSTANT_DIVISOR = MASS_DIVISOR / DISTANCE_DIVISOR;
  private static final double GRAVITATIONAL_CONSTANT_SI = 6.674e-11 * 10000; // temporary 1k
  public static final double GRAVITATIONAL_CONSTANT = GRAVITATIONAL_CONSTANT_SI / GRAVITATIONAL_CONSTANT_DIVISOR;
}
