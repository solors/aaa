package com.apm.insight.p130l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.NpthBus;
import java.io.File;

/* renamed from: com.apm.insight.l.j */
/* loaded from: classes2.dex */
public final class LogPath {

    /* renamed from: a */
    private static String f3935a;

    /* renamed from: b */
    private static File f3936b;

    /* renamed from: c */
    private static File f3937c;

    /* renamed from: a */
    public static File m101679a(@NonNull Context context) {
        return new File(m101650j(context), "apminsight/CrashLogJava");
    }

    /* renamed from: b */
    public static File m101673b(@NonNull Context context) {
        return new File(m101650j(context), "apminsight/CrashLogSimple");
    }

    /* renamed from: c */
    public static File m101669c(@NonNull Context context) {
        return new File(m101650j(context), "apminsight/RuntimeContext");
    }

    /* renamed from: d */
    public static File m101666d(@NonNull Context context) {
        if (f3936b == null) {
            if (context == null) {
                context = NpthBus.m102011g();
            }
            f3936b = new File(m101650j(context), "apminsight/CrashLogNative");
        }
        return f3936b;
    }

    /* renamed from: e */
    public static File m101663e(@NonNull Context context) {
        if (f3937c == null) {
            f3937c = new File(m101650j(context) + "/apminsight/CrashCommonLog/" + NpthBus.m102012f());
        }
        return f3937c;
    }

    /* renamed from: f */
    public static File m101660f(Context context) {
        return new File(m101650j(context), "apminsight/CrashCommonLog");
    }

    /* renamed from: g */
    public static File m101657g(Context context) {
        return new File(m101650j(context), "apminsight/issueCrashTimes");
    }

    /* renamed from: h */
    public static File m101654h(Context context) {
        return new File(m101650j(context) + "/apminsight/issueCrashTimes/current.times");
    }

    /* renamed from: i */
    public static File m101652i(@NonNull Context context) {
        return new File(m101650j(context), "apminsight/alogCrash");
    }

    /* renamed from: j */
    public static File m101649j(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "threads.txt");
    }

    /* renamed from: k */
    public static File m101648k(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "meminfo.txt");
    }

    /* renamed from: l */
    public static File m101647l(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "pthreads.txt");
    }

    /* renamed from: m */
    public static File m101646m(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "rountines.txt");
    }

    /* renamed from: n */
    public static File m101645n(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "leakd_threads.txt");
    }

    /* renamed from: o */
    public static File m101644o(File file) {
        return new File(file, "abortmsg.txt");
    }

    /* renamed from: a */
    public static File m101680a() {
        File file = f3936b;
        return file == null ? m101666d(NpthBus.m102011g()) : file;
    }

    /* renamed from: b */
    public static String m101674b() {
        return "anr_" + NpthBus.m102013e();
    }

    /* renamed from: c */
    public static String m101670c() {
        return String.format("ensure_%s", NpthBus.m102013e());
    }

    /* renamed from: f */
    public static File m101659f(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: g */
    public static File m101656g(File file) {
        return new File(file, "javastack.txt");
    }

    /* renamed from: h */
    public static File m101653h(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "logcat.txt");
    }

    /* renamed from: i */
    public static File m101651i(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "fds.txt");
    }

    /* renamed from: j */
    public static String m101650j(@NonNull Context context) {
        if (TextUtils.isEmpty(f3935a)) {
            try {
                f3935a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f3935a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f3935a;
    }

    /* renamed from: b */
    public static File m101672b(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: c */
    public static File m101668c(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: f */
    public static File m101658f(String str) {
        return new File(m101678a(NpthBus.m102011g(), str), "rountines.txt");
    }

    /* renamed from: g */
    public static File m101655g(String str) {
        return new File(m101678a(NpthBus.m102011g(), str), "leakd_threads.txt");
    }

    /* renamed from: a */
    public static File m101678a(@NonNull Context context, String str) {
        return new File(m101650j(context) + "/apminsight/CrashCommonLog/" + str);
    }

    /* renamed from: b */
    public static File m101671b(String str) {
        return new File(m101678a(NpthBus.m102011g(), str), "fds.txt");
    }

    /* renamed from: c */
    public static File m101667c(String str) {
        return new File(m101678a(NpthBus.m102011g(), str), "threads.txt");
    }

    /* renamed from: e */
    public static File m101662e(File file) {
        return new File(file, "callback.json");
    }

    /* renamed from: a */
    public static String m101675a(String str) {
        return "dart_".concat(String.valueOf(str));
    }

    /* renamed from: d */
    public static File m101665d(File file) {
        return new File(m101678a(NpthBus.m102011g(), file.getName()), "maps.txt");
    }

    /* renamed from: e */
    public static File m101661e(String str) {
        return new File(m101678a(NpthBus.m102011g(), str), "pthreads.txt");
    }

    /* renamed from: a */
    public static File m101676a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* renamed from: d */
    public static File m101664d(String str) {
        return new File(m101678a(NpthBus.m102011g(), str), "meminfo.txt");
    }

    /* renamed from: a */
    public static File m101677a(File file) {
        return new File(file, "flog.txt");
    }
}
