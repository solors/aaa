package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cv0 {
    @NotNull
    /* renamed from: a */
    public static HashMap m35148a(@NotNull C25606a mediatedAdapter) {
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        HashMap hashMap = new HashMap();
        try {
            MediatedAdapterInfo adapterInfo = mediatedAdapter.getAdapterInfo();
            String adapterVersion = adapterInfo.getAdapterVersion();
            String str = "null";
            if (adapterVersion == null) {
                adapterVersion = "null";
            }
            hashMap.put("mediation_adapter_version", adapterVersion);
            String networkName = adapterInfo.getNetworkName();
            if (networkName == null) {
                networkName = "null";
            }
            hashMap.put("mediation_network_name", networkName);
            String networkSdkVersion = adapterInfo.getNetworkSdkVersion();
            if (networkSdkVersion != null) {
                str = networkSdkVersion;
            }
            hashMap.put("mediation_network_sdk_version", str);
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
        }
        return hashMap;
    }
}
