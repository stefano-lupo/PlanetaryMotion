package com.stefanolupo.planetarymotion.physics.models.math;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Doubles;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Vector3}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVector3.builder()}.
 */
@Generated(from = "Vector3", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableVector3 implements Vector3 {
  private final double x;
  private final double y;
  private final double z;

  private ImmutableVector3(ImmutableVector3.Builder builder) {
    if (builder.xIsSet()) {
      initShim.x(builder.x);
    }
    if (builder.yIsSet()) {
      initShim.y(builder.y);
    }
    if (builder.zIsSet()) {
      initShim.z(builder.z);
    }
    this.x = initShim.x();
    this.y = initShim.y();
    this.z = initShim.z();
    this.initShim = null;
  }

  private ImmutableVector3(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "Vector3", generator = "Immutables")
  private final class InitShim {
    private byte xBuildStage = STAGE_UNINITIALIZED;
    private double x;

    double x() {
      if (xBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (xBuildStage == STAGE_UNINITIALIZED) {
        xBuildStage = STAGE_INITIALIZING;
        this.x = xInitialize();
        xBuildStage = STAGE_INITIALIZED;
      }
      return this.x;
    }

    void x(double x) {
      this.x = x;
      xBuildStage = STAGE_INITIALIZED;
    }

    private byte yBuildStage = STAGE_UNINITIALIZED;
    private double y;

    double y() {
      if (yBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (yBuildStage == STAGE_UNINITIALIZED) {
        yBuildStage = STAGE_INITIALIZING;
        this.y = yInitialize();
        yBuildStage = STAGE_INITIALIZED;
      }
      return this.y;
    }

    void y(double y) {
      this.y = y;
      yBuildStage = STAGE_INITIALIZED;
    }

    private byte zBuildStage = STAGE_UNINITIALIZED;
    private double z;

    double z() {
      if (zBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (zBuildStage == STAGE_UNINITIALIZED) {
        zBuildStage = STAGE_INITIALIZING;
        this.z = zInitialize();
        zBuildStage = STAGE_INITIALIZED;
      }
      return this.z;
    }

    void z(double z) {
      this.z = z;
      zBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (xBuildStage == STAGE_INITIALIZING) attributes.add("x");
      if (yBuildStage == STAGE_INITIALIZING) attributes.add("y");
      if (zBuildStage == STAGE_INITIALIZING) attributes.add("z");
      return "Cannot build Vector3, attribute initializers form cycle " + attributes;
    }
  }

  private double xInitialize() {
    return Vector3.super.x();
  }

  private double yInitialize() {
    return Vector3.super.y();
  }

  private double zInitialize() {
    return Vector3.super.z();
  }

  /**
   * @return The value of the {@code x} attribute
   */
  @Override
  public double x() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.x()
        : this.x;
  }

  /**
   * @return The value of the {@code y} attribute
   */
  @Override
  public double y() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.y()
        : this.y;
  }

  /**
   * @return The value of the {@code z} attribute
   */
  @Override
  public double z() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.z()
        : this.z;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Vector3#x() x} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for x
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVector3 withX(double value) {
    if (Double.doubleToLongBits(this.x) == Double.doubleToLongBits(value)) return this;
    return new ImmutableVector3(value, this.y, this.z);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Vector3#y() y} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for y
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVector3 withY(double value) {
    if (Double.doubleToLongBits(this.y) == Double.doubleToLongBits(value)) return this;
    return new ImmutableVector3(this.x, value, this.z);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Vector3#z() z} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for z
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVector3 withZ(double value) {
    if (Double.doubleToLongBits(this.z) == Double.doubleToLongBits(value)) return this;
    return new ImmutableVector3(this.x, this.y, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVector3} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVector3
        && equalTo((ImmutableVector3) another);
  }

  private boolean equalTo(ImmutableVector3 another) {
    return Double.doubleToLongBits(x) == Double.doubleToLongBits(another.x)
        && Double.doubleToLongBits(y) == Double.doubleToLongBits(another.y)
        && Double.doubleToLongBits(z) == Double.doubleToLongBits(another.z);
  }

  /**
   * Computes a hash code from attributes: {@code x}, {@code y}, {@code z}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Doubles.hashCode(x);
    h += (h << 5) + Doubles.hashCode(y);
    h += (h << 5) + Doubles.hashCode(z);
    return h;
  }

  /**
   * Prints the immutable value {@code Vector3} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Vector3")
        .omitNullValues()
        .add("x", x)
        .add("y", y)
        .add("z", z)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Vector3} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Vector3 instance
   */
  public static ImmutableVector3 copyOf(Vector3 instance) {
    if (instance instanceof ImmutableVector3) {
      return (ImmutableVector3) instance;
    }
    return ImmutableVector3.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableVector3 ImmutableVector3}.
   * <pre>
   * ImmutableVector3.builder()
   *    .x(double) // optional {@link Vector3#x() x}
   *    .y(double) // optional {@link Vector3#y() y}
   *    .z(double) // optional {@link Vector3#z() z}
   *    .build();
   * </pre>
   * @return A new ImmutableVector3 builder
   */
  public static ImmutableVector3.Builder builder() {
    return new ImmutableVector3.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableVector3 ImmutableVector3}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Vector3", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_X = 0x1L;
    private static final long OPT_BIT_Y = 0x2L;
    private static final long OPT_BIT_Z = 0x4L;
    private long optBits;

    private double x;
    private double y;
    private double z;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Vector3} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Vector3 instance) {
      Objects.requireNonNull(instance, "instance");
      x(instance.x());
      y(instance.y());
      z(instance.z());
      return this;
    }

    /**
     * Initializes the value for the {@link Vector3#x() x} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Vector3#x() x}.</em>
     * @param x The value for x 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder x(double x) {
      this.x = x;
      optBits |= OPT_BIT_X;
      return this;
    }

    /**
     * Initializes the value for the {@link Vector3#y() y} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Vector3#y() y}.</em>
     * @param y The value for y 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder y(double y) {
      this.y = y;
      optBits |= OPT_BIT_Y;
      return this;
    }

    /**
     * Initializes the value for the {@link Vector3#z() z} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Vector3#z() z}.</em>
     * @param z The value for z 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder z(double z) {
      this.z = z;
      optBits |= OPT_BIT_Z;
      return this;
    }

    /**
     * Builds a new {@link ImmutableVector3 ImmutableVector3}.
     * @return An immutable instance of Vector3
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableVector3 build() {
      return new ImmutableVector3(this);
    }

    private boolean xIsSet() {
      return (optBits & OPT_BIT_X) != 0;
    }

    private boolean yIsSet() {
      return (optBits & OPT_BIT_Y) != 0;
    }

    private boolean zIsSet() {
      return (optBits & OPT_BIT_Z) != 0;
    }
  }
}
