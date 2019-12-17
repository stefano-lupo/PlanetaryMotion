package com.stefanolupo.planetarymotion.renderer.models;

import processing.core.PGraphics;
import processing.opengl.PGraphics3D;

public interface Drawable {
  void draw(PGraphics g);

  default void draw3d(PGraphics3D g3) {

  }
}
