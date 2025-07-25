package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.MediationNetwork;
import com.monetization.ads.common.AdImpressionData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class rw0 {
    @NotNull

    /* renamed from: a */
    private final hw0 f84926a;

    public /* synthetic */ rw0() {
        this(new hw0());
    }

    @Nullable
    /* renamed from: a */
    public final MediationNetwork m29914a(@NotNull JSONObject jsonAsset) {
        Map m17294d;
        Map m17295c;
        AdImpressionData adImpressionData;
        String string;
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonMediationNetwork");
        try {
            xn0.f87755a.getClass();
            String m27451a = xn0.m27451a("adapter", jsonAsset);
            Intrinsics.checkNotNullParameter(jsonAsset, "parent");
            Intrinsics.checkNotNullParameter("network_data", "name");
            JSONObject jSONObject = jsonAsset.getJSONObject("network_data");
            m17294d = MapsJVM.m17294d();
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.m17074g(next);
                String string2 = jSONObject.getString(next);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                m17294d.put(next, string2);
            }
            m17295c = MapsJVM.m17295c(m17294d);
            if (m17295c.isEmpty()) {
                return null;
            }
            List m27448c = xn0.m27448c("click_tracking_urls", jsonAsset);
            List m27448c2 = xn0.m27448c("impression_tracking_urls", jsonAsset);
            List m27448c3 = xn0.m27448c("ad_response_tracking_urls", jsonAsset);
            Map m27450a = xn0.m27450a(jsonAsset);
            if (jsonAsset.has("impression_data")) {
                this.f84926a.getClass();
                Intrinsics.checkNotNullParameter(jsonAsset, "jsonObject");
                Intrinsics.checkNotNullParameter("impression_data", "attributeName");
                try {
                    Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
                    Intrinsics.checkNotNullParameter("impression_data", "jsonAttribute");
                    string = jsonAsset.getString("impression_data");
                    Intrinsics.m17074g(string);
                } catch (Exception unused) {
                    um0.m28727b(new Object[0]);
                }
                if (string.length() != 0 && !Intrinsics.m17075f("null", string)) {
                    adImpressionData = new AdImpressionData(string);
                    return new MediationNetwork(m27451a, m17295c, m27448c2, m27448c, m27448c3, adImpressionData, m27450a);
                }
                throw new JSONException("Json has not required attributes");
            }
            adImpressionData = null;
            return new MediationNetwork(m27451a, m17295c, m27448c2, m27448c, m27448c3, adImpressionData, m27450a);
        } catch (JSONException unused2) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    public rw0(@NotNull hw0 impressionDataParser) {
        Intrinsics.checkNotNullParameter(impressionDataParser, "impressionDataParser");
        this.f84926a = impressionDataParser;
    }
}
