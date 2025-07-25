package gatewayprotocol.p687v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.ErrorOuterClass */
/* loaded from: classes9.dex */
public final class ErrorOuterClass {

    /* renamed from: gatewayprotocol.v1.ErrorOuterClass$Error */
    /* loaded from: classes9.dex */
    public static final class Error extends GeneratedMessageLite<Error, Builder> implements ErrorOrBuilder {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        private static volatile Parser<Error> PARSER;
        private String errorText_ = "";

        /* renamed from: gatewayprotocol.v1.ErrorOuterClass$Error$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Error, Builder> implements ErrorOrBuilder {
            /* synthetic */ Builder(C33257a c33257a) {
                this();
            }

            public Builder clearErrorText() {
                copyOnWrite();
                ((Error) this.instance).clearErrorText();
                return this;
            }

            @Override // gatewayprotocol.p687v1.ErrorOuterClass.ErrorOrBuilder
            public String getErrorText() {
                return ((Error) this.instance).getErrorText();
            }

            @Override // gatewayprotocol.p687v1.ErrorOuterClass.ErrorOrBuilder
            public ByteString getErrorTextBytes() {
                return ((Error) this.instance).getErrorTextBytes();
            }

            public Builder setErrorText(String str) {
                copyOnWrite();
                ((Error) this.instance).setErrorText(str);
                return this;
            }

            public Builder setErrorTextBytes(ByteString byteString) {
                copyOnWrite();
                ((Error) this.instance).setErrorTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        public void clearErrorText() {
            this.errorText_ = getDefaultInstance().getErrorText();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setErrorText(String str) {
            str.getClass();
            this.errorText_ = str;
        }

        public void setErrorTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorText_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33257a.f90809a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"errorText_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Error> parser = PARSER;
                    if (parser == null) {
                        synchronized (Error.class) {
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

        @Override // gatewayprotocol.p687v1.ErrorOuterClass.ErrorOrBuilder
        public String getErrorText() {
            return this.errorText_;
        }

        @Override // gatewayprotocol.p687v1.ErrorOuterClass.ErrorOrBuilder
        public ByteString getErrorTextBytes() {
            return ByteString.copyFromUtf8(this.errorText_);
        }

        public static Builder newBuilder(Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder */
    /* loaded from: classes9.dex */
    public interface ErrorOrBuilder extends MessageLiteOrBuilder {
        String getErrorText();

        ByteString getErrorTextBytes();
    }

    /* renamed from: gatewayprotocol.v1.ErrorOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33257a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90809a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90809a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90809a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90809a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90809a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90809a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90809a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90809a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private ErrorOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
