package com.yandex.div.core;

import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import p671fb.ExpressionResolver;
import p789m9.LoadReference;
import p833p9.DivStatePath;

/* renamed from: com.yandex.div.core.c0 */
/* loaded from: classes8.dex */
public interface DivViewFacade {
    @NonNull
    default ExpressionResolver getExpressionResolver() {
        return ExpressionResolver.f90406b;
    }

    @NonNull
    View getView();

    default void showTooltip(@NonNull String str) {
    }

    default void switchToState(@IntRange(from = 0) long j) {
        switchToState(j, true);
    }

    void switchToState(@IntRange(from = 0) long j, boolean z);

    default void showTooltip(@NonNull String str, boolean z) {
        showTooltip(str);
    }

    default void switchToState(@NonNull DivStatePath divStatePath, boolean z) {
        switchToState(divStatePath.m13240i(), z);
    }

    default void hideTooltip(@NonNull String str) {
    }

    @Deprecated
    default void addImageLoadReference(@NonNull LoadReference loadReference, @NonNull View view) {
    }
}
