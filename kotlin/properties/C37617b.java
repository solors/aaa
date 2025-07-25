package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delegates.kt */
@Metadata
/* renamed from: kotlin.properties.b */
/* loaded from: classes7.dex */
final class C37617b<T> implements InterfaceC37618e<Object, T> {
    @Nullable

    /* renamed from: a */
    private T f99342a;

    @Override // kotlin.properties.InterfaceC37618e, kotlin.properties.Interfaces
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t = this.f99342a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.InterfaceC37618e
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99342a = value;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotNullProperty(");
        if (this.f99342a != null) {
            str = "value=" + this.f99342a;
        } else {
            str = "value not initialized yet";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}
