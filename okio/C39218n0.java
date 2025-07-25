package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmOkio.kt */
@Metadata
/* renamed from: okio.n0 */
/* loaded from: classes10.dex */
public final /* synthetic */ class C39218n0 {

    /* renamed from: a */
    private static final Logger f102980a = Logger.getLogger("okio.Okio");

    @NotNull
    /* renamed from: b */
    public static final Sink m13497b(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return C39217m0.m13504g(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m13496c(@NotNull AssertionError assertionError) {
        boolean z;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = C37690r.m16592R(message, "getsockname failed", false, 2, null);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: d */
    public static final Sink m13495d(@NotNull File file, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return C39217m0.m13504g(new FileOutputStream(file, z));
    }

    @NotNull
    /* renamed from: e */
    public static final Sink m13494e(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new C39221q0(outputStream, new C39196c1());
    }

    @NotNull
    /* renamed from: f */
    public static final Sink m13493f(@NotNull Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        JvmOkio jvmOkio = new JvmOkio(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        return jvmOkio.sink(new C39221q0(outputStream, jvmOkio));
    }

    /* renamed from: g */
    public static /* synthetic */ Sink m13492g(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return C39217m0.m13505f(file, z);
    }

    @NotNull
    /* renamed from: h */
    public static final Source m13491h(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C39225t(new FileInputStream(file), C39196c1.NONE);
    }

    @NotNull
    /* renamed from: i */
    public static final Source m13490i(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C39225t(inputStream, new C39196c1());
    }

    @NotNull
    /* renamed from: j */
    public static final Source m13489j(@NotNull Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        JvmOkio jvmOkio = new JvmOkio(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        return jvmOkio.source(new C39225t(inputStream, jvmOkio));
    }
}
