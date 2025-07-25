package io.ktor.utils.p731io.jvm.javaio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: Pollers.kt */
@Metadata
/* renamed from: io.ktor.utils.io.jvm.javaio.g */
/* loaded from: classes9.dex */
final class C37219g implements InterfaceC37217e<Thread> {
    @NotNull

    /* renamed from: a */
    public static final C37219g f98285a = new C37219g();

    private C37219g() {
    }

    /* renamed from: c */
    private final Void m18722c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.p731io.jvm.javaio.InterfaceC37217e
    /* renamed from: a */
    public void mo18724a(long j) {
        m18722c();
        throw new ExceptionsH();
    }

    @Override // io.ktor.utils.p731io.jvm.javaio.InterfaceC37217e
    /* renamed from: d */
    public void mo18723b(@NotNull Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Pollers.f98273a.mo18723b(token);
    }
}
