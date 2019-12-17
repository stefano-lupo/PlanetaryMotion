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
 * Immutable implementation of {@link Coordinate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoordinate.builder()}.
 */
@Generated(from = "Coordinate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableCoordinate
    implements Coordinate {
  private final double p;
  private final double theta;
  private final double phi;
  private final CartesianCoordinate cartesian;

  private ImmutableCoordinate(ImmutableCoordinate.Builder builder) {
    if (builder.pIsSet()) {
      initShim.p(builder.p);
    }
    if (builder.thetaIsSet()) {
      initShim.theta(builder.theta);
    }
    if (builder.phiIsSet()) {
      initShim.phi(builder.phi);
    }
    if (builder.cartesian != null) {
      initShim.cartesian(builder.cartesian);
    }
    this.p = initShim.p();
    this.theta = initShim.theta();
    this.phi = initShim.phi();
    this.cartesian = initShim.cartesian();
    this.initShim = null;
  }

  private ImmutableCoordinate(
      double p,
      double theta,
      double phi,
      CartesianCoordinate cartesian) {
    this.p = p;
    this.theta = theta;
    this.phi = phi;
    this.cartesian = cartesian;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "Coordinate", generator = "Immutables")
  private final class InitShim {
    private byte pBuildStage = STAGE_UNINITIALIZED;
    private double p;

    double p() {
      if (pBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (pBuildStage == STAGE_UNINITIALIZED) {
        pBuildStage = STAGE_INITIALIZING;
        this.p = pInitialize();
        pBuildStage = STAGE_INITIALIZED;
      }
      return this.p;
    }

    void p(double p) {
      this.p = p;
      pBuildStage = STAGE_INITIALIZED;
    }

    private byte thetaBuildStage = STAGE_UNINITIALIZED;
    private double theta;

    double theta() {
      if (thetaBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (thetaBuildStage == STAGE_UNINITIALIZED) {
        thetaBuildStage = STAGE_INITIALIZING;
        this.theta = thetaInitialize();
        thetaBuildStage = STAGE_INITIALIZED;
      }
      return this.theta;
    }

    void theta(double theta) {
      this.theta = theta;
      thetaBuildStage = STAGE_INITIALIZED;
    }

    private byte phiBuildStage = STAGE_UNINITIALIZED;
    private double phi;

    double phi() {
      if (phiBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (phiBuildStage == STAGE_UNINITIALIZED) {
        phiBuildStage = STAGE_INITIALIZING;
        this.phi = phiInitialize();
        phiBuildStage = STAGE_INITIALIZED;
      }
      return this.phi;
    }

    void phi(double phi) {
      this.phi = phi;
      phiBuildStage = STAGE_INITIALIZED;
    }

    private byte cartesianBuildStage = STAGE_UNINITIALIZED;
    private CartesianCoordinate cartesian;

    CartesianCoordinate cartesian() {
      if (cartesianBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (cartesianBuildStage == STAGE_UNINITIALIZED) {
        cartesianBuildStage = STAGE_INITIALIZING;
        this.cartesian = Objects.requireNonNull(cartesianInitialize(), "cartesian");
        cartesianBuildStage = STAGE_INITIALIZED;
      }
      return this.cartesian;
    }

    void cartesian(CartesianCoordinate cartesian) {
      this.cartesian = cartesian;
      cartesianBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (pBuildStage == STAGE_INITIALIZING) attributes.add("p");
      if (thetaBuildStage == STAGE_INITIALIZING) attributes.add("theta");
      if (phiBuildStage == STAGE_INITIALIZING) attributes.add("phi");
      if (cartesianBuildStage == STAGE_INITIALIZING) attributes.add("cartesian");
      return "Cannot build Coordinate, attribute initializers form cycle " + attributes;
    }
  }

  private double pInitialize() {
    return Coordinate.super.p();
  }

  private double thetaInitialize() {
    return Coordinate.super.theta();
  }

  private double phiInitialize() {
    return Coordinate.super.phi();
  }

  private CartesianCoordinate cartesianInitialize() {
    return Coordinate.super.cartesian();
  }

  /**
   * @return The value of the {@code p} attribute
   */
  @Override
  public double p() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.p()
        : this.p;
  }

  /**
   * @return The value of the {@code theta} attribute
   */
  @Override
  public double theta() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.theta()
        : this.theta;
  }

  /**
   * @return The value of the {@code phi} attribute
   */
  @Override
  public double phi() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.phi()
        : this.phi;
  }

  /**
   * @return The value of the {@code cartesian} attribute
   */
  @Override
  public CartesianCoordinate cartesian() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.cartesian()
        : this.cartesian;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coordinate#p() p} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for p
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoordinate withP(double value) {
    if (Double.doubleToLongBits(this.p) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCoordinate(value, this.theta, this.phi, this.cartesian);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coordinate#theta() theta} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for theta
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoordinate withTheta(double value) {
    if (Double.doubleToLongBits(this.theta) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCoordinate(this.p, value, this.phi, this.cartesian);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coordinate#phi() phi} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for phi
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoordinate withPhi(double value) {
    if (Double.doubleToLongBits(this.phi) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCoordinate(this.p, this.theta, value, this.cartesian);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coordinate#cartesian() cartesian} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cartesian
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoordinate withCartesian(CartesianCoordinate value) {
    if (this.cartesian == value) return this;
    CartesianCoordinate newValue = Objects.requireNonNull(value, "cartesian");
    return new ImmutableCoordinate(this.p, this.theta, this.phi, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoordinate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoordinate
        && equalTo((ImmutableCoordinate) another);
  }

  private boolean equalTo(ImmutableCoordinate another) {
    return Double.doubleToLongBits(p) == Double.doubleToLongBits(another.p)
        && Double.doubleToLongBits(theta) == Double.doubleToLongBits(another.theta)
        && Double.doubleToLongBits(phi) == Double.doubleToLongBits(another.phi)
        && cartesian.equals(another.cartesian);
  }

  /**
   * Computes a hash code from attributes: {@code p}, {@code theta}, {@code phi}, {@code cartesian}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Doubles.hashCode(p);
    h += (h << 5) + Doubles.hashCode(theta);
    h += (h << 5) + Doubles.hashCode(phi);
    h += (h << 5) + cartesian.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Coordinate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Coordinate")
        .omitNullValues()
        .add("p", p)
        .add("theta", theta)
        .add("phi", phi)
        .add("cartesian", cartesian)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Coordinate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coordinate instance
   */
  public static ImmutableCoordinate copyOf(Coordinate instance) {
    if (instance instanceof ImmutableCoordinate) {
      return (ImmutableCoordinate) instance;
    }
    return ImmutableCoordinate.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCoordinate ImmutableCoordinate}.
   * <pre>
   * ImmutableCoordinate.builder()
   *    .p(double) // optional {@link Coordinate#p() p}
   *    .theta(double) // optional {@link Coordinate#theta() theta}
   *    .phi(double) // optional {@link Coordinate#phi() phi}
   *    .cartesian(com.stefanolupo.planetarymotion.physics.models.math.CartesianCoordinate) // optional {@link Coordinate#cartesian() cartesian}
   *    .build();
   * </pre>
   * @return A new ImmutableCoordinate builder
   */
  public static ImmutableCoordinate.Builder builder() {
    return new ImmutableCoordinate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCoordinate ImmutableCoordinate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Coordinate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_P = 0x1L;
    private static final long OPT_BIT_THETA = 0x2L;
    private static final long OPT_BIT_PHI = 0x4L;
    private long optBits;

    private double p;
    private double theta;
    private double phi;
    private @Nullable CartesianCoordinate cartesian;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.stefanolupo.planetarymotion.physics.models.math.SphericalCoordinate} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SphericalCoordinate instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.stefanolupo.planetarymotion.physics.models.math.Coordinate} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Coordinate instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof SphericalCoordinate) {
        SphericalCoordinate instance = (SphericalCoordinate) object;
        p(instance.p());
        phi(instance.phi());
        theta(instance.theta());
      }
      if (object instanceof Coordinate) {
        Coordinate instance = (Coordinate) object;
        cartesian(instance.cartesian());
      }
    }

    /**
     * Initializes the value for the {@link Coordinate#p() p} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Coordinate#p() p}.</em>
     * @param p The value for p 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder p(double p) {
      this.p = p;
      optBits |= OPT_BIT_P;
      return this;
    }

    /**
     * Initializes the value for the {@link Coordinate#theta() theta} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Coordinate#theta() theta}.</em>
     * @param theta The value for theta 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder theta(double theta) {
      this.theta = theta;
      optBits |= OPT_BIT_THETA;
      return this;
    }

    /**
     * Initializes the value for the {@link Coordinate#phi() phi} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Coordinate#phi() phi}.</em>
     * @param phi The value for phi 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder phi(double phi) {
      this.phi = phi;
      optBits |= OPT_BIT_PHI;
      return this;
    }

    /**
     * Initializes the value for the {@link Coordinate#cartesian() cartesian} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Coordinate#cartesian() cartesian}.</em>
     * @param cartesian The value for cartesian 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cartesian(CartesianCoordinate cartesian) {
      this.cartesian = Objects.requireNonNull(cartesian, "cartesian");
      return this;
    }

    /**
     * Builds a new {@link ImmutableCoordinate ImmutableCoordinate}.
     * @return An immutable instance of Coordinate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCoordinate build() {
      return new ImmutableCoordinate(this);
    }

    private boolean pIsSet() {
      return (optBits & OPT_BIT_P) != 0;
    }

    private boolean thetaIsSet() {
      return (optBits & OPT_BIT_THETA) != 0;
    }

    private boolean phiIsSet() {
      return (optBits & OPT_BIT_PHI) != 0;
    }
  }
}
