package com.google.zxing.oned.rss;

/* loaded from: classes5.dex */
final class Pair extends DataCharacter {

    /* renamed from: c */
    private final FinderPattern f44539c;

    /* renamed from: d */
    private int f44540d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pair(int i, int i2, FinderPattern finderPattern) {
        super(i, i2);
        this.f44539c = finderPattern;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m65818a() {
        return this.f44540d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public FinderPattern m65817b() {
        return this.f44539c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m65816c() {
        this.f44540d++;
    }
}
