package com.mbridge.msdk.video.module.p530a.p531a;

import com.mbridge.msdk.video.module.p530a.OnNotifyListener;

/* renamed from: com.mbridge.msdk.video.module.a.a.i */
/* loaded from: classes6.dex */
public class ProxyOnNotifyListener extends DefaultOnNotifyListener {

    /* renamed from: b */
    protected OnNotifyListener f60810b;

    public ProxyOnNotifyListener(OnNotifyListener onNotifyListener) {
        this.f60810b = onNotifyListener;
    }

    @Override // com.mbridge.msdk.video.module.p530a.p531a.DefaultOnNotifyListener, com.mbridge.msdk.video.module.p530a.OnNotifyListener
    /* renamed from: a */
    public void mo48633a(int i, Object obj) {
        super.mo48633a(i, obj);
        OnNotifyListener onNotifyListener = this.f60810b;
        if (onNotifyListener != null) {
            onNotifyListener.mo48633a(i, obj);
        }
    }
}
