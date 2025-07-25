package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fh0 {
    @NotNull

    /* renamed from: a */
    private final wg0 f79079a;
    @NotNull

    /* renamed from: b */
    private final C31462tk f79080b;

    public /* synthetic */ fh0(wg0 wg0Var) {
        this(wg0Var, new C31462tk());
    }

    /* renamed from: a */
    public final boolean m34151a(@Nullable Drawable drawable, @NotNull bh0 imageValue) {
        InterfaceC31375sk d20Var;
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Bitmap mo27906b = this.f79079a.mo27906b(imageValue);
        if (mo27906b == null) {
            mo27906b = this.f79079a.mo27909a(imageValue);
        }
        if (drawable != null && mo27906b != null) {
            this.f79080b.getClass();
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            if (drawable instanceof BitmapDrawable) {
                d20Var = new C31591uk();
            } else {
                d20Var = new d20(new bp1(), new C31662vk());
            }
            return d20Var.mo28741a(drawable, mo27906b);
        }
        return false;
    }

    public fh0(@NotNull wg0 imageProvider, @NotNull C31462tk bitmapComparatorFactory) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(bitmapComparatorFactory, "bitmapComparatorFactory");
        this.f79079a = imageProvider;
        this.f79080b = bitmapComparatorFactory;
    }
}
