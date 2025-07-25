package gatewayprotocol.p687v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.p687v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.p687v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.p687v1.AdResponseOuterClass;
import gatewayprotocol.p687v1.ErrorOuterClass;
import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import gatewayprotocol.p687v1.MutableDataOuterClass;
import gatewayprotocol.p687v1.PrivacyUpdateResponseOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass */
/* loaded from: classes9.dex */
public final class UniversalResponseOuterClass {

    /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse */
    /* loaded from: classes9.dex */
    public static final class UniversalResponse extends GeneratedMessageLite<UniversalResponse, Builder> implements UniversalResponseOrBuilder {
        private static final UniversalResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
        private static volatile Parser<UniversalResponse> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private MutableDataOuterClass.MutableData mutableData_;
        private Payload payload_;

        /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<UniversalResponse, Builder> implements UniversalResponseOrBuilder {
            /* synthetic */ Builder(C33292a c33292a) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((UniversalResponse) this.instance).clearError();
                return this;
            }

            public Builder clearMutableData() {
                copyOnWrite();
                ((UniversalResponse) this.instance).clearMutableData();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((UniversalResponse) this.instance).clearPayload();
                return this;
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((UniversalResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public MutableDataOuterClass.MutableData getMutableData() {
                return ((UniversalResponse) this.instance).getMutableData();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public Payload getPayload() {
                return ((UniversalResponse) this.instance).getPayload();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasError() {
                return ((UniversalResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasMutableData() {
                return ((UniversalResponse) this.instance).hasMutableData();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasPayload() {
                return ((UniversalResponse) this.instance).hasPayload();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((UniversalResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                ((UniversalResponse) this.instance).mergeMutableData(mutableData);
                return this;
            }

            public Builder mergePayload(Payload payload) {
                copyOnWrite();
                ((UniversalResponse) this.instance).mergePayload(payload);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setError(error);
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setMutableData(mutableData);
                return this;
            }

            public Builder setPayload(Payload payload) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setPayload(payload);
                return this;
            }

            private Builder() {
                super(UniversalResponse.DEFAULT_INSTANCE);
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData.Builder builder) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setMutableData(builder.build());
                return this;
            }

            public Builder setPayload(Payload.Builder builder) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setPayload(builder.build());
                return this;
            }
        }

        /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload */
        /* loaded from: classes9.dex */
        public static final class Payload extends GeneratedMessageLite<Payload, Builder> implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
            public static final int AD_RESPONSE_FIELD_NUMBER = 2;
            private static final Payload DEFAULT_INSTANCE;
            public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
            private static volatile Parser<Payload> PARSER = null;
            public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
            private int valueCase_ = 0;
            private Object value_;

            /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload$Builder */
            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Payload, Builder> implements PayloadOrBuilder {
                /* synthetic */ Builder(C33292a c33292a) {
                    this();
                }

                public Builder clearAdDataRefreshResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdDataRefreshResponse();
                    return this;
                }

                public Builder clearAdPlayerConfigResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdPlayerConfigResponse();
                    return this;
                }

                public Builder clearAdResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdResponse();
                    return this;
                }

                public Builder clearInitializationResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearInitializationResponse();
                    return this;
                }

                public Builder clearPrivacyUpdateResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearPrivacyUpdateResponse();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Payload) this.instance).clearValue();
                    return this;
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                    return ((Payload) this.instance).getAdDataRefreshResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                    return ((Payload) this.instance).getAdPlayerConfigResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AdResponseOuterClass.AdResponse getAdResponse() {
                    return ((Payload) this.instance).getAdResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                    return ((Payload) this.instance).getInitializationResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                    return ((Payload) this.instance).getPrivacyUpdateResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public ValueCase getValueCase() {
                    return ((Payload) this.instance).getValueCase();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdDataRefreshResponse() {
                    return ((Payload) this.instance).hasAdDataRefreshResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdPlayerConfigResponse() {
                    return ((Payload) this.instance).hasAdPlayerConfigResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdResponse() {
                    return ((Payload) this.instance).hasAdResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasInitializationResponse() {
                    return ((Payload) this.instance).hasInitializationResponse();
                }

                @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasPrivacyUpdateResponse() {
                    return ((Payload) this.instance).hasPrivacyUpdateResponse();
                }

                public Builder mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public Builder mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public Builder mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdResponse(adResponse);
                    return this;
                }

                public Builder mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeInitializationResponse(initializationResponse);
                    return this;
                }

                public Builder mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergePrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdResponse(adResponse);
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationResponse(initializationResponse);
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setPrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                private Builder() {
                    super(Payload.DEFAULT_INSTANCE);
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdDataRefreshResponse(builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdPlayerConfigResponse(builder.build());
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdResponse(builder.build());
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationResponse(builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setPrivacyUpdateResponse(builder.build());
                    return this;
                }
            }

            /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase */
            /* loaded from: classes9.dex */
            public enum ValueCase {
                INITIALIZATION_RESPONSE(1),
                AD_RESPONSE(2),
                AD_PLAYER_CONFIG_RESPONSE(3),
                AD_DATA_REFRESH_RESPONSE(4),
                PRIVACY_UPDATE_RESPONSE(5),
                VALUE_NOT_SET(0);
                
                private final int value;

                ValueCase(int i) {
                    this.value = i;
                }

                public static ValueCase forNumber(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            return null;
                                        }
                                        return PRIVACY_UPDATE_RESPONSE;
                                    }
                                    return AD_DATA_REFRESH_RESPONSE;
                                }
                                return AD_PLAYER_CONFIG_RESPONSE;
                            }
                            return AD_RESPONSE;
                        }
                        return INITIALIZATION_RESPONSE;
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
            public void clearAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdResponse() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationResponse() {
                if (this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
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
            public void mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                if (this.valueCase_ == 4 && this.value_ != AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance()) {
                    this.value_ = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder((AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_).mergeFrom((AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder) adDataRefreshResponse).buildPartial();
                } else {
                    this.value_ = adDataRefreshResponse;
                }
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                if (this.valueCase_ == 3 && this.value_ != AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance()) {
                    this.value_ = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_).mergeFrom((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder) adPlayerConfigResponse).buildPartial();
                } else {
                    this.value_ = adPlayerConfigResponse;
                }
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                if (this.valueCase_ == 2 && this.value_ != AdResponseOuterClass.AdResponse.getDefaultInstance()) {
                    this.value_ = AdResponseOuterClass.AdResponse.newBuilder((AdResponseOuterClass.AdResponse) this.value_).mergeFrom((AdResponseOuterClass.AdResponse.Builder) adResponse).buildPartial();
                } else {
                    this.value_ = adResponse;
                }
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                if (this.valueCase_ == 1 && this.value_ != InitializationResponseOuterClass.InitializationResponse.getDefaultInstance()) {
                    this.value_ = InitializationResponseOuterClass.InitializationResponse.newBuilder((InitializationResponseOuterClass.InitializationResponse) this.value_).mergeFrom((InitializationResponseOuterClass.InitializationResponse.Builder) initializationResponse).buildPartial();
                } else {
                    this.value_ = initializationResponse;
                }
                this.valueCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                if (this.valueCase_ == 5 && this.value_ != PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance()) {
                    this.value_ = PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_).mergeFrom((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder) privacyUpdateResponse).buildPartial();
                } else {
                    this.value_ = privacyUpdateResponse;
                }
                this.valueCase_ = 5;
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
            public void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this.value_ = adDataRefreshResponse;
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this.value_ = adPlayerConfigResponse;
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this.value_ = adResponse;
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this.value_ = initializationResponse;
                this.valueCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this.value_ = privacyUpdateResponse;
                this.valueCase_ = 5;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C33292a.f90836a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Payload();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", InitializationResponseOuterClass.InitializationResponse.class, AdResponseOuterClass.AdResponse.class, AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.class, AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class, PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.class});
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

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    return (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_;
                }
                return AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    return (AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_;
                }
                return AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AdResponseOuterClass.AdResponse getAdResponse() {
                if (this.valueCase_ == 2) {
                    return (AdResponseOuterClass.AdResponse) this.value_;
                }
                return AdResponseOuterClass.AdResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                if (this.valueCase_ == 1) {
                    return (InitializationResponseOuterClass.InitializationResponse) this.value_;
                }
                return InitializationResponseOuterClass.InitializationResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
                    return (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_;
                }
                return PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdResponse() {
                if (this.valueCase_ == 2) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasInitializationResponse() {
                if (this.valueCase_ == 1) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
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

        /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder */
        /* loaded from: classes9.dex */
        public interface PayloadOrBuilder extends MessageLiteOrBuilder {
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse();

            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse();

            AdResponseOuterClass.AdResponse getAdResponse();

            InitializationResponseOuterClass.InitializationResponse getInitializationResponse();

            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse();

            Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshResponse();

            boolean hasAdPlayerConfigResponse();

            boolean hasAdResponse();

            boolean hasInitializationResponse();

            boolean hasPrivacyUpdateResponse();
        }

        static {
            UniversalResponse universalResponse = new UniversalResponse();
            DEFAULT_INSTANCE = universalResponse;
            GeneratedMessageLite.registerDefaultInstance(UniversalResponse.class, universalResponse);
        }

        private UniversalResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMutableData() {
            this.mutableData_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = null;
        }

        public static UniversalResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            MutableDataOuterClass.MutableData mutableData2 = this.mutableData_;
            if (mutableData2 != null && mutableData2 != MutableDataOuterClass.MutableData.getDefaultInstance()) {
                this.mutableData_ = MutableDataOuterClass.MutableData.newBuilder(this.mutableData_).mergeFrom((MutableDataOuterClass.MutableData.Builder) mutableData).buildPartial();
            } else {
                this.mutableData_ = mutableData;
            }
            this.bitField0_ |= 1;
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

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UniversalResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            this.mutableData_ = mutableData;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33292a.f90836a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UniversalResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UniversalResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (UniversalResponse.class) {
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

        @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData = this.mutableData_;
            if (mutableData == null) {
                return MutableDataOuterClass.MutableData.getDefaultInstance();
            }
            return mutableData;
        }

        @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public Payload getPayload() {
            Payload payload = this.payload_;
            if (payload == null) {
                return Payload.getDefaultInstance();
            }
            return payload;
        }

        @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasMutableData() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasPayload() {
            if (this.payload_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(UniversalResponse universalResponse) {
            return DEFAULT_INSTANCE.createBuilder(universalResponse);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UniversalResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UniversalResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder */
    /* loaded from: classes9.dex */
    public interface UniversalResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorOuterClass.Error getError();

        MutableDataOuterClass.MutableData getMutableData();

        UniversalResponse.Payload getPayload();

        boolean hasError();

        boolean hasMutableData();

        boolean hasPayload();
    }

    /* renamed from: gatewayprotocol.v1.UniversalResponseOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33292a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90836a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90836a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90836a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90836a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90836a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90836a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90836a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90836a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private UniversalResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
