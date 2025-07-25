package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.inmobi.media.C19027N0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.N0 */
/* loaded from: classes6.dex */
public final class C19027N0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final HandlerC19000L0 f47536a;

    /* renamed from: b */
    public WeakReference f47537b;

    /* renamed from: c */
    public final /* synthetic */ Context f47538c;

    public C19027N0(Context context) {
        this.f47538c = context;
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
        this.f47536a = new HandlerC19000L0(mainLooper);
    }

    /* renamed from: a */
    public static final void m60860a(Context context, C19027N0 this$0) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((!C19040O0.m60840a(C19040O0.f47574a, context)) && this$0.f47537b == null) {
            this$0.f47536a.sendEmptyMessageDelayed(1001, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f47537b;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (!Intrinsics.m17075f(activity2, activity)) {
            this.f47537b = new WeakReference(activity);
        }
        this.f47536a.removeMessages(1001);
        this.f47536a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Activity activity2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f47537b;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (!Intrinsics.m17075f(activity2, activity)) {
            this.f47537b = new WeakReference(activity);
        }
        this.f47536a.removeMessages(1001);
        this.f47536a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Activity activity2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f47537b;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (Intrinsics.m17075f(activity2, activity)) {
            this.f47536a.sendEmptyMessageDelayed(1001, 3000L);
        } else if (this.f47537b == null) {
            final Context context = this.f47538c;
            C18954Ha.m61079a(new Runnable() { // from class: o3.a1
                @Override // java.lang.Runnable
                public final void run() {
                    C19027N0.m60860a(context, this);
                }
            });
        }
    }
}
