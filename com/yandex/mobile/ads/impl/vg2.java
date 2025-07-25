package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vg2 implements InterfaceC30807ls {
    @NotNull

    /* renamed from: a */
    private final NativeAdImageLoadingListener f86750a;

    /* renamed from: com.yandex.mobile.ads.impl.vg2$a */
    /* loaded from: classes8.dex */
    static final class C31657a extends Lambda implements Functions<Unit> {
        C31657a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            vg2.this.f86750a.onFinishLoadingImages();
            return Unit.f99208a;
        }
    }

    public vg2(@NotNull NativeAdImageLoadingListener imageLoadingListener) {
        Intrinsics.checkNotNullParameter(imageLoadingListener, "imageLoadingListener");
        this.f86750a = imageLoadingListener;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vg2) && Intrinsics.m17075f(this.f86750a, ((vg2) obj).f86750a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f86750a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30807ls
    public final void onFinishLoadingImages() {
        new CallbackStackTraceMarker(new C31657a());
    }

    @NotNull
    public final String toString() {
        NativeAdImageLoadingListener nativeAdImageLoadingListener = this.f86750a;
        return "YandexNativeAdImageLoadingListenerAdapter(imageLoadingListener=" + nativeAdImageLoadingListener + ")";
    }
}
