package p804nd;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1001ud.C44472b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
@Metadata
/* renamed from: nd.f */
/* loaded from: classes5.dex */
public class C38497f {
    /* renamed from: a */
    public static void m14566a(@NotNull Throwable th, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            C44472b.f116736a.mo2377a(th, exception);
        }
    }

    @NotNull
    /* renamed from: b */
    public static String m14565b(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
