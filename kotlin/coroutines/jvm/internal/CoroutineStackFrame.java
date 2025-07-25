package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.e */
/* loaded from: classes7.dex */
public interface CoroutineStackFrame {
    @Nullable
    CoroutineStackFrame getCallerFrame();
}
