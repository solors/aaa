package sg.bigo.ads.core.player;

/* renamed from: sg.bigo.ads.core.player.c */
/* loaded from: classes10.dex */
public final class C44341c {

    /* renamed from: h */
    public static int f116439h = 0;

    /* renamed from: i */
    public static int f116440i = 3;

    /* renamed from: j */
    private static boolean f116441j = false;

    /* renamed from: a */
    public int f116442a = 1;

    /* renamed from: b */
    public boolean f116443b = false;

    /* renamed from: c */
    public boolean f116444c = false;

    /* renamed from: d */
    public boolean f116445d = false;

    /* renamed from: e */
    public boolean f116446e = false;

    /* renamed from: f */
    public long f116447f = -1;

    /* renamed from: g */
    public boolean f116448g = false;

    /* renamed from: a */
    public static void m3306a() {
        f116440i = 1;
    }

    /* renamed from: b */
    public static int m3303b() {
        return f116439h;
    }

    /* renamed from: a */
    public static void m3305a(int i) {
        f116439h = i;
    }

    /* renamed from: b */
    public static C44341c m3302b(int i) {
        C44341c c44341c = new C44341c();
        if (f116441j) {
            c44341c.f116448g = true;
            c44341c.f116444c = true;
            c44341c.f116443b = true;
            c44341c.f116447f = 2000L;
        } else {
            if (i != 2) {
                if (i == 3) {
                    c44341c.f116448g = true;
                    c44341c.f116444c = true;
                } else if (i == 4) {
                    c44341c.f116448g = true;
                    c44341c.f116444c = true;
                    c44341c.f116443b = true;
                } else if (i != 12) {
                    if (i == 20) {
                        c44341c.f116444c = true;
                        c44341c.f116442a = 4;
                    }
                }
                c44341c.f116447f = 2000L;
                c44341c.f116442a = f116440i;
            }
            c44341c.f116448g = true;
            c44341c.f116444c = true;
            c44341c.f116443b = true;
            c44341c.f116447f = 2000L;
            c44341c.f116442a = 4;
        }
        f116440i = 3;
        return c44341c;
    }

    /* renamed from: a */
    public static void m3304a(boolean z) {
        f116441j = z;
    }
}
