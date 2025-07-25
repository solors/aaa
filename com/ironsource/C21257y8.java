package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.y8 */
/* loaded from: classes6.dex */
public class C21257y8 {

    /* renamed from: a */
    MutableContextWrapper f54566a;

    /* renamed from: a */
    public Activity m54018a() {
        return (Activity) this.f54566a.getBaseContext();
    }

    /* renamed from: b */
    public synchronized void m54016b() {
        this.f54566a = null;
    }

    /* renamed from: a */
    public synchronized void m54017a(Activity activity) {
        if (this.f54566a == null) {
            this.f54566a = new MutableContextWrapper(activity);
        }
        this.f54566a.setBaseContext(activity);
    }
}
