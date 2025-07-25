package p705hf;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: hf.n */
/* loaded from: classes10.dex */
public final class StreamResetException extends IOException {
    @NotNull

    /* renamed from: b */
    public final ErrorCode f91774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@NotNull ErrorCode errorCode) {
        super(Intrinsics.m17064q("stream was reset: ", errorCode));
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f91774b = errorCode;
    }
}
