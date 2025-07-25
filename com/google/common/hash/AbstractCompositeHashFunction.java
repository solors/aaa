package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {

    /* renamed from: b */
    final HashFunction[] f41081b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractCompositeHashFunction(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.f41081b = hashFunctionArr;
    }

    /* renamed from: a */
    private Hasher m68381a(final Hasher[] hasherArr) {
        return new Hasher() { // from class: com.google.common.hash.AbstractCompositeHashFunction.1
            @Override // com.google.common.hash.Hasher
            public HashCode hash() {
                return AbstractCompositeHashFunction.this.mo68327b(hasherArr);
            }

            @Override // com.google.common.hash.Hasher
            public <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel) {
                for (Hasher hasher : hasherArr) {
                    hasher.putObject(t, funnel);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBoolean(boolean z) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBoolean(z);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putByte(byte b) {
                for (Hasher hasher : hasherArr) {
                    hasher.putByte(b);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putChar(char c) {
                for (Hasher hasher : hasherArr) {
                    hasher.putChar(c);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putDouble(double d) {
                for (Hasher hasher : hasherArr) {
                    hasher.putDouble(d);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putFloat(float f) {
                for (Hasher hasher : hasherArr) {
                    hasher.putFloat(f);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putInt(int i) {
                for (Hasher hasher : hasherArr) {
                    hasher.putInt(i);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putLong(long j) {
                for (Hasher hasher : hasherArr) {
                    hasher.putLong(j);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putShort(short s) {
                for (Hasher hasher : hasherArr) {
                    hasher.putShort(s);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putString(CharSequence charSequence, Charset charset) {
                for (Hasher hasher : hasherArr) {
                    hasher.putString(charSequence, charset);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putUnencodedChars(CharSequence charSequence) {
                for (Hasher hasher : hasherArr) {
                    hasher.putUnencodedChars(charSequence);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(byte[] bArr, int i, int i2) {
                for (Hasher hasher : hasherArr) {
                    hasher.putBytes(bArr, i, i2);
                }
                return this;
            }

            @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
            public Hasher putBytes(ByteBuffer byteBuffer) {
                Hasher[] hasherArr2;
                int position = byteBuffer.position();
                for (Hasher hasher : hasherArr) {
                    Java8Compatibility.m68323d(byteBuffer, position);
                    hasher.putBytes(byteBuffer);
                }
                return this;
            }
        };
    }

    /* renamed from: b */
    abstract HashCode mo68327b(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.f41081b.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.f41081b[i].newHasher();
        }
        return m68381a(hasherArr);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        Preconditions.checkArgument(i >= 0);
        int length = this.f41081b.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.f41081b[i2].newHasher(i);
        }
        return m68381a(hasherArr);
    }
}
