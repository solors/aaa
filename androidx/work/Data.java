package androidx.work;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.TypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Data {
    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;
    Map<String, Object> mValues;
    private static final String TAG = Logger.tagWithPrefix("Data");
    public static final Data EMPTY = new Builder().build();

    /* loaded from: classes2.dex */
    public static final class Builder {
        private Map<String, Object> mValues = new HashMap();

        @NonNull
        public Data build() {
            Data data = new Data(this.mValues);
            Data.toByteArrayInternal(data);
            return data;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder put(@NonNull String str, @Nullable Object obj) {
            if (obj == null) {
                this.mValues.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        this.mValues.put(str, Data.convertPrimitiveBooleanArray((boolean[]) obj));
                    } else if (cls == byte[].class) {
                        this.mValues.put(str, Data.convertPrimitiveByteArray((byte[]) obj));
                    } else if (cls == int[].class) {
                        this.mValues.put(str, Data.convertPrimitiveIntArray((int[]) obj));
                    } else if (cls == long[].class) {
                        this.mValues.put(str, Data.convertPrimitiveLongArray((long[]) obj));
                    } else if (cls == float[].class) {
                        this.mValues.put(str, Data.convertPrimitiveFloatArray((float[]) obj));
                    } else if (cls == double[].class) {
                        this.mValues.put(str, Data.convertPrimitiveDoubleArray((double[]) obj));
                    } else {
                        throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                    }
                } else {
                    this.mValues.put(str, obj);
                }
            }
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Data data) {
            putAll(data.mValues);
            return this;
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z) {
            this.mValues.put(str, Boolean.valueOf(z));
            return this;
        }

        @NonNull
        public Builder putBooleanArray(@NonNull String str, @NonNull boolean[] zArr) {
            this.mValues.put(str, Data.convertPrimitiveBooleanArray(zArr));
            return this;
        }

        @NonNull
        public Builder putByte(@NonNull String str, byte b) {
            this.mValues.put(str, Byte.valueOf(b));
            return this;
        }

        @NonNull
        public Builder putByteArray(@NonNull String str, @NonNull byte[] bArr) {
            this.mValues.put(str, Data.convertPrimitiveByteArray(bArr));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d) {
            this.mValues.put(str, Double.valueOf(d));
            return this;
        }

        @NonNull
        public Builder putDoubleArray(@NonNull String str, @NonNull double[] dArr) {
            this.mValues.put(str, Data.convertPrimitiveDoubleArray(dArr));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f) {
            this.mValues.put(str, Float.valueOf(f));
            return this;
        }

        @NonNull
        public Builder putFloatArray(@NonNull String str, @NonNull float[] fArr) {
            this.mValues.put(str, Data.convertPrimitiveFloatArray(fArr));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i) {
            this.mValues.put(str, Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder putIntArray(@NonNull String str, @NonNull int[] iArr) {
            this.mValues.put(str, Data.convertPrimitiveIntArray(iArr));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j) {
            this.mValues.put(str, Long.valueOf(j));
            return this;
        }

        @NonNull
        public Builder putLongArray(@NonNull String str, @NonNull long[] jArr) {
            this.mValues.put(str, Data.convertPrimitiveLongArray(jArr));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @Nullable String str2) {
            this.mValues.put(str, str2);
            return this;
        }

        @NonNull
        public Builder putStringArray(@NonNull String str, @NonNull String[] strArr) {
            this.mValues.put(str, strArr);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    Data() {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Boolean[] convertPrimitiveBooleanArray(@NonNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Byte[] convertPrimitiveByteArray(@NonNull byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Double[] convertPrimitiveDoubleArray(@NonNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Float[] convertPrimitiveFloatArray(@NonNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Integer[] convertPrimitiveIntArray(@NonNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Long[] convertPrimitiveLongArray(@NonNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean[] convertToPrimitiveArray(@NonNull Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x005d -> B:36:0x0062). Please submit an issue!!! */
    @androidx.annotation.NonNull
    @androidx.room.TypeConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.Data fromByteArray(@androidx.annotation.NonNull byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.Data.TAG     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.Data r7 = new androidx.work.Data
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.fromByteArray(byte[]):androidx.work.Data");
    }

    @NonNull
    @TypeConverter
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] toByteArrayInternal(@NonNull Data data) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.size());
                    for (Map.Entry<String, Object> entry : data.mValues.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    Log.e(TAG, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(TAG, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(TAG, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e7);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || Data.class != obj.getClass()) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> keySet = this.mValues.keySet();
        if (!keySet.equals(data.mValues.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.mValues.get(str);
            Object obj3 = data.mValues.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
            } else if (obj2 == obj3) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(@NonNull String str, boolean z) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    @Nullable
    public boolean[] getBooleanArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Boolean[]) {
            return convertToPrimitiveArray((Boolean[]) obj);
        }
        return null;
    }

    public byte getByte(@NonNull String str, byte b) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        return b;
    }

    @Nullable
    public byte[] getByteArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Byte[]) {
            return convertToPrimitiveArray((Byte[]) obj);
        }
        return null;
    }

    public double getDouble(@NonNull String str, double d) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return d;
    }

    @Nullable
    public double[] getDoubleArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Double[]) {
            return convertToPrimitiveArray((Double[]) obj);
        }
        return null;
    }

    public float getFloat(@NonNull String str, float f) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return f;
    }

    @Nullable
    public float[] getFloatArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Float[]) {
            return convertToPrimitiveArray((Float[]) obj);
        }
        return null;
    }

    public int getInt(@NonNull String str, int i) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return i;
    }

    @Nullable
    public int[] getIntArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Integer[]) {
            return convertToPrimitiveArray((Integer[]) obj);
        }
        return null;
    }

    @NonNull
    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.mValues);
    }

    public long getLong(@NonNull String str, long j) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return j;
    }

    @Nullable
    public long[] getLongArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Long[]) {
            return convertToPrimitiveArray((Long[]) obj);
        }
        return null;
    }

    @Nullable
    public String getString(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public String[] getStringArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean hasKeyWithValueOfType(@NonNull String str, @NonNull Class<T> cls) {
        Object obj = this.mValues.get(str);
        if (obj != null && cls.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.mValues.hashCode() * 31;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public int size() {
        return this.mValues.size();
    }

    @NonNull
    public byte[] toByteArray() {
        return toByteArrayInternal(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.mValues.isEmpty()) {
            for (String str : this.mValues.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.mValues.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Data(@NonNull Data data) {
        this.mValues = new HashMap(data.mValues);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Data(@NonNull Map<String, ?> map) {
        this.mValues = new HashMap(map);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] convertToPrimitiveArray(@NonNull Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int[] convertToPrimitiveArray(@NonNull Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static long[] convertToPrimitiveArray(@NonNull Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static float[] convertToPrimitiveArray(@NonNull Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static double[] convertToPrimitiveArray(@NonNull Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }
}
