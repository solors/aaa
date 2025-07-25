package p1077ze;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ze.o */
/* loaded from: classes10.dex */
public final class Credentials {
    @NotNull

    /* renamed from: a */
    public static final Credentials f119296a = new Credentials();

    private Credentials() {
    }

    @NotNull
    /* renamed from: a */
    public static final String m262a(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.m17064q("Basic ", C39208h.f102952f.m13548c(username + ':' + password, charset).mo13398b());
    }
}
