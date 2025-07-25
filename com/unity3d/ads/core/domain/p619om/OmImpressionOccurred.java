package com.unity3d.ads.core.domain.p619om;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OmImpressionOccurred.kt */
@Metadata
/* renamed from: com.unity3d.ads.core.domain.om.OmImpressionOccurred */
/* loaded from: classes7.dex */
public interface OmImpressionOccurred {
    @Nullable
    Object invoke(@NotNull AdObject adObject, boolean z, @NotNull Continuation<? super Unit> continuation);
}
