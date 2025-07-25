package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGenerateByteStringId.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    @NotNull
    public ByteString invoke() {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        return ProtobufExtensions.toByteString(randomUUID);
    }
}
