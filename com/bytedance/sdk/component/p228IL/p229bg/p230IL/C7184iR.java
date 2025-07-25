package com.bytedance.sdk.component.p228IL.p229bg.p230IL;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.component.IL.bg.IL.iR */
/* loaded from: classes3.dex */
public final class C7184iR extends C7183eqN {

    /* renamed from: Kg */
    final transient int[] f15490Kg;

    /* renamed from: iR */
    final transient byte[][] f15491iR;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7184iR(C7182bg c7182bg, int i) {
        super(null);
        C7180WR.m89702bg(c7182bg.f15484IL, 0L, i);
        C7186zx c7186zx = c7182bg.f15485bg;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c7186zx.f15495bX;
            int i6 = c7186zx.f15494IL;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c7186zx = c7186zx.ldr;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f15491iR = new byte[i4];
        this.f15490Kg = new int[i4 * 2];
        C7186zx c7186zx2 = c7182bg.f15485bg;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f15491iR;
            bArr[i7] = c7186zx2.f15496bg;
            int i8 = c7186zx2.f15495bX;
            int i9 = c7186zx2.f15494IL;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f15490Kg;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c7186zx2.eqN = true;
            i7++;
            c7186zx2 = c7186zx2.ldr;
        }
    }

    /* renamed from: zx */
    private C7183eqN m89667zx() {
        return new C7183eqN(eqN());
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: IL */
    public String mo89675IL() {
        return m89667zx().mo89675IL();
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: bX */
    public int mo89673bX() {
        return this.f15490Kg[this.f15491iR.length - 1];
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: bg */
    public String mo89672bg() {
        return m89667zx().mo89672bg();
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    public byte[] eqN() {
        int[] iArr = this.f15490Kg;
        byte[][] bArr = this.f15491iR;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f15490Kg;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f15491iR[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7183eqN) {
            C7183eqN c7183eqN = (C7183eqN) obj;
            if (c7183eqN.mo89673bX() == mo89673bX() && mo89669bg(0, c7183eqN, 0, mo89673bX())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    public int hashCode() {
        int i = this.f15489zx;
        if (i != 0) {
            return i;
        }
        int length = this.f15491iR.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f15491iR[i2];
            int[] iArr = this.f15490Kg;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f15489zx = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    public String toString() {
        return m89667zx().toString();
    }

    /* renamed from: IL */
    private int m89674IL(int i) {
        int binarySearch = Arrays.binarySearch(this.f15490Kg, 0, this.f15491iR.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: bg */
    public C7183eqN mo89670bg(int i, int i2) {
        return m89667zx().mo89670bg(i, i2);
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: bg */
    public byte mo89671bg(int i) {
        C7180WR.m89702bg(this.f15490Kg[this.f15491iR.length - 1], i, 1L);
        int m89674IL = m89674IL(i);
        int i2 = m89674IL == 0 ? 0 : this.f15490Kg[m89674IL - 1];
        int[] iArr = this.f15490Kg;
        byte[][] bArr = this.f15491iR;
        return bArr[m89674IL][(i - i2) + iArr[bArr.length + m89674IL]];
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: bg */
    public boolean mo89669bg(int i, C7183eqN c7183eqN, int i2, int i3) {
        if (i < 0 || i > mo89673bX() - i3) {
            return false;
        }
        int m89674IL = m89674IL(i);
        while (i3 > 0) {
            int i4 = m89674IL == 0 ? 0 : this.f15490Kg[m89674IL - 1];
            int min = Math.min(i3, ((this.f15490Kg[m89674IL] - i4) + i4) - i);
            int[] iArr = this.f15490Kg;
            byte[][] bArr = this.f15491iR;
            if (!c7183eqN.mo89668bg(i2, bArr[m89674IL], (i - i4) + iArr[bArr.length + m89674IL], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m89674IL++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7183eqN
    /* renamed from: bg */
    public boolean mo89668bg(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo89673bX() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int m89674IL = m89674IL(i);
        while (i3 > 0) {
            int i4 = m89674IL == 0 ? 0 : this.f15490Kg[m89674IL - 1];
            int min = Math.min(i3, ((this.f15490Kg[m89674IL] - i4) + i4) - i);
            int[] iArr = this.f15490Kg;
            byte[][] bArr2 = this.f15491iR;
            if (!C7180WR.m89695bg(bArr2[m89674IL], (i - i4) + iArr[bArr2.length + m89674IL], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m89674IL++;
        }
        return true;
    }
}
