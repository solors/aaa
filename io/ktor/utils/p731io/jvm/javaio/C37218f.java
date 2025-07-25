package io.ktor.utils.p731io.jvm.javaio;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pollers.kt */
@Metadata
/* renamed from: io.ktor.utils.io.jvm.javaio.f */
/* loaded from: classes9.dex */
public final class C37218f {
    @NotNull

    /* renamed from: a */
    private static final ThreadLocal<InterfaceC37217e<Thread>> f98284a = new ThreadLocal<>();

    @NotNull
    /* renamed from: a */
    public static final InterfaceC37217e<Thread> m18726a() {
        InterfaceC37217e<Thread> interfaceC37217e = f98284a.get();
        if (interfaceC37217e == null) {
            return Pollers.f98273a;
        }
        return interfaceC37217e;
    }

    /* renamed from: b */
    public static final boolean m18725b() {
        if (m18726a() != C37219g.f98285a) {
            return true;
        }
        return false;
    }
}
