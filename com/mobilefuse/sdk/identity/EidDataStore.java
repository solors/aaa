package com.mobilefuse.sdk.identity;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EidDataStore.kt */
@Metadata
/* loaded from: classes7.dex */
public interface EidDataStore {
    @NotNull
    Map<String, String> loadEidOverrides();

    @NotNull
    EidDataModel loadSdkEids();

    void storeEidOverrides(@NotNull Map<String, String> map);

    void storeSdkEids(@NotNull EidDataModel eidDataModel);
}
