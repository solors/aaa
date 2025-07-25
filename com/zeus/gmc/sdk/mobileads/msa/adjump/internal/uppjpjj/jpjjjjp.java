package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj;

/* loaded from: classes8.dex */
public class jpjjjjp implements Comparable<jpjjjjp> {
    public static final jpjjjjp jujujpjjp = new jpjjjjp();
    private int jjuuju;
    private int puujujuupp;
    private int uppjpjj;

    public jpjjjjp(int i, int i2, int i3) {
        this.uppjpjj = i;
        this.jjuuju = i2;
        this.puujujuupp = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: jujujpjjp */
    public int compareTo(jpjjjjp jpjjjjpVar) {
        if (jpjjjjpVar == null) {
            return 1;
        }
        int i = this.uppjpjj;
        int i2 = jpjjjjpVar.uppjpjj;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.jjuuju;
        int i4 = jpjjjjpVar.jjuuju;
        if (i3 != i4) {
            return i3 - i4;
        }
        return this.puujujuupp - jpjjjjpVar.puujujuupp;
    }

    public String toString() {
        return this.uppjpjj + "." + this.jjuuju + "." + this.puujujuupp;
    }

    public boolean uppjpjj(jpjjjjp jpjjjjpVar) {
        if (jpjjjjpVar == null || this.uppjpjj != jpjjjjpVar.uppjpjj || this.jjuuju != jpjjjjpVar.jjuuju) {
            return false;
        }
        return true;
    }

    public jpjjjjp() {
        this.uppjpjj = 0;
        this.jjuuju = 0;
        this.puujujuupp = 0;
    }

    public jpjjjjp(String str) {
        this.uppjpjj = 0;
        this.jjuuju = 0;
        this.puujujuupp = 0;
        try {
            String[] split = str.split("\\.");
            this.uppjpjj = Integer.parseInt(split[0]);
            this.jjuuju = Integer.parseInt(split[1]);
            this.puujujuupp = Integer.parseInt(split[2]);
        } catch (Exception unused) {
        }
    }
}
