package p1068z4;

import android.content.Context;
import android.text.TextUtils;
import p738j5.C37294f;

/* renamed from: z4.q */
/* loaded from: classes6.dex */
public class UserTagInitParameter {

    /* renamed from: a */
    private Context f118740a;

    /* renamed from: b */
    private String f118741b;

    /* renamed from: c */
    private String f118742c;

    /* renamed from: d */
    private long f118743d;

    /* renamed from: e */
    private boolean f118744e;

    /* renamed from: f */
    private boolean f118745f;

    /* compiled from: UserTagInitParameter.java */
    /* renamed from: z4.q$b */
    /* loaded from: classes6.dex */
    public static class C45138b {

        /* renamed from: a */
        private Context f118746a;

        /* renamed from: b */
        private String f118747b;

        /* renamed from: c */
        private String f118748c;

        /* renamed from: d */
        private long f118749d;

        /* renamed from: e */
        private boolean f118750e;

        /* renamed from: f */
        private boolean f118751f;

        public C45138b(Context context) {
            this.f118746a = context.getApplicationContext();
        }

        /* renamed from: g */
        public UserTagInitParameter m723g() {
            if (this.f118746a != null) {
                if (!TextUtils.isEmpty(this.f118747b)) {
                    if (!TextUtils.isEmpty(this.f118748c)) {
                        if (this.f118749d > 0) {
                            if (C37294f.m18529g(this.f118746a) && this.f118751f) {
                                throw new RuntimeException("Apk is release，But isDebug = true，the correct isDebug must be false");
                            }
                            return new UserTagInitParameter(this);
                        }
                        throw new NullPointerException("installTime must set, use setInstallTime(long installTime)");
                    }
                    throw new IllegalArgumentException("learningsId must set, use setLearningsId(String learningsId)");
                }
                throw new IllegalArgumentException("productionId must set, use setProductionId(String productionId)");
            }
            throw new NullPointerException("context must set, use Builder(Context context)");
        }

        /* renamed from: h */
        public C45138b m722h(boolean z) {
            this.f118751f = z;
            return this;
        }

        /* renamed from: i */
        public C45138b m721i(long j) {
            this.f118749d = j;
            return this;
        }

        /* renamed from: j */
        public C45138b m720j(String str) {
            this.f118748c = str;
            return this;
        }

        /* renamed from: k */
        public C45138b m719k(String str) {
            this.f118747b = str;
            return this;
        }

        /* renamed from: l */
        public C45138b m718l(boolean z) {
            this.f118750e = z;
            return this;
        }
    }

    /* renamed from: a */
    public Context m735a() {
        return this.f118740a;
    }

    /* renamed from: b */
    public long m734b() {
        return this.f118743d;
    }

    /* renamed from: c */
    public String m733c() {
        return this.f118742c;
    }

    /* renamed from: d */
    public String m732d() {
        return this.f118741b;
    }

    /* renamed from: e */
    public boolean m731e() {
        return this.f118745f;
    }

    /* renamed from: f */
    public boolean m730f() {
        return this.f118744e;
    }

    private UserTagInitParameter(C45138b c45138b) {
        this.f118740a = c45138b.f118746a;
        this.f118741b = c45138b.f118747b;
        this.f118742c = c45138b.f118748c;
        this.f118743d = c45138b.f118749d;
        this.f118744e = c45138b.f118750e;
        this.f118745f = c45138b.f118751f;
    }
}
