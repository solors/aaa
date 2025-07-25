package p1054y5;

import android.app.Activity;
import android.app.Application;
import com.meevii.adsdk.common.AdRelyTaskManager;
import com.meevii.adsdk.common.AppStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: y5.c */
/* loaded from: classes6.dex */
public class AdLifecycleManager {

    /* renamed from: a */
    private volatile boolean f118476a;

    /* renamed from: b */
    private List<Class<? extends Activity>> f118477b;

    /* renamed from: c */
    private volatile boolean f118478c;

    /* renamed from: d */
    private Application f118479d;

    /* compiled from: AdLifecycleManager.java */
    /* renamed from: y5.c$a */
    /* loaded from: classes6.dex */
    class C45032a extends C45034c {
        C45032a() {
        }

        @Override // p1054y5.AdLifecycleManager.C45034c, com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onActivityCreated(Activity activity) {
            super.onActivityCreated(activity);
            if (!AdLifecycleManager.this.f118476a && AdLifecycleManager.this.m1064h(activity.getClass())) {
                AdRelyTaskManager.getInstance().markTaskCanDeal("task_key_app_enter_front");
                AdLifecycleManager.this.f118476a = true;
                AppStatus.getInstance().removeAppStatusListener(this);
            }
        }
    }

    /* compiled from: AdLifecycleManager.java */
    /* renamed from: y5.c$b */
    /* loaded from: classes6.dex */
    private static class C45033b {

        /* renamed from: a */
        private static final AdLifecycleManager f118481a = new AdLifecycleManager();
    }

    /* renamed from: e */
    public static AdLifecycleManager m1067e() {
        return C45033b.f118481a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m1064h(Class<? extends Activity> cls) {
        List<Class<? extends Activity>> list;
        if (cls == null || (list = this.f118477b) == null) {
            return true;
        }
        return !list.contains(cls);
    }

    @SafeVarargs
    /* renamed from: d */
    public final void m1068d(Class<? extends Activity>... clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            if (this.f118477b == null) {
                this.f118477b = new ArrayList();
            }
            this.f118477b.addAll(new ArrayList(Arrays.asList(clsArr)));
            return;
        }
        throw new NullPointerException("addDisableUpdateAdConfigActivity method parameter cannot be empty or null");
    }

    /* renamed from: f */
    public Application m1066f() {
        return this.f118479d;
    }

    /* renamed from: g */
    public void m1065g(Application application) {
        if (this.f118478c || application == null) {
            return;
        }
        this.f118479d = application;
        AppStatus.getInstance().addAppStatusListener(new C45032a());
        AppStatus.getInstance().observeActivityLifeCycle(application);
        this.f118478c = true;
    }

    /* compiled from: AdLifecycleManager.java */
    /* renamed from: y5.c$c */
    /* loaded from: classes6.dex */
    public static class C45034c implements AppStatus.AppStatusListener {
        @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onBackToForeground() {
        }

        @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onBackground() {
        }

        @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onActivityCreated(Activity activity) {
        }

        @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onActivityPaused(Activity activity) {
        }

        @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
        public void onActivityResumed(Activity activity) {
        }
    }
}
