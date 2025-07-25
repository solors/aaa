package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import io.appmetrica.analytics.logger.common.impl.C35106a;
import io.appmetrica.analytics.logger.common.impl.C35107b;
import io.appmetrica.analytics.logger.common.impl.C35108c;
import io.appmetrica.analytics.logger.common.impl.C35109d;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d */
    private static volatile String f95781d = "";

    /* renamed from: a */
    private final String f95782a;

    /* renamed from: b */
    private volatile boolean f95783b = false;

    /* renamed from: c */
    private final C35108c f95784c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f95784c = new C35108c(new C35109d(str), new C35106a(), new C35107b());
        this.f95782a = str2;
    }

    public static void init(@NonNull Context context) {
        f95781d = C21114v8.C21123i.f54137d + context.getPackageName() + "] : ";
    }

    public void error(@Nullable String str, @Nullable Object... objArr) {
        if (this.f95783b) {
            C35108c c35108c = this.f95784c;
            String prefix = getPrefix();
            c35108c.f95787b.getClass();
            Iterator it = c35108c.f95788c.m20665a(C35106a.m20666a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c35108c.f95786a.f95789a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f95781d + this.f95782a;
    }

    public void info(@Nullable String str, @Nullable Object... objArr) {
        if (this.f95783b) {
            C35108c c35108c = this.f95784c;
            String prefix = getPrefix();
            c35108c.f95787b.getClass();
            Iterator it = c35108c.f95788c.m20665a(C35106a.m20666a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c35108c.f95786a.f95789a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f95783b = z;
    }

    public void warning(@Nullable String str, @Nullable Object... objArr) {
        if (this.f95783b) {
            C35108c c35108c = this.f95784c;
            String prefix = getPrefix();
            c35108c.f95787b.getClass();
            Iterator it = c35108c.f95788c.m20665a(C35106a.m20666a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c35108c.f95786a.f95789a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(@Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        if (this.f95783b) {
            C35108c c35108c = this.f95784c;
            String prefix = getPrefix();
            c35108c.f95787b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            sb2.append(Log.getStackTraceString(th));
            Iterator it = c35108c.f95788c.m20665a(C35106a.m20666a(prefix, sb2.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c35108c.f95786a.f95789a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
