package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class ug0 {
    @NotNull

    /* renamed from: a */
    private final zg1 f86267a;
    @NotNull

    /* renamed from: b */
    private final ah1 f86268b;
    @NotNull

    /* renamed from: c */
    private final C31826xk f86269c;

    public /* synthetic */ ug0() {
        this(new zg1(), new ah1(), new C31826xk());
    }

    @Nullable
    /* renamed from: a */
    public final Bitmap m28784a(@NotNull bh0 imageValue) {
        Object m14549b;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String m35473c = imageValue.m35473c();
        if (m35473c == null) {
            return null;
        }
        this.f86267a.getClass();
        Bitmap m26233a = zg1.m26233a(m35473c);
        if (m26233a != null) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(this.f86268b.m35870a(m26233a, imageValue));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            bitmap = (Bitmap) m14549b;
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        this.f86269c.getClass();
        return C31826xk.m27474a(bitmap, 1.0d);
    }

    public ug0(@NotNull zg1 previewBitmapCreator, @NotNull ah1 previewBitmapScaler, @NotNull C31826xk blurredBitmapProvider) {
        Intrinsics.checkNotNullParameter(previewBitmapCreator, "previewBitmapCreator");
        Intrinsics.checkNotNullParameter(previewBitmapScaler, "previewBitmapScaler");
        Intrinsics.checkNotNullParameter(blurredBitmapProvider, "blurredBitmapProvider");
        this.f86267a = previewBitmapCreator;
        this.f86268b = previewBitmapScaler;
        this.f86269c = blurredBitmapProvider;
    }
}
