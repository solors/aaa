package com.ironsource;

/* renamed from: com.ironsource.co */
/* loaded from: classes6.dex */
public class C19721co {

    /* renamed from: a */
    private boolean f49477a;

    /* renamed from: b */
    private boolean f49478b;

    /* renamed from: c */
    private boolean f49479c;

    /* renamed from: d */
    private EnumC20005go f49480d;

    /* renamed from: e */
    private int f49481e;

    /* renamed from: f */
    private int f49482f;

    /* renamed from: com.ironsource.co$b */
    /* loaded from: classes6.dex */
    public static class C19723b {

        /* renamed from: a */
        private boolean f49483a = true;

        /* renamed from: b */
        private boolean f49484b = false;

        /* renamed from: c */
        private boolean f49485c = false;

        /* renamed from: d */
        private EnumC20005go f49486d = null;

        /* renamed from: e */
        private int f49487e = 0;

        /* renamed from: f */
        private int f49488f = 0;

        /* renamed from: a */
        public C19723b m59066a(boolean z) {
            this.f49483a = z;
            return this;
        }

        /* renamed from: a */
        public C19723b m59065a(boolean z, int i) {
            this.f49485c = z;
            this.f49488f = i;
            return this;
        }

        /* renamed from: a */
        public C19723b m59064a(boolean z, EnumC20005go enumC20005go, int i) {
            this.f49484b = z;
            if (enumC20005go == null) {
                enumC20005go = EnumC20005go.PER_DAY;
            }
            this.f49486d = enumC20005go;
            this.f49487e = i;
            return this;
        }

        /* renamed from: a */
        public C19721co m59067a() {
            return new C19721co(this.f49483a, this.f49484b, this.f49485c, this.f49486d, this.f49487e, this.f49488f);
        }
    }

    private C19721co(boolean z, boolean z2, boolean z3, EnumC20005go enumC20005go, int i, int i2) {
        this.f49477a = z;
        this.f49478b = z2;
        this.f49479c = z3;
        this.f49480d = enumC20005go;
        this.f49481e = i;
        this.f49482f = i2;
    }

    /* renamed from: a */
    public EnumC20005go m59073a() {
        return this.f49480d;
    }

    /* renamed from: b */
    public int m59072b() {
        return this.f49481e;
    }

    /* renamed from: c */
    public int m59071c() {
        return this.f49482f;
    }

    /* renamed from: d */
    public boolean m59070d() {
        return this.f49478b;
    }

    /* renamed from: e */
    public boolean m59069e() {
        return this.f49477a;
    }

    /* renamed from: f */
    public boolean m59068f() {
        return this.f49479c;
    }
}
