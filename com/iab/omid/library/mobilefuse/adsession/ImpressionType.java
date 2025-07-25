package com.iab.omid.library.mobilefuse.adsession;

import com.google.firebase.ktx.BuildConfig;
import com.ironsource.C21114v8;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* loaded from: classes6.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(BuildConfig.VERSION_NAME),
    LOADED(C21114v8.C21122h.f54087r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(MRAIDCommunicatorUtil.KEY_VIEWABLE),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.impressionType;
    }
}
