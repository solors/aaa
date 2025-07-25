package gatewayprotocol.p687v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.p687v1.ErrorOuterClass;
import gatewayprotocol.p687v1.NativeConfigurationOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass */
/* loaded from: classes9.dex */
public final class InitializationResponseOuterClass {

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$AdFormat */
    /* loaded from: classes9.dex */
    public enum AdFormat implements Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        UNRECOGNIZED(-1);
        
        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdFormat> internalValueMap = new C33264a();
        private final int value;

        /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$AdFormat$a */
        /* loaded from: classes9.dex */
        class C33264a implements Internal.EnumLiteMap<AdFormat> {
            C33264a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public AdFormat findValueByNumber(int i) {
                return AdFormat.forNumber(i);
            }
        }

        /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$AdFormat$b */
        /* loaded from: classes9.dex */
        private static final class C33265b implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f90816a = new C33265b();

            private C33265b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (AdFormat.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        AdFormat(int i) {
            this.value = i;
        }

        public static AdFormat forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return AD_FORMAT_BANNER;
                    }
                    return AD_FORMAT_REWARDED;
                }
                return AD_FORMAT_INTERSTITIAL;
            }
            return AD_FORMAT_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C33265b.f90816a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdFormat valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse */
    /* loaded from: classes9.dex */
    public static final class InitializationResponse extends GeneratedMessageLite<InitializationResponse, Builder> implements InitializationResponseOrBuilder {
        public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
        private static final InitializationResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile Parser<InitializationResponse> PARSER = null;
        public static final int SCAR_ELIGIBLE_FORMATS_FIELD_NUMBER = 7;
        public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
        public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
        public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
        private static final Internal.ListAdapter.Converter<Integer, AdFormat> scarEligibleFormats_converter_ = new C33266a();
        private int bitField0_;
        private int countOfLastShownCampaigns_;
        private ErrorOuterClass.Error error_;
        private NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration_;
        private int scarEligibleFormatsMemoizedSerializedSize;
        private boolean triggerInitializationCompletedRequest_;
        private MapFieldLite<String, Placement> scarPlacements_ = MapFieldLite.emptyMapField();
        private String universalRequestUrl_ = "";
        private Internal.IntList scarEligibleFormats_ = GeneratedMessageLite.emptyIntList();

        /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationResponse, Builder> implements InitializationResponseOrBuilder {
            /* synthetic */ Builder(C33268a c33268a) {
                this();
            }

            public Builder addAllScarEligibleFormats(Iterable<? extends AdFormat> iterable) {
                copyOnWrite();
                ((InitializationResponse) this.instance).addAllScarEligibleFormats(iterable);
                return this;
            }

            public Builder addAllScarEligibleFormatsValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((InitializationResponse) this.instance).addAllScarEligibleFormatsValue(iterable);
                return this;
            }

            public Builder addScarEligibleFormats(AdFormat adFormat) {
                copyOnWrite();
                ((InitializationResponse) this.instance).addScarEligibleFormats(adFormat);
                return this;
            }

            public Builder addScarEligibleFormatsValue(int i) {
                ((InitializationResponse) this.instance).addScarEligibleFormatsValue(i);
                return this;
            }

            public Builder clearCountOfLastShownCampaigns() {
                copyOnWrite();
                ((InitializationResponse) this.instance).clearCountOfLastShownCampaigns();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((InitializationResponse) this.instance).clearError();
                return this;
            }

            public Builder clearNativeConfiguration() {
                copyOnWrite();
                ((InitializationResponse) this.instance).clearNativeConfiguration();
                return this;
            }

            public Builder clearScarEligibleFormats() {
                copyOnWrite();
                ((InitializationResponse) this.instance).clearScarEligibleFormats();
                return this;
            }

            public Builder clearScarPlacements() {
                copyOnWrite();
                ((InitializationResponse) this.instance).getMutableScarPlacementsMap().clear();
                return this;
            }

            public Builder clearTriggerInitializationCompletedRequest() {
                copyOnWrite();
                ((InitializationResponse) this.instance).clearTriggerInitializationCompletedRequest();
                return this;
            }

            public Builder clearUniversalRequestUrl() {
                copyOnWrite();
                ((InitializationResponse) this.instance).clearUniversalRequestUrl();
                return this;
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean containsScarPlacements(String str) {
                str.getClass();
                return ((InitializationResponse) this.instance).getScarPlacementsMap().containsKey(str);
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getCountOfLastShownCampaigns() {
                return ((InitializationResponse) this.instance).getCountOfLastShownCampaigns();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((InitializationResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
                return ((InitializationResponse) this.instance).getNativeConfiguration();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public AdFormat getScarEligibleFormats(int i) {
                return ((InitializationResponse) this.instance).getScarEligibleFormats(i);
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarEligibleFormatsCount() {
                return ((InitializationResponse) this.instance).getScarEligibleFormatsCount();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public List<AdFormat> getScarEligibleFormatsList() {
                return ((InitializationResponse) this.instance).getScarEligibleFormatsList();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarEligibleFormatsValue(int i) {
                return ((InitializationResponse) this.instance).getScarEligibleFormatsValue(i);
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public List<Integer> getScarEligibleFormatsValueList() {
                return Collections.unmodifiableList(((InitializationResponse) this.instance).getScarEligibleFormatsValueList());
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            @Deprecated
            public Map<String, Placement> getScarPlacements() {
                return getScarPlacementsMap();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarPlacementsCount() {
                return ((InitializationResponse) this.instance).getScarPlacementsMap().size();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public Map<String, Placement> getScarPlacementsMap() {
                return Collections.unmodifiableMap(((InitializationResponse) this.instance).getScarPlacementsMap());
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public Placement getScarPlacementsOrDefault(String str, Placement placement) {
                str.getClass();
                Map<String, Placement> scarPlacementsMap = ((InitializationResponse) this.instance).getScarPlacementsMap();
                if (scarPlacementsMap.containsKey(str)) {
                    return scarPlacementsMap.get(str);
                }
                return placement;
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public Placement getScarPlacementsOrThrow(String str) {
                str.getClass();
                Map<String, Placement> scarPlacementsMap = ((InitializationResponse) this.instance).getScarPlacementsMap();
                if (scarPlacementsMap.containsKey(str)) {
                    return scarPlacementsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean getTriggerInitializationCompletedRequest() {
                return ((InitializationResponse) this.instance).getTriggerInitializationCompletedRequest();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public String getUniversalRequestUrl() {
                return ((InitializationResponse) this.instance).getUniversalRequestUrl();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public ByteString getUniversalRequestUrlBytes() {
                return ((InitializationResponse) this.instance).getUniversalRequestUrlBytes();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasError() {
                return ((InitializationResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasNativeConfiguration() {
                return ((InitializationResponse) this.instance).hasNativeConfiguration();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasUniversalRequestUrl() {
                return ((InitializationResponse) this.instance).hasUniversalRequestUrl();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((InitializationResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                ((InitializationResponse) this.instance).mergeNativeConfiguration(nativeConfiguration);
                return this;
            }

            public Builder putAllScarPlacements(Map<String, Placement> map) {
                copyOnWrite();
                ((InitializationResponse) this.instance).getMutableScarPlacementsMap().putAll(map);
                return this;
            }

            public Builder putScarPlacements(String str, Placement placement) {
                str.getClass();
                placement.getClass();
                copyOnWrite();
                ((InitializationResponse) this.instance).getMutableScarPlacementsMap().put(str, placement);
                return this;
            }

            public Builder removeScarPlacements(String str) {
                str.getClass();
                copyOnWrite();
                ((InitializationResponse) this.instance).getMutableScarPlacementsMap().remove(str);
                return this;
            }

            public Builder setCountOfLastShownCampaigns(int i) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setCountOfLastShownCampaigns(i);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setError(error);
                return this;
            }

            public Builder setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setNativeConfiguration(nativeConfiguration);
                return this;
            }

            public Builder setScarEligibleFormats(int i, AdFormat adFormat) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setScarEligibleFormats(i, adFormat);
                return this;
            }

            public Builder setScarEligibleFormatsValue(int i, int i2) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setScarEligibleFormatsValue(i, i2);
                return this;
            }

            public Builder setTriggerInitializationCompletedRequest(boolean z) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setTriggerInitializationCompletedRequest(z);
                return this;
            }

            public Builder setUniversalRequestUrl(String str) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setUniversalRequestUrl(str);
                return this;
            }

            public Builder setUniversalRequestUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setUniversalRequestUrlBytes(byteString);
                return this;
            }

            private Builder() {
                super(InitializationResponse.DEFAULT_INSTANCE);
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                copyOnWrite();
                ((InitializationResponse) this.instance).setNativeConfiguration(builder.build());
                return this;
            }
        }

        /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse$a */
        /* loaded from: classes9.dex */
        class C33266a implements Internal.ListAdapter.Converter<Integer, AdFormat> {
            C33266a() {
            }

            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            /* renamed from: a */
            public AdFormat convert(Integer num) {
                AdFormat forNumber = AdFormat.forNumber(num.intValue());
                if (forNumber == null) {
                    return AdFormat.UNRECOGNIZED;
                }
                return forNumber;
            }
        }

        /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse$b */
        /* loaded from: classes9.dex */
        private static final class C33267b {

            /* renamed from: a */
            static final MapEntryLite<String, Placement> f90817a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Placement.getDefaultInstance());
        }

        static {
            InitializationResponse initializationResponse = new InitializationResponse();
            DEFAULT_INSTANCE = initializationResponse;
            GeneratedMessageLite.registerDefaultInstance(InitializationResponse.class, initializationResponse);
        }

        private InitializationResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScarEligibleFormats(Iterable<? extends AdFormat> iterable) {
            ensureScarEligibleFormatsIsMutable();
            for (AdFormat adFormat : iterable) {
                this.scarEligibleFormats_.addInt(adFormat.getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScarEligibleFormatsValue(Iterable<Integer> iterable) {
            ensureScarEligibleFormatsIsMutable();
            for (Integer num : iterable) {
                this.scarEligibleFormats_.addInt(num.intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScarEligibleFormats(AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(adFormat.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScarEligibleFormatsValue(int i) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountOfLastShownCampaigns() {
            this.countOfLastShownCampaigns_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNativeConfiguration() {
            this.nativeConfiguration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarEligibleFormats() {
            this.scarEligibleFormats_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerInitializationCompletedRequest() {
            this.triggerInitializationCompletedRequest_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUniversalRequestUrl() {
            this.bitField0_ &= -2;
            this.universalRequestUrl_ = getDefaultInstance().getUniversalRequestUrl();
        }

        private void ensureScarEligibleFormatsIsMutable() {
            Internal.IntList intList = this.scarEligibleFormats_;
            if (!intList.isModifiable()) {
                this.scarEligibleFormats_ = GeneratedMessageLite.mutableCopy(intList);
            }
        }

        public static InitializationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Placement> getMutableScarPlacementsMap() {
            return internalGetMutableScarPlacements();
        }

        private MapFieldLite<String, Placement> internalGetMutableScarPlacements() {
            if (!this.scarPlacements_.isMutable()) {
                this.scarPlacements_ = this.scarPlacements_.mutableCopy();
            }
            return this.scarPlacements_;
        }

        private MapFieldLite<String, Placement> internalGetScarPlacements() {
            return this.scarPlacements_;
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
        public void mergeNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration2 = this.nativeConfiguration_;
            if (nativeConfiguration2 != null && nativeConfiguration2 != NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance()) {
                this.nativeConfiguration_ = NativeConfigurationOuterClass.NativeConfiguration.newBuilder(this.nativeConfiguration_).mergeFrom((NativeConfigurationOuterClass.NativeConfiguration.Builder) nativeConfiguration).buildPartial();
            } else {
                this.nativeConfiguration_ = nativeConfiguration;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InitializationResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountOfLastShownCampaigns(int i) {
            this.countOfLastShownCampaigns_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            this.nativeConfiguration_ = nativeConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarEligibleFormats(int i, AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, adFormat.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarEligibleFormatsValue(int i, int i2) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerInitializationCompletedRequest(boolean z) {
            this.triggerInitializationCompletedRequest_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniversalRequestUrl(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.universalRequestUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniversalRequestUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.universalRequestUrl_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean containsScarPlacements(String str) {
            str.getClass();
            return internalGetScarPlacements().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33268a.f90818a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001\t\u0002ለ\u0000\u0003ဉ\u0001\u0004\u0007\u0005\u0004\u00062\u0007,", new Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", C33267b.f90817a, "scarEligibleFormats_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (InitializationResponse.class) {
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

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getCountOfLastShownCampaigns() {
            return this.countOfLastShownCampaigns_;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this.nativeConfiguration_;
            if (nativeConfiguration == null) {
                return NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance();
            }
            return nativeConfiguration;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public AdFormat getScarEligibleFormats(int i) {
            AdFormat forNumber = AdFormat.forNumber(this.scarEligibleFormats_.getInt(i));
            if (forNumber == null) {
                return AdFormat.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarEligibleFormatsCount() {
            return this.scarEligibleFormats_.size();
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public List<AdFormat> getScarEligibleFormatsList() {
            return new Internal.ListAdapter(this.scarEligibleFormats_, scarEligibleFormats_converter_);
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarEligibleFormatsValue(int i) {
            return this.scarEligibleFormats_.getInt(i);
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public List<Integer> getScarEligibleFormatsValueList() {
            return this.scarEligibleFormats_;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        @Deprecated
        public Map<String, Placement> getScarPlacements() {
            return getScarPlacementsMap();
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarPlacementsCount() {
            return internalGetScarPlacements().size();
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public Map<String, Placement> getScarPlacementsMap() {
            return Collections.unmodifiableMap(internalGetScarPlacements());
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public Placement getScarPlacementsOrDefault(String str, Placement placement) {
            str.getClass();
            MapFieldLite<String, Placement> internalGetScarPlacements = internalGetScarPlacements();
            if (internalGetScarPlacements.containsKey(str)) {
                return internalGetScarPlacements.get(str);
            }
            return placement;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public Placement getScarPlacementsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Placement> internalGetScarPlacements = internalGetScarPlacements();
            if (internalGetScarPlacements.containsKey(str)) {
                return internalGetScarPlacements.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean getTriggerInitializationCompletedRequest() {
            return this.triggerInitializationCompletedRequest_;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public String getUniversalRequestUrl() {
            return this.universalRequestUrl_;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public ByteString getUniversalRequestUrlBytes() {
            return ByteString.copyFromUtf8(this.universalRequestUrl_);
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasNativeConfiguration() {
            if (this.nativeConfiguration_ != null) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasUniversalRequestUrl() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(InitializationResponse initializationResponse) {
            return DEFAULT_INSTANCE.createBuilder(initializationResponse);
        }

        public static InitializationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(InputStream inputStream) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder */
    /* loaded from: classes9.dex */
    public interface InitializationResponseOrBuilder extends MessageLiteOrBuilder {
        boolean containsScarPlacements(String str);

        int getCountOfLastShownCampaigns();

        ErrorOuterClass.Error getError();

        NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

        AdFormat getScarEligibleFormats(int i);

        int getScarEligibleFormatsCount();

        List<AdFormat> getScarEligibleFormatsList();

        int getScarEligibleFormatsValue(int i);

        List<Integer> getScarEligibleFormatsValueList();

        @Deprecated
        Map<String, Placement> getScarPlacements();

        int getScarPlacementsCount();

        Map<String, Placement> getScarPlacementsMap();

        Placement getScarPlacementsOrDefault(String str, Placement placement);

        Placement getScarPlacementsOrThrow(String str);

        boolean getTriggerInitializationCompletedRequest();

        String getUniversalRequestUrl();

        ByteString getUniversalRequestUrlBytes();

        boolean hasError();

        boolean hasNativeConfiguration();

        boolean hasUniversalRequestUrl();
    }

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$Placement */
    /* loaded from: classes9.dex */
    public static final class Placement extends GeneratedMessageLite<Placement, Builder> implements PlacementOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        private static final Placement DEFAULT_INSTANCE;
        private static volatile Parser<Placement> PARSER;
        private int adFormat_;

        /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$Placement$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Placement, Builder> implements PlacementOrBuilder {
            /* synthetic */ Builder(C33268a c33268a) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((Placement) this.instance).clearAdFormat();
                return this;
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.PlacementOrBuilder
            public AdFormat getAdFormat() {
                return ((Placement) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.PlacementOrBuilder
            public int getAdFormatValue() {
                return ((Placement) this.instance).getAdFormatValue();
            }

            public Builder setAdFormat(AdFormat adFormat) {
                copyOnWrite();
                ((Placement) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((Placement) this.instance).setAdFormatValue(i);
                return this;
            }

            private Builder() {
                super(Placement.DEFAULT_INSTANCE);
            }
        }

        static {
            Placement placement = new Placement();
            DEFAULT_INSTANCE = placement;
            GeneratedMessageLite.registerDefaultInstance(Placement.class, placement);
        }

        private Placement() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.adFormat_ = 0;
        }

        public static Placement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Placement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Placement> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.adFormat_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33268a.f90818a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Placement();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Placement> parser = PARSER;
                    if (parser == null) {
                        synchronized (Placement.class) {
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

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.PlacementOrBuilder
        public AdFormat getAdFormat() {
            AdFormat forNumber = AdFormat.forNumber(this.adFormat_);
            if (forNumber == null) {
                return AdFormat.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.InitializationResponseOuterClass.PlacementOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        public static Builder newBuilder(Placement placement) {
            return DEFAULT_INSTANCE.createBuilder(placement);
        }

        public static Placement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Placement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Placement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Placement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Placement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Placement parseFrom(InputStream inputStream) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Placement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Placement parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Placement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$PlacementOrBuilder */
    /* loaded from: classes9.dex */
    public interface PlacementOrBuilder extends MessageLiteOrBuilder {
        AdFormat getAdFormat();

        int getAdFormatValue();
    }

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33268a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90818a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90818a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90818a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90818a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90818a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90818a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90818a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90818a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private InitializationResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
