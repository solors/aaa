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
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class SdkAnalyticConfig extends GeneratedMessageV3 implements SdkAnalyticConfigOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 4;
    public static final int INTERVAL_FIELD_NUMBER = 3;
    public static final int METRIC_CONFIGS_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object context_;
    private int count_;
    private int interval_;
    private byte memoizedIsInitialized;
    private List<MetricConfig> metricConfigs_;
    private volatile Object url_;
    private static final SdkAnalyticConfig DEFAULT_INSTANCE = new SdkAnalyticConfig();
    private static final Parser<SdkAnalyticConfig> PARSER = new AbstractParser<SdkAnalyticConfig>() { // from class: io.bidmachine.protobuf.SdkAnalyticConfig.1
        @Override // com.explorestack.protobuf.Parser
        public SdkAnalyticConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SdkAnalyticConfig(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes9.dex */
    public static final class MetricConfig extends GeneratedMessageV3 implements MetricConfigOrBuilder {
        public static final int DIMENSIONS_FIELD_NUMBER = 2;
        public static final int METRICS_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private LazyStringList dimensions_;
        private byte memoizedIsInitialized;
        private LazyStringList metrics_;
        private volatile Object name_;
        private static final MetricConfig DEFAULT_INSTANCE = new MetricConfig();
        private static final Parser<MetricConfig> PARSER = new AbstractParser<MetricConfig>() { // from class: io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.1
            @Override // com.explorestack.protobuf.Parser
            public MetricConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MetricConfig(codedInputStream, extensionRegistryLite);
            }
        };

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricConfigOrBuilder {
            private int bitField0_;
            private LazyStringList dimensions_;
            private LazyStringList metrics_;
            private Object name_;

            private void ensureDimensionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.dimensions_ = new LazyStringArrayList(this.dimensions_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureMetricsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.metrics_ = new LazyStringArrayList(this.metrics_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.f97420x47f70d78;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder addAllDimensions(Iterable<String> iterable) {
                ensureDimensionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.dimensions_);
                onChanged();
                return this;
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                ensureMetricsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.metrics_);
                onChanged();
                return this;
            }

            public Builder addDimensions(String str) {
                str.getClass();
                ensureDimensionsIsMutable();
                this.dimensions_.add((LazyStringList) str);
                onChanged();
                return this;
            }

            public Builder addDimensionsBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureDimensionsIsMutable();
                this.dimensions_.add(byteString);
                onChanged();
                return this;
            }

            public Builder addMetrics(String str) {
                str.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add((LazyStringList) str);
                onChanged();
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureMetricsIsMutable();
                this.metrics_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearDimensions() {
                this.dimensions_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMetrics() {
                this.metrics_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = MetricConfig.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.f97420x47f70d78;
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public String getDimensions(int i) {
                return this.dimensions_.get(i);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ByteString getDimensionsBytes(int i) {
                return this.dimensions_.getByteString(i);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public String getMetrics(int i) {
                return this.metrics_.get(i);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ByteString getMetricsBytes(int i) {
                return this.metrics_.getByteString(i);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public int getMetricsCount() {
                return this.metrics_.size();
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
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
                return InitProto.f97421x7e1d3bf6.ensureFieldAccessorsInitialized(MetricConfig.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDimensions(int i, String str) {
                str.getClass();
                ensureDimensionsIsMutable();
                this.dimensions_.set(i, (int) str);
                onChanged();
                return this;
            }

            public Builder setMetrics(int i, String str) {
                str.getClass();
                ensureMetricsIsMutable();
                this.metrics_.set(i, (int) str);
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

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ProtocolStringList getDimensionsList() {
                return this.dimensions_.getUnmodifiableView();
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ProtocolStringList getMetricsList() {
                return this.metrics_.getUnmodifiableView();
            }

            private Builder() {
                this.name_ = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.dimensions_ = lazyStringList;
                this.metrics_ = lazyStringList;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public MetricConfig build() {
                MetricConfig buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public MetricConfig buildPartial() {
                MetricConfig metricConfig = new MetricConfig(this);
                metricConfig.name_ = this.name_;
                if ((this.bitField0_ & 1) != 0) {
                    this.dimensions_ = this.dimensions_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                metricConfig.dimensions_ = this.dimensions_;
                if ((this.bitField0_ & 2) != 0) {
                    this.metrics_ = this.metrics_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                metricConfig.metrics_ = this.metrics_;
                onBuilt();
                return metricConfig;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public MetricConfig getDefaultInstanceForType() {
                return MetricConfig.getDefaultInstance();
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
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.dimensions_ = lazyStringList;
                this.metrics_ = lazyStringList;
                this.bitField0_ = this.bitField0_ & (-2) & (-3);
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MetricConfig) {
                    return mergeFrom((MetricConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.dimensions_ = lazyStringList;
                this.metrics_ = lazyStringList;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MetricConfig metricConfig) {
                if (metricConfig == MetricConfig.getDefaultInstance()) {
                    return this;
                }
                if (!metricConfig.getName().isEmpty()) {
                    this.name_ = metricConfig.name_;
                    onChanged();
                }
                if (!metricConfig.dimensions_.isEmpty()) {
                    if (this.dimensions_.isEmpty()) {
                        this.dimensions_ = metricConfig.dimensions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDimensionsIsMutable();
                        this.dimensions_.addAll(metricConfig.dimensions_);
                    }
                    onChanged();
                }
                if (!metricConfig.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = metricConfig.metrics_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(metricConfig.metrics_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) metricConfig).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig r3 = (io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig r4 = (io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig$Builder");
            }
        }

        public static MetricConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.f97420x47f70d78;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MetricConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MetricConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MetricConfig> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricConfig)) {
                return super.equals(obj);
            }
            MetricConfig metricConfig = (MetricConfig) obj;
            if (getName().equals(metricConfig.getName()) && getDimensionsList().equals(metricConfig.getDimensionsList()) && getMetricsList().equals(metricConfig.getMetricsList()) && this.unknownFields.equals(metricConfig.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public String getDimensions(int i) {
            return this.dimensions_.get(i);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ByteString getDimensionsBytes(int i) {
            return this.dimensions_.getByteString(i);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public int getDimensionsCount() {
            return this.dimensions_.size();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public String getMetrics(int i) {
            return this.metrics_.get(i);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ByteString getMetricsBytes(int i) {
            return this.metrics_.getByteString(i);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
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
        public Parser<MetricConfig> getParserForType() {
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
            int i3 = 0;
            for (int i4 = 0; i4 < this.dimensions_.size(); i4++) {
                i3 += GeneratedMessageV3.computeStringSizeNoTag(this.dimensions_.getRaw(i4));
            }
            int size = i + i3 + (getDimensionsList().size() * 1);
            int i5 = 0;
            for (int i6 = 0; i6 < this.metrics_.size(); i6++) {
                i5 += GeneratedMessageV3.computeStringSizeNoTag(this.metrics_.getRaw(i6));
            }
            int size2 = size + i5 + (getMetricsList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
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
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
            if (getDimensionsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDimensionsList().hashCode();
            }
            if (getMetricsCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getMetricsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.f97421x7e1d3bf6.ensureFieldAccessorsInitialized(MetricConfig.class, Builder.class);
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
            return new MetricConfig();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.dimensions_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.dimensions_.getRaw(i));
            }
            for (int i2 = 0; i2 < this.metrics_.size(); i2++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.metrics_.getRaw(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(MetricConfig metricConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricConfig);
        }

        public static MetricConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ProtocolStringList getDimensionsList() {
            return this.dimensions_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ProtocolStringList getMetricsList() {
            return this.metrics_;
        }

        private MetricConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MetricConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public MetricConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MetricConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MetricConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.dimensions_ = lazyStringList;
            this.metrics_ = lazyStringList;
        }

        public static MetricConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static MetricConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MetricConfig parseFrom(InputStream inputStream) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MetricConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private MetricConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.name_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.dimensions_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.dimensions_.add((LazyStringList) readStringRequireUtf8);
                            } else if (readTag != 26) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.metrics_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.metrics_.add((LazyStringList) readStringRequireUtf82);
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
                        this.dimensions_ = this.dimensions_.getUnmodifiableView();
                    }
                    if (z2 & true) {
                        this.metrics_ = this.metrics_.getUnmodifiableView();
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static MetricConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MetricConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface MetricConfigOrBuilder extends MessageOrBuilder {
        String getDimensions(int i);

        ByteString getDimensionsBytes(int i);

        int getDimensionsCount();

        List<String> getDimensionsList();

        String getMetrics(int i);

        ByteString getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getName();

        ByteString getNameBytes();
    }

    public static SdkAnalyticConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SdkAnalyticConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<SdkAnalyticConfig> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkAnalyticConfig)) {
            return super.equals(obj);
        }
        SdkAnalyticConfig sdkAnalyticConfig = (SdkAnalyticConfig) obj;
        if (getUrl().equals(sdkAnalyticConfig.getUrl()) && getContext().equals(sdkAnalyticConfig.getContext()) && getInterval() == sdkAnalyticConfig.getInterval() && getCount() == sdkAnalyticConfig.getCount() && getMetricConfigsList().equals(sdkAnalyticConfig.getMetricConfigsList()) && this.unknownFields.equals(sdkAnalyticConfig.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public int getCount() {
        return this.count_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public int getInterval() {
        return this.interval_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public MetricConfig getMetricConfigs(int i) {
        return this.metricConfigs_.get(i);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public int getMetricConfigsCount() {
        return this.metricConfigs_.size();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public List<MetricConfig> getMetricConfigsList() {
        return this.metricConfigs_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public MetricConfigOrBuilder getMetricConfigsOrBuilder(int i) {
        return this.metricConfigs_.get(i);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public List<? extends MetricConfigOrBuilder> getMetricConfigsOrBuilderList() {
        return this.metricConfigs_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<SdkAnalyticConfig> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        if (!getUrlBytes().isEmpty()) {
            i = GeneratedMessageV3.computeStringSize(1, this.url_) + 0;
        } else {
            i = 0;
        }
        if (!getContextBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(2, this.context_);
        }
        int i3 = this.interval_;
        if (i3 != 0) {
            i += CodedOutputStream.computeInt32Size(3, i3);
        }
        int i4 = this.count_;
        if (i4 != 0) {
            i += CodedOutputStream.computeInt32Size(4, i4);
        }
        for (int i5 = 0; i5 < this.metricConfigs_.size(); i5++) {
            i += CodedOutputStream.computeMessageSize(5, this.metricConfigs_.get(i5));
        }
        int serializedSize = i + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public String getUrl() {
        Object obj = this.url_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.url_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public ByteString getUrlBytes() {
        Object obj = this.url_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = copyFromUtf8;
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
        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getContext().hashCode()) * 37) + 3) * 53) + getInterval()) * 37) + 4) * 53) + getCount();
        if (getMetricConfigsCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getMetricConfigsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.f97422x2841491.ensureFieldAccessorsInitialized(SdkAnalyticConfig.class, Builder.class);
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
        return new SdkAnalyticConfig();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
        }
        if (!getContextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.context_);
        }
        int i = this.interval_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        int i2 = this.count_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        for (int i3 = 0; i3 < this.metricConfigs_.size(); i3++) {
            codedOutputStream.writeMessage(5, this.metricConfigs_.get(i3));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SdkAnalyticConfigOrBuilder {
        private int bitField0_;
        private Object context_;
        private int count_;
        private int interval_;
        private RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> metricConfigsBuilder_;
        private List<MetricConfig> metricConfigs_;
        private Object url_;

        private void ensureMetricConfigsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metricConfigs_ = new ArrayList(this.metricConfigs_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
        }

        private RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> getMetricConfigsFieldBuilder() {
            if (this.metricConfigsBuilder_ == null) {
                List<MetricConfig> list = this.metricConfigs_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.metricConfigsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.metricConfigs_ = null;
            }
            return this.metricConfigsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getMetricConfigsFieldBuilder();
            }
        }

        public Builder addAllMetricConfigs(Iterable<? extends MetricConfig> iterable) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.metricConfigs_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addMetricConfigs(MetricConfig metricConfig) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricConfig.getClass();
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(metricConfig);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(metricConfig);
            }
            return this;
        }

        public MetricConfig.Builder addMetricConfigsBuilder() {
            return getMetricConfigsFieldBuilder().addBuilder(MetricConfig.getDefaultInstance());
        }

        public Builder clearContext() {
            this.context_ = SdkAnalyticConfig.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder clearCount() {
            this.count_ = 0;
            onChanged();
            return this;
        }

        public Builder clearInterval() {
            this.interval_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMetricConfigs() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metricConfigs_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearUrl() {
            this.url_ = SdkAnalyticConfig.getDefaultInstance().getUrl();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public int getInterval() {
            return this.interval_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public MetricConfig getMetricConfigs(int i) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricConfigs_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public MetricConfig.Builder getMetricConfigsBuilder(int i) {
            return getMetricConfigsFieldBuilder().getBuilder(i);
        }

        public List<MetricConfig.Builder> getMetricConfigsBuilderList() {
            return getMetricConfigsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public int getMetricConfigsCount() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricConfigs_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public List<MetricConfig> getMetricConfigsList() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.metricConfigs_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public MetricConfigOrBuilder getMetricConfigsOrBuilder(int i) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricConfigs_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public List<? extends MetricConfigOrBuilder> getMetricConfigsOrBuilderList() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.metricConfigs_);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.f97422x2841491.ensureFieldAccessorsInitialized(SdkAnalyticConfig.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMetricConfigs(int i) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.remove(i);
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

        public Builder setCount(int i) {
            this.count_ = i;
            onChanged();
            return this;
        }

        public Builder setInterval(int i) {
            this.interval_ = i;
            onChanged();
            return this;
        }

        public Builder setMetricConfigs(int i, MetricConfig metricConfig) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricConfig.getClass();
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.set(i, metricConfig);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, metricConfig);
            }
            return this;
        }

        public Builder setUrl(String str) {
            str.getClass();
            this.url_ = str;
            onChanged();
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.url_ = "";
            this.context_ = "";
            this.metricConfigs_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticConfig build() {
            SdkAnalyticConfig buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticConfig buildPartial() {
            SdkAnalyticConfig sdkAnalyticConfig = new SdkAnalyticConfig(this);
            sdkAnalyticConfig.url_ = this.url_;
            sdkAnalyticConfig.context_ = this.context_;
            sdkAnalyticConfig.interval_ = this.interval_;
            sdkAnalyticConfig.count_ = this.count_;
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                sdkAnalyticConfig.metricConfigs_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.metricConfigs_ = Collections.unmodifiableList(this.metricConfigs_);
                    this.bitField0_ &= -2;
                }
                sdkAnalyticConfig.metricConfigs_ = this.metricConfigs_;
            }
            onBuilt();
            return sdkAnalyticConfig;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public SdkAnalyticConfig getDefaultInstanceForType() {
            return SdkAnalyticConfig.getDefaultInstance();
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

        public MetricConfig.Builder addMetricConfigsBuilder(int i) {
            return getMetricConfigsFieldBuilder().addBuilder(i, MetricConfig.getDefaultInstance());
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
            this.url_ = "";
            this.context_ = "";
            this.interval_ = 0;
            this.count_ = 0;
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metricConfigs_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder addMetricConfigs(int i, MetricConfig metricConfig) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricConfig.getClass();
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(i, metricConfig);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, metricConfig);
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
            if (message instanceof SdkAnalyticConfig) {
                return mergeFrom((SdkAnalyticConfig) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMetricConfigs(int i, MetricConfig.Builder builder) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.url_ = "";
            this.context_ = "";
            this.metricConfigs_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(SdkAnalyticConfig sdkAnalyticConfig) {
            if (sdkAnalyticConfig == SdkAnalyticConfig.getDefaultInstance()) {
                return this;
            }
            if (!sdkAnalyticConfig.getUrl().isEmpty()) {
                this.url_ = sdkAnalyticConfig.url_;
                onChanged();
            }
            if (!sdkAnalyticConfig.getContext().isEmpty()) {
                this.context_ = sdkAnalyticConfig.context_;
                onChanged();
            }
            if (sdkAnalyticConfig.getInterval() != 0) {
                setInterval(sdkAnalyticConfig.getInterval());
            }
            if (sdkAnalyticConfig.getCount() != 0) {
                setCount(sdkAnalyticConfig.getCount());
            }
            if (this.metricConfigsBuilder_ == null) {
                if (!sdkAnalyticConfig.metricConfigs_.isEmpty()) {
                    if (this.metricConfigs_.isEmpty()) {
                        this.metricConfigs_ = sdkAnalyticConfig.metricConfigs_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricConfigsIsMutable();
                        this.metricConfigs_.addAll(sdkAnalyticConfig.metricConfigs_);
                    }
                    onChanged();
                }
            } else if (!sdkAnalyticConfig.metricConfigs_.isEmpty()) {
                if (!this.metricConfigsBuilder_.isEmpty()) {
                    this.metricConfigsBuilder_.addAllMessages(sdkAnalyticConfig.metricConfigs_);
                } else {
                    this.metricConfigsBuilder_.dispose();
                    this.metricConfigsBuilder_ = null;
                    this.metricConfigs_ = sdkAnalyticConfig.metricConfigs_;
                    this.bitField0_ &= -2;
                    this.metricConfigsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMetricConfigsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) sdkAnalyticConfig).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMetricConfigs(MetricConfig.Builder builder) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMetricConfigs(int i, MetricConfig.Builder builder) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(i, builder.build());
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
        public io.bidmachine.protobuf.SdkAnalyticConfig.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.SdkAnalyticConfig.access$2400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.SdkAnalyticConfig r3 = (io.bidmachine.protobuf.SdkAnalyticConfig) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.SdkAnalyticConfig r4 = (io.bidmachine.protobuf.SdkAnalyticConfig) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticConfig.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.SdkAnalyticConfig$Builder");
        }
    }

    public static Builder newBuilder(SdkAnalyticConfig sdkAnalyticConfig) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdkAnalyticConfig);
    }

    public static SdkAnalyticConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private SdkAnalyticConfig(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SdkAnalyticConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public SdkAnalyticConfig getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SdkAnalyticConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SdkAnalyticConfig() {
        this.memoizedIsInitialized = (byte) -1;
        this.url_ = "";
        this.context_ = "";
        this.metricConfigs_ = Collections.emptyList();
    }

    public static SdkAnalyticConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static SdkAnalyticConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SdkAnalyticConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.url_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.context_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.interval_ = codedInputStream.readInt32();
                        } else if (readTag == 32) {
                            this.count_ = codedInputStream.readInt32();
                        } else if (readTag != 42) {
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.metricConfigs_ = new ArrayList();
                                z2 |= true;
                            }
                            this.metricConfigs_.add(codedInputStream.readMessage(MetricConfig.parser(), extensionRegistryLite));
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
                    this.metricConfigs_ = Collections.unmodifiableList(this.metricConfigs_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static SdkAnalyticConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SdkAnalyticConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
