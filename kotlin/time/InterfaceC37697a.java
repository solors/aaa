package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSource.kt */
@Metadata
/* renamed from: kotlin.time.a */
/* loaded from: classes7.dex */
public interface InterfaceC37697a extends TimeSource, Comparable<InterfaceC37697a> {

    /* compiled from: TimeSource.kt */
    @Metadata
    /* renamed from: kotlin.time.a$a */
    /* loaded from: classes7.dex */
    public static final class C37698a {
        /* renamed from: a */
        public static int m16513a(@NotNull InterfaceC37697a interfaceC37697a, @NotNull InterfaceC37697a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m16492i(interfaceC37697a.mo16436a(other), Duration.f99494c.m16472c());
        }
    }

    /* renamed from: a */
    long mo16436a(@NotNull InterfaceC37697a interfaceC37697a);
}
