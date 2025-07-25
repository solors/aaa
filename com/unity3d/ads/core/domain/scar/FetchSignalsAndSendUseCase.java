package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FetchSignalsAndSendUseCase.kt */
@Metadata
/* loaded from: classes7.dex */
public interface FetchSignalsAndSendUseCase {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation);
}
