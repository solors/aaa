package com.five_corp.p372ad.internal;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.five_corp.ad.internal.v */
/* loaded from: classes4.dex */
public final class C14121v implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (str.startsWith("adcfg-") && !str.endsWith("_SUCCESS")) {
            return true;
        }
        return false;
    }
}
