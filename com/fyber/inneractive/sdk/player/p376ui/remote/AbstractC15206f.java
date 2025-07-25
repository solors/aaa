package com.fyber.inneractive.sdk.player.p376ui.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.C14741x;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.web.remoteui.EnumC15542a;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.player.ui.remote.f */
/* loaded from: classes4.dex */
public abstract class AbstractC15206f {
    /* renamed from: a */
    public static void m77072a(EnumC15542a enumC15542a, String str, InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e, HashMap hashMap, boolean z) {
        C14740w c14740w = new C14740w(EnumC14730t.VAST_ERROR_DVC_FAILURE, inneractiveAdRequest, abstractC15386e);
        C14741x c14741x = new C14741x();
        c14741x.m77656a(Boolean.valueOf(z), "loaded_from_cache");
        c14741x.m77656a(enumC15542a.name(), "errorCode");
        c14741x.m77656a(str, "templateURL");
        if (hashMap != null && !hashMap.isEmpty()) {
            for (String str2 : hashMap.keySet()) {
                String str3 = (String) hashMap.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    c14741x.m77656a(str3, str2);
                }
            }
        }
        c14740w.f27934f.put(c14741x.f27936a);
        c14740w.m77658a((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.fyber.inneractive.sdk.network.x] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* renamed from: a */
    public static void m77073a(EnumC15542a enumC15542a, InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e, String str, String str2, Boolean bool) {
        C14740w c14740w = new C14740w(EnumC14730t.VAST_ERROR_DVC_FAILURE, inneractiveAdRequest, abstractC15386e);
        ?? c14741x = new C14741x();
        c14741x.m77656a(enumC15542a.name(), "errorCode");
        if (!TextUtils.isEmpty(str2)) {
            c14741x.m77656a(str2, "templateURL");
        }
        if (bool == 0) {
            bool = "N/A";
        }
        c14741x.m77656a(bool, "loaded_from_cache");
        if (!TextUtils.isEmpty(str)) {
            c14741x.m77656a(str, "error");
        }
        c14740w.f27934f.put(c14741x.f27936a);
        c14740w.m77658a((String) null);
    }
}
