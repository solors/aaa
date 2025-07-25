package p743ja;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656eb.ParsingEnvironment;

/* compiled from: ErrorsCollectorEnvironment.kt */
@Metadata
/* renamed from: ja.e */
/* loaded from: classes8.dex */
public final class C37301e {
    @NotNull
    /* renamed from: a */
    public static final ErrorsCollectorEnvironment m18499a(@NotNull ParsingEnvironment parsingEnvironment) {
        Intrinsics.checkNotNullParameter(parsingEnvironment, "<this>");
        return new ErrorsCollectorEnvironment(parsingEnvironment);
    }
}
