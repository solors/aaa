package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* renamed from: com.applovin.impl.r */
/* loaded from: classes2.dex */
public abstract class AbstractC5223r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.r$a */
    /* loaded from: classes2.dex */
    public class C5224a extends AbstractC5096p {

        /* renamed from: a */
        final /* synthetic */ Class f9267a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5225b f9268b;

        /* renamed from: c */
        final /* synthetic */ C5163q f9269c;

        C5224a(Class cls, InterfaceC5225b interfaceC5225b, C5163q c5163q) {
            this.f9267a = cls;
            this.f9268b = interfaceC5225b;
            this.f9269c = c5163q;
        }

        @Override // com.applovin.impl.AbstractC5096p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f9267a.isInstance(activity)) {
                this.f9268b.mo93279a(activity);
            }
        }

        @Override // com.applovin.impl.AbstractC5096p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f9267a.isInstance(activity) && !activity.isChangingConfigurations()) {
                this.f9269c.m96474b(this);
            }
        }
    }

    /* renamed from: com.applovin.impl.r$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5225b {
        /* renamed from: a */
        void mo93279a(Activity activity);
    }

    /* renamed from: a */
    public static Activity m96216a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m96215a(boolean z, Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (z && AbstractC5947z3.m92542b()) {
            insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                systemBars = WindowInsets.Type.systemBars();
                insetsController.hide(systemBars);
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: a */
    public static boolean m96219a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (AbstractC5947z3.m92538d() && activity.isDestroyed());
    }

    /* renamed from: a */
    public static void m96218a(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m96217a(Context context, Class cls, C5163q c5163q, InterfaceC5225b interfaceC5225b) {
        c5163q.m96476a(new C5224a(cls, interfaceC5225b, c5163q));
        m96218a(context, cls);
    }
}
