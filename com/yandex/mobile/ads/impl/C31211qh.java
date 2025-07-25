package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;
import java.util.Set;
import kotlin.collections.SetsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qh */
/* loaded from: classes8.dex */
public final class C31211qh {
    @NotNull
    /* renamed from: a */
    public static Set m30362a(@NotNull C30578is nativeAdAssets) {
        Set m17129b;
        Set m17130a;
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        m17129b = SetsJVM.m17129b();
        if (nativeAdAssets.m33146a() != null) {
            m17129b.add("age");
        }
        if (nativeAdAssets.m33145b() != null) {
            m17129b.add("body");
        }
        if (nativeAdAssets.m33144c() != null) {
            m17129b.add("call_to_action");
        }
        if (nativeAdAssets.m33143d() != null) {
            m17129b.add(C21114v8.C21123i.f54109D);
        }
        if (nativeAdAssets.m33142e() != null) {
            m17129b.add("favicon");
        }
        if (nativeAdAssets.m33140g() != null) {
            m17129b.add("icon");
        }
        if (nativeAdAssets.m33139h() != null) {
            m17129b.add("media");
        }
        if (nativeAdAssets.m33138i() != null) {
            m17129b.add("media");
        }
        if (nativeAdAssets.m33137j() != null) {
            m17129b.add("price");
        }
        if (nativeAdAssets.m33136k() != null) {
            m17129b.add("rating");
        }
        if (nativeAdAssets.m33135l() != null) {
            m17129b.add("review_count");
        }
        if (nativeAdAssets.m33134m() != null) {
            m17129b.add("sponsored");
        }
        if (nativeAdAssets.m33133n() != null) {
            m17129b.add("title");
        }
        if (nativeAdAssets.m33132o() != null) {
            m17129b.add("warning");
        }
        if (nativeAdAssets.m33141f()) {
            m17129b.add("feedback");
        }
        m17130a = SetsJVM.m17130a(m17129b);
        return m17130a;
    }
}
