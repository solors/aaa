package com.inmobi.media;

import android.os.Debug;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a */
/* loaded from: classes6.dex */
public final class RunnableC19194a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C19208b f48061a;

    public RunnableC19194a(C19208b c19208b) {
        this.f48061a = c19208b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f48061a.f48075d.get()) {
            if (this.f48061a.f48077f.hasMessages(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT)) {
                this.f48061a.f48077f.removeMessages(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT);
                this.f48061a.getClass();
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f48061a.f48076e.get()) {
                    StackTraceElement[] m60492a = C19208b.m60492a(this.f48061a);
                    InterfaceC19132V2 interfaceC19132V2 = this.f48061a.f47884a;
                    Intrinsics.m17074g(m60492a);
                    ((C19158X2) interfaceC19132V2).m60566a(new C19529xc(m60492a));
                }
            }
            this.f48061a.f48076e.getAndSet(true);
            this.f48061a.f48077f.sendEmptyMessage(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT);
        }
    }
}
