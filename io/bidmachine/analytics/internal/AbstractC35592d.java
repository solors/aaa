package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: io.bidmachine.analytics.internal.d */
/* loaded from: classes9.dex */
public abstract class AbstractC35592d extends AbstractC35612i {
    @Override // io.bidmachine.analytics.internal.AbstractC35612i
    /* renamed from: a */
    public String mo20204a(ReaderConfig.Rule rule) {
        File mo20115c = mo20115c(rule);
        if (mo20115c.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo20115c.lastModified());
            sb2.append('_');
            sb2.append(mo20115c.length());
            return sb2.toString();
        }
        throw new FileNotFoundException();
    }

    /* renamed from: c */
    public abstract File mo20115c(ReaderConfig.Rule rule);
}
