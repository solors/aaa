package p865rb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sb.DivData;

@Metadata
/* renamed from: rb.a */
/* loaded from: classes8.dex */
public final class DivDataUtils {
    /* renamed from: a */
    public static final long m12579a(@NotNull DivData.C40791c c40791c) {
        Intrinsics.checkNotNullParameter(c40791c, "<this>");
        return -1L;
    }

    /* renamed from: b */
    public static final long m12578b(@NotNull DivData divData) {
        Intrinsics.checkNotNullParameter(divData, "<this>");
        if (divData.f106835b.isEmpty()) {
            return m12579a(DivData.f106829i);
        }
        return divData.f106835b.get(0).f106847b;
    }
}
