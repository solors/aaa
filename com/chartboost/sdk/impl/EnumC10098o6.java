package com.chartboost.sdk.impl;

import com.google.firebase.ktx.BuildConfig;
import com.ironsource.C21114v8;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* renamed from: com.chartboost.sdk.impl.o6 */
/* loaded from: classes3.dex */
public enum EnumC10098o6 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(BuildConfig.VERSION_NAME),
    LOADED(C21114v8.C21122h.f54087r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(MRAIDCommunicatorUtil.KEY_VIEWABLE),
    AUDIBLE("audible"),
    OTHER("other");
    

    /* renamed from: b */
    public final String f22860b;

    EnumC10098o6(String str) {
        this.f22860b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f22860b;
    }
}
