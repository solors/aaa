package com.mobilefuse.videoplayer.utils;

import com.mobilefuse.videoplayer.model.VastCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaUtils.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MediaUtilsKt$selectEndCardCompanions$2 extends Lambda implements Function1<VastCompanion, Boolean> {
    public static final MediaUtilsKt$selectEndCardCompanions$2 INSTANCE = new MediaUtilsKt$selectEndCardCompanions$2();

    MediaUtilsKt$selectEndCardCompanions$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(VastCompanion vastCompanion) {
        return Boolean.valueOf(invoke2(vastCompanion));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(@NotNull VastCompanion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m17075f(it.getRenderingMode(), "end-card");
    }
}
