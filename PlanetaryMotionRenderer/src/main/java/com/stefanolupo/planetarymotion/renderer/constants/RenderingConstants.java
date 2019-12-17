package com.stefanolupo.planetarymotion.renderer.constants;

import com.stefanolupo.planetarymotion.physics.models.conversions.PlanetaryConstants;

public class RenderingConstants {
  private static final int SCREEN_SIZE = 1000;
  public static final double METERS_PER_PIXEL = PlanetaryConstants.DISTANCE_FROM_SUN_TO_EARTH * 10  / SCREEN_SIZE;
}
