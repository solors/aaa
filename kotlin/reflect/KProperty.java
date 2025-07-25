package kotlin.reflect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: KProperty.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KProperty<V> extends KCallable<V> {

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Accessor<V> {
        @NotNull
        KProperty<V> getProperty();
    }

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    @NotNull
    Getter<V> getGetter();

    boolean isConst();

    boolean isLateinit();

    /* compiled from: KProperty.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }

        public static /* synthetic */ void isConst$annotations() {
        }

        public static /* synthetic */ void isLateinit$annotations() {
        }
    }
}
