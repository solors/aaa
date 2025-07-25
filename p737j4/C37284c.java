package p737j4;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Map;
import java.util.Set;

/* compiled from: RelyTaskManager.java */
/* renamed from: j4.c */
/* loaded from: classes6.dex */
public class C37284c {

    /* renamed from: a */
    private final Map<String, Runnable> f98444a;

    /* renamed from: b */
    private final Set<String> f98445b;

    /* compiled from: RelyTaskManager.java */
    /* renamed from: j4.c$b */
    /* loaded from: classes6.dex */
    private static class C37286b {

        /* renamed from: a */
        private static final C37284c f98446a = new C37284c();
    }

    /* renamed from: b */
    public static C37284c m18570b() {
        return C37286b.f98446a;
    }

    /* renamed from: d */
    private void m18568d(String str) {
        synchronized (this) {
            Runnable runnable = this.f98444a.get(str);
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f98444a.remove(str);
            this.f98445b.remove(str);
        }
    }

    /* renamed from: a */
    public void m18571a(String str, Runnable runnable) {
        synchronized (this) {
            if (this.f98444a.containsKey(str)) {
                return;
            }
            this.f98444a.put(str, runnable);
            if (this.f98445b.contains(str)) {
                m18568d(str);
            }
        }
    }

    /* renamed from: c */
    public void m18569c(String str) {
        synchronized (this) {
            if (this.f98445b.contains(str)) {
                return;
            }
            this.f98445b.add(str);
            m18568d(str);
        }
    }

    private C37284c() {
        this.f98444a = new ArrayMap();
        this.f98445b = new ArraySet();
    }
}
