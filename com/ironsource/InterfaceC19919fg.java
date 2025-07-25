package com.ironsource;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.fg */
/* loaded from: classes6.dex */
public interface InterfaceC19919fg {

    @Metadata
    /* renamed from: com.ironsource.fg$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC19920a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(@NotNull String str);

        void onNativeAdLoadSuccess(@NotNull C19768dg c19768dg);

        void onNativeAdShown();
    }

    @Nullable
    /* renamed from: a */
    InterfaceC19920a mo58570a();

    /* renamed from: a */
    void mo58569a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    /* renamed from: a */
    void mo58568a(@Nullable InterfaceC19920a interfaceC19920a);

    /* renamed from: a */
    void mo58567a(@NotNull C19986gg c19986gg);

    @Nullable
    /* renamed from: b */
    C19768dg mo58566b();

    void destroy();
}
