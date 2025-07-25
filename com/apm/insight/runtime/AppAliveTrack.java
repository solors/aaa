package com.apm.insight.runtime;

import com.apm.insight.NpthBus;
import com.apm.insight.p130l.C3822f;
import com.apm.insight.p130l.LogPath;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.apm.insight.runtime.b */
/* loaded from: classes2.dex */
public final class AppAliveTrack {

    /* renamed from: a */
    private static long f4038a = -30000;

    /* renamed from: b */
    private static File f4039b;

    /* renamed from: a */
    public static void m101432a(long j) {
        if (j - f4038a < 30000) {
            return;
        }
        f4038a = j;
        try {
            if (f4039b == null) {
                long currentTimeMillis = System.currentTimeMillis();
                String m101650j = LogPath.m101650j(NpthBus.m102011g());
                f4039b = new File(m101650j, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + RemoteSettings.FORWARD_SLASH_STRING + NpthBus.m102012f());
            }
            C3822f.m101721a(f4039b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static String m101431a(long j, String str) {
        try {
            String m101650j = LogPath.m101650j(NpthBus.m102011g());
            return C3822f.m101723a(new File(m101650j, "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + RemoteSettings.FORWARD_SLASH_STRING + str), "\n");
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* renamed from: a */
    public static void m101433a() {
        File file = new File(LogPath.m101650j(NpthBus.m102011g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                C3822f.m101727a(new File(file, list[i]));
            }
        }
    }
}
