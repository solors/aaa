package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p726io.FileUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44980k;

/* renamed from: io.appmetrica.analytics.impl.Z9 */
/* loaded from: classes9.dex */
public final class C34371Z9 implements InterfaceC33779An {

    /* renamed from: a */
    public final Context f93873a;

    /* renamed from: b */
    public final String f93874b;

    public C34371Z9(@NotNull Context context, @NotNull String str) {
        this.f93873a = context;
        this.f93874b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    @Nullable
    /* renamed from: a */
    public final String mo21029a() {
        String m1184i;
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f93873a, this.f93874b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f93873a, this.f93874b);
                if (fileFromAppStorage != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                m1184i = C44980k.m1184i(fileFromSdkStorage, null, 1, null);
                return m1184i;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    /* renamed from: a */
    public final void mo21024a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f93873a, this.f93874b);
            if (fileFromSdkStorage != null) {
                C44980k.m1181l(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
