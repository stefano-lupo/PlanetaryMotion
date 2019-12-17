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
 * Immutable implementation of {@link SphericalCoordinate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSphericalCoordinate.builder()}.
 */
@Generated(from = "SphericalCoordinate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableSphericalCoordinate
    implements SphericalCoordinate {
  private final double p;
  private final double theta;
  private final double phi;

  private ImmutableSphericalCoordinate(ImmutableSphericalCoordinate.Builder builder) {
    if (builder.pIsSet()) {
      initShim.p(builder.p);
    }
    if (builder.thetaIsSet()) {
      initShim.theta(builder.theta);
    }
    if (builder.phiIsSet()) {
      initShim.phi(builder.phi);
    }
    this.p = initShim.p();
    this.theta = initShim.theta();
    this.phi = initShim.phi();
    this.initShim = null;
  }

  private ImmutableSphericalCoordinate(double p, double theta, double phi) {
    this.p = p;
    this.theta = theta;
    this.phi = phi;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "SphericalCoordinate", generator = "Immutables")
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

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (pBuildStage == STAGE_INITIALIZING) attributes.add("p");
      if (thetaBuildStage == STAGE_INITIALIZING) attributes.add("theta");
      if (phiBuildStage == STAGE_INITIALIZING) attributes.add("phi");
      return "Cannot build SphericalCoordinate, attribute initializers form cycle " + attributes;
    }
  }

  private double pInitialize() {
    return SphericalCoordinate.super.p();
  }

  private double thetaInitialize() {
    return SphericalCoordinate.super.theta();
  }

  private double phiInitialize() {
    return SphericalCoordinate.super.phi();
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
   * Copy the current immutable object by setting a value for the {@link SphericalCoordinate#p() p} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for p
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSphericalCoordinate withP(double value) {
    if (Double.doubleToLongBits(this.p) == Double.doubleToLongBits(value)) return this;
    return new ImmutableSphericalCoordinate(value, this.theta, this.phi);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SphericalCoordinate#theta() theta} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for theta
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSphericalCoordinate withTheta(double value) {
    if (Double.doubleToLongBits(this.theta) == Double.doubleToLongBits(value)) return this;
    return new ImmutableSphericalCoordinate(this.p, value, this.phi);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SphericalCoordinate#phi() phi} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for phi
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSphericalCoordinate withPhi(double value) {
    if (Double.doubleToLongBits(this.phi) == Double.doubleToLongBits(value)) return this;
    return new ImmutableSphericalCoordinate(this.p, this.theta, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSphericalCoordinate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSphericalCoordinate
        && equalTo((ImmutableSphericalCoordinate) another);
  }

  private boolean equalTo(ImmutableSphericalCoordinate another) {
    return Double.doubleToLongBits(p) == Double.doubleToLongBits(another.p)
        && Double.doubleToLongBits(theta) == Double.doubleToLongBits(another.theta)
        && Double.doubleToLongBits(phi) == Double.doubleToLongBits(another.phi);
  }

  /**
   * Computes a hash code from attributes: {@code p}, {@code theta}, {@code phi}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Doubles.hashCode(p);
    h += (h << 5) + Doubles.hashCode(theta);
    h += (h << 5) + Doubles.hashCode(phi);
    return h;
  }

  /**
   * Prints the immutable value {@code SphericalCoordinate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SphericalCoordinate")
        .omitNullValues()
        .add("p", p)
        .add("theta", theta)
        .add("phi", phi)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link SphericalCoordinate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SphericalCoordinate instance
   */
  public static ImmutableSphericalCoordinate copyOf(SphericalCoordinate instance) {
    if (instance instanceof ImmutableSphericalCoordinate) {
      return (ImmutableSphericalCoordinate) instance;
    }
    return ImmutableSphericalCoordinate.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSphericalCoordinate ImmutableSphericalCoordinate}.
   * <pre>
   * ImmutableSphericalCoordinate.builder()
   *    .p(double) // optional {@link SphericalCoordinate#p() p}
   *    .theta(double) // optional {@link SphericalCoordinate#theta() theta}
   *    .phi(double) // optional {@link SphericalCoordinate#phi() phi}
   *    .build();
   * </pre>
   * @return A new ImmutableSphericalCoordinate builder
   */
  public static ImmutableSphericalCoordinate.Builder builder() {
    return new ImmutableSphericalCoordinate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSphericalCoordinate ImmutableSphericalCoordinate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SphericalCoordinate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_P = 0x1L;
    private static final long OPT_BIT_THETA = 0x2L;
    private static final long OPT_BIT_PHI = 0x4L;
    private long optBits;

    private double p;
    private double theta;
    private double phi;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SphericalCoordinate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SphericalCoordinate instance) {
      Objects.requireNonNull(instance, "instance");
      p(instance.p());
      theta(instance.theta());
      phi(instance.phi());
      return this;
    }

    /**
     * Initializes the value for the {@link SphericalCoordinate#p() p} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SphericalCoordinate#p() p}.</em>
     * @param p The value for p 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder p(double p) {
      this.p = p;
      optBits |= OPT_BIT_P;
      return this;
    }

    /**
     * Initializes the value for the {@link SphericalCoordinate#theta() theta} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SphericalCoordinate#theta() theta}.</em>
     * @param theta The value for theta 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder theta(double theta) {
      this.theta = theta;
      optBits |= OPT_BIT_THETA;
      return this;
    }

    /**
     * Initializes the value for the {@link SphericalCoordinate#phi() phi} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SphericalCoordinate#phi() phi}.</em>
     * @param phi The value for phi 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder phi(double phi) {
      this.phi = phi;
      optBits |= OPT_BIT_PHI;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSphericalCoordinate ImmutableSphericalCoordinate}.
     * @return An immutable instance of SphericalCoordinate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSphericalCoordinate build() {
      return new ImmutableSphericalCoordinate(this);
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
