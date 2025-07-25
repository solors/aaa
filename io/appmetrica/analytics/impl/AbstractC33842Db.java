package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Db */
/* loaded from: classes9.dex */
public abstract class AbstractC33842Db {
    /* renamed from: a */
    public static final ArrayList m22719a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            if (locale != null) {
                arrayList.add(AbstractC34375Zd.m22039a(locale));
            }
        }
        return arrayList;
    }
}
