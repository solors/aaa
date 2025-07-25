package io.appmetrica.analytics.coreutils.internal.p726io;

import android.database.Cursor;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt */
/* loaded from: classes9.dex */
public final class CloseableUtilsKt {
    public static final void closeSafely(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void closeSafely(@Nullable Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
