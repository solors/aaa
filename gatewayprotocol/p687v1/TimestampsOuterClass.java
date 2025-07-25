package gatewayprotocol.p687v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.TimestampsOuterClass */
/* loaded from: classes9.dex */
public final class TimestampsOuterClass {

    /* renamed from: gatewayprotocol.v1.TimestampsOuterClass$Timestamps */
    /* loaded from: classes9.dex */
    public static final class Timestamps extends GeneratedMessageLite<Timestamps, Builder> implements TimestampsOrBuilder {
        private static final Timestamps DEFAULT_INSTANCE;
        private static volatile Parser<Timestamps> PARSER = null;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private long sessionTimestamp_;
        private Timestamp timestamp_;

        /* renamed from: gatewayprotocol.v1.TimestampsOuterClass$Timestamps$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Timestamps, Builder> implements TimestampsOrBuilder {
            /* synthetic */ Builder(C33285a c33285a) {
                this();
            }

            public Builder clearSessionTimestamp() {
                copyOnWrite();
                ((Timestamps) this.instance).clearSessionTimestamp();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Timestamps) this.instance).clearTimestamp();
                return this;
            }

            @Override // gatewayprotocol.p687v1.TimestampsOuterClass.TimestampsOrBuilder
            public long getSessionTimestamp() {
                return ((Timestamps) this.instance).getSessionTimestamp();
            }

            @Override // gatewayprotocol.p687v1.TimestampsOuterClass.TimestampsOrBuilder
            public Timestamp getTimestamp() {
                return ((Timestamps) this.instance).getTimestamp();
            }

            @Override // gatewayprotocol.p687v1.TimestampsOuterClass.TimestampsOrBuilder
            public boolean hasTimestamp() {
                return ((Timestamps) this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Timestamps) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder setSessionTimestamp(long j) {
                copyOnWrite();
                ((Timestamps) this.instance).setSessionTimestamp(j);
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Timestamps) this.instance).setTimestamp(timestamp);
                return this;
            }

            private Builder() {
                super(Timestamps.DEFAULT_INSTANCE);
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((Timestamps) this.instance).setTimestamp(builder.build());
                return this;
            }
        }

        static {
            Timestamps timestamps = new Timestamps();
            DEFAULT_INSTANCE = timestamps;
            GeneratedMessageLite.registerDefaultInstance(Timestamps.class, timestamps);
        }

        private Timestamps() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Timestamps> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionTimestamp(long j) {
            this.sessionTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33285a.f90831a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Timestamps();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"timestamp_", "sessionTimestamp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Timestamps> parser = PARSER;
                    if (parser == null) {
                        synchronized (Timestamps.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.p687v1.TimestampsOuterClass.TimestampsOrBuilder
        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        @Override // gatewayprotocol.p687v1.TimestampsOuterClass.TimestampsOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            if (timestamp == null) {
                return Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        @Override // gatewayprotocol.p687v1.TimestampsOuterClass.TimestampsOrBuilder
        public boolean hasTimestamp() {
            if (this.timestamp_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return DEFAULT_INSTANCE.createBuilder(timestamps);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Timestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder */
    /* loaded from: classes9.dex */
    public interface TimestampsOrBuilder extends MessageLiteOrBuilder {
        long getSessionTimestamp();

        Timestamp getTimestamp();

        boolean hasTimestamp();
    }

    /* renamed from: gatewayprotocol.v1.TimestampsOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33285a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90831a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90831a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90831a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90831a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90831a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90831a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90831a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90831a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private TimestampsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
