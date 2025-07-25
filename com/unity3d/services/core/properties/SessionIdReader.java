package com.unity3d.services.core.properties;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionIdReader.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SessionIdReader {
    @NotNull
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    @NotNull
    private static final String sessionId;

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        sessionId = uuid;
    }

    private SessionIdReader() {
    }

    @NotNull
    public final String getSessionId() {
        return sessionId;
    }
}
