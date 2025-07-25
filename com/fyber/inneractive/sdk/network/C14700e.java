package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.network.e */
/* loaded from: classes4.dex */
public final class C14700e implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ String f27861a;

    /* renamed from: b */
    public final /* synthetic */ JSONArray f27862b;

    /* renamed from: c */
    public final /* synthetic */ long f27863c;

    public C14700e(String str, JSONArray jSONArray, long j) {
        this.f27861a = str;
        this.f27862b = jSONArray;
        this.f27863c = j;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m76529a("Event Request: Hitting URL finished: %s, body: %s", this.f27861a, this.f27862b);
        if (exc == null) {
            IAlog.m76529a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m76529a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.m76529a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f27863c));
    }
}
