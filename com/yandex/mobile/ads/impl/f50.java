package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.C37612s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f50 implements un0 {

    /* renamed from: b */
    private final int f78977b;
    @Nullable

    /* renamed from: c */
    private final RectF f78978c;

    public f50(int i, @Nullable RectF rectF) {
        this.f78977b = i;
        this.f78978c = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.un0
    @NotNull
    /* renamed from: a */
    public final String mo26283a() {
        String str;
        C37612s0 c37612s0 = C37612s0.f99333a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f78977b);
        RectF rectF = this.f78978c;
        if (rectF != null) {
            str = C31714w0.m28089a(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4, "{x:%s,y:%s,width:%s,height:%s}", "format(...)");
        } else {
            str = null;
        }
        objArr[1] = str;
        return C31714w0.m28089a(objArr, 2, "exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", "format(...)");
    }
}
