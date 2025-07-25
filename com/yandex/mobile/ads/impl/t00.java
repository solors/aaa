package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sg0;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p789m9.BitmapSource;
import p789m9.CachedBitmap;
import p789m9.DivImageDownloadCallback;
import p789m9.DivImageLoader;
import p789m9.LoadReference;

/* loaded from: classes8.dex */
public final class t00 implements DivImageLoader {
    @NotNull

    /* renamed from: a */
    private final tu1 f85471a;
    @NotNull

    /* renamed from: b */
    private final jq0 f85472b;

    /* renamed from: com.yandex.mobile.ads.impl.t00$a */
    /* loaded from: classes8.dex */
    public static final class C31418a implements sg0.InterfaceC31359d {

        /* renamed from: a */
        final /* synthetic */ ImageView f85473a;

        C31418a(ImageView imageView) {
            this.f85473a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
        /* renamed from: a */
        public final void mo29243a(@Nullable yc2 yc2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sg0.InterfaceC31359d
        /* renamed from: a */
        public final void mo29321a(@Nullable sg0.C31358c c31358c, boolean z) {
            Bitmap m29608b = c31358c.m29608b();
            if (m29608b != null) {
                this.f85473a.setImageBitmap(m29608b);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.t00$b */
    /* loaded from: classes8.dex */
    public static final class C31419b implements sg0.InterfaceC31359d {

        /* renamed from: a */
        final /* synthetic */ DivImageDownloadCallback f85474a;

        /* renamed from: b */
        final /* synthetic */ String f85475b;

        C31419b(String str, DivImageDownloadCallback divImageDownloadCallback) {
            this.f85474a = divImageDownloadCallback;
            this.f85475b = str;
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
        /* renamed from: a */
        public final void mo29243a(@Nullable yc2 yc2Var) {
            this.f85474a.mo626a();
        }

        @Override // com.yandex.mobile.ads.impl.sg0.InterfaceC31359d
        /* renamed from: a */
        public final void mo29321a(@Nullable sg0.C31358c c31358c, boolean z) {
            Bitmap m29608b = c31358c.m29608b();
            if (m29608b != null) {
                this.f85474a.mo624c(new CachedBitmap(m29608b, Uri.parse(this.f85475b), z ? BitmapSource.MEMORY : BitmapSource.NETWORK));
            }
        }
    }

    public t00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85471a = n91.f82636c.m31632a(context).m31635b();
        this.f85472b = new jq0();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.mobile.ads.impl.sg0$c, T] */
    /* renamed from: a */
    public static final void m29329a(C37609n0 imageContainer, t00 this$0, String imageUrl, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageUrl, "$imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "$imageView");
        imageContainer.f99327b = this$0.f85471a.m29624a(imageUrl, new C31418a(imageView), 0, 0);
    }

    @Override // p789m9.DivImageLoader
    public /* bridge */ /* synthetic */ Boolean hasSvgSupport() {
        return super.hasSvgSupport();
    }

    @Override // p789m9.DivImageLoader
    @NonNull
    @MainThread
    public /* bridge */ /* synthetic */ LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return super.loadImage(str, divImageDownloadCallback, i);
    }

    @Override // p789m9.DivImageLoader
    @NonNull
    @MainThread
    public /* bridge */ /* synthetic */ LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return super.loadImageBytes(str, divImageDownloadCallback, i);
    }

    /* renamed from: b */
    public static final void m29327b(C37609n0 imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        sg0.C31358c c31358c = (sg0.C31358c) imageContainer.f99327b;
        if (c31358c != null) {
            c31358c.m29610a();
        }
    }

    @NotNull
    public final LoadReference loadImage(@NotNull final String imageUrl, @NotNull final ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        final C37609n0 c37609n0 = new C37609n0();
        this.f85472b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.xx2
            @Override // java.lang.Runnable
            public final void run() {
                t00.m29329a(c37609n0, this, imageUrl, imageView);
            }
        });
        return new LoadReference() { // from class: com.yandex.mobile.ads.impl.yx2
            @Override // p789m9.LoadReference
            public final void cancel() {
                t00.m29330a(c37609n0);
            }
        };
    }

    @Override // p789m9.DivImageLoader
    @NotNull
    public final LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return m29331a(imageUrl, callback);
    }

    /* renamed from: a */
    public static final void m29330a(C37609n0 imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        sg0.C31358c c31358c = (sg0.C31358c) imageContainer.f99327b;
        if (c31358c != null) {
            c31358c.m29610a();
        }
    }

    @Override // p789m9.DivImageLoader
    @NotNull
    public final LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return m29331a(imageUrl, callback);
    }

    /* renamed from: a */
    private final LoadReference m29331a(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        final C37609n0 c37609n0 = new C37609n0();
        this.f85472b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.ay2
            @Override // java.lang.Runnable
            public final void run() {
                t00.m29328a(c37609n0, this, str, divImageDownloadCallback);
            }
        });
        return new LoadReference() { // from class: com.yandex.mobile.ads.impl.by2
            {
                t00.this = this;
            }

            @Override // p789m9.LoadReference
            public final void cancel() {
                t00.m29332a(t00.this, c37609n0);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.mobile.ads.impl.sg0$c, T] */
    /* renamed from: a */
    public static final void m29328a(C37609n0 imageContainer, t00 this$0, String imageUrl, DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageUrl, "$imageUrl");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        imageContainer.f99327b = this$0.f85471a.m29624a(imageUrl, new C31419b(imageUrl, callback), 0, 0);
    }

    /* renamed from: a */
    public static final void m29332a(t00 this$0, final C37609n0 imageContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        this$0.f85472b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.zx2
            @Override // java.lang.Runnable
            public final void run() {
                t00.m29327b(imageContainer);
            }
        });
    }
}
