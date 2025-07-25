package io.bidmachine.nativead;

import androidx.annotation.Nullable;
import io.bidmachine.ImageData;

/* loaded from: classes9.dex */
public interface NativePublicData {
    String getCallToAction();

    String getDescription();

    @Nullable
    ImageData getIcon();

    @Nullable
    ImageData getMainImage();

    float getRating();

    String getTitle();

    boolean hasVideo();
}
