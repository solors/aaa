package p738j5;

import com.learnings.usertag.debug.UserTagDebugManager;

/* compiled from: DateUtils.java */
/* renamed from: j5.b */
/* loaded from: classes6.dex */
public class C37291b {

    /* renamed from: a */
    private static long f98451a = 86400000;

    /* renamed from: a */
    private static int m18546a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = f98451a;
        return (int) ((currentTimeMillis / j2) - (j / j2));
    }

    /* renamed from: b */
    public static int m18545b(long j) {
        long m53571b = UserTagDebugManager.m53572a().m53571b();
        if (m53571b > 0) {
            return Math.max(0, m18546a(m53571b));
        }
        return Math.max(0, m18546a(j));
    }
}
