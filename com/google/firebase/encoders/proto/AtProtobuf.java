package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public final class AtProtobuf {

    /* renamed from: a */
    private int f43002a;

    /* renamed from: b */
    private Protobuf.IntEncoding f43003b = Protobuf.IntEncoding.DEFAULT;

    /* loaded from: classes4.dex */
    private static final class ProtobufImpl implements Protobuf {

        /* renamed from: y */
        private final int f43004y;

        /* renamed from: z */
        private final Protobuf.IntEncoding f43005z;

        ProtobufImpl(int i, Protobuf.IntEncoding intEncoding) {
            this.f43004y = i;
            this.f43005z = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.f43004y == protobuf.tag() && this.f43005z.equals(protobuf.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f43004y) + (this.f43005z.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.f43005z;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.f43004y;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43004y + "intEncoding=" + this.f43005z + ')';
        }
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public Protobuf build() {
        return new ProtobufImpl(this.f43002a, this.f43003b);
    }

    public AtProtobuf intEncoding(Protobuf.IntEncoding intEncoding) {
        this.f43003b = intEncoding;
        return this;
    }

    public AtProtobuf tag(int i) {
        this.f43002a = i;
        return this;
    }
}
