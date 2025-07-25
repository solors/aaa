package com.inmobi.media;

import android.app.Application;
import android.content.Context;
import androidx.annotation.UiThread;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.O0 */
/* loaded from: classes6.dex */
public final class C19040O0 {

    /* renamed from: a */
    public static final C19040O0 f47574a = new C19040O0();

    /* renamed from: b */
    public static LinkedHashSet f47575b;

    /* renamed from: c */
    public static boolean f47576c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.importance != 100) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        return true;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m60840a(com.inmobi.media.C19040O0 r2, android.content.Context r3) {
        /*
            r2.getClass()
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r3.getSystemService(r2)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            kotlin.jvm.internal.Intrinsics.m17073h(r2, r0)     // Catch: java.lang.Exception -> L41
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L41
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L48
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L1d
            goto L48
        L1d:
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L41
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L41
        L25:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L48
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L41
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r0.processName     // Catch: java.lang.Exception -> L41
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L25
            int r2 = r0.importance     // Catch: java.lang.Exception -> L41
            r3 = 100
            if (r2 != r3) goto L48
            r2 = 1
            goto L49
        L41:
            java.lang.String r2 = "O0"
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L48:
            r2 = 0
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19040O0.m60840a(com.inmobi.media.O0, android.content.Context):boolean");
    }

    /* renamed from: b */
    public static final /* synthetic */ String m60838b() {
        return "O0";
    }

    /* renamed from: c */
    public final void m60837c() {
        f47576c = true;
    }

    /* renamed from: d */
    public final void m60836d() {
        f47576c = false;
    }

    /* renamed from: a */
    public static final void m60839a(C19040O0 c19040o0, boolean z) {
        LinkedHashSet<InterfaceC19014M0> linkedHashSet;
        c19040o0.getClass();
        if (C18954Ha.m61068d() == null || (linkedHashSet = f47575b) == null) {
            return;
        }
        for (InterfaceC19014M0 interfaceC19014M0 : linkedHashSet) {
            try {
                ((C19077Qb) interfaceC19014M0).m60758a(z);
            } catch (Exception unused) {
                Intrinsics.checkNotNullExpressionValue("O0", "TAG");
            }
        }
    }

    @UiThread
    /* renamed from: a */
    public final void m60841a(@NotNull Context context, @NotNull InterfaceC19014M0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (f47575b == null) {
            f47575b = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new C19027N0(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f47575b;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }
}
