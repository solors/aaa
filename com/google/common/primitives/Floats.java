package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Floats extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    @GwtCompatible
    /* loaded from: classes4.dex */
    private static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {

        /* renamed from: b */
        final float[] f41449b;

        /* renamed from: c */
        final int f41450c;

        /* renamed from: d */
        final int f41451d;

        FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        /* renamed from: c */
        float[] m68041c() {
            return Arrays.copyOfRange(this.f41449b, this.f41450c, this.f41451d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Float) && Floats.m68043c(this.f41449b, ((Float) obj).floatValue(), this.f41450c, this.f41451d) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FloatArrayAsList) {
                FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
                int size = size();
                if (floatArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f41449b[this.f41450c + i] != floatArrayAsList.f41449b[floatArrayAsList.f41450c + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f41450c; i2 < this.f41451d; i2++) {
                i = (i * 31) + Floats.hashCode(this.f41449b[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m68043c;
            if ((obj instanceof Float) && (m68043c = Floats.m68043c(this.f41449b, ((Float) obj).floatValue(), this.f41450c, this.f41451d)) >= 0) {
                return m68043c - this.f41450c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m68042d;
            if ((obj instanceof Float) && (m68042d = Floats.m68042d(this.f41449b, ((Float) obj).floatValue(), this.f41450c, this.f41451d)) >= 0) {
                return m68042d - this.f41450c;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41451d - this.f41450c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            float[] fArr = this.f41449b;
            int i3 = this.f41450c;
            return new FloatArrayAsList(fArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.f41449b[this.f41450c]);
            int i = this.f41450c;
            while (true) {
                i++;
                if (i < this.f41451d) {
                    sb2.append(", ");
                    sb2.append(this.f41449b[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        FloatArrayAsList(float[] fArr, int i, int i2) {
            this.f41449b = fArr;
            this.f41450c = i;
            this.f41451d = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Float.valueOf(this.f41449b[this.f41450c + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i, Float f) {
            Preconditions.checkElementIndex(i, size());
            float[] fArr = this.f41449b;
            int i2 = this.f41450c;
            float f2 = fArr[i2 + i];
            fArr[i2 + i] = ((Float) Preconditions.checkNotNull(f)).floatValue();
            return Float.valueOf(f2);
        }
    }

    /* loaded from: classes4.dex */
    private static final class FloatConverter extends Converter<String, Float> implements Serializable {

        /* renamed from: d */
        static final FloatConverter f41452d = new FloatConverter();

        private FloatConverter() {
        }

        private Object readResolve() {
            return f41452d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: h */
        public String mo67968d(Float f) {
            return f.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: i */
        public Float mo67967e(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    /* loaded from: classes4.dex */
    private enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Float.compare(fArr[i], fArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    private Floats() {
    }

    public static List<Float> asList(float... fArr) {
        if (fArr.length == 0) {
            return Collections.emptyList();
        }
        return new FloatArrayAsList(fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m68043c(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int compare(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static float[] concat(float[]... fArr) {
        int i = 0;
        for (float[] fArr2 : fArr) {
            i += fArr2.length;
        }
        float[] fArr3 = new float[i];
        int i2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, i2, fArr4.length);
            i2 += fArr4.length;
        }
        return fArr3;
    }

    @Beta
    public static float constrainToRange(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static boolean contains(float[] fArr, float f) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (fArr[i] == f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m68042d(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    public static float[] ensureCapacity(float[] fArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid minLength: %s", i);
        if (i2 < 0) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Invalid padding: %s", i2);
        if (fArr.length < i) {
            return Arrays.copyOf(fArr, i + i2);
        }
        return fArr;
    }

    public static int hashCode(float f) {
        return Float.valueOf(f).hashCode();
    }

    public static int indexOf(float[] fArr, float f) {
        return m68043c(fArr, f, 0, fArr.length);
    }

    public static boolean isFinite(float f) {
        if (Float.NEGATIVE_INFINITY < f && f < Float.POSITIVE_INFINITY) {
            return true;
        }
        return false;
    }

    public static String join(String str, float... fArr) {
        Preconditions.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(fArr.length * 12);
        sb2.append(fArr[0]);
        for (int i = 1; i < fArr.length; i++) {
            sb2.append(str);
            sb2.append(fArr[i]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(float[] fArr, float f) {
        return m68042d(fArr, f, 0, fArr.length);
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... fArr) {
        boolean z;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        return f;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... fArr) {
        boolean z;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.min(f, fArr[i]);
        }
        return f;
    }

    public static void reverse(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void sortDescending(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    @Beta
    public static Converter<String, Float> stringConverter() {
        return FloatConverter.f41452d;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).m68041c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) Preconditions.checkNotNull(array[i])).floatValue();
        }
        return fArr;
    }

    @Beta
    @GwtIncompatible
    public static Float tryParse(String str) {
        if (Doubles.f41443a.matcher(str).matches()) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(float[] r5, float[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Floats.indexOf(float[], float[]):int");
    }

    public static void reverse(float[] fArr, int i, int i2) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i, i2, fArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            float f = fArr[i];
            fArr[i] = fArr[i3];
            fArr[i3] = f;
            i++;
        }
    }

    public static void sortDescending(float[] fArr, int i, int i2) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i, i2, fArr.length);
        Arrays.sort(fArr, i, i2);
        reverse(fArr, i, i2);
    }
}
