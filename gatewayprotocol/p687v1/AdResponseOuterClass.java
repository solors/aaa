package gatewayprotocol.p687v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.p687v1.ErrorOuterClass;
import gatewayprotocol.p687v1.WebviewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.AdResponseOuterClass */
/* loaded from: classes9.dex */
public final class AdResponseOuterClass {

    /* renamed from: gatewayprotocol.v1.AdResponseOuterClass$AdResponse */
    /* loaded from: classes9.dex */
    public static final class AdResponse extends GeneratedMessageLite<AdResponse, Builder> implements AdResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 6;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
        private static final AdResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 8;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser<AdResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int impressionConfigurationVersion_;
        private ByteString impressionConfiguration_;
        private ByteString trackingToken_;
        private WebviewConfiguration.WebViewConfiguration webviewConfiguration_;

        /* renamed from: gatewayprotocol.v1.AdResponseOuterClass$AdResponse$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AdResponse, Builder> implements AdResponseOrBuilder {
            /* synthetic */ Builder(C33229a c33229a) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                ((AdResponse) this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((AdResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                ((AdResponse) this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AdResponse) this.instance).clearError();
                return this;
            }

            public Builder clearImpressionConfiguration() {
                copyOnWrite();
                ((AdResponse) this.instance).clearImpressionConfiguration();
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                copyOnWrite();
                ((AdResponse) this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                ((AdResponse) this.instance).clearTrackingToken();
                return this;
            }

            public Builder clearWebviewConfiguration() {
                copyOnWrite();
                ((AdResponse) this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getAdData() {
                return ((AdResponse) this.instance).getAdData();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdResponse) this.instance).getAdDataRefreshToken();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public int getAdDataVersion() {
                return ((AdResponse) this.instance).getAdDataVersion();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AdResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getImpressionConfiguration() {
                return ((AdResponse) this.instance).getImpressionConfiguration();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((AdResponse) this.instance).getImpressionConfigurationVersion();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdResponse) this.instance).getTrackingToken();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
                return ((AdResponse) this.instance).getWebviewConfiguration();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasError() {
                return ((AdResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((AdResponse) this.instance).hasWebviewConfiguration();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdResponse) this.instance).mergeWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setAdData(byteString);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public Builder setAdDataVersion(int i) {
                copyOnWrite();
                ((AdResponse) this.instance).setAdDataVersion(i);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdResponse) this.instance).setError(error);
                return this;
            }

            public Builder setImpressionConfiguration(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setImpressionConfiguration(byteString);
                return this;
            }

            public Builder setImpressionConfigurationVersion(int i) {
                copyOnWrite();
                ((AdResponse) this.instance).setImpressionConfigurationVersion(i);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdResponse) this.instance).setWebviewConfiguration(webViewConfiguration);
                return this;
            }

            private Builder() {
                super(AdResponse.DEFAULT_INSTANCE);
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AdResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration.Builder builder) {
                copyOnWrite();
                ((AdResponse) this.instance).setWebviewConfiguration(builder.build());
                return this;
            }
        }

        static {
            AdResponse adResponse = new AdResponse();
            DEFAULT_INSTANCE = adResponse;
            GeneratedMessageLite.registerDefaultInstance(AdResponse.class, adResponse);
        }

        private AdResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.trackingToken_ = byteString;
            this.impressionConfiguration_ = byteString;
            this.adDataRefreshToken_ = byteString;
            this.adData_ = byteString;
        }

        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        public void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        public void clearImpressionConfiguration() {
            this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
        }

        public void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        public void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        public static AdResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass.Error.Builder) error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 2;
        }

        public void mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            WebviewConfiguration.WebViewConfiguration webViewConfiguration2 = this.webviewConfiguration_;
            if (webViewConfiguration2 != null && webViewConfiguration2 != WebviewConfiguration.WebViewConfiguration.getDefaultInstance()) {
                this.webviewConfiguration_ = WebviewConfiguration.WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom((WebviewConfiguration.WebViewConfiguration.Builder) webViewConfiguration).buildPartial();
            } else {
                this.webviewConfiguration_ = webViewConfiguration;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        public void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        public void setAdDataVersion(int i) {
            this.adDataVersion_ = i;
        }

        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        public void setImpressionConfiguration(ByteString byteString) {
            byteString.getClass();
            this.impressionConfiguration_ = byteString;
        }

        public void setImpressionConfigurationVersion(int i) {
            this.impressionConfigurationVersion_ = i;
        }

        public void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        public void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this.webviewConfiguration_ = webViewConfiguration;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33229a.f90791a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (AdResponse.class) {
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

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webViewConfiguration = this.webviewConfiguration_;
            if (webViewConfiguration == null) {
                return WebviewConfiguration.WebViewConfiguration.getDefaultInstance();
            }
            return webViewConfiguration;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(AdResponse adResponse) {
            return DEFAULT_INSTANCE.createBuilder(adResponse);
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdResponse parseFrom(InputStream inputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder */
    /* loaded from: classes9.dex */
    public interface AdResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        ErrorOuterClass.Error getError();

        ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        ByteString getTrackingToken();

        WebviewConfiguration.WebViewConfiguration getWebviewConfiguration();

        boolean hasError();

        boolean hasWebviewConfiguration();
    }

    /* renamed from: gatewayprotocol.v1.AdResponseOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33229a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90791a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90791a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90791a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90791a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90791a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90791a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90791a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90791a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private AdResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
