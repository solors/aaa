package androidx.core.p017os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OutcomeReceiver.kt */
@RequiresApi(31)
@Metadata
/* renamed from: androidx.core.os.OutcomeReceiverKt */
/* loaded from: classes.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    @NotNull
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(@NotNull Continuation<? super R> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new OutcomeReceiver(continuation);
    }
}
