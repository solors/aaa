package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KProperty.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KProperty1<T, V> extends KProperty<V>, Function1<T, V> {

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Getter<T, V> extends KProperty.Getter<V>, Function1<T, V> {
        @Override // kotlin.jvm.functions.Function1
        /* synthetic */ Object invoke(Object obj);
    }

    V get(T t);

    @Nullable
    Object getDelegate(T t);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<T, V> getGetter();

    /* synthetic */ Object invoke(Object obj);

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }
}
