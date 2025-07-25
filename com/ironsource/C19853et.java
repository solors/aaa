package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.et */
/* loaded from: classes6.dex */
public final class C19853et {
    @NotNull

    /* renamed from: a */
    public static final C19853et f49957a = new C19853et();
    @NotNull

    /* renamed from: b */
    private static final String f49958b = ",";
    @NotNull

    /* renamed from: c */
    private static final String f49959c = "[";
    @NotNull

    /* renamed from: d */
    private static final String f49960d = "]";

    private C19853et() {
    }

    @NotNull
    /* renamed from: a */
    public final AdInfo m58749a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auctionId", levelPlayAdInfo.getAuctionId());
        jSONObject.put("adUnit", levelPlayAdInfo.getAdFormat());
        jSONObject.put("country", levelPlayAdInfo.getCountry());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, levelPlayAdInfo.getAb());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, levelPlayAdInfo.getSegmentName());
        jSONObject.put("placement", levelPlayAdInfo.getPlacementName());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, levelPlayAdInfo.getAdNetwork());
        jSONObject.put("instanceName", levelPlayAdInfo.getInstanceName());
        jSONObject.put("instanceId", levelPlayAdInfo.getInstanceId());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_PRECISION, levelPlayAdInfo.getPrecision());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, levelPlayAdInfo.getEncryptedCPM());
        jSONObject.put("revenue", levelPlayAdInfo.getRevenue());
        return new AdInfo(new ImpressionData(jSONObject));
    }

    @NotNull
    /* renamed from: b */
    public final String m58745b(@NotNull List<? extends Object> methodArgs) {
        String m16546w0;
        String m58748a;
        Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (obj instanceof List) {
                m58748a = f49957a.m58747a((List) obj);
            } else {
                m58748a = f49957a.m58748a(obj);
            }
            sb2.append(m58748a);
            str = sb2.toString() + ',';
        }
        m16546w0 = C37690r.m16546w0(str, ",");
        return m16546w0;
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58750a(@NotNull LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    /* renamed from: a */
    private final String m58748a(Object obj) {
        if (obj instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\'');
            sb2.append(obj);
            sb2.append('\'');
            return sb2.toString();
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private final String m58747a(List<?> list) {
        String m16546w0;
        Iterator<T> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = str + f49957a.m58748a(it.next()) + ',';
        }
        m16546w0 = C37690r.m16546w0(str, ",");
        return m16546w0 + ']';
    }

    @NotNull
    /* renamed from: a */
    public final List<Object> m58746a(@NotNull Object... items) {
        List<Object> m17163p;
        Intrinsics.checkNotNullParameter(items, "items");
        m17163p = C37563v.m17163p(Arrays.copyOf(items, items.length));
        return m17163p;
    }
}
