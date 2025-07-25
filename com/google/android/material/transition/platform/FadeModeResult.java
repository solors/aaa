package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes5.dex */
class FadeModeResult {

    /* renamed from: a */
    final int f39061a;

    /* renamed from: b */
    final int f39062b;

    /* renamed from: c */
    final boolean f39063c;

    private FadeModeResult(int i, int i2, boolean z) {
        this.f39061a = i;
        this.f39062b = i2;
        this.f39063c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FadeModeResult m70238a(int i, int i2) {
        return new FadeModeResult(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static FadeModeResult m70237b(int i, int i2) {
        return new FadeModeResult(i, i2, false);
    }
}
