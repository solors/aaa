package com.yandex.div.core.player;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p802n9.DivPlayerPlaybackConfig;
import p802n9.DivVideoSource;
import sb.DivVideoScale;

/* compiled from: DivPlayerFactory.kt */
@Metadata
/* loaded from: classes8.dex */
public interface DivPlayerFactory {
    @NotNull

    /* renamed from: a */
    public static final C29615a f75354a = C29615a.f75356a;
    @NotNull

    /* renamed from: b */
    public static final DivPlayerFactory f75355b = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1

        /* compiled from: DivPlayerFactory.kt */
        @Metadata
        /* renamed from: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$a */
        /* loaded from: classes8.dex */
        public static final class C29616a implements DivPlayer {
            C29616a() {
            }
        }

        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        /* renamed from: c */
        public C29616a mo37192b(@NotNull List<DivVideoSource> src, @NotNull DivPlayerPlaybackConfig config) {
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(config, "config");
            return new C29616a();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        /* renamed from: d */
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 mo37193a(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                @Override // com.yandex.div.core.player.DivPlayerView, p802n9.DivVideoAttachable
                public /* bridge */ /* synthetic */ void attach(@NotNull DivPlayer divPlayer) {
                    super.attach(divPlayer);
                }

                @Override // com.yandex.div.core.player.DivPlayerView, p802n9.DivVideoAttachable
                public /* bridge */ /* synthetic */ void detach() {
                    super.detach();
                }

                @Override // com.yandex.div.core.player.DivPlayerView, p802n9.DivVideoAttachable
                @Nullable
                public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
                    return super.getAttachedPlayer();
                }

                @Override // com.yandex.div.core.player.DivPlayerView, p802n9.DivVideoAttachable
                public /* bridge */ /* synthetic */ void setScale(@NotNull DivVideoScale divVideoScale) {
                    super.setScale(divVideoScale);
                }

                @Override // com.yandex.div.core.player.DivPlayerView, p802n9.DivVideoAttachable
                public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
                    super.setVisibleOnScreen(z);
                }
            };
        }
    };

    /* compiled from: DivPlayerFactory.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.player.DivPlayerFactory$a */
    /* loaded from: classes8.dex */
    public static final class C29615a {

        /* renamed from: a */
        static final /* synthetic */ C29615a f75356a = new C29615a();

        private C29615a() {
        }
    }

    @NotNull
    /* renamed from: a */
    DivPlayerView mo37193a(@NotNull Context context);

    @NotNull
    /* renamed from: b */
    DivPlayer mo37192b(@NotNull List<DivVideoSource> list, @NotNull DivPlayerPlaybackConfig divPlayerPlaybackConfig);
}
