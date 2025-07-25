package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: Interfaces.kt */
@Metadata
/* renamed from: kotlin.properties.e */
/* loaded from: classes7.dex */
public interface InterfaceC37618e<T, V> extends Interfaces<T, V> {
    @Override // kotlin.properties.Interfaces
    V getValue(T t, @NotNull KProperty<?> kProperty);

    void setValue(T t, @NotNull KProperty<?> kProperty, V v);
}
