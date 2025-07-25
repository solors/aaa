package com.smaato.sdk.video.vast.buildlight.compare;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.smaato.sdk.video.vast.buildlight.compare.a */
/* loaded from: classes7.dex */
enum VideoQuality {
    LOW(360, 600),
    MEDIUM(576, IronSourceConstants.RV_API_SHOW_CALLED),
    HIGH(720, 2000);
    

    /* renamed from: b */
    public final int f72449b;

    /* renamed from: c */
    public final int f72450c;

    VideoQuality(int i, int i2) {
        this.f72449b = i;
        this.f72450c = i2;
    }
}
