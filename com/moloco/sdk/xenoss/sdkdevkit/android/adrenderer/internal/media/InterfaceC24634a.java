package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24650f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.InterfaceC24683a;
import java.io.File;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a */
/* loaded from: classes7.dex */
public interface InterfaceC24634a {
    /* renamed from: a */
    boolean mo46010a(@NotNull File file);

    /* renamed from: b */
    boolean mo46009b(@NotNull File file);

    @Nullable
    /* renamed from: c */
    Object mo46008c(@NotNull String str, @NotNull File file, @NotNull String str2, @Nullable InterfaceC24683a interfaceC24683a, @NotNull Continuation<? super InterfaceC24650f.AbstractC24651a> continuation);
}
