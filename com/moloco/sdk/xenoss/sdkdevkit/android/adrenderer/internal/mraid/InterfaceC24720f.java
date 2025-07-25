package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.internal.AbstractC24405t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24530i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.EnumC24577d;
import ge.SharedFlow;
import ge.StateFlow;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f */
/* loaded from: classes7.dex */
public interface InterfaceC24720f extends InterfaceC24530i {
    @Nullable
    /* renamed from: a */
    Object mo45836a(@NotNull String str, @NotNull Continuation<? super AbstractC24405t<C24708c, EnumC24577d>> continuation);

    /* renamed from: b */
    void mo45835b(@NotNull EnumC24746q enumC24746q);

    @NotNull
    /* renamed from: c */
    WebView mo45834c();

    /* renamed from: c */
    void mo45833c(@NotNull C24747r c24747r);

    /* renamed from: d */
    void mo45832d(@NotNull EnumC24748s enumC24748s);

    /* renamed from: d */
    void mo45831d(boolean z);

    /* renamed from: h */
    void mo45828h(boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    /* renamed from: i */
    void mo45827i();

    /* renamed from: k */
    void mo45826k(@NotNull AbstractC24735n abstractC24735n, @NotNull String str);

    @NotNull
    /* renamed from: w */
    SharedFlow<AbstractC24735n> mo45819w();

    @NotNull
    /* renamed from: x */
    StateFlow<EnumC24577d> mo45818x();
}
