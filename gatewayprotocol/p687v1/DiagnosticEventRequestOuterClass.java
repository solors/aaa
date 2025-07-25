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
import gatewayprotocol.p687v1.TimestampsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass */
/* loaded from: classes9.dex */
public final class DiagnosticEventRequestOuterClass {

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType */
    /* loaded from: classes9.dex */
    public enum DiagnosticAdType implements Internal.EnumLite {
        DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
        DIAGNOSTIC_AD_TYPE_BANNER(2),
        UNRECOGNIZED(-1);
        
        public static final int DIAGNOSTIC_AD_TYPE_BANNER_VALUE = 2;
        public static final int DIAGNOSTIC_AD_TYPE_FULLSCREEN_VALUE = 1;
        public static final int DIAGNOSTIC_AD_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticAdType> internalValueMap = new C33242a();
        private final int value;

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType$a */
        /* loaded from: classes9.dex */
        class C33242a implements Internal.EnumLiteMap<DiagnosticAdType> {
            C33242a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public DiagnosticAdType findValueByNumber(int i) {
                return DiagnosticAdType.forNumber(i);
            }
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType$b */
        /* loaded from: classes9.dex */
        private static final class C33243b implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f90800a = new C33243b();

            private C33243b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (DiagnosticAdType.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        DiagnosticAdType(int i) {
            this.value = i;
        }

        public static DiagnosticAdType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return DIAGNOSTIC_AD_TYPE_BANNER;
                }
                return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            }
            return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<DiagnosticAdType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C33243b.f90800a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticAdType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent */
    /* loaded from: classes9.dex */
    public static final class DiagnosticEvent extends GeneratedMessageLite<DiagnosticEvent, Builder> implements DiagnosticEventOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 10;
        public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticEvent DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
        public static final int INT_TAGS_FIELD_NUMBER = 6;
        public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
        private static volatile Parser<DiagnosticEvent> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
        public static final int STRING_TAGS_FIELD_NUMBER = 5;
        public static final int TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int TIME_VALUE_FIELD_NUMBER = 4;
        private int adType_;
        private int bitField0_;
        private int eventId_;
        private int eventType_;
        private boolean isHeaderBidding_;
        private double timeValue_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private MapFieldLite<String, String> stringTags_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, Integer> intTags_ = MapFieldLite.emptyMapField();
        private String customEventType_ = "";
        private ByteString impressionOpportunityId_ = ByteString.EMPTY;
        private String placementId_ = "";

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEvent, Builder> implements DiagnosticEventOrBuilder {
            /* synthetic */ Builder(C33253a c33253a) {
                this();
            }

            public Builder clearAdType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearAdType();
                return this;
            }

            public Builder clearCustomEventType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearCustomEventType();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearEventId();
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearEventType();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearIntTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().clear();
                return this;
            }

