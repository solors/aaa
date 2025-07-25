package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ccoio */
/* loaded from: classes8.dex */
public class C32454ccoio implements Comparable<C32454ccoio> {
    private static final int c2oc2o = -1;
    public static final C32454ccoio cco22 = new C32454ccoio(-1, -1, -1, -1);
    private int c2oc2i;
    private int cioccoiococ;
    private int coi222o222;
    private int coo2iico;

    public C32454ccoio(int i, int i2, int i3, int i4) {
        this.coo2iico = i;
        this.coi222o222 = i2;
        this.c2oc2i = i3;
        this.cioccoiococ = i4;
    }

    public int c2oc2i() {
        return this.coi222o222;
    }

    public boolean cioccoiococ() {
        return this.coo2iico > -1 && this.coi222o222 > -1 && this.c2oc2i > -1;
    }

    public int coi222o222() {
        return this.coo2iico;
    }

    public int coo2iico() {
        return this.c2oc2i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C32454ccoio)) {
            return false;
        }
        C32454ccoio c32454ccoio = (C32454ccoio) obj;
        if (this.coo2iico != c32454ccoio.coo2iico || this.coi222o222 != c32454ccoio.coi222o222 || this.c2oc2i != c32454ccoio.c2oc2i) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.coo2iico + "." + this.coi222o222 + "." + this.c2oc2i + "." + this.cioccoiococ;
    }

    public boolean c2oc2i(C32454ccoio c32454ccoio) {
        return c32454ccoio != null && this.coo2iico == c32454ccoio.coo2iico && this.coi222o222 == c32454ccoio.coi222o222;
    }

    public boolean cioccoiococ(C32454ccoio c32454ccoio) {
        return compareTo(c32454ccoio) > 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: coi222o222 */
    public int compareTo(C32454ccoio c32454ccoio) {
        if (c32454ccoio == null) {
            return 1;
        }
        int i = this.coo2iico;
        int i2 = c32454ccoio.coo2iico;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.coi222o222;
        int i4 = c32454ccoio.coi222o222;
        return i3 != i4 ? i3 - i4 : this.c2oc2i - c32454ccoio.c2oc2i;
    }

    public boolean coo2iico(C32454ccoio c32454ccoio) {
        if (this.coo2iico != c32454ccoio.coo2iico) {
            return false;
        }
        int i = this.coi222o222;
        int i2 = c32454ccoio.coi222o222;
        if (i > i2) {
            return true;
        }
        return i == i2 && this.c2oc2i >= c32454ccoio.c2oc2i;
    }

    public C32454ccoio(String str) {
        this.coo2iico = -1;
        this.coi222o222 = -1;
        this.c2oc2i = -1;
        this.cioccoiococ = -1;
        try {
            String[] split = str.split("\\.");
            this.coo2iico = Integer.parseInt(split[0]);
            this.coi222o222 = Integer.parseInt(split[1]);
            this.c2oc2i = Integer.parseInt(split[2]);
        } catch (Exception unused) {
        }
    }
}
