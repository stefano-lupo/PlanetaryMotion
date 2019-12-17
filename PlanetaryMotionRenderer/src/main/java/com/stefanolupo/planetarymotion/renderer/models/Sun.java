package com.stefanolupo.planetarymotion.renderer.models;

import com.stefanolupo.planetarymotion.physics.models.Body;
import com.stefanolupo.planetarymotion.physics.models.Size;
import com.stefanolupo.planetarymotion.physics.models.math.CartesianCoordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Coordinate;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;

import processing.core.PGraphics;

public class Sun implements Drawable {

  private final Body body;

  private Sun(Body body) {
    this.body = body;
  }

  @Override
  public void draw(PGraphics g) {
//    g.pushMatrix();
//    g.translate(g.width / 2f, g.height / 2f);
    g.fill(255, 100, 0);
    g.ellipse(
        (float) body.getCoordinate().cartesian().x(),
        (float) body.getCoordinate().cartesian().y(),
        (float) body.getSize().x,
        (float) body.getSize().y
    );
//    g.popMatrix();
  }

  public Body getBody() {
    return body;
  }

  public static Sun staticCenteredSun(Size size, double mass) {
//    Coordinate center = Coordinate.fromCartesian(CartesianCoordinate.fromVector3(Vector3.of(width / 2, height / 2, 0)));
    Coordinate center = Coordinate.fromCartesian(CartesianCoordinate.fromVector3(Vector3.origin()));

    return new Sun(Body.staticBody(center, size));
  }

}
