package com.p551my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* renamed from: com.my.target.e9 */
/* loaded from: classes7.dex */
public class C25734e9 {

    /* renamed from: c */
    public static int f66793c;

    /* renamed from: a */
    public final SparseIntArray f66817a = new SparseIntArray();

    /* renamed from: b */
    public final float f66818b;

    /* renamed from: d */
    public static final int f66794d = m43970a();

    /* renamed from: e */
    public static final int f66795e = m43970a();

    /* renamed from: f */
    public static final int f66796f = m43970a();

    /* renamed from: g */
    public static final int f66797g = m43970a();

    /* renamed from: h */
    public static final int f66798h = m43970a();

    /* renamed from: i */
    public static final int f66799i = m43970a();

    /* renamed from: j */
    public static final int f66800j = m43970a();

    /* renamed from: k */
    public static final int f66801k = m43970a();

    /* renamed from: l */
    public static final int f66802l = m43970a();

    /* renamed from: m */
    public static final int f66803m = m43970a();

    /* renamed from: n */
    public static final int f66804n = m43970a();

    /* renamed from: o */
    public static final int f66805o = m43970a();

    /* renamed from: p */
    public static final int f66806p = m43970a();

    /* renamed from: q */
    public static final int f66807q = m43970a();

    /* renamed from: r */
    public static final int f66808r = m43970a();

    /* renamed from: s */
    public static final int f66809s = m43970a();

    /* renamed from: t */
    public static final int f66810t = m43970a();

    /* renamed from: u */
    public static final int f66811u = m43970a();

    /* renamed from: v */
    public static final int f66812v = m43970a();

    /* renamed from: w */
    public static final int f66813w = m43970a();

    /* renamed from: x */
    public static final int f66814x = m43970a();

    /* renamed from: y */
    public static final int f66815y = m43970a();

    /* renamed from: z */
    public static final int f66816z = m43970a();

    /* renamed from: A */
    public static final int f66768A = m43970a();

    /* renamed from: B */
    public static final int f66769B = m43970a();

    /* renamed from: C */
    public static final int f66770C = m43970a();

    /* renamed from: D */
    public static final int f66771D = m43970a();

    /* renamed from: E */
    public static final int f66772E = m43970a();

    /* renamed from: F */
    public static final int f66773F = m43970a();

    /* renamed from: G */
    public static final int f66774G = m43970a();

    /* renamed from: H */
    public static final int f66775H = m43970a();

    /* renamed from: I */
    public static final int f66776I = m43970a();

    /* renamed from: J */
    public static final int f66777J = m43970a();

    /* renamed from: K */
    public static final int f66778K = m43970a();

    /* renamed from: L */
    public static final int f66779L = m43970a();

    /* renamed from: M */
    public static final int f66780M = m43970a();

    /* renamed from: N */
    public static final int f66781N = m43970a();

    /* renamed from: O */
    public static final int f66782O = m43970a();

    /* renamed from: P */
    public static final int f66783P = m43970a();

    /* renamed from: Q */
    public static final int f66784Q = m43970a();

    /* renamed from: R */
    public static final int f66785R = m43970a();

    /* renamed from: S */
    public static final int f66786S = m43970a();

    /* renamed from: T */
    public static final int f66787T = m43970a();

    /* renamed from: U */
    public static final int f66788U = m43970a();

    /* renamed from: V */
    public static final int f66789V = m43970a();

    /* renamed from: W */
    public static final int f66790W = m43970a();

    /* renamed from: X */
    public static final int f66791X = m43970a();

    /* renamed from: Y */
    public static final int f66792Y = m43970a();

    public C25734e9(Context context) {
        int i;
        float f;
        C25869ka m43585e = C25869ka.m43585e(context);
        DisplayMetrics m43607a = C25869ka.m43607a(context);
        int i2 = m43607a.heightPixels;
        if (i2 > 0 && (i = m43607a.widthPixels) > 0) {
            float f2 = m43607a.density;
            float min = Math.min(i / f2, i2 / f2);
            if (min >= 720.0f) {
                f = 2.0f;
            } else if (min >= 600.0f) {
                f = 1.2f;
            } else {
                this.f66818b = 1.0f;
                m43966a(m43585e);
                return;
            }
            this.f66818b = f;
            m43966a(m43585e);
            return;
        }
        this.f66818b = 1.0f;
        m43966a(m43585e);
    }

    /* renamed from: a */
    public final void m43966a(C25869ka c25869ka) {
        m43968a(f66794d, c25869ka.m43598b(200));
        m43968a(f66795e, c25869ka.m43598b(1));
        m43968a(f66796f, c25869ka.m43598b(4));
        m43968a(f66797g, 1);
        m43968a(f66798h, 18);
        m43968a(f66799i, c25869ka.m43598b(16));
        m43968a(f66800j, c25869ka.m43598b(8));
        m43968a(f66801k, c25869ka.m43598b(6));
        m43968a(f66802l, c25869ka.m43598b(2));
        m43968a(f66803m, c25869ka.m43598b(48));
        m43968a(f66804n, c25869ka.m43598b(6));
        m43968a(f66805o, c25869ka.m43598b(6));
        m43968a(f66806p, c25869ka.m43598b(14));
        m43968a(f66807q, c25869ka.m43598b(20));
        m43968a(f66808r, c25869ka.m43598b(27));
        m43968a(f66809s, 22);
        m43968a(f66810t, 2);
        m43968a(f66811u, 16);
        m43968a(f66812v, 3);
        m43968a(f66813w, 16);
        m43968a(f66814x, c25869ka.m43598b(6));
        m43968a(f66815y, c25869ka.m43598b(2));
        m43968a(f66816z, 1);
        m43968a(f66768A, c25869ka.m43598b(3));
        m43968a(f66770C, 16);
        m43968a(f66791X, 14);
        m43968a(f66769B, 1);
        m43968a(f66771D, 2);
        m43968a(f66772E, 2);
        m43968a(f66773F, c25869ka.m43598b(32));
        m43968a(f66774G, c25869ka.m43598b(16));
        m43968a(f66776I, c25869ka.m43598b(2));
        m43968a(f66777J, 16);
        m43968a(f66779L, 16);
        m43968a(f66780M, 2);
        m43968a(f66781N, 14);
        m43968a(f66778K, 22);
        m43968a(f66784Q, 16);
        m43968a(f66785R, 16);
        m43968a(f66782O, c25869ka.m43598b(4));
        m43968a(f66783P, c25869ka.m43598b(8));
        m43968a(f66786S, c25869ka.m43598b(100));
        m43968a(f66787T, c25869ka.m43598b(32));
        m43968a(f66788U, c25869ka.m43598b(136));
        m43968a(f66789V, c25869ka.m43598b(156));
        m43968a(f66775H, c25869ka.m43598b(24));
        m43968a(f66790W, c25869ka.m43598b(10));
        m43968a(f66792Y, c25869ka.m43598b(40));
    }

    /* renamed from: a */
    public static int m43970a() {
        int i = f66793c;
        f66793c = i + 1;
        return i;
    }

    /* renamed from: a */
    public int m43969a(int i) {
        return this.f66817a.get(i);
    }

    /* renamed from: a */
    public static C25734e9 m43967a(Context context) {
        return new C25734e9(context);
    }

    /* renamed from: a */
    public final void m43968a(int i, int i2) {
        this.f66817a.put(i, (int) (i2 * this.f66818b));
    }
}
