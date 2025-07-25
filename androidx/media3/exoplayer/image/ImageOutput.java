package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface ImageOutput {
    void onDisabled();

    void onImageAvailable(long j, Bitmap bitmap);
}
