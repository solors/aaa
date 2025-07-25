package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.DoubleValueOrBuilder;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolMessageEnum;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt32ValueOrBuilder;
import com.explorestack.protobuf.UInt64Value;
import com.explorestack.protobuf.UInt64ValueOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import io.bidmachine.protobuf.AdExtension;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Waterfall extends GeneratedMessageV3 implements WaterfallOrBuilder {
    private static final Waterfall DEFAULT_INSTANCE = new Waterfall();
    private static final Parser<Waterfall> PARSER = new AbstractParser<Waterfall>() { // from class: io.bidmachine.protobuf.Waterfall.1
        @Override // com.explorestack.protobuf.Parser
        public Waterfall parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Waterfall(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;

    /* renamed from: io.bidmachine.protobuf.Waterfall$2 */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class C368412 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class Configuration extends GeneratedMessageV3 implements ConfigurationOrBuilder {
        public static final int AD_UNITS_FIELD_NUMBER = 8;
        public static final int CACHE_SIZE_FIELD_NUMBER = 7;
        public static final int FORMAT_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MAX_RETRY_DEGREE_FIELD_NUMBER = 6;
        public static final int REFRESH_TIMEOUT_FIELD_NUMBER = 3;
        public static final int REFRESH_URL_FIELD_NUMBER = 4;
        public static final int RETRY_BASE_FIELD_NUMBER = 5;
        public static final int SERVER_PARAMS_FIELD_NUMBER = 10;
        public static final int SHOULD_BREAK_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private List<AdUnit> adUnits_;
        private UInt32Value cacheSize_;
        private volatile Object format_;
        private volatile Object id_;
        private UInt32Value maxRetryDegree_;
        private byte memoizedIsInitialized;
        private UInt64Value refreshTimeout_;
        private StringValue refreshUrl_;
        private UInt32Value retryBase_;
        private StringValue serverParams_;
        private boolean shouldBreak_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final Parser<Configuration> PARSER = new AbstractParser<Configuration>() { // from class: io.bidmachine.protobuf.Waterfall.Configuration.1
            @Override // com.explorestack.protobuf.Parser
            public Configuration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Configuration(codedInputStream, extensionRegistryLite);
            }
        };

        /* loaded from: classes9.dex */
        public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
            public static final int AD_UNIT_ID_FIELD_NUMBER = 3;
            public static final int CUSTOM_TARGETING_FIELD_NUMBER = 6;
            public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
            public static final int OVERRIDE_CALLBACKS_FIELD_NUMBER = 1;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int REQUEST_AGENT_FIELD_NUMBER = 4;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 9;
            public static final int SLEEP_TIME_AFTER_FIELD_NUMBER = 8;
            public static final int SLEEP_TIME_BEFORE_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private volatile Object adUnitId_;
            private MapField<String, String> customTargeting_;
            private int expirationTime_;
            private byte memoizedIsInitialized;
            private boolean overrideCallbacks_;
            private double price_;
            private volatile Object requestAgent_;
            private StringValue serverParams_;
            private UInt32Value sleepTimeAfter_;
            private UInt32Value sleepTimeBefore_;
            private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
            private static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() { // from class: io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.1
                @Override // com.explorestack.protobuf.Parser
                public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new AdUnit(codedInputStream, extensionRegistryLite);
                }
            };

            /* loaded from: classes9.dex */
            public static final class CustomTargetingDefaultEntryHolder {
                static final MapEntry<String, String> defaultEntry;

                static {
                    Descriptors.Descriptor descriptor = WaterfallProto.f97428xe39c9d88;
                    WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                    defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
                }

                private CustomTargetingDefaultEntryHolder() {
                }
            }

            public static AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.f97430x23097003;
            }

            public MapField<String, String> internalGetCustomTargeting() {
                MapField<String, String> mapField = this.customTargeting_;
                if (mapField == null) {
                    return MapField.emptyMapField(CustomTargetingDefaultEntryHolder.defaultEntry);
                }
                return mapField;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<AdUnit> parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean containsCustomTargeting(String str) {
                str.getClass();
                return internalGetCustomTargeting().getMap().containsKey(str);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdUnit)) {
                    return super.equals(obj);
                }
                AdUnit adUnit = (AdUnit) obj;
                if (getOverrideCallbacks() != adUnit.getOverrideCallbacks() || getExpirationTime() != adUnit.getExpirationTime() || !getAdUnitId().equals(adUnit.getAdUnitId()) || !getRequestAgent().equals(adUnit.getRequestAgent()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(adUnit.getPrice()) || !internalGetCustomTargeting().equals(adUnit.internalGetCustomTargeting()) || hasSleepTimeBefore() != adUnit.hasSleepTimeBefore()) {
                    return false;
                }
                if ((hasSleepTimeBefore() && !getSleepTimeBefore().equals(adUnit.getSleepTimeBefore())) || hasSleepTimeAfter() != adUnit.hasSleepTimeAfter()) {
                    return false;
                }
                if ((hasSleepTimeAfter() && !getSleepTimeAfter().equals(adUnit.getSleepTimeAfter())) || hasServerParams() != adUnit.hasServerParams()) {
                    return false;
                }
                if ((!hasServerParams() || getServerParams().equals(adUnit.getServerParams())) && this.unknownFields.equals(adUnit.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomTargeting() {
                return getCustomTargetingMap();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public int getCustomTargetingCount() {
                return internalGetCustomTargeting().getMap().size();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public Map<String, String> getCustomTargetingMap() {
                return internalGetCustomTargeting().getMap();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getCustomTargetingOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> map = internalGetCustomTargeting().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                return str2;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getCustomTargetingOrThrow(String str) {
                str.getClass();
                Map<String, String> map = internalGetCustomTargeting().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public int getExpirationTime() {
                return this.expirationTime_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean getOverrideCallbacks() {
                return this.overrideCallbacks_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<AdUnit> getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getRequestAgent() {
                Object obj = this.requestAgent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.requestAgent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ByteString getRequestAgentBytes() {
                Object obj = this.requestAgent_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.requestAgent_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                boolean z = this.overrideCallbacks_;
                int i2 = 0;
                if (z) {
                    i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
                }
                int i3 = this.expirationTime_;
                if (i3 != 0) {
                    i2 += CodedOutputStream.computeUInt32Size(2, i3);
                }
                if (!getAdUnitIdBytes().isEmpty()) {
                    i2 += GeneratedMessageV3.computeStringSize(3, this.adUnitId_);
                }
                if (!getRequestAgentBytes().isEmpty()) {
                    i2 += GeneratedMessageV3.computeStringSize(4, this.requestAgent_);
                }
                double d = this.price_;
                if (d != 0.0d) {
                    i2 += CodedOutputStream.computeDoubleSize(5, d);
                }
                for (Map.Entry<String, String> entry : internalGetCustomTargeting().getMap().entrySet()) {
                    i2 += CodedOutputStream.computeMessageSize(6, CustomTargetingDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
                }
                if (this.sleepTimeBefore_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(7, getSleepTimeBefore());
                }
                if (this.sleepTimeAfter_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(8, getSleepTimeAfter());
                }
                if (this.serverParams_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(9, getServerParams());
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public StringValueOrBuilder getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32Value getSleepTimeAfter() {
                UInt32Value uInt32Value = this.sleepTimeAfter_;
                if (uInt32Value == null) {
                    return UInt32Value.getDefaultInstance();
                }
                return uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32ValueOrBuilder getSleepTimeAfterOrBuilder() {
                return getSleepTimeAfter();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32Value getSleepTimeBefore() {
                UInt32Value uInt32Value = this.sleepTimeBefore_;
                if (uInt32Value == null) {
                    return UInt32Value.getDefaultInstance();
                }
                return uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32ValueOrBuilder getSleepTimeBeforeOrBuilder() {
                return getSleepTimeBefore();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasServerParams() {
                if (this.serverParams_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasSleepTimeAfter() {
                if (this.sleepTimeAfter_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasSleepTimeBefore() {
                if (this.sleepTimeBefore_ != null) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getOverrideCallbacks())) * 37) + 2) * 53) + getExpirationTime()) * 37) + 3) * 53) + getAdUnitId().hashCode()) * 37) + 4) * 53) + getRequestAgent().hashCode()) * 37) + 5) * 53) + Internal.hashLong(Double.doubleToLongBits(getPrice()));
                if (!internalGetCustomTargeting().getMap().isEmpty()) {
                    hashCode = (((hashCode * 37) + 6) * 53) + internalGetCustomTargeting().hashCode();
                }
                if (hasSleepTimeBefore()) {
                    hashCode = (((hashCode * 37) + 7) * 53) + getSleepTimeBefore().hashCode();
                }
                if (hasSleepTimeAfter()) {
                    hashCode = (((hashCode * 37) + 8) * 53) + getSleepTimeAfter().hashCode();
                }
                if (hasServerParams()) {
                    hashCode = (((hashCode * 37) + 9) * 53) + getServerParams().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97431xdad5e381.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected MapField internalGetMapField(int i) {
                if (i == 6) {
                    return internalGetCustomTargeting();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new AdUnit();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                boolean z = this.overrideCallbacks_;
                if (z) {
                    codedOutputStream.writeBool(1, z);
                }
                int i = this.expirationTime_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(2, i);
                }
                if (!getAdUnitIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.adUnitId_);
                }
                if (!getRequestAgentBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.requestAgent_);
                }
                double d = this.price_;
                if (d != 0.0d) {
                    codedOutputStream.writeDouble(5, d);
                }
                GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomTargeting(), CustomTargetingDefaultEntryHolder.defaultEntry, 6);
                if (this.sleepTimeBefore_ != null) {
                    codedOutputStream.writeMessage(7, getSleepTimeBefore());
                }
                if (this.sleepTimeAfter_ != null) {
                    codedOutputStream.writeMessage(8, getSleepTimeAfter());
                }
                if (this.serverParams_ != null) {
                    codedOutputStream.writeMessage(9, getServerParams());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
                private Object adUnitId_;
                private int bitField0_;
                private MapField<String, String> customTargeting_;
                private int expirationTime_;
                private boolean overrideCallbacks_;
                private double price_;
                private Object requestAgent_;
                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> serverParamsBuilder_;
                private StringValue serverParams_;
                private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> sleepTimeAfterBuilder_;
                private UInt32Value sleepTimeAfter_;
                private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> sleepTimeBeforeBuilder_;
                private UInt32Value sleepTimeBefore_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.f97430x23097003;
                }

                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new SingleFieldBuilderV3<>(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getSleepTimeAfterFieldBuilder() {
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfterBuilder_ = new SingleFieldBuilderV3<>(getSleepTimeAfter(), getParentForChildren(), isClean());
                        this.sleepTimeAfter_ = null;
                    }
                    return this.sleepTimeAfterBuilder_;
                }

                private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getSleepTimeBeforeFieldBuilder() {
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBeforeBuilder_ = new SingleFieldBuilderV3<>(getSleepTimeBefore(), getParentForChildren(), isClean());
                        this.sleepTimeBefore_ = null;
                    }
                    return this.sleepTimeBeforeBuilder_;
                }

                private MapField<String, String> internalGetCustomTargeting() {
                    MapField<String, String> mapField = this.customTargeting_;
                    if (mapField == null) {
                        return MapField.emptyMapField(CustomTargetingDefaultEntryHolder.defaultEntry);
                    }
                    return mapField;
                }

                private MapField<String, String> internalGetMutableCustomTargeting() {
                    onChanged();
                    if (this.customTargeting_ == null) {
                        this.customTargeting_ = MapField.newMapField(CustomTargetingDefaultEntryHolder.defaultEntry);
                    }
                    if (!this.customTargeting_.isMutable()) {
                        this.customTargeting_ = this.customTargeting_.copy();
                    }
                    return this.customTargeting_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = AdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearCustomTargeting() {
                    internalGetMutableCustomTargeting().getMutableMap().clear();
                    return this;
                }

                public Builder clearExpirationTime() {
                    this.expirationTime_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearOverrideCallbacks() {
                    this.overrideCallbacks_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearRequestAgent() {
                    this.requestAgent_ = AdUnit.getDefaultInstance().getRequestAgent();
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                    } else {
                        this.serverParams_ = null;
                        this.serverParamsBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearSleepTimeAfter() {
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfter_ = null;
                        onChanged();
                    } else {
                        this.sleepTimeAfter_ = null;
                        this.sleepTimeAfterBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearSleepTimeBefore() {
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBefore_ = null;
                        onChanged();
                    } else {
                        this.sleepTimeBefore_ = null;
                        this.sleepTimeBeforeBuilder_ = null;
                    }
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean containsCustomTargeting(String str) {
                    str.getClass();
                    return internalGetCustomTargeting().getMap().containsKey(str);
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adUnitId_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adUnitId_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                @Deprecated
                public Map<String, String> getCustomTargeting() {
                    return getCustomTargetingMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public int getCustomTargetingCount() {
                    return internalGetCustomTargeting().getMap().size();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public Map<String, String> getCustomTargetingMap() {
                    return internalGetCustomTargeting().getMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getCustomTargetingOrDefault(String str, String str2) {
                    str.getClass();
                    Map<String, String> map = internalGetCustomTargeting().getMap();
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                    return str2;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getCustomTargetingOrThrow(String str) {
                    str.getClass();
                    Map<String, String> map = internalGetCustomTargeting().getMap();
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                    throw new IllegalArgumentException();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.f97430x23097003;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public int getExpirationTime() {
                    return this.expirationTime_;
                }

                @Deprecated
                public Map<String, String> getMutableCustomTargeting() {
                    return internalGetMutableCustomTargeting().getMutableMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean getOverrideCallbacks() {
                    return this.overrideCallbacks_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getRequestAgent() {
                    Object obj = this.requestAgent_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.requestAgent_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ByteString getRequestAgentBytes() {
                    Object obj = this.requestAgent_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.requestAgent_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public StringValue getServerParams() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue = this.serverParams_;
                        if (stringValue == null) {
                            return StringValue.getDefaultInstance();
                        }
                        return stringValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return getServerParamsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public StringValueOrBuilder getServerParamsOrBuilder() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.serverParams_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32Value getSleepTimeAfter() {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeAfterBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        UInt32Value uInt32Value = this.sleepTimeAfter_;
                        if (uInt32Value == null) {
                            return UInt32Value.getDefaultInstance();
                        }
                        return uInt32Value;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public UInt32Value.Builder getSleepTimeAfterBuilder() {
                    onChanged();
                    return getSleepTimeAfterFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32ValueOrBuilder getSleepTimeAfterOrBuilder() {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeAfterBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    UInt32Value uInt32Value = this.sleepTimeAfter_;
                    if (uInt32Value == null) {
                        return UInt32Value.getDefaultInstance();
                    }
                    return uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32Value getSleepTimeBefore() {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeBeforeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        UInt32Value uInt32Value = this.sleepTimeBefore_;
                        if (uInt32Value == null) {
                            return UInt32Value.getDefaultInstance();
                        }
                        return uInt32Value;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public UInt32Value.Builder getSleepTimeBeforeBuilder() {
                    onChanged();
                    return getSleepTimeBeforeFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32ValueOrBuilder getSleepTimeBeforeOrBuilder() {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeBeforeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    UInt32Value uInt32Value = this.sleepTimeBefore_;
                    if (uInt32Value == null) {
                        return UInt32Value.getDefaultInstance();
                    }
                    return uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasServerParams() {
                    if (this.serverParamsBuilder_ == null && this.serverParams_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasSleepTimeAfter() {
                    if (this.sleepTimeAfterBuilder_ == null && this.sleepTimeAfter_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasSleepTimeBefore() {
                    if (this.sleepTimeBeforeBuilder_ == null && this.sleepTimeBefore_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WaterfallProto.f97431xdad5e381.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected MapField internalGetMapField(int i) {
                    if (i == 6) {
                        return internalGetCustomTargeting();
                    }
                    throw new RuntimeException("Invalid map field number: " + i);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected MapField internalGetMutableMapField(int i) {
                    if (i == 6) {
                        return internalGetMutableCustomTargeting();
                    }
                    throw new RuntimeException("Invalid map field number: " + i);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue2 = this.serverParams_;
                        if (stringValue2 != null) {
                            this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.serverParams_ = stringValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(stringValue);
                    }
                    return this;
                }

                public Builder mergeSleepTimeAfter(UInt32Value uInt32Value) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeAfterBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        UInt32Value uInt32Value2 = this.sleepTimeAfter_;
                        if (uInt32Value2 != null) {
                            this.sleepTimeAfter_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                        } else {
                            this.sleepTimeAfter_ = uInt32Value;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(uInt32Value);
                    }
                    return this;
                }

                public Builder mergeSleepTimeBefore(UInt32Value uInt32Value) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeBeforeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        UInt32Value uInt32Value2 = this.sleepTimeBefore_;
                        if (uInt32Value2 != null) {
                            this.sleepTimeBefore_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                        } else {
                            this.sleepTimeBefore_ = uInt32Value;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(uInt32Value);
                    }
                    return this;
                }

                public Builder putAllCustomTargeting(Map<String, String> map) {
                    internalGetMutableCustomTargeting().getMutableMap().putAll(map);
                    return this;
                }

                public Builder putCustomTargeting(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    internalGetMutableCustomTargeting().getMutableMap().put(str, str2);
                    return this;
                }

                public Builder removeCustomTargeting(String str) {
                    str.getClass();
                    internalGetMutableCustomTargeting().getMutableMap().remove(str);
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setExpirationTime(int i) {
                    this.expirationTime_ = i;
                    onChanged();
                    return this;
                }

                public Builder setOverrideCallbacks(boolean z) {
                    this.overrideCallbacks_ = z;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d) {
                    this.price_ = d;
                    onChanged();
                    return this;
                }

                public Builder setRequestAgent(String str) {
                    str.getClass();
                    this.requestAgent_ = str;
                    onChanged();
                    return this;
                }

                public Builder setRequestAgentBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.requestAgent_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        stringValue.getClass();
                        this.serverParams_ = stringValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(stringValue);
                    }
                    return this;
                }

                public Builder setSleepTimeAfter(UInt32Value uInt32Value) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeAfterBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        uInt32Value.getClass();
                        this.sleepTimeAfter_ = uInt32Value;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(uInt32Value);
                    }
                    return this;
                }

                public Builder setSleepTimeBefore(UInt32Value uInt32Value) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeBeforeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        uInt32Value.getClass();
                        this.sleepTimeBefore_ = uInt32Value;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(uInt32Value);
                    }
                    return this;
                }

                private Builder() {
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit build() {
                    AdUnit buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit buildPartial() {
                    AdUnit adUnit = new AdUnit(this);
                    adUnit.overrideCallbacks_ = this.overrideCallbacks_;
                    adUnit.expirationTime_ = this.expirationTime_;
                    adUnit.adUnitId_ = this.adUnitId_;
                    adUnit.requestAgent_ = this.requestAgent_;
                    adUnit.price_ = this.price_;
                    adUnit.customTargeting_ = internalGetCustomTargeting();
                    adUnit.customTargeting_.makeImmutable();
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeBeforeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        adUnit.sleepTimeBefore_ = this.sleepTimeBefore_;
                    } else {
                        adUnit.sleepTimeBefore_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV32 = this.sleepTimeAfterBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        adUnit.sleepTimeAfter_ = this.sleepTimeAfter_;
                    } else {
                        adUnit.sleepTimeAfter_ = singleFieldBuilderV32.build();
                    }
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV33 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV33 == null) {
                        adUnit.serverParams_ = this.serverParams_;
                    } else {
                        adUnit.serverParams_ = singleFieldBuilderV33.build();
                    }
                    onBuilt();
                    return adUnit;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public AdUnit getDefaultInstanceForType() {
                    return AdUnit.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.overrideCallbacks_ = false;
                    this.expirationTime_ = 0;
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    this.price_ = 0.0d;
                    internalGetMutableCustomTargeting().clear();
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBefore_ = null;
                    } else {
                        this.sleepTimeBefore_ = null;
                        this.sleepTimeBeforeBuilder_ = null;
                    }
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfter_ = null;
                    } else {
                        this.sleepTimeAfter_ = null;
                        this.sleepTimeAfterBuilder_ = null;
                    }
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                    } else {
                        this.serverParams_ = null;
                        this.serverParamsBuilder_ = null;
                    }
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setSleepTimeAfter(UInt32Value.Builder builder) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeAfterBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.sleepTimeAfter_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setSleepTimeBefore(UInt32Value.Builder builder) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.sleepTimeBeforeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.sleepTimeBefore_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo110022clone() {
                    return (Builder) super.mo110022clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdUnit) {
                        return mergeFrom((AdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdUnit adUnit) {
                    if (adUnit == AdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (adUnit.getOverrideCallbacks()) {
                        setOverrideCallbacks(adUnit.getOverrideCallbacks());
                    }
                    if (adUnit.getExpirationTime() != 0) {
                        setExpirationTime(adUnit.getExpirationTime());
                    }
                    if (!adUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = adUnit.adUnitId_;
                        onChanged();
                    }
                    if (!adUnit.getRequestAgent().isEmpty()) {
                        this.requestAgent_ = adUnit.requestAgent_;
                        onChanged();
                    }
                    if (adUnit.getPrice() != 0.0d) {
                        setPrice(adUnit.getPrice());
                    }
                    internalGetMutableCustomTargeting().mergeFrom(adUnit.internalGetCustomTargeting());
                    if (adUnit.hasSleepTimeBefore()) {
                        mergeSleepTimeBefore(adUnit.getSleepTimeBefore());
                    }
                    if (adUnit.hasSleepTimeAfter()) {
                        mergeSleepTimeAfter(adUnit.getSleepTimeAfter());
                    }
                    if (adUnit.hasServerParams()) {
                        mergeServerParams(adUnit.getServerParams());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) adUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.access$1500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Configuration$AdUnit r3 = (io.bidmachine.protobuf.Waterfall.Configuration.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        if (r3 == 0) goto L10
                        r2.mergeFrom(r3)
                    L10:
                        return r2
                    L11:
                        r3 = move-exception
                        goto L21
                    L13:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                        io.bidmachine.protobuf.Waterfall$Configuration$AdUnit r4 = (io.bidmachine.protobuf.Waterfall.Configuration.AdUnit) r4     // Catch: java.lang.Throwable -> L11
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                        throw r3     // Catch: java.lang.Throwable -> L1f
                    L1f:
                        r3 = move-exception
                        r0 = r4
                    L21:
                        if (r0 == 0) goto L26
                        r2.mergeFrom(r0)
                    L26:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Configuration$AdUnit$Builder");
                }
            }

            public static Builder newBuilder(AdUnit adUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private AdUnit(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
                this.requestAgent_ = "";
            }

            public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static AdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static AdUnit parseFrom(InputStream inputStream) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
            private AdUnit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.overrideCallbacks_ = codedInputStream.readBool();
                                } else if (readTag == 16) {
                                    this.expirationTime_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    this.adUnitId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.requestAgent_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 41) {
                                    this.price_ = codedInputStream.readDouble();
                                } else if (readTag != 50) {
                                    if (readTag == 58) {
                                        UInt32Value uInt32Value = this.sleepTimeBefore_;
                                        UInt32Value.Builder builder = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                        UInt32Value uInt32Value2 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                                        this.sleepTimeBefore_ = uInt32Value2;
                                        if (builder != null) {
                                            builder.mergeFrom(uInt32Value2);
                                            this.sleepTimeBefore_ = builder.buildPartial();
                                        }
                                    } else if (readTag == 66) {
                                        UInt32Value uInt32Value3 = this.sleepTimeAfter_;
                                        UInt32Value.Builder builder2 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                        UInt32Value uInt32Value4 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                                        this.sleepTimeAfter_ = uInt32Value4;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(uInt32Value4);
                                            this.sleepTimeAfter_ = builder2.buildPartial();
                                        }
                                    } else if (readTag != 74) {
                                        if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                        }
                                    } else {
                                        StringValue stringValue = this.serverParams_;
                                        StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                        this.serverParams_ = stringValue2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue2);
                                            this.serverParams_ = builder3.buildPartial();
                                        }
                                    }
                                } else {
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.customTargeting_ = MapField.newMapField(CustomTargetingDefaultEntryHolder.defaultEntry);
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomTargetingDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    this.customTargeting_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } finally {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static AdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static AdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes9.dex */
        public interface AdUnitOrBuilder extends MessageOrBuilder {
            boolean containsCustomTargeting(String str);

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Deprecated
            Map<String, String> getCustomTargeting();

            int getCustomTargetingCount();

            Map<String, String> getCustomTargetingMap();

            String getCustomTargetingOrDefault(String str, String str2);

            String getCustomTargetingOrThrow(String str);

            int getExpirationTime();

            boolean getOverrideCallbacks();

            double getPrice();

            String getRequestAgent();

            ByteString getRequestAgentBytes();

            StringValue getServerParams();

            StringValueOrBuilder getServerParamsOrBuilder();

            UInt32Value getSleepTimeAfter();

            UInt32ValueOrBuilder getSleepTimeAfterOrBuilder();

            UInt32Value getSleepTimeBefore();

            UInt32ValueOrBuilder getSleepTimeBeforeOrBuilder();

            boolean hasServerParams();

            boolean hasSleepTimeAfter();

            boolean hasSleepTimeBefore();
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.f97432xf4a15533;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Configuration> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (!getId().equals(configuration.getId()) || !getFormat().equals(configuration.getFormat()) || hasRefreshTimeout() != configuration.hasRefreshTimeout()) {
                return false;
            }
            if ((hasRefreshTimeout() && !getRefreshTimeout().equals(configuration.getRefreshTimeout())) || hasRefreshUrl() != configuration.hasRefreshUrl()) {
                return false;
            }
            if ((hasRefreshUrl() && !getRefreshUrl().equals(configuration.getRefreshUrl())) || hasRetryBase() != configuration.hasRetryBase()) {
                return false;
            }
            if ((hasRetryBase() && !getRetryBase().equals(configuration.getRetryBase())) || hasMaxRetryDegree() != configuration.hasMaxRetryDegree()) {
                return false;
            }
            if ((hasMaxRetryDegree() && !getMaxRetryDegree().equals(configuration.getMaxRetryDegree())) || hasCacheSize() != configuration.hasCacheSize()) {
                return false;
            }
            if ((hasCacheSize() && !getCacheSize().equals(configuration.getCacheSize())) || !getAdUnitsList().equals(configuration.getAdUnitsList()) || getShouldBreak() != configuration.getShouldBreak() || hasServerParams() != configuration.hasServerParams()) {
                return false;
            }
            if ((!hasServerParams() || getServerParams().equals(configuration.getServerParams())) && this.unknownFields.equals(configuration.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public AdUnit getAdUnits(int i) {
            return this.adUnits_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public int getAdUnitsCount() {
            return this.adUnits_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public List<AdUnit> getAdUnitsList() {
            return this.adUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            return this.adUnits_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            return this.adUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getCacheSize() {
            UInt32Value uInt32Value = this.cacheSize_;
            if (uInt32Value == null) {
                return UInt32Value.getDefaultInstance();
            }
            return uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32ValueOrBuilder getCacheSizeOrBuilder() {
            return getCacheSize();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public String getFormat() {
            Object obj = this.format_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.format_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ByteString getFormatBytes() {
            Object obj = this.format_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.format_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getMaxRetryDegree() {
            UInt32Value uInt32Value = this.maxRetryDegree_;
            if (uInt32Value == null) {
                return UInt32Value.getDefaultInstance();
            }
            return uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32ValueOrBuilder getMaxRetryDegreeOrBuilder() {
            return getMaxRetryDegree();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt64Value getRefreshTimeout() {
            UInt64Value uInt64Value = this.refreshTimeout_;
            if (uInt64Value == null) {
                return UInt64Value.getDefaultInstance();
            }
            return uInt64Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt64ValueOrBuilder getRefreshTimeoutOrBuilder() {
            return getRefreshTimeout();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValue getRefreshUrl() {
            StringValue stringValue = this.refreshUrl_;
            if (stringValue == null) {
                return StringValue.getDefaultInstance();
            }
            return stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValueOrBuilder getRefreshUrlOrBuilder() {
            return getRefreshUrl();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getRetryBase() {
            UInt32Value uInt32Value = this.retryBase_;
            if (uInt32Value == null) {
                return UInt32Value.getDefaultInstance();
            }
            return uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32ValueOrBuilder getRetryBaseOrBuilder() {
            return getRetryBase();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            if (!getIdBytes().isEmpty()) {
                i = GeneratedMessageV3.computeStringSize(1, this.id_) + 0;
            } else {
                i = 0;
            }
            if (!getFormatBytes().isEmpty()) {
                i += GeneratedMessageV3.computeStringSize(2, this.format_);
            }
            if (this.refreshTimeout_ != null) {
                i += CodedOutputStream.computeMessageSize(3, getRefreshTimeout());
            }
            if (this.refreshUrl_ != null) {
                i += CodedOutputStream.computeMessageSize(4, getRefreshUrl());
            }
            if (this.retryBase_ != null) {
                i += CodedOutputStream.computeMessageSize(5, getRetryBase());
            }
            if (this.maxRetryDegree_ != null) {
                i += CodedOutputStream.computeMessageSize(6, getMaxRetryDegree());
            }
            if (this.cacheSize_ != null) {
                i += CodedOutputStream.computeMessageSize(7, getCacheSize());
            }
            for (int i3 = 0; i3 < this.adUnits_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(8, this.adUnits_.get(i3));
            }
            boolean z = this.shouldBreak_;
            if (z) {
                i += CodedOutputStream.computeBoolSize(9, z);
            }
            if (this.serverParams_ != null) {
                i += CodedOutputStream.computeMessageSize(10, getServerParams());
            }
            int serializedSize = i + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValue getServerParams() {
            StringValue stringValue = this.serverParams_;
            if (stringValue == null) {
                return StringValue.getDefaultInstance();
            }
            return stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValueOrBuilder getServerParamsOrBuilder() {
            return getServerParams();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean getShouldBreak() {
            return this.shouldBreak_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasCacheSize() {
            if (this.cacheSize_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasMaxRetryDegree() {
            if (this.maxRetryDegree_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRefreshTimeout() {
            if (this.refreshTimeout_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRefreshUrl() {
            if (this.refreshUrl_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRetryBase() {
            if (this.retryBase_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasServerParams() {
            if (this.serverParams_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getFormat().hashCode();
            if (hasRefreshTimeout()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getRefreshTimeout().hashCode();
            }
            if (hasRefreshUrl()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getRefreshUrl().hashCode();
            }
            if (hasRetryBase()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getRetryBase().hashCode();
            }
            if (hasMaxRetryDegree()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getMaxRetryDegree().hashCode();
            }
            if (hasCacheSize()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getCacheSize().hashCode();
            }
            if (getAdUnitsCount() > 0) {
                hashCode = (((hashCode * 37) + 8) * 53) + getAdUnitsList().hashCode();
            }
            int hashBoolean = (((hashCode * 37) + 9) * 53) + Internal.hashBoolean(getShouldBreak());
            if (hasServerParams()) {
                hashBoolean = (((hashBoolean * 37) + 10) * 53) + getServerParams().hashCode();
            }
            int hashCode2 = (hashBoolean * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WaterfallProto.f97433x298d98b1.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if (!getFormatBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.format_);
            }
            if (this.refreshTimeout_ != null) {
                codedOutputStream.writeMessage(3, getRefreshTimeout());
            }
            if (this.refreshUrl_ != null) {
                codedOutputStream.writeMessage(4, getRefreshUrl());
            }
            if (this.retryBase_ != null) {
                codedOutputStream.writeMessage(5, getRetryBase());
            }
            if (this.maxRetryDegree_ != null) {
                codedOutputStream.writeMessage(6, getMaxRetryDegree());
            }
            if (this.cacheSize_ != null) {
                codedOutputStream.writeMessage(7, getCacheSize());
            }
            for (int i = 0; i < this.adUnits_.size(); i++) {
                codedOutputStream.writeMessage(8, this.adUnits_.get(i));
            }
            boolean z = this.shouldBreak_;
            if (z) {
                codedOutputStream.writeBool(9, z);
            }
            if (this.serverParams_ != null) {
                codedOutputStream.writeMessage(10, getServerParams());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationOrBuilder {
            private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitsBuilder_;
            private List<AdUnit> adUnits_;
            private int bitField0_;
            private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> cacheSizeBuilder_;
            private UInt32Value cacheSize_;
            private Object format_;
            private Object id_;
            private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> maxRetryDegreeBuilder_;
            private UInt32Value maxRetryDegree_;
            private SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> refreshTimeoutBuilder_;
            private UInt64Value refreshTimeout_;
            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> refreshUrlBuilder_;
            private StringValue refreshUrl_;
            private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> retryBaseBuilder_;
            private UInt32Value retryBase_;
            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> serverParamsBuilder_;
            private StringValue serverParams_;
            private boolean shouldBreak_;

            private void ensureAdUnitsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.adUnits_ = new ArrayList(this.adUnits_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> getAdUnitsFieldBuilder() {
                if (this.adUnitsBuilder_ == null) {
                    List<AdUnit> list = this.adUnits_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.adUnitsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.adUnits_ = null;
                }
                return this.adUnitsBuilder_;
            }

            private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getCacheSizeFieldBuilder() {
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSizeBuilder_ = new SingleFieldBuilderV3<>(getCacheSize(), getParentForChildren(), isClean());
                    this.cacheSize_ = null;
                }
                return this.cacheSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.f97432xf4a15533;
            }

            private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getMaxRetryDegreeFieldBuilder() {
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegreeBuilder_ = new SingleFieldBuilderV3<>(getMaxRetryDegree(), getParentForChildren(), isClean());
                    this.maxRetryDegree_ = null;
                }
                return this.maxRetryDegreeBuilder_;
            }

            private SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> getRefreshTimeoutFieldBuilder() {
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeoutBuilder_ = new SingleFieldBuilderV3<>(getRefreshTimeout(), getParentForChildren(), isClean());
                    this.refreshTimeout_ = null;
                }
                return this.refreshTimeoutBuilder_;
            }

            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getRefreshUrlFieldBuilder() {
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrlBuilder_ = new SingleFieldBuilderV3<>(getRefreshUrl(), getParentForChildren(), isClean());
                    this.refreshUrl_ = null;
                }
                return this.refreshUrlBuilder_;
            }

            private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getRetryBaseFieldBuilder() {
                if (this.retryBaseBuilder_ == null) {
                    this.retryBaseBuilder_ = new SingleFieldBuilderV3<>(getRetryBase(), getParentForChildren(), isClean());
                    this.retryBase_ = null;
                }
                return this.retryBaseBuilder_;
            }

            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getServerParamsFieldBuilder() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParamsBuilder_ = new SingleFieldBuilderV3<>(getServerParams(), getParentForChildren(), isClean());
                    this.serverParams_ = null;
                }
                return this.serverParamsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAdUnitsFieldBuilder();
                }
            }

            public Builder addAdUnits(AdUnit adUnit) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adUnit.getClass();
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(adUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(adUnit);
                }
                return this;
            }

            public AdUnit.Builder addAdUnitsBuilder() {
                return getAdUnitsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
            }

            public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.adUnits_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearAdUnits() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.adUnits_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearCacheSize() {
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSize_ = null;
                    onChanged();
                } else {
                    this.cacheSize_ = null;
                    this.cacheSizeBuilder_ = null;
                }
                return this;
            }

            public Builder clearFormat() {
                this.format_ = Configuration.getDefaultInstance().getFormat();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Configuration.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearMaxRetryDegree() {
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegree_ = null;
                    onChanged();
                } else {
                    this.maxRetryDegree_ = null;
                    this.maxRetryDegreeBuilder_ = null;
                }
                return this;
            }

            public Builder clearRefreshTimeout() {
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeout_ = null;
                    onChanged();
                } else {
                    this.refreshTimeout_ = null;
                    this.refreshTimeoutBuilder_ = null;
                }
                return this;
            }

            public Builder clearRefreshUrl() {
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrl_ = null;
                    onChanged();
                } else {
                    this.refreshUrl_ = null;
                    this.refreshUrlBuilder_ = null;
                }
                return this;
            }

            public Builder clearRetryBase() {
                if (this.retryBaseBuilder_ == null) {
                    this.retryBase_ = null;
                    onChanged();
                } else {
                    this.retryBase_ = null;
                    this.retryBaseBuilder_ = null;
                }
                return this;
            }

            public Builder clearServerParams() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    onChanged();
                } else {
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                }
                return this;
            }

            public Builder clearShouldBreak() {
                this.shouldBreak_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public AdUnit getAdUnits(int i) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.adUnits_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public AdUnit.Builder getAdUnitsBuilder(int i) {
                return getAdUnitsFieldBuilder().getBuilder(i);
            }

            public List<AdUnit.Builder> getAdUnitsBuilderList() {
                return getAdUnitsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public int getAdUnitsCount() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.adUnits_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public List<AdUnit> getAdUnitsList() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.adUnits_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.adUnits_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.adUnits_);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getCacheSize() {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.cacheSizeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt32Value uInt32Value = this.cacheSize_;
                    if (uInt32Value == null) {
                        return UInt32Value.getDefaultInstance();
                    }
                    return uInt32Value;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public UInt32Value.Builder getCacheSizeBuilder() {
                onChanged();
                return getCacheSizeFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32ValueOrBuilder getCacheSizeOrBuilder() {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.cacheSizeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.cacheSize_;
                if (uInt32Value == null) {
                    return UInt32Value.getDefaultInstance();
                }
                return uInt32Value;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.f97432xf4a15533;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public String getFormat() {
                Object obj = this.format_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.format_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ByteString getFormatBytes() {
                Object obj = this.format_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.format_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getMaxRetryDegree() {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.maxRetryDegreeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt32Value uInt32Value = this.maxRetryDegree_;
                    if (uInt32Value == null) {
                        return UInt32Value.getDefaultInstance();
                    }
                    return uInt32Value;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public UInt32Value.Builder getMaxRetryDegreeBuilder() {
                onChanged();
                return getMaxRetryDegreeFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32ValueOrBuilder getMaxRetryDegreeOrBuilder() {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.maxRetryDegreeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.maxRetryDegree_;
                if (uInt32Value == null) {
                    return UInt32Value.getDefaultInstance();
                }
                return uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt64Value getRefreshTimeout() {
                SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> singleFieldBuilderV3 = this.refreshTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt64Value uInt64Value = this.refreshTimeout_;
                    if (uInt64Value == null) {
                        return UInt64Value.getDefaultInstance();
                    }
                    return uInt64Value;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public UInt64Value.Builder getRefreshTimeoutBuilder() {
                onChanged();
                return getRefreshTimeoutFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt64ValueOrBuilder getRefreshTimeoutOrBuilder() {
                SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> singleFieldBuilderV3 = this.refreshTimeoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                UInt64Value uInt64Value = this.refreshTimeout_;
                if (uInt64Value == null) {
                    return UInt64Value.getDefaultInstance();
                }
                return uInt64Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValue getRefreshUrl() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.refreshUrlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.refreshUrl_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public StringValue.Builder getRefreshUrlBuilder() {
                onChanged();
                return getRefreshUrlFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValueOrBuilder getRefreshUrlOrBuilder() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.refreshUrlBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.refreshUrl_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getRetryBase() {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.retryBaseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt32Value uInt32Value = this.retryBase_;
                    if (uInt32Value == null) {
                        return UInt32Value.getDefaultInstance();
                    }
                    return uInt32Value;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public UInt32Value.Builder getRetryBaseBuilder() {
                onChanged();
                return getRetryBaseFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32ValueOrBuilder getRetryBaseOrBuilder() {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.retryBaseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                UInt32Value uInt32Value = this.retryBase_;
                if (uInt32Value == null) {
                    return UInt32Value.getDefaultInstance();
                }
                return uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValue getServerParams() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.serverParams_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public StringValue.Builder getServerParamsBuilder() {
                onChanged();
                return getServerParamsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValueOrBuilder getServerParamsOrBuilder() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.serverParams_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean getShouldBreak() {
                return this.shouldBreak_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasCacheSize() {
                if (this.cacheSizeBuilder_ == null && this.cacheSize_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasMaxRetryDegree() {
                if (this.maxRetryDegreeBuilder_ == null && this.maxRetryDegree_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRefreshTimeout() {
                if (this.refreshTimeoutBuilder_ == null && this.refreshTimeout_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRefreshUrl() {
                if (this.refreshUrlBuilder_ == null && this.refreshUrl_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRetryBase() {
                if (this.retryBaseBuilder_ == null && this.retryBase_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasServerParams() {
                if (this.serverParamsBuilder_ == null && this.serverParams_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97433x298d98b1.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCacheSize(UInt32Value uInt32Value) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.cacheSizeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt32Value uInt32Value2 = this.cacheSize_;
                    if (uInt32Value2 != null) {
                        this.cacheSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.cacheSize_ = uInt32Value;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(uInt32Value);
                }
                return this;
            }

            public Builder mergeMaxRetryDegree(UInt32Value uInt32Value) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.maxRetryDegreeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt32Value uInt32Value2 = this.maxRetryDegree_;
                    if (uInt32Value2 != null) {
                        this.maxRetryDegree_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.maxRetryDegree_ = uInt32Value;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(uInt32Value);
                }
                return this;
            }

            public Builder mergeRefreshTimeout(UInt64Value uInt64Value) {
                SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> singleFieldBuilderV3 = this.refreshTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt64Value uInt64Value2 = this.refreshTimeout_;
                    if (uInt64Value2 != null) {
                        this.refreshTimeout_ = UInt64Value.newBuilder(uInt64Value2).mergeFrom(uInt64Value).buildPartial();
                    } else {
                        this.refreshTimeout_ = uInt64Value;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(uInt64Value);
                }
                return this;
            }

            public Builder mergeRefreshUrl(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.refreshUrlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.refreshUrl_;
                    if (stringValue2 != null) {
                        this.refreshUrl_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.refreshUrl_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder mergeRetryBase(UInt32Value uInt32Value) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.retryBaseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UInt32Value uInt32Value2 = this.retryBase_;
                    if (uInt32Value2 != null) {
                        this.retryBase_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.retryBase_ = uInt32Value;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(uInt32Value);
                }
                return this;
            }

            public Builder mergeServerParams(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder removeAdUnits(int i) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setAdUnits(int i, AdUnit adUnit) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adUnit.getClass();
                    ensureAdUnitsIsMutable();
                    this.adUnits_.set(i, adUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, adUnit);
                }
                return this;
            }

            public Builder setCacheSize(UInt32Value uInt32Value) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.cacheSizeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uInt32Value.getClass();
                    this.cacheSize_ = uInt32Value;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(uInt32Value);
                }
                return this;
            }

            public Builder setFormat(String str) {
                str.getClass();
                this.format_ = str;
                onChanged();
                return this;
            }

            public Builder setFormatBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.format_ = byteString;
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMaxRetryDegree(UInt32Value uInt32Value) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.maxRetryDegreeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uInt32Value.getClass();
                    this.maxRetryDegree_ = uInt32Value;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(uInt32Value);
                }
                return this;
            }

            public Builder setRefreshTimeout(UInt64Value uInt64Value) {
                SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> singleFieldBuilderV3 = this.refreshTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uInt64Value.getClass();
                    this.refreshTimeout_ = uInt64Value;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(uInt64Value);
                }
                return this;
            }

            public Builder setRefreshUrl(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.refreshUrlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.refreshUrl_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setRetryBase(UInt32Value uInt32Value) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.retryBaseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uInt32Value.getClass();
                    this.retryBase_ = uInt32Value;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(uInt32Value);
                }
                return this;
            }

            public Builder setServerParams(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setShouldBreak(boolean z) {
                this.shouldBreak_ = z;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.format_ = "";
                this.adUnits_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration build() {
                Configuration buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                configuration.id_ = this.id_;
                configuration.format_ = this.format_;
                SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> singleFieldBuilderV3 = this.refreshTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configuration.refreshTimeout_ = this.refreshTimeout_;
                } else {
                    configuration.refreshTimeout_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV32 = this.refreshUrlBuilder_;
                if (singleFieldBuilderV32 == null) {
                    configuration.refreshUrl_ = this.refreshUrl_;
                } else {
                    configuration.refreshUrl_ = singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV33 = this.retryBaseBuilder_;
                if (singleFieldBuilderV33 == null) {
                    configuration.retryBase_ = this.retryBase_;
                } else {
                    configuration.retryBase_ = singleFieldBuilderV33.build();
                }
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV34 = this.maxRetryDegreeBuilder_;
                if (singleFieldBuilderV34 == null) {
                    configuration.maxRetryDegree_ = this.maxRetryDegree_;
                } else {
                    configuration.maxRetryDegree_ = singleFieldBuilderV34.build();
                }
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV35 = this.cacheSizeBuilder_;
                if (singleFieldBuilderV35 == null) {
                    configuration.cacheSize_ = this.cacheSize_;
                } else {
                    configuration.cacheSize_ = singleFieldBuilderV35.build();
                }
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    configuration.adUnits_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                        this.bitField0_ &= -2;
                    }
                    configuration.adUnits_ = this.adUnits_;
                }
                configuration.shouldBreak_ = this.shouldBreak_;
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV36 = this.serverParamsBuilder_;
                if (singleFieldBuilderV36 == null) {
                    configuration.serverParams_ = this.serverParams_;
                } else {
                    configuration.serverParams_ = singleFieldBuilderV36.build();
                }
                onBuilt();
                return configuration;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public AdUnit.Builder addAdUnitsBuilder(int i) {
                return getAdUnitsFieldBuilder().addBuilder(i, AdUnit.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.format_ = "";
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeout_ = null;
                } else {
                    this.refreshTimeout_ = null;
                    this.refreshTimeoutBuilder_ = null;
                }
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrl_ = null;
                } else {
                    this.refreshUrl_ = null;
                    this.refreshUrlBuilder_ = null;
                }
                if (this.retryBaseBuilder_ == null) {
                    this.retryBase_ = null;
                } else {
                    this.retryBase_ = null;
                    this.retryBaseBuilder_ = null;
                }
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegree_ = null;
                } else {
                    this.maxRetryDegree_ = null;
                    this.maxRetryDegreeBuilder_ = null;
                }
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSize_ = null;
                } else {
                    this.cacheSize_ = null;
                    this.cacheSizeBuilder_ = null;
                }
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.adUnits_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.shouldBreak_ = false;
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                } else {
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                }
                return this;
            }

            public Builder setCacheSize(UInt32Value.Builder builder) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.cacheSizeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cacheSize_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setMaxRetryDegree(UInt32Value.Builder builder) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.maxRetryDegreeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxRetryDegree_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setRefreshTimeout(UInt64Value.Builder builder) {
                SingleFieldBuilderV3<UInt64Value, UInt64Value.Builder, UInt64ValueOrBuilder> singleFieldBuilderV3 = this.refreshTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.refreshTimeout_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setRefreshUrl(StringValue.Builder builder) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.refreshUrlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.refreshUrl_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setRetryBase(UInt32Value.Builder builder) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.retryBaseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.retryBase_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setServerParams(StringValue.Builder builder) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.serverParams_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder addAdUnits(int i, AdUnit adUnit) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adUnit.getClass();
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(i, adUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, adUnit);
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdUnits(int i, AdUnit.Builder builder) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.format_ = "";
                this.adUnits_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (!configuration.getId().isEmpty()) {
                    this.id_ = configuration.id_;
                    onChanged();
                }
                if (!configuration.getFormat().isEmpty()) {
                    this.format_ = configuration.format_;
                    onChanged();
                }
                if (configuration.hasRefreshTimeout()) {
                    mergeRefreshTimeout(configuration.getRefreshTimeout());
                }
                if (configuration.hasRefreshUrl()) {
                    mergeRefreshUrl(configuration.getRefreshUrl());
                }
                if (configuration.hasRetryBase()) {
                    mergeRetryBase(configuration.getRetryBase());
                }
                if (configuration.hasMaxRetryDegree()) {
                    mergeMaxRetryDegree(configuration.getMaxRetryDegree());
                }
                if (configuration.hasCacheSize()) {
                    mergeCacheSize(configuration.getCacheSize());
                }
                if (this.adUnitsBuilder_ == null) {
                    if (!configuration.adUnits_.isEmpty()) {
                        if (this.adUnits_.isEmpty()) {
                            this.adUnits_ = configuration.adUnits_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAdUnitsIsMutable();
                            this.adUnits_.addAll(configuration.adUnits_);
                        }
                        onChanged();
                    }
                } else if (!configuration.adUnits_.isEmpty()) {
                    if (!this.adUnitsBuilder_.isEmpty()) {
                        this.adUnitsBuilder_.addAllMessages(configuration.adUnits_);
                    } else {
                        this.adUnitsBuilder_.dispose();
                        this.adUnitsBuilder_ = null;
                        this.adUnits_ = configuration.adUnits_;
                        this.bitField0_ &= -2;
                        this.adUnitsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                    }
                }
                if (configuration.getShouldBreak()) {
                    setShouldBreak(configuration.getShouldBreak());
                }
                if (configuration.hasServerParams()) {
                    mergeServerParams(configuration.getServerParams());
                }
                mergeUnknownFields(((GeneratedMessageV3) configuration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdUnits(AdUnit.Builder builder) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAdUnits(int i, AdUnit.Builder builder) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.Waterfall.Configuration.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Configuration.access$3500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Configuration r3 = (io.bidmachine.protobuf.Waterfall.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.Waterfall$Configuration r4 = (io.bidmachine.protobuf.Waterfall.Configuration) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Configuration.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Configuration$Builder");
            }
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Configuration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Configuration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Configuration() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.format_ = "";
            this.adUnits_ = Collections.emptyList();
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Configuration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Configuration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 10:
                                this.id_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                this.format_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 26:
                                UInt64Value uInt64Value = this.refreshTimeout_;
                                UInt64Value.Builder builder = uInt64Value != null ? uInt64Value.toBuilder() : null;
                                UInt64Value uInt64Value2 = (UInt64Value) codedInputStream.readMessage(UInt64Value.parser(), extensionRegistryLite);
                                this.refreshTimeout_ = uInt64Value2;
                                if (builder != null) {
                                    builder.mergeFrom(uInt64Value2);
                                    this.refreshTimeout_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                StringValue stringValue = this.refreshUrl_;
                                StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.refreshUrl_ = stringValue2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue2);
                                    this.refreshUrl_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                UInt32Value uInt32Value = this.retryBase_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                                this.retryBase_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.retryBase_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                UInt32Value uInt32Value3 = this.maxRetryDegree_;
                                UInt32Value.Builder builder4 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                UInt32Value uInt32Value4 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                                this.maxRetryDegree_ = uInt32Value4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(uInt32Value4);
                                    this.maxRetryDegree_ = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                UInt32Value uInt32Value5 = this.cacheSize_;
                                UInt32Value.Builder builder5 = uInt32Value5 != null ? uInt32Value5.toBuilder() : null;
                                UInt32Value uInt32Value6 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                                this.cacheSize_ = uInt32Value6;
                                if (builder5 != null) {
                                    builder5.mergeFrom(uInt32Value6);
                                    this.cacheSize_ = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.adUnits_ = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.adUnits_.add(codedInputStream.readMessage(AdUnit.parser(), extensionRegistryLite));
                                continue;
                            case 72:
                                this.shouldBreak_ = codedInputStream.readBool();
                                continue;
                            case 82:
                                StringValue stringValue3 = this.serverParams_;
                                StringValue.Builder builder6 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.serverParams_ = stringValue4;
                                if (builder6 != null) {
                                    builder6.mergeFrom(stringValue4);
                                    this.serverParams_ = builder6.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    if ((z2 ? 1 : 0) & true) {
                        this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        Configuration.AdUnit getAdUnits(int i);

        int getAdUnitsCount();

        List<Configuration.AdUnit> getAdUnitsList();

        Configuration.AdUnitOrBuilder getAdUnitsOrBuilder(int i);

        List<? extends Configuration.AdUnitOrBuilder> getAdUnitsOrBuilderList();

        UInt32Value getCacheSize();

        UInt32ValueOrBuilder getCacheSizeOrBuilder();

        String getFormat();

        ByteString getFormatBytes();

        String getId();

        ByteString getIdBytes();

        UInt32Value getMaxRetryDegree();

        UInt32ValueOrBuilder getMaxRetryDegreeOrBuilder();

        UInt64Value getRefreshTimeout();

        UInt64ValueOrBuilder getRefreshTimeoutOrBuilder();

        StringValue getRefreshUrl();

        StringValueOrBuilder getRefreshUrlOrBuilder();

        UInt32Value getRetryBase();

        UInt32ValueOrBuilder getRetryBaseOrBuilder();

        StringValue getServerParams();

        StringValueOrBuilder getServerParamsOrBuilder();

        boolean getShouldBreak();

        boolean hasCacheSize();

        boolean hasMaxRetryDegree();

        boolean hasRefreshTimeout();

        boolean hasRefreshUrl();

        boolean hasRetryBase();

        boolean hasServerParams();
    }

    /* loaded from: classes9.dex */
    public static final class Context extends GeneratedMessageV3 implements ContextOrBuilder {
        public static final int CONFIGURATIONS_FIELD_NUMBER = 1;
        public static final int EVENT_CONFIG_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<Configuration> configurations_;
        private AdExtension.EventConfiguration eventConfig_;
        private byte memoizedIsInitialized;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final Parser<Context> PARSER = new AbstractParser<Context>() { // from class: io.bidmachine.protobuf.Waterfall.Context.1
            @Override // com.explorestack.protobuf.Parser
            public Context parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Context(codedInputStream, extensionRegistryLite);
            }
        };

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Context> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            if (!getConfigurationsList().equals(context.getConfigurationsList()) || hasEventConfig() != context.hasEventConfig()) {
                return false;
            }
            if ((!hasEventConfig() || getEventConfig().equals(context.getEventConfig())) && this.unknownFields.equals(context.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public Configuration getConfigurations(int i) {
            return this.configurations_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public int getConfigurationsCount() {
            return this.configurations_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public List<Configuration> getConfigurationsList() {
            return this.configurations_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public ConfigurationOrBuilder getConfigurationsOrBuilder(int i) {
            return this.configurations_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList() {
            return this.configurations_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public AdExtension.EventConfiguration getEventConfig() {
            AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
            if (eventConfiguration == null) {
                return AdExtension.EventConfiguration.getDefaultInstance();
            }
            return eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder() {
            return getEventConfig();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Context> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.configurations_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.configurations_.get(i3));
            }
            if (this.eventConfig_ != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEventConfig());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public boolean hasEventConfig() {
            if (this.eventConfig_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getConfigurationsCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getConfigurationsList().hashCode();
            }
            if (hasEventConfig()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getEventConfig().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WaterfallProto.f97434x547e8398.ensureFieldAccessorsInitialized(Context.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Context();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.configurations_.size(); i++) {
                codedOutputStream.writeMessage(1, this.configurations_.get(i));
            }
            if (this.eventConfig_ != null) {
                codedOutputStream.writeMessage(2, getEventConfig());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContextOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> configurationsBuilder_;
            private List<Configuration> configurations_;
            private SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> eventConfigBuilder_;
            private AdExtension.EventConfiguration eventConfig_;

            private void ensureConfigurationsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.configurations_ = new ArrayList(this.configurations_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> getConfigurationsFieldBuilder() {
                if (this.configurationsBuilder_ == null) {
                    List<Configuration> list = this.configurations_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.configurationsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.configurations_ = null;
                }
                return this.configurationsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
            }

            private SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> getEventConfigFieldBuilder() {
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfigBuilder_ = new SingleFieldBuilderV3<>(getEventConfig(), getParentForChildren(), isClean());
                    this.eventConfig_ = null;
                }
                return this.eventConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigurationsFieldBuilder();
                }
            }

            public Builder addAllConfigurations(Iterable<? extends Configuration> iterable) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureConfigurationsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.configurations_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addConfigurations(Configuration configuration) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    configuration.getClass();
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(configuration);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(configuration);
                }
                return this;
            }

            public Configuration.Builder addConfigurationsBuilder() {
                return getConfigurationsFieldBuilder().addBuilder(Configuration.getDefaultInstance());
            }

            public Builder clearConfigurations() {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.configurations_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearEventConfig() {
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfig_ = null;
                    onChanged();
                } else {
                    this.eventConfig_ = null;
                    this.eventConfigBuilder_ = null;
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public Configuration getConfigurations(int i) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.configurations_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Configuration.Builder getConfigurationsBuilder(int i) {
                return getConfigurationsFieldBuilder().getBuilder(i);
            }

            public List<Configuration.Builder> getConfigurationsBuilderList() {
                return getConfigurationsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public int getConfigurationsCount() {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.configurations_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public List<Configuration> getConfigurationsList() {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.configurations_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public ConfigurationOrBuilder getConfigurationsOrBuilder(int i) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.configurations_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList() {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.configurations_);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public AdExtension.EventConfiguration getEventConfig() {
                SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                    if (eventConfiguration == null) {
                        return AdExtension.EventConfiguration.getDefaultInstance();
                    }
                    return eventConfiguration;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AdExtension.EventConfiguration.Builder getEventConfigBuilder() {
                onChanged();
                return getEventConfigFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder() {
                SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                if (eventConfiguration == null) {
                    return AdExtension.EventConfiguration.getDefaultInstance();
                }
                return eventConfiguration;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public boolean hasEventConfig() {
                if (this.eventConfigBuilder_ == null && this.eventConfig_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97434x547e8398.ensureFieldAccessorsInitialized(Context.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEventConfig(AdExtension.EventConfiguration eventConfiguration) {
                SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AdExtension.EventConfiguration eventConfiguration2 = this.eventConfig_;
                    if (eventConfiguration2 != null) {
                        this.eventConfig_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
                    } else {
                        this.eventConfig_ = eventConfiguration;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(eventConfiguration);
                }
                return this;
            }

            public Builder removeConfigurations(int i) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setConfigurations(int i, Configuration configuration) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    configuration.getClass();
                    ensureConfigurationsIsMutable();
                    this.configurations_.set(i, configuration);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, configuration);
                }
                return this;
            }

            public Builder setEventConfig(AdExtension.EventConfiguration eventConfiguration) {
                SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    eventConfiguration.getClass();
                    this.eventConfig_ = eventConfiguration;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(eventConfiguration);
                }
                return this;
            }

            private Builder() {
                this.configurations_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context build() {
                Context buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context buildPartial() {
                Context context = new Context(this);
                int i = this.bitField0_;
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) != 0) {
                        this.configurations_ = Collections.unmodifiableList(this.configurations_);
                        this.bitField0_ &= -2;
                    }
                    context.configurations_ = this.configurations_;
                } else {
                    context.configurations_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    context.eventConfig_ = this.eventConfig_;
                } else {
                    context.eventConfig_ = singleFieldBuilderV3.build();
                }
                onBuilt();
                return context;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Context getDefaultInstanceForType() {
                return Context.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Configuration.Builder addConfigurationsBuilder(int i) {
                return getConfigurationsFieldBuilder().addBuilder(i, Configuration.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.configurations_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfig_ = null;
                } else {
                    this.eventConfig_ = null;
                    this.eventConfigBuilder_ = null;
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.configurations_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder setEventConfig(AdExtension.EventConfiguration.Builder builder) {
                SingleFieldBuilderV3<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.eventConfig_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder addConfigurations(int i, Configuration configuration) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    configuration.getClass();
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(i, configuration);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, configuration);
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Context) {
                    return mergeFrom((Context) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setConfigurations(int i, Configuration.Builder builder) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Context context) {
                if (context == Context.getDefaultInstance()) {
                    return this;
                }
                if (this.configurationsBuilder_ == null) {
                    if (!context.configurations_.isEmpty()) {
                        if (this.configurations_.isEmpty()) {
                            this.configurations_ = context.configurations_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureConfigurationsIsMutable();
                            this.configurations_.addAll(context.configurations_);
                        }
                        onChanged();
                    }
                } else if (!context.configurations_.isEmpty()) {
                    if (!this.configurationsBuilder_.isEmpty()) {
                        this.configurationsBuilder_.addAllMessages(context.configurations_);
                    } else {
                        this.configurationsBuilder_.dispose();
                        this.configurationsBuilder_ = null;
                        this.configurations_ = context.configurations_;
                        this.bitField0_ &= -2;
                        this.configurationsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getConfigurationsFieldBuilder() : null;
                    }
                }
                if (context.hasEventConfig()) {
                    mergeEventConfig(context.getEventConfig());
                }
                mergeUnknownFields(((GeneratedMessageV3) context).unknownFields);
                onChanged();
                return this;
            }

            public Builder addConfigurations(Configuration.Builder builder) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addConfigurations(int i, Configuration.Builder builder) {
                RepeatedFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.configurationsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.Waterfall.Context.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Context.access$11200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Context r3 = (io.bidmachine.protobuf.Waterfall.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.Waterfall$Context r4 = (io.bidmachine.protobuf.Waterfall.Context) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Context.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Context$Builder");
            }
        }

        public static Builder newBuilder(Context context) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Context(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Context getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Context() {
            this.memoizedIsInitialized = (byte) -1;
            this.configurations_ = Collections.emptyList();
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Context parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Context parseFrom(InputStream inputStream) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Context(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!(z2 & true)) {
                                        this.configurations_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.configurations_.add(codedInputStream.readMessage(Configuration.parser(), extensionRegistryLite));
                                } else if (readTag != 18) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                                    AdExtension.EventConfiguration.Builder builder = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                                    AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) codedInputStream.readMessage(AdExtension.EventConfiguration.parser(), extensionRegistryLite);
                                    this.eventConfig_ = eventConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom(eventConfiguration2);
                                        this.eventConfig_ = builder.buildPartial();
                                    }
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.configurations_ = Collections.unmodifiableList(this.configurations_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface ContextOrBuilder extends MessageOrBuilder {
        Configuration getConfigurations(int i);

        int getConfigurationsCount();

        List<Configuration> getConfigurationsList();

        ConfigurationOrBuilder getConfigurationsOrBuilder(int i);

        List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList();

        AdExtension.EventConfiguration getEventConfig();

        AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder();

        boolean hasEventConfig();
    }

    /* loaded from: classes9.dex */
    public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        REQUEST(1),
        RESPONSE(2),
        PAYLOAD_NOT_SET(0);
        
        private final int value;

        PayloadCase(int i) {
            this.value = i;
        }

        public static PayloadCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return RESPONSE;
                }
                return REQUEST;
            }
            return PAYLOAD_NOT_SET;
        }

        @Override // com.explorestack.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* loaded from: classes9.dex */
    public static final class Result extends GeneratedMessageV3 implements ResultOrBuilder {
        public static final int AD_UNIT_RESULTS_FIELD_NUMBER = 4;
        public static final int CACHED_AD_UNITS_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 2;
        public static final int FORMAT_FIELD_NUMBER = 3;
        public static final int SERVER_PARAMS_FIELD_NUMBER = 6;
        public static final int WATERFALL_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AdUnit> adUnitResults_;
        private List<CachedAdUnit> cachedAdUnits_;
        private Struct ext_;
        private StringValue format_;
        private byte memoizedIsInitialized;
        private StringValue serverParams_;
        private volatile Object waterfallId_;
        private static final Result DEFAULT_INSTANCE = new Result();
        private static final Parser<Result> PARSER = new AbstractParser<Result>() { // from class: io.bidmachine.protobuf.Waterfall.Result.1
            @Override // com.explorestack.protobuf.Parser
            public Result parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Result(codedInputStream, extensionRegistryLite);
            }
        };

        /* loaded from: classes9.dex */
        public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
            public static final int AD_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_UNIT_ID_FIELD_NUMBER = 1;
            public static final int ERROR_FIELD_NUMBER = 6;
            public static final int ESTIMATED_PRICE_FIELD_NUMBER = 3;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 7;
            public static final int STATUS_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private StringValue adResponse_;
            private volatile Object adUnitId_;
            private Error error_;
            private EstimatedPrice estimatedPrice_;
            private byte memoizedIsInitialized;
            private double price_;
            private StringValue serverParams_;
            private int status_;
            private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
            private static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.1
                @Override // com.explorestack.protobuf.Parser
                public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new AdUnit(codedInputStream, extensionRegistryLite);
                }
            };

            /* loaded from: classes9.dex */
            public static final class Error extends GeneratedMessageV3 implements ErrorOrBuilder {
                public static final int CODE_FIELD_NUMBER = 1;
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private int code_;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final Parser<Error> PARSER = new AbstractParser<Error>() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.1
                    @Override // com.explorestack.protobuf.Parser
                    public Error parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Error(codedInputStream, extensionRegistryLite);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.f97435xd32ad377;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Parser<Error> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return super.equals(obj);
                    }
                    Error error = (Error) obj;
                    if (getCode() == error.getCode() && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public int getCode() {
                    return this.code_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Parser<Error> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = this.code_;
                    int i3 = 0;
                    if (i2 != 0) {
                        i3 = 0 + CodedOutputStream.computeSInt32Size(1, i2);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        i3 += GeneratedMessageV3.computeStringSize(2, this.description_);
                    }
                    int serializedSize = i3 + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WaterfallProto.f97436x7fe692f5.ensureFieldAccessorsInitialized(Error.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Error();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i = this.code_;
                    if (i != 0) {
                        codedOutputStream.writeSInt32(1, i);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.description_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                /* loaded from: classes9.dex */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ErrorOrBuilder {
                    private int code_;
                    private Object description_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return WaterfallProto.f97435xd32ad377;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                    }

                    public Builder clearCode() {
                        this.code_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public int getCode() {
                        return this.code_;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.description_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public ByteString getDescriptionBytes() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.description_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return WaterfallProto.f97435xd32ad377;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return WaterfallProto.f97436x7fe692f5.ensureFieldAccessorsInitialized(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder setCode(int i) {
                        this.code_ = i;
                        onChanged();
                        return this;
                    }

                    public Builder setDescription(String str) {
                        str.getClass();
                        this.description_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) {
                        byteString.getClass();
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.description_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error build() {
                        Error buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error buildPartial() {
                        Error error = new Error(this);
                        error.code_ = this.code_;
                        error.description_ = this.description_;
                        onBuilt();
                        return error;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public Error getDefaultInstanceForType() {
                        return Error.getDefaultInstance();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                        return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (Builder) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.code_ = 0;
                        this.description_ = "";
                        return this;
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public Builder mo110022clone() {
                        return (Builder) super.mo110022clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Error) {
                            return mergeFrom((Error) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Error error) {
                        if (error == Error.getDefaultInstance()) {
                            return this;
                        }
                        if (error.getCode() != 0) {
                            setCode(error.getCode());
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(((GeneratedMessageV3) error).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.access$5600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error r3 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            if (r3 == 0) goto L10
                            r2.mergeFrom(r3)
                        L10:
                            return r2
                        L11:
                            r3 = move-exception
                            goto L21
                        L13:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                            io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error r4 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error) r4     // Catch: java.lang.Throwable -> L11
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                            throw r3     // Catch: java.lang.Throwable -> L1f
                        L1f:
                            r3 = move-exception
                            r0 = r4
                        L21:
                            if (r0 == 0) goto L26
                            r2.mergeFrom(r0)
                        L26:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error$Builder");
                    }
                }

                public static Builder newBuilder(Error error) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
                }

                public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                private Error(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Error getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Error() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.description_ = "";
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Error parseFrom(InputStream inputStream) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                private Error(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this();
                    extensionRegistryLite.getClass();
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                try {
                                    int readTag = codedInputStream.readTag();
                                    if (readTag != 0) {
                                        if (readTag == 8) {
                                            this.code_ = codedInputStream.readSInt32();
                                        } else if (readTag != 18) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            this.description_ = codedInputStream.readStringRequireUtf8();
                                        }
                                    }
                                    z = true;
                                } catch (InvalidProtocolBufferException e) {
                                    throw e.setUnfinishedMessage(this);
                                }
                            } catch (IOException e2) {
                                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                            }
                        } finally {
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                        }
                    }
                }

                public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            /* loaded from: classes9.dex */
            public interface ErrorOrBuilder extends MessageOrBuilder {
                int getCode();

                String getDescription();

                ByteString getDescriptionBytes();
            }

            /* loaded from: classes9.dex */
            public enum Status implements ProtocolMessageEnum {
                STATUS_INVALID(0),
                STATUS_SUCCESS(1),
                STATUS_ERROR(2),
                STATUS_SKIPPED(3),
                UNRECOGNIZED(-1);
                
                public static final int STATUS_ERROR_VALUE = 2;
                public static final int STATUS_INVALID_VALUE = 0;
                public static final int STATUS_SKIPPED_VALUE = 3;
                public static final int STATUS_SUCCESS_VALUE = 1;
                private final int value;
                private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Status.1
                    @Override // com.explorestack.protobuf.Internal.EnumLiteMap
                    public Status findValueByNumber(int i) {
                        return Status.forNumber(i);
                    }
                };
                private static final Status[] VALUES = values();

                Status(int i) {
                    this.value = i;
                }

                public static Status forNumber(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return null;
                                }
                                return STATUS_SKIPPED;
                            }
                            return STATUS_ERROR;
                        }
                        return STATUS_SUCCESS;
                    }
                    return STATUS_INVALID;
                }

                public static final Descriptors.EnumDescriptor getDescriptor() {
                    return AdUnit.getDescriptor().getEnumTypes().get(0);
                }

                public static Internal.EnumLiteMap<Status> internalGetValueMap() {
                    return internalValueMap;
                }

                @Override // com.explorestack.protobuf.ProtocolMessageEnum
                public final Descriptors.EnumDescriptor getDescriptorForType() {
                    return getDescriptor();
                }

                @Override // com.explorestack.protobuf.ProtocolMessageEnum, com.explorestack.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.value;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Override // com.explorestack.protobuf.ProtocolMessageEnum
                public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                    if (this != UNRECOGNIZED) {
                        return getDescriptor().getValues().get(ordinal());
                    }
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }

                @Deprecated
                public static Status valueOf(int i) {
                    return forNumber(i);
                }

                public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                    if (enumValueDescriptor.getType() == getDescriptor()) {
                        if (enumValueDescriptor.getIndex() == -1) {
                            return UNRECOGNIZED;
                        }
                        return VALUES[enumValueDescriptor.getIndex()];
                    }
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
            }

            public static AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.f97437xc76bb180;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<AdUnit> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdUnit)) {
                    return super.equals(obj);
                }
                AdUnit adUnit = (AdUnit) obj;
                if (!getAdUnitId().equals(adUnit.getAdUnitId()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(adUnit.getPrice()) || hasEstimatedPrice() != adUnit.hasEstimatedPrice()) {
                    return false;
                }
                if ((hasEstimatedPrice() && !getEstimatedPrice().equals(adUnit.getEstimatedPrice())) || hasAdResponse() != adUnit.hasAdResponse()) {
                    return false;
                }
                if ((hasAdResponse() && !getAdResponse().equals(adUnit.getAdResponse())) || this.status_ != adUnit.status_ || hasError() != adUnit.hasError()) {
                    return false;
                }
                if ((hasError() && !getError().equals(adUnit.getError())) || hasServerParams() != adUnit.hasServerParams()) {
                    return false;
                }
                if ((!hasServerParams() || getServerParams().equals(adUnit.getServerParams())) && this.unknownFields.equals(adUnit.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValue getAdResponse() {
                StringValue stringValue = this.adResponse_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValueOrBuilder getAdResponseOrBuilder() {
                return getAdResponse();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public Error getError() {
                Error error = this.error_;
                if (error == null) {
                    return Error.getDefaultInstance();
                }
                return error;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public EstimatedPrice getEstimatedPrice() {
                EstimatedPrice estimatedPrice = this.estimatedPrice_;
                if (estimatedPrice == null) {
                    return EstimatedPrice.getDefaultInstance();
                }
                return estimatedPrice;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                return getEstimatedPrice();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<AdUnit> getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!getAdUnitIdBytes().isEmpty()) {
                    i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.adUnitId_);
                }
                double d = this.price_;
                if (d != 0.0d) {
                    i2 += CodedOutputStream.computeDoubleSize(2, d);
                }
                if (this.estimatedPrice_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(4, getAdResponse());
                }
                if (this.status_ != Status.STATUS_INVALID.getNumber()) {
                    i2 += CodedOutputStream.computeEnumSize(5, this.status_);
                }
                if (this.error_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(6, getError());
                }
                if (this.serverParams_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(7, getServerParams());
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValueOrBuilder getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public Status getStatus() {
                Status valueOf = Status.valueOf(this.status_);
                if (valueOf == null) {
                    return Status.UNRECOGNIZED;
                }
                return valueOf;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasAdResponse() {
                if (this.adResponse_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasError() {
                if (this.error_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasEstimatedPrice() {
                if (this.estimatedPrice_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasServerParams() {
                if (this.serverParams_ != null) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdUnitId().hashCode()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getPrice()));
                if (hasEstimatedPrice()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getEstimatedPrice().hashCode();
                }
                if (hasAdResponse()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getAdResponse().hashCode();
                }
                int i2 = (((hashCode * 37) + 5) * 53) + this.status_;
                if (hasError()) {
                    i2 = (((i2 * 37) + 6) * 53) + getError().hashCode();
                }
                if (hasServerParams()) {
                    i2 = (((i2 * 37) + 7) * 53) + getServerParams().hashCode();
                }
                int hashCode2 = (i2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97438xc2d157fe.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new AdUnit();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getAdUnitIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.adUnitId_);
                }
                double d = this.price_;
                if (d != 0.0d) {
                    codedOutputStream.writeDouble(2, d);
                }
                if (this.estimatedPrice_ != null) {
                    codedOutputStream.writeMessage(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    codedOutputStream.writeMessage(4, getAdResponse());
                }
                if (this.status_ != Status.STATUS_INVALID.getNumber()) {
                    codedOutputStream.writeEnum(5, this.status_);
                }
                if (this.error_ != null) {
                    codedOutputStream.writeMessage(6, getError());
                }
                if (this.serverParams_ != null) {
                    codedOutputStream.writeMessage(7, getServerParams());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> adResponseBuilder_;
                private StringValue adResponse_;
                private Object adUnitId_;
                private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
                private Error error_;
                private SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> estimatedPriceBuilder_;
                private EstimatedPrice estimatedPrice_;
                private double price_;
                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> serverParamsBuilder_;
                private StringValue serverParams_;
                private int status_;

                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getAdResponseFieldBuilder() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponseBuilder_ = new SingleFieldBuilderV3<>(getAdResponse(), getParentForChildren(), isClean());
                        this.adResponse_ = null;
                    }
                    return this.adResponseBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.f97437xc76bb180;
                }

                private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new SingleFieldBuilderV3<>(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> getEstimatedPriceFieldBuilder() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPriceBuilder_ = new SingleFieldBuilderV3<>(getEstimatedPrice(), getParentForChildren(), isClean());
                        this.estimatedPrice_ = null;
                    }
                    return this.estimatedPriceBuilder_;
                }

                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new SingleFieldBuilderV3<>(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public Builder clearAdResponse() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                        onChanged();
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = AdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearError() {
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                        onChanged();
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                        onChanged();
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                    } else {
                        this.serverParams_ = null;
                        this.serverParamsBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearStatus() {
                    this.status_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValue getAdResponse() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue = this.adResponse_;
                        if (stringValue == null) {
                            return StringValue.getDefaultInstance();
                        }
                        return stringValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public StringValue.Builder getAdResponseBuilder() {
                    onChanged();
                    return getAdResponseFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValueOrBuilder getAdResponseOrBuilder() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.adResponse_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adUnitId_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adUnitId_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.f97437xc76bb180;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public Error getError() {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Error error = this.error_;
                        if (error == null) {
                            return Error.getDefaultInstance();
                        }
                        return error;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public Error.Builder getErrorBuilder() {
                    onChanged();
                    return getErrorFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Error error = this.error_;
                    if (error == null) {
                        return Error.getDefaultInstance();
                    }
                    return error;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public EstimatedPrice getEstimatedPrice() {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                        if (estimatedPrice == null) {
                            return EstimatedPrice.getDefaultInstance();
                        }
                        return estimatedPrice;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public EstimatedPrice.Builder getEstimatedPriceBuilder() {
                    onChanged();
                    return getEstimatedPriceFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    if (estimatedPrice == null) {
                        return EstimatedPrice.getDefaultInstance();
                    }
                    return estimatedPrice;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValue getServerParams() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue = this.serverParams_;
                        if (stringValue == null) {
                            return StringValue.getDefaultInstance();
                        }
                        return stringValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return getServerParamsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValueOrBuilder getServerParamsOrBuilder() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.serverParams_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public Status getStatus() {
                    Status valueOf = Status.valueOf(this.status_);
                    if (valueOf == null) {
                        return Status.UNRECOGNIZED;
                    }
                    return valueOf;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public int getStatusValue() {
                    return this.status_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasAdResponse() {
                    if (this.adResponseBuilder_ == null && this.adResponse_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasError() {
                    if (this.errorBuilder_ == null && this.error_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null && this.estimatedPrice_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasServerParams() {
                    if (this.serverParamsBuilder_ == null && this.serverParams_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WaterfallProto.f97438xc2d157fe.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAdResponse(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue2 = this.adResponse_;
                        if (stringValue2 != null) {
                            this.adResponse_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.adResponse_ = stringValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(stringValue);
                    }
                    return this;
                }

                public Builder mergeError(Error error) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Error error2 = this.error_;
                        if (error2 != null) {
                            this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                        } else {
                            this.error_ = error;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(error);
                    }
                    return this;
                }

                public Builder mergeEstimatedPrice(EstimatedPrice estimatedPrice) {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        EstimatedPrice estimatedPrice2 = this.estimatedPrice_;
                        if (estimatedPrice2 != null) {
                            this.estimatedPrice_ = EstimatedPrice.newBuilder(estimatedPrice2).mergeFrom(estimatedPrice).buildPartial();
                        } else {
                            this.estimatedPrice_ = estimatedPrice;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(estimatedPrice);
                    }
                    return this;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue2 = this.serverParams_;
                        if (stringValue2 != null) {
                            this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.serverParams_ = stringValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(stringValue);
                    }
                    return this;
                }

                public Builder setAdResponse(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        stringValue.getClass();
                        this.adResponse_ = stringValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(stringValue);
                    }
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setError(Error error) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        error.getClass();
                        this.error_ = error;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(error);
                    }
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice estimatedPrice) {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        estimatedPrice.getClass();
                        this.estimatedPrice_ = estimatedPrice;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(estimatedPrice);
                    }
                    return this;
                }

                public Builder setPrice(double d) {
                    this.price_ = d;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        stringValue.getClass();
                        this.serverParams_ = stringValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(stringValue);
                    }
                    return this;
                }

                public Builder setStatus(Status status) {
                    status.getClass();
                    this.status_ = status.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setStatusValue(int i) {
                    this.status_ = i;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.adUnitId_ = "";
                    this.status_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit build() {
                    AdUnit buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit buildPartial() {
                    AdUnit adUnit = new AdUnit(this);
                    adUnit.adUnitId_ = this.adUnitId_;
                    adUnit.price_ = this.price_;
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        adUnit.estimatedPrice_ = this.estimatedPrice_;
                    } else {
                        adUnit.estimatedPrice_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV32 = this.adResponseBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        adUnit.adResponse_ = this.adResponse_;
                    } else {
                        adUnit.adResponse_ = singleFieldBuilderV32.build();
                    }
                    adUnit.status_ = this.status_;
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV33 = this.errorBuilder_;
                    if (singleFieldBuilderV33 == null) {
                        adUnit.error_ = this.error_;
                    } else {
                        adUnit.error_ = singleFieldBuilderV33.build();
                    }
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV34 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV34 == null) {
                        adUnit.serverParams_ = this.serverParams_;
                    } else {
                        adUnit.serverParams_ = singleFieldBuilderV34.build();
                    }
                    onBuilt();
                    return adUnit;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public AdUnit getDefaultInstanceForType() {
                    return AdUnit.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.adUnitId_ = "";
                    this.price_ = 0.0d;
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    this.status_ = 0;
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                    } else {
                        this.serverParams_ = null;
                        this.serverParamsBuilder_ = null;
                    }
                    return this;
                }

                public Builder setAdResponse(StringValue.Builder builder) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.adResponse_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setError(Error.Builder builder) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.error_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice.Builder builder) {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.estimatedPrice_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.adUnitId_ = "";
                    this.status_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo110022clone() {
                    return (Builder) super.mo110022clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdUnit) {
                        return mergeFrom((AdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdUnit adUnit) {
                    if (adUnit == AdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (!adUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = adUnit.adUnitId_;
                        onChanged();
                    }
                    if (adUnit.getPrice() != 0.0d) {
                        setPrice(adUnit.getPrice());
                    }
                    if (adUnit.hasEstimatedPrice()) {
                        mergeEstimatedPrice(adUnit.getEstimatedPrice());
                    }
                    if (adUnit.hasAdResponse()) {
                        mergeAdResponse(adUnit.getAdResponse());
                    }
                    if (adUnit.status_ != 0) {
                        setStatusValue(adUnit.getStatusValue());
                    }
                    if (adUnit.hasError()) {
                        mergeError(adUnit.getError());
                    }
                    if (adUnit.hasServerParams()) {
                        mergeServerParams(adUnit.getServerParams());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) adUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Result.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Result.AdUnit.access$7100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$AdUnit r3 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        if (r3 == 0) goto L10
                        r2.mergeFrom(r3)
                    L10:
                        return r2
                    L11:
                        r3 = move-exception
                        goto L21
                    L13:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                        io.bidmachine.protobuf.Waterfall$Result$AdUnit r4 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit) r4     // Catch: java.lang.Throwable -> L11
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                        throw r3     // Catch: java.lang.Throwable -> L1f
                    L1f:
                        r3 = move-exception
                        r0 = r4
                    L21:
                        if (r0 == 0) goto L26
                        r2.mergeFrom(r0)
                    L26:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Result$AdUnit$Builder");
                }
            }

            public static Builder newBuilder(AdUnit adUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private AdUnit(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
                this.status_ = 0;
            }

            public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static AdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static AdUnit parseFrom(InputStream inputStream) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            private AdUnit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.adUnitId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 17) {
                                    if (readTag == 26) {
                                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                                        EstimatedPrice.Builder builder = estimatedPrice != null ? estimatedPrice.toBuilder() : null;
                                        EstimatedPrice estimatedPrice2 = (EstimatedPrice) codedInputStream.readMessage(EstimatedPrice.parser(), extensionRegistryLite);
                                        this.estimatedPrice_ = estimatedPrice2;
                                        if (builder != null) {
                                            builder.mergeFrom(estimatedPrice2);
                                            this.estimatedPrice_ = builder.buildPartial();
                                        }
                                    } else if (readTag == 34) {
                                        StringValue stringValue = this.adResponse_;
                                        StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                        this.adResponse_ = stringValue2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(stringValue2);
                                            this.adResponse_ = builder2.buildPartial();
                                        }
                                    } else if (readTag == 40) {
                                        this.status_ = codedInputStream.readEnum();
                                    } else if (readTag == 50) {
                                        Error error = this.error_;
                                        Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                        Error error2 = (Error) codedInputStream.readMessage(Error.parser(), extensionRegistryLite);
                                        this.error_ = error2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(error2);
                                            this.error_ = builder3.buildPartial();
                                        }
                                    } else if (readTag != 58) {
                                        if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                        }
                                    } else {
                                        StringValue stringValue3 = this.serverParams_;
                                        StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                        StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                        this.serverParams_ = stringValue4;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(stringValue4);
                                            this.serverParams_ = builder4.buildPartial();
                                        }
                                    }
                                } else {
                                    this.price_ = codedInputStream.readDouble();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } finally {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static AdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static AdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes9.dex */
        public interface AdUnitOrBuilder extends MessageOrBuilder {
            StringValue getAdResponse();

            StringValueOrBuilder getAdResponseOrBuilder();

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            AdUnit.Error getError();

            AdUnit.ErrorOrBuilder getErrorOrBuilder();

            EstimatedPrice getEstimatedPrice();

            EstimatedPriceOrBuilder getEstimatedPriceOrBuilder();

            double getPrice();

            StringValue getServerParams();

            StringValueOrBuilder getServerParamsOrBuilder();

            AdUnit.Status getStatus();

            int getStatusValue();

            boolean hasAdResponse();

            boolean hasError();

            boolean hasEstimatedPrice();

            boolean hasServerParams();
        }

        /* loaded from: classes9.dex */
        public static final class CachedAdUnit extends GeneratedMessageV3 implements CachedAdUnitOrBuilder {
            public static final int AD_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_UNIT_ID_FIELD_NUMBER = 1;
            public static final int ESTIMATED_PRICE_FIELD_NUMBER = 3;
            public static final int FROZEN_FIELD_NUMBER = 5;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private StringValue adResponse_;
            private volatile Object adUnitId_;
            private EstimatedPrice estimatedPrice_;
            private boolean frozen_;
            private byte memoizedIsInitialized;
            private double price_;
            private StringValue serverParams_;
            private static final CachedAdUnit DEFAULT_INSTANCE = new CachedAdUnit();
            private static final Parser<CachedAdUnit> PARSER = new AbstractParser<CachedAdUnit>() { // from class: io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.1
                @Override // com.explorestack.protobuf.Parser
                public CachedAdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new CachedAdUnit(codedInputStream, extensionRegistryLite);
                }
            };

            public static CachedAdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.f97439x368861be;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static CachedAdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CachedAdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static CachedAdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<CachedAdUnit> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CachedAdUnit)) {
                    return super.equals(obj);
                }
                CachedAdUnit cachedAdUnit = (CachedAdUnit) obj;
                if (!getAdUnitId().equals(cachedAdUnit.getAdUnitId()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(cachedAdUnit.getPrice()) || hasEstimatedPrice() != cachedAdUnit.hasEstimatedPrice()) {
                    return false;
                }
                if ((hasEstimatedPrice() && !getEstimatedPrice().equals(cachedAdUnit.getEstimatedPrice())) || hasAdResponse() != cachedAdUnit.hasAdResponse()) {
                    return false;
                }
                if ((hasAdResponse() && !getAdResponse().equals(cachedAdUnit.getAdResponse())) || getFrozen() != cachedAdUnit.getFrozen() || hasServerParams() != cachedAdUnit.hasServerParams()) {
                    return false;
                }
                if ((!hasServerParams() || getServerParams().equals(cachedAdUnit.getServerParams())) && this.unknownFields.equals(cachedAdUnit.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValue getAdResponse() {
                StringValue stringValue = this.adResponse_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValueOrBuilder getAdResponseOrBuilder() {
                return getAdResponse();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public EstimatedPrice getEstimatedPrice() {
                EstimatedPrice estimatedPrice = this.estimatedPrice_;
                if (estimatedPrice == null) {
                    return EstimatedPrice.getDefaultInstance();
                }
                return estimatedPrice;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                return getEstimatedPrice();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean getFrozen() {
                return this.frozen_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<CachedAdUnit> getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!getAdUnitIdBytes().isEmpty()) {
                    i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.adUnitId_);
                }
                double d = this.price_;
                if (d != 0.0d) {
                    i2 += CodedOutputStream.computeDoubleSize(2, d);
                }
                if (this.estimatedPrice_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(4, getAdResponse());
                }
                boolean z = this.frozen_;
                if (z) {
                    i2 += CodedOutputStream.computeBoolSize(5, z);
                }
                if (this.serverParams_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(6, getServerParams());
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValueOrBuilder getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasAdResponse() {
                if (this.adResponse_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasEstimatedPrice() {
                if (this.estimatedPrice_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasServerParams() {
                if (this.serverParams_ != null) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdUnitId().hashCode()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getPrice()));
                if (hasEstimatedPrice()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getEstimatedPrice().hashCode();
                }
                if (hasAdResponse()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getAdResponse().hashCode();
                }
                int hashBoolean = (((hashCode * 37) + 5) * 53) + Internal.hashBoolean(getFrozen());
                if (hasServerParams()) {
                    hashBoolean = (((hashBoolean * 37) + 6) * 53) + getServerParams().hashCode();
                }
                int hashCode2 = (hashBoolean * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97440x4ad0ea3c.ensureFieldAccessorsInitialized(CachedAdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new CachedAdUnit();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getAdUnitIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.adUnitId_);
                }
                double d = this.price_;
                if (d != 0.0d) {
                    codedOutputStream.writeDouble(2, d);
                }
                if (this.estimatedPrice_ != null) {
                    codedOutputStream.writeMessage(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    codedOutputStream.writeMessage(4, getAdResponse());
                }
                boolean z = this.frozen_;
                if (z) {
                    codedOutputStream.writeBool(5, z);
                }
                if (this.serverParams_ != null) {
                    codedOutputStream.writeMessage(6, getServerParams());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CachedAdUnitOrBuilder {
                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> adResponseBuilder_;
                private StringValue adResponse_;
                private Object adUnitId_;
                private SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> estimatedPriceBuilder_;
                private EstimatedPrice estimatedPrice_;
                private boolean frozen_;
                private double price_;
                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> serverParamsBuilder_;
                private StringValue serverParams_;

                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getAdResponseFieldBuilder() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponseBuilder_ = new SingleFieldBuilderV3<>(getAdResponse(), getParentForChildren(), isClean());
                        this.adResponse_ = null;
                    }
                    return this.adResponseBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.f97439x368861be;
                }

                private SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> getEstimatedPriceFieldBuilder() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPriceBuilder_ = new SingleFieldBuilderV3<>(getEstimatedPrice(), getParentForChildren(), isClean());
                        this.estimatedPrice_ = null;
                    }
                    return this.estimatedPriceBuilder_;
                }

                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new SingleFieldBuilderV3<>(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public Builder clearAdResponse() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                        onChanged();
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = CachedAdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                        onChanged();
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearFrozen() {
                    this.frozen_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                    } else {
                        this.serverParams_ = null;
                        this.serverParamsBuilder_ = null;
                    }
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValue getAdResponse() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue = this.adResponse_;
                        if (stringValue == null) {
                            return StringValue.getDefaultInstance();
                        }
                        return stringValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public StringValue.Builder getAdResponseBuilder() {
                    onChanged();
                    return getAdResponseFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValueOrBuilder getAdResponseOrBuilder() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.adResponse_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adUnitId_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adUnitId_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.f97439x368861be;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public EstimatedPrice getEstimatedPrice() {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                        if (estimatedPrice == null) {
                            return EstimatedPrice.getDefaultInstance();
                        }
                        return estimatedPrice;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public EstimatedPrice.Builder getEstimatedPriceBuilder() {
                    onChanged();
                    return getEstimatedPriceFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    if (estimatedPrice == null) {
                        return EstimatedPrice.getDefaultInstance();
                    }
                    return estimatedPrice;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean getFrozen() {
                    return this.frozen_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValue getServerParams() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue = this.serverParams_;
                        if (stringValue == null) {
                            return StringValue.getDefaultInstance();
                        }
                        return stringValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return getServerParamsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValueOrBuilder getServerParamsOrBuilder() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.serverParams_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasAdResponse() {
                    if (this.adResponseBuilder_ == null && this.adResponse_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null && this.estimatedPrice_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasServerParams() {
                    if (this.serverParamsBuilder_ == null && this.serverParams_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WaterfallProto.f97440x4ad0ea3c.ensureFieldAccessorsInitialized(CachedAdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAdResponse(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue2 = this.adResponse_;
                        if (stringValue2 != null) {
                            this.adResponse_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.adResponse_ = stringValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(stringValue);
                    }
                    return this;
                }

                public Builder mergeEstimatedPrice(EstimatedPrice estimatedPrice) {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        EstimatedPrice estimatedPrice2 = this.estimatedPrice_;
                        if (estimatedPrice2 != null) {
                            this.estimatedPrice_ = EstimatedPrice.newBuilder(estimatedPrice2).mergeFrom(estimatedPrice).buildPartial();
                        } else {
                            this.estimatedPrice_ = estimatedPrice;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(estimatedPrice);
                    }
                    return this;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue2 = this.serverParams_;
                        if (stringValue2 != null) {
                            this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.serverParams_ = stringValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(stringValue);
                    }
                    return this;
                }

                public Builder setAdResponse(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        stringValue.getClass();
                        this.adResponse_ = stringValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(stringValue);
                    }
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice estimatedPrice) {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        estimatedPrice.getClass();
                        this.estimatedPrice_ = estimatedPrice;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(estimatedPrice);
                    }
                    return this;
                }

                public Builder setFrozen(boolean z) {
                    this.frozen_ = z;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d) {
                    this.price_ = d;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        stringValue.getClass();
                        this.serverParams_ = stringValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(stringValue);
                    }
                    return this;
                }

                private Builder() {
                    this.adUnitId_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public CachedAdUnit build() {
                    CachedAdUnit buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public CachedAdUnit buildPartial() {
                    CachedAdUnit cachedAdUnit = new CachedAdUnit(this);
                    cachedAdUnit.adUnitId_ = this.adUnitId_;
                    cachedAdUnit.price_ = this.price_;
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        cachedAdUnit.estimatedPrice_ = this.estimatedPrice_;
                    } else {
                        cachedAdUnit.estimatedPrice_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV32 = this.adResponseBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        cachedAdUnit.adResponse_ = this.adResponse_;
                    } else {
                        cachedAdUnit.adResponse_ = singleFieldBuilderV32.build();
                    }
                    cachedAdUnit.frozen_ = this.frozen_;
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV33 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV33 == null) {
                        cachedAdUnit.serverParams_ = this.serverParams_;
                    } else {
                        cachedAdUnit.serverParams_ = singleFieldBuilderV33.build();
                    }
                    onBuilt();
                    return cachedAdUnit;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public CachedAdUnit getDefaultInstanceForType() {
                    return CachedAdUnit.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.adUnitId_ = "";
                    this.price_ = 0.0d;
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    this.frozen_ = false;
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                    } else {
                        this.serverParams_ = null;
                        this.serverParamsBuilder_ = null;
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.adUnitId_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setAdResponse(StringValue.Builder builder) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.adResponseBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.adResponse_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice.Builder builder) {
                    SingleFieldBuilderV3<EstimatedPrice, EstimatedPrice.Builder, EstimatedPriceOrBuilder> singleFieldBuilderV3 = this.estimatedPriceBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.estimatedPrice_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo110022clone() {
                    return (Builder) super.mo110022clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof CachedAdUnit) {
                        return mergeFrom((CachedAdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(CachedAdUnit cachedAdUnit) {
                    if (cachedAdUnit == CachedAdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (!cachedAdUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = cachedAdUnit.adUnitId_;
                        onChanged();
                    }
                    if (cachedAdUnit.getPrice() != 0.0d) {
                        setPrice(cachedAdUnit.getPrice());
                    }
                    if (cachedAdUnit.hasEstimatedPrice()) {
                        mergeEstimatedPrice(cachedAdUnit.getEstimatedPrice());
                    }
                    if (cachedAdUnit.hasAdResponse()) {
                        mergeAdResponse(cachedAdUnit.getAdResponse());
                    }
                    if (cachedAdUnit.getFrozen()) {
                        setFrozen(cachedAdUnit.getFrozen());
                    }
                    if (cachedAdUnit.hasServerParams()) {
                        mergeServerParams(cachedAdUnit.getServerParams());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) cachedAdUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.access$8500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit r3 = (io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        if (r3 == 0) goto L10
                        r2.mergeFrom(r3)
                    L10:
                        return r2
                    L11:
                        r3 = move-exception
                        goto L21
                    L13:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                        io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit r4 = (io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit) r4     // Catch: java.lang.Throwable -> L11
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                        throw r3     // Catch: java.lang.Throwable -> L1f
                    L1f:
                        r3 = move-exception
                        r0 = r4
                    L21:
                        if (r0 == 0) goto L26
                        r2.mergeFrom(r0)
                    L26:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit$Builder");
                }
            }

            public static Builder newBuilder(CachedAdUnit cachedAdUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(cachedAdUnit);
            }

            public static CachedAdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private CachedAdUnit(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static CachedAdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CachedAdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static CachedAdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public CachedAdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static CachedAdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private CachedAdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
            }

            public static CachedAdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static CachedAdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static CachedAdUnit parseFrom(InputStream inputStream) throws IOException {
                return (CachedAdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            private CachedAdUnit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.adUnitId_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag != 17) {
                                        if (readTag == 26) {
                                            EstimatedPrice estimatedPrice = this.estimatedPrice_;
                                            EstimatedPrice.Builder builder = estimatedPrice != null ? estimatedPrice.toBuilder() : null;
                                            EstimatedPrice estimatedPrice2 = (EstimatedPrice) codedInputStream.readMessage(EstimatedPrice.parser(), extensionRegistryLite);
                                            this.estimatedPrice_ = estimatedPrice2;
                                            if (builder != null) {
                                                builder.mergeFrom(estimatedPrice2);
                                                this.estimatedPrice_ = builder.buildPartial();
                                            }
                                        } else if (readTag == 34) {
                                            StringValue stringValue = this.adResponse_;
                                            StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                            StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                            this.adResponse_ = stringValue2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(stringValue2);
                                                this.adResponse_ = builder2.buildPartial();
                                            }
                                        } else if (readTag == 40) {
                                            this.frozen_ = codedInputStream.readBool();
                                        } else if (readTag != 50) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            StringValue stringValue3 = this.serverParams_;
                                            StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                            StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                            this.serverParams_ = stringValue4;
                                            if (builder3 != null) {
                                                builder3.mergeFrom(stringValue4);
                                                this.serverParams_ = builder3.buildPartial();
                                            }
                                        }
                                    } else {
                                        this.price_ = codedInputStream.readDouble();
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } finally {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static CachedAdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CachedAdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static CachedAdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (CachedAdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static CachedAdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CachedAdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes9.dex */
        public interface CachedAdUnitOrBuilder extends MessageOrBuilder {
            StringValue getAdResponse();

            StringValueOrBuilder getAdResponseOrBuilder();

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            EstimatedPrice getEstimatedPrice();

            EstimatedPriceOrBuilder getEstimatedPriceOrBuilder();

            boolean getFrozen();

            double getPrice();

            StringValue getServerParams();

            StringValueOrBuilder getServerParamsOrBuilder();

            boolean hasAdResponse();

            boolean hasEstimatedPrice();

            boolean hasServerParams();
        }

        /* loaded from: classes9.dex */
        public static final class EstimatedPrice extends GeneratedMessageV3 implements EstimatedPriceOrBuilder {
            public static final int CURRENCY_FIELD_NUMBER = 3;
            private static final EstimatedPrice DEFAULT_INSTANCE = new EstimatedPrice();
            private static final Parser<EstimatedPrice> PARSER = new AbstractParser<EstimatedPrice>() { // from class: io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.1
                @Override // com.explorestack.protobuf.Parser
                public EstimatedPrice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new EstimatedPrice(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int PRECISION_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private StringValue currency_;
            private byte memoizedIsInitialized;
            private UInt32Value precision_;
            private DoubleValue value_;

            public static EstimatedPrice getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.f97441x5e9cde9a;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EstimatedPrice parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EstimatedPrice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EstimatedPrice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<EstimatedPrice> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EstimatedPrice)) {
                    return super.equals(obj);
                }
                EstimatedPrice estimatedPrice = (EstimatedPrice) obj;
                if (hasValue() != estimatedPrice.hasValue()) {
                    return false;
                }
                if ((hasValue() && !getValue().equals(estimatedPrice.getValue())) || hasPrecision() != estimatedPrice.hasPrecision()) {
                    return false;
                }
                if ((hasPrecision() && !getPrecision().equals(estimatedPrice.getPrecision())) || hasCurrency() != estimatedPrice.hasCurrency()) {
                    return false;
                }
                if ((!hasCurrency() || getCurrency().equals(estimatedPrice.getCurrency())) && this.unknownFields.equals(estimatedPrice.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public StringValue getCurrency() {
                StringValue stringValue = this.currency_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public StringValueOrBuilder getCurrencyOrBuilder() {
                return getCurrency();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<EstimatedPrice> getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public UInt32Value getPrecision() {
                UInt32Value uInt32Value = this.precision_;
                if (uInt32Value == null) {
                    return UInt32Value.getDefaultInstance();
                }
                return uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public UInt32ValueOrBuilder getPrecisionOrBuilder() {
                return getPrecision();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (this.value_ != null) {
                    i2 = 0 + CodedOutputStream.computeMessageSize(1, getValue());
                }
                if (this.precision_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(2, getPrecision());
                }
                if (this.currency_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(3, getCurrency());
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public DoubleValue getValue() {
                DoubleValue doubleValue = this.value_;
                if (doubleValue == null) {
                    return DoubleValue.getDefaultInstance();
                }
                return doubleValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public DoubleValueOrBuilder getValueOrBuilder() {
                return getValue();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasCurrency() {
                if (this.currency_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasPrecision() {
                if (this.precision_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasValue() {
                if (this.value_ != null) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = 779 + getDescriptor().hashCode();
                if (hasValue()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getValue().hashCode();
                }
                if (hasPrecision()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getPrecision().hashCode();
                }
                if (hasCurrency()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getCurrency().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97442xaf78cb18.ensureFieldAccessorsInitialized(EstimatedPrice.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new EstimatedPrice();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.value_ != null) {
                    codedOutputStream.writeMessage(1, getValue());
                }
                if (this.precision_ != null) {
                    codedOutputStream.writeMessage(2, getPrecision());
                }
                if (this.currency_ != null) {
                    codedOutputStream.writeMessage(3, getCurrency());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EstimatedPriceOrBuilder {
                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> currencyBuilder_;
                private StringValue currency_;
                private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> precisionBuilder_;
                private UInt32Value precision_;
                private SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> valueBuilder_;
                private DoubleValue value_;

                private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getCurrencyFieldBuilder() {
                    if (this.currencyBuilder_ == null) {
                        this.currencyBuilder_ = new SingleFieldBuilderV3<>(getCurrency(), getParentForChildren(), isClean());
                        this.currency_ = null;
                    }
                    return this.currencyBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.f97441x5e9cde9a;
                }

                private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getPrecisionFieldBuilder() {
                    if (this.precisionBuilder_ == null) {
                        this.precisionBuilder_ = new SingleFieldBuilderV3<>(getPrecision(), getParentForChildren(), isClean());
                        this.precision_ = null;
                    }
                    return this.precisionBuilder_;
                }

                private SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> getValueFieldBuilder() {
                    if (this.valueBuilder_ == null) {
                        this.valueBuilder_ = new SingleFieldBuilderV3<>(getValue(), getParentForChildren(), isClean());
                        this.value_ = null;
                    }
                    return this.valueBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public Builder clearCurrency() {
                    if (this.currencyBuilder_ == null) {
                        this.currency_ = null;
                        onChanged();
                    } else {
                        this.currency_ = null;
                        this.currencyBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearPrecision() {
                    if (this.precisionBuilder_ == null) {
                        this.precision_ = null;
                        onChanged();
                    } else {
                        this.precision_ = null;
                        this.precisionBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearValue() {
                    if (this.valueBuilder_ == null) {
                        this.value_ = null;
                        onChanged();
                    } else {
                        this.value_ = null;
                        this.valueBuilder_ = null;
                    }
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public StringValue getCurrency() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.currencyBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue = this.currency_;
                        if (stringValue == null) {
                            return StringValue.getDefaultInstance();
                        }
                        return stringValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public StringValue.Builder getCurrencyBuilder() {
                    onChanged();
                    return getCurrencyFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public StringValueOrBuilder getCurrencyOrBuilder() {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.currencyBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    StringValue stringValue = this.currency_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.f97441x5e9cde9a;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public UInt32Value getPrecision() {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.precisionBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        UInt32Value uInt32Value = this.precision_;
                        if (uInt32Value == null) {
                            return UInt32Value.getDefaultInstance();
                        }
                        return uInt32Value;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public UInt32Value.Builder getPrecisionBuilder() {
                    onChanged();
                    return getPrecisionFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public UInt32ValueOrBuilder getPrecisionOrBuilder() {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.precisionBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    UInt32Value uInt32Value = this.precision_;
                    if (uInt32Value == null) {
                        return UInt32Value.getDefaultInstance();
                    }
                    return uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public DoubleValue getValue() {
                    SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        DoubleValue doubleValue = this.value_;
                        if (doubleValue == null) {
                            return DoubleValue.getDefaultInstance();
                        }
                        return doubleValue;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public DoubleValue.Builder getValueBuilder() {
                    onChanged();
                    return getValueFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public DoubleValueOrBuilder getValueOrBuilder() {
                    SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    DoubleValue doubleValue = this.value_;
                    if (doubleValue == null) {
                        return DoubleValue.getDefaultInstance();
                    }
                    return doubleValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasCurrency() {
                    if (this.currencyBuilder_ == null && this.currency_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasPrecision() {
                    if (this.precisionBuilder_ == null && this.precision_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasValue() {
                    if (this.valueBuilder_ == null && this.value_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WaterfallProto.f97442xaf78cb18.ensureFieldAccessorsInitialized(EstimatedPrice.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeCurrency(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.currencyBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        StringValue stringValue2 = this.currency_;
                        if (stringValue2 != null) {
                            this.currency_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.currency_ = stringValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(stringValue);
                    }
                    return this;
                }

                public Builder mergePrecision(UInt32Value uInt32Value) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.precisionBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        UInt32Value uInt32Value2 = this.precision_;
                        if (uInt32Value2 != null) {
                            this.precision_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                        } else {
                            this.precision_ = uInt32Value;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(uInt32Value);
                    }
                    return this;
                }

                public Builder mergeValue(DoubleValue doubleValue) {
                    SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        DoubleValue doubleValue2 = this.value_;
                        if (doubleValue2 != null) {
                            this.value_ = DoubleValue.newBuilder(doubleValue2).mergeFrom(doubleValue).buildPartial();
                        } else {
                            this.value_ = doubleValue;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(doubleValue);
                    }
                    return this;
                }

                public Builder setCurrency(StringValue stringValue) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.currencyBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        stringValue.getClass();
                        this.currency_ = stringValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(stringValue);
                    }
                    return this;
                }

                public Builder setPrecision(UInt32Value uInt32Value) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.precisionBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        uInt32Value.getClass();
                        this.precision_ = uInt32Value;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(uInt32Value);
                    }
                    return this;
                }

                public Builder setValue(DoubleValue doubleValue) {
                    SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        doubleValue.getClass();
                        this.value_ = doubleValue;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(doubleValue);
                    }
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EstimatedPrice build() {
                    EstimatedPrice buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EstimatedPrice buildPartial() {
                    EstimatedPrice estimatedPrice = new EstimatedPrice(this);
                    SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        estimatedPrice.value_ = this.value_;
                    } else {
                        estimatedPrice.value_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV32 = this.precisionBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        estimatedPrice.precision_ = this.precision_;
                    } else {
                        estimatedPrice.precision_ = singleFieldBuilderV32.build();
                    }
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV33 = this.currencyBuilder_;
                    if (singleFieldBuilderV33 == null) {
                        estimatedPrice.currency_ = this.currency_;
                    } else {
                        estimatedPrice.currency_ = singleFieldBuilderV33.build();
                    }
                    onBuilt();
                    return estimatedPrice;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public EstimatedPrice getDefaultInstanceForType() {
                    return EstimatedPrice.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    if (this.valueBuilder_ == null) {
                        this.value_ = null;
                    } else {
                        this.value_ = null;
                        this.valueBuilder_ = null;
                    }
                    if (this.precisionBuilder_ == null) {
                        this.precision_ = null;
                    } else {
                        this.precision_ = null;
                        this.precisionBuilder_ = null;
                    }
                    if (this.currencyBuilder_ == null) {
                        this.currency_ = null;
                    } else {
                        this.currency_ = null;
                        this.currencyBuilder_ = null;
                    }
                    return this;
                }

                public Builder setCurrency(StringValue.Builder builder) {
                    SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.currencyBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.currency_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setPrecision(UInt32Value.Builder builder) {
                    SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.precisionBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.precision_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder setValue(DoubleValue.Builder builder) {
                    SingleFieldBuilderV3<DoubleValue, DoubleValue.Builder, DoubleValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.value_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo110022clone() {
                    return (Builder) super.mo110022clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof EstimatedPrice) {
                        return mergeFrom((EstimatedPrice) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(EstimatedPrice estimatedPrice) {
                    if (estimatedPrice == EstimatedPrice.getDefaultInstance()) {
                        return this;
                    }
                    if (estimatedPrice.hasValue()) {
                        mergeValue(estimatedPrice.getValue());
                    }
                    if (estimatedPrice.hasPrecision()) {
                        mergePrecision(estimatedPrice.getPrecision());
                    }
                    if (estimatedPrice.hasCurrency()) {
                        mergeCurrency(estimatedPrice.getCurrency());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) estimatedPrice).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.access$4700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice r3 = (io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        if (r3 == 0) goto L10
                        r2.mergeFrom(r3)
                    L10:
                        return r2
                    L11:
                        r3 = move-exception
                        goto L21
                    L13:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                        io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice r4 = (io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice) r4     // Catch: java.lang.Throwable -> L11
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                        throw r3     // Catch: java.lang.Throwable -> L1f
                    L1f:
                        r3 = move-exception
                        r0 = r4
                    L21:
                        if (r0 == 0) goto L26
                        r2.mergeFrom(r0)
                    L26:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice$Builder");
                }
            }

            public static Builder newBuilder(EstimatedPrice estimatedPrice) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(estimatedPrice);
            }

            public static EstimatedPrice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private EstimatedPrice(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EstimatedPrice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EstimatedPrice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static EstimatedPrice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public EstimatedPrice getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static EstimatedPrice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EstimatedPrice() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EstimatedPrice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static EstimatedPrice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private EstimatedPrice(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    DoubleValue doubleValue = this.value_;
                                    DoubleValue.Builder builder = doubleValue != null ? doubleValue.toBuilder() : null;
                                    DoubleValue doubleValue2 = (DoubleValue) codedInputStream.readMessage(DoubleValue.parser(), extensionRegistryLite);
                                    this.value_ = doubleValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(doubleValue2);
                                        this.value_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    UInt32Value uInt32Value = this.precision_;
                                    UInt32Value.Builder builder2 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                    UInt32Value uInt32Value2 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                                    this.precision_ = uInt32Value2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(uInt32Value2);
                                        this.precision_ = builder2.buildPartial();
                                    }
                                } else if (readTag != 26) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    StringValue stringValue = this.currency_;
                                    StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                    this.currency_ = stringValue2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(stringValue2);
                                        this.currency_ = builder3.buildPartial();
                                    }
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } finally {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static EstimatedPrice parseFrom(InputStream inputStream) throws IOException {
                return (EstimatedPrice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static EstimatedPrice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EstimatedPrice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static EstimatedPrice parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (EstimatedPrice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static EstimatedPrice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EstimatedPrice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes9.dex */
        public interface EstimatedPriceOrBuilder extends MessageOrBuilder {
            StringValue getCurrency();

            StringValueOrBuilder getCurrencyOrBuilder();

            UInt32Value getPrecision();

            UInt32ValueOrBuilder getPrecisionOrBuilder();

            DoubleValue getValue();

            DoubleValueOrBuilder getValueOrBuilder();

            boolean hasCurrency();

            boolean hasPrecision();

            boolean hasValue();
        }

        public static Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Result parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Result) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Result parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Result> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return super.equals(obj);
            }
            Result result = (Result) obj;
            if (!getWaterfallId().equals(result.getWaterfallId()) || hasExt() != result.hasExt()) {
                return false;
            }
            if ((hasExt() && !getExt().equals(result.getExt())) || hasFormat() != result.hasFormat()) {
                return false;
            }
            if ((hasFormat() && !getFormat().equals(result.getFormat())) || !getAdUnitResultsList().equals(result.getAdUnitResultsList()) || !getCachedAdUnitsList().equals(result.getCachedAdUnitsList()) || hasServerParams() != result.hasServerParams()) {
                return false;
            }
            if ((!hasServerParams() || getServerParams().equals(result.getServerParams())) && this.unknownFields.equals(result.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public AdUnit getAdUnitResults(int i) {
            return this.adUnitResults_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public int getAdUnitResultsCount() {
            return this.adUnitResults_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<AdUnit> getAdUnitResultsList() {
            return this.adUnitResults_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public AdUnitOrBuilder getAdUnitResultsOrBuilder(int i) {
            return this.adUnitResults_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitResultsOrBuilderList() {
            return this.adUnitResults_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public CachedAdUnit getCachedAdUnits(int i) {
            return this.cachedAdUnits_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public int getCachedAdUnitsCount() {
            return this.cachedAdUnits_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<CachedAdUnit> getCachedAdUnitsList() {
            return this.cachedAdUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i) {
            return this.cachedAdUnits_.get(i);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<? extends CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList() {
            return this.cachedAdUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            if (struct == null) {
                return Struct.getDefaultInstance();
            }
            return struct;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValue getFormat() {
            StringValue stringValue = this.format_;
            if (stringValue == null) {
                return StringValue.getDefaultInstance();
            }
            return stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValueOrBuilder getFormatOrBuilder() {
            return getFormat();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Result> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            if (!getWaterfallIdBytes().isEmpty()) {
                i = GeneratedMessageV3.computeStringSize(1, this.waterfallId_) + 0;
            } else {
                i = 0;
            }
            if (this.ext_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getExt());
            }
            if (this.format_ != null) {
                i += CodedOutputStream.computeMessageSize(3, getFormat());
            }
            for (int i3 = 0; i3 < this.adUnitResults_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(4, this.adUnitResults_.get(i3));
            }
            for (int i4 = 0; i4 < this.cachedAdUnits_.size(); i4++) {
                i += CodedOutputStream.computeMessageSize(5, this.cachedAdUnits_.get(i4));
            }
            if (this.serverParams_ != null) {
                i += CodedOutputStream.computeMessageSize(6, getServerParams());
            }
            int serializedSize = i + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValue getServerParams() {
            StringValue stringValue = this.serverParams_;
            if (stringValue == null) {
                return StringValue.getDefaultInstance();
            }
            return stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValueOrBuilder getServerParamsOrBuilder() {
            return getServerParams();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public String getWaterfallId() {
            Object obj = this.waterfallId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.waterfallId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public ByteString getWaterfallIdBytes() {
            Object obj = this.waterfallId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.waterfallId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasExt() {
            if (this.ext_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasFormat() {
            if (this.format_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasServerParams() {
            if (this.serverParams_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getWaterfallId().hashCode();
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getExt().hashCode();
            }
            if (hasFormat()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getFormat().hashCode();
            }
            if (getAdUnitResultsCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getAdUnitResultsList().hashCode();
            }
            if (getCachedAdUnitsCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getCachedAdUnitsList().hashCode();
            }
            if (hasServerParams()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getServerParams().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WaterfallProto.f97443x117386d4.ensureFieldAccessorsInitialized(Result.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Result();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getWaterfallIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.waterfallId_);
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(2, getExt());
            }
            if (this.format_ != null) {
                codedOutputStream.writeMessage(3, getFormat());
            }
            for (int i = 0; i < this.adUnitResults_.size(); i++) {
                codedOutputStream.writeMessage(4, this.adUnitResults_.get(i));
            }
            for (int i2 = 0; i2 < this.cachedAdUnits_.size(); i2++) {
                codedOutputStream.writeMessage(5, this.cachedAdUnits_.get(i2));
            }
            if (this.serverParams_ != null) {
                codedOutputStream.writeMessage(6, getServerParams());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResultOrBuilder {
            private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitResultsBuilder_;
            private List<AdUnit> adUnitResults_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> cachedAdUnitsBuilder_;
            private List<CachedAdUnit> cachedAdUnits_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private Struct ext_;
            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> formatBuilder_;
            private StringValue format_;
            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> serverParamsBuilder_;
            private StringValue serverParams_;
            private Object waterfallId_;

            private void ensureAdUnitResultsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.adUnitResults_ = new ArrayList(this.adUnitResults_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureCachedAdUnitsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.cachedAdUnits_ = new ArrayList(this.cachedAdUnits_);
                    this.bitField0_ |= 2;
                }
            }

            private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> getAdUnitResultsFieldBuilder() {
                if (this.adUnitResultsBuilder_ == null) {
                    List<AdUnit> list = this.adUnitResults_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.adUnitResultsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.adUnitResults_ = null;
                }
                return this.adUnitResultsBuilder_;
            }

            private RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> getCachedAdUnitsFieldBuilder() {
                boolean z;
                if (this.cachedAdUnitsBuilder_ == null) {
                    List<CachedAdUnit> list = this.cachedAdUnits_;
                    if ((this.bitField0_ & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.cachedAdUnitsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.cachedAdUnits_ = null;
                }
                return this.cachedAdUnitsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getFormatFieldBuilder() {
                if (this.formatBuilder_ == null) {
                    this.formatBuilder_ = new SingleFieldBuilderV3<>(getFormat(), getParentForChildren(), isClean());
                    this.format_ = null;
                }
                return this.formatBuilder_;
            }

            private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getServerParamsFieldBuilder() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParamsBuilder_ = new SingleFieldBuilderV3<>(getServerParams(), getParentForChildren(), isClean());
                    this.serverParams_ = null;
                }
                return this.serverParamsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAdUnitResultsFieldBuilder();
                    getCachedAdUnitsFieldBuilder();
                }
            }

            public Builder addAdUnitResults(AdUnit adUnit) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adUnit.getClass();
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(adUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(adUnit);
                }
                return this;
            }

            public AdUnit.Builder addAdUnitResultsBuilder() {
                return getAdUnitResultsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
            }

            public Builder addAllAdUnitResults(Iterable<? extends AdUnit> iterable) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitResultsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.adUnitResults_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllCachedAdUnits(Iterable<? extends CachedAdUnit> iterable) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCachedAdUnitsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.cachedAdUnits_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addCachedAdUnits(CachedAdUnit cachedAdUnit) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    cachedAdUnit.getClass();
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(cachedAdUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(cachedAdUnit);
                }
                return this;
            }

            public CachedAdUnit.Builder addCachedAdUnitsBuilder() {
                return getCachedAdUnitsFieldBuilder().addBuilder(CachedAdUnit.getDefaultInstance());
            }

            public Builder clearAdUnitResults() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.adUnitResults_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearCachedAdUnits() {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.cachedAdUnits_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Builder clearFormat() {
                if (this.formatBuilder_ == null) {
                    this.format_ = null;
                    onChanged();
                } else {
                    this.format_ = null;
                    this.formatBuilder_ = null;
                }
                return this;
            }

            public Builder clearServerParams() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    onChanged();
                } else {
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                }
                return this;
            }

            public Builder clearWaterfallId() {
                this.waterfallId_ = Result.getDefaultInstance().getWaterfallId();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public AdUnit getAdUnitResults(int i) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.adUnitResults_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public AdUnit.Builder getAdUnitResultsBuilder(int i) {
                return getAdUnitResultsFieldBuilder().getBuilder(i);
            }

            public List<AdUnit.Builder> getAdUnitResultsBuilderList() {
                return getAdUnitResultsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public int getAdUnitResultsCount() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.adUnitResults_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<AdUnit> getAdUnitResultsList() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.adUnitResults_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public AdUnitOrBuilder getAdUnitResultsOrBuilder(int i) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.adUnitResults_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<? extends AdUnitOrBuilder> getAdUnitResultsOrBuilderList() {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.adUnitResults_);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public CachedAdUnit getCachedAdUnits(int i) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.cachedAdUnits_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public CachedAdUnit.Builder getCachedAdUnitsBuilder(int i) {
                return getCachedAdUnitsFieldBuilder().getBuilder(i);
            }

            public List<CachedAdUnit.Builder> getCachedAdUnitsBuilderList() {
                return getCachedAdUnitsFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public int getCachedAdUnitsCount() {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.cachedAdUnits_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<CachedAdUnit> getCachedAdUnitsList() {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.cachedAdUnits_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.cachedAdUnits_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<? extends CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList() {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.cachedAdUnits_);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct = this.ext_;
                    if (struct == null) {
                        return Struct.getDefaultInstance();
                    }
                    return struct;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                if (struct == null) {
                    return Struct.getDefaultInstance();
                }
                return struct;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValue getFormat() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.formatBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.format_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public StringValue.Builder getFormatBuilder() {
                onChanged();
                return getFormatFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValueOrBuilder getFormatOrBuilder() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.formatBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.format_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValue getServerParams() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue = this.serverParams_;
                    if (stringValue == null) {
                        return StringValue.getDefaultInstance();
                    }
                    return stringValue;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public StringValue.Builder getServerParamsBuilder() {
                onChanged();
                return getServerParamsFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValueOrBuilder getServerParamsOrBuilder() {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                StringValue stringValue = this.serverParams_;
                if (stringValue == null) {
                    return StringValue.getDefaultInstance();
                }
                return stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public String getWaterfallId() {
                Object obj = this.waterfallId_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.waterfallId_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public ByteString getWaterfallIdBytes() {
                Object obj = this.waterfallId_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.waterfallId_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasExt() {
                if (this.extBuilder_ == null && this.ext_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasFormat() {
                if (this.formatBuilder_ == null && this.format_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasServerParams() {
                if (this.serverParamsBuilder_ == null && this.serverParams_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WaterfallProto.f97443x117386d4.ensureFieldAccessorsInitialized(Result.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder mergeFormat(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.formatBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.format_;
                    if (stringValue2 != null) {
                        this.format_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.format_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder mergeServerParams(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(stringValue);
                }
                return this;
            }

            public Builder removeAdUnitResults(int i) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder removeCachedAdUnits(int i) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setAdUnitResults(int i, AdUnit adUnit) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adUnit.getClass();
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.set(i, adUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, adUnit);
                }
                return this;
            }

            public Builder setCachedAdUnits(int i, CachedAdUnit cachedAdUnit) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    cachedAdUnit.getClass();
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.set(i, cachedAdUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, cachedAdUnit);
                }
                return this;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(struct);
                }
                return this;
            }

            public Builder setFormat(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.formatBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.format_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setServerParams(StringValue stringValue) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stringValue);
                }
                return this;
            }

            public Builder setWaterfallId(String str) {
                str.getClass();
                this.waterfallId_ = str;
                onChanged();
                return this;
            }

            public Builder setWaterfallIdBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.waterfallId_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.waterfallId_ = "";
                this.adUnitResults_ = Collections.emptyList();
                this.cachedAdUnits_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Result build() {
                Result buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Result buildPartial() {
                Result result = new Result(this);
                result.waterfallId_ = this.waterfallId_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    result.ext_ = this.ext_;
                } else {
                    result.ext_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV32 = this.formatBuilder_;
                if (singleFieldBuilderV32 == null) {
                    result.format_ = this.format_;
                } else {
                    result.format_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    result.adUnitResults_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.adUnitResults_ = Collections.unmodifiableList(this.adUnitResults_);
                        this.bitField0_ &= -2;
                    }
                    result.adUnitResults_ = this.adUnitResults_;
                }
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV32 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV32 != null) {
                    result.cachedAdUnits_ = repeatedFieldBuilderV32.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.cachedAdUnits_ = Collections.unmodifiableList(this.cachedAdUnits_);
                        this.bitField0_ &= -3;
                    }
                    result.cachedAdUnits_ = this.cachedAdUnits_;
                }
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV33 = this.serverParamsBuilder_;
                if (singleFieldBuilderV33 == null) {
                    result.serverParams_ = this.serverParams_;
                } else {
                    result.serverParams_ = singleFieldBuilderV33.build();
                }
                onBuilt();
                return result;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Result getDefaultInstanceForType() {
                return Result.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public AdUnit.Builder addAdUnitResultsBuilder(int i) {
                return getAdUnitResultsFieldBuilder().addBuilder(i, AdUnit.getDefaultInstance());
            }

            public CachedAdUnit.Builder addCachedAdUnitsBuilder(int i) {
                return getCachedAdUnitsFieldBuilder().addBuilder(i, CachedAdUnit.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.waterfallId_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                if (this.formatBuilder_ == null) {
                    this.format_ = null;
                } else {
                    this.format_ = null;
                    this.formatBuilder_ = null;
                }
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.adUnitResults_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV32 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.cachedAdUnits_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                } else {
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setFormat(StringValue.Builder builder) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.formatBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.format_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setServerParams(StringValue.Builder builder) {
                SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.serverParamsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.serverParams_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder addAdUnitResults(int i, AdUnit adUnit) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adUnit.getClass();
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(i, adUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, adUnit);
                }
                return this;
            }

            public Builder addCachedAdUnits(int i, CachedAdUnit cachedAdUnit) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    cachedAdUnit.getClass();
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(i, cachedAdUnit);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, cachedAdUnit);
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Result) {
                    return mergeFrom((Result) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdUnitResults(int i, AdUnit.Builder builder) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setCachedAdUnits(int i, CachedAdUnit.Builder builder) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.waterfallId_ = "";
                this.adUnitResults_ = Collections.emptyList();
                this.cachedAdUnits_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Result result) {
                if (result == Result.getDefaultInstance()) {
                    return this;
                }
                if (!result.getWaterfallId().isEmpty()) {
                    this.waterfallId_ = result.waterfallId_;
                    onChanged();
                }
                if (result.hasExt()) {
                    mergeExt(result.getExt());
                }
                if (result.hasFormat()) {
                    mergeFormat(result.getFormat());
                }
                if (this.adUnitResultsBuilder_ == null) {
                    if (!result.adUnitResults_.isEmpty()) {
                        if (this.adUnitResults_.isEmpty()) {
                            this.adUnitResults_ = result.adUnitResults_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAdUnitResultsIsMutable();
                            this.adUnitResults_.addAll(result.adUnitResults_);
                        }
                        onChanged();
                    }
                } else if (!result.adUnitResults_.isEmpty()) {
                    if (!this.adUnitResultsBuilder_.isEmpty()) {
                        this.adUnitResultsBuilder_.addAllMessages(result.adUnitResults_);
                    } else {
                        this.adUnitResultsBuilder_.dispose();
                        this.adUnitResultsBuilder_ = null;
                        this.adUnitResults_ = result.adUnitResults_;
                        this.bitField0_ &= -2;
                        this.adUnitResultsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAdUnitResultsFieldBuilder() : null;
                    }
                }
                if (this.cachedAdUnitsBuilder_ == null) {
                    if (!result.cachedAdUnits_.isEmpty()) {
                        if (this.cachedAdUnits_.isEmpty()) {
                            this.cachedAdUnits_ = result.cachedAdUnits_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureCachedAdUnitsIsMutable();
                            this.cachedAdUnits_.addAll(result.cachedAdUnits_);
                        }
                        onChanged();
                    }
                } else if (!result.cachedAdUnits_.isEmpty()) {
                    if (!this.cachedAdUnitsBuilder_.isEmpty()) {
                        this.cachedAdUnitsBuilder_.addAllMessages(result.cachedAdUnits_);
                    } else {
                        this.cachedAdUnitsBuilder_.dispose();
                        this.cachedAdUnitsBuilder_ = null;
                        this.cachedAdUnits_ = result.cachedAdUnits_;
                        this.bitField0_ &= -3;
                        this.cachedAdUnitsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCachedAdUnitsFieldBuilder() : null;
                    }
                }
                if (result.hasServerParams()) {
                    mergeServerParams(result.getServerParams());
                }
                mergeUnknownFields(((GeneratedMessageV3) result).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdUnitResults(AdUnit.Builder builder) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCachedAdUnits(CachedAdUnit.Builder builder) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAdUnitResults(int i, AdUnit.Builder builder) {
                RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitResultsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addCachedAdUnits(int i, CachedAdUnit.Builder builder) {
                RepeatedFieldBuilderV3<CachedAdUnit, CachedAdUnit.Builder, CachedAdUnitOrBuilder> repeatedFieldBuilderV3 = this.cachedAdUnitsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.Waterfall.Result.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.Result.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Result r3 = (io.bidmachine.protobuf.Waterfall.Result) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.Waterfall$Result r4 = (io.bidmachine.protobuf.Waterfall.Result) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Result$Builder");
            }
        }

        public static Builder newBuilder(Result result) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(result);
        }

        public static Result parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Result(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Result parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Result) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Result parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Result getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Result parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Result() {
            this.memoizedIsInitialized = (byte) -1;
            this.waterfallId_ = "";
            this.adUnitResults_ = Collections.emptyList();
            this.cachedAdUnits_ = Collections.emptyList();
        }

        public static Result parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Result parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Result parseFrom(InputStream inputStream) throws IOException {
            return (Result) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Result parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Result) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Result(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag != 10) {
                                if (readTag == 18) {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    StringValue stringValue = this.format_;
                                    StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                    this.format_ = stringValue2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(stringValue2);
                                        this.format_ = builder2.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.adUnitResults_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.adUnitResults_.add(codedInputStream.readMessage(AdUnit.parser(), extensionRegistryLite));
                                } else if (readTag == 42) {
                                    boolean z4 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z4) {
                                        this.cachedAdUnits_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.cachedAdUnits_.add(codedInputStream.readMessage(CachedAdUnit.parser(), extensionRegistryLite));
                                } else if (readTag != 50) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    StringValue stringValue3 = this.serverParams_;
                                    StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                    this.serverParams_ = stringValue4;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(stringValue4);
                                        this.serverParams_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.waterfallId_ = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    if ((z2 ? 1 : 0) & true) {
                        this.adUnitResults_ = Collections.unmodifiableList(this.adUnitResults_);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.cachedAdUnits_ = Collections.unmodifiableList(this.cachedAdUnits_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Result parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Result) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Result parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Result) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface ResultOrBuilder extends MessageOrBuilder {
        Result.AdUnit getAdUnitResults(int i);

        int getAdUnitResultsCount();

        List<Result.AdUnit> getAdUnitResultsList();

        Result.AdUnitOrBuilder getAdUnitResultsOrBuilder(int i);

        List<? extends Result.AdUnitOrBuilder> getAdUnitResultsOrBuilderList();

        Result.CachedAdUnit getCachedAdUnits(int i);

        int getCachedAdUnitsCount();

        List<Result.CachedAdUnit> getCachedAdUnitsList();

        Result.CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i);

        List<? extends Result.CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        StringValue getFormat();

        StringValueOrBuilder getFormatOrBuilder();

        StringValue getServerParams();

        StringValueOrBuilder getServerParamsOrBuilder();

        String getWaterfallId();

        ByteString getWaterfallIdBytes();

        boolean hasExt();

        boolean hasFormat();

        boolean hasServerParams();
    }

    public static Waterfall getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Waterfall parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Waterfall) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Waterfall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Waterfall> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Waterfall)) {
            return super.equals(obj);
        }
        Waterfall waterfall = (Waterfall) obj;
        if (!getPayloadCase().equals(waterfall.getPayloadCase())) {
            return false;
        }
        int i = this.payloadCase_;
        if (i != 1) {
            if (i == 2 && !getResponse().equals(waterfall.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(waterfall.getRequest())) {
            return false;
        }
        if (this.unknownFields.equals(waterfall.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<Waterfall> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public Result getRequest() {
        if (this.payloadCase_ == 1) {
            return (Result) this.payload_;
        }
        return Result.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public ResultOrBuilder getRequestOrBuilder() {
        if (this.payloadCase_ == 1) {
            return (Result) this.payload_;
        }
        return Result.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public Configuration getResponse() {
        if (this.payloadCase_ == 2) {
            return (Configuration) this.payload_;
        }
        return Configuration.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public ConfigurationOrBuilder getResponseOrBuilder() {
        if (this.payloadCase_ == 2) {
            return (Configuration) this.payload_;
        }
        return Configuration.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.payloadCase_ == 1) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, (Result) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            i2 += CodedOutputStream.computeMessageSize(2, (Configuration) this.payload_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public boolean hasRequest() {
        if (this.payloadCase_ == 1) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public boolean hasResponse() {
        if (this.payloadCase_ == 2) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i;
        int hashCode;
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode2 = 779 + getDescriptor().hashCode();
        int i3 = this.payloadCase_;
        if (i3 != 1) {
            if (i3 == 2) {
                i = ((hashCode2 * 37) + 2) * 53;
                hashCode = getResponse().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }
        i = ((hashCode2 * 37) + 1) * 53;
        hashCode = getRequest().hashCode();
        hashCode2 = i + hashCode;
        int hashCode32 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode32;
        return hashCode32;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable.ensureFieldAccessorsInitialized(Waterfall.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Waterfall();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.payloadCase_ == 1) {
            codedOutputStream.writeMessage(1, (Result) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            codedOutputStream.writeMessage(2, (Configuration) this.payload_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WaterfallOrBuilder {
        private int payloadCase_;
        private Object payload_;
        private SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> requestBuilder_;
        private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> responseBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
        }

        private SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 1) {
                    this.payload_ = Result.getDefaultInstance();
                }
                this.requestBuilder_ = new SingleFieldBuilderV3<>((Result) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 1;
            onChanged();
            return this.requestBuilder_;
        }

        private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 2) {
                    this.payload_ = Configuration.getDefaultInstance();
                }
                this.responseBuilder_ = new SingleFieldBuilderV3<>((Configuration) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 2;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
            } else {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearResponse() {
            SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
            } else {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public Result getRequest() {
            SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 1) {
                    return (Result) this.payload_;
                }
                return Result.getDefaultInstance();
            } else if (this.payloadCase_ == 1) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return Result.getDefaultInstance();
            }
        }

        public Result.Builder getRequestBuilder() {
            return getRequestFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public ResultOrBuilder getRequestOrBuilder() {
            SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3;
            int i = this.payloadCase_;
            if (i == 1 && (singleFieldBuilderV3 = this.requestBuilder_) != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 1) {
                return (Result) this.payload_;
            }
            return Result.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public Configuration getResponse() {
            SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 2) {
                    return (Configuration) this.payload_;
                }
                return Configuration.getDefaultInstance();
            } else if (this.payloadCase_ == 2) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return Configuration.getDefaultInstance();
            }
        }

        public Configuration.Builder getResponseBuilder() {
            return getResponseFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public ConfigurationOrBuilder getResponseOrBuilder() {
            SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3;
            int i = this.payloadCase_;
            if (i == 2 && (singleFieldBuilderV3 = this.responseBuilder_) != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 2) {
                return (Configuration) this.payload_;
            }
            return Configuration.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public boolean hasRequest() {
            if (this.payloadCase_ == 1) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public boolean hasResponse() {
            if (this.payloadCase_ == 2) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable.ensureFieldAccessorsInitialized(Waterfall.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Result result) {
            SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 1 && this.payload_ != Result.getDefaultInstance()) {
                    this.payload_ = Result.newBuilder((Result) this.payload_).mergeFrom(result).buildPartial();
                } else {
                    this.payload_ = result;
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 1) {
                    singleFieldBuilderV3.mergeFrom(result);
                }
                this.requestBuilder_.setMessage(result);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder mergeResponse(Configuration configuration) {
            SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 2 && this.payload_ != Configuration.getDefaultInstance()) {
                    this.payload_ = Configuration.newBuilder((Configuration) this.payload_).mergeFrom(configuration).buildPartial();
                } else {
                    this.payload_ = configuration;
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 2) {
                    singleFieldBuilderV3.mergeFrom(configuration);
                }
                this.responseBuilder_.setMessage(configuration);
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder setRequest(Result result) {
            SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                result.getClass();
                this.payload_ = result;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(result);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setResponse(Configuration configuration) {
            SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                configuration.getClass();
                this.payload_ = configuration;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(configuration);
            }
            this.payloadCase_ = 2;
            return this;
        }

        private Builder() {
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Waterfall build() {
            Waterfall buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Waterfall buildPartial() {
            Waterfall waterfall = new Waterfall(this);
            if (this.payloadCase_ == 1) {
                SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    waterfall.payload_ = this.payload_;
                } else {
                    waterfall.payload_ = singleFieldBuilderV3.build();
                }
            }
            if (this.payloadCase_ == 2) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV32 = this.responseBuilder_;
                if (singleFieldBuilderV32 == null) {
                    waterfall.payload_ = this.payload_;
                } else {
                    waterfall.payload_ = singleFieldBuilderV32.build();
                }
            }
            waterfall.payloadCase_ = this.payloadCase_;
            onBuilt();
            return waterfall;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Waterfall getDefaultInstanceForType() {
            return Waterfall.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo110022clone() {
            return (Builder) super.mo110022clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Waterfall) {
                return mergeFrom((Waterfall) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Result.Builder builder) {
            SingleFieldBuilderV3<Result, Result.Builder, ResultOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setResponse(Configuration.Builder builder) {
            SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder mergeFrom(Waterfall waterfall) {
            if (waterfall == Waterfall.getDefaultInstance()) {
                return this;
            }
            int i = C368412.$SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[waterfall.getPayloadCase().ordinal()];
            if (i == 1) {
                mergeRequest(waterfall.getRequest());
            } else if (i == 2) {
                mergeResponse(waterfall.getResponse());
            }
            mergeUnknownFields(((GeneratedMessageV3) waterfall).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.Waterfall.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.Waterfall.access$12100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.Waterfall r3 = (io.bidmachine.protobuf.Waterfall) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.Waterfall r4 = (io.bidmachine.protobuf.Waterfall) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.Waterfall$Builder");
        }
    }

    public static Builder newBuilder(Waterfall waterfall) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(waterfall);
    }

    public static Waterfall parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private Waterfall(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Waterfall parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Waterfall) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Waterfall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public Waterfall getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Waterfall parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Waterfall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private Waterfall() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Waterfall parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Waterfall parseFrom(InputStream inputStream) throws IOException {
        return (Waterfall) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private Waterfall(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Result.Builder builder = this.payloadCase_ == 1 ? ((Result) this.payload_).toBuilder() : null;
                                MessageLite readMessage = codedInputStream.readMessage(Result.parser(), extensionRegistryLite);
                                this.payload_ = readMessage;
                                if (builder != null) {
                                    builder.mergeFrom((Result) readMessage);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = 1;
                            } else if (readTag != 18) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                Configuration.Builder builder2 = this.payloadCase_ == 2 ? ((Configuration) this.payload_).toBuilder() : null;
                                MessageLite readMessage2 = codedInputStream.readMessage(Configuration.parser(), extensionRegistryLite);
                                this.payload_ = readMessage2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((Configuration) readMessage2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = 2;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static Waterfall parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Waterfall) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Waterfall parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Waterfall) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Waterfall parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Waterfall) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
