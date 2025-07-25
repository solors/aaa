package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class HeaderBiddingPlacement extends GeneratedMessageV3 implements HeaderBiddingPlacementOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 1;
    private static final HeaderBiddingPlacement DEFAULT_INSTANCE = new HeaderBiddingPlacement();
    private static final Parser<HeaderBiddingPlacement> PARSER = new AbstractParser<HeaderBiddingPlacement>() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.1
        @Override // com.explorestack.protobuf.Parser
        public HeaderBiddingPlacement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new HeaderBiddingPlacement(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private byte memoizedIsInitialized;

    /* loaded from: classes9.dex */
    public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
        public static final int BIDDER_FIELD_NUMBER = 1;
        public static final int BIDDER_SDKVER_FIELD_NUMBER = 2;
        public static final int CLIENT_PARAMS_FIELD_NUMBER = 3;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.1
            @Override // com.explorestack.protobuf.Parser
            public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdUnit(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PRICE_ESTIMATE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object bidderSdkver_;
        private volatile Object bidder_;
        private MapField<String, String> clientParams_;
        private byte memoizedIsInitialized;
        private double priceEstimate_;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes9.dex */
        public static final class ClientParamsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry;

            static {
                Descriptors.Descriptor descriptor = HeaderBiddingProto.f97468x652ceffc;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }

            private ClientParamsDefaultEntryHolder() {
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.f97470x82b2505e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetClientParams() {
            MapField<String, String> mapField = this.clientParams_;
            if (mapField == null) {
                return MapField.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry);
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

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public boolean containsClientParams(String str) {
            str.getClass();
            return internalGetClientParams().getMap().containsKey(str);
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
            if (getBidder().equals(adUnit.getBidder()) && getBidderSdkver().equals(adUnit.getBidderSdkver()) && internalGetClientParams().equals(adUnit.internalGetClientParams()) && Double.doubleToLongBits(getPriceEstimate()) == Double.doubleToLongBits(adUnit.getPriceEstimate()) && this.unknownFields.equals(adUnit.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidder_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getBidderSdkver() {
            Object obj = this.bidderSdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidderSdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public ByteString getBidderSdkverBytes() {
            Object obj = this.bidderSdkver_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidderSdkver_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public int getClientParamsCount() {
            return internalGetClientParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().getMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getClientParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> map = internalGetClientParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public String getClientParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> map = internalGetClientParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AdUnit> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
        public double getPriceEstimate() {
            return this.priceEstimate_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getBidderBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.bidder_);
            }
            if (!getBidderSdkverBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.bidderSdkver_);
            }
            for (Map.Entry<String, String> entry : internalGetClientParams().getMap().entrySet()) {
                i2 += CodedOutputStream.computeMessageSize(3, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            double d = this.priceEstimate_;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(4, d);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
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
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBidder().hashCode()) * 37) + 2) * 53) + getBidderSdkver().hashCode();
            if (!internalGetClientParams().getMap().isEmpty()) {
                hashCode = (((hashCode * 37) + 3) * 53) + internalGetClientParams().hashCode();
            }
            int hashLong = (((((hashCode * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getPriceEstimate()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashLong;
            return hashLong;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeaderBiddingProto.f97471xa7f238dc.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected MapField internalGetMapField(int i) {
            if (i == 3) {
                return internalGetClientParams();
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

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AdUnit();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getBidderBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.bidder_);
            }
            if (!getBidderSdkverBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.bidderSdkver_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 3);
            double d = this.priceEstimate_;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(4, d);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
            private Object bidderSdkver_;
            private Object bidder_;
            private int bitField0_;
            private MapField<String, String> clientParams_;
            private double priceEstimate_;

            public static final Descriptors.Descriptor getDescriptor() {
                return HeaderBiddingProto.f97470x82b2505e;
            }

            private MapField<String, String> internalGetClientParams() {
                MapField<String, String> mapField = this.clientParams_;
                if (mapField == null) {
                    return MapField.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                }
                return mapField;
            }

            private MapField<String, String> internalGetMutableClientParams() {
                onChanged();
                if (this.clientParams_ == null) {
                    this.clientParams_ = MapField.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                }
                if (!this.clientParams_.isMutable()) {
                    this.clientParams_ = this.clientParams_.copy();
                }
                return this.clientParams_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearBidder() {
                this.bidder_ = AdUnit.getDefaultInstance().getBidder();
                onChanged();
                return this;
            }

            public Builder clearBidderSdkver() {
                this.bidderSdkver_ = AdUnit.getDefaultInstance().getBidderSdkver();
                onChanged();
                return this;
            }

            public Builder clearClientParams() {
                internalGetMutableClientParams().getMutableMap().clear();
                return this;
            }

            public Builder clearPriceEstimate() {
                this.priceEstimate_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public boolean containsClientParams(String str) {
                str.getClass();
                return internalGetClientParams().getMap().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getBidder() {
                Object obj = this.bidder_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.bidder_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public ByteString getBidderBytes() {
                Object obj = this.bidder_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.bidder_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getBidderSdkver() {
                Object obj = this.bidderSdkver_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.bidderSdkver_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public ByteString getBidderSdkverBytes() {
                Object obj = this.bidderSdkver_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.bidderSdkver_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getClientParams() {
                return getClientParamsMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public int getClientParamsCount() {
                return internalGetClientParams().getMap().size();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public Map<String, String> getClientParamsMap() {
                return internalGetClientParams().getMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getClientParamsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> map = internalGetClientParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                return str2;
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public String getClientParamsOrThrow(String str) {
                str.getClass();
                Map<String, String> map = internalGetClientParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return HeaderBiddingProto.f97470x82b2505e;
            }

            @Deprecated
            public Map<String, String> getMutableClientParams() {
                return internalGetMutableClientParams().getMutableMap();
            }

            @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnitOrBuilder
            public double getPriceEstimate() {
                return this.priceEstimate_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HeaderBiddingProto.f97471xa7f238dc.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected MapField internalGetMapField(int i) {
                if (i == 3) {
                    return internalGetClientParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected MapField internalGetMutableMapField(int i) {
                if (i == 3) {
                    return internalGetMutableClientParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllClientParams(Map<String, String> map) {
                internalGetMutableClientParams().getMutableMap().putAll(map);
                return this;
            }

            public Builder putClientParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableClientParams().getMutableMap().put(str, str2);
                return this;
            }

            public Builder removeClientParams(String str) {
                str.getClass();
                internalGetMutableClientParams().getMutableMap().remove(str);
                return this;
            }

            public Builder setBidder(String str) {
                str.getClass();
                this.bidder_ = str;
                onChanged();
                return this;
            }

            public Builder setBidderBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.bidder_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBidderSdkver(String str) {
                str.getClass();
                this.bidderSdkver_ = str;
                onChanged();
                return this;
            }

            public Builder setBidderSdkverBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.bidderSdkver_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPriceEstimate(double d) {
                this.priceEstimate_ = d;
                onChanged();
                return this;
            }

            private Builder() {
                this.bidder_ = "";
                this.bidderSdkver_ = "";
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
                adUnit.bidder_ = this.bidder_;
                adUnit.bidderSdkver_ = this.bidderSdkver_;
                adUnit.clientParams_ = internalGetClientParams();
                adUnit.clientParams_.makeImmutable();
                adUnit.priceEstimate_ = this.priceEstimate_;
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
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                internalGetMutableClientParams().clear();
                this.priceEstimate_ = 0.0d;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.bidder_ = "";
                this.bidderSdkver_ = "";
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
                if (!adUnit.getBidder().isEmpty()) {
                    this.bidder_ = adUnit.bidder_;
                    onChanged();
                }
                if (!adUnit.getBidderSdkver().isEmpty()) {
                    this.bidderSdkver_ = adUnit.bidderSdkver_;
                    onChanged();
                }
                internalGetMutableClientParams().mergeFrom(adUnit.internalGetClientParams());
                if (adUnit.getPriceEstimate() != 0.0d) {
                    setPriceEstimate(adUnit.getPriceEstimate());
                }
                mergeUnknownFields(((GeneratedMessageV3) adUnit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit$Builder");
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
            this.bidder_ = "";
            this.bidderSdkver_ = "";
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
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

        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
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
                            if (readTag == 10) {
                                this.bidder_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.bidderSdkver_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!(z2 & true)) {
                                    this.clientParams_ = MapField.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.clientParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (readTag != 33) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.priceEstimate_ = codedInputStream.readDouble();
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
        boolean containsClientParams(String str);

        String getBidder();

        ByteString getBidderBytes();

        String getBidderSdkver();

        ByteString getBidderSdkverBytes();

        @Deprecated
        Map<String, String> getClientParams();

        int getClientParamsCount();

        Map<String, String> getClientParamsMap();

        String getClientParamsOrDefault(String str, String str2);

        String getClientParamsOrThrow(String str);

        double getPriceEstimate();
    }

    public static HeaderBiddingPlacement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.f97472x11be5538;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<HeaderBiddingPlacement> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingPlacement)) {
            return super.equals(obj);
        }
        HeaderBiddingPlacement headerBiddingPlacement = (HeaderBiddingPlacement) obj;
        if (getAdUnitsList().equals(headerBiddingPlacement.getAdUnitsList()) && this.unknownFields.equals(headerBiddingPlacement.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public AdUnit getAdUnits(int i) {
        return this.adUnits_.get(i);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
        return this.adUnits_.get(i);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<HeaderBiddingPlacement> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.adUnits_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.adUnits_.get(i3));
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
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
        int hashCode = 779 + getDescriptor().hashCode();
        if (getAdUnitsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getAdUnitsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return HeaderBiddingProto.f97473xbf00c3b6.ensureFieldAccessorsInitialized(HeaderBiddingPlacement.class, Builder.class);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new HeaderBiddingPlacement();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.adUnits_.size(); i++) {
            codedOutputStream.writeMessage(1, this.adUnits_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderBiddingPlacementOrBuilder {
        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;

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

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.f97472x11be5538;
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

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
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

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public int getAdUnitsCount() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public List<AdUnit> getAdUnitsList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.adUnits_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.adUnits_);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.f97472x11be5538;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeaderBiddingProto.f97473xbf00c3b6.ensureFieldAccessorsInitialized(HeaderBiddingPlacement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
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

        private Builder() {
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingPlacement build() {
            HeaderBiddingPlacement buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingPlacement buildPartial() {
            HeaderBiddingPlacement headerBiddingPlacement = new HeaderBiddingPlacement(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -2;
                }
                headerBiddingPlacement.adUnits_ = this.adUnits_;
            } else {
                headerBiddingPlacement.adUnits_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return headerBiddingPlacement;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public HeaderBiddingPlacement getDefaultInstanceForType() {
            return HeaderBiddingPlacement.getDefaultInstance();
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
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnits_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
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
            if (message instanceof HeaderBiddingPlacement) {
                return mergeFrom((HeaderBiddingPlacement) message);
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

        public Builder mergeFrom(HeaderBiddingPlacement headerBiddingPlacement) {
            if (headerBiddingPlacement == HeaderBiddingPlacement.getDefaultInstance()) {
                return this;
            }
            if (this.adUnitsBuilder_ == null) {
                if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = headerBiddingPlacement.adUnits_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(headerBiddingPlacement.adUnits_);
                    }
                    onChanged();
                }
            } else if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                if (!this.adUnitsBuilder_.isEmpty()) {
                    this.adUnitsBuilder_.addAllMessages(headerBiddingPlacement.adUnits_);
                } else {
                    this.adUnitsBuilder_.dispose();
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = headerBiddingPlacement.adUnits_;
                    this.bitField0_ &= -2;
                    this.adUnitsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) headerBiddingPlacement).unknownFields);
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

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.access$2100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$Builder");
        }
    }

    public static Builder newBuilder(HeaderBiddingPlacement headerBiddingPlacement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingPlacement);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private HeaderBiddingPlacement(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public HeaderBiddingPlacement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private HeaderBiddingPlacement() {
        this.memoizedIsInitialized = (byte) -1;
        this.adUnits_ = Collections.emptyList();
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HeaderBiddingPlacement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.adUnits_ = new ArrayList();
                                z2 |= true;
                            }
                            this.adUnits_.add(codedInputStream.readMessage(AdUnit.parser(), extensionRegistryLite));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } finally {
                if (z2 & true) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static HeaderBiddingPlacement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
