package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p726io.FileUtils;
import java.io.File;
import kotlin.Unit;

/* renamed from: io.appmetrica.analytics.impl.aa */
/* loaded from: classes9.dex */
public final class C34396aa {

    /* renamed from: a */
    public volatile Boolean f93963a;

    /* renamed from: a */
    public final void m21997a(Context context) {
        boolean z;
        boolean z2;
        if (this.f93963a == null) {
            synchronized (this) {
                if (this.f93963a == null) {
                    boolean z3 = false;
                    try {
                        File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                        if (fileFromAppStorage != null) {
                            z = fileFromAppStorage.exists();
                        } else {
                            z = false;
                        }
                        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                        if (fileFromSdkStorage != null) {
                            z2 = fileFromSdkStorage.exists();
                        } else {
                            z2 = false;
                        }
                        if (z || z2) {
                            z3 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    this.f93963a = Boolean.valueOf(z3);
                }
                Unit unit = Unit.f99208a;
            }
        }
    }
}
