package com.stefanolupo.planetarymotion.renderer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stefanolupo.planetarymotion.physics.calculators.Gravitational;
import com.stefanolupo.planetarymotion.physics.models.Acceleration;
import com.stefanolupo.planetarymotion.physics.models.Body;
import com.stefanolupo.planetarymotion.physics.models.Size;
import com.stefanolupo.planetarymotion.physics.models.Velocity;
import com.stefanolupo.planetarymotion.physics.models.conversions.PlanetaryConstants;
import com.stefanolupo.planetarymotion.physics.models.math.CartesianCoordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Coordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;
import com.stefanolupo.planetarymotion.renderer.constants.RenderingConstants;
import com.stefanolupo.planetarymotion.renderer.models.Drawable;
import com.stefanolupo.planetarymotion.renderer.models.Planet;
import com.stefanolupo.planetarymotion.renderer.models.Sun;

import processing.core.PApplet;


public class PlanetarySimulation extends PApplet {
  private static final Logger LOG = LoggerFactory.getLogger(PlanetarySimulation.class);



  private final int width, height;

  private final List<Body> bodies = new ArrayList<>();
  private final List<Drawable> drawables = new ArrayList<>();
  private final Sun sun;
  private final Planet earth;

  public PlanetarySimulation() {
    width = 1000;
    height = 1000;

    sun = Sun.staticCenteredSun(Size.fromSingleValue(PlanetaryConstants.SUN_DIAMETER * 10), PlanetaryConstants.SUN_MASS);

    earth = Planet.build(
        new Body(Coordinate.fromCartesian(CartesianCoordinate.fromVector3(Vector3.ofX(PlanetaryConstants.DISTANCE_FROM_SUN_TO_EARTH))),
            Velocity.fromVector(Vector3.ofY(5e8)),
            Size.fromSingleValue(PlanetaryConstants.EARTH_DIAMETER * 1000),
            PlanetaryConstants.EARTH_MASS
        )
    );

//    Planet planet = Planet.build(
//        new Body(Coordinate.fromCartesian(CartesianCoordinate.fromVector3(Vector3.of(-400, 150, 0))),
//            Velocity.fromVector(Vector3.ofY(-1)),
//            Size.fromSingleValue(5),
//            2e30)
//    );

//    bodies.add(sun.getBody());
    bodies.add(earth.getBody());
//    bodies.add(planet.getBody());

    drawables.add(sun);
    drawables.add(earth);
//    drawables.add(planet);

    LOG.info("{}", CartesianCoordinate.fromSphericalCoordinate(Gravitational.getAcceleration(earth.getBody(), sun.getBody())));


  }

  @Override
  public void setup() {
    super.setup();
//    frameRate(20);
//    frameRate(1);
  }

  @Override
  public void settings() {
    size(width, height);
  }

  int i = 0;

  @Override
  public void draw() {
    background(0);
    translate(width / 2f, height / 2f);
    scale((float) (1 / RenderingConstants.METERS_PER_PIXEL));

//    Acceleration acceleration = Gravitational.getAcceleration(earth.getBody(), sun.getBody());
//    earth.getBody().tick(acceleration);

    Map<Body, Acceleration> accelerationByBody = bodies.stream()
        .collect(Collectors.toMap(Function.identity(), b -> Gravitational.getAcceleration(b, sun.getBody())));
    bodies.forEach(b -> b.tick(accelerationByBody.get(b)));

//    if (i == 0) {
//      i++;
//      bodies.forEach(b -> b.tick(Acceleration.fromVector(Vector3.ofX(1))));
//    } else {
//      bodies.forEach(b -> b.tick(Acceleration.fromVector(Vector3.origin())));
//    }

//    bodies.forEach(b -> b.tick(Acceleration.fromVector(Vector3.origin())));
    drawables.forEach(d -> d.draw(g));
  }

  public static void main(String[] passedArgs) {
    PApplet.main(PlanetarySimulation.class, passedArgs);
  }
}
