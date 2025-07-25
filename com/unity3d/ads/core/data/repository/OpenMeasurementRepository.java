package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OpenMeasurementRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface OpenMeasurementRepository {
    @Nullable
    Object activateOM(@NotNull Context context, @NotNull Continuation<? super OMResult> continuation);

    @Nullable
    Object finishSession(@NotNull ByteString byteString, @NotNull Continuation<? super OMResult> continuation);

    @NotNull
    OMData getOmData();

    boolean hasSessionFinished(@NotNull ByteString byteString);

    @Nullable
    Object impressionOccurred(@NotNull ByteString byteString, boolean z, @NotNull Continuation<? super OMResult> continuation);

    boolean isOMActive();

    void setOMActive(boolean z);

    @Nullable
    Object startSession(@NotNull ByteString byteString, @Nullable WebView webView, @NotNull OmidOptions omidOptions, @NotNull Continuation<? super OMResult> continuation);
}
