package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;
import com.ironsource.C21114v8;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public enum zzfkx {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(BuildConfig.VERSION_NAME),
    LOADED(C21114v8.C21122h.f54087r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(MRAIDCommunicatorUtil.KEY_VIEWABLE),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String zzj;

    zzfkx(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
