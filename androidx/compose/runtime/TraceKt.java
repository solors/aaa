package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Trace.kt */
@Metadata
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(@NotNull String sectionName, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(sectionName);
        try {
            T invoke = block.invoke();
            InlineMarker.m17017b(1);
            trace.endSection(beginSection);
            InlineMarker.m17018a(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.m17017b(1);
            Trace.INSTANCE.endSection(beginSection);
            InlineMarker.m17018a(1);
            throw th;
        }
    }
}
