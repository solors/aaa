package com.yandex.div.core.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.player.a */
/* loaded from: classes8.dex */
public interface DivPlayer {
    @NotNull

    /* renamed from: a */
    public static final C29617a f75357a = C29617a.f75358a;

    /* compiled from: DivPlayer.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.player.a$a */
    /* loaded from: classes8.dex */
    public static final class C29617a {

        /* renamed from: a */
        static final /* synthetic */ C29617a f75358a = new C29617a();

        private C29617a() {
        }
    }

    /* compiled from: DivPlayer.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.player.a$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC29618b {
    }

    /* renamed from: a */
    default void m37189a(@NotNull InterfaceC29618b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    default void pause() {
    }

    default void play() {
    }

    default void release() {
    }

    default void seek(long j) {
    }

    default void setMuted(boolean z) {
    }
}
