package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.H4 */
/* loaded from: classes6.dex */
public final class RunnableC18948H4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f47308a;

    public RunnableC18948H4(JSONObject jSONObject) {
        this.f47308a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Boolean m61047c = C18955Hb.f47329a.m61047c();
        if (m61047c != null) {
            z = m61047c.booleanValue();
        } else {
            z = true;
        }
        if (z) {
            InMobiUnifiedIdService.reset();
        }
        if (z) {
            return;
        }
        AbstractC19031N4.m60858a(this.f47308a);
    }
}
