package sg.bigo.ads.api.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sg.bigo.ads.api.core.a */
/* loaded from: classes10.dex */
public final class C43545a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private WeakReference<Activity> f114068a;

    /* renamed from: b */
    private final List<WeakReference<InterfaceC43547a>> f114069b;

    /* renamed from: sg.bigo.ads.api.core.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43547a {
        /* renamed from: a */
        void mo3292a();

        /* renamed from: b */
        void mo3289b();
    }

    /* renamed from: sg.bigo.ads.api.core.a$b */
    /* loaded from: classes10.dex */
    static class C43548b {

        /* renamed from: a */
        private static final C43545a f114072a = new C43545a((byte) 0);
    }

    private C43545a() {
        this.f114069b = new ArrayList();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        for (WeakReference<InterfaceC43547a> weakReference : this.f114069b) {
            weakReference.get();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        for (WeakReference<InterfaceC43547a> weakReference : this.f114069b) {
            weakReference.get();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        for (WeakReference<InterfaceC43547a> weakReference : this.f114069b) {
            InterfaceC43547a interfaceC43547a = weakReference.get();
            if (interfaceC43547a != null) {
                interfaceC43547a.mo3289b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f114068a = new WeakReference<>(activity);
        for (WeakReference<InterfaceC43547a> weakReference : this.f114069b) {
            InterfaceC43547a interfaceC43547a = weakReference.get();
            if (interfaceC43547a != null) {
                interfaceC43547a.mo3292a();
            }
        }
    }

    /* synthetic */ C43545a(byte b) {
        this();
    }

    /* renamed from: a */
    public static C43545a m5422a() {
        return C43548b.f114072a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
