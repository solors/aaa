package p682g5;

import android.app.Activity;
import java.util.List;

/* renamed from: g5.a */
/* loaded from: classes6.dex */
public class DisObserveActivityManager {

    /* renamed from: a */
    private List<Class<? extends Activity>> f90748a;

    /* compiled from: DisObserveActivityManager.java */
    /* renamed from: g5.a$b */
    /* loaded from: classes6.dex */
    private static class C33201b {

        /* renamed from: a */
        private static final DisObserveActivityManager f90749a = new DisObserveActivityManager();
    }

    /* renamed from: a */
    public static DisObserveActivityManager m24317a() {
        return C33201b.f90749a;
    }

    /* renamed from: b */
    public boolean m24316b(Class<? extends Activity> cls) {
        List<Class<? extends Activity>> list;
        if (cls != null && (list = this.f90748a) != null) {
            return list.contains(cls);
        }
        return false;
    }

    private DisObserveActivityManager() {
    }
}
