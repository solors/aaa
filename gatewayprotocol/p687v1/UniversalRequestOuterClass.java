package gatewayprotocol.p687v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import gatewayprotocol.p687v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.p687v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.p687v1.AdRequestOuterClass;
import gatewayprotocol.p687v1.ClientInfoOuterClass;
import gatewayprotocol.p687v1.DeveloperConsentOuterClass;
import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p687v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.p687v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.p687v1.InitializationRequestOuterClass;
import gatewayprotocol.p687v1.OperativeEventRequestOuterClass;
import gatewayprotocol.p687v1.PiiOuterClass;
import gatewayprotocol.p687v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.p687v1.TestDataOuterClass;
import gatewayprotocol.p687v1.TimestampsOuterClass;
import gatewayprotocol.p687v1.TransactionEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass */
/* loaded from: classes9.dex */
public final class UniversalRequestOuterClass {

    /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken */
    /* loaded from: classes9.dex */
    public static final class LimitedSessionToken extends GeneratedMessageLite<LimitedSessionToken, Builder> implements LimitedSessionTokenOrBuilder {
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 11;
        private static final LimitedSessionToken DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 1;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
        public static final int GAME_ID_FIELD_NUMBER = 8;
        public static final int IDFI_FIELD_NUMBER = 4;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 10;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 12;
        public static final int OS_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser<LimitedSessionToken> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 9;
        public static final int SDK_VERSION_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 7;
        public static final int SESSION_ID_FIELD_NUMBER = 13;
        private int bitField0_;
        private int mediationProvider_;
        private int platform_;
        private int sdkVersion_;
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String osVersion_ = "";
        private String idfi_ = "";
        private String sdkVersionName_ = "";
        private String gameId_ = "";
        private String customMediationName_ = "";
        private String mediationVersion_ = "";
        private ByteString sessionId_ = ByteString.EMPTY;

        /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<LimitedSessionToken, Builder> implements LimitedSessionTokenOrBuilder {
            /* synthetic */ Builder(C33291a c33291a) {
                this();
            }

            public Builder clearCustomMediationName() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearCustomMediationName();
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearDeviceMake();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearGameId() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearGameId();
                return this;
            }

            public Builder clearIdfi() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearIdfi();
                return this;
            }

