package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Funnels {

    /* loaded from: classes4.dex */
    private enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] bArr, PrimitiveSink primitiveSink) {
            primitiveSink.putBytes(bArr);
        }
    }

    /* loaded from: classes4.dex */
    private enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Integer num, PrimitiveSink primitiveSink) {
            primitiveSink.putInt(num.intValue());
        }
    }

    /* loaded from: classes4.dex */
    private enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Long l, PrimitiveSink primitiveSink) {
            primitiveSink.putLong(l.longValue());
        }
    }

    /* loaded from: classes4.dex */
    private static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {

        /* renamed from: b */
        private final Funnel<E> f41119b;

        SequentialFunnel(Funnel<E> funnel) {
            this.f41119b = (Funnel) Preconditions.checkNotNull(funnel);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.f41119b.equals(((SequentialFunnel) obj).f41119b);
            }
            return false;
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Object obj, PrimitiveSink primitiveSink) {
            funnel((Iterable) ((Iterable) obj), primitiveSink);
        }

        public int hashCode() {
            return SequentialFunnel.class.hashCode() ^ this.f41119b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f41119b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("Funnels.sequentialFunnel(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        public void funnel(Iterable<? extends E> iterable, PrimitiveSink primitiveSink) {
            for (E e : iterable) {
                this.f41119b.funnel(e, primitiveSink);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class SinkAsStream extends OutputStream {

        /* renamed from: b */
        final PrimitiveSink f41120b;

        SinkAsStream(PrimitiveSink primitiveSink) {
            this.f41120b = (PrimitiveSink) Preconditions.checkNotNull(primitiveSink);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f41120b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("Funnels.asOutputStream(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.f41120b.putByte((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f41120b.putBytes(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f41120b.putBytes(bArr, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {

        /* renamed from: b */
        private final Charset f41121b;

        /* loaded from: classes4.dex */
        private static class SerializedForm implements Serializable {

            /* renamed from: b */
            private final String f41122b;

            SerializedForm(Charset charset) {
                this.f41122b = charset.name();
            }

            private Object readResolve() {
                return Funnels.stringFunnel(Charset.forName(this.f41122b));
            }
        }

        StringCharsetFunnel(Charset charset) {
            this.f41121b = (Charset) Preconditions.checkNotNull(charset);
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.f41121b.equals(((StringCharsetFunnel) obj).f41121b);
            }
            return false;
        }

        public int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.f41121b.hashCode();
        }

        public String toString() {
            String name = this.f41121b.name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 22);
            sb2.append("Funnels.stringFunnel(");
            sb2.append(name);
            sb2.append(")");
            return sb2.toString();
        }

        Object writeReplace() {
            return new SerializedForm(this.f41121b);
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.putString(charSequence, this.f41121b);
        }
    }

    /* loaded from: classes4.dex */
    private enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.putUnencodedChars(charSequence);
        }
    }

    private Funnels() {
    }

    public static OutputStream asOutputStream(PrimitiveSink primitiveSink) {
        return new SinkAsStream(primitiveSink);
    }

    public static Funnel<byte[]> byteArrayFunnel() {
        return ByteArrayFunnel.INSTANCE;
    }

    public static Funnel<Integer> integerFunnel() {
        return IntegerFunnel.INSTANCE;
    }

    public static Funnel<Long> longFunnel() {
        return LongFunnel.INSTANCE;
    }

    public static <E> Funnel<Iterable<? extends E>> sequentialFunnel(Funnel<E> funnel) {
        return new SequentialFunnel(funnel);
    }

    public static Funnel<CharSequence> stringFunnel(Charset charset) {
        return new StringCharsetFunnel(charset);
    }

    public static Funnel<CharSequence> unencodedCharsFunnel() {
        return UnencodedCharsFunnel.INSTANCE;
    }
}
