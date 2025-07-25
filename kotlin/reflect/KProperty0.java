package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KProperty.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KProperty0<V> extends KProperty<V>, Functions<V> {

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Getter<V> extends KProperty.Getter<V>, Functions<V> {
        @Override // kotlin.jvm.functions.Functions
        /* synthetic */ Object invoke();
    }

    V get();

    @Nullable
    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<V> getGetter();

    /* synthetic */ Object invoke();

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }
}
