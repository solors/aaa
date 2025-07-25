package com.google.android.exoplayer2.decoder;

/* loaded from: classes4.dex */
public abstract class Buffer {

    /* renamed from: b */
    private int f32682b;

    public final void addFlag(int i) {
        this.f32682b = i | this.f32682b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean m74892b(int i) {
        if ((this.f32682b & i) == i) {
            return true;
        }
        return false;
    }

    public void clear() {
        this.f32682b = 0;
    }

    public final void clearFlag(int i) {
        this.f32682b = (~i) & this.f32682b;
    }

    public final boolean hasSupplementalData() {
        return m74892b(268435456);
    }

    public final boolean isDecodeOnly() {
        return m74892b(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return m74892b(4);
    }

    public final boolean isFirstSample() {
        return m74892b(134217728);
    }

    public final boolean isKeyFrame() {
        return m74892b(1);
    }

    public final boolean isLastSample() {
        return m74892b(536870912);
    }

    public final void setFlags(int i) {
        this.f32682b = i;
    }
}
