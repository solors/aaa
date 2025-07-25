package com.explorestack.iab.mraid;

import androidx.annotation.NonNull;
import com.explorestack.iab.utils.InterfaceC10505b;
import p678g1.C33182b;

/* renamed from: com.explorestack.iab.mraid.k */
/* loaded from: classes3.dex */
public interface InterfaceC10483k {
    void onClose(@NonNull MraidView mraidView);

    void onExpand(@NonNull MraidView mraidView);

    void onExpired(@NonNull MraidView mraidView, @NonNull C33182b c33182b);

    void onLoadFailed(@NonNull MraidView mraidView, @NonNull C33182b c33182b);

    void onLoaded(@NonNull MraidView mraidView);

    void onOpenBrowser(@NonNull MraidView mraidView, @NonNull String str, @NonNull InterfaceC10505b interfaceC10505b);

    void onPlayVideo(@NonNull MraidView mraidView, @NonNull String str);

    void onShowFailed(@NonNull MraidView mraidView, @NonNull C33182b c33182b);

    void onShown(@NonNull MraidView mraidView);
}
