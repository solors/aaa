package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsJVM;

/* renamed from: io.appmetrica.analytics.impl.Cb */
/* loaded from: classes9.dex */
public final class C33817Cb {
    /* renamed from: a */
    public static List m22738a(Configuration configuration) {
        List m17175e;
        if (!AndroidUtils.isApiAchieved(24)) {
            m17175e = CollectionsJVM.m17175e(AbstractC34375Zd.m22039a(configuration.locale));
            return m17175e;
        }
        return AbstractC33842Db.m22719a(configuration);
    }
}
