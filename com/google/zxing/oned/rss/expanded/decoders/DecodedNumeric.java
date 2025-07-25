package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* loaded from: classes5.dex */
final class DecodedNumeric extends DecodedObject {

    /* renamed from: b */
    private final int f44580b;

    /* renamed from: c */
    private final int f44581c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodedNumeric(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.f44580b = i2;
            this.f44581c = i3;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m65756b() {
        return this.f44580b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65755c() {
        return this.f44581c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m65754d() {
        if (this.f44580b == 10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m65753e() {
        if (this.f44581c == 10) {
            return true;
        }
        return false;
    }
}
