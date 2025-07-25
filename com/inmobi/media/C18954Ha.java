package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.Ha */
/* loaded from: classes6.dex */
public final class C18954Ha {

    /* renamed from: a */
    public static final C18954Ha f47320a = new C18954Ha();

    /* renamed from: b */
    public static Context f47321b = null;

    /* renamed from: c */
    public static String f47322c = "";

    /* renamed from: d */
    public static String f47323d;

    /* renamed from: e */
    public static final AtomicBoolean f47324e;

    /* renamed from: f */
    public static final InterfaceC38501j f47325f;

    /* renamed from: g */
    public static boolean f47326g;

    /* renamed from: h */
    public static final ExecutorService f47327h;

    /* renamed from: i */
    public static int f47328i;

    static {
        InterfaceC38501j m14554a;
        String TAG = C18954Ha.class.getSimpleName();
        f47324e = new AtomicBoolean();
        m14554a = LazyJVM.m14554a(C18940Ga.f47291a);
        f47325f = m14554a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        f47327h = Executors.newSingleThreadExecutor(new ThreadFactoryC18962I4(TAG));
    }

    @Nullable
    /* renamed from: b */
    public static final String m61076b() {
        return f47323d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m61071c() {
    }

    @Nullable
    /* renamed from: d */
    public static final Context m61068d() {
        return f47321b;
    }

    @NotNull
    /* renamed from: f */
    public static final C18866B6 m61066f() {
        return (C18866B6) f47325f.getValue();
    }

    @NotNull
    /* renamed from: k */
    public static final String m61061k() {
        Context applicationContext;
        String str = "";
        if (f47322c.length() == 0) {
            Context context = f47321b;
            if (context != null) {
                try {
                    applicationContext = context.getApplicationContext();
                } catch (Exception e) {
                    try {
                        throw new C19102Sb(e.getMessage());
                    } catch (C19102Sb e2) {
                        Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
                        C19070Q4 c19070q4 = C19070Q4.f47635a;
                        C18973J1 event = new C18973J1(e2);
                        Intrinsics.checkNotNullParameter(event, "event");
                        C19070Q4.f47637c.m59556a(event);
                        try {
                            String property = System.getProperty("http.agent");
                            if (property != null) {
                                str = property;
                            }
                            Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
                        } catch (Exception e3) {
                            Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
                            Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
                            C19070Q4 c19070q42 = C19070Q4.f47635a;
                            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e3, "event"));
                        }
                    } catch (Exception unused) {
                        Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
                    }
                }
            } else {
                applicationContext = null;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
            Intrinsics.m17074g(defaultUserAgent);
            str = defaultUserAgent;
            f47322c = str;
        }
        return f47322c;
    }

    /* renamed from: m */
    public static final boolean m61059m() {
        return f47324e.get();
    }

    /* renamed from: o */
    public static final boolean m61057o() {
        return f47326g;
    }

    /* renamed from: q */
    public static final boolean m61055q() {
        if (f47328i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static final void m61051u() {
        f47321b = null;
        f47323d = null;
        f47328i = 0;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: a */
    public final void m61084a(int i) {
        f47328i = i;
    }

    @WorkerThread
    @Nullable
    /* renamed from: h */
    public final String m61064h() {
        Context context = f47321b;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        C19508w5 m59823a = AbstractC19494v5.m59823a(context, "coppa_store");
        Intrinsics.checkNotNullParameter("im_accid", "key");
        return m59823a.f48820a.getString("im_accid", null);
    }

    /* renamed from: i */
    public final int m61063i() {
        return f47328i;
    }

    /* renamed from: s */
    public final void m61053s() {
        f47323d = null;
        f47321b = null;
        f47328i = 3;
    }

    /* renamed from: t */
    public final void m61052t() {
        f47328i = 2;
    }

    /* renamed from: a */
    public static final void m61079a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        f47327h.submit(runnable);
    }

    /* renamed from: b */
    public static final void m61072b(boolean z) {
        f47326g = z;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    public static final void m61070c(@Nullable Context context) {
        f47321b = context;
    }

    /* renamed from: a */
    public static final void m61077a(boolean z) {
        f47324e.set(z);
    }

    @UiThread
    /* renamed from: b */
    public static final boolean m61074b(@NotNull Context context, @NotNull String accountId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        f47328i = 1;
        f47321b = context.getApplicationContext();
        f47324e.set(true);
        f47323d = accountId;
        return true;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    public static final void m61069c(@Nullable String str) {
        f47323d = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m61083a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            AbstractC19003L3.m60929a(m61075b(context));
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m61085a() {
        Context context = f47321b;
        if (context != null) {
            File m61075b = m61075b(context);
            if (!m61075b.mkdir() && !m61075b.isDirectory()) {
                Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
            } else {
                Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public final File m61075b(@Nullable Context context) {
        return new File(context != null ? context.getFilesDir() : null, "im_cached_content");
    }

    @WorkerThread
    /* renamed from: b */
    public final void m61073b(@NotNull String primaryAccountId) {
        Intrinsics.checkNotNullParameter(primaryAccountId, "primaryAccountId");
        Context context = f47321b;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            AbstractC19494v5.m59823a(context, "coppa_store").m59618a("im_accid", primaryAccountId);
        }
    }

    /* renamed from: a */
    public final boolean m61080a(@Nullable Context context, @Nullable String str) {
        if (context == null || str == null) {
            return false;
        }
        context.getPackageManager();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (Intrinsics.m17075f(str2, str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Ha", "TAG");
            return false;
        }
    }

    /* renamed from: a */
    public static final void m61082a(@Nullable Context context, @NotNull Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m61067e() {
    }

    /* renamed from: g */
    public static /* synthetic */ void m61065g() {
    }

    /* renamed from: j */
    public static /* synthetic */ void m61062j() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m61060l() {
    }

    /* renamed from: n */
    public static /* synthetic */ void m61058n() {
    }

    /* renamed from: p */
    public static /* synthetic */ void m61056p() {
    }

    /* renamed from: r */
    public static /* synthetic */ void m61054r() {
    }

    /* renamed from: a */
    public final void m61081a(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @NotNull
    /* renamed from: a */
    public final File m61078a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        m61085a();
        File m61075b = m61075b(f47321b);
        int length = key.length() / 2;
        String substring = key.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String valueOf = String.valueOf(substring.hashCode() & Integer.MAX_VALUE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(valueOf);
        String substring2 = key.substring(length);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2.hashCode() & Integer.MAX_VALUE);
        return new File(m61075b, sb2.toString());
    }
}
