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

/* renamed from: gatewayprotocol.v1.GetTokenEventRequestOuterClass */
/* loaded from: classes9.dex */
public final class GetTokenEventRequestOuterClass {

    /* renamed from: gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequest */
    /* loaded from: classes9.dex */
    public static final class GetTokenEventRequest extends GeneratedMessageLite<GetTokenEventRequest, Builder> implements GetTokenEventRequestOrBuilder {
        public static final int BANNER_FIELD_NUMBER = 3;
        private static final GetTokenEventRequest DEFAULT_INSTANCE;
        public static final int INTERSTITIAL_FIELD_NUMBER = 2;
        private static volatile Parser<GetTokenEventRequest> PARSER = null;
        public static final int REWARDED_FIELD_NUMBER = 1;
        public static final int TOKEN_ID_FIELD_NUMBER = 4;
        private ByteString banner_;
        private int bitField0_;
        private ByteString interstitial_;
        private ByteString rewarded_;
        private ByteString tokenId_;

        /* renamed from: gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<GetTokenEventRequest, Builder> implements GetTokenEventRequestOrBuilder {
            /* synthetic */ Builder(C33258a c33258a) {
                this();
            }

            public Builder clearBanner() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearBanner();
                return this;
            }

            public Builder clearInterstitial() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearInterstitial();
                return this;
            }

            public Builder clearRewarded() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearRewarded();
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearTokenId();
                return this;
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getBanner() {
                return ((GetTokenEventRequest) this.instance).getBanner();
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getInterstitial() {
                return ((GetTokenEventRequest) this.instance).getInterstitial();
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getRewarded() {
                return ((GetTokenEventRequest) this.instance).getRewarded();
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getTokenId() {
                return ((GetTokenEventRequest) this.instance).getTokenId();
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasBanner() {
                return ((GetTokenEventRequest) this.instance).hasBanner();
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasInterstitial() {
                return ((GetTokenEventRequest) this.instance).hasInterstitial();
            }

            @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasRewarded() {
                return ((GetTokenEventRequest) this.instance).hasRewarded();
            }

            public Builder setBanner(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setBanner(byteString);
                return this;
            }

            public Builder setInterstitial(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setInterstitial(byteString);
                return this;
            }

            public Builder setRewarded(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setRewarded(byteString);
                return this;
            }

            public Builder setTokenId(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setTokenId(byteString);
                return this;
            }

            private Builder() {
                super(GetTokenEventRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            GetTokenEventRequest getTokenEventRequest = new GetTokenEventRequest();
            DEFAULT_INSTANCE = getTokenEventRequest;
            GeneratedMessageLite.registerDefaultInstance(GetTokenEventRequest.class, getTokenEventRequest);
        }

        private GetTokenEventRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.rewarded_ = byteString;
            this.interstitial_ = byteString;
            this.banner_ = byteString;
            this.tokenId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBanner() {
            this.bitField0_ &= -5;
            this.banner_ = getDefaultInstance().getBanner();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterstitial() {
            this.bitField0_ &= -3;
            this.interstitial_ = getDefaultInstance().getInterstitial();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewarded() {
            this.bitField0_ &= -2;
            this.rewarded_ = getDefaultInstance().getRewarded();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        public static GetTokenEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetTokenEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBanner(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.banner_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterstitial(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.interstitial_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewarded(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.rewarded_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenId(ByteString byteString) {
            byteString.getClass();
            this.tokenId_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33258a.f90810a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetTokenEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004\n", new Object[]{"bitField0_", "rewarded_", "interstitial_", "banner_", "tokenId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetTokenEventRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (GetTokenEventRequest.class) {
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

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getBanner() {
            return this.banner_;
        }

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getInterstitial() {
            return this.interstitial_;
        }

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getRewarded() {
            return this.rewarded_;
        }

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getTokenId() {
            return this.tokenId_;
        }

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasBanner() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasInterstitial() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasRewarded() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(GetTokenEventRequest getTokenEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(getTokenEventRequest);
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetTokenEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder */
    /* loaded from: classes9.dex */
    public interface GetTokenEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getBanner();

        ByteString getInterstitial();

        ByteString getRewarded();

        ByteString getTokenId();

        boolean hasBanner();

        boolean hasInterstitial();

        boolean hasRewarded();
    }

    /* renamed from: gatewayprotocol.v1.GetTokenEventRequestOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33258a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90810a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90810a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90810a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90810a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90810a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90810a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90810a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90810a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private GetTokenEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
