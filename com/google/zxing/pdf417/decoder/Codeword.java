package com.google.zxing.pdf417.decoder;

import com.amazon.p047a.p048a.p071o.p073b.SignedToken;

/* loaded from: classes5.dex */
final class Codeword {

    /* renamed from: a */
    private final int f44619a;

    /* renamed from: b */
    private final int f44620b;

    /* renamed from: c */
    private final int f44621c;

    /* renamed from: d */
    private final int f44622d;

    /* renamed from: e */
    private int f44623e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Codeword(int i, int i2, int i3, int i4) {
        this.f44619a = i;
        this.f44620b = i2;
        this.f44621c = i3;
        this.f44622d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m65705a() {
        return this.f44621c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m65704b() {
        return this.f44620b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65703c() {
        return this.f44623e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m65702d() {
        return this.f44619a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m65701e() {
        return this.f44622d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m65700f() {
        return this.f44620b - this.f44619a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m65699g() {
        return m65698h(this.f44623e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m65698h(int i) {
        if (i != -1 && this.f44621c == (i % 3) * 3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m65697i(int i) {
        this.f44623e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m65696j() {
        this.f44623e = ((this.f44622d / 30) * 3) + (this.f44621c / 3);
    }

    public String toString() {
        return this.f44623e + SignedToken.f2767c + this.f44622d;
    }
}
