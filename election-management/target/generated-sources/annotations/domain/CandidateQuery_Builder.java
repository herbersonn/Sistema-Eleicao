// Autogenerated code. Do not modify.
package domain;

import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Generated;
import javax.annotation.Nullable;

/**
 * Auto-generated superclass of {@link CandidateQuery.Builder}, derived from the API of {@link
 * CandidateQuery}.
 */
@Generated("org.inferred.freebuilder.processor.Processor")
abstract class CandidateQuery_Builder {

  /**
   * Creates a new builder using {@code value} as a template.
   *
   * <p>If {@code value} is a partial, the builder will return more partials.
   */
  public static CandidateQuery.Builder from(CandidateQuery value) {
    if (value instanceof Rebuildable) {
      return ((Rebuildable) value).toBuilder();
    } else {
      return new CandidateQuery.Builder().mergeFrom(value);
    }
  }

  // Store a nullable object instead of an Optional. Escape analysis then
  // allows the JVM to optimize away the Optional objects created by and
  // passed to our API.
  private Set<String> ids = null;
  // Store a nullable object instead of an Optional. Escape analysis then
  // allows the JVM to optimize away the Optional objects created by and
  // passed to our API.
  private String name = null;

  /**
   * Sets the value to be returned by {@link CandidateQuery#ids()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code ids} is null
   */
  public CandidateQuery.Builder ids(Set<String> ids) {
    this.ids = Objects.requireNonNull(ids);
    return (CandidateQuery.Builder) this;
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#ids()}.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder ids(Optional<? extends Set<String>> ids) {
    if (ids.isPresent()) {
      return ids(ids.get());
    } else {
      return clearIds();
    }
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#ids()}.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder nullableIds(@Nullable Set<String> ids) {
    if (ids != null) {
      return ids(ids);
    } else {
      return clearIds();
    }
  }

  /**
   * If the value to be returned by {@link CandidateQuery#ids()} is present, replaces it by applying
   * {@code mapper} to it and using the result.
   *
   * <p>If the result is null, clears the value.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null
   */
  public CandidateQuery.Builder mapIds(UnaryOperator<Set<String>> mapper) {
    return ids(ids().map(mapper));
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#ids()} to {@link Optional#empty()
   * Optional.empty()}.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder clearIds() {
    ids = null;
    return (CandidateQuery.Builder) this;
  }

