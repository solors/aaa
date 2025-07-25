package p674fe;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C37786p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.common.kt */
@Metadata
/* renamed from: fe.l */
/* loaded from: classes7.dex */
final /* synthetic */ class C33127l {
    /* renamed from: a */
    public static final void m24660a(@NotNull InterfaceC33135t<?> interfaceC33135t, @Nullable Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C37786p1.m16121a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC33135t.cancel(cancellationException);
    }
}
