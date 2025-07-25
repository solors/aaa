package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.properties.c */
/* loaded from: classes7.dex */
public abstract class ObservableProperty<V> implements InterfaceC37618e<Object, V> {
    private V value;

    public ObservableProperty(V v) {
        this.value = v;
    }

    protected void afterChange(@NotNull KProperty<?> property, V v, V v2) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean beforeChange(@NotNull KProperty<?> property, V v, V v2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.InterfaceC37618e, kotlin.properties.Interfaces
    public V getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.InterfaceC37618e
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, V v) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v2 = this.value;
        if (!beforeChange(property, v2, v)) {
            return;
        }
        this.value = v;
        afterChange(property, v2, v);
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
