package androidx.core.p017os;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.os.TraceKt */
/* loaded from: classes.dex */
public final class Trace {
    public static final <T> T trace(@NotNull String sectionName, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        TraceCompat.beginSection(sectionName);
        try {
            return block.invoke();
        } finally {
            InlineMarker.m17017b(1);
            TraceCompat.endSection();
            InlineMarker.m17018a(1);
        }
    }
}
