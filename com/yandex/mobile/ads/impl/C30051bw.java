package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.sg0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p789m9.LoadReference;

/* renamed from: com.yandex.mobile.ads.impl.bw */
/* loaded from: classes8.dex */
public final class C30051bw {
    @NotNull

    /* renamed from: a */
    private final sg0 f77416a;
    @NotNull

    /* renamed from: b */
    private final List<LoadReference> f77417b;

    /* renamed from: com.yandex.mobile.ads.impl.bw$a */
    /* loaded from: classes8.dex */
    public static final class C30052a implements sg0.InterfaceC31359d {

        /* renamed from: a */
        final /* synthetic */ ImageView f77418a;

        C30052a(ImageView imageView) {
            this.f77418a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
        /* renamed from: a */
        public final void mo29243a(@Nullable yc2 yc2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sg0.InterfaceC31359d
        /* renamed from: a */
        public final void mo29321a(@NotNull sg0.C31358c response, boolean z) {
            Intrinsics.checkNotNullParameter(response, "response");
            Bitmap m29608b = response.m29608b();
            if (m29608b != null) {
                this.f77418a.setImageBitmap(m29608b);
            }
        }
    }

    public C30051bw(@NotNull tu1 imageLoader, @NotNull List loadReferencesStorage) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(loadReferencesStorage, "loadReferencesStorage");
        this.f77416a = imageLoader;
        this.f77417b = loadReferencesStorage;
    }

    /* renamed from: b */
    public static /* synthetic */ void m35427b(sg0.C31358c c31358c) {
        m35429a(c31358c);
    }

    /* renamed from: a */
    public final void m35430a() {
        for (LoadReference loadReference : this.f77417b) {
            loadReference.cancel();
        }
        this.f77417b.clear();
    }

    @NotNull
    /* renamed from: a */
    public final LoadReference m35428a(@NotNull String imageUrl, @NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        final sg0.C31358c m29624a = this.f77416a.m29624a(imageUrl, new C30052a(imageView), 0, 0);
        Intrinsics.checkNotNullExpressionValue(m29624a, "get(...)");
        LoadReference loadReference = new LoadReference() { // from class: com.yandex.mobile.ads.impl.hl2
            @Override // p789m9.LoadReference
            public final void cancel() {
                C30051bw.m35427b(sg0.C31358c.this);
            }
        };
        this.f77417b.add(loadReference);
        return loadReference;
    }

    /* renamed from: a */
    public static final void m35429a(sg0.C31358c imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        imageContainer.m29610a();
    }
}
