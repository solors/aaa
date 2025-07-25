package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zc */
/* loaded from: classes8.dex */
public final class C31970zc {
    @NotNull

    /* renamed from: a */
    private static final CopyOnWriteArraySet<Logger> f88818a = new CopyOnWriteArraySet<>();
    @NotNull

    /* renamed from: b */
    private static final Map<String, String> f88819b;

    /* renamed from: c */
    public static final /* synthetic */ int f88820c = 0;

    static {
        String str;
        Map<String, String> m17269y;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = ja1.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = ja1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = oe0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = mz1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        m17269y = C37559r0.m17269y(linkedHashMap);
        f88819b = m17269y;
    }

    /* renamed from: a */
    public static void m26281a(@NotNull String loggerName, int i, @NotNull String message, @Nullable Throwable th) {
        int m16568d0;
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = f88819b.get(loggerName);
        if (str == null) {
            str = _Strings.m16531o1(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (th != null) {
                message = message + "\n" + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                m16568d0 = C37690r.m16568d0(message, '\n', i2, false, 4, null);
                if (m16568d0 == -1) {
                    m16568d0 = length;
                }
                while (true) {
                    min = Math.min(m16568d0, i2 + 4000);
                    String substring = message.substring(i2, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Log.println(i, str, substring);
                    if (min >= m16568d0) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: a */
    public static void m26282a() {
        Level level;
        for (Map.Entry<String, String> entry : f88819b.entrySet()) {
            String value = entry.getValue();
            Logger logger = Logger.getLogger(entry.getKey());
            if (f88818a.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(value, 3)) {
                    level = Level.FINE;
                } else {
                    level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(C29929ad.f76763a);
            }
        }
    }
}
