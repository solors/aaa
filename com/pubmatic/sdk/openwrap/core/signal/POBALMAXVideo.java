package com.pubmatic.sdk.openwrap.core.signal;

import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: POBALMAXVideo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBALMAXVideo extends POBVideo {
    @NotNull

    /* renamed from: g */
    private final POBVideo.Placement f70750g;
    @NotNull

    /* renamed from: h */
    private final POBVideo.Plcmt f70751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBALMAXVideo(@NotNull POBVideo.Placement placement, @NotNull POBVideo.Plcmt plcmt, @NotNull POBVideo.Linearity linearity, @NotNull POBAdSize adSize) {
        super(placement, plcmt, linearity, adSize);
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(plcmt, "plcmt");
        Intrinsics.checkNotNullParameter(linearity, "linearity");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f70750g = placement;
        this.f70751h = plcmt;
    }

    @NotNull
    public final POBVideo.Placement getPlacement() {
        return this.f70750g;
    }

    @NotNull
    public final POBVideo.Plcmt getPlcmt() {
        return this.f70751h;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBVideo
    @NotNull
    public JSONObject getRTBJson() {
        JSONObject jSONObject = new JSONObject();
        if (this.f70750g == POBVideo.Placement.INTERSTITIAL) {
            jSONObject.put(POBNativeConstants.NATIVE_IMAGE_WIDTH, getAdSize().getAdWidth());
            jSONObject.put("h", getAdSize().getAdHeight());
        }
        if (getCompanionAds() == null) {
            POBBanner pOBBanner = new POBBanner(getAdSize());
            pOBBanner.setAdPosition(getPosition());
            setCompanionAds(new JSONArray(new JSONObject[]{pOBBanner.getRTBJson(new HashSet(), true)}));
        }
        jSONObject.put("companionad", getCompanionAds());
        POBRequest.AdPosition position = getPosition();
        if (position != null) {
            jSONObject.put("pos", position.getValue());
        }
        jSONObject.put("protocols", new JSONArray(POBVideo.PROTOCOLS));
        jSONObject.put(POBNativeConstants.NATIVE_MIMES, new JSONArray(POBVideo.MIMES));
        jSONObject.put("linearity", getLinearity().getValue());
        jSONObject.put("boxingallowed", 1);
        jSONObject.put("delivery", new JSONArray(POBVideo.DELIVERY));
        jSONObject.put("companiontype", new JSONArray(POBVideo.COMPANION_TYPE));
        jSONObject.put("placement", this.f70750g.getValue());
        jSONObject.put("plcmt", this.f70751h.getValue());
        jSONObject.put("playbackend", 1);
        jSONObject.put("startdelay", 0);
        Set<Integer> supportedAPIs = getSupportedAPIs();
        Intrinsics.checkNotNullExpressionValue(supportedAPIs, "getSupportedAPIs()");
        if (!supportedAPIs.isEmpty()) {
            jSONObject.put("api", new JSONArray((Collection) supportedAPIs));
        }
        return jSONObject;
    }
}
