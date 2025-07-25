package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mv0 {
    @NotNull

    /* renamed from: a */
    private final e20 f82435a;
    @NotNull

    /* renamed from: b */
    private final zg0 f82436b;
    @NotNull

    /* renamed from: c */
    private final Point f82437c;

    public /* synthetic */ mv0(Context context) {
        this(context, new e20(), new zg0());
    }

    @NotNull
    /* renamed from: a */
    public final LinkedHashSet m31763a(@NotNull List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = images.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            if (url.length() > 0) {
                this.f82436b.getClass();
                if (width <= 0 || height <= 0) {
                    Point point = this.f82437c;
                    linkedHashSet.add(new bh0(point.x, point.y, url, null, 120));
                }
            }
        }
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: b */
    public final LinkedHashMap m31762b(@NotNull List nativeAdImages) {
        Intrinsics.checkNotNullParameter(nativeAdImages, "nativeAdImages");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = nativeAdImages.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            Drawable drawable = mediatedNativeAdImage.getDrawable();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && url.length() > 0) {
                this.f82435a.getClass();
                Bitmap m34702a = e20.m34702a(drawable);
                if (m34702a != null) {
                    linkedHashMap.put(url, m34702a);
                }
            }
        }
        return linkedHashMap;
    }

    public mv0(@NotNull Context context, @NotNull e20 drawableConverter, @NotNull zg0 imageSizeValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableConverter, "drawableConverter");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        this.f82435a = drawableConverter;
        this.f82436b = imageSizeValidator;
        this.f82437c = kd1.m32578b(context);
    }
}
