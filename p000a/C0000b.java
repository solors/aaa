package p000a;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineDebugging.kt */
@Metadata
/* renamed from: a.b */
/* loaded from: classes.dex */
public final class C0000b {
    @NotNull

    /* renamed from: a */
    private static final String f0a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final StackTraceElement m105906b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f0a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
