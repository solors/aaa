package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p726io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsJVM;

/* renamed from: io.appmetrica.analytics.impl.Td */
/* loaded from: classes9.dex */
public final class C34231Td {

    /* renamed from: a */
    public final Context f93532a;

    /* renamed from: b */
    public final C34760nn f93533b;

    /* renamed from: c */
    public final C34787on f93534c;

    public C34231Td(Context context) {
        this(context, new C34760nn(), new C34787on());
    }

    /* renamed from: a */
    public final String m22230a(String str) {
        String m16628I;
        try {
            this.f93534c.getClass();
            if (!C34787on.m21188a(str)) {
                this.f93533b.getClass();
                m16628I = StringsJVM.m16628I(UUID.randomUUID().toString(), "-", "", false, 4, null);
                str = m16628I.toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f93532a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC33941Ha.m22568a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C34231Td(Context context, C34760nn c34760nn, C34787on c34787on) {
        this.f93532a = context;
        this.f93533b = c34760nn;
        this.f93534c = c34787on;
    }

    /* renamed from: a */
    public final void m22231a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f93532a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f93532a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
