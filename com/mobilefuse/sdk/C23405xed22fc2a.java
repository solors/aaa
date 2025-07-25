package com.mobilefuse.sdk;

import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;

@Metadata
/* renamed from: com.mobilefuse.sdk.SensorService$getLastPressure$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings */
/* loaded from: classes7.dex */
public final /* synthetic */ class C23405xed22fc2a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ExceptionHandlingStrategy.values().length];
        $EnumSwitchMapping$1 = iArr;
        iArr[ExceptionHandlingStrategy.LogAndIgnore.ordinal()] = 1;
        iArr[ExceptionHandlingStrategy.Ignore.ordinal()] = 2;
    }
}
