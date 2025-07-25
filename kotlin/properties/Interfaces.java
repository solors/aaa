package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.properties.d */
/* loaded from: classes7.dex */
public interface Interfaces<T, V> {
    V getValue(T t, @NotNull KProperty<?> kProperty);
}
