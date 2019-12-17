package com.stefanolupo.planetarymotion.renderer.models;

import com.google.common.collect.EvictingQueue;
import com.stefanolupo.planetarymotion.physics.models.Body;
import com.stefanolupo.planetarymotion.physics.models.math.Vector3;

import processing.core.PGraphics;

public class Planet implements Drawable {
  private static int tickCounter = 0;

  private final Body body;
  private final EvictingQueue<Vector3> pastPositions = EvictingQueue.create(5000);

  private Planet(Body body) {
    this.body = body;
  }

  @Override
  public void draw(PGraphics g) {
    pastPositions.add(body.getCoordinate().cartesian());

    for (Vector3 v : pastPositions) {
      drawPastPosition(g, v, (int) body.getSize().x / 2);
    }

    g.fill(0, 0, 255);
    g.stroke(0, 0, 255);
    g.ellipse(
        (float) body.getCoordinate().cartesian().x(),
        (float) body.getCoordinate().cartesian().y(),
        (float) body.getSize().x,
        (float) body.getSize().y
    );
  }

  public Body getBody() {
    return body;
  }

  public static Planet build(Body body) {
    return new Planet(body);
  }

  private static void drawPastPosition(PGraphics g, Vector3 point, int size) {
    g.fill(200, 200, 200);
    g.noStroke();
    g.ellipse(
        (float) point.x(),
        (float) point.y(),
        (float) size,
        (float) size
    );
  }

}

