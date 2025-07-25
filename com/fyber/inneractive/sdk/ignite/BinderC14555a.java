package com.fyber.inneractive.sdk.ignite;

import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C15505S;

/* renamed from: com.fyber.inneractive.sdk.ignite.a */
/* loaded from: classes4.dex */
public final class BinderC14555a extends IIgniteServiceCallback.Stub {

    /* renamed from: a */
    public final C15505S f27582a;

    public BinderC14555a(C15505S c15505s) {
        this.f27582a = c15505s;
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        IAlog.m76529a("CancelTaskCallback onError %s", str);
        this.f27582a.m76415a(false);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        IAlog.m76529a("CancelTaskCallback onProgress %s", str);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        IAlog.m76529a("CancelTaskCallback onScheduled %s", str);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.m76529a("CancelTaskCallback onStart %s", str);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        IAlog.m76529a("CancelTaskCallback onSuccess %s", str);
        this.f27582a.m76415a(true);
    }
}
