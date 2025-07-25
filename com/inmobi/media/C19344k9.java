package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.k9 */
/* loaded from: classes6.dex */
public final class C19344k9 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object obj;
        Picasso picasso;
        WeakReference m60059a;
        List list;
        List list2;
        Picasso picasso2;
        Picasso picasso3;
        Intrinsics.checkNotNullParameter(activity, "activity");
        obj = C19358l9.f48480c;
        synchronized (obj) {
            picasso = C19358l9.f48479b;
            if (picasso != null && (m60059a = C19358l9.m60059a(C19358l9.f48478a, activity)) != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                list = C19358l9.f48481d;
                list.remove(m60059a);
                list2 = C19358l9.f48481d;
                if (list2.isEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(C19358l9.m60054d(), "access$getTAG$p(...)");
                    picasso2 = C19358l9.f48479b;
                    Objects.toString(picasso2);
                    picasso3 = C19358l9.f48479b;
                    if (picasso3 != null) {
                        picasso3.shutdown();
                    }
                    C19358l9.f48479b = null;
                }
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
