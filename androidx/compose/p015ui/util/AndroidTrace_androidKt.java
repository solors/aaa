package androidx.compose.p015ui.util;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidTrace.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.util.AndroidTrace_androidKt */
/* loaded from: classes.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(@NotNull String sectionName, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace.beginSection(sectionName);
        try {
            return block.invoke();
        } finally {
            InlineMarker.m17017b(1);
            Trace.endSection();
            InlineMarker.m17018a(1);
        }
    }
}