            public Builder clearMediationProvider() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearMediationProvider();
                return this;
            }

            public Builder clearMediationVersion() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearMediationVersion();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearPlatform();
                return this;
            }

            public Builder clearSdkVersion() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearSdkVersion();
                return this;
            }

            public Builder clearSdkVersionName() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearSdkVersionName();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).clearSessionId();
                return this;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getCustomMediationName() {
                return ((LimitedSessionToken) this.instance).getCustomMediationName();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getCustomMediationNameBytes() {
                return ((LimitedSessionToken) this.instance).getCustomMediationNameBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getDeviceMake() {
                return ((LimitedSessionToken) this.instance).getDeviceMake();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((LimitedSessionToken) this.instance).getDeviceMakeBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getDeviceModel() {
                return ((LimitedSessionToken) this.instance).getDeviceModel();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((LimitedSessionToken) this.instance).getDeviceModelBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getGameId() {
                return ((LimitedSessionToken) this.instance).getGameId();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getGameIdBytes() {
                return ((LimitedSessionToken) this.instance).getGameIdBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getIdfi() {
                return ((LimitedSessionToken) this.instance).getIdfi();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getIdfiBytes() {
                return ((LimitedSessionToken) this.instance).getIdfiBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ClientInfoOuterClass.MediationProvider getMediationProvider() {
                return ((LimitedSessionToken) this.instance).getMediationProvider();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public int getMediationProviderValue() {
                return ((LimitedSessionToken) this.instance).getMediationProviderValue();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getMediationVersion() {
                return ((LimitedSessionToken) this.instance).getMediationVersion();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getMediationVersionBytes() {
                return ((LimitedSessionToken) this.instance).getMediationVersionBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getOsVersion() {
                return ((LimitedSessionToken) this.instance).getOsVersion();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getOsVersionBytes() {
                return ((LimitedSessionToken) this.instance).getOsVersionBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ClientInfoOuterClass.Platform getPlatform() {
                return ((LimitedSessionToken) this.instance).getPlatform();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public int getPlatformValue() {
                return ((LimitedSessionToken) this.instance).getPlatformValue();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public int getSdkVersion() {
                return ((LimitedSessionToken) this.instance).getSdkVersion();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public String getSdkVersionName() {
                return ((LimitedSessionToken) this.instance).getSdkVersionName();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getSdkVersionNameBytes() {
                return ((LimitedSessionToken) this.instance).getSdkVersionNameBytes();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public ByteString getSessionId() {
                return ((LimitedSessionToken) this.instance).getSessionId();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public boolean hasCustomMediationName() {
                return ((LimitedSessionToken) this.instance).hasCustomMediationName();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public boolean hasMediationVersion() {
                return ((LimitedSessionToken) this.instance).hasMediationVersion();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
            public boolean hasSessionId() {
                return ((LimitedSessionToken) this.instance).hasSessionId();
            }

            public Builder setCustomMediationName(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setCustomMediationName(str);
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setCustomMediationNameBytes(byteString);
                return this;
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setDeviceMake(str);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setGameId(str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setGameIdBytes(byteString);
                return this;
            }

            public Builder setIdfi(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setIdfi(str);
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setIdfiBytes(byteString);
                return this;
            }

            public Builder setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setMediationProvider(mediationProvider);
                return this;
            }

            public Builder setMediationProviderValue(int i) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setMediationProviderValue(i);
                return this;
            }

            public Builder setMediationVersion(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setMediationVersion(str);
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setMediationVersionBytes(byteString);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            public Builder setPlatform(ClientInfoOuterClass.Platform platform) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setPlatform(platform);
                return this;
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setPlatformValue(i);
                return this;
            }

            public Builder setSdkVersion(int i) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setSdkVersion(i);
                return this;
            }

            public Builder setSdkVersionName(String str) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setSdkVersionName(str);
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setSdkVersionNameBytes(byteString);
                return this;
            }

            public Builder setSessionId(ByteString byteString) {
                copyOnWrite();
                ((LimitedSessionToken) this.instance).setSessionId(byteString);
                return this;
            }

            private Builder() {
                super(LimitedSessionToken.DEFAULT_INSTANCE);
            }
        }

        static {
            LimitedSessionToken limitedSessionToken = new LimitedSessionToken();
            DEFAULT_INSTANCE = limitedSessionToken;
            GeneratedMessageLite.registerDefaultInstance(LimitedSessionToken.class, limitedSessionToken);
        }

        private LimitedSessionToken() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = getDefaultInstance().getCustomMediationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMake() {
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfi() {
            this.idfi_ = getDefaultInstance().getIdfi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = getDefaultInstance().getMediationVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersionName() {
            this.sdkVersionName_ = getDefaultInstance().getSdkVersionName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -5;
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static LimitedSessionToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LimitedSessionToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomMediationName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customMediationName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomMediationNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customMediationName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMake(String str) {
            str.getClass();
            this.deviceMake_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMakeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGameIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfi(String str) {
            str.getClass();
            this.idfi_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.mediationProvider_ = mediationProvider.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProviderValue(int i) {
            this.mediationProvider_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.mediationVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(ClientInfoOuterClass.Platform platform) {
            this.platform_ = platform.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformValue(int i) {
            this.platform_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersion(int i) {
            this.sdkVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionName(String str) {
            str.getClass();
            this.sdkVersionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sdkVersionName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.sessionId_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33291a.f90835a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LimitedSessionToken();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0007Ȉ\bȈ\t\f\n\f\u000bለ\u0000\fለ\u0001\rည\u0002", new Object[]{"bitField0_", "deviceMake_", "deviceModel_", "osVersion_", "idfi_", "sdkVersion_", "sdkVersionName_", "gameId_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "sessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LimitedSessionToken> parser = PARSER;
                    if (parser == null) {
                        synchronized (LimitedSessionToken.class) {
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

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8(this.customMediationName_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getGameId() {
            return this.gameId_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getIdfi() {
            return this.idfi_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider forNumber = ClientInfoOuterClass.MediationProvider.forNumber(this.mediationProvider_);
            if (forNumber == null) {
                return ClientInfoOuterClass.MediationProvider.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getMediationVersionBytes() {
            return ByteString.copyFromUtf8(this.mediationVersion_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform forNumber = ClientInfoOuterClass.Platform.forNumber(this.platform_);
            if (forNumber == null) {
                return ClientInfoOuterClass.Platform.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public String getSdkVersionName() {
            return this.sdkVersionName_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getSdkVersionNameBytes() {
            return ByteString.copyFromUtf8(this.sdkVersionName_);
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public ByteString getSessionId() {
            return this.sessionId_;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public boolean hasCustomMediationName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public boolean hasMediationVersion() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.LimitedSessionTokenOrBuilder
        public boolean hasSessionId() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(LimitedSessionToken limitedSessionToken) {
            return DEFAULT_INSTANCE.createBuilder(limitedSessionToken);
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LimitedSessionToken parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder */
    /* loaded from: classes9.dex */
    public interface LimitedSessionTokenOrBuilder extends MessageLiteOrBuilder {
        String getCustomMediationName();

        ByteString getCustomMediationNameBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getGameId();

        ByteString getGameIdBytes();

        String getIdfi();

        ByteString getIdfiBytes();

        ClientInfoOuterClass.MediationProvider getMediationProvider();

        int getMediationProviderValue();

        String getMediationVersion();

        ByteString getMediationVersionBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        ClientInfoOuterClass.Platform getPlatform();

        int getPlatformValue();

        int getSdkVersion();

        String getSdkVersionName();

        ByteString getSdkVersionNameBytes();

        ByteString getSessionId();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();

        boolean hasSessionId();
    }

    /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest */
    /* loaded from: classes9.dex */
    public static final class UniversalRequest extends GeneratedMessageLite<UniversalRequest, Builder> implements UniversalRequestOrBuilder {
        private static final UniversalRequest DEFAULT_INSTANCE;
        private static volatile Parser<UniversalRequest> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int SHARED_DATA_FIELD_NUMBER = 1;
        private Payload payload_;
        private SharedData sharedData_;

        /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<UniversalRequest, Builder> implements UniversalRequestOrBuilder {
            /* synthetic */ Builder(C33291a c33291a) {
                this();
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((UniversalRequest) this.instance).clearPayload();
                return this;
            }

            public Builder clearSharedData() {
                copyOnWrite();
                ((UniversalRequest) this.instance).clearSharedData();
                return this;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public Payload getPayload() {
                return ((UniversalRequest) this.instance).getPayload();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public SharedData getSharedData() {
                return ((UniversalRequest) this.instance).getSharedData();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public boolean hasPayload() {
                return ((UniversalRequest) this.instance).hasPayload();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
            public boolean hasSharedData() {
                return ((UniversalRequest) this.instance).hasSharedData();
            }

            public Builder mergePayload(Payload payload) {
                copyOnWrite();
                ((UniversalRequest) this.instance).mergePayload(payload);
                return this;
            }

            public Builder mergeSharedData(SharedData sharedData) {
                copyOnWrite();
                ((UniversalRequest) this.instance).mergeSharedData(sharedData);
                return this;
            }

            public Builder setPayload(Payload payload) {
                copyOnWrite();
                ((UniversalRequest) this.instance).setPayload(payload);
                return this;
            }

            public Builder setSharedData(SharedData sharedData) {
                copyOnWrite();
                ((UniversalRequest) this.instance).setSharedData(sharedData);
                return this;
            }

            private Builder() {
                super(UniversalRequest.DEFAULT_INSTANCE);
            }

            public Builder setPayload(Payload.Builder builder) {
                copyOnWrite();
                ((UniversalRequest) this.instance).setPayload(builder.build());
                return this;
            }

            public Builder setSharedData(SharedData.Builder builder) {
                copyOnWrite();
                ((UniversalRequest) this.instance).setSharedData(builder.build());
                return this;
            }
        }

        /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload */
        /* loaded from: classes9.dex */
        public static final class Payload extends GeneratedMessageLite<Payload, Builder> implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
            public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
            public static final int AD_REQUEST_FIELD_NUMBER = 3;
            private static final Payload DEFAULT_INSTANCE;
            public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
            public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
            public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
            public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
            public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
            private static volatile Parser<Payload> PARSER = null;
            public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
            public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
            private int valueCase_ = 0;
            private Object value_;

            /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder */
            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Payload, Builder> implements PayloadOrBuilder {
                /* synthetic */ Builder(C33291a c33291a) {
                    this();
                }

                public Builder clearAdDataRefreshRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdDataRefreshRequest();
                    return this;
                }

                public Builder clearAdPlayerConfigRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdPlayerConfigRequest();
                    return this;
                }

                public Builder clearAdRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdRequest();
                    return this;
                }

                public Builder clearDiagnosticEventRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearDiagnosticEventRequest();
                    return this;
                }

                public Builder clearGetTokenEventRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearGetTokenEventRequest();
                    return this;
                }

                public Builder clearInitializationCompletedEventRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearInitializationCompletedEventRequest();
                    return this;
                }

                public Builder clearInitializationRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearInitializationRequest();
                    return this;
                }

                public Builder clearOperativeEvent() {
                    copyOnWrite();
                    ((Payload) this.instance).clearOperativeEvent();
                    return this;
                }

                public Builder clearPrivacyUpdateRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearPrivacyUpdateRequest();
                    return this;
                }

                public Builder clearTransactionEventRequest() {
                    copyOnWrite();
                    ((Payload) this.instance).clearTransactionEventRequest();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Payload) this.instance).clearValue();
                    return this;
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                    return ((Payload) this.instance).getAdDataRefreshRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                    return ((Payload) this.instance).getAdPlayerConfigRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public AdRequestOuterClass.AdRequest getAdRequest() {
                    return ((Payload) this.instance).getAdRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                    return ((Payload) this.instance).getDiagnosticEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                    return ((Payload) this.instance).getGetTokenEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                    return ((Payload) this.instance).getInitializationCompletedEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                    return ((Payload) this.instance).getInitializationRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                    return ((Payload) this.instance).getOperativeEvent();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                    return ((Payload) this.instance).getPrivacyUpdateRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                    return ((Payload) this.instance).getTransactionEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public ValueCase getValueCase() {
                    return ((Payload) this.instance).getValueCase();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasAdDataRefreshRequest() {
                    return ((Payload) this.instance).hasAdDataRefreshRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasAdPlayerConfigRequest() {
                    return ((Payload) this.instance).hasAdPlayerConfigRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasAdRequest() {
                    return ((Payload) this.instance).hasAdRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasDiagnosticEventRequest() {
                    return ((Payload) this.instance).hasDiagnosticEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasGetTokenEventRequest() {
                    return ((Payload) this.instance).hasGetTokenEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasInitializationCompletedEventRequest() {
                    return ((Payload) this.instance).hasInitializationCompletedEventRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasInitializationRequest() {
                    return ((Payload) this.instance).hasInitializationRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasOperativeEvent() {
                    return ((Payload) this.instance).hasOperativeEvent();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasPrivacyUpdateRequest() {
                    return ((Payload) this.instance).hasPrivacyUpdateRequest();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
                public boolean hasTransactionEventRequest() {
                    return ((Payload) this.instance).hasTransactionEventRequest();
                }

                public Builder mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdDataRefreshRequest(adDataRefreshRequest);
                    return this;
                }

                public Builder mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdPlayerConfigRequest(adPlayerConfigRequest);
                    return this;
                }

                public Builder mergeAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdRequest(adRequest);
                    return this;
                }

                public Builder mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeDiagnosticEventRequest(diagnosticEventRequest);
                    return this;
                }

                public Builder mergeGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeGetTokenEventRequest(getTokenEventRequest);
                    return this;
                }

                public Builder mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeInitializationCompletedEventRequest(initializationCompletedEventRequest);
                    return this;
                }

                public Builder mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeInitializationRequest(initializationRequest);
                    return this;
                }

                public Builder mergeOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeOperativeEvent(operativeEventRequest);
                    return this;
                }

                public Builder mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergePrivacyUpdateRequest(privacyUpdateRequest);
                    return this;
                }

                public Builder mergeTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeTransactionEventRequest(transactionEventRequest);
                    return this;
                }

                public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdDataRefreshRequest(adDataRefreshRequest);
                    return this;
                }

                public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdPlayerConfigRequest(adPlayerConfigRequest);
                    return this;
                }

                public Builder setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdRequest(adRequest);
                    return this;
                }

                public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setDiagnosticEventRequest(diagnosticEventRequest);
                    return this;
                }

                public Builder setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setGetTokenEventRequest(getTokenEventRequest);
                    return this;
                }

                public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationCompletedEventRequest(initializationCompletedEventRequest);
                    return this;
                }

                public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationRequest(initializationRequest);
                    return this;
                }

                public Builder setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setOperativeEvent(operativeEventRequest);
                    return this;
                }

                public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setPrivacyUpdateRequest(privacyUpdateRequest);
                    return this;
                }

                public Builder setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    copyOnWrite();
                    ((Payload) this.instance).setTransactionEventRequest(transactionEventRequest);
                    return this;
                }

                private Builder() {
                    super(Payload.DEFAULT_INSTANCE);
                }

                public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdDataRefreshRequest(builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdPlayerConfigRequest(builder.build());
                    return this;
                }

                public Builder setAdRequest(AdRequestOuterClass.AdRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdRequest(builder.build());
                    return this;
                }

                public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setDiagnosticEventRequest(builder.build());
                    return this;
                }

                public Builder setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setGetTokenEventRequest(builder.build());
                    return this;
                }

                public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationCompletedEventRequest(builder.build());
                    return this;
                }

                public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationRequest(builder.build());
                    return this;
                }

                public Builder setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setOperativeEvent(builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setPrivacyUpdateRequest(builder.build());
                    return this;
                }

                public Builder setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setTransactionEventRequest(builder.build());
                    return this;
                }
            }

            /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase */
            /* loaded from: classes9.dex */
            public enum ValueCase {
                INITIALIZATION_REQUEST(2),
                AD_REQUEST(3),
                OPERATIVE_EVENT(4),
                DIAGNOSTIC_EVENT_REQUEST(5),
                AD_PLAYER_CONFIG_REQUEST(6),
                GET_TOKEN_EVENT_REQUEST(7),
                PRIVACY_UPDATE_REQUEST(8),
                AD_DATA_REFRESH_REQUEST(9),
                INITIALIZATION_COMPLETED_EVENT_REQUEST(10),
                TRANSACTION_EVENT_REQUEST(11),
                VALUE_NOT_SET(0);
                
                private final int value;

                ValueCase(int i) {
                    this.value = i;
                }

                public static ValueCase forNumber(int i) {
                    if (i != 0) {
                        switch (i) {
                            case 2:
                                return INITIALIZATION_REQUEST;
                            case 3:
                                return AD_REQUEST;
                            case 4:
                                return OPERATIVE_EVENT;
                            case 5:
                                return DIAGNOSTIC_EVENT_REQUEST;
                            case 6:
                                return AD_PLAYER_CONFIG_REQUEST;
                            case 7:
                                return GET_TOKEN_EVENT_REQUEST;
                            case 8:
                                return PRIVACY_UPDATE_REQUEST;
                            case 9:
                                return AD_DATA_REFRESH_REQUEST;
                            case 10:
                                return INITIALIZATION_COMPLETED_EVENT_REQUEST;
                            case 11:
                                return TRANSACTION_EVENT_REQUEST;
                            default:
                                return null;
                        }
                    }
                    return VALUE_NOT_SET;
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static ValueCase valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                Payload payload = new Payload();
                DEFAULT_INSTANCE = payload;
                GeneratedMessageLite.registerDefaultInstance(Payload.class, payload);
            }

            private Payload() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdRequest() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationRequest() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOperativeEvent() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            public static Payload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                if (this.valueCase_ == 9 && this.value_ != AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance()) {
                    this.value_ = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder((AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.value_).mergeFrom((AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder) adDataRefreshRequest).buildPartial();
                } else {
                    this.value_ = adDataRefreshRequest;
                }
                this.valueCase_ = 9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                if (this.valueCase_ == 6 && this.value_ != AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance()) {
                    this.value_ = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.value_).mergeFrom((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder) adPlayerConfigRequest).buildPartial();
                } else {
                    this.value_ = adPlayerConfigRequest;
                }
                this.valueCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                if (this.valueCase_ == 3 && this.value_ != AdRequestOuterClass.AdRequest.getDefaultInstance()) {
                    this.value_ = AdRequestOuterClass.AdRequest.newBuilder((AdRequestOuterClass.AdRequest) this.value_).mergeFrom((AdRequestOuterClass.AdRequest.Builder) adRequest).buildPartial();
                } else {
                    this.value_ = adRequest;
                }
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                if (this.valueCase_ == 5 && this.value_ != DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance()) {
                    this.value_ = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder((DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.value_).mergeFrom((DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder) diagnosticEventRequest).buildPartial();
                } else {
                    this.value_ = diagnosticEventRequest;
                }
                this.valueCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                if (this.valueCase_ == 7 && this.value_ != GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance()) {
                    this.value_ = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder((GetTokenEventRequestOuterClass.GetTokenEventRequest) this.value_).mergeFrom((GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder) getTokenEventRequest).buildPartial();
                } else {
                    this.value_ = getTokenEventRequest;
                }
                this.valueCase_ = 7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                if (this.valueCase_ == 10 && this.value_ != InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance()) {
                    this.value_ = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) this.value_).mergeFrom((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder) initializationCompletedEventRequest).buildPartial();
                } else {
                    this.value_ = initializationCompletedEventRequest;
                }
                this.valueCase_ = 10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                if (this.valueCase_ == 2 && this.value_ != InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                    this.value_ = InitializationRequestOuterClass.InitializationRequest.newBuilder((InitializationRequestOuterClass.InitializationRequest) this.value_).mergeFrom((InitializationRequestOuterClass.InitializationRequest.Builder) initializationRequest).buildPartial();
                } else {
                    this.value_ = initializationRequest;
                }
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                if (this.valueCase_ == 4 && this.value_ != OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance()) {
                    this.value_ = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder((OperativeEventRequestOuterClass.OperativeEventRequest) this.value_).mergeFrom((OperativeEventRequestOuterClass.OperativeEventRequest.Builder) operativeEventRequest).buildPartial();
                } else {
                    this.value_ = operativeEventRequest;
                }
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                if (this.valueCase_ == 8 && this.value_ != PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance()) {
                    this.value_ = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.value_).mergeFrom((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder) privacyUpdateRequest).buildPartial();
                } else {
                    this.value_ = privacyUpdateRequest;
                }
                this.valueCase_ = 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                if (this.valueCase_ == 11 && this.value_ != TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance()) {
                    this.value_ = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder((TransactionEventRequestOuterClass.TransactionEventRequest) this.value_).mergeFrom((TransactionEventRequestOuterClass.TransactionEventRequest.Builder) transactionEventRequest).buildPartial();
                } else {
                    this.value_ = transactionEventRequest;
                }
                this.valueCase_ = 11;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Payload parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Payload> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                this.value_ = adDataRefreshRequest;
                this.valueCase_ = 9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                this.value_ = adPlayerConfigRequest;
                this.valueCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                this.value_ = adRequest;
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                this.value_ = diagnosticEventRequest;
                this.valueCase_ = 5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                this.value_ = getTokenEventRequest;
                this.valueCase_ = 7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                this.value_ = initializationCompletedEventRequest;
                this.valueCase_ = 10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                this.value_ = initializationRequest;
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                this.value_ = operativeEventRequest;
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                this.value_ = privacyUpdateRequest;
                this.valueCase_ = 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                this.value_ = transactionEventRequest;
                this.valueCase_ = 11;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C33291a.f90835a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Payload();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"value_", "valueCase_", InitializationRequestOuterClass.InitializationRequest.class, AdRequestOuterClass.AdRequest.class, OperativeEventRequestOuterClass.OperativeEventRequest.class, DiagnosticEventRequestOuterClass.DiagnosticEventRequest.class, AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.class, GetTokenEventRequestOuterClass.GetTokenEventRequest.class, PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.class, AdDataRefreshRequestOuterClass.AdDataRefreshRequest.class, InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.class, TransactionEventRequestOuterClass.TransactionEventRequest.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Payload> parser = PARSER;
                        if (parser == null) {
                            synchronized (Payload.class) {
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

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    return (AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.value_;
                }
                return AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    return (AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.value_;
                }
                return AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public AdRequestOuterClass.AdRequest getAdRequest() {
                if (this.valueCase_ == 3) {
                    return (AdRequestOuterClass.AdRequest) this.value_;
                }
                return AdRequestOuterClass.AdRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    return (DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.value_;
                }
                return DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    return (GetTokenEventRequestOuterClass.GetTokenEventRequest) this.value_;
                }
                return GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    return (InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) this.value_;
                }
                return InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                if (this.valueCase_ == 2) {
                    return (InitializationRequestOuterClass.InitializationRequest) this.value_;
                }
                return InitializationRequestOuterClass.InitializationRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                if (this.valueCase_ == 4) {
                    return (OperativeEventRequestOuterClass.OperativeEventRequest) this.value_;
                }
                return OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    return (PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.value_;
                }
                return PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    return (TransactionEventRequestOuterClass.TransactionEventRequest) this.value_;
                }
                return TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasAdRequest() {
                if (this.valueCase_ == 3) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasInitializationRequest() {
                if (this.valueCase_ == 2) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasOperativeEvent() {
                if (this.valueCase_ == 4) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder
            public boolean hasTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(Payload payload) {
                return DEFAULT_INSTANCE.createBuilder(payload);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Payload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Payload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Payload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Payload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Payload parseFrom(InputStream inputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Payload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder */
        /* loaded from: classes9.dex */
        public interface PayloadOrBuilder extends MessageLiteOrBuilder {
            AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest();

            AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest();

            AdRequestOuterClass.AdRequest getAdRequest();

            DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest();

            GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest();

            InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest();

            InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

            OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent();

            PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest();

            TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest();

            Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshRequest();

            boolean hasAdPlayerConfigRequest();

            boolean hasAdRequest();

            boolean hasDiagnosticEventRequest();

            boolean hasGetTokenEventRequest();

            boolean hasInitializationCompletedEventRequest();

            boolean hasInitializationRequest();

            boolean hasOperativeEvent();

            boolean hasPrivacyUpdateRequest();

            boolean hasTransactionEventRequest();
        }

        /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData */
        /* loaded from: classes9.dex */
        public static final class SharedData extends GeneratedMessageLite<SharedData, Builder> implements SharedDataOrBuilder {
            public static final int APP_START_TIME_FIELD_NUMBER = 8;
            public static final int CURRENT_STATE_FIELD_NUMBER = 6;
            private static final SharedData DEFAULT_INSTANCE;
            public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
            public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
            private static volatile Parser<SharedData> PARSER = null;
            public static final int PII_FIELD_NUMBER = 3;
            public static final int SDK_START_TIME_FIELD_NUMBER = 9;
            public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
            public static final int TEST_DATA_FIELD_NUMBER = 7;
            public static final int TIMESTAMPS_FIELD_NUMBER = 2;
            public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
            private Timestamp appStartTime_;
            private int bitField0_;
            private ByteString currentState_;
            private DeveloperConsentOuterClass.DeveloperConsent developerConsent_;
            private LimitedSessionToken limitedSessionToken_;
            private PiiOuterClass.Pii pii_;
            private Timestamp sdkStartTime_;
            private ByteString sessionToken_;
            private TestDataOuterClass.TestData testData_;
            private TimestampsOuterClass.Timestamps timestamps_;
            private int webviewVersion_;

            /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData$Builder */
            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<SharedData, Builder> implements SharedDataOrBuilder {
                /* synthetic */ Builder(C33291a c33291a) {
                    this();
                }

                public Builder clearAppStartTime() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearAppStartTime();
                    return this;
                }

                public Builder clearCurrentState() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearCurrentState();
                    return this;
                }

                public Builder clearDeveloperConsent() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearDeveloperConsent();
                    return this;
                }

                public Builder clearLimitedSessionToken() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearLimitedSessionToken();
                    return this;
                }

                public Builder clearPii() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearPii();
                    return this;
                }

                public Builder clearSdkStartTime() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearSdkStartTime();
                    return this;
                }

                public Builder clearSessionToken() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearSessionToken();
                    return this;
                }

                public Builder clearTestData() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearTestData();
                    return this;
                }

                public Builder clearTimestamps() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearTimestamps();
                    return this;
                }

                public Builder clearWebviewVersion() {
                    copyOnWrite();
                    ((SharedData) this.instance).clearWebviewVersion();
                    return this;
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public Timestamp getAppStartTime() {
                    return ((SharedData) this.instance).getAppStartTime();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public ByteString getCurrentState() {
                    return ((SharedData) this.instance).getCurrentState();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                    return ((SharedData) this.instance).getDeveloperConsent();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public LimitedSessionToken getLimitedSessionToken() {
                    return ((SharedData) this.instance).getLimitedSessionToken();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public PiiOuterClass.Pii getPii() {
                    return ((SharedData) this.instance).getPii();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public Timestamp getSdkStartTime() {
                    return ((SharedData) this.instance).getSdkStartTime();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public ByteString getSessionToken() {
                    return ((SharedData) this.instance).getSessionToken();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public TestDataOuterClass.TestData getTestData() {
                    return ((SharedData) this.instance).getTestData();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public TimestampsOuterClass.Timestamps getTimestamps() {
                    return ((SharedData) this.instance).getTimestamps();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public int getWebviewVersion() {
                    return ((SharedData) this.instance).getWebviewVersion();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasAppStartTime() {
                    return ((SharedData) this.instance).hasAppStartTime();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasCurrentState() {
                    return ((SharedData) this.instance).hasCurrentState();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasDeveloperConsent() {
                    return ((SharedData) this.instance).hasDeveloperConsent();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasLimitedSessionToken() {
                    return ((SharedData) this.instance).hasLimitedSessionToken();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasPii() {
                    return ((SharedData) this.instance).hasPii();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasSdkStartTime() {
                    return ((SharedData) this.instance).hasSdkStartTime();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasSessionToken() {
                    return ((SharedData) this.instance).hasSessionToken();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasTestData() {
                    return ((SharedData) this.instance).hasTestData();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasTimestamps() {
                    return ((SharedData) this.instance).hasTimestamps();
                }

                @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
                public boolean hasWebviewVersion() {
                    return ((SharedData) this.instance).hasWebviewVersion();
                }

                public Builder mergeAppStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergeAppStartTime(timestamp);
                    return this;
                }

                public Builder mergeDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergeDeveloperConsent(developerConsent);
                    return this;
                }

                public Builder mergeLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergeLimitedSessionToken(limitedSessionToken);
                    return this;
                }

                public Builder mergePii(PiiOuterClass.Pii pii) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergePii(pii);
                    return this;
                }

                public Builder mergeSdkStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergeSdkStartTime(timestamp);
                    return this;
                }

                public Builder mergeTestData(TestDataOuterClass.TestData testData) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergeTestData(testData);
                    return this;
                }

                public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                    copyOnWrite();
                    ((SharedData) this.instance).mergeTimestamps(timestamps);
                    return this;
                }

                public Builder setAppStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    ((SharedData) this.instance).setAppStartTime(timestamp);
                    return this;
                }

                public Builder setCurrentState(ByteString byteString) {
                    copyOnWrite();
                    ((SharedData) this.instance).setCurrentState(byteString);
                    return this;
                }

                public Builder setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    copyOnWrite();
                    ((SharedData) this.instance).setDeveloperConsent(developerConsent);
                    return this;
                }

                public Builder setLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                    copyOnWrite();
                    ((SharedData) this.instance).setLimitedSessionToken(limitedSessionToken);
                    return this;
                }

                public Builder setPii(PiiOuterClass.Pii pii) {
                    copyOnWrite();
                    ((SharedData) this.instance).setPii(pii);
                    return this;
                }

                public Builder setSdkStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    ((SharedData) this.instance).setSdkStartTime(timestamp);
                    return this;
                }

                public Builder setSessionToken(ByteString byteString) {
                    copyOnWrite();
                    ((SharedData) this.instance).setSessionToken(byteString);
                    return this;
                }

                public Builder setTestData(TestDataOuterClass.TestData testData) {
                    copyOnWrite();
                    ((SharedData) this.instance).setTestData(testData);
                    return this;
                }

                public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                    copyOnWrite();
                    ((SharedData) this.instance).setTimestamps(timestamps);
                    return this;
                }

                public Builder setWebviewVersion(int i) {
                    copyOnWrite();
                    ((SharedData) this.instance).setWebviewVersion(i);
                    return this;
                }

                private Builder() {
                    super(SharedData.DEFAULT_INSTANCE);
                }

                public Builder setAppStartTime(Timestamp.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setAppStartTime(builder.build());
                    return this;
                }

                public Builder setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setDeveloperConsent(builder.build());
                    return this;
                }

                public Builder setLimitedSessionToken(LimitedSessionToken.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setLimitedSessionToken(builder.build());
                    return this;
                }

                public Builder setPii(PiiOuterClass.Pii.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setPii(builder.build());
                    return this;
                }

                public Builder setSdkStartTime(Timestamp.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setSdkStartTime(builder.build());
                    return this;
                }

                public Builder setTestData(TestDataOuterClass.TestData.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setTestData(builder.build());
                    return this;
                }

                public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                    copyOnWrite();
                    ((SharedData) this.instance).setTimestamps(builder.build());
                    return this;
                }
            }

            static {
                SharedData sharedData = new SharedData();
                DEFAULT_INSTANCE = sharedData;
                GeneratedMessageLite.registerDefaultInstance(SharedData.class, sharedData);
            }

            private SharedData() {
                ByteString byteString = ByteString.EMPTY;
                this.sessionToken_ = byteString;
                this.currentState_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAppStartTime() {
                this.appStartTime_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCurrentState() {
                this.bitField0_ &= -17;
                this.currentState_ = getDefaultInstance().getCurrentState();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeveloperConsent() {
                this.developerConsent_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLimitedSessionToken() {
                this.limitedSessionToken_ = null;
                this.bitField0_ &= -65;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPii() {
                this.pii_ = null;
                this.bitField0_ &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSdkStartTime() {
                this.sdkStartTime_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSessionToken() {
                this.bitField0_ &= -2;
                this.sessionToken_ = getDefaultInstance().getSessionToken();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTestData() {
                this.testData_ = null;
                this.bitField0_ &= -33;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTimestamps() {
                this.timestamps_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWebviewVersion() {
                this.bitField0_ &= -9;
                this.webviewVersion_ = 0;
            }

            public static SharedData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAppStartTime(Timestamp timestamp) {
                timestamp.getClass();
                Timestamp timestamp2 = this.appStartTime_;
                if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                    this.appStartTime_ = Timestamp.newBuilder(this.appStartTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
                } else {
                    this.appStartTime_ = timestamp;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                DeveloperConsentOuterClass.DeveloperConsent developerConsent2 = this.developerConsent_;
                if (developerConsent2 != null && developerConsent2 != DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance()) {
                    this.developerConsent_ = DeveloperConsentOuterClass.DeveloperConsent.newBuilder(this.developerConsent_).mergeFrom((DeveloperConsentOuterClass.DeveloperConsent.Builder) developerConsent).buildPartial();
                } else {
                    this.developerConsent_ = developerConsent;
                }
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                LimitedSessionToken limitedSessionToken2 = this.limitedSessionToken_;
                if (limitedSessionToken2 != null && limitedSessionToken2 != LimitedSessionToken.getDefaultInstance()) {
                    this.limitedSessionToken_ = LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom((LimitedSessionToken.Builder) limitedSessionToken).buildPartial();
                } else {
                    this.limitedSessionToken_ = limitedSessionToken;
                }
                this.bitField0_ |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePii(PiiOuterClass.Pii pii) {
                pii.getClass();
                PiiOuterClass.Pii pii2 = this.pii_;
                if (pii2 != null && pii2 != PiiOuterClass.Pii.getDefaultInstance()) {
                    this.pii_ = PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom((PiiOuterClass.Pii.Builder) pii).buildPartial();
                } else {
                    this.pii_ = pii;
                }
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeSdkStartTime(Timestamp timestamp) {
                timestamp.getClass();
                Timestamp timestamp2 = this.sdkStartTime_;
                if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                    this.sdkStartTime_ = Timestamp.newBuilder(this.sdkStartTime_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
                } else {
                    this.sdkStartTime_ = timestamp;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTestData(TestDataOuterClass.TestData testData) {
                testData.getClass();
                TestDataOuterClass.TestData testData2 = this.testData_;
                if (testData2 != null && testData2 != TestDataOuterClass.TestData.getDefaultInstance()) {
                    this.testData_ = TestDataOuterClass.TestData.newBuilder(this.testData_).mergeFrom((TestDataOuterClass.TestData.Builder) testData).buildPartial();
                } else {
                    this.testData_ = testData;
                }
                this.bitField0_ |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
                if (timestamps2 != null && timestamps2 != TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                    this.timestamps_ = TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom((TimestampsOuterClass.Timestamps.Builder) timestamps).buildPartial();
                } else {
                    this.timestamps_ = timestamps;
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SharedData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SharedData> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppStartTime(Timestamp timestamp) {
                timestamp.getClass();
                this.appStartTime_ = timestamp;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentState(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.currentState_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                this.developerConsent_ = developerConsent;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                this.limitedSessionToken_ = limitedSessionToken;
                this.bitField0_ |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPii(PiiOuterClass.Pii pii) {
                pii.getClass();
                this.pii_ = pii;
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSdkStartTime(Timestamp timestamp) {
                timestamp.getClass();
                this.sdkStartTime_ = timestamp;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSessionToken(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.sessionToken_ = byteString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTestData(TestDataOuterClass.TestData testData) {
                testData.getClass();
                this.testData_ = testData;
                this.bitField0_ |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                this.timestamps_ = timestamps;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWebviewVersion(int i) {
                this.bitField0_ |= 8;
                this.webviewVersion_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C33291a.f90835a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SharedData();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ည\u0000\u0002\t\u0003ဉ\u0001\u0004ဉ\u0002\u0005င\u0003\u0006ည\u0004\u0007ဉ\u0005\b\t\t\t\nဉ\u0006", new Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SharedData> parser = PARSER;
                        if (parser == null) {
                            synchronized (SharedData.class) {
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

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public Timestamp getAppStartTime() {
                Timestamp timestamp = this.appStartTime_;
                if (timestamp == null) {
                    return Timestamp.getDefaultInstance();
                }
                return timestamp;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public ByteString getCurrentState() {
                return this.currentState_;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this.developerConsent_;
                if (developerConsent == null) {
                    return DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance();
                }
                return developerConsent;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public LimitedSessionToken getLimitedSessionToken() {
                LimitedSessionToken limitedSessionToken = this.limitedSessionToken_;
                if (limitedSessionToken == null) {
                    return LimitedSessionToken.getDefaultInstance();
                }
                return limitedSessionToken;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this.pii_;
                if (pii == null) {
                    return PiiOuterClass.Pii.getDefaultInstance();
                }
                return pii;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public Timestamp getSdkStartTime() {
                Timestamp timestamp = this.sdkStartTime_;
                if (timestamp == null) {
                    return Timestamp.getDefaultInstance();
                }
                return timestamp;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public ByteString getSessionToken() {
                return this.sessionToken_;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this.testData_;
                if (testData == null) {
                    return TestDataOuterClass.TestData.getDefaultInstance();
                }
                return testData;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
                if (timestamps == null) {
                    return TimestampsOuterClass.Timestamps.getDefaultInstance();
                }
                return timestamps;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public int getWebviewVersion() {
                return this.webviewVersion_;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasAppStartTime() {
                if (this.appStartTime_ != null) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasCurrentState() {
                if ((this.bitField0_ & 16) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasDeveloperConsent() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasLimitedSessionToken() {
                if ((this.bitField0_ & 64) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasPii() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasSdkStartTime() {
                if (this.sdkStartTime_ != null) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasSessionToken() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasTestData() {
                if ((this.bitField0_ & 32) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasTimestamps() {
                if (this.timestamps_ != null) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder
            public boolean hasWebviewVersion() {
                if ((this.bitField0_ & 8) != 0) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(SharedData sharedData) {
                return DEFAULT_INSTANCE.createBuilder(sharedData);
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SharedData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SharedData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SharedData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SharedData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SharedData parseFrom(InputStream inputStream) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SharedData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder */
        /* loaded from: classes9.dex */
        public interface SharedDataOrBuilder extends MessageLiteOrBuilder {
            Timestamp getAppStartTime();

            ByteString getCurrentState();

            DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent();

            LimitedSessionToken getLimitedSessionToken();

            PiiOuterClass.Pii getPii();

            Timestamp getSdkStartTime();

            ByteString getSessionToken();

            TestDataOuterClass.TestData getTestData();

            TimestampsOuterClass.Timestamps getTimestamps();

            int getWebviewVersion();

            boolean hasAppStartTime();

            boolean hasCurrentState();

            boolean hasDeveloperConsent();

            boolean hasLimitedSessionToken();

            boolean hasPii();

            boolean hasSdkStartTime();

            boolean hasSessionToken();

            boolean hasTestData();

            boolean hasTimestamps();

            boolean hasWebviewVersion();
        }

        static {
            UniversalRequest universalRequest = new UniversalRequest();
            DEFAULT_INSTANCE = universalRequest;
            GeneratedMessageLite.registerDefaultInstance(UniversalRequest.class, universalRequest);
        }

        private UniversalRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedData() {
            this.sharedData_ = null;
        }

        public static UniversalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePayload(Payload payload) {
            payload.getClass();
            Payload payload2 = this.payload_;
            if (payload2 != null && payload2 != Payload.getDefaultInstance()) {
                this.payload_ = Payload.newBuilder(this.payload_).mergeFrom((Payload.Builder) payload).buildPartial();
            } else {
                this.payload_ = payload;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSharedData(SharedData sharedData) {
            sharedData.getClass();
            SharedData sharedData2 = this.sharedData_;
            if (sharedData2 != null && sharedData2 != SharedData.getDefaultInstance()) {
                this.sharedData_ = SharedData.newBuilder(this.sharedData_).mergeFrom((SharedData.Builder) sharedData).buildPartial();
            } else {
                this.sharedData_ = sharedData;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UniversalRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedData(SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33291a.f90835a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UniversalRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"sharedData_", "payload_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UniversalRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (UniversalRequest.class) {
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

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public Payload getPayload() {
            Payload payload = this.payload_;
            if (payload == null) {
                return Payload.getDefaultInstance();
            }
            return payload;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public SharedData getSharedData() {
            SharedData sharedData = this.sharedData_;
            if (sharedData == null) {
                return SharedData.getDefaultInstance();
            }
            return sharedData;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public boolean hasPayload() {
            if (this.payload_ != null) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequestOrBuilder
        public boolean hasSharedData() {
            if (this.sharedData_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(UniversalRequest universalRequest) {
            return DEFAULT_INSTANCE.createBuilder(universalRequest);
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UniversalRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UniversalRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(InputStream inputStream) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder */
    /* loaded from: classes9.dex */
    public interface UniversalRequestOrBuilder extends MessageLiteOrBuilder {
        UniversalRequest.Payload getPayload();

        UniversalRequest.SharedData getSharedData();

        boolean hasPayload();

        boolean hasSharedData();
    }

    /* renamed from: gatewayprotocol.v1.UniversalRequestOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33291a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90835a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90835a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90835a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90835a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90835a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90835a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90835a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90835a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private UniversalRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
