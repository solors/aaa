package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p726io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C37563v;

/* renamed from: io.appmetrica.analytics.impl.b7 */
/* loaded from: classes9.dex */
public final class C34420b7 {

    /* renamed from: a */
    public final InterfaceC33985J6 f94013a;

    /* renamed from: b */
    public final List f94014b;

    /* renamed from: c */
    public final boolean f94015c;

    public C34420b7(InterfaceC33985J6 interfaceC33985J6, ArrayList arrayList, boolean z) {
        this.f94013a = interfaceC33985J6;
        this.f94014b = arrayList;
        this.f94015c = z;
    }

    /* renamed from: a */
    public final String m21948a(Context context, InterfaceC34344Y6 interfaceC34344Y6) {
        File parentFile;
        try {
            File mo22496a = this.f94013a.mo22496a(context, interfaceC34344Y6.mo20794b());
            if (!mo22496a.exists() && (parentFile = mo22496a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                m21947a(context, interfaceC34344Y6.mo20795a(), mo22496a);
            }
            return mo22496a.getPath();
        } catch (Throwable unused) {
            return interfaceC34344Y6.mo20794b();
        }
    }

    /* renamed from: a */
    public final void m21947a(Context context, String str, File file) {
        List<String> m17163p;
        List<InterfaceC33985J6> list = this.f94014b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (InterfaceC33985J6 interfaceC33985J6 : list) {
            File mo22496a = interfaceC33985J6.mo22496a(context, str);
            if (mo22496a.exists()) {
                try {
                    if (this.f94015c) {
                        FileUtils.copyToNullable(mo22496a, file);
                    } else {
                        FileUtils.move(mo22496a, file);
                    }
                    String path = mo22496a.getPath();
                    String path2 = file.getPath();
                    m17163p = C37563v.m17163p("-journal", "-shm", "-wal");
                    for (String str2 : m17163p) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f94015c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
