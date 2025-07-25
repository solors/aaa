package io.bidmachine.rendering.utils;

import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: classes9.dex */
public abstract class CleanStrategy {
    /* renamed from: a */
    protected abstract boolean mo19027a(File file);

    public void clean(@Nullable File file) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2 != null && mo19027a(file2)) {
                FileUtils.deleteFile(file2);
            }
        }
    }
}
