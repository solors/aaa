package com.facebook.gamingservices;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TournamentFetcher.kt */
@Metadata
/* loaded from: classes3.dex */
public final class GraphAPIException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphAPIException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
