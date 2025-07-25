package p656eb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1059ya.AbstractC45073g;

@Metadata
/* renamed from: eb.g */
/* loaded from: classes8.dex */
public class ParsingException extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final ParsingExceptionReason f89837b;
    @Nullable

    /* renamed from: c */
    private final AbstractC45073g f89838c;
    @Nullable

    /* renamed from: d */
    private final String f89839d;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, AbstractC45073g abstractC45073g, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingExceptionReason, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : abstractC45073g, (i & 16) != 0 ? null : str2);
    }

    @Nullable
    /* renamed from: a */
    public String m25392a() {
        return this.f89839d;
    }

    @NotNull
    /* renamed from: b */
    public ParsingExceptionReason m25391b() {
        return this.f89837b;
    }

    @Nullable
    /* renamed from: c */
    public AbstractC45073g m25390c() {
        return this.f89838c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParsingException(@NotNull ParsingExceptionReason reason, @NotNull String message, @Nullable Throwable th, @Nullable AbstractC45073g abstractC45073g, @Nullable String str) {
        super(message, th);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f89837b = reason;
        this.f89838c = abstractC45073g;
        this.f89839d = str;
    }
}
