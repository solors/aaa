package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OperationType.kt */
@Metadata
/* loaded from: classes7.dex */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    UNIVERSAL_EVENT;

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
