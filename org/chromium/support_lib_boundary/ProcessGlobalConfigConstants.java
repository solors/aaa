package org.chromium.support_lib_boundary;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes10.dex */
public final class ProcessGlobalConfigConstants {
    public static final String CACHE_DIRECTORY_BASE_PATH = "CACHE_DIRECTORY_BASE_PATH";
    public static final String DATA_DIRECTORY_BASE_PATH = "DATA_DIRECTORY_BASE_PATH";
    public static final String DATA_DIRECTORY_SUFFIX = "DATA_DIRECTORY_SUFFIX";

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes10.dex */
    public @interface ProcessGlobalConfigMapKey {
    }

    private ProcessGlobalConfigConstants() {
    }
}
