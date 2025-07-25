package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Function<I, O> {
    @Nullable
    O apply(@NonNull I i);
}
