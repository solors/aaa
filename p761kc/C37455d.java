package p761kc;

import com.ironsource.C20517nb;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1000uc.CharsetJVM;

/* compiled from: ContentTypes.kt */
@Metadata
/* renamed from: kc.d */
/* loaded from: classes9.dex */
public final class C37455d {
    @Nullable
    /* renamed from: a */
    public static final Charset m18014a(@NotNull HeaderValueWithParameters headerValueWithParameters) {
        Intrinsics.checkNotNullParameter(headerValueWithParameters, "<this>");
        String m17961c = headerValueWithParameters.m17961c(C20517nb.f52166M);
        if (m17961c == null) {
            return null;
        }
        try {
            return Charset.forName(m17961c);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final C37450c m18013b(@NotNull C37450c c37450c, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(c37450c, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return c37450c.m18020g(C20517nb.f52166M, CharsetJVM.m2873i(charset));
    }
}
