package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef */
/* loaded from: classes.dex */
public final class Utils {
    @Nullable
    private Object value;

    public Utils(@Nullable Object obj) {
        this.value = obj;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public final void setValue(@Nullable Object obj) {
        this.value = obj;
    }
}
