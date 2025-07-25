package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.A */
/* loaded from: classes4.dex */
public final class C15064A extends IOException {
    public C15064A(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
