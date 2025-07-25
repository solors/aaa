package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: KProperty.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Setter<T, V> extends KMutableProperty.Setter<V>, Function2<T, V, Unit> {
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        /* synthetic */ Unit mo105910invoke(Object obj, Object obj2);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<T, V> getSetter();

    @Override // kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1
    /* synthetic */ Object invoke(Object obj);

    void set(T t, V v);

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }
}
