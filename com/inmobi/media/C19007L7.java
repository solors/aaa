package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.L7 */
/* loaded from: classes6.dex */
public final class C19007L7 extends C19149W6 {

    /* renamed from: x */
    public final C18993K7 f47439x;

    /* renamed from: y */
    public boolean f47440y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19007L7(String assetId, String assetName, C19162X6 assetStyle, C18993K7 timer) {
        super(assetId, assetName, "TIMER", assetStyle, 16);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.f47439x = timer;
    }

    /* renamed from: a */
    public final void m60926a(boolean z) {
        this.f47440y = z;
    }
}
