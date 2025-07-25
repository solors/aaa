package androidx.compose.p015ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ref.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.node.Ref */
/* loaded from: classes.dex */
public final class Ref<T> {
    public static final int $stable = 8;
    @Nullable
    private T value;

    @Nullable
    public final T getValue() {
        return this.value;
    }

    public final void setValue(@Nullable T t) {
        this.value = t;
    }
}
