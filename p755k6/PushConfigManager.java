package p755k6;

import android.content.Context;
import p755k6.PushSdk;

/* renamed from: k6.a */
/* loaded from: classes4.dex */
public class PushConfigManager {

    /* renamed from: a */
    private PushSdk.C37394a f98672a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PushConfigManager.java */
    /* renamed from: k6.a$a */
    /* loaded from: classes4.dex */
    public static class C37390a {

        /* renamed from: a */
        private static final PushConfigManager f98673a = new PushConfigManager();
    }

    /* renamed from: a */
    public static PushConfigManager m18207a() {
        return C37390a.f98673a;
    }

    /* renamed from: b */
    public Context m18206b() {
        PushSdk.C37394a c37394a = this.f98672a;
        if (c37394a == null) {
            return null;
        }
        return c37394a.m18161q();
    }

    /* renamed from: c */
    public String m18205c() {
        PushSdk.C37394a c37394a = this.f98672a;
        if (c37394a == null) {
            return "Android";
        }
        return c37394a.m18160r();
    }

    /* renamed from: d */
    public void m18204d(PushSdk.C37394a c37394a) {
        this.f98672a = c37394a;
    }

    /* renamed from: e */
    public boolean m18203e() {
        PushSdk.C37394a c37394a = this.f98672a;
        if (c37394a == null) {
            return false;
        }
        return c37394a.m18158t();
    }
}
