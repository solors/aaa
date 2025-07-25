package com.smaato.sdk.core.dns;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.dns.Data;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Record<D extends Data> {
    private byte[] bytes;
    @NonNull
    private final Class clazz;
    private final int clazzValue;
    @Nullable
    private Integer hashCodeCache;
    @NonNull
    public final DnsName name;
    private final D payloadData;
    private final long ttl;
    @NonNull
    public final Type type;
    private final boolean unicastQuery;

    /* loaded from: classes7.dex */
    public enum Class {
        IN(1),
        CH(3),
        HS(4),
        NONE(254),
        ANY(255);
        
        @SuppressLint({"UseSparseArrays"})
        private static final HashMap<Integer, Class> INVERSE_LUT = new HashMap<>();
        private final int value;

        static {
            Class[] values;
            for (Class r3 : values()) {
                INVERSE_LUT.put(Integer.valueOf(r3.getValue()), r3);
            }
        }

        Class(int i) {
            this.value = i;
        }

        public static Class getClass(int i) {
            return INVERSE_LUT.get(Integer.valueOf(i));
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum Type {
        UNKNOWN(-1),
        TXT(16, TXT.class);
        
        @Nullable
        private final java.lang.Class<?> dataClass;
        private final int value;
        @SuppressLint({"UseSparseArrays"})
        private static final Map<Integer, Type> INVERSE_LUT = new HashMap();
        private static final Map<java.lang.Class<?>, Type> DATA_LUT = new HashMap();

        static {
            Type[] values;
            for (Type type : values()) {
                INVERSE_LUT.put(Integer.valueOf(type.getValue()), type);
                java.lang.Class<?> cls = type.dataClass;
                if (cls != null) {
                    DATA_LUT.put(cls, type);
                }
            }
        }

        Type(int i) {
            this(i, null);
        }

        @NonNull
        public static Type getType(int i) {
            Type type = INVERSE_LUT.get(Integer.valueOf(i));
            return type == null ? UNKNOWN : type;
        }

        public int getValue() {
            return this.value;
        }

        Type(int i, @Nullable java.lang.Class cls) {
            this.value = i;
            this.dataClass = cls;
        }

        @NonNull
        public static <D extends Data> Type getType(@NonNull java.lang.Class<D> cls) {
            Type type = DATA_LUT.get(cls);
            return type == null ? UNKNOWN : type;
        }
    }

    /* renamed from: com.smaato.sdk.core.dns.Record$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27087a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71506a;

        static {
            int[] iArr = new int[Type.values().length];
            f71506a = iArr;
            try {
                iArr[Type.TXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71506a[Type.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private Record(@NonNull DnsName dnsName, @NonNull Type type, @NonNull Class r3, int i, long j, D d, boolean z) {
        this.name = dnsName;
        this.type = type;
        this.clazz = r3;
        this.clazzValue = i;
        this.ttl = j;
        this.payloadData = d;
        this.unicastQuery = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <E extends Data> Record<E> ifPossibleAs(java.lang.Class<E> cls) {
        if (this.type.dataClass == cls) {
            return this;
        }
        return null;
    }

    @NonNull
    public static Record<Data> parse(@NonNull DataInputStream dataInputStream, byte[] bArr) throws IOException {
        boolean z;
        Data parse;
        DnsName parse2 = DnsName.parse(dataInputStream, bArr);
        Type type = Type.getType(dataInputStream.readUnsignedShort());
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        Class r3 = Class.getClass(readUnsignedShort & 32767);
        if ((32768 & readUnsignedShort) > 0) {
            z = true;
        } else {
            z = false;
        }
        long readUnsignedShort2 = (dataInputStream.readUnsignedShort() << 16) + dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        if (C27087a.f71506a[type.ordinal()] != 1) {
            parse = UNKNOWN.parse(dataInputStream, readUnsignedShort3, type);
        } else {
            parse = TXT.parse(dataInputStream, readUnsignedShort3);
        }
        return new Record<>(parse2, type, r3, readUnsignedShort, readUnsignedShort2, parse, z);
    }

    private void toOutputStream(@NonNull OutputStream outputStream) throws IOException {
        if (this.payloadData != null) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            this.name.writeToStream(dataOutputStream);
            dataOutputStream.writeShort(this.type.getValue());
            dataOutputStream.writeShort(this.clazzValue);
            dataOutputStream.writeInt((int) this.ttl);
            dataOutputStream.writeShort(this.payloadData.length());
            this.payloadData.toOutputStream(dataOutputStream);
            return;
        }
        throw new IllegalStateException("Empty Record has no byte representation");
    }

    /* renamed from: as */
    public <E extends Data> Record<E> m39611as(java.lang.Class<E> cls) {
        Record<E> ifPossibleAs = ifPossibleAs(cls);
        if (ifPossibleAs != null) {
            return ifPossibleAs;
        }
        throw new IllegalArgumentException("The instance " + this + " can not be cast to a Record with" + cls);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Record)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Record record = (Record) obj;
        if (!this.name.equals(record.name) || this.type != record.type || this.clazz != record.clazz || !this.payloadData.equals(record.payloadData)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D getPayload() {
        return this.payloadData;
    }

    public int hashCode() {
        if (this.hashCodeCache == null) {
            this.hashCodeCache = Integer.valueOf(((((((this.name.hashCode() + 37) * 37) + this.type.hashCode()) * 37) + this.clazz.hashCode()) * 37) + this.payloadData.hashCode());
        }
        return this.hashCodeCache.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAnswer(C27094j c27094j) {
        Class r0;
        if (c27094j.f71515b == this.type && (((r0 = c27094j.f71516c) == this.clazz || r0 == Class.ANY) && c27094j.f71514a.equals(this.name))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] toByteArray() {
        if (this.bytes == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.name.size() + 10 + this.payloadData.length());
            try {
                toOutputStream(new DataOutputStream(byteArrayOutputStream));
                this.bytes = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        return (byte[]) this.bytes.clone();
    }

    public String toString() {
        return this.name.getRawAce() + ".\t" + this.ttl + '\t' + this.clazz + '\t' + this.type + '\t' + this.payloadData;
    }
}
