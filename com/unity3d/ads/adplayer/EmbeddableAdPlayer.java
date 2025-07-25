package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: EmbeddableAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
public interface EmbeddableAdPlayer extends AdPlayer {

    /* compiled from: EmbeddableAdPlayer.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull Continuation<? super Unit> continuation) {
            Object m6959e;
            Object destroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, continuation);
            m6959e = C42688d.m6959e();
            if (destroy == m6959e) {
                return destroy;
            }
            return Unit.f99208a;
        }

        public static void show(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
