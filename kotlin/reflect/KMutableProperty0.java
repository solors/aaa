package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: KProperty.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Setter<V> extends KMutableProperty.Setter<V>, Function1<V, Unit> {
        @Override // kotlin.jvm.functions.Function1
        /* synthetic */ Unit invoke(Object obj);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<V> getSetter();

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.functions.Functions
    /* synthetic */ Object invoke();

    void set(V v);

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }
}
