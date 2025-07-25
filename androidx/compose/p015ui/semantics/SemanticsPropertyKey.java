package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey */
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 0;
    @NotNull
    private final Function2<T, T, T> mergePolicy;
    @NotNull
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsProperties.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1 */
    /* loaded from: classes.dex */
    public static final class C10471 extends Lambda implements Function2<T, T, T> {
        public static final C10471 INSTANCE = new C10471();

        C10471() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: invoke */
        public final T mo105910invoke(@Nullable T t, T t2) {
            if (t == null) {
                return t2;
            }
            return t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@NotNull String name, @NotNull Function2<? super T, ? super T, ? extends T> mergePolicy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.name = name;
        this.mergePolicy = mergePolicy;
    }

    @NotNull
    public final Function2<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final T getValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull KProperty<?> property) {
        Object throwSemanticsGetNotSupported;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        throwSemanticsGetNotSupported = SemanticsPropertiesKt.throwSemanticsGetNotSupported();
        return (T) throwSemanticsGetNotSupported;
    }

    @Nullable
    public final T merge(@Nullable T t, T t2) {
        return this.mergePolicy.mo105910invoke(t, t2);
    }

    public final void setValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull KProperty<?> property, T t) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        thisRef.set(this, t);
    }

    @NotNull
    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C10471.INSTANCE : function2);
    }
}
