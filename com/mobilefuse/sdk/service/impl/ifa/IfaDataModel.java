package com.mobilefuse.sdk.service.impl.ifa;

import com.mobilefuse.sdk.MobileFuseDefaults;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.service.impl.ifa.IfaDataModelKt */
/* loaded from: classes7.dex */
public final class IfaDataModel {
    @NotNull
    private static final IfaDetails IfaDefault = new IfaDetails(null, true, null);
    @NotNull
    private static final IfaDetails IfaError = new IfaDetails("", true, null);
    @NotNull
    private static final IfaDetails IfaZeros = new IfaDetails(MobileFuseDefaults.ADVERTISING_ID_ZEROS, true, null);

    @NotNull
    public static final IfaDetails getIfaDefault() {
        return IfaDefault;
    }

    @NotNull
    public static final IfaDetails getIfaError() {
        return IfaError;
    }

    @NotNull
    public static final IfaDetails getIfaZeros() {
        return IfaZeros;
    }
}
