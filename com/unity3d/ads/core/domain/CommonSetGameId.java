package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonSetGameId.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonSetGameId implements SetGameId {
    @NotNull
    private final SessionRepository sessionRepository;

    public CommonSetGameId(@NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetGameId
    public void invoke(@Nullable String str) {
        this.sessionRepository.setGameId(str);
    }
}
