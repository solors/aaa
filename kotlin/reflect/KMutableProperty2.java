package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: KProperty.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, InterfaceC45268n<D, E, V, Unit> {
        @Override // p1076zd.InterfaceC45268n
        /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<D, E, V> getSetter();

    @Override // kotlin.reflect.KProperty2, kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    /* synthetic */ Object mo105910invoke(Object obj, Object obj2);

    void set(D d, E e, V v);

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }
}
