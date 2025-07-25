package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p574fi.NullableFunction;
import com.smaato.sdk.video.vast.model.C27719Ad;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;

/* renamed from: com.smaato.sdk.video.vast.buildlight.c */
/* loaded from: classes7.dex */
final class ResolvedWrapperMergeUtils {
    /* renamed from: b */
    public static /* synthetic */ C27719Ad m38889b(C27719Ad c27719Ad, C27719Ad c27719Ad2, C27719Ad c27719Ad3) {
        if (c27719Ad3 != c27719Ad) {
            return c27719Ad3;
        }
        return c27719Ad2;
    }

    @NonNull
    /* renamed from: c */
    public static VastTree m38888c(@NonNull VastTree vastTree, @NonNull VastTree vastTree2, @NonNull AdContainer<Wrapper> adContainer) {
        if (vastTree2.ads.contains(adContainer.f72441a)) {
            final C27719Ad c27719Ad = adContainer.f72441a;
            final C27719Ad build = adContainer.f72441a.newBuilder().setWrapper(adContainer.f72442b.newBuilder().setVastTree(vastTree).build()).build();
            return vastTree2.newBuilder().setAds(Lists.mapLazy(vastTree2.ads, new NullableFunction() { // from class: com.smaato.sdk.video.vast.buildlight.b
                @Override // com.smaato.sdk.core.util.p574fi.NullableFunction
                public final Object apply(Object obj) {
                    C27719Ad m38889b;
                    m38889b = ResolvedWrapperMergeUtils.m38889b(c27719Ad, build, (C27719Ad) obj);
                    return m38889b;
                }
            })).build();
        }
        throw new IllegalArgumentException("parentVastTree parameter should contains same ad that passed in parentWrapperContainer. Wrong argument passed for WrapperMergeUtilsTest::mergeParsedResultWithParents");
    }
}
