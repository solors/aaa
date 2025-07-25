package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.m */
/* loaded from: classes6.dex */
public class C20301m implements InterfaceC20064hu {

    /* renamed from: a */
    private WeakReference<Activity> f51075a;

    public C20301m(Activity activity) {
        this.f51075a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC20064hu
    /* renamed from: a */
    public void mo57334a() {
        Activity activity = this.f51075a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
