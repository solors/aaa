package p041c6;

import android.text.TextUtils;

/* renamed from: c6.a */
/* loaded from: classes6.dex */
public class AdDebugManager {

    /* renamed from: a */
    private boolean f1894a;

    /* renamed from: b */
    private String f1895b;

    /* renamed from: c */
    private int f1896c;

    /* compiled from: AdDebugManager.java */
    /* renamed from: c6.a$b */
    /* loaded from: classes6.dex */
    private static class C3436b {

        /* renamed from: a */
        private static final AdDebugManager f1897a = new AdDebugManager();
    }

    /* renamed from: a */
    public static AdDebugManager m103603a() {
        return C3436b.f1897a;
    }

    /* renamed from: b */
    public int m103602b() {
        return this.f1896c;
    }

    /* renamed from: c */
    public String m103601c() {
        return this.f1895b;
    }

    /* renamed from: d */
    public boolean m103600d() {
        return this.f1894a;
    }

    /* renamed from: e */
    public boolean m103599e() {
        return !TextUtils.isEmpty(m103601c());
    }

    private AdDebugManager() {
        this.f1896c = -1;
    }
}
