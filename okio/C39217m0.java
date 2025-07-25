package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.m0 */
/* loaded from: classes10.dex */
public final class C39217m0 {
    @NotNull
    /* renamed from: a */
    public static final Sink m13510a(@NotNull File file) throws FileNotFoundException {
        return C39218n0.m13497b(file);
    }

    @NotNull
    /* renamed from: b */
    public static final Sink m13509b() {
        return C39219o0.m13488a();
    }

    @NotNull
    /* renamed from: c */
    public static final BufferedSink m13508c(@NotNull Sink sink) {
        return C39219o0.m13487b(sink);
    }

    @NotNull
    /* renamed from: d */
    public static final BufferedSource m13507d(@NotNull Source source) {
        return C39219o0.m13486c(source);
    }

    /* renamed from: e */
    public static final boolean m13506e(@NotNull AssertionError assertionError) {
        return C39218n0.m13496c(assertionError);
    }

    @NotNull
    /* renamed from: f */
    public static final Sink m13505f(@NotNull File file, boolean z) throws FileNotFoundException {
        return C39218n0.m13495d(file, z);
    }

    @NotNull
    /* renamed from: g */
    public static final Sink m13504g(@NotNull OutputStream outputStream) {
        return C39218n0.m13494e(outputStream);
    }

    @NotNull
    /* renamed from: h */
    public static final Sink m13503h(@NotNull Socket socket) throws IOException {
        return C39218n0.m13493f(socket);
    }

    @NotNull
    /* renamed from: j */
    public static final Source m13501j(@NotNull File file) throws FileNotFoundException {
        return C39218n0.m13491h(file);
    }

    @NotNull
    /* renamed from: k */
    public static final Source m13500k(@NotNull InputStream inputStream) {
        return C39218n0.m13490i(inputStream);
    }

    @NotNull
    /* renamed from: l */
    public static final Source m13499l(@NotNull Socket socket) throws IOException {
        return C39218n0.m13489j(socket);
    }
}
