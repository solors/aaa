package com.unity3d.scar.adapter.common;

/* renamed from: com.unity3d.scar.adapter.common.a */
/* loaded from: classes7.dex */
public class DispatchGroup {

    /* renamed from: a */
    private int f74906a = 0;

    /* renamed from: b */
    private Runnable f74907b;

    /* renamed from: d */
    private void m37581d() {
        Runnable runnable;
        if (this.f74906a <= 0 && (runnable = this.f74907b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public synchronized void m37584a() {
        this.f74906a++;
    }

    /* renamed from: b */
    public synchronized void m37583b() {
        this.f74906a--;
        m37581d();
    }

    /* renamed from: c */
    public void m37582c(Runnable runnable) {
        this.f74907b = runnable;
        m37581d();
    }
}
