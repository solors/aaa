package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AdRepository {
    @Nullable
    Object addAd(@NotNull ByteString byteString, @NotNull AdObject adObject, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getAd(@NotNull ByteString byteString, @NotNull Continuation<? super AdObject> continuation);

    @Nullable
    Object hasOpportunityId(@NotNull ByteString byteString, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object removeAd(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation);
}
