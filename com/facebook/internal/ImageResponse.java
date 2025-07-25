package com.facebook.internal;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageResponse.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ImageResponse {
    @Nullable
    private final Bitmap bitmap;
    @Nullable
    private final Exception error;
    private final boolean isCachedRedirect;
    @NotNull
    private final ImageRequest request;

    public ImageResponse(@NotNull ImageRequest request, @Nullable Exception exc, boolean z, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.error = exc;
        this.isCachedRedirect = z;
        this.bitmap = bitmap;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final ImageRequest getRequest() {
        return this.request;
    }

    public final boolean isCachedRedirect() {
        return this.isCachedRedirect;
    }
}
