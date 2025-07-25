package com.explorestack.iab.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.p405ad.utils.error.ErrorCode;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.explorestack.iab.utils.u */
/* loaded from: classes3.dex */
public class C10539u {
    @NonNull

    /* renamed from: a */
    private final ExecutorService f24106a = Executors.newSingleThreadExecutor();
    @NonNull

    /* renamed from: b */
    private final C10540a f24107b = new C10540a();

    /* renamed from: com.explorestack.iab.utils.u$a */
    /* loaded from: classes3.dex */
    public static class C10540a {
        C10540a() {
        }

        @NonNull
        /* renamed from: a */
        String m79180a(@NonNull String str) {
            HttpURLConnection httpURLConnection;
            Throwable th;
            URL url;
            try {
                url = new URL(str);
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(500);
                httpURLConnection.setReadTimeout(500);
                switch (httpURLConnection.getResponseCode()) {
                    case 301:
                    case 302:
                    case 303:
                    case 305:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (TextUtils.isEmpty(headerField)) {
                            return url.toString();
                        }
                        if (C10512g.m79294w(headerField)) {
                            m79179b(httpURLConnection);
                            return m79180a(headerField);
                        } else if (new URI(headerField).getScheme() == null) {
                            try {
                                String url2 = new URL(url, headerField).toString();
                                if (url2.trim().isEmpty()) {
                                    return headerField;
                                }
                                m79179b(httpURLConnection);
                                return m79180a(url2);
                            } catch (Exception e) {
                                C10523j.m79240b("IntentLauncher", e);
                                return headerField;
                            }
                        } else {
                            return headerField;
                        }
                    case 304:
                    case ErrorCode.CODE_SHOW_RESOURCE_ERROR /* 306 */:
                    default:
                        return url.toString();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    C10523j.m79240b("IntentLauncher", th);
                    return str;
                } finally {
                    m79179b(httpURLConnection);
                }
            }
        }

        /* renamed from: b */
        void m79179b(@Nullable HttpURLConnection httpURLConnection) {
            if (httpURLConnection == null) {
                return;
            }
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                C10523j.m79240b("IntentLauncher", th);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m79194a(C10539u c10539u, Context context, Uri uri, Runnable runnable) {
        c10539u.m79188g(context, uri, runnable);
    }

    @NonNull
    /* renamed from: c */
    private Intent m79192c(@NonNull Context context, @NonNull Uri uri) {
        Intent m79185j = m79185j(uri);
        ComponentName m79193b = m79193b(context, m79185j);
        if (m79193b != null) {
            m79185j.setComponent(m79193b);
        } else {
            C10523j.m79239c("IntentLauncher", "Component not found to handle intent: %s", uri.toString());
        }
        return m79185j;
    }

    @NonNull
    /* renamed from: d */
    private Intent m79191d(@NonNull Uri uri) {
        return Intent.createChooser(m79185j(uri), "").setFlags(268435456);
    }

    @Nullable
    /* renamed from: e */
    private Uri m79190e(@Nullable String str) {
        try {
            try {
                return Uri.parse(new URL(str).toString());
            } catch (NullPointerException | MalformedURLException unused) {
                return Uri.parse(URLDecoder.decode(str, "UTF-8"));
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: f */
    private void m79189f(@NonNull Context context, @NonNull Intent intent, @Nullable Runnable runnable) {
        try {
            m79186i(runnable);
            context.startActivity(intent);
        } catch (Exception e) {
            C10523j.m79239c("IntentLauncher", "Failed to launch intent: %s", e.getMessage());
        }
    }

    /* renamed from: i */
    private void m79186i(@Nullable Runnable runnable) {
        if (runnable != null) {
            C10512g.m79328E(runnable);
        }
    }

    @NonNull
    /* renamed from: j */
    private Intent m79185j(@NonNull Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        return intent;
    }

    /* renamed from: k */
    private void m79184k(@NonNull final Context context, @NonNull final Uri uri, @Nullable final Runnable runnable) {
        this.f24106a.execute(new Runnable() { // from class: com.explorestack.iab.utils.t
            @Override // java.lang.Runnable
            public final void run() {
                C10539u.m79194a(C10539u.this, context, uri, runnable);
            }
        });
    }

    /* renamed from: l */
    public void m79188g(@NonNull Context context, @NonNull Uri uri, @Nullable Runnable runnable) {
        Uri m79190e = m79190e(this.f24107b.m79180a(uri.toString()));
        if (m79190e != null) {
            m79189f(context, m79192c(context, m79190e), runnable);
            return;
        }
        C10523j.m79239c("IntentLauncher", "Invalid uri: %s", uri);
        m79186i(runnable);
    }

    /* renamed from: m */
    private boolean m79182m(@Nullable Uri uri) {
        if (uri != null && C10512g.m79294w(uri.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m79181n(@NonNull Context context, @NonNull Uri uri, @Nullable Runnable runnable) {
        m79189f(context, m79191d(uri), runnable);
    }

    @Nullable
    /* renamed from: b */
    public ComponentName m79193b(@NonNull Context context, @NonNull Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo.packageName.equals("com.android.vending")) {
                    return new ComponentName(activityInfo.packageName, activityInfo.name);
                }
            }
            ActivityInfo activityInfo2 = queryIntentActivities.get(0).activityInfo;
            return new ComponentName(activityInfo2.packageName, activityInfo2.name);
        }
        return null;
    }

    /* renamed from: h */
    public void m79187h(@NonNull Context context, @Nullable String str, @Nullable Runnable runnable) {
        Context applicationContext = context.getApplicationContext();
        Uri m79190e = m79190e(str);
        if (m79182m(m79190e)) {
            m79184k(applicationContext, m79190e, runnable);
        } else if (m79190e != null && m79190e.getScheme() != null) {
            m79181n(applicationContext, m79190e, runnable);
        } else {
            C10523j.m79239c("IntentLauncher", "Invalid uri: %s", m79190e);
            m79186i(runnable);
        }
    }
}
