package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.C35106a;
import io.appmetrica.analytics.logger.common.impl.C35107b;
import io.appmetrica.analytics.logger.common.impl.C35108c;
import io.appmetrica.analytics.logger.common.impl.C35109d;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a */
    private final C35108c f95780a;

    public BaseImportantLogger(@NonNull String str) {
        this.f95780a = new C35108c(new C35109d(str), new C35106a(), new C35107b());
    }

    public void info(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        C35108c c35108c = this.f95780a;
        c35108c.f95787b.getClass();
        Iterator it = c35108c.f95788c.m20665a(C35106a.m20666a(str, str2, objArr)).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            String str4 = c35108c.f95786a.f95789a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
