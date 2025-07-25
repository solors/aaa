package com.unity3d.ads.core.domain.p619om;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OmFinishSession.kt */
@Metadata
/* renamed from: com.unity3d.ads.core.domain.om.OmFinishSession */
/* loaded from: classes7.dex */
public interface OmFinishSession {
    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull Continuation<? super Unit> continuation);
}
