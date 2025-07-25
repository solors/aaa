package p763kf;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.OkHttpClient;
import p643df.TaskRunner;
import p705hf.Http2;

@Metadata
/* renamed from: kf.c */
/* loaded from: classes10.dex */
public final class AndroidLog {
    @NotNull

    /* renamed from: a */
    public static final AndroidLog f99181a = new AndroidLog();
    @NotNull

    /* renamed from: b */
    private static final CopyOnWriteArraySet<Logger> f99182b = new CopyOnWriteArraySet<>();
    @NotNull

    /* renamed from: c */
    private static final Map<String, String> f99183c;

    static {
        String name;
        Map<String, String> m17269y;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        if (r2 == null) {
            name = null;
        } else {
            name = r2.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        m17269y = C37559r0.m17269y(linkedHashMap);
        f99183c = m17269y;
    }

    private AndroidLog() {
    }

    /* renamed from: c */
    private final void m17656c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f99182b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C37516d.f99184a);
        }
    }

    /* renamed from: d */
    private final String m17655d(String str) {
        String m16531o1;
        String str2 = f99183c.get(str);
        if (str2 == null) {
            m16531o1 = _Strings.m16531o1(str, 23);
            return m16531o1;
        }
        return str2;
    }

    /* renamed from: a */
    public final void m17658a(@NotNull String loggerName, int i, @NotNull String message, @Nullable Throwable th) {
        int m16568d0;
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String m17655d = m17655d(loggerName);
        if (Log.isLoggable(m17655d, i)) {
            if (th != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(th));
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
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, m17655d, substring);
                    if (min >= m16568d0) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m17657b() {
        for (Map.Entry<String, String> entry : f99183c.entrySet()) {
            m17656c(entry.getKey(), entry.getValue());
        }
    }
}
