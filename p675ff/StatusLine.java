package p675ff;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p1077ze.Protocol;

@Metadata
/* renamed from: ff.k */
/* loaded from: classes10.dex */
public final class StatusLine {
    @NotNull

    /* renamed from: d */
    public static final C33142a f90526d = new C33142a(null);
    @NotNull

    /* renamed from: a */
    public final Protocol f90527a;

    /* renamed from: b */
    public final int f90528b;
    @NotNull

    /* renamed from: c */
    public final String f90529c;

    /* compiled from: StatusLine.kt */
    @Metadata
    /* renamed from: ff.k$a */
    /* loaded from: classes10.dex */
    public static final class C33142a {
        private C33142a() {
        }

        public /* synthetic */ C33142a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final StatusLine m24601a(@NotNull String statusLine) throws IOException {
            boolean m16624M;
            boolean m16624M2;
            Protocol protocol;
            int i;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            m16624M = StringsJVM.m16624M(statusLine, "HTTP/1.", false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(statusLine, "ICY ", false, 2, null);
                if (m16624M2) {
                    protocol = Protocol.HTTP_1_0;
                    i = 4;
                } else {
                    throw new ProtocolException(Intrinsics.m17064q("Unexpected status line: ", statusLine));
                }
            } else {
                i = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException(Intrinsics.m17064q("Unexpected status line: ", statusLine));
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException(Intrinsics.m17064q("Unexpected status line: ", statusLine));
                }
            }
            int i2 = i + 3;
            if (statusLine.length() >= i2) {
                try {
                    String substring = statusLine.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i2) {
                        if (statusLine.charAt(i2) == ' ') {
                            str = statusLine.substring(i + 4);
                            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException(Intrinsics.m17064q("Unexpected status line: ", statusLine));
                        }
                    } else {
                        str = "";
                    }
                    return new StatusLine(protocol, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(Intrinsics.m17064q("Unexpected status line: ", statusLine));
                }
            }
            throw new ProtocolException(Intrinsics.m17064q("Unexpected status line: ", statusLine));
        }
    }

    public StatusLine(@NotNull Protocol protocol, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f90527a = protocol;
        this.f90528b = i;
        this.f90529c = message;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f90527a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f90528b);
        sb2.append(' ');
        sb2.append(this.f90529c);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
