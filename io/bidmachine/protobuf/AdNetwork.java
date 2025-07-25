package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
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
public final class AdNetwork extends GeneratedMessageV3 implements AdNetworkOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private volatile Object className_;
    private MapField<String, String> customParams_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private static final AdNetwork DEFAULT_INSTANCE = new AdNetwork();
    private static final Parser<AdNetwork> PARSER = new AbstractParser<AdNetwork>() { // from class: io.bidmachine.protobuf.AdNetwork.1
        @Override // com.explorestack.protobuf.Parser
        public AdNetwork parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdNetwork(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes9.dex */
    public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        public static final int CUSTOM_PARAMS_FIELD_NUMBER = 2;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() { // from class: io.bidmachine.protobuf.AdNetwork.AdUnit.1
            @Override // com.explorestack.protobuf.Parser
            public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdUnit(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object adFormat_;
        private MapField<String, String> customParams_;
        private byte memoizedIsInitialized;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes9.dex */
        public static final class CustomParamsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry;

            static {
                Descriptors.Descriptor descriptor = InitProto.f97410xb5890629;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }

            private CustomParamsDefaultEntryHolder() {
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetCustomParams() {
            MapField<String, String> mapField = this.customParams_;
            if (mapField == null) {
                return MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry);
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

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().getMap().containsKey(str);
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
            if (getAdFormat().equals(adUnit.getAdFormat()) && internalGetCustomParams().equals(adUnit.internalGetCustomParams()) && this.unknownFields.equals(adUnit.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getAdFormat() {
            Object obj = this.adFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adFormat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public ByteString getAdFormatBytes() {
            Object obj = this.adFormat_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adFormat_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return str2;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AdUnit> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAdFormatBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.adFormat_);
            }
            for (Map.Entry<String, String> entry : internalGetCustomParams().getMap().entrySet()) {
                i2 += CodedOutputStream.computeMessageSize(2, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
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
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdFormat().hashCode();
            if (!internalGetCustomParams().getMap().isEmpty()) {
                hashCode = (((hashCode * 37) + 2) * 53) + internalGetCustomParams().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.f97412xdeef64a3.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected MapField internalGetMapField(int i) {
            if (i == 2) {
                return internalGetCustomParams();
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
            if (!getAdFormatBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.adFormat_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 2);
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
            private Object adFormat_;
            private int bitField0_;
            private MapField<String, String> customParams_;

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            private MapField<String, String> internalGetCustomParams() {
                MapField<String, String> mapField = this.customParams_;
                if (mapField == null) {
                    return MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                }
                return mapField;
            }

            private MapField<String, String> internalGetMutableCustomParams() {
                onChanged();
                if (this.customParams_ == null) {
                    this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                }
                if (!this.customParams_.isMutable()) {
                    this.customParams_ = this.customParams_.copy();
                }
                return this.customParams_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearAdFormat() {
                this.adFormat_ = AdUnit.getDefaultInstance().getAdFormat();
                onChanged();
                return this;
            }

            public Builder clearCustomParams() {
                internalGetMutableCustomParams().getMutableMap().clear();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public boolean containsCustomParams(String str) {
                str.getClass();
                return internalGetCustomParams().getMap().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getAdFormat() {
                Object obj = this.adFormat_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adFormat_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public ByteString getAdFormatBytes() {
                Object obj = this.adFormat_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adFormat_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomParams() {
                return getCustomParamsMap();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public int getCustomParamsCount() {
                return internalGetCustomParams().getMap().size();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public Map<String, String> getCustomParamsMap() {
                return internalGetCustomParams().getMap();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> map = internalGetCustomParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                return str2;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrThrow(String str) {
                str.getClass();
                Map<String, String> map = internalGetCustomParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            @Deprecated
            public Map<String, String> getMutableCustomParams() {
                return internalGetMutableCustomParams().getMutableMap();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return InitProto.f97412xdeef64a3.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected MapField internalGetMapField(int i) {
                if (i == 2) {
                    return internalGetCustomParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected MapField internalGetMutableMapField(int i) {
                if (i == 2) {
                    return internalGetMutableCustomParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllCustomParams(Map<String, String> map) {
                internalGetMutableCustomParams().getMutableMap().putAll(map);
                return this;
            }

            public Builder putCustomParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCustomParams().getMutableMap().put(str, str2);
                return this;
            }

            public Builder removeCustomParams(String str) {
                str.getClass();
                internalGetMutableCustomParams().getMutableMap().remove(str);
                return this;
            }

            public Builder setAdFormat(String str) {
                str.getClass();
                this.adFormat_ = str;
                onChanged();
                return this;
            }

            public Builder setAdFormatBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.adFormat_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.adFormat_ = "";
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
                adUnit.adFormat_ = this.adFormat_;
                adUnit.customParams_ = internalGetCustomParams();
                adUnit.customParams_.makeImmutable();
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
                this.adFormat_ = "";
                internalGetMutableCustomParams().clear();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.adFormat_ = "";
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
                if (!adUnit.getAdFormat().isEmpty()) {
                    this.adFormat_ = adUnit.adFormat_;
                    onChanged();
                }
                internalGetMutableCustomParams().mergeFrom(adUnit.internalGetCustomParams());
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
            public io.bidmachine.protobuf.AdNetwork.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdNetwork.AdUnit.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.AdNetwork$AdUnit r3 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.AdNetwork$AdUnit r4 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdNetwork$AdUnit$Builder");
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
            this.adFormat_ = "";
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

        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
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
                                this.adFormat_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 18) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.customParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
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
        boolean containsCustomParams(String str);

        String getAdFormat();

        ByteString getAdFormatBytes();

        @Deprecated
        Map<String, String> getCustomParams();

        int getCustomParamsCount();

        Map<String, String> getCustomParamsMap();

        String getCustomParamsOrDefault(String str, String str2);

        String getCustomParamsOrThrow(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static final class CustomParamsDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry;

        static {
            Descriptors.Descriptor descriptor = InitProto.f97413x7f725455;
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
        }

        private CustomParamsDefaultEntryHolder() {
        }
    }

    public static AdNetwork getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetCustomParams() {
        MapField<String, String> mapField = this.customParams_;
        if (mapField == null) {
            return MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry);
        }
        return mapField;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<AdNetwork> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdNetwork)) {
            return super.equals(obj);
        }
        AdNetwork adNetwork = (AdNetwork) obj;
        if (getName().equals(adNetwork.getName()) && getClassName().equals(adNetwork.getClassName()) && internalGetCustomParams().equals(adNetwork.internalGetCustomParams()) && getAdUnitsList().equals(adNetwork.getAdUnitsList()) && this.unknownFields.equals(adNetwork.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnit getAdUnits(int i) {
        return this.adUnits_.get(i);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
        return this.adUnits_.get(i);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getClassName() {
        Object obj = this.className_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.className_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public ByteString getClassNameBytes() {
        Object obj = this.className_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.className_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().getMap().size();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().getMap();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> map = internalGetCustomParams().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return str2;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map<String, String> map = internalGetCustomParams().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<AdNetwork> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        if (!getNameBytes().isEmpty()) {
            i = GeneratedMessageV3.computeStringSize(1, this.name_) + 0;
        } else {
            i = 0;
        }
        if (!getClassNameBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(2, this.className_);
        }
        for (Map.Entry<String, String> entry : internalGetCustomParams().getMap().entrySet()) {
            i += CodedOutputStream.computeMessageSize(3, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        for (int i3 = 0; i3 < this.adUnits_.size(); i3++) {
            i += CodedOutputStream.computeMessageSize(4, this.adUnits_.get(i3));
        }
        int serializedSize = i + this.unknownFields.getSerializedSize();
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
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getClassName().hashCode();
        if (!internalGetCustomParams().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 3) * 53) + internalGetCustomParams().hashCode();
        }
        if (getAdUnitsCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getAdUnitsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.ensureFieldAccessorsInitialized(AdNetwork.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected MapField internalGetMapField(int i) {
        if (i == 3) {
            return internalGetCustomParams();
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
        return new AdNetwork();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if (!getClassNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.className_);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 3);
        for (int i = 0; i < this.adUnits_.size(); i++) {
            codedOutputStream.writeMessage(4, this.adUnits_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdNetworkOrBuilder {
        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;
        private Object className_;
        private MapField<String, String> customParams_;
        private Object name_;

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 2;
            }
        }

        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> getAdUnitsFieldBuilder() {
            boolean z;
            if (this.adUnitsBuilder_ == null) {
                List<AdUnit> list = this.adUnits_;
                if ((this.bitField0_ & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.adUnitsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        private MapField<String, String> internalGetCustomParams() {
            MapField<String, String> mapField = this.customParams_;
            if (mapField == null) {
                return MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            return mapField;
        }

        private MapField<String, String> internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.isMutable()) {
                this.customParams_ = this.customParams_.copy();
            }
            return this.customParams_;
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
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearClassName() {
            this.className_ = AdNetwork.getDefaultInstance().getClassName();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().getMutableMap().clear();
            return this;
        }

        public Builder clearName() {
            this.name_ = AdNetwork.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
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

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public int getAdUnitsCount() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public List<AdUnit> getAdUnitsList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.adUnits_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.adUnits_);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getClassName() {
            Object obj = this.className_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.className_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getClassNameBytes() {
            Object obj = this.className_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.className_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return str2;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().getMutableMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.ensureFieldAccessorsInitialized(AdNetwork.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected MapField internalGetMapField(int i) {
            if (i == 3) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected MapField internalGetMutableMapField(int i) {
            if (i == 3) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().getMutableMap().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().getMutableMap().put(str, str2);
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

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().getMutableMap().remove(str);
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

        public Builder setClassName(String str) {
            str.getClass();
            this.className_ = str;
            onChanged();
            return this;
        }

        public Builder setClassNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.className_ = byteString;
            onChanged();
            return this;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork build() {
            AdNetwork buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork buildPartial() {
            AdNetwork adNetwork = new AdNetwork(this);
            adNetwork.name_ = this.name_;
            adNetwork.className_ = this.className_;
            adNetwork.customParams_ = internalGetCustomParams();
            adNetwork.customParams_.makeImmutable();
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                adNetwork.adUnits_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -3;
                }
                adNetwork.adUnits_ = this.adUnits_;
            }
            onBuilt();
            return adNetwork;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AdNetwork getDefaultInstanceForType() {
            return AdNetwork.getDefaultInstance();
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
            this.name_ = "";
            this.className_ = "";
            internalGetMutableCustomParams().clear();
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnits_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV3.clear();
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
            if (message instanceof AdNetwork) {
                return mergeFrom((AdNetwork) message);
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
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AdNetwork adNetwork) {
            if (adNetwork == AdNetwork.getDefaultInstance()) {
                return this;
            }
            if (!adNetwork.getName().isEmpty()) {
                this.name_ = adNetwork.name_;
                onChanged();
            }
            if (!adNetwork.getClassName().isEmpty()) {
                this.className_ = adNetwork.className_;
                onChanged();
            }
            internalGetMutableCustomParams().mergeFrom(adNetwork.internalGetCustomParams());
            if (this.adUnitsBuilder_ == null) {
                if (!adNetwork.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = adNetwork.adUnits_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(adNetwork.adUnits_);
                    }
                    onChanged();
                }
            } else if (!adNetwork.adUnits_.isEmpty()) {
                if (!this.adUnitsBuilder_.isEmpty()) {
                    this.adUnitsBuilder_.addAllMessages(adNetwork.adUnits_);
                } else {
                    this.adUnitsBuilder_.dispose();
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = adNetwork.adUnits_;
                    this.bitField0_ &= -3;
                    this.adUnitsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) adNetwork).unknownFields);
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
        public io.bidmachine.protobuf.AdNetwork.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdNetwork.access$2200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AdNetwork r3 = (io.bidmachine.protobuf.AdNetwork) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AdNetwork r4 = (io.bidmachine.protobuf.AdNetwork) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdNetwork$Builder");
        }
    }

    public static Builder newBuilder(AdNetwork adNetwork) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adNetwork);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private AdNetwork(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public AdNetwork getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdNetwork parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdNetwork() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.className_ = "";
        this.adUnits_ = Collections.emptyList();
    }

    public static AdNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static AdNetwork parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AdNetwork parseFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    private AdNetwork(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.name_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.className_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!(z2 & true)) {
                                    this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.customParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (readTag != 34) {
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
                    }
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

    public static AdNetwork parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdNetwork parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
