package com.mbridge.msdk.p409b.p410a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.b.a.a */
/* loaded from: classes6.dex */
public final class PreloadListenerEx implements PreloadListener {

    /* renamed from: a */
    WeakReference<PreloadListener> f55064a;

    /* renamed from: b */
    private int f55065b = 0;

    /* renamed from: c */
    private boolean f55066c = false;

    public PreloadListenerEx(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f55064a = new WeakReference<>(preloadListener);
        }
    }

    /* renamed from: a */
    public final boolean m53519a() {
        return this.f55066c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f55064a;
        if (weakReference != null && weakReference.get() != null) {
            this.f55064a.get().onPreloadFaild(str);
        }
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f55064a;
        if (weakReference != null && weakReference.get() != null) {
            this.f55064a.get().onPreloadSucceed();
        }
    }

    /* renamed from: a */
    public final void m53518a(boolean z) {
        this.f55066c = z;
    }
}
