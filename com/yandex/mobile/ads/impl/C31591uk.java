package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.uk */
/* loaded from: classes8.dex */
public final class C31591uk implements InterfaceC31375sk<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC31375sk
    /* renamed from: a */
    public final boolean mo28741a(BitmapDrawable bitmapDrawable, Bitmap bitmap) {
        BitmapDrawable drawable = bitmapDrawable;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return Intrinsics.m17075f(bitmap, drawable.getBitmap());
    }
}
