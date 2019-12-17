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
 * Immutable implementation of {@link CartesianCoordinate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCartesianCoordinate.builder()}.
 */
@Generated(from = "CartesianCoordinate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableCartesianCoordinate
    implements CartesianCoordinate {
  private final double x;
  private final double y;
  private final double z;

  private ImmutableCartesianCoordinate(ImmutableCartesianCoordinate.Builder builder) {
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

  private ImmutableCartesianCoordinate(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "CartesianCoordinate", generator = "Immutables")
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
      return "Cannot build CartesianCoordinate, attribute initializers form cycle " + attributes;
    }
  }

  private double xInitialize() {
    return CartesianCoordinate.super.x();
  }

  private double yInitialize() {
    return CartesianCoordinate.super.y();
  }

  private double zInitialize() {
    return CartesianCoordinate.super.z();
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
   * Copy the current immutable object by setting a value for the {@link CartesianCoordinate#x() x} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for x
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCartesianCoordinate withX(double value) {
    if (Double.doubleToLongBits(this.x) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCartesianCoordinate(value, this.y, this.z);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CartesianCoordinate#y() y} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for y
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCartesianCoordinate withY(double value) {
    if (Double.doubleToLongBits(this.y) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCartesianCoordinate(this.x, value, this.z);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CartesianCoordinate#z() z} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for z
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCartesianCoordinate withZ(double value) {
    if (Double.doubleToLongBits(this.z) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCartesianCoordinate(this.x, this.y, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCartesianCoordinate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCartesianCoordinate
        && equalTo((ImmutableCartesianCoordinate) another);
  }

  private boolean equalTo(ImmutableCartesianCoordinate another) {
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
   * Prints the immutable value {@code CartesianCoordinate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CartesianCoordinate")
        .omitNullValues()
        .add("x", x)
        .add("y", y)
        .add("z", z)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link CartesianCoordinate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CartesianCoordinate instance
   */
  public static ImmutableCartesianCoordinate copyOf(CartesianCoordinate instance) {
    if (instance instanceof ImmutableCartesianCoordinate) {
      return (ImmutableCartesianCoordinate) instance;
    }
    return ImmutableCartesianCoordinate.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCartesianCoordinate ImmutableCartesianCoordinate}.
   * <pre>
   * ImmutableCartesianCoordinate.builder()
   *    .x(double) // optional {@link CartesianCoordinate#x() x}
   *    .y(double) // optional {@link CartesianCoordinate#y() y}
   *    .z(double) // optional {@link CartesianCoordinate#z() z}
   *    .build();
   * </pre>
   * @return A new ImmutableCartesianCoordinate builder
   */
  public static ImmutableCartesianCoordinate.Builder builder() {
    return new ImmutableCartesianCoordinate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCartesianCoordinate ImmutableCartesianCoordinate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CartesianCoordinate", generator = "Immutables")
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
     * Fill a builder with attribute values from the provided {@code com.stefanolupo.planetarymotion.physics.models.math.Vector3} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Vector3 instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.stefanolupo.planetarymotion.physics.models.math.CartesianCoordinate} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CartesianCoordinate instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof Vector3) {
        Vector3 instance = (Vector3) object;
        x(instance.x());
        y(instance.y());
        z(instance.z());
      }
    }

    /**
     * Initializes the value for the {@link CartesianCoordinate#x() x} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CartesianCoordinate#x() x}.</em>
     * @param x The value for x 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder x(double x) {
      this.x = x;
      optBits |= OPT_BIT_X;
      return this;
    }

    /**
     * Initializes the value for the {@link CartesianCoordinate#y() y} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CartesianCoordinate#y() y}.</em>
     * @param y The value for y 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder y(double y) {
      this.y = y;
      optBits |= OPT_BIT_Y;
      return this;
    }

    /**
     * Initializes the value for the {@link CartesianCoordinate#z() z} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CartesianCoordinate#z() z}.</em>
     * @param z The value for z 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder z(double z) {
      this.z = z;
      optBits |= OPT_BIT_Z;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCartesianCoordinate ImmutableCartesianCoordinate}.
     * @return An immutable instance of CartesianCoordinate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCartesianCoordinate build() {
      return new ImmutableCartesianCoordinate(this);
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
