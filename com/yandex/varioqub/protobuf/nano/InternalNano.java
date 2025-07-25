package com.yandex.varioqub.protobuf.nano;

import com.google.android.exoplayer2.C15633C;
import com.yandex.varioqub.protobuf.nano.MapFactories;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes8.dex */
public final class InternalNano {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName(C15633C.ISO88591_NAME);
    public static final Object LAZY_INIT_LOCK = new Object();

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano extendableMessageNano, ExtendableMessageNano extendableMessageNano2) {
        FieldArray fieldArray = extendableMessageNano.unknownFieldData;
        if (fieldArray != null) {
            extendableMessageNano2.unknownFieldData = fieldArray.m110418clone();
        }
    }

    public static <K, V> int computeMapFieldSize(Map<K, V> map, int i, int i2, int i3) {
        int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i);
        int i4 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key != null && value != null) {
                int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(1, i2, key) + CodedOutputByteBufferNano.computeFieldSize(2, i3, value);
                i4 += CodedOutputByteBufferNano.computeRawVarint32Size(computeFieldSize) + computeTagSize + computeFieldSize;
            } else {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
        }
        return i4;
    }

    public static byte[] copyFromUtf8(String str) {
        return str.getBytes(UTF_8);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        }
        return Arrays.equals(iArr, iArr2);
    }

    private static boolean equalsMapValue(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            return obj.equals(obj2);
        }
        throw new IllegalStateException("keys and values in maps cannot be null");
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    private static int hashCodeForMap(Object obj) {
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    public static final <K, V> Map<K, V> mergeMapEntry(CodedInputByteBufferNano codedInputByteBufferNano, Map<K, V> map, MapFactories.MapFactory mapFactory, int i, int i2, V v, int i3, int i4) throws IOException {
        Map<K, V> forMap = mapFactory.forMap(map);
        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
        Object obj = null;
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == i3) {
                obj = codedInputByteBufferNano.readPrimitiveField(i);
            } else if (readTag == i4) {
                if (i2 == 11) {
                    codedInputByteBufferNano.readMessage(v);
                } else {
                    v = codedInputByteBufferNano.readPrimitiveField(i2);
                }
            } else if (!codedInputByteBufferNano.skipField(readTag)) {
                break;
            }
        }
        codedInputByteBufferNano.checkLastTagWas(0);
        codedInputByteBufferNano.popLimit(pushLimit);
        if (obj == null) {
            obj = primitiveDefaultValue(i);
        }
        if (v == 0) {
            v = (V) primitiveDefaultValue(i2);
        }
        forMap.put(obj, (Object) v);
        return forMap;
    }

    private static Object primitiveDefaultValue(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Type: " + i + " is not a primitive type.");
            case 12:
                return WireFormatNano.EMPTY_BYTES;
        }
    }

    public static <K, V> void serializeMapField(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i, int i2, int i3) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key != null && value != null) {
                codedOutputByteBufferNano.writeTag(i, 2);
                codedOutputByteBufferNano.writeRawVarint32(CodedOutputByteBufferNano.computeFieldSize(1, i2, key) + CodedOutputByteBufferNano.computeFieldSize(2, i3, value));
                codedOutputByteBufferNano.writeField(1, i2, key);
                codedOutputByteBufferNano.writeField(2, i3, value);
            } else {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
        }
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(dArr);
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(zArr);
    }

    public static int hashCode(byte[][] bArr) {
        int length;
        int i;
        if (bArr == null) {
            length = 0;
            i = 0;
        } else {
            length = bArr.length;
            i = 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = Arrays.hashCode(bArr2) + (i * 31);
            }
        }
        return i;
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length == 0) {
            return fArr2 == null || fArr2.length == 0;
        }
        return Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(Object[] objArr) {
        int length;
        int i;
        if (objArr == null) {
            length = 0;
            i = 0;
        } else {
            length = objArr.length;
            i = 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = obj.hashCode() + (i * 31);
            }
        }
        return i;
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        }
        return Arrays.equals(dArr, dArr2);
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        int i = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += hashCodeForMap(entry.getValue()) ^ hashCodeForMap(entry.getKey());
        }
        return i;
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null || zArr.length == 0) {
            return zArr2 == null || zArr2.length == 0;
        }
        return Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length;
        int i;
        int length2 = bArr == null ? 0 : bArr.length;
        if (bArr2 == null) {
            length = 0;
            i = 0;
        } else {
            length = bArr2.length;
            i = 0;
        }
        int i2 = i;
        while (true) {
            if (i >= length2 || bArr[i] != null) {
                while (i2 < length && bArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length2;
                boolean z2 = i2 >= length;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !Arrays.equals(bArr[i], bArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length;
        int i;
        int length2 = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            length = 0;
            i = 0;
        } else {
            length = objArr2.length;
            i = 0;
        }
        int i2 = i;
        while (true) {
            if (i >= length2 || objArr[i] != null) {
                while (i2 < length && objArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length2;
                boolean z2 = i2 >= length;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> boolean equals(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L10
            int r4 = r5.size()
            if (r4 != 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            return r0
        L10:
            if (r5 != 0) goto L1b
            int r4 = r4.size()
            if (r4 != 0) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            return r0
        L1b:
            int r2 = r4.size()
            int r3 = r5.size()
            if (r2 == r3) goto L26
            return r1
        L26:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r5.containsKey(r3)
            if (r3 != 0) goto L45
            return r1
        L45:
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r5.get(r2)
            boolean r2 = equalsMapValue(r3, r2)
            if (r2 != 0) goto L2e
            return r1
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.varioqub.protobuf.nano.InternalNano.equals(java.util.Map, java.util.Map):boolean");
    }
}
