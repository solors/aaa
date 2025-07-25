package com.mbridge.msdk.mbnative.p467b;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.mbridge.msdk.mbnative.b.a */
/* loaded from: classes6.dex */
public final class NativeConst {
    /* renamed from: a */
    public static String m51346a(Exception exc) {
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
        return "";
    }
}
