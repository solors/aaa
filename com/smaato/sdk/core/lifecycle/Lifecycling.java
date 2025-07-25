package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes7.dex */
public abstract class Lifecycling {
    /* renamed from: of */
    public static Lifecycle m39519of(View view) {
        return new ViewLifecycle(view);
    }

    public static Lifecycle wrap(LifecycleOwner lifecycleOwner) {
        return new AndroidXLifecycle(lifecycleOwner);
    }

    /* renamed from: of */
    public static Lifecycle m39520of(Activity activity) {
        return new ActivityLifecycle(activity);
    }
}
