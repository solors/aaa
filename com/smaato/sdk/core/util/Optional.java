package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class Optional<T> {
    @NonNull
    private static final Optional<?> EMPTY = new Optional<>();
    @Nullable
    private final T value;

    private Optional() {
        this.value = null;
    }

    public static <T> Optional<T> empty() {
        return (Optional<T>) EMPTY;
    }

    @NonNull
    /* renamed from: of */
    public static <T> Optional<T> m39355of(T t) {
        return new Optional<>(t);
    }

    @NonNull
    public static <T> Optional<T> ofNullable(T t) {
        if (t == null) {
            return empty();
        }
        return m39355of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return Objects.equals(this.value, ((Optional) obj).value);
    }

    @NonNull
    public Optional<T> filter(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        if (isEmpty()) {
            return this;
        }
        if (predicate.test((T) this.value)) {
            return this;
        }
        return empty();
    }

    @NonNull
    public <U> Optional<U> flatMap(@NonNull Function<? super T, Optional<U>> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (Optional) Objects.requireNonNull(function.apply((T) this.value));
    }

    @NonNull
    public T get() {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hash(this.value);
    }

    public void ifPresent(@NonNull Consumer<? super T> consumer) {
        Object obj = (T) this.value;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public boolean isEmpty() {
        if (this.value == null) {
            return true;
        }
        return false;
    }

    public boolean isPresent() {
        if (this.value != null) {
            return true;
        }
        return false;
    }

    @NonNull
    public <U> Optional<U> map(@NonNull Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply((T) this.value));
    }

    @NonNull
    public T orElse(@NonNull T t) {
        T t2 = this.value;
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    @NonNull
    public T orElseGet(@NonNull com.smaato.sdk.core.util.p574fi.Supplier<? extends T> supplier) {
        T t = this.value;
        if (t == null) {
            return supplier.get();
        }
        return t;
    }

    @NonNull
    public <X extends Throwable> T orElseThrow(@NonNull com.smaato.sdk.core.util.p574fi.Supplier<? extends X> supplier) throws Throwable {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }

    public String toString() {
        T t = this.value;
        if (t != null) {
            return String.format("Optional[%s]", t);
        }
        return "Optional.empty";
    }

    private Optional(@NonNull T t) {
        this.value = (T) Objects.requireNonNull(t);
    }
}
