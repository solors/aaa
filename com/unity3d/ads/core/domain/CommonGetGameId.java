package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetGameId.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetGameId implements GetGameId {
    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetGameId(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetGameId
    @Nullable
    public String invoke() {
        return this.sessionRepository.getGameId();
    }
}
