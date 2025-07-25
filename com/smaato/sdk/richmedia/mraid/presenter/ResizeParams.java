package com.smaato.sdk.richmedia.mraid.presenter;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class ResizeParams {
    @NonNull
    public final Rect maxSizeRectInPx;
    @NonNull
    public final Rect resizeRectInPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResizeParams(@NonNull Rect rect, @NonNull Rect rect2) {
        this.maxSizeRectInPx = (Rect) Objects.requireNonNull(rect);
        this.resizeRectInPx = (Rect) Objects.requireNonNull(rect2);
    }
}
