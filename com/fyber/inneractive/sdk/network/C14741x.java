package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.x */
/* loaded from: classes4.dex */
public final class C14741x {

    /* renamed from: a */
    public final JSONObject f27936a = new JSONObject();

    /* renamed from: a */
    public final C14741x m77656a(Object obj, String str) {
        try {
            this.f27936a.put(str, obj);
        } catch (Exception unused) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", str, obj);
        }
        return this;
    }
}
