package p1059ya;

import java.lang.Number;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: ya.m */
/* loaded from: classes8.dex */
public final class C45077m<T extends Number> {
    @NotNull

    /* renamed from: a */
    private T f118555a;
    @NotNull

    /* renamed from: b */
    private final T f118556b;

    public C45077m(@NotNull T value, @NotNull T fallbackValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fallbackValue, "fallbackValue");
        this.f118555a = value;
        this.f118556b = fallbackValue;
    }

    @NotNull
    /* renamed from: a */
    public final T m991a(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f118555a;
    }

    /* renamed from: b */
    public final void m990b(@Nullable Object obj, @NotNull KProperty<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.doubleValue() <= 0.0d) {
            value = this.f118556b;
        }
        this.f118555a = value;
    }

    public /* synthetic */ C45077m(Number number, Number number2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(number, (i & 2) != 0 ? 1 : number2);
    }
}
