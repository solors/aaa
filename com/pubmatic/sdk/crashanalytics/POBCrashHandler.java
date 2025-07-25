package com.pubmatic.sdk.crashanalytics;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: POBCrashHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBCrashHandler implements Thread.UncaughtExceptionHandler {
    @NotNull

    /* renamed from: a */
    private final Context f70347a;
    @Nullable

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f70348b;

    public POBCrashHandler(@NotNull Context context, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f70347a = context;
        this.f70348b = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private final String m40511a(Throwable th) {
        boolean m16596P;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "stringWriter.toString()");
        stringWriter.close();
        printWriter.close();
        m16596P = C37690r.m16596P(stringWriter2, "com.pubmatic.sdk", true);
        if (!m16596P) {
            return null;
        }
        return stringWriter2;
    }

    public final void destroy() {
        Thread.setDefaultUncaughtExceptionHandler(this.f70348b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String m40511a = m40511a(throwable);
        if (m40511a != null) {
            POBCrashStorage pOBCrashStorage = POBCrashStorage.INSTANCE;
            if (pOBCrashStorage.getCrashJsonArray().length() == 10) {
                pOBCrashStorage.getCrashJsonArray().remove(0);
            }
            JSONArray crashJsonArray = pOBCrashStorage.getCrashJsonArray();
            String name = throwable.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "throwable.javaClass.name");
            crashJsonArray.put(new POBCrashHelper(name, m40511a, System.currentTimeMillis()).getCrashJson(this.f70347a));
            Context context = this.f70347a;
            String jSONArray = pOBCrashStorage.getCrashJsonArray().toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "POBCrashStorage.crashJsonArray.toString()");
            POBCrashAnalyticsUtils.writeToFile(context, "POBCrash.txt", jSONArray);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f70348b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, throwable);
        }
    }
}
