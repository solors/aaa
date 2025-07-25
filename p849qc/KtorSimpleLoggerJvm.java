package p849qc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p852qf.C39417b;
import p852qf.InterfaceC39416a;

@Metadata
/* renamed from: qc.a */
/* loaded from: classes9.dex */
public final class KtorSimpleLoggerJvm {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC39416a m12789a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        InterfaceC39416a m12739j = C39417b.m12739j(name);
        Intrinsics.checkNotNullExpressionValue(m12739j, "getLogger(name)");
        return m12739j;
    }
}
