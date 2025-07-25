package p682g5;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Map;
import java.util.Set;

/* compiled from: RelyTaskManager.java */
/* renamed from: g5.c */
/* loaded from: classes6.dex */
public class C33205c {

    /* renamed from: a */
    private final Map<String, Runnable> f90755a;

    /* renamed from: b */
    private final Set<String> f90756b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RelyTaskManager.java */
    /* renamed from: g5.c$b */
    /* loaded from: classes6.dex */
    public static class C33207b {

        /* renamed from: a */
        private static final C33205c f90757a = new C33205c();
    }

    /* renamed from: b */
    public static C33205c m24302b() {
        return C33207b.f90757a;
    }

    /* renamed from: d */
    private void m24300d(String str) {
        synchronized (this) {
            Runnable runnable = this.f90755a.get(str);
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f90755a.remove(str);
            this.f90756b.remove(str);
        }
    }

    /* renamed from: a */
    public void m24303a(String str, Runnable runnable) {
        synchronized (this) {
            if (this.f90755a.containsKey(str)) {
                return;
            }
            this.f90755a.put(str, runnable);
            if (this.f90756b.contains(str)) {
                m24300d(str);
            }
        }
    }

    /* renamed from: c */
    public void m24301c(String str) {
        synchronized (this) {
            if (this.f90756b.contains(str)) {
                return;
            }
            this.f90756b.add(str);
            m24300d(str);
        }
    }

    private C33205c() {
        this.f90755a = new ArrayMap();
        this.f90756b = new ArraySet();
    }
}
