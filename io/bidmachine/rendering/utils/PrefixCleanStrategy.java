package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes9.dex */
public class PrefixCleanStrategy extends CleanStrategy {

    /* renamed from: a */
    private final String f97960a;

    public PrefixCleanStrategy(@NonNull String str) {
        this.f97960a = str;
    }

    @Override // io.bidmachine.rendering.utils.CleanStrategy
    /* renamed from: a */
    protected boolean mo19027a(File file) {
        return FileUtils.startWith(file, this.f97960a);
    }
}
