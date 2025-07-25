package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C32032c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface f31 {
    @Nullable
    /* renamed from: a */
    n31 mo27041a();

    /* renamed from: a */
    void mo26385a(@Nullable InterfaceC30655js interfaceC30655js);

    /* renamed from: a */
    void mo26384a(@NotNull InterfaceC30807ls interfaceC30807ls);

    /* renamed from: a */
    void mo27040a(@Nullable C32032c c32032c);

    @NotNull
    /* renamed from: b */
    b61 mo27039b();

    /* renamed from: b */
    void mo26380b(@NotNull InterfaceC30807ls interfaceC30807ls);

    /* renamed from: b */
    void mo26379b(@NotNull z31 z31Var) throws t21;

    /* renamed from: b */
    void mo26378b(@NotNull z31 z31Var, @NotNull C31223qn c31223qn) throws t21;

    @Nullable
    /* renamed from: c */
    List<h10> mo27038c();

    void destroy();

    @NotNull
    C30578is getAdAssets();

    @NotNull
    xm1 getAdType();

    @Nullable
    String getInfo();

    @Nullable
    C31149ps getNativeAdVideoController();

    void loadImages();
}
