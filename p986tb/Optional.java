package p986tb;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: tb.b */
/* loaded from: classes8.dex */
public final class Optional<T> {
    @NotNull

    /* renamed from: b */
    public static final C44398a f116538b = new C44398a(null);
    @NotNull

    /* renamed from: c */
    private static final Optional f116539c = new Optional(null);
    @Nullable

    /* renamed from: a */
    private final T f116540a;

    /* compiled from: Optional.kt */
    @Metadata
    /* renamed from: tb.b$a */
    /* loaded from: classes8.dex */
    public static final class C44398a {
        private C44398a() {
        }

        public /* synthetic */ C44398a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final <T> Optional<T> m3126a() {
            return Optional.f116539c;
        }

        @NotNull
        /* renamed from: b */
        public final <T> Optional<T> m3125b(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Optional<>(value, null);
        }
    }

    public /* synthetic */ Optional(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    @NotNull
    /* renamed from: b */
    public final T m3129b() {
        T t = this.f116540a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m3128c() {
        if (this.f116540a != null) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: d */
    public final T m3127d() {
        return this.f116540a;
    }

    private Optional(T t) {
        this.f116540a = t;
    }
}
