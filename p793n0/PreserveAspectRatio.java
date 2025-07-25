package p793n0;

/* renamed from: n0.e */
/* loaded from: classes11.dex */
public class PreserveAspectRatio {

    /* renamed from: c */
    public static final PreserveAspectRatio f101292c = new PreserveAspectRatio(null, null);

    /* renamed from: d */
    public static final PreserveAspectRatio f101293d = new PreserveAspectRatio(EnumC38321a.none, null);

    /* renamed from: e */
    public static final PreserveAspectRatio f101294e;

    /* renamed from: f */
    public static final PreserveAspectRatio f101295f;

    /* renamed from: g */
    public static final PreserveAspectRatio f101296g;

    /* renamed from: h */
    public static final PreserveAspectRatio f101297h;

    /* renamed from: i */
    public static final PreserveAspectRatio f101298i;

    /* renamed from: j */
    public static final PreserveAspectRatio f101299j;

    /* renamed from: k */
    public static final PreserveAspectRatio f101300k;

    /* renamed from: a */
    private EnumC38321a f101301a;

    /* renamed from: b */
    private EnumC38322b f101302b;

    /* compiled from: PreserveAspectRatio.java */
    /* renamed from: n0.e$a */
    /* loaded from: classes11.dex */
    public enum EnumC38321a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* compiled from: PreserveAspectRatio.java */
    /* renamed from: n0.e$b */
    /* loaded from: classes11.dex */
    public enum EnumC38322b {
        meet,
        slice
    }

    static {
        EnumC38321a enumC38321a = EnumC38321a.xMidYMid;
        EnumC38322b enumC38322b = EnumC38322b.meet;
        f101294e = new PreserveAspectRatio(enumC38321a, enumC38322b);
        EnumC38321a enumC38321a2 = EnumC38321a.xMinYMin;
        f101295f = new PreserveAspectRatio(enumC38321a2, enumC38322b);
        f101296g = new PreserveAspectRatio(EnumC38321a.xMaxYMax, enumC38322b);
        f101297h = new PreserveAspectRatio(EnumC38321a.xMidYMin, enumC38322b);
        f101298i = new PreserveAspectRatio(EnumC38321a.xMidYMax, enumC38322b);
        EnumC38322b enumC38322b2 = EnumC38322b.slice;
        f101299j = new PreserveAspectRatio(enumC38321a, enumC38322b2);
        f101300k = new PreserveAspectRatio(enumC38321a2, enumC38322b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreserveAspectRatio(EnumC38321a enumC38321a, EnumC38322b enumC38322b) {
        this.f101301a = enumC38321a;
        this.f101302b = enumC38322b;
    }

    /* renamed from: a */
    public EnumC38321a m15049a() {
        return this.f101301a;
    }

    /* renamed from: b */
    public EnumC38322b m15048b() {
        return this.f101302b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        if (this.f101301a == preserveAspectRatio.f101301a && this.f101302b == preserveAspectRatio.f101302b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f101301a + " " + this.f101302b;
    }
}
