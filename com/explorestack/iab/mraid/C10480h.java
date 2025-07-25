package com.explorestack.iab.mraid;

import androidx.annotation.NonNull;

/* renamed from: com.explorestack.iab.mraid.h */
/* loaded from: classes3.dex */
public final class C10480h {

    /* renamed from: a */
    public int f23925a;

    /* renamed from: b */
    public int f23926b;

    /* renamed from: c */
    public int f23927c;

    /* renamed from: d */
    public int f23928d;

    /* renamed from: e */
    public EnumC10485m f23929e;

    /* renamed from: f */
    public boolean f23930f;

    public C10480h() {
        this(0, 0, 0, 0, EnumC10485m.TopRight, true);
    }

    @NonNull
    public String toString() {
        return "MRAIDResizeProperties{width=" + this.f23925a + ", height=" + this.f23926b + ", offsetX=" + this.f23927c + ", offsetY=" + this.f23928d + ", customClosePosition=" + this.f23929e + ", allowOffscreen=" + this.f23930f + '}';
    }

    public C10480h(int i, int i2, int i3, int i4, EnumC10485m enumC10485m, boolean z) {
        this.f23925a = i;
        this.f23926b = i2;
        this.f23927c = i3;
        this.f23928d = i4;
        this.f23929e = enumC10485m;
        this.f23930f = z;
    }
}
