package p1059ya;

import android.database.Cursor;
import androidx.annotation.Nullable;

/* renamed from: ya.e */
/* loaded from: classes8.dex */
public final class IOUtils {
    /* renamed from: a */
    public static void m1006a(@Nullable Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
