package com.explorestack.iab.mraid;

import androidx.annotation.NonNull;
import com.explorestack.iab.utils.InterfaceC10505b;
import p678g1.C33182b;

/* renamed from: com.explorestack.iab.mraid.b */
/* loaded from: classes3.dex */
public interface InterfaceC10471b {
    void onClose(@NonNull C10467a c10467a);

    void onExpired(@NonNull C10467a c10467a, @NonNull C33182b c33182b);

    void onLoadFailed(@NonNull C10467a c10467a, @NonNull C33182b c33182b);

    void onLoaded(@NonNull C10467a c10467a);

    void onOpenBrowser(@NonNull C10467a c10467a, @NonNull String str, @NonNull InterfaceC10505b interfaceC10505b);

    void onPlayVideo(@NonNull C10467a c10467a, @NonNull String str);

    void onShowFailed(@NonNull C10467a c10467a, @NonNull C33182b c33182b);

    void onShown(@NonNull C10467a c10467a);
}
