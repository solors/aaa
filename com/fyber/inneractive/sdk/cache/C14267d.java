package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.config.AbstractC14392k;
import com.fyber.inneractive.sdk.config.C14396o;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.d */
/* loaded from: classes4.dex */
public final class C14267d implements InterfaceC14264a {
    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo77940a(Object obj) {
        C14396o c14396o = (C14396o) obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: b */
    public final String mo77938b() {
        return "IALastModifiedFromHeader.global";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: c */
    public final String mo77937c() {
        return "ia-global.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: d */
    public final boolean mo77936d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final Object mo77939a(String str) {
        try {
            return C14396o.m77917a(new JSONObject(str));
        } catch (JSONException e) {
            IAlog.m76528b("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final String mo77941a() {
        int i = AbstractC14392k.f27223a;
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null ? "https://cdn2.inner-active.mobi/ia-sdk-config/config_android.json" : System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
