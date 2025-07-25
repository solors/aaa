package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;

@Metadata
/* renamed from: com.mobilefuse.sdk.internal.repository.MfxAdRepository$loadAd$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings */
/* loaded from: classes7.dex */
public final /* synthetic */ class C23580x57207cd1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ExceptionHandlingStrategy.values().length];
        $EnumSwitchMapping$1 = iArr;
        iArr[ExceptionHandlingStrategy.LogAndIgnore.ordinal()] = 1;
        iArr[ExceptionHandlingStrategy.Ignore.ordinal()] = 2;
    }
}