  /** Returns the value that will be returned by {@link CandidateQuery#ids()}. */
  public Optional<Set<String>> ids() {
    return Optional.ofNullable(ids);
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#name()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code name} is null
   */
  public CandidateQuery.Builder name(String name) {
    this.name = Objects.requireNonNull(name);
    return (CandidateQuery.Builder) this;
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#name()}.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder name(Optional<? extends String> name) {
    if (name.isPresent()) {
      return name(name.get());
    } else {
      return clearName();
    }
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#name()}.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder nullableName(@Nullable String name) {
    if (name != null) {
      return name(name);
    } else {
      return clearName();
    }
  }

  /**
   * If the value to be returned by {@link CandidateQuery#name()} is present, replaces it by
   * applying {@code mapper} to it and using the result.
   *
   * <p>If the result is null, clears the value.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null
   */
  public CandidateQuery.Builder mapName(UnaryOperator<String> mapper) {
    return name(name().map(mapper));
  }

  /**
   * Sets the value to be returned by {@link CandidateQuery#name()} to {@link Optional#empty()
   * Optional.empty()}.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder clearName() {
    name = null;
    return (CandidateQuery.Builder) this;
  }

  /** Returns the value that will be returned by {@link CandidateQuery#name()}. */
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * Copies values from {@code value}, skipping empty optionals.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder mergeFrom(CandidateQuery value) {
    value.ids().ifPresent(this::ids);
    value.name().ifPresent(this::name);
    return (CandidateQuery.Builder) this;
  }

  /**
   * Copies values from {@code template}, skipping empty optionals.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder mergeFrom(CandidateQuery.Builder template) {
    template.ids().ifPresent(this::ids);
    template.name().ifPresent(this::name);
    return (CandidateQuery.Builder) this;
  }

  /**
   * Resets the state of this builder.
   *
   * @return this {@code Builder} object
   */
  public CandidateQuery.Builder clear() {
    CandidateQuery_Builder defaults = new CandidateQuery.Builder();
    ids = defaults.ids;
    name = defaults.name;
    return (CandidateQuery.Builder) this;
  }

  /**
   * Returns a newly-created {@link CandidateQuery} based on the contents of this {@code Builder}.
   */
  public CandidateQuery build() {
    return new Value(this);
  }

  /**
   * Returns a newly-created partial {@link CandidateQuery} for use in unit tests. State checking
   * will not be performed.
   *
   * <p>The builder returned by {@link CandidateQuery.Builder#from(CandidateQuery)} will propagate
   * the partial status of its input, overriding {@link CandidateQuery.Builder#build() build()} to
   * return another partial. This allows for robust tests of modify-rebuild code.
   *
   * <p>Partials should only ever be used in tests. They permit writing robust test cases that won't
   * fail if this type gains more application-level constraints (e.g. new required fields) in
   * future. If you require partially complete values in production code, consider using a Builder.
   */
  @VisibleForTesting()
  public CandidateQuery buildPartial() {
    return new Partial(this);
  }

  private abstract static class Rebuildable implements CandidateQuery {
    public abstract Builder toBuilder();
  }

  private static final class Value extends Rebuildable {
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final Set<String> ids;
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final String name;

    private Value(CandidateQuery_Builder builder) {
      this.ids = builder.ids;
      this.name = builder.name;
    }

    @Override
    public Optional<Set<String>> ids() {
      return Optional.ofNullable(ids);
    }

    @Override
    public Optional<String> name() {
      return Optional.ofNullable(name);
    }

    @Override
    public Builder toBuilder() {
      CandidateQuery_Builder builder = new Builder();
      builder.ids = ids;
      builder.name = name;
      return (Builder) builder;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Value)) {
        return false;
      }
      Value other = (Value) obj;
      return Objects.equals(ids, other.ids) && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(ids, name);
    }

    @Override
    public String toString() {
      StringBuilder result = new StringBuilder("CandidateQuery{");
      String separator = "";
      if (ids != null) {
        result.append("ids=").append(ids);
        separator = ", ";
      }
      if (name != null) {
        result.append(separator).append("name=").append(name);
      }
      return result.append("}").toString();
    }
  }

  private static final class Partial extends Rebuildable {
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final Set<String> ids;
    // Store a nullable object instead of an Optional. Escape analysis then
    // allows the JVM to optimize away the Optional objects created by our
    // getter method.
    private final String name;

    Partial(CandidateQuery_Builder builder) {
      this.ids = builder.ids;
      this.name = builder.name;
    }

    @Override
    public Optional<Set<String>> ids() {
      return Optional.ofNullable(ids);
    }

    @Override
    public Optional<String> name() {
      return Optional.ofNullable(name);
    }

    private static class PartialBuilder extends Builder {
      @Override
      public CandidateQuery build() {
        return buildPartial();
      }
    }

    @Override
    public Builder toBuilder() {
      CandidateQuery_Builder builder = new PartialBuilder();
      builder.ids = ids;
      builder.name = name;
      return (Builder) builder;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Partial)) {
        return false;
      }
      Partial other = (Partial) obj;
      return Objects.equals(ids, other.ids) && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(ids, name);
    }

    @Override
    public String toString() {
      StringBuilder result = new StringBuilder("partial CandidateQuery{");
      String separator = "";
      if (ids != null) {
        result.append("ids=").append(ids);
        separator = ", ";
      }
      if (name != null) {
        result.append(separator).append("name=").append(name);
      }
      return result.append("}").toString();
    }
  }
}
