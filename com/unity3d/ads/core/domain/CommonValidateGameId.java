package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonValidateGameId.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonValidateGameId implements ValidateGameId {
    @NotNull
    private final GetGameId getGameId;
    @NotNull
    private final SetGameId setGameId;

    public CommonValidateGameId(@NotNull GetGameId getGameId, @NotNull SetGameId setGameId) {
        Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        Intrinsics.checkNotNullParameter(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(@Nullable String str) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        this.setGameId.invoke(str);
        return true;
    }
}
