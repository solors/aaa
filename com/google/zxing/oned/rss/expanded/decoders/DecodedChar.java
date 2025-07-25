package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes5.dex */
final class DecodedChar extends DecodedObject {

    /* renamed from: b */
    private final char f44576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodedChar(int i, char c) {
        super(i);
        this.f44576b = c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public char m65761b() {
        return this.f44576b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m65760c() {
        if (this.f44576b == '$') {
            return true;
        }
        return false;
    }
}
