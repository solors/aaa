package com.google.android.material.transition;

/* loaded from: classes5.dex */
class FadeModeResult {

    /* renamed from: a */
    final int f38902a;

    /* renamed from: b */
    final int f38903b;

    /* renamed from: c */
    final boolean f38904c;

    private FadeModeResult(int i, int i2, boolean z) {
        this.f38902a = i;
        this.f38903b = i2;
        this.f38904c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FadeModeResult m70325a(int i, int i2) {
        return new FadeModeResult(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static FadeModeResult m70324b(int i, int i2) {
        return new FadeModeResult(i, i2, false);
    }
}
