package gatewayprotocol.p687v1;

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

/* renamed from: gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass */
/* loaded from: classes9.dex */
public final class HeaderBiddingAdMarkupOuterClass {

    /* renamed from: gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup */
    /* loaded from: classes9.dex */
    public static final class HeaderBiddingAdMarkup extends GeneratedMessageLite<HeaderBiddingAdMarkup, Builder> implements HeaderBiddingAdMarkupOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 3;
        private static final HeaderBiddingAdMarkup DEFAULT_INSTANCE;
        private static volatile Parser<HeaderBiddingAdMarkup> PARSER;
        private int adDataVersion_;
        private ByteString adData_;
        private ByteString configurationToken_;

        /* renamed from: gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<HeaderBiddingAdMarkup, Builder> implements HeaderBiddingAdMarkupOrBuilder {
            /* synthetic */ Builder(C33259a c33259a) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearConfigurationToken() {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).clearConfigurationToken();
                return this;
            }

            @Override // gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
            public ByteString getAdData() {
                return ((HeaderBiddingAdMarkup) this.instance).getAdData();
            }

            @Override // gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
            public int getAdDataVersion() {
                return ((HeaderBiddingAdMarkup) this.instance).getAdDataVersion();
            }

            @Override // gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
            public ByteString getConfigurationToken() {
                return ((HeaderBiddingAdMarkup) this.instance).getConfigurationToken();
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).setAdData(byteString);
                return this;
            }

            public Builder setAdDataVersion(int i) {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).setAdDataVersion(i);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).setConfigurationToken(byteString);
                return this;
            }

            private Builder() {
                super(HeaderBiddingAdMarkup.DEFAULT_INSTANCE);
            }
        }

        static {
            HeaderBiddingAdMarkup headerBiddingAdMarkup = new HeaderBiddingAdMarkup();
            DEFAULT_INSTANCE = headerBiddingAdMarkup;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingAdMarkup.class, headerBiddingAdMarkup);
        }

        private HeaderBiddingAdMarkup() {
            ByteString byteString = ByteString.EMPTY;
            this.adData_ = byteString;
            this.configurationToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        public static HeaderBiddingAdMarkup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeaderBiddingAdMarkup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataVersion(int i) {
            this.adDataVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurationToken(ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33259a.f90811a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeaderBiddingAdMarkup();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n", new Object[]{"adData_", "adDataVersion_", "configurationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeaderBiddingAdMarkup> parser = PARSER;
                    if (parser == null) {
                        synchronized (HeaderBiddingAdMarkup.class) {
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

        @Override // gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override // gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override // gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        public static Builder newBuilder(HeaderBiddingAdMarkup headerBiddingAdMarkup) {
            return DEFAULT_INSTANCE.createBuilder(headerBiddingAdMarkup);
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder */
    /* loaded from: classes9.dex */
    public interface HeaderBiddingAdMarkupOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        int getAdDataVersion();

        ByteString getConfigurationToken();
    }

    /* renamed from: gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33259a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90811a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90811a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90811a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90811a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90811a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90811a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90811a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90811a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private HeaderBiddingAdMarkupOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
