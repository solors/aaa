package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.logger.common.impl.b */
/* loaded from: classes9.dex */
public final class C35107b {

    /* renamed from: a */
    public final C35110e f95785a;

    public C35107b() {
        this(new C35110e());
    }

    /* renamed from: a */
    public final ArrayList m20665a(String str) {
        String[] split = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            int i = 0;
            while (str2.length() > i) {
                int length = str2.length();
                int i2 = i + 3800;
                int min = Math.min(length, i2);
                if (length > i2) {
                    int m20664a = C35110e.m20664a(this.f95785a.f95790a.matcher(str2), i, min);
                    if (m20664a == -1) {
                        length = min;
                    } else {
                        length = m20664a + 1;
                    }
                }
                arrayList.add(str2.substring(i, length));
                i = length;
            }
        }
        return arrayList;
    }

    public C35107b(C35110e c35110e) {
        this.f95785a = c35110e;
    }
}
