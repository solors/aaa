package p006a5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p738j5.DataProcessUtils;
import p738j5.LogUtils;

/* renamed from: a5.b */
/* loaded from: classes6.dex */
public class AfDataManager {

    /* renamed from: a */
    private final String f78a;

    /* renamed from: b */
    private final AfData f79b;

    /* renamed from: c */
    private Map<String, String> f80c;

    /* renamed from: d */
    private final List<AfDataUpdateListener> f81d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AfDataManager.java */
    /* renamed from: a5.b$b */
    /* loaded from: classes6.dex */
    public static class C0008b {

        /* renamed from: a */
        private static final AfDataManager f82a = new AfDataManager();
    }

    /* renamed from: b */
    public static AfDataManager m105854b() {
        return C0008b.f82a;
    }

    /* renamed from: a */
    public void m105855a(AfDataUpdateListener afDataUpdateListener) {
        if (afDataUpdateListener != null && !this.f81d.contains(afDataUpdateListener)) {
            this.f81d.add(afDataUpdateListener);
            afDataUpdateListener.mo1083a(this.f79b);
        }
    }

    /* renamed from: c */
    public AfData m105853c() {
        return this.f79b;
    }

    /* renamed from: d */
    public void m105852d() {
        Map<String, String> m105866e = this.f79b.m105866e();
        if (DataProcessUtils.m18554c(m105866e, this.f80c)) {
            return;
        }
        this.f80c = m105866e;
        LogUtils.m18537b("UserTag_AfDataManager", "notifyAfDataUpdate " + this.f79b);
        if (!this.f81d.isEmpty()) {
            for (AfDataUpdateListener afDataUpdateListener : this.f81d) {
                afDataUpdateListener.mo1083a(this.f79b);
            }
        }
    }

    private AfDataManager() {
        this.f78a = "UserTag_AfDataManager";
        AfData afData = new AfData();
        this.f79b = afData;
        this.f80c = afData.m105866e();
        this.f81d = new ArrayList();
    }
}
