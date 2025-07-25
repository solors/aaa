package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;

@Metadata
/* renamed from: com.mobilefuse.sdk.identity.EidService$onNewEidDataError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings */
/* loaded from: classes7.dex */
public final /* synthetic */ class C23560x7fbbeacb {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ExceptionHandlingStrategy.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[ExceptionHandlingStrategy.LogAndIgnore.ordinal()] = 1;
        iArr[ExceptionHandlingStrategy.Ignore.ordinal()] = 2;
    }
}
