package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface ImageData {
    @Nullable
    Drawable getImage();

    @Nullable
    Uri getLocalUri();

    @Nullable
    String getRemoteUrl();
}
