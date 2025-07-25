package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProcessUtils.kt */
@RequiresApi(28)
@Metadata
/* loaded from: classes2.dex */
final class Api28Impl {
    @NotNull
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    @DoNotInline
    @NotNull
    public final String getProcessName() {
        String processName;
        processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
