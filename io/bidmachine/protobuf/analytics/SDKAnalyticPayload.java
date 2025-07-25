package io.bidmachine.protobuf.analytics;

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
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class SDKAnalyticPayload extends GeneratedMessageV3 implements SDKAnalyticPayloadOrBuilder {
    public static final int METRICS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Metric> metrics_;
    private static final SDKAnalyticPayload DEFAULT_INSTANCE = new SDKAnalyticPayload();
    private static final Parser<SDKAnalyticPayload> PARSER = new AbstractParser<SDKAnalyticPayload>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.1
        @Override // com.explorestack.protobuf.Parser
        public SDKAnalyticPayload parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SDKAnalyticPayload(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes9.dex */
    public static final class Metric extends GeneratedMessageV3 implements MetricOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Metric DEFAULT_INSTANCE = new Metric();
        private static final Parser<Metric> PARSER = new AbstractParser<Metric>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.1
            @Override // com.explorestack.protobuf.Parser
            public Metric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Metric(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object context_;
        private List<MetricData> data_;
        private byte memoizedIsInitialized;

        /* loaded from: classes9.dex */
        public static final class MetricData extends GeneratedMessageV3 implements MetricDataOrBuilder {
            public static final int DIMENSIONS_FIELD_NUMBER = 3;
            public static final int ERROR_FIELD_NUMBER = 5;
            public static final int MEASURES_FIELD_NUMBER = 4;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int TIMESTAMP_FIELD_NUMBER = 1;
            public static final int TS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Dimension> dimensions_;
            private Error error_;
            private List<Measure> measures_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object timestamp_;
            private Timestamp ts_;
            private static final MetricData DEFAULT_INSTANCE = new MetricData();
            private static final Parser<MetricData> PARSER = new AbstractParser<MetricData>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.1
                @Override // com.explorestack.protobuf.Parser
                public MetricData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new MetricData(codedInputStream, extensionRegistryLite);
                }
            };

            /* loaded from: classes9.dex */
            public static final class Dimension extends GeneratedMessageV3 implements DimensionOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private volatile Object value_;
                private static final Dimension DEFAULT_INSTANCE = new Dimension();
                private static final Parser<Dimension> PARSER = new AbstractParser<Dimension>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.1
                    @Override // com.explorestack.protobuf.Parser
                    public Dimension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Dimension(codedInputStream, extensionRegistryLite);
                    }
                };

                public static Dimension getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.f97448x769ec1cf;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Parser<Dimension> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Dimension)) {
                        return super.equals(obj);
                    }
                    Dimension dimension = (Dimension) obj;
                    if (getName().equals(dimension.getName()) && getValue().equals(dimension.getValue()) && this.unknownFields.equals(dimension.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
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
                public Parser<Dimension> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    if (!getNameBytes().isEmpty()) {
                        i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        i2 += GeneratedMessageV3.computeStringSize(2, this.value_);
                    }
                    int serializedSize = i2 + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.f97449x9712a94d.ensureFieldAccessorsInitialized(Dimension.class, Builder.class);
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
                    return new Dimension();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                /* loaded from: classes9.dex */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DimensionOrBuilder {
                    private Object name_;
                    private Object value_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.f97448x769ec1cf;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Dimension.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Dimension.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.f97448x769ec1cf;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.name_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.name_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.value_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.value_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.f97449x9712a94d.ensureFieldAccessorsInitialized(Dimension.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        byteString.getClass();
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension build() {
                        Dimension buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension buildPartial() {
                        Dimension dimension = new Dimension(this);
                        dimension.name_ = this.name_;
                        dimension.value_ = this.value_;
                        onBuilt();
                        return dimension;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public Dimension getDefaultInstanceForType() {
                        return Dimension.getDefaultInstance();
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
                        this.name_ = "";
                        this.value_ = "";
                        return this;
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public Builder mo110022clone() {
                        return (Builder) super.mo110022clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Dimension) {
                            return mergeFrom((Dimension) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Dimension dimension) {
                        if (dimension == Dimension.getDefaultInstance()) {
                            return this;
                        }
                        if (!dimension.getName().isEmpty()) {
                            this.name_ = dimension.name_;
                            onChanged();
                        }
                        if (!dimension.getValue().isEmpty()) {
                            this.value_ = dimension.value_;
                            onChanged();
                        }
                        mergeUnknownFields(((GeneratedMessageV3) dimension).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension$Builder");
                    }
                }

                public static Builder newBuilder(Dimension dimension) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(dimension);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                private Dimension(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Dimension getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Dimension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Dimension() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.value_ = "";
                }

                public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static Dimension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Dimension parseFrom(InputStream inputStream) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                private Dimension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.name_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag != 18) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            this.value_ = codedInputStream.readStringRequireUtf8();
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

                public static Dimension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Dimension parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Dimension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            /* loaded from: classes9.dex */
            public interface DimensionOrBuilder extends MessageOrBuilder {
                String getName();

                ByteString getNameBytes();

                String getValue();

                ByteString getValueBytes();
            }

            /* loaded from: classes9.dex */
            public static final class Error extends GeneratedMessageV3 implements ErrorOrBuilder {
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final Parser<Error> PARSER = new AbstractParser<Error>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.1
                    @Override // com.explorestack.protobuf.Parser
                    public Error parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Error(codedInputStream, extensionRegistryLite);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.f97450x643c8f6d;
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
                    if (getName().equals(error.getName()) && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                public Parser<Error> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    if (!getNameBytes().isEmpty()) {
                        i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        i2 += GeneratedMessageV3.computeStringSize(2, this.description_);
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
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.f97451xe6cff8eb.ensureFieldAccessorsInitialized(Error.class, Builder.class);
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
                    return new Error();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.description_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                /* loaded from: classes9.dex */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ErrorOrBuilder {
                    private Object description_;
                    private Object name_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.f97450x643c8f6d;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Error.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.description_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                        return SDKAnalyticProto.f97450x643c8f6d;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.name_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                        return SDKAnalyticProto.f97451xe6cff8eb.ensureFieldAccessorsInitialized(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
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
                        error.name_ = this.name_;
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
                        this.name_ = "";
                        this.description_ = "";
                        return this;
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.name_ = "";
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
                        if (!error.getName().isEmpty()) {
                            this.name_ = error.name_;
                            onChanged();
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(((GeneratedMessageV3) error).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.access$2800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error$Builder");
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
                    this.name_ = "";
                    this.description_ = "";
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
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
                                        if (readTag == 10) {
                                            this.name_ = codedInputStream.readStringRequireUtf8();
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
                String getDescription();

                ByteString getDescriptionBytes();

                String getName();

                ByteString getNameBytes();
            }

            /* loaded from: classes9.dex */
            public static final class Measure extends GeneratedMessageV3 implements MeasureOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private double value_;
                private static final Measure DEFAULT_INSTANCE = new Measure();
                private static final Parser<Measure> PARSER = new AbstractParser<Measure>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.1
                    @Override // com.explorestack.protobuf.Parser
                    public Measure parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Measure(codedInputStream, extensionRegistryLite);
                    }
                };

                public static Measure getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.f97452xa931ac97;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Measure parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Measure) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Parser<Measure> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Measure)) {
                        return super.equals(obj);
                    }
                    Measure measure = (Measure) obj;
                    if (getName().equals(measure.getName()) && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(measure.getValue()) && this.unknownFields.equals(measure.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
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
                public Parser<Measure> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    if (!getNameBytes().isEmpty()) {
                        i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    double d = this.value_;
                    if (d != 0.0d) {
                        i2 += CodedOutputStream.computeDoubleSize(2, d);
                    }
                    int serializedSize = i2 + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public double getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i = this.memoizedHashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getValue()))) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.f97453x7a924c15.ensureFieldAccessorsInitialized(Measure.class, Builder.class);
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
                    return new Measure();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                    }
                    double d = this.value_;
                    if (d != 0.0d) {
                        codedOutputStream.writeDouble(2, d);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                /* loaded from: classes9.dex */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasureOrBuilder {
                    private Object name_;
                    private double value_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.f97452xa931ac97;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Measure.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = 0.0d;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.f97452xa931ac97;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.name_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.name_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public double getValue() {
                        return this.value_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.f97453x7a924c15.ensureFieldAccessorsInitialized(Measure.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder setValue(double d) {
                        this.value_ = d;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure build() {
                        Measure buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure buildPartial() {
                        Measure measure = new Measure(this);
                        measure.name_ = this.name_;
                        measure.value_ = this.value_;
                        onBuilt();
                        return measure;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public Measure getDefaultInstanceForType() {
                        return Measure.getDefaultInstance();
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
                        this.name_ = "";
                        this.value_ = 0.0d;
                        return this;
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public Builder mo110022clone() {
                        return (Builder) super.mo110022clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Measure) {
                            return mergeFrom((Measure) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Measure measure) {
                        if (measure == Measure.getDefaultInstance()) {
                            return this;
                        }
                        if (!measure.getName().isEmpty()) {
                            this.name_ = measure.name_;
                            onChanged();
                        }
                        if (measure.getValue() != 0.0d) {
                            setValue(measure.getValue());
                        }
                        mergeUnknownFields(((GeneratedMessageV3) measure).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure$Builder");
                    }
                }

                public static Builder newBuilder(Measure measure) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(measure);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                private Measure(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Measure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Measure) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Measure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Measure getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Measure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Measure() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                }

                public static Measure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static Measure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Measure parseFrom(InputStream inputStream) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                private Measure(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.name_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag != 17) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            this.value_ = codedInputStream.readDouble();
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

                public static Measure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Measure parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Measure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            /* loaded from: classes9.dex */
            public interface MeasureOrBuilder extends MessageOrBuilder {
                String getName();

                ByteString getNameBytes();

                double getValue();
            }

            public static MetricData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.f97454x79f1df6;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MetricData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<MetricData> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetricData)) {
                    return super.equals(obj);
                }
                MetricData metricData = (MetricData) obj;
                if (!getTimestamp().equals(metricData.getTimestamp()) || !getName().equals(metricData.getName()) || !getDimensionsList().equals(metricData.getDimensionsList()) || !getMeasuresList().equals(metricData.getMeasuresList()) || hasError() != metricData.hasError()) {
                    return false;
                }
                if ((hasError() && !getError().equals(metricData.getError())) || hasTs() != metricData.hasTs()) {
                    return false;
                }
                if ((!hasTs() || getTs().equals(metricData.getTs())) && this.unknownFields.equals(metricData.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Dimension getDimensions(int i) {
                return this.dimensions_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Dimension> getDimensionsList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public DimensionOrBuilder getDimensionsOrBuilder(int i) {
                return this.dimensions_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Error getError() {
                Error error = this.error_;
                if (error == null) {
                    return Error.getDefaultInstance();
                }
                return error;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Measure getMeasures(int i) {
                return this.measures_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getMeasuresCount() {
                return this.measures_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Measure> getMeasuresList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public MeasureOrBuilder getMeasuresOrBuilder(int i) {
                return this.measures_.get(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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
            public Parser<MetricData> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i;
                int i2 = this.memoizedSize;
                if (i2 != -1) {
                    return i2;
                }
                if (!getTimestampBytes().isEmpty()) {
                    i = GeneratedMessageV3.computeStringSize(1, this.timestamp_) + 0;
                } else {
                    i = 0;
                }
                if (!getNameBytes().isEmpty()) {
                    i += GeneratedMessageV3.computeStringSize(2, this.name_);
                }
                for (int i3 = 0; i3 < this.dimensions_.size(); i3++) {
                    i += CodedOutputStream.computeMessageSize(3, this.dimensions_.get(i3));
                }
                for (int i4 = 0; i4 < this.measures_.size(); i4++) {
                    i += CodedOutputStream.computeMessageSize(4, this.measures_.get(i4));
                }
                if (this.error_ != null) {
                    i += CodedOutputStream.computeMessageSize(5, getError());
                }
                if (this.ts_ != null) {
                    i += CodedOutputStream.computeMessageSize(6, getTs());
                }
                int serializedSize = i + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public String getTimestamp() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public ByteString getTimestampBytes() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.timestamp_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Timestamp getTs() {
                Timestamp timestamp = this.ts_;
                if (timestamp == null) {
                    return Timestamp.getDefaultInstance();
                }
                return timestamp;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public TimestampOrBuilder getTsOrBuilder() {
                return getTs();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasError() {
                if (this.error_ != null) {
                    return true;
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasTs() {
                if (this.ts_ != null) {
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
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getName().hashCode();
                if (getDimensionsCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getDimensionsList().hashCode();
                }
                if (getMeasuresCount() > 0) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getMeasuresList().hashCode();
                }
                if (hasError()) {
                    hashCode = (((hashCode * 37) + 5) * 53) + getError().hashCode();
                }
                if (hasTs()) {
                    hashCode = (((hashCode * 37) + 6) * 53) + getTs().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKAnalyticProto.f97455x5663ee74.ensureFieldAccessorsInitialized(MetricData.class, Builder.class);
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
                return new MetricData();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getTimestampBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.timestamp_);
                }
                if (!getNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
                }
                for (int i = 0; i < this.dimensions_.size(); i++) {
                    codedOutputStream.writeMessage(3, this.dimensions_.get(i));
                }
                for (int i2 = 0; i2 < this.measures_.size(); i2++) {
                    codedOutputStream.writeMessage(4, this.measures_.get(i2));
                }
                if (this.error_ != null) {
                    codedOutputStream.writeMessage(5, getError());
                }
                if (this.ts_ != null) {
                    codedOutputStream.writeMessage(6, getTs());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricDataOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> dimensionsBuilder_;
                private List<Dimension> dimensions_;
                private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
                private Error error_;
                private RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> measuresBuilder_;
                private List<Measure> measures_;
                private Object name_;
                private Object timestamp_;
                private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> tsBuilder_;
                private Timestamp ts_;

                private void ensureDimensionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.dimensions_ = new ArrayList(this.dimensions_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureMeasuresIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.measures_ = new ArrayList(this.measures_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.f97454x79f1df6;
                }

                private RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> getDimensionsFieldBuilder() {
                    if (this.dimensionsBuilder_ == null) {
                        List<Dimension> list = this.dimensions_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.dimensionsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.dimensions_ = null;
                    }
                    return this.dimensionsBuilder_;
                }

                private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new SingleFieldBuilderV3<>(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> getMeasuresFieldBuilder() {
                    boolean z;
                    if (this.measuresBuilder_ == null) {
                        List<Measure> list = this.measures_;
                        if ((this.bitField0_ & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.measuresBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.measures_ = null;
                    }
                    return this.measuresBuilder_;
                }

                private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getTsFieldBuilder() {
                    if (this.tsBuilder_ == null) {
                        this.tsBuilder_ = new SingleFieldBuilderV3<>(getTs(), getParentForChildren(), isClean());
                        this.ts_ = null;
                    }
                    return this.tsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getDimensionsFieldBuilder();
                        getMeasuresFieldBuilder();
                    }
                }

                public Builder addAllDimensions(Iterable<? extends Dimension> iterable) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.dimensions_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder addAllMeasures(Iterable<? extends Measure> iterable) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.measures_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder addDimensions(Dimension dimension) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(dimension);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(dimension);
                    }
                    return this;
                }

                public Dimension.Builder addDimensionsBuilder() {
                    return getDimensionsFieldBuilder().addBuilder(Dimension.getDefaultInstance());
                }

                public Builder addMeasures(Measure measure) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(measure);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(measure);
                    }
                    return this;
                }

                public Measure.Builder addMeasuresBuilder() {
                    return getMeasuresFieldBuilder().addBuilder(Measure.getDefaultInstance());
                }

                public Builder clearDimensions() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.dimensions_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
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

                public Builder clearMeasures() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.measures_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder clearName() {
                    this.name_ = MetricData.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder clearTimestamp() {
                    this.timestamp_ = MetricData.getDefaultInstance().getTimestamp();
                    onChanged();
                    return this;
                }

                public Builder clearTs() {
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        onChanged();
                    } else {
                        this.ts_ = null;
                        this.tsBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticProto.f97454x79f1df6;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Dimension getDimensions(int i) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.dimensions_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Dimension.Builder getDimensionsBuilder(int i) {
                    return getDimensionsFieldBuilder().getBuilder(i);
                }

                public List<Dimension.Builder> getDimensionsBuilderList() {
                    return getDimensionsFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getDimensionsCount() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.dimensions_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Dimension> getDimensionsList() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.dimensions_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public DimensionOrBuilder getDimensionsOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.dimensions_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.dimensions_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Measure getMeasures(int i) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.measures_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Measure.Builder getMeasuresBuilder(int i) {
                    return getMeasuresFieldBuilder().getBuilder(i);
                }

                public List<Measure.Builder> getMeasuresBuilderList() {
                    return getMeasuresFieldBuilder().getBuilderList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getMeasuresCount() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.measures_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Measure> getMeasuresList() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.measures_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public MeasureOrBuilder getMeasuresOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.measures_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.measures_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public String getTimestamp() {
                    Object obj = this.timestamp_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.timestamp_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public ByteString getTimestampBytes() {
                    Object obj = this.timestamp_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.timestamp_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Timestamp getTs() {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.tsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Timestamp timestamp = this.ts_;
                        if (timestamp == null) {
                            return Timestamp.getDefaultInstance();
                        }
                        return timestamp;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public Timestamp.Builder getTsBuilder() {
                    onChanged();
                    return getTsFieldBuilder().getBuilder();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public TimestampOrBuilder getTsOrBuilder() {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.tsBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Timestamp timestamp = this.ts_;
                    if (timestamp == null) {
                        return Timestamp.getDefaultInstance();
                    }
                    return timestamp;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasError() {
                    if (this.errorBuilder_ == null && this.error_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasTs() {
                    if (this.tsBuilder_ == null && this.ts_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.f97455x5663ee74.ensureFieldAccessorsInitialized(MetricData.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
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

                public Builder mergeTs(Timestamp timestamp) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.tsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Timestamp timestamp2 = this.ts_;
                        if (timestamp2 != null) {
                            this.ts_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                        } else {
                            this.ts_ = timestamp;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(timestamp);
                    }
                    return this;
                }

                public Builder removeDimensions(int i) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Builder removeMeasures(int i) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Builder setDimensions(int i, Dimension dimension) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i, dimension);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, dimension);
                    }
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

                public Builder setMeasures(int i, Measure measure) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.set(i, measure);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, measure);
                    }
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

                @Deprecated
                public Builder setTimestamp(String str) {
                    str.getClass();
                    this.timestamp_ = str;
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder setTimestampBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.timestamp_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTs(Timestamp timestamp) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.tsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        timestamp.getClass();
                        this.ts_ = timestamp;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(timestamp);
                    }
                    return this;
                }

                private Builder() {
                    this.timestamp_ = "";
                    this.name_ = "";
                    this.dimensions_ = Collections.emptyList();
                    this.measures_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData build() {
                    MetricData buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData buildPartial() {
                    MetricData metricData = new MetricData(this);
                    metricData.timestamp_ = this.timestamp_;
                    metricData.name_ = this.name_;
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        metricData.dimensions_ = repeatedFieldBuilderV3.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                            this.bitField0_ &= -2;
                        }
                        metricData.dimensions_ = this.dimensions_;
                    }
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV32 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV32 != null) {
                        metricData.measures_ = repeatedFieldBuilderV32.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                            this.bitField0_ &= -3;
                        }
                        metricData.measures_ = this.measures_;
                    }
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        metricData.error_ = this.error_;
                    } else {
                        metricData.error_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV32 = this.tsBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        metricData.ts_ = this.ts_;
                    } else {
                        metricData.ts_ = singleFieldBuilderV32.build();
                    }
                    onBuilt();
                    return metricData;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public MetricData getDefaultInstanceForType() {
                    return MetricData.getDefaultInstance();
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

                public Dimension.Builder addDimensionsBuilder(int i) {
                    return getDimensionsFieldBuilder().addBuilder(i, Dimension.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder(int i) {
                    return getMeasuresFieldBuilder().addBuilder(i, Measure.getDefaultInstance());
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
                    this.timestamp_ = "";
                    this.name_ = "";
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.dimensions_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV32 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        this.measures_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV32.clear();
                    }
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                    } else {
                        this.ts_ = null;
                        this.tsBuilder_ = null;
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

                public Builder setTs(Timestamp.Builder builder) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.tsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ts_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder addDimensions(int i, Dimension dimension) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i, dimension);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, dimension);
                    }
                    return this;
                }

                public Builder addMeasures(int i, Measure measure) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(i, measure);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, measure);
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
                    if (message instanceof MetricData) {
                        return mergeFrom((MetricData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setDimensions(int i, Dimension.Builder builder) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder setMeasures(int i, Measure.Builder builder) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.timestamp_ = "";
                    this.name_ = "";
                    this.dimensions_ = Collections.emptyList();
                    this.measures_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(MetricData metricData) {
                    if (metricData == MetricData.getDefaultInstance()) {
                        return this;
                    }
                    if (!metricData.getTimestamp().isEmpty()) {
                        this.timestamp_ = metricData.timestamp_;
                        onChanged();
                    }
                    if (!metricData.getName().isEmpty()) {
                        this.name_ = metricData.name_;
                        onChanged();
                    }
                    if (this.dimensionsBuilder_ == null) {
                        if (!metricData.dimensions_.isEmpty()) {
                            if (this.dimensions_.isEmpty()) {
                                this.dimensions_ = metricData.dimensions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureDimensionsIsMutable();
                                this.dimensions_.addAll(metricData.dimensions_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.dimensions_.isEmpty()) {
                        if (!this.dimensionsBuilder_.isEmpty()) {
                            this.dimensionsBuilder_.addAllMessages(metricData.dimensions_);
                        } else {
                            this.dimensionsBuilder_.dispose();
                            this.dimensionsBuilder_ = null;
                            this.dimensions_ = metricData.dimensions_;
                            this.bitField0_ &= -2;
                            this.dimensionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDimensionsFieldBuilder() : null;
                        }
                    }
                    if (this.measuresBuilder_ == null) {
                        if (!metricData.measures_.isEmpty()) {
                            if (this.measures_.isEmpty()) {
                                this.measures_ = metricData.measures_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMeasuresIsMutable();
                                this.measures_.addAll(metricData.measures_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.measures_.isEmpty()) {
                        if (!this.measuresBuilder_.isEmpty()) {
                            this.measuresBuilder_.addAllMessages(metricData.measures_);
                        } else {
                            this.measuresBuilder_.dispose();
                            this.measuresBuilder_ = null;
                            this.measures_ = metricData.measures_;
                            this.bitField0_ &= -3;
                            this.measuresBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMeasuresFieldBuilder() : null;
                        }
                    }
                    if (metricData.hasError()) {
                        mergeError(metricData.getError());
                    }
                    if (metricData.hasTs()) {
                        mergeTs(metricData.getTs());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) metricData).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension.Builder builder) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addMeasures(Measure.Builder builder) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addDimensions(int i, Dimension.Builder builder) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addMeasures(int i, Measure.Builder builder) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i, builder.build());
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
                public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Builder");
                }
            }

            public static Builder newBuilder(MetricData metricData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricData);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private MetricData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MetricData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static MetricData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public MetricData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static MetricData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private MetricData() {
                this.memoizedIsInitialized = (byte) -1;
                this.timestamp_ = "";
                this.name_ = "";
                this.dimensions_ = Collections.emptyList();
                this.measures_ = Collections.emptyList();
            }

            public static MetricData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static MetricData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static MetricData parseFrom(InputStream inputStream) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private MetricData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.timestamp_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 18) {
                                        this.name_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        boolean z3 = (z2 ? 1 : 0) & true;
                                        z2 = z2;
                                        if (!z3) {
                                            this.dimensions_ = new ArrayList();
                                            z2 = (z2 ? 1 : 0) | true;
                                        }
                                        this.dimensions_.add(codedInputStream.readMessage(Dimension.parser(), extensionRegistryLite));
                                    } else if (readTag != 34) {
                                        if (readTag == 42) {
                                            Error error = this.error_;
                                            Error.Builder builder = error != null ? error.toBuilder() : null;
                                            Error error2 = (Error) codedInputStream.readMessage(Error.parser(), extensionRegistryLite);
                                            this.error_ = error2;
                                            if (builder != null) {
                                                builder.mergeFrom(error2);
                                                this.error_ = builder.buildPartial();
                                            }
                                        } else if (readTag != 50) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            Timestamp timestamp = this.ts_;
                                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                            Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                            this.ts_ = timestamp2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(timestamp2);
                                                this.ts_ = builder2.buildPartial();
                                            }
                                        }
                                    } else {
                                        boolean z4 = (z2 ? 1 : 0) & true;
                                        z2 = z2;
                                        if (!z4) {
                                            this.measures_ = new ArrayList();
                                            z2 = (z2 ? 1 : 0) | true;
                                        }
                                        this.measures_.add(codedInputStream.readMessage(Measure.parser(), extensionRegistryLite));
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
                        if ((z2 ? 1 : 0) & true) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static MetricData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static MetricData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes9.dex */
        public interface MetricDataOrBuilder extends MessageOrBuilder {
            MetricData.Dimension getDimensions(int i);

            int getDimensionsCount();

            List<MetricData.Dimension> getDimensionsList();

            MetricData.DimensionOrBuilder getDimensionsOrBuilder(int i);

            List<? extends MetricData.DimensionOrBuilder> getDimensionsOrBuilderList();

            MetricData.Error getError();

            MetricData.ErrorOrBuilder getErrorOrBuilder();

            MetricData.Measure getMeasures(int i);

            int getMeasuresCount();

            List<MetricData.Measure> getMeasuresList();

            MetricData.MeasureOrBuilder getMeasuresOrBuilder(int i);

            List<? extends MetricData.MeasureOrBuilder> getMeasuresOrBuilderList();

            String getName();

            ByteString getNameBytes();

            @Deprecated
            String getTimestamp();

            @Deprecated
            ByteString getTimestampBytes();

            Timestamp getTs();

            TimestampOrBuilder getTsOrBuilder();

            boolean hasError();

            boolean hasTs();
        }

        public static Metric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.f97456x6a8b01ed;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Metric> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return super.equals(obj);
            }
            Metric metric = (Metric) obj;
            if (getContext().equals(metric.getContext()) && getDataList().equals(metric.getDataList()) && this.unknownFields.equals(metric.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricData getData(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<MetricData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricDataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Metric> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            if (!getContextBytes().isEmpty()) {
                i = GeneratedMessageV3.computeStringSize(1, this.context_) + 0;
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < this.data_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(2, this.data_.get(i3));
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
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContext().hashCode();
            if (getDataCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDataList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKAnalyticProto.f97457x5ac3eb6b.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
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
            return new Metric();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getContextBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.context_);
            }
            for (int i = 0; i < this.data_.size(); i++) {
                codedOutputStream.writeMessage(2, this.data_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricOrBuilder {
            private int bitField0_;
            private Object context_;
            private RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> dataBuilder_;
            private List<MetricData> data_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    List<MetricData> list = this.data_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.dataBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.f97456x6a8b01ed;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends MetricData> iterable) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.data_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addData(MetricData metricData) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(metricData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(metricData);
                }
                return this;
            }

            public MetricData.Builder addDataBuilder() {
                return getDataFieldBuilder().addBuilder(MetricData.getDefaultInstance());
            }

            public Builder clearContext() {
                this.context_ = Metric.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder clearData() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.context_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.context_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricData getData(int i) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public MetricData.Builder getDataBuilder(int i) {
                return getDataFieldBuilder().getBuilder(i);
            }

            public List<MetricData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public int getDataCount() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<MetricData> getDataList() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.data_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricDataOrBuilder getDataOrBuilder(int i) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticProto.f97456x6a8b01ed;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKAnalyticProto.f97457x5ac3eb6b.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeData(int i) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
                onChanged();
                return this;
            }

            public Builder setData(int i, MetricData metricData) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i, metricData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, metricData);
                }
                return this;
            }

            private Builder() {
                this.context_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric build() {
                Metric buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric buildPartial() {
                Metric metric = new Metric(this);
                metric.context_ = this.context_;
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    metric.data_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    metric.data_ = this.data_;
                }
                onBuilt();
                return metric;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Metric getDefaultInstanceForType() {
                return Metric.getDefaultInstance();
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

            public MetricData.Builder addDataBuilder(int i) {
                return getDataFieldBuilder().addBuilder(i, MetricData.getDefaultInstance());
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
                this.context_ = "";
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.context_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i, MetricData metricData) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i, metricData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, metricData);
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
                if (message instanceof Metric) {
                    return mergeFrom((Metric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i, MetricData.Builder builder) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Metric metric) {
                if (metric == Metric.getDefaultInstance()) {
                    return this;
                }
                if (!metric.getContext().isEmpty()) {
                    this.context_ = metric.context_;
                    onChanged();
                }
                if (this.dataBuilder_ == null) {
                    if (!metric.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = metric.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(metric.data_);
                        }
                        onChanged();
                    }
                } else if (!metric.data_.isEmpty()) {
                    if (!this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.addAllMessages(metric.data_);
                    } else {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = metric.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) metric).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(MetricData.Builder builder) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addData(int i, MetricData.Builder builder) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(i, builder.build());
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
            public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.access$5700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$Builder");
            }
        }

        public static Builder newBuilder(Metric metric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Metric(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Metric getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Metric() {
            this.memoizedIsInitialized = (byte) -1;
            this.context_ = "";
            this.data_ = Collections.emptyList();
        }

        public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Metric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Metric parseFrom(InputStream inputStream) throws IOException {
            return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Metric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.context_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 18) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.data_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.data_.add(codedInputStream.readMessage(MetricData.parser(), extensionRegistryLite));
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
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface MetricOrBuilder extends MessageOrBuilder {
        String getContext();

        ByteString getContextBytes();

        Metric.MetricData getData(int i);

        int getDataCount();

        List<Metric.MetricData> getDataList();

        Metric.MetricDataOrBuilder getDataOrBuilder(int i);

        List<? extends Metric.MetricDataOrBuilder> getDataOrBuilderList();
    }

    public static SDKAnalyticPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticProto.f97458x55a22da0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<SDKAnalyticPayload> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKAnalyticPayload)) {
            return super.equals(obj);
        }
        SDKAnalyticPayload sDKAnalyticPayload = (SDKAnalyticPayload) obj;
        if (getMetricsList().equals(sDKAnalyticPayload.getMetricsList()) && this.unknownFields.equals(sDKAnalyticPayload.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public Metric getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public MetricOrBuilder getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<SDKAnalyticPayload> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.metrics_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.metrics_.get(i3));
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
        if (getMetricsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getMetricsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKAnalyticProto.f97459x6959b41e.ensureFieldAccessorsInitialized(SDKAnalyticPayload.class, Builder.class);
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
        return new SDKAnalyticPayload();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.metrics_.size(); i++) {
            codedOutputStream.writeMessage(1, this.metrics_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDKAnalyticPayloadOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> metricsBuilder_;
        private List<Metric> metrics_;

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.f97458x55a22da0;
        }

        private RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                List<Metric> list = this.metrics_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.metricsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getMetricsFieldBuilder();
            }
        }

        public Builder addAllMetrics(Iterable<? extends Metric> iterable) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.metrics_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addMetrics(Metric metric) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(metric);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(metric);
            }
            return this;
        }

        public Metric.Builder addMetricsBuilder() {
            return getMetricsFieldBuilder().addBuilder(Metric.getDefaultInstance());
        }

        public Builder clearMetrics() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticProto.f97458x55a22da0;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public Metric getMetrics(int i) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Metric.Builder getMetricsBuilder(int i) {
            return getMetricsFieldBuilder().getBuilder(i);
        }

        public List<Metric.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public int getMetricsCount() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<Metric> getMetricsList() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.metrics_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public MetricOrBuilder getMetricsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.metrics_);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKAnalyticProto.f97459x6959b41e.ensureFieldAccessorsInitialized(SDKAnalyticPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMetrics(int i) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Builder setMetrics(int i, Metric metric) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.set(i, metric);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, metric);
            }
            return this;
        }

        private Builder() {
            this.metrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload build() {
            SDKAnalyticPayload buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload buildPartial() {
            SDKAnalyticPayload sDKAnalyticPayload = new SDKAnalyticPayload(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -2;
                }
                sDKAnalyticPayload.metrics_ = this.metrics_;
            } else {
                sDKAnalyticPayload.metrics_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return sDKAnalyticPayload;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public SDKAnalyticPayload getDefaultInstanceForType() {
            return SDKAnalyticPayload.getDefaultInstance();
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

        public Metric.Builder addMetricsBuilder(int i) {
            return getMetricsFieldBuilder().addBuilder(i, Metric.getDefaultInstance());
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
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.metrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addMetrics(int i, Metric metric) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(i, metric);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, metric);
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
            if (message instanceof SDKAnalyticPayload) {
                return mergeFrom((SDKAnalyticPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMetrics(int i, Metric.Builder builder) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(SDKAnalyticPayload sDKAnalyticPayload) {
            if (sDKAnalyticPayload == SDKAnalyticPayload.getDefaultInstance()) {
                return this;
            }
            if (this.metricsBuilder_ == null) {
                if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = sDKAnalyticPayload.metrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(sDKAnalyticPayload.metrics_);
                    }
                    onChanged();
                }
            } else if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                if (!this.metricsBuilder_.isEmpty()) {
                    this.metricsBuilder_.addAllMessages(sDKAnalyticPayload.metrics_);
                } else {
                    this.metricsBuilder_.dispose();
                    this.metricsBuilder_ = null;
                    this.metrics_ = sDKAnalyticPayload.metrics_;
                    this.bitField0_ &= -2;
                    this.metricsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMetricsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) sDKAnalyticPayload).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric.Builder builder) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMetrics(int i, Metric.Builder builder) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i, builder.build());
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
        public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.access$6700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Builder");
        }
    }

    public static Builder newBuilder(SDKAnalyticPayload sDKAnalyticPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKAnalyticPayload);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private SDKAnalyticPayload(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public SDKAnalyticPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKAnalyticPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.metrics_ = Collections.emptyList();
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SDKAnalyticPayload(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.metrics_ = new ArrayList();
                                z2 |= true;
                            }
                            this.metrics_.add(codedInputStream.readMessage(Metric.parser(), extensionRegistryLite));
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
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SDKAnalyticPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
