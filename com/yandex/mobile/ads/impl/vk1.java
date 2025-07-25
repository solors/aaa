package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vk1 {

    /* renamed from: com.yandex.mobile.ads.impl.vk1$a */
    /* loaded from: classes8.dex */
    private static final class RunnableC31664a implements Runnable {
        @NotNull

        /* renamed from: b */
        private final i81 f86779b;
        @NotNull

        /* renamed from: c */
        private final yk1 f86780c;

        public RunnableC31664a(@NotNull i81 nativeVideoView, @NotNull yk1 replayActionView) {
            Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
            Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
            this.f86779b = nativeVideoView;
            this.f86780c = replayActionView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f86779b.m33349c().setVisibility(4);
            this.f86780c.m26865a().setVisibility(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vk1$b */
    /* loaded from: classes8.dex */
    private static final class RunnableC31665b implements Runnable {
        @NotNull

        /* renamed from: b */
        private final yk1 f86781b;
        @NotNull

        /* renamed from: c */
        private final Bitmap f86782c;

        public RunnableC31665b(@NotNull yk1 replayActionView, @NotNull Bitmap background) {
            Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
            Intrinsics.checkNotNullParameter(background, "background");
            this.f86781b = replayActionView;
            this.f86782c = background;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f86781b.setBackground(new BitmapDrawable(this.f86781b.getResources(), this.f86782c));
            this.f86781b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m28292a(@NotNull i81 nativeVideoView, @NotNull yk1 replayActionView, @NotNull Bitmap background) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        Intrinsics.checkNotNullParameter(background, "background");
        replayActionView.setAlpha(0.0f);
        replayActionView.animate().alpha(1.0f).setDuration(700L).withStartAction(new RunnableC31665b(replayActionView, background)).withEndAction(new RunnableC31664a(nativeVideoView, replayActionView)).start();
    }
}
