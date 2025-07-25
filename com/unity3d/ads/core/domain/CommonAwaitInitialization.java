package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37727f3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonAwaitInitialization.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    @NotNull
    private final SessionRepository sessionRepository;

    public CommonAwaitInitialization(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    @Nullable
    public Object invoke(long j, @NotNull Continuation<? super InitializationState> continuation) {
        return C37727f3.m16350e(j, new CommonAwaitInitialization$invoke$2(this, null), continuation);
    }
}
