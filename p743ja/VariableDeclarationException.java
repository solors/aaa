package p743ja;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ja.i */
/* loaded from: classes8.dex */
public final class VariableDeclarationException extends RuntimeException {
    public /* synthetic */ VariableDeclarationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public VariableDeclarationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}
