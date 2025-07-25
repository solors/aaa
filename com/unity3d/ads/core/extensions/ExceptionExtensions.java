package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.ExceptionExtensionsKt */
/* loaded from: classes7.dex */
public final class ExceptionExtensions {
    @NotNull
    public static final String getShortenedStackTrace(@NotNull Throwable th, int i) {
        CharSequence m16571b1;
        Sequence m16556m0;
        Sequence m16825G;
        String m16806x;
        Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "stringWriter.toString()");
            m16571b1 = C37690r.m16571b1(stringWriter2);
            m16556m0 = C37690r.m16556m0(m16571b1.toString());
            m16825G = _Sequences.m16825G(m16556m0, i);
            m16806x = _Sequences.m16806x(m16825G, "\n", null, null, 0, null, null, 62, null);
            Closeable.m1220a(printWriter, null);
            Closeable.m1220a(stringWriter, null);
            return m16806x;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    @NotNull
    public static final String retrieveUnityCrashValue(@NotNull Throwable th) {
        StackTraceElement stackTraceElement;
        boolean z;
        String className;
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            stackTraceElement = null;
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                Intrinsics.checkNotNullExpressionValue(className, "className");
                z = C37690r.m16592R(className, SDKErrorHandler.UNITY_PACKAGE, false, 2, null);
            } else {
                z = false;
            }
            if (z) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        if (str == null) {
            return "unknown";
        }
        return str;
    }
}
