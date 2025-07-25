package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.PatternFilenameFilter */
/* loaded from: classes4.dex */
public final class PatternFilenameFilter implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f41319a;

    public PatternFilenameFilter(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f41319a.matcher(str).matches();
    }

    public PatternFilenameFilter(Pattern pattern) {
        this.f41319a = (Pattern) Preconditions.checkNotNull(pattern);
    }
}
