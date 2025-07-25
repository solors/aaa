package p1000uc;

import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CharsetJVM.kt */
@Metadata
/* renamed from: uc.c */
/* loaded from: classes9.dex */
public class C44470c extends MalformedInputException {
    @NotNull

    /* renamed from: b */
    private final String f116732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44470c(@NotNull String message) {
        super(0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f116732b = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.f116732b;
    }
}
