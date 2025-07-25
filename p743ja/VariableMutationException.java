package p743ja;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ja.j */
/* loaded from: classes8.dex */
public final class VariableMutationException extends RuntimeException {
    public /* synthetic */ VariableMutationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public VariableMutationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}
