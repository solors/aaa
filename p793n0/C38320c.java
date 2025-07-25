package p793n0;

/* compiled from: IntegerParser.java */
/* renamed from: n0.c */
/* loaded from: classes11.dex */
class C38320c {

    /* renamed from: a */
    private int f101287a;

    /* renamed from: b */
    private long f101288b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C38320c(long j, int i) {
        this.f101288b = j;
        this.f101287a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C38320c m15054b(String str, int i, int i2) {
        long j;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j2 = 0;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt >= '0' && charAt <= '9') {
                j2 = (j2 * 16) + (charAt - '0');
            } else {
                if (charAt >= 'A' && charAt <= 'F') {
                    j = j2 * 16;
                    i3 = charAt - 'A';
                } else if (charAt < 'a' || charAt > 'f') {
                    break;
                } else {
                    j = j2 * 16;
                    i3 = charAt - 'a';
                }
                j2 = j + i3 + 10;
            }
            if (j2 > 4294967295L) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new C38320c(j2, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C38320c m15053c(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                if (charAt == '-') {
                    z2 = true;
                }
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (z2) {
                j = (j * 10) - (charAt2 - '0');
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = (j * 10) + (charAt2 - '0');
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C38320c(j, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15055a() {
        return this.f101287a;
    }

    /* renamed from: d */
    public int m15052d() {
        return (int) this.f101288b;
    }
}
