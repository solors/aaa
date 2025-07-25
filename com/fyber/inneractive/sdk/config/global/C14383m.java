package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.cache.InterfaceC14264a;
import com.fyber.inneractive.sdk.config.AbstractC14392k;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.m */
/* loaded from: classes4.dex */
public final class C14383m implements InterfaceC14264a {
    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo77940a(Object obj) {
        C14382l c14382l = (C14382l) obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: b */
    public final String mo77938b() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: c */
    public final String mo77937c() {
        return "ia-remote.config";
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
            return C14382l.m77942a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.m76528b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f30554a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final String mo77941a() {
        int i = AbstractC14392k.f27223a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") == null) {
            Locale locale = Locale.ENGLISH;
            return "https://cdn2.inner-active.mobi/ia-sdk-config/features_config.json";
        }
        return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }
}
