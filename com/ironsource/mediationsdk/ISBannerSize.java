package com.ironsource.mediationsdk;

/* loaded from: classes6.dex */
public class ISBannerSize {

    /* renamed from: a */
    private final int f51237a;

    /* renamed from: b */
    private final int f51238b;

    /* renamed from: c */
    private final String f51239c;
    public ISContainerParams containerParams;

    /* renamed from: d */
    private boolean f51240d;
    public static final ISBannerSize BANNER = C20410l.m56785a(C20410l.f51629a, 320, 50);
    public static final ISBannerSize LARGE = C20410l.m56785a(C20410l.f51630b, 320, 90);
    public static final ISBannerSize RECTANGLE = C20410l.m56785a(C20410l.f51631c, 300, 250);

    /* renamed from: e */
    protected static final ISBannerSize f51236e = C20410l.m56798a();
    public static final ISBannerSize SMART = C20410l.m56785a(C20410l.f51633e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this(C20410l.f51634f, i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return C20410l.m56782b(i);
    }

    public String getDescription() {
        return this.f51239c;
    }

    public int getHeight() {
        return this.f51238b;
    }

    public int getWidth() {
        return this.f51237a;
    }

    public boolean isAdaptive() {
        return this.f51240d;
    }

    public boolean isSmart() {
        return this.f51239c.equals(C20410l.f51633e);
    }

    public void setAdaptive(boolean z) {
        this.f51240d = z;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (C20410l.m56793a(iSContainerParams, this.f51237a, this.f51238b)) {
            this.containerParams = iSContainerParams;
        }
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f51239c = str;
        this.f51237a = i;
        this.f51238b = i2;
        this.containerParams = new ISContainerParams(i, i2);
    }
}
