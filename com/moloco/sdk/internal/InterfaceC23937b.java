package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.internal.publisher.C24068a;
import com.moloco.sdk.internal.services.InterfaceC24377m;
import com.moloco.sdk.internal.services.InterfaceC24382o;
import com.moloco.sdk.internal.services.InterfaceC24400v;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC25381r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC24544a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC24771s;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.InterfaceC25432i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.b */
/* loaded from: classes7.dex */
public interface InterfaceC23937b {
    @Nullable
    /* renamed from: a */
    InterstitialAd mo47310a(@NotNull Context context, @NotNull InterfaceC24377m interfaceC24377m, @NotNull String str, @NotNull InterfaceC24771s interfaceC24771s, @NotNull InterfaceC24544a0 interfaceC24544a0, @NotNull InterfaceC25432i interfaceC25432i, @NotNull InterfaceC25381r interfaceC25381r, @NotNull C24068a c24068a);

    @Nullable
    /* renamed from: b */
    Banner mo47309b(@NotNull Context context, @NotNull InterfaceC24377m interfaceC24377m, @NotNull String str, @NotNull InterfaceC24771s interfaceC24771s, @NotNull InterfaceC24544a0 interfaceC24544a0, @NotNull InterfaceC25381r interfaceC25381r, @NotNull C24068a c24068a, @NotNull InterfaceC23933a interfaceC23933a, @NotNull AbstractC23987i abstractC23987i);

    @Nullable
    /* renamed from: c */
    Banner mo47308c(@NotNull Context context, @NotNull InterfaceC24377m interfaceC24377m, @NotNull String str, @NotNull InterfaceC24771s interfaceC24771s, @NotNull InterfaceC24544a0 interfaceC24544a0, @NotNull InterfaceC25381r interfaceC25381r, @NotNull C24068a c24068a, @NotNull InterfaceC23933a interfaceC23933a, @NotNull AbstractC23987i abstractC23987i);

    @Nullable
    /* renamed from: d */
    Banner mo47307d(@NotNull Context context, @NotNull InterfaceC24377m interfaceC24377m, @NotNull String str, @NotNull InterfaceC24771s interfaceC24771s, @NotNull InterfaceC24544a0 interfaceC24544a0, @NotNull InterfaceC25381r interfaceC25381r, @NotNull C24068a c24068a, @NotNull InterfaceC23933a interfaceC23933a, @NotNull AbstractC23987i abstractC23987i);

    @Nullable
    /* renamed from: e */
    NativeAd mo47306e(@NotNull Context context, @NotNull InterfaceC24377m interfaceC24377m, @NotNull InterfaceC24400v interfaceC24400v, @NotNull String str, @NotNull InterfaceC24771s interfaceC24771s, @NotNull InterfaceC24544a0 interfaceC24544a0, @NotNull InterfaceC25432i interfaceC25432i, @NotNull InterfaceC23933a interfaceC23933a, @NotNull InterfaceC25381r interfaceC25381r, @NotNull C24068a c24068a, @NotNull InterfaceC24382o interfaceC24382o);

    @Nullable
    /* renamed from: f */
    RewardedInterstitialAd mo47305f(@NotNull Context context, @NotNull InterfaceC24377m interfaceC24377m, @NotNull String str, @NotNull InterfaceC24771s interfaceC24771s, @NotNull InterfaceC24544a0 interfaceC24544a0, @NotNull InterfaceC25432i interfaceC25432i, @NotNull InterfaceC25381r interfaceC25381r, @NotNull C24068a c24068a);
}
