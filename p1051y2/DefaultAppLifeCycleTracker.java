package p1051y2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p809o2.HSPluginEventBridge;

/* renamed from: y2.b */
/* loaded from: classes5.dex */
public class DefaultAppLifeCycleTracker extends BaseLifeCycleTracker implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    private int f118447c;

    /* renamed from: d */
    private int f118448d;

    /* renamed from: f */
    private boolean f118449f;

    /* renamed from: g */
    private boolean f118450g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultAppLifeCycleTracker(Application application, HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        super(hSAppLifeCycleEventsHandler);
        this.f118450g = false;
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
        if (HSPluginEventBridge.m13989c()) {
            this.f118447c++;
            this.f118449f = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f118447c++;
        if (!this.f118450g) {
            if (!this.f118449f) {
                m1097b();
            }
            this.f118449f = true;
        }
        this.f118450g = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        boolean z = true;
        this.f118448d++;
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        this.f118450g = z;
        if (!z && this.f118447c == this.f118448d) {
            this.f118449f = false;
            m1098a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
