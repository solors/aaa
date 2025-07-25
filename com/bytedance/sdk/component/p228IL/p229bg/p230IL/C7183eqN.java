package com.bytedance.sdk.component.p228IL.p229bg.p230IL;

import com.ironsource.C21114v8;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.IL.bg.IL.eqN */
/* loaded from: classes3.dex */
public class C7183eqN implements Serializable, Comparable<C7183eqN> {
    final byte[] eqN;
    transient String ldr;

    /* renamed from: zx */
    transient int f15489zx;

    /* renamed from: bg */
    static final char[] f15488bg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: IL */
    public static final Charset f15486IL = Charset.forName("UTF-8");

    /* renamed from: bX */
    public static final C7183eqN f15487bX = m89676bg(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7183eqN(byte[] bArr) {
        this.eqN = bArr;
    }

    /* renamed from: bg */
    public static C7183eqN m89676bg(byte... bArr) {
        if (bArr != null) {
            return new C7183eqN((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: IL */
    public String mo89675IL() {
        byte[] bArr = this.eqN;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f15488bg;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: bX */
    public int mo89673bX() {
        return this.eqN.length;
    }

    public byte[] eqN() {
        return (byte[]) this.eqN.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7183eqN) {
            C7183eqN c7183eqN = (C7183eqN) obj;
            int mo89673bX = c7183eqN.mo89673bX();
            byte[] bArr = this.eqN;
            if (mo89673bX == bArr.length && c7183eqN.mo89668bg(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f15489zx;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.eqN);
        this.f15489zx = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.eqN.length == 0) {
            return "[size=0]";
        }
        String mo89672bg = mo89672bg();
        int m89677bg = m89677bg(mo89672bg, 64);
        if (m89677bg == -1) {
            if (this.eqN.length <= 64) {
                return "[hex=" + mo89675IL() + C21114v8.C21123i.f54139e;
            }
            return "[size=" + this.eqN.length + " hex=" + mo89670bg(0, 64).mo89675IL() + "…]";
        }
        String replace = mo89672bg.substring(0, m89677bg).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m89677bg < mo89672bg.length()) {
            return "[size=" + this.eqN.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + C21114v8.C21123i.f54139e;
    }

    /* renamed from: bg */
    public String mo89672bg() {
        String str = this.ldr;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.eqN, f15486IL);
        this.ldr = str2;
        return str2;
    }

    /* renamed from: bg */
    public C7183eqN mo89670bg(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.eqN;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.eqN.length + ")");
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, i3);
                return new C7183eqN(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /* renamed from: bg */
    public byte mo89671bg(int i) {
        return this.eqN[i];
    }

    /* renamed from: bg */
    public boolean mo89669bg(int i, C7183eqN c7183eqN, int i2, int i3) {
        return c7183eqN.mo89668bg(i2, this.eqN, i, i3);
    }

    /* renamed from: bg */
    public boolean mo89668bg(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.eqN;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C7180WR.m89695bg(bArr2, i, bArr, i2, i3);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(C7183eqN c7183eqN) {
        int mo89673bX = mo89673bX();
        int mo89673bX2 = c7183eqN.mo89673bX();
        int min = Math.min(mo89673bX, mo89673bX2);
        for (int i = 0; i < min; i++) {
            int mo89671bg = mo89671bg(i) & 255;
            int mo89671bg2 = c7183eqN.mo89671bg(i) & 255;
            if (mo89671bg != mo89671bg2) {
                return mo89671bg < mo89671bg2 ? -1 : 1;
            }
        }
        if (mo89673bX == mo89673bX2) {
            return 0;
        }
        return mo89673bX < mo89673bX2 ? -1 : 1;
    }

    /* renamed from: bg */
    static int m89677bg(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
