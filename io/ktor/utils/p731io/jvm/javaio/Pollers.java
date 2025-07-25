package io.ktor.utils.p731io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: io.ktor.utils.io.jvm.javaio.c */
/* loaded from: classes9.dex */
final class Pollers implements InterfaceC37217e<Thread> {
    @NotNull

    /* renamed from: a */
    public static final Pollers f98273a = new Pollers();

    private Pollers() {
    }

    @Override // io.ktor.utils.p731io.jvm.javaio.InterfaceC37217e
    /* renamed from: a */
    public void mo18724a(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LockSupport.parkNanos(j);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // io.ktor.utils.p731io.jvm.javaio.InterfaceC37217e
    /* renamed from: c */
    public void mo18723b(@NotNull Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        LockSupport.unpark(token);
    }
}
