package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes5.dex */
final class CurrentParsingState {

    /* renamed from: a */
    private int f44573a = 0;

    /* renamed from: b */
    private State f44574b = State.NUMERIC;

    /* loaded from: classes5.dex */
    private enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m65769a() {
        return this.f44573a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m65768b(int i) {
        this.f44573a += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m65767c() {
        if (this.f44574b == State.ALPHA) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m65766d() {
        if (this.f44574b == State.ISO_IEC_646) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m65765e() {
        this.f44574b = State.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m65764f() {
        this.f44574b = State.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m65763g() {
        this.f44574b = State.NUMERIC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m65762h(int i) {
        this.f44573a = i;
    }
}
