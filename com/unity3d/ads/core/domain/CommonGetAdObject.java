package com.unity3d.ads.core.domain;

import com.google.protobuf.kotlin.ByteStrings;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetAdObject.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetAdObject implements GetAdObject {
    @NotNull
    private final AdRepository adRepository;

    public CommonGetAdObject(@NotNull AdRepository adRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    @Nullable
    public Object invoke(@NotNull String str, @NotNull Continuation<? super AdObject> continuation) {
        return this.adRepository.getAd(ByteStrings.toByteStringUtf8(str), continuation);
    }
}
