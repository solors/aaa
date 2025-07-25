package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer */
/* loaded from: classes4.dex */
final class NalUnitTargetBuffer {

    /* renamed from: a */
    private final int f33558a;

    /* renamed from: b */
    private boolean f33559b;

    /* renamed from: c */
    private boolean f33560c;
    public byte[] nalData;
    public int nalLength;

    public NalUnitTargetBuffer(int i, int i2) {
        this.f33558a = i;
        byte[] bArr = new byte[i2 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i, int i2) {
        if (!this.f33559b) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.nalData;
        int length = bArr2.length;
        int i4 = this.nalLength;
        if (length < i4 + i3) {
            this.nalData = Arrays.copyOf(bArr2, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, i, this.nalData, this.nalLength, i3);
        this.nalLength += i3;
    }

    public boolean endNalUnit(int i) {
        if (!this.f33559b) {
            return false;
        }
        this.nalLength -= i;
        this.f33559b = false;
        this.f33560c = true;
        return true;
    }

    public boolean isCompleted() {
        return this.f33560c;
    }

    public void reset() {
        this.f33559b = false;
        this.f33560c = false;
    }

    public void startNalUnit(int i) {
        boolean z = true;
        Assertions.checkState(!this.f33559b);
        if (i != this.f33558a) {
            z = false;
        }
        this.f33559b = z;
        if (z) {
            this.nalLength = 3;
            this.f33560c = false;
        }
    }
}
