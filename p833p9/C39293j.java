package p833p9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStatePath.kt */
@Metadata
/* renamed from: p9.j */
/* loaded from: classes8.dex */
public final class C39293j extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39293j(@NotNull String message, @Nullable Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ C39293j(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
