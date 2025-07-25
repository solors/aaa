package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetAdObject.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetAdObject {
    @Nullable
    Object invoke(@NotNull String str, @NotNull Continuation<? super AdObject> continuation);
}
