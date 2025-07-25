package androidx.core.content;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.content.ContentValuesKt */
/* loaded from: classes.dex */
public final class ContentValues {
    @NotNull
    public static final android.content.ContentValues contentValuesOf(@NotNull Tuples<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        android.content.ContentValues contentValues = new android.content.ContentValues(pairs.length);
        for (Tuples<String, ? extends Object> tuples : pairs) {
            String m17632a = tuples.m17632a();
            Object m17631b = tuples.m17631b();
            if (m17631b == null) {
                contentValues.putNull(m17632a);
            } else if (m17631b instanceof String) {
                contentValues.put(m17632a, (String) m17631b);
            } else if (m17631b instanceof Integer) {
                contentValues.put(m17632a, (Integer) m17631b);
            } else if (m17631b instanceof Long) {
                contentValues.put(m17632a, (Long) m17631b);
            } else if (m17631b instanceof Boolean) {
                contentValues.put(m17632a, (Boolean) m17631b);
            } else if (m17631b instanceof Float) {
                contentValues.put(m17632a, (Float) m17631b);
            } else if (m17631b instanceof Double) {
                contentValues.put(m17632a, (Double) m17631b);
            } else if (m17631b instanceof byte[]) {
                contentValues.put(m17632a, (byte[]) m17631b);
            } else if (m17631b instanceof Byte) {
                contentValues.put(m17632a, (Byte) m17631b);
            } else if (m17631b instanceof Short) {
                contentValues.put(m17632a, (Short) m17631b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + m17631b.getClass().getCanonicalName() + " for key \"" + m17632a + '\"');
            }
        }
        return contentValues;
    }
}
