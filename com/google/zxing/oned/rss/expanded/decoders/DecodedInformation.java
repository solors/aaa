package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes5.dex */
final class DecodedInformation extends DecodedObject {

    /* renamed from: b */
    private final String f44577b;

    /* renamed from: c */
    private final int f44578c;

    /* renamed from: d */
    private final boolean f44579d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodedInformation(int i, String str) {
        super(i);
        this.f44577b = str;
        this.f44579d = false;
        this.f44578c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m65759b() {
        return this.f44577b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65758c() {
        return this.f44578c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m65757d() {
        return this.f44579d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodedInformation(int i, String str, int i2) {
        super(i);
        this.f44579d = true;
        this.f44578c = i2;
        this.f44577b = str;
    }
}
