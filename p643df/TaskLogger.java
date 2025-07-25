package p643df;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: df.b */
/* loaded from: classes10.dex */
public final class TaskLogger {
    /* renamed from: a */
    public static final /* synthetic */ void m25651a(AbstractC32871a abstractC32871a, C32872d c32872d, String str) {
        m25649c(abstractC32871a, c32872d, str);
    }

    @NotNull
    /* renamed from: b */
    public static final String m25650b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m25649c(AbstractC32871a abstractC32871a, C32872d c32872d, String str) {
        Logger m25623a = TaskRunner.f89613h.m25623a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c32872d.m25643f());
        sb2.append(' ');
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(abstractC32871a.m25656b());
        m25623a.fine(sb2.toString());
    }
}
