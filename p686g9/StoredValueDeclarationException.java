package p686g9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: g9.a */
/* loaded from: classes8.dex */
public final class StoredValueDeclarationException extends RuntimeException {
    public /* synthetic */ StoredValueDeclarationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public StoredValueDeclarationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}
