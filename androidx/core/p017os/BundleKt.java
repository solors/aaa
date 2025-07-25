package androidx.core.p017os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Bundle.kt */
@Metadata
/* renamed from: androidx.core.os.BundleKt */
/* loaded from: classes.dex */
public final class BundleKt {
    @NotNull
    public static final Bundle bundleOf(@NotNull Tuples<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Bundle bundle = new Bundle(pairs.length);
        for (Tuples<String, ? extends Object> tuples : pairs) {
            String m17632a = tuples.m17632a();
            Object m17631b = tuples.m17631b();
            if (m17631b == null) {
                bundle.putString(m17632a, null);
            } else if (m17631b instanceof Boolean) {
                bundle.putBoolean(m17632a, ((Boolean) m17631b).booleanValue());
            } else if (m17631b instanceof Byte) {
                bundle.putByte(m17632a, ((Number) m17631b).byteValue());
            } else if (m17631b instanceof Character) {
                bundle.putChar(m17632a, ((Character) m17631b).charValue());
            } else if (m17631b instanceof Double) {
                bundle.putDouble(m17632a, ((Number) m17631b).doubleValue());
            } else if (m17631b instanceof Float) {
                bundle.putFloat(m17632a, ((Number) m17631b).floatValue());
            } else if (m17631b instanceof Integer) {
                bundle.putInt(m17632a, ((Number) m17631b).intValue());
            } else if (m17631b instanceof Long) {
                bundle.putLong(m17632a, ((Number) m17631b).longValue());
            } else if (m17631b instanceof Short) {
                bundle.putShort(m17632a, ((Number) m17631b).shortValue());
            } else if (m17631b instanceof Bundle) {
                bundle.putBundle(m17632a, (Bundle) m17631b);
            } else if (m17631b instanceof CharSequence) {
                bundle.putCharSequence(m17632a, (CharSequence) m17631b);
            } else if (m17631b instanceof Parcelable) {
                bundle.putParcelable(m17632a, (Parcelable) m17631b);
            } else if (m17631b instanceof boolean[]) {
                bundle.putBooleanArray(m17632a, (boolean[]) m17631b);
            } else if (m17631b instanceof byte[]) {
                bundle.putByteArray(m17632a, (byte[]) m17631b);
            } else if (m17631b instanceof char[]) {
                bundle.putCharArray(m17632a, (char[]) m17631b);
            } else if (m17631b instanceof double[]) {
                bundle.putDoubleArray(m17632a, (double[]) m17631b);
            } else if (m17631b instanceof float[]) {
                bundle.putFloatArray(m17632a, (float[]) m17631b);
            } else if (m17631b instanceof int[]) {
                bundle.putIntArray(m17632a, (int[]) m17631b);
            } else if (m17631b instanceof long[]) {
                bundle.putLongArray(m17632a, (long[]) m17631b);
            } else if (m17631b instanceof short[]) {
                bundle.putShortArray(m17632a, (short[]) m17631b);
            } else if (m17631b instanceof Object[]) {
                Class<?> componentType = m17631b.getClass().getComponentType();
                Intrinsics.m17074g(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.m17073h(m17631b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(m17632a, (Parcelable[]) m17631b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.m17073h(m17631b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(m17632a, (String[]) m17631b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.m17073h(m17631b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(m17632a, (CharSequence[]) m17631b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(m17632a, (Serializable) m17631b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + m17632a + '\"');
                }
            } else if (m17631b instanceof Serializable) {
                bundle.putSerializable(m17632a, (Serializable) m17631b);
            } else if (m17631b instanceof IBinder) {
                Bundle.putBinder(bundle, m17632a, (IBinder) m17631b);
            } else if (m17631b instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, m17632a, (Size) m17631b);
            } else if (m17631b instanceof SizeF) {
                BundleApi21ImplKt.putSizeF(bundle, m17632a, (SizeF) m17631b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + m17631b.getClass().getCanonicalName() + " for key \"" + m17632a + '\"');
            }
        }
        return bundle;
    }

    @NotNull
    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
