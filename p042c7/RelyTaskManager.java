package p042c7;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Map;
import java.util.Set;

/* renamed from: c7.a */
/* loaded from: classes5.dex */
public class RelyTaskManager {

    /* renamed from: c */
    private static volatile RelyTaskManager f1898c;

    /* renamed from: a */
    private final Map<String, Runnable> f1899a = new ArrayMap();

    /* renamed from: b */
    private final Set<String> f1900b = new ArraySet();

    private RelyTaskManager() {
    }

    /* renamed from: b */
    public static RelyTaskManager m103596b() {
        if (f1898c == null) {
            synchronized (RelyTaskManager.class) {
                if (f1898c == null) {
                    f1898c = new RelyTaskManager();
                }
            }
        }
        return f1898c;
    }

    /* renamed from: d */
    private void m103594d(String str) {
        synchronized (this) {
            Runnable runnable = this.f1899a.get(str);
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f1899a.remove(str);
            this.f1900b.remove(str);
        }
    }

    /* renamed from: a */
    public void m103597a(String str, Runnable runnable) {
        synchronized (this) {
            if (this.f1899a.containsKey(str)) {
                return;
            }
            this.f1899a.put(str, runnable);
            if (this.f1900b.contains(str)) {
                m103594d(str);
            }
        }
    }

    /* renamed from: c */
    public void m103595c(String str) {
        synchronized (this) {
            if (this.f1900b.contains(str)) {
                return;
            }
            this.f1900b.add(str);
            m103594d(str);
        }
    }
}
