package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public final class AztecCode {

    /* renamed from: a */
    private boolean f44206a;

    /* renamed from: b */
    private int f44207b;

    /* renamed from: c */
    private int f44208c;

    /* renamed from: d */
    private int f44209d;

    /* renamed from: e */
    private BitMatrix f44210e;

    public int getCodeWords() {
        return this.f44209d;
    }

    public int getLayers() {
        return this.f44208c;
    }

    public BitMatrix getMatrix() {
        return this.f44210e;
    }

    public int getSize() {
        return this.f44207b;
    }

    public boolean isCompact() {
        return this.f44206a;
    }

    public void setCodeWords(int i) {
        this.f44209d = i;
    }

    public void setCompact(boolean z) {
        this.f44206a = z;
    }

    public void setLayers(int i) {
        this.f44208c = i;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.f44210e = bitMatrix;
    }

    public void setSize(int i) {
        this.f44207b = i;
    }
}
