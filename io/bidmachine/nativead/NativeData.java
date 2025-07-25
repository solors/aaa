package io.bidmachine.nativead;

import androidx.annotation.Nullable;
import io.bidmachine.ImageData;

/* loaded from: classes9.dex */
public interface NativeData extends NativePublicData {
    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ String getCallToAction();

    @Nullable
    String getClickUrl();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ String getDescription();

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* synthetic */ ImageData getIcon();

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* synthetic */ ImageData getMainImage();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ float getRating();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ String getTitle();

    @Nullable
    String getVideoAdm();

    @Nullable
    String getVideoUrl();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ boolean hasVideo();
}
