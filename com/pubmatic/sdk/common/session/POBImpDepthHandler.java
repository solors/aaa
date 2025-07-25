package com.pubmatic.sdk.common.session;

import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.session.POBAppSessionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBImpDepthHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBImpDepthHandler implements POBImpDepthHandling, POBAppSessionHandler.POBAppSessionListener {
    @NotNull

    /* renamed from: a */
    private POBAppSessionHandling f70262a;
    @NotNull

    /* renamed from: b */
    private Map<POBAdFormat, Integer> f70263b;

    public POBImpDepthHandler(@NotNull POBAppSessionHandling sessionHandler) {
        Intrinsics.checkNotNullParameter(sessionHandler, "sessionHandler");
        this.f70262a = sessionHandler;
        this.f70263b = new LinkedHashMap();
    }

    @Override // com.pubmatic.sdk.common.session.POBImpDepthHandling
    public int getImpressions(@NotNull POBAdFormat placementType) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Integer num = this.f70263b.get(placementType);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.pubmatic.sdk.common.session.POBImpDepthHandling
    public void initiate() {
        this.f70262a.addAppSessionListener(this);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppSessionHandler.POBAppSessionListener
    public void onAppSessionReset() {
        this.f70263b.clear();
    }

    @Override // com.pubmatic.sdk.common.session.POBAppSessionHandler.POBAppSessionListener
    public void onAppSessionStarted() {
        this.f70263b.clear();
    }

    @Override // com.pubmatic.sdk.common.session.POBImpDepthHandling
    public void recordImpression(@NotNull POBAdFormat placementType) {
        int i;
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Map<POBAdFormat, Integer> map = this.f70263b;
        Integer num = map.get(placementType);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        map.put(placementType, Integer.valueOf(i + 1));
    }
}
