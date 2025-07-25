package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.MediationNetwork;
import com.monetization.ads.mediation.banner.MediatedBannerSize;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class lw0 {
    @Nullable
    /* renamed from: a */
    public static JSONObject m32193a(@NotNull MediationNetwork mediationNetwork, @NotNull String bidderToken, @Nullable MediatedBannerSize mediatedBannerSize) {
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
        String m44556e = mediationNetwork.m44556e();
        Map<String, String> m44555f = mediationNetwork.m44555f();
        Map<String, String> m44552i = mediationNetwork.m44552i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adapter", m44556e);
            if (m44555f != null) {
                jSONObject.put("bidding_info", new JSONObject(m44555f));
            }
            jSONObject.put("network_data", new JSONObject(m44552i));
            jSONObject.put("bidder_token", bidderToken);
            if (mediatedBannerSize != null) {
                jSONObject.put("size", new JSONObject(mediatedBannerSize.toSizeData()));
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }
}
