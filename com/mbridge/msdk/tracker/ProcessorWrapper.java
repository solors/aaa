package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.mbridge.msdk.tracker.p */
/* loaded from: classes6.dex */
public final class ProcessorWrapper implements IEventProcessor {

    /* renamed from: a */
    private final EventProcessor f59888a;

    public ProcessorWrapper(EventProcessor eventProcessor) {
        this.f59888a = eventProcessor;
    }

    @Override // com.mbridge.msdk.tracker.IEventProcessor
    /* renamed from: a */
    public final void mo49359a(C22885e c22885e) {
        if (C22949y.m49289a(this.f59888a)) {
            return;
        }
        this.f59888a.mo49359a(c22885e);
    }

    @Override // com.mbridge.msdk.tracker.IEventProcessor
    /* renamed from: b */
    public final void mo49358b(C22885e c22885e) {
        if (C22949y.m49289a(this.f59888a)) {
            return;
        }
        try {
            EventPropertyDecorate m49589i = c22885e.m49589i();
            if (C22949y.m49286b(m49589i)) {
                c22885e.m49601a(m49589i.mo49580a(c22885e));
            }
            this.f59888a.mo49358b(c22885e);
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "process event error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.IEventProcessor
    /* renamed from: a */
    public final long[] mo49360a() {
        return C22949y.m49289a(this.f59888a) ? new long[]{0, 0} : this.f59888a.mo49360a();
    }
}
