package com.mobilefuse.sdk.network.model;

import com.google.common.net.HttpHeaders;
import com.mobilefuse.sdk.MobileFuseSetting;
import com.mobilefuse.sdk.MobileFuseSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.model.MfxBidRequestGetHeadersKt */
/* loaded from: classes7.dex */
public final class MfxBidRequestGetHeaders {
    @NotNull
    public static final Map<String, String> getHeaders(@NotNull MfxBidRequest headers) {
        boolean z;
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String override = MobileFuseSettings.getOverride(MobileFuseSetting.IP_ADDRESS);
        if (override != null) {
            if (override.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Tuples m14532a = C38513v.m14532a(HttpHeaders.X_FORWARDED_FOR, override);
                linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
            }
        }
        return linkedHashMap;
    }
}
