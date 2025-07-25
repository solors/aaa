package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.ng0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class jh1 {
    @NotNull

    /* renamed from: a */
    private final y52 f80905a;
    @NotNull

    /* renamed from: b */
    private final ng0 f80906b;

    /* renamed from: com.yandex.mobile.ads.impl.jh1$a */
    /* loaded from: classes8.dex */
    private static final class C30624a implements ng0.InterfaceC30945b {

        /* renamed from: c */
        static final /* synthetic */ KProperty<Object>[] f80907c = {C30452ha.m33588a(C30624a.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), C30452ha.m33588a(C30624a.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};
        @NotNull

        /* renamed from: a */
        private final xj1 f80908a;
        @NotNull

        /* renamed from: b */
        private final xj1 f80909b;

        public C30624a(@NotNull ImageView preview, @NotNull ProgressBar progressBar) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            this.f80908a = yj1.m26872a(preview);
            this.f80909b = yj1.m26872a(progressBar);
        }

        @Override // com.yandex.mobile.ads.impl.ng0.InterfaceC30945b
        /* renamed from: a */
        public final void mo27693a(@Nullable Bitmap bitmap) {
            if (bitmap != null) {
                xj1 xj1Var = this.f80908a;
                KProperty<?>[] kPropertyArr = f80907c;
                ImageView imageView = (ImageView) xj1Var.getValue(this, kPropertyArr[0]);
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                    return;
                }
                ProgressBar progressBar = (ProgressBar) this.f80909b.getValue(this, kPropertyArr[1]);
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                }
                return;
            }
            ProgressBar progressBar2 = (ProgressBar) this.f80909b.getValue(this, f80907c[1]);
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        }
    }

    public jh1(@NotNull y52 video, @NotNull ng0 imageForPresentProvider) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        this.f80905a = video;
        this.f80906b = imageForPresentProvider;
    }

    /* renamed from: a */
    public final void m32925a(@NotNull g92 placeholderView) {
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        ImageView m33902a = placeholderView.m33902a();
        ProgressBar m33901b = placeholderView.m33901b();
        if (m33902a != null && this.f80905a.m27027a() != null) {
            this.f80906b.m31517a(this.f80905a.m27027a(), new C30624a(m33902a, m33901b));
        } else {
            m33901b.setVisibility(0);
        }
    }
}
