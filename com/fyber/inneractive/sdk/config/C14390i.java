package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.config.i */
/* loaded from: classes4.dex */
public final class C14390i {

    /* renamed from: a */
    public final Context f27221a;

    /* renamed from: b */
    public WeakReference f27222b;

    public C14390i(Context context, Context context2) {
        C14389h c14389h = new C14389h(this);
        this.f27221a = context2;
        if (context instanceof Activity) {
            this.f27222b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(c14389h);
        }
    }

    /* renamed from: a */
    public final Context m77924a() {
        Context context = (Context) AbstractC15471s.m76459a(this.f27222b);
        if (context == null) {
            return this.f27221a;
        }
        return context;
    }
}