            public Builder clearIsHeaderBidding() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearIsHeaderBidding();
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearPlacementId();
                return this;
            }

            public Builder clearStringTags() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().clear();
                return this;
            }

            public Builder clearTimeValue() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTimeValue();
                return this;
            }

            public Builder clearTimestamps() {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).clearTimestamps();
                return this;
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsIntTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) this.instance).getIntTagsMap().containsKey(str);
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean containsStringTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) this.instance).getStringTagsMap().containsKey(str);
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticAdType getAdType() {
                return ((DiagnosticEvent) this.instance).getAdType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getAdTypeValue() {
                return ((DiagnosticEvent) this.instance).getAdTypeValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getCustomEventType() {
                return ((DiagnosticEvent) this.instance).getCustomEventType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getCustomEventTypeBytes() {
                return ((DiagnosticEvent) this.instance).getCustomEventTypeBytes();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventId() {
                return ((DiagnosticEvent) this.instance).getEventId();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public DiagnosticEventType getEventType() {
                return ((DiagnosticEvent) this.instance).getEventType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getEventTypeValue() {
                return ((DiagnosticEvent) this.instance).getEventTypeValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((DiagnosticEvent) this.instance).getImpressionOpportunityId();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @Deprecated
            public Map<String, Integer> getIntTags() {
                return getIntTagsMap();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsCount() {
                return ((DiagnosticEvent) this.instance).getIntTagsMap().size();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public Map<String, Integer> getIntTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) this.instance).getIntTagsMap());
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrDefault(String str, int i) {
                str.getClass();
                Map<String, Integer> intTagsMap = ((DiagnosticEvent) this.instance).getIntTagsMap();
                if (intTagsMap.containsKey(str)) {
                    return intTagsMap.get(str).intValue();
                }
                return i;
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getIntTagsOrThrow(String str) {
                str.getClass();
                Map<String, Integer> intTagsMap = ((DiagnosticEvent) this.instance).getIntTagsMap();
                if (intTagsMap.containsKey(str)) {
                    return intTagsMap.get(str).intValue();
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean getIsHeaderBidding() {
                return ((DiagnosticEvent) this.instance).getIsHeaderBidding();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getPlacementId() {
                return ((DiagnosticEvent) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((DiagnosticEvent) this.instance).getPlacementIdBytes();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            @Deprecated
            public Map<String, String> getStringTags() {
                return getStringTagsMap();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public int getStringTagsCount() {
                return ((DiagnosticEvent) this.instance).getStringTagsMap().size();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public Map<String, String> getStringTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) this.instance).getStringTagsMap());
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getStringTagsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> stringTagsMap = ((DiagnosticEvent) this.instance).getStringTagsMap();
                if (stringTagsMap.containsKey(str)) {
                    return stringTagsMap.get(str);
                }
                return str2;
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public String getStringTagsOrThrow(String str) {
                str.getClass();
                Map<String, String> stringTagsMap = ((DiagnosticEvent) this.instance).getStringTagsMap();
                if (stringTagsMap.containsKey(str)) {
                    return stringTagsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public double getTimeValue() {
                return ((DiagnosticEvent) this.instance).getTimeValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public TimestampsOuterClass.Timestamps getTimestamps() {
                return ((DiagnosticEvent) this.instance).getTimestamps();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasAdType() {
                return ((DiagnosticEvent) this.instance).hasAdType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasCustomEventType() {
                return ((DiagnosticEvent) this.instance).hasCustomEventType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasImpressionOpportunityId() {
                return ((DiagnosticEvent) this.instance).hasImpressionOpportunityId();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasIsHeaderBidding() {
                return ((DiagnosticEvent) this.instance).hasIsHeaderBidding();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasPlacementId() {
                return ((DiagnosticEvent) this.instance).hasPlacementId();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimeValue() {
                return ((DiagnosticEvent) this.instance).hasTimeValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
            public boolean hasTimestamps() {
                return ((DiagnosticEvent) this.instance).hasTimestamps();
            }

            public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).mergeTimestamps(timestamps);
                return this;
            }

            public Builder putAllIntTags(Map<String, Integer> map) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().putAll(map);
                return this;
            }

            public Builder putAllStringTags(Map<String, String> map) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().putAll(map);
                return this;
            }

            public Builder putIntTags(String str, int i) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().put(str, Integer.valueOf(i));
                return this;
            }

            public Builder putStringTags(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().put(str, str2);
                return this;
            }

            public Builder removeIntTags(String str) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableIntTagsMap().remove(str);
                return this;
            }

            public Builder removeStringTags(String str) {
                str.getClass();
                copyOnWrite();
                ((DiagnosticEvent) this.instance).getMutableStringTagsMap().remove(str);
                return this;
            }

            public Builder setAdType(DiagnosticAdType diagnosticAdType) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdType(diagnosticAdType);
                return this;
            }

            public Builder setAdTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setAdTypeValue(i);
                return this;
            }

            public Builder setCustomEventType(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setCustomEventType(str);
                return this;
            }

            public Builder setCustomEventTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setCustomEventTypeBytes(byteString);
                return this;
            }

            public Builder setEventId(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventId(i);
                return this;
            }

            public Builder setEventType(DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventType(diagnosticEventType);
                return this;
            }

            public Builder setEventTypeValue(int i) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setEventTypeValue(i);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setIsHeaderBidding(boolean z) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setIsHeaderBidding(z);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setPlacementId(str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            public Builder setTimeValue(double d) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimeValue(d);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimestamps(timestamps);
                return this;
            }

            private Builder() {
                super(DiagnosticEvent.DEFAULT_INSTANCE);
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                ((DiagnosticEvent) this.instance).setTimestamps(builder.build());
                return this;
            }
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent$a */
        /* loaded from: classes9.dex */
        private static final class C33244a {

            /* renamed from: a */
            static final MapEntryLite<String, Integer> f90801a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.UINT32, 0);
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent$b */
        /* loaded from: classes9.dex */
        private static final class C33245b {

            /* renamed from: a */
            static final MapEntryLite<String, String> f90802a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f90802a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        static {
            DiagnosticEvent diagnosticEvent = new DiagnosticEvent();
            DEFAULT_INSTANCE = diagnosticEvent;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEvent.class, diagnosticEvent);
        }

        private DiagnosticEvent() {
        }

        public void clearAdType() {
            this.bitField0_ &= -17;
            this.adType_ = 0;
        }

        public void clearCustomEventType() {
            this.bitField0_ &= -2;
            this.customEventType_ = getDefaultInstance().getCustomEventType();
        }

        public void clearEventId() {
            this.eventId_ = 0;
        }

        public void clearEventType() {
            this.eventType_ = 0;
        }

        public void clearImpressionOpportunityId() {
            this.bitField0_ &= -5;
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        public void clearIsHeaderBidding() {
            this.bitField0_ &= -33;
            this.isHeaderBidding_ = false;
        }

        public void clearPlacementId() {
            this.bitField0_ &= -9;
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        public void clearTimeValue() {
            this.bitField0_ &= -3;
            this.timeValue_ = 0.0d;
        }

        public void clearTimestamps() {
            this.timestamps_ = null;
        }

        public static DiagnosticEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public Map<String, Integer> getMutableIntTagsMap() {
            return internalGetMutableIntTags();
        }

        public Map<String, String> getMutableStringTagsMap() {
            return internalGetMutableStringTags();
        }

        private MapFieldLite<String, Integer> internalGetIntTags() {
            return this.intTags_;
        }

        private MapFieldLite<String, Integer> internalGetMutableIntTags() {
            if (!this.intTags_.isMutable()) {
                this.intTags_ = this.intTags_.mutableCopy();
            }
            return this.intTags_;
        }

        private MapFieldLite<String, String> internalGetMutableStringTags() {
            if (!this.stringTags_.isMutable()) {
                this.stringTags_ = this.stringTags_.mutableCopy();
            }
            return this.stringTags_;
        }

        private MapFieldLite<String, String> internalGetStringTags() {
            return this.stringTags_;
        }

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

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setAdType(DiagnosticAdType diagnosticAdType) {
            this.adType_ = diagnosticAdType.getNumber();
            this.bitField0_ |= 16;
        }

        public void setAdTypeValue(int i) {
            this.bitField0_ |= 16;
            this.adType_ = i;
        }

        public void setCustomEventType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customEventType_ = str;
        }

        public void setCustomEventTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customEventType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public void setEventId(int i) {
            this.eventId_ = i;
        }

        public void setEventType(DiagnosticEventType diagnosticEventType) {
            this.eventType_ = diagnosticEventType.getNumber();
        }

        public void setEventTypeValue(int i) {
            this.eventType_ = i;
        }

        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.impressionOpportunityId_ = byteString;
        }

        public void setIsHeaderBidding(boolean z) {
            this.bitField0_ |= 32;
            this.isHeaderBidding_ = z;
        }

        public void setPlacementId(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.placementId_ = str;
        }

        public void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        public void setTimeValue(double d) {
            this.bitField0_ |= 2;
            this.timeValue_ = d;
        }

        public void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsIntTags(String str) {
            str.getClass();
            return internalGetIntTags().containsKey(str);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean containsStringTags(String str) {
            str.getClass();
            return internalGetStringTags().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33253a.f90806a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEvent();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\t\u0004က\u0001\u00052\u00062\u0007\u0004\bည\u0002\tለ\u0003\nဌ\u0004\u000bဇ\u0005", new Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", C33245b.f90802a, "intTags_", C33244a.f90801a, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEvent> parser = PARSER;
                    if (parser == null) {
                        synchronized (DiagnosticEvent.class) {
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

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticAdType getAdType() {
            DiagnosticAdType forNumber = DiagnosticAdType.forNumber(this.adType_);
            if (forNumber == null) {
                return DiagnosticAdType.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getCustomEventType() {
            return this.customEventType_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getCustomEventTypeBytes() {
            return ByteString.copyFromUtf8(this.customEventType_);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventId() {
            return this.eventId_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public DiagnosticEventType getEventType() {
            DiagnosticEventType forNumber = DiagnosticEventType.forNumber(this.eventType_);
            if (forNumber == null) {
                return DiagnosticEventType.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @Deprecated
        public Map<String, Integer> getIntTags() {
            return getIntTagsMap();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsCount() {
            return internalGetIntTags().size();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public Map<String, Integer> getIntTagsMap() {
            return Collections.unmodifiableMap(internalGetIntTags());
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrDefault(String str, int i) {
            str.getClass();
            MapFieldLite<String, Integer> internalGetIntTags = internalGetIntTags();
            if (internalGetIntTags.containsKey(str)) {
                return internalGetIntTags.get(str).intValue();
            }
            return i;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getIntTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Integer> internalGetIntTags = internalGetIntTags();
            if (internalGetIntTags.containsKey(str)) {
                return internalGetIntTags.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean getIsHeaderBidding() {
            return this.isHeaderBidding_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        @Deprecated
        public Map<String, String> getStringTags() {
            return getStringTagsMap();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public int getStringTagsCount() {
            return internalGetStringTags().size();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public Map<String, String> getStringTagsMap() {
            return Collections.unmodifiableMap(internalGetStringTags());
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getStringTagsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetStringTags = internalGetStringTags();
            if (internalGetStringTags.containsKey(str)) {
                return internalGetStringTags.get(str);
            }
            return str2;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public String getStringTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetStringTags = internalGetStringTags();
            if (internalGetStringTags.containsKey(str)) {
                return internalGetStringTags.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public double getTimeValue() {
            return this.timeValue_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            if (timestamps == null) {
                return TimestampsOuterClass.Timestamps.getDefaultInstance();
            }
            return timestamps;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasAdType() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasCustomEventType() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasImpressionOpportunityId() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasIsHeaderBidding() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasPlacementId() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimeValue() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder
        public boolean hasTimestamps() {
            if (this.timestamps_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DiagnosticEvent diagnosticEvent) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEvent);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder */
    /* loaded from: classes9.dex */
    public interface DiagnosticEventOrBuilder extends MessageLiteOrBuilder {
        boolean containsIntTags(String str);

        boolean containsStringTags(String str);

        DiagnosticAdType getAdType();

        int getAdTypeValue();

        String getCustomEventType();

        ByteString getCustomEventTypeBytes();

        int getEventId();

        DiagnosticEventType getEventType();

        int getEventTypeValue();

        ByteString getImpressionOpportunityId();

        @Deprecated
        Map<String, Integer> getIntTags();

        int getIntTagsCount();

        Map<String, Integer> getIntTagsMap();

        int getIntTagsOrDefault(String str, int i);

        int getIntTagsOrThrow(String str);

        boolean getIsHeaderBidding();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        @Deprecated
        Map<String, String> getStringTags();

        int getStringTagsCount();

        Map<String, String> getStringTagsMap();

        String getStringTagsOrDefault(String str, String str2);

        String getStringTagsOrThrow(String str);

        double getTimeValue();

        TimestampsOuterClass.Timestamps getTimestamps();

        boolean hasAdType();

        boolean hasCustomEventType();

        boolean hasImpressionOpportunityId();

        boolean hasIsHeaderBidding();

        boolean hasPlacementId();

        boolean hasTimeValue();

        boolean hasTimestamps();
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest */
    /* loaded from: classes9.dex */
    public static final class DiagnosticEventRequest extends GeneratedMessageLite<DiagnosticEventRequest, Builder> implements DiagnosticEventRequestOrBuilder {
        public static final int BATCH_FIELD_NUMBER = 1;
        private static final DiagnosticEventRequest DEFAULT_INSTANCE;
        private static volatile Parser<DiagnosticEventRequest> PARSER;
        private Internal.ProtobufList<DiagnosticEvent> batch_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticEventRequest, Builder> implements DiagnosticEventRequestOrBuilder {
            /* synthetic */ Builder(C33253a c33253a) {
                this();
            }

            public Builder addAllBatch(Iterable<? extends DiagnosticEvent> iterable) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addAllBatch(iterable);
                return this;
            }

            public Builder addBatch(DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(diagnosticEvent);
                return this;
            }

            public Builder clearBatch() {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).clearBatch();
                return this;
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public DiagnosticEvent getBatch(int i) {
                return ((DiagnosticEventRequest) this.instance).getBatch(i);
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public int getBatchCount() {
                return ((DiagnosticEventRequest) this.instance).getBatchCount();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
            public List<DiagnosticEvent> getBatchList() {
                return Collections.unmodifiableList(((DiagnosticEventRequest) this.instance).getBatchList());
            }

            public Builder removeBatch(int i) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).removeBatch(i);
                return this;
            }

            public Builder setBatch(int i, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).setBatch(i, diagnosticEvent);
                return this;
            }

            private Builder() {
                super(DiagnosticEventRequest.DEFAULT_INSTANCE);
            }

            public Builder addBatch(int i, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(i, diagnosticEvent);
                return this;
            }

            public Builder setBatch(int i, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).setBatch(i, builder.build());
                return this;
            }

            public Builder addBatch(DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(builder.build());
                return this;
            }

            public Builder addBatch(int i, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                ((DiagnosticEventRequest) this.instance).addBatch(i, builder.build());
                return this;
            }
        }

        static {
            DiagnosticEventRequest diagnosticEventRequest = new DiagnosticEventRequest();
            DEFAULT_INSTANCE = diagnosticEventRequest;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventRequest.class, diagnosticEventRequest);
        }

        private DiagnosticEventRequest() {
        }

        public void addAllBatch(Iterable<? extends DiagnosticEvent> iterable) {
            ensureBatchIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.batch_);
        }

        public void addBatch(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(diagnosticEvent);
        }

        public void clearBatch() {
            this.batch_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBatchIsMutable() {
            Internal.ProtobufList<DiagnosticEvent> protobufList = this.batch_;
            if (!protobufList.isModifiable()) {
                this.batch_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static DiagnosticEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void removeBatch(int i) {
            ensureBatchIsMutable();
            this.batch_.remove(i);
        }

        public void setBatch(int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.set(i, diagnosticEvent);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33253a.f90806a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"batch_", DiagnosticEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticEventRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (DiagnosticEventRequest.class) {
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

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public DiagnosticEvent getBatch(int i) {
            return this.batch_.get(i);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public int getBatchCount() {
            return this.batch_.size();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequestOrBuilder
        public List<DiagnosticEvent> getBatchList() {
            return this.batch_;
        }

        public DiagnosticEventOrBuilder getBatchOrBuilder(int i) {
            return this.batch_.get(i);
        }

        public List<? extends DiagnosticEventOrBuilder> getBatchOrBuilderList() {
            return this.batch_;
        }

        public static Builder newBuilder(DiagnosticEventRequest diagnosticEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticEventRequest);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public void addBatch(int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(i, diagnosticEvent);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder */
    /* loaded from: classes9.dex */
    public interface DiagnosticEventRequestOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEvent getBatch(int i);

        int getBatchCount();

        List<DiagnosticEvent> getBatchList();
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType */
    /* loaded from: classes9.dex */
    public enum DiagnosticEventType implements Internal.EnumLite {
        DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);
        
        public static final int DIAGNOSTIC_EVENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticEventType> internalValueMap = new C33246a();
        private final int value;

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType$a */
        /* loaded from: classes9.dex */
        class C33246a implements Internal.EnumLiteMap<DiagnosticEventType> {
            C33246a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public DiagnosticEventType findValueByNumber(int i) {
                return DiagnosticEventType.forNumber(i);
            }
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType$b */
        /* loaded from: classes9.dex */
        private static final class C33247b implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f90803a = new C33247b();

            private C33247b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (DiagnosticEventType.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        DiagnosticEventType(int i) {
            this.value = i;
        }

        public static DiagnosticEventType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
            }
            return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<DiagnosticEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C33247b.f90803a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticEventType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity */
    /* loaded from: classes9.dex */
    public enum DiagnosticEventsSeverity implements Internal.EnumLite {
        DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
        DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
        DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
        DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
        DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
        DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
        UNRECOGNIZED(-1);
        
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS_VALUE = 5;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_DEBUG_VALUE = 1;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ERROR_VALUE = 4;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_INFO_VALUE = 2;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED_VALUE = 0;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_WARNING_VALUE = 3;
        private static final Internal.EnumLiteMap<DiagnosticEventsSeverity> internalValueMap = new C33248a();
        private final int value;

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity$a */
        /* loaded from: classes9.dex */
        class C33248a implements Internal.EnumLiteMap<DiagnosticEventsSeverity> {
            C33248a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public DiagnosticEventsSeverity findValueByNumber(int i) {
                return DiagnosticEventsSeverity.forNumber(i);
            }
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventsSeverity$b */
        /* loaded from: classes9.dex */
        private static final class C33249b implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f90804a = new C33249b();

            private C33249b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (DiagnosticEventsSeverity.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        DiagnosticEventsSeverity(int i) {
            this.value = i;
        }

        public static DiagnosticEventsSeverity forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
                            }
                            return DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
                        }
                        return DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
                    }
                    return DIAGNOSTIC_EVENTS_SEVERITY_INFO;
                }
                return DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
            }
            return DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<DiagnosticEventsSeverity> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C33249b.f90804a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticEventsSeverity valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTag */
    /* loaded from: classes9.dex */
    public static final class DiagnosticTag extends GeneratedMessageLite<DiagnosticTag, Builder> implements DiagnosticTagOrBuilder {
        public static final int CUSTOM_TAG_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticTag DEFAULT_INSTANCE;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        private static volatile Parser<DiagnosticTag> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 3;
        public static final int TAG_TYPE_FIELD_NUMBER = 1;
        private static final Internal.ListAdapter.Converter<Integer, DiagnosticTagType> tagType_converter_ = new C33250a();
        private int bitField0_;
        private int tagTypeMemoizedSerializedSize;
        private Object value_;
        private int valueCase_ = 0;
        private Internal.IntList tagType_ = GeneratedMessageLite.emptyIntList();
        private String customTagType_ = "";

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTag$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DiagnosticTag, Builder> implements DiagnosticTagOrBuilder {
            /* synthetic */ Builder(C33253a c33253a) {
                this();
            }

            public Builder addAllTagType(Iterable<? extends DiagnosticTagType> iterable) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addAllTagType(iterable);
                return this;
            }

            public Builder addAllTagTypeValue(Iterable<Integer> iterable) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addAllTagTypeValue(iterable);
                return this;
            }

            public Builder addTagType(DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).addTagType(diagnosticTagType);
                return this;
            }

            public Builder addTagTypeValue(int i) {
                ((DiagnosticTag) this.instance).addTagTypeValue(i);
                return this;
            }

            public Builder clearCustomTagType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearCustomTagType();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearIntValue();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearStringValue();
                return this;
            }

            public Builder clearTagType() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearTagType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DiagnosticTag) this.instance).clearValue();
                return this;
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public String getCustomTagType() {
                return ((DiagnosticTag) this.instance).getCustomTagType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ByteString getCustomTagTypeBytes() {
                return ((DiagnosticTag) this.instance).getCustomTagTypeBytes();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getIntValue() {
                return ((DiagnosticTag) this.instance).getIntValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public String getStringValue() {
                return ((DiagnosticTag) this.instance).getStringValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ByteString getStringValueBytes() {
                return ((DiagnosticTag) this.instance).getStringValueBytes();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public DiagnosticTagType getTagType(int i) {
                return ((DiagnosticTag) this.instance).getTagType(i);
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTagTypeCount() {
                return ((DiagnosticTag) this.instance).getTagTypeCount();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public List<DiagnosticTagType> getTagTypeList() {
                return ((DiagnosticTag) this.instance).getTagTypeList();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public int getTagTypeValue(int i) {
                return ((DiagnosticTag) this.instance).getTagTypeValue(i);
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public List<Integer> getTagTypeValueList() {
                return Collections.unmodifiableList(((DiagnosticTag) this.instance).getTagTypeValueList());
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public ValueCase getValueCase() {
                return ((DiagnosticTag) this.instance).getValueCase();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasCustomTagType() {
                return ((DiagnosticTag) this.instance).hasCustomTagType();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasIntValue() {
                return ((DiagnosticTag) this.instance).hasIntValue();
            }

            @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
            public boolean hasStringValue() {
                return ((DiagnosticTag) this.instance).hasStringValue();
            }

            public Builder setCustomTagType(String str) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setCustomTagType(str);
                return this;
            }

            public Builder setCustomTagTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setCustomTagTypeBytes(byteString);
                return this;
            }

            public Builder setIntValue(int i) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setIntValue(i);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setStringValueBytes(byteString);
                return this;
            }

            public Builder setTagType(int i, DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTagType(i, diagnosticTagType);
                return this;
            }

            public Builder setTagTypeValue(int i, int i2) {
                copyOnWrite();
                ((DiagnosticTag) this.instance).setTagTypeValue(i, i2);
                return this;
            }

            private Builder() {
                super(DiagnosticTag.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTag$ValueCase */
        /* loaded from: classes9.dex */
        public enum ValueCase {
            STRING_VALUE(3),
            INT_VALUE(4),
            VALUE_NOT_SET(0);
            
            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i != 0) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return INT_VALUE;
                    }
                    return STRING_VALUE;
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

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTag$a */
        /* loaded from: classes9.dex */
        class C33250a implements Internal.ListAdapter.Converter<Integer, DiagnosticTagType> {
            C33250a() {
            }

            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            /* renamed from: a */
            public DiagnosticTagType convert(Integer num) {
                DiagnosticTagType forNumber = DiagnosticTagType.forNumber(num.intValue());
                if (forNumber == null) {
                    return DiagnosticTagType.UNRECOGNIZED;
                }
                return forNumber;
            }
        }

        static {
            DiagnosticTag diagnosticTag = new DiagnosticTag();
            DEFAULT_INSTANCE = diagnosticTag;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticTag.class, diagnosticTag);
        }

        private DiagnosticTag() {
        }

        public void addAllTagType(Iterable<? extends DiagnosticTagType> iterable) {
            ensureTagTypeIsMutable();
            for (DiagnosticTagType diagnosticTagType : iterable) {
                this.tagType_.addInt(diagnosticTagType.getNumber());
            }
        }

        public void addAllTagTypeValue(Iterable<Integer> iterable) {
            ensureTagTypeIsMutable();
            for (Integer num : iterable) {
                this.tagType_.addInt(num.intValue());
            }
        }

        public void addTagType(DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.addInt(diagnosticTagType.getNumber());
        }

        public void addTagTypeValue(int i) {
            ensureTagTypeIsMutable();
            this.tagType_.addInt(i);
        }

        public void clearCustomTagType() {
            this.bitField0_ &= -2;
            this.customTagType_ = getDefaultInstance().getCustomTagType();
        }

        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public void clearStringValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public void clearTagType() {
            this.tagType_ = GeneratedMessageLite.emptyIntList();
        }

        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        private void ensureTagTypeIsMutable() {
            Internal.IntList intList = this.tagType_;
            if (!intList.isModifiable()) {
                this.tagType_ = GeneratedMessageLite.mutableCopy(intList);
            }
        }

        public static DiagnosticTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DiagnosticTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setCustomTagType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customTagType_ = str;
        }

        public void setCustomTagTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customTagType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public void setIntValue(int i) {
            this.valueCase_ = 4;
            this.value_ = Integer.valueOf(i);
        }

        public void setStringValue(String str) {
            str.getClass();
            this.valueCase_ = 3;
            this.value_ = str;
        }

        public void setStringValueBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 3;
        }

        public void setTagType(int i, DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, diagnosticTagType.getNumber());
        }

        public void setTagTypeValue(int i, int i2) {
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33253a.f90806a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticTag();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001,\u0002ለ\u0000\u0003Ȼ\u0000\u00047\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "tagType_", "customTagType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DiagnosticTag> parser = PARSER;
                    if (parser == null) {
                        synchronized (DiagnosticTag.class) {
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

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public String getCustomTagType() {
            return this.customTagType_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ByteString getCustomTagTypeBytes() {
            return ByteString.copyFromUtf8(this.customTagType_);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public String getStringValue() {
            if (this.valueCase_ == 3) {
                return (String) this.value_;
            }
            return "";
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ByteString getStringValueBytes() {
            String str;
            if (this.valueCase_ == 3) {
                str = (String) this.value_;
            } else {
                str = "";
            }
            return ByteString.copyFromUtf8(str);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public DiagnosticTagType getTagType(int i) {
            DiagnosticTagType forNumber = DiagnosticTagType.forNumber(this.tagType_.getInt(i));
            if (forNumber == null) {
                return DiagnosticTagType.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTagTypeCount() {
            return this.tagType_.size();
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public List<DiagnosticTagType> getTagTypeList() {
            return new Internal.ListAdapter(this.tagType_, tagType_converter_);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public int getTagTypeValue(int i) {
            return this.tagType_.getInt(i);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public List<Integer> getTagTypeValueList() {
            return this.tagType_;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasCustomTagType() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasIntValue() {
            if (this.valueCase_ == 4) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass.DiagnosticTagOrBuilder
        public boolean hasStringValue() {
            if (this.valueCase_ == 3) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DiagnosticTag diagnosticTag) {
            return DEFAULT_INSTANCE.createBuilder(diagnosticTag);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder */
    /* loaded from: classes9.dex */
    public interface DiagnosticTagOrBuilder extends MessageLiteOrBuilder {
        String getCustomTagType();

        ByteString getCustomTagTypeBytes();

        int getIntValue();

        String getStringValue();

        ByteString getStringValueBytes();

        DiagnosticTagType getTagType(int i);

        int getTagTypeCount();

        List<DiagnosticTagType> getTagTypeList();

        int getTagTypeValue(int i);

        List<Integer> getTagTypeValueList();

        DiagnosticTag.ValueCase getValueCase();

        boolean hasCustomTagType();

        boolean hasIntValue();

        boolean hasStringValue();
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType */
    /* loaded from: classes9.dex */
    public enum DiagnosticTagType implements Internal.EnumLite {
        DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);
        
        public static final int DIAGNOSTIC_TAG_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_TAG_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DiagnosticTagType> internalValueMap = new C33251a();
        private final int value;

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType$a */
        /* loaded from: classes9.dex */
        class C33251a implements Internal.EnumLiteMap<DiagnosticTagType> {
            C33251a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public DiagnosticTagType findValueByNumber(int i) {
                return DiagnosticTagType.forNumber(i);
            }
        }

        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagType$b */
        /* loaded from: classes9.dex */
        private static final class C33252b implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f90805a = new C33252b();

            private C33252b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (DiagnosticTagType.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        DiagnosticTagType(int i) {
            this.value = i;
        }

        public static DiagnosticTagType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return DIAGNOSTIC_TAG_TYPE_CUSTOM;
            }
            return DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<DiagnosticTagType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C33252b.f90805a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticTagType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33253a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90806a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90806a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90806a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90806a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90806a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90806a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90806a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90806a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private DiagnosticEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
