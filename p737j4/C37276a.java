package p737j4;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: DisObserveActivityManager.java */
/* renamed from: j4.a */
/* loaded from: classes6.dex */
public class C37276a {

    /* renamed from: a */
    private List<Class<? extends Activity>> f98435a;

    /* compiled from: DisObserveActivityManager.java */
    /* renamed from: j4.a$b */
    /* loaded from: classes6.dex */
    private static class C37278b {

        /* renamed from: a */
        private static final C37276a f98436a = new C37276a();
    }

    /* renamed from: b */
    public static C37276a m18592b() {
        return C37278b.f98436a;
    }

    @SafeVarargs
    /* renamed from: a */
    public final void m18593a(Class<? extends Activity>... clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            if (this.f98435a == null) {
                this.f98435a = new ArrayList();
            }
            this.f98435a.addAll(new ArrayList(Arrays.asList(clsArr)));
            return;
        }
        throw new NullPointerException("addDisObserveActivity method parameter cannot be empty or null");
    }

    /* renamed from: c */
    public boolean m18591c(Class<? extends Activity> cls) {
        List<Class<? extends Activity>> list;
        if (cls != null && (list = this.f98435a) != null) {
            return list.contains(cls);
        }
        return false;
    }

    private C37276a() {
    }
}
