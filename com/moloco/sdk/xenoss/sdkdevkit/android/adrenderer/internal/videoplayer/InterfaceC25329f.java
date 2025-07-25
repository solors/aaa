package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24530i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.EnumC24587l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.AbstractC25258i;
import ge.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f */
/* loaded from: classes7.dex */
public interface InterfaceC25329f extends InterfaceC24530i {
    @Nullable
    /* renamed from: M */
    View mo44726M();

    /* renamed from: a */
    void mo44725a(@Nullable String str);

    /* renamed from: a */
    void mo44724a(boolean z);

    @NotNull
    /* renamed from: e */
    StateFlow<EnumC24587l> mo44723e();

    @NotNull
    StateFlow<C25318b> isPlaying();

    @NotNull
    /* renamed from: o */
    StateFlow<AbstractC25258i> mo44721o();

    void pause();

    void play();

    void seekTo(long j);
}
