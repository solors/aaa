package io.bidmachine.protobuf.sdk;

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
import com.explorestack.protobuf.UnknownFieldSet;
import io.bidmachine.protobuf.sdk.ContextualData;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class Session extends GeneratedMessageV3 implements SessionOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final Session DEFAULT_INSTANCE = new Session();
    private static final Parser<Session> PARSER = new AbstractParser<Session>() { // from class: io.bidmachine.protobuf.sdk.Session.1
        @Override // com.explorestack.protobuf.Parser
        public Session parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Session(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Context context_;
    private byte memoizedIsInitialized;
    private volatile Object sessionId_;

    /* loaded from: classes9.dex */
    public static final class Context extends GeneratedMessageV3 implements ContextOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final Parser<Context> PARSER = new AbstractParser<Context>() { // from class: io.bidmachine.protobuf.sdk.Session.Context.1
            @Override // com.explorestack.protobuf.Parser
            public Context parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Context(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int RETENTION_FIELD_NUMBER = 3;
        public static final int SC_FIELD_NUMBER = 2;
        public static final int SESSIONDURATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContextualData> data_;
        private byte memoizedIsInitialized;
        private int retention_;
        private int sc_;
        private long sessionduration_;

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.f97541x5184844b;
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
            if (getSessionduration() == context.getSessionduration() && getSc() == context.getSc() && getRetention() == context.getRetention() && getDataList().equals(context.getDataList()) && this.unknownFields.equals(context.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualData getData(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<ContextualData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualDataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Context> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getRetention() {
            return this.retention_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getSc() {
            return this.sc_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            long j = this.sessionduration_;
            if (j != 0) {
                i = CodedOutputStream.computeUInt64Size(1, j) + 0;
            } else {
                i = 0;
            }
            int i3 = this.sc_;
            if (i3 != 0) {
                i += CodedOutputStream.computeUInt32Size(2, i3);
            }
            int i4 = this.retention_;
            if (i4 != 0) {
                i += CodedOutputStream.computeUInt32Size(3, i4);
            }
            for (int i5 = 0; i5 < this.data_.size(); i5++) {
                i += CodedOutputStream.computeMessageSize(4, this.data_.get(i5));
            }
            int serializedSize = i + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
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
            int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getSessionduration())) * 37) + 2) * 53) + getSc()) * 37) + 3) * 53) + getRetention();
            if (getDataCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getDataList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.f97542x6a3c2fc9.ensureFieldAccessorsInitialized(Context.class, Builder.class);
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
            return new Context();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.sessionduration_;
            if (j != 0) {
                codedOutputStream.writeUInt64(1, j);
            }
            int i = this.sc_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            int i2 = this.retention_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(3, i2);
            }
            for (int i3 = 0; i3 < this.data_.size(); i3++) {
                codedOutputStream.writeMessage(4, this.data_.get(i3));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContextOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> dataBuilder_;
            private List<ContextualData> data_;
            private int retention_;
            private int sc_;
            private long sessionduration_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    List<ContextualData> list = this.data_;
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
                return SDKContextProto.f97541x5184844b;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends ContextualData> iterable) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.data_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addData(ContextualData contextualData) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(contextualData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(contextualData);
                }
                return this;
            }

            public ContextualData.Builder addDataBuilder() {
                return getDataFieldBuilder().addBuilder(ContextualData.getDefaultInstance());
            }

            public Builder clearData() {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearRetention() {
                this.retention_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSc() {
                this.sc_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualData getData(int i) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public ContextualData.Builder getDataBuilder(int i) {
                return getDataFieldBuilder().getBuilder(i);
            }

            public List<ContextualData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getDataCount() {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<ContextualData> getDataList() {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.data_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualDataOrBuilder getDataOrBuilder(int i) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.f97541x5184844b;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getRetention() {
                return this.retention_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getSc() {
                return this.sc_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKContextProto.f97542x6a3c2fc9.ensureFieldAccessorsInitialized(Context.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeData(int i) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setData(int i, ContextualData contextualData) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i, contextualData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, contextualData);
                }
                return this;
            }

            public Builder setRetention(int i) {
                this.retention_ = i;
                onChanged();
                return this;
            }

            public Builder setSc(int i) {
                this.sc_ = i;
                onChanged();
                return this;
            }

            public Builder setSessionduration(long j) {
                this.sessionduration_ = j;
                onChanged();
                return this;
            }

            private Builder() {
                this.data_ = Collections.emptyList();
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
                context.sessionduration_ = this.sessionduration_;
                context.sc_ = this.sc_;
                context.retention_ = this.retention_;
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    context.data_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    context.data_ = this.data_;
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

            public ContextualData.Builder addDataBuilder(int i) {
                return getDataFieldBuilder().addBuilder(i, ContextualData.getDefaultInstance());
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
                this.sessionduration_ = 0L;
                this.sc_ = 0;
                this.retention_ = 0;
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
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
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i, ContextualData contextualData) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i, contextualData);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, contextualData);
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

            public Builder setData(int i, ContextualData.Builder builder) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.set(i, builder.build());
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
                if (context.getSessionduration() != 0) {
                    setSessionduration(context.getSessionduration());
                }
                if (context.getSc() != 0) {
                    setSc(context.getSc());
                }
                if (context.getRetention() != 0) {
                    setRetention(context.getRetention());
                }
                if (this.dataBuilder_ == null) {
                    if (!context.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = context.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(context.data_);
                        }
                        onChanged();
                    }
                } else if (!context.data_.isEmpty()) {
                    if (!this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.addAllMessages(context.data_);
                    } else {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = context.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) context).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(ContextualData.Builder builder) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addData(int i, ContextualData.Builder builder) {
                RepeatedFieldBuilderV3<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
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
            public io.bidmachine.protobuf.sdk.Session.Context.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.sdk.Session.Context.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Session$Context r3 = (io.bidmachine.protobuf.sdk.Session.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Session$Context r4 = (io.bidmachine.protobuf.sdk.Session.Context) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Session.Context.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.sdk.Session$Context$Builder");
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
            this.data_ = Collections.emptyList();
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
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
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.sessionduration_ = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.sc_ = codedInputStream.readUInt32();
                            } else if (readTag == 24) {
                                this.retention_ = codedInputStream.readUInt32();
                            } else if (readTag != 34) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.data_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.data_.add(codedInputStream.readMessage(ContextualData.parser(), extensionRegistryLite));
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
        ContextualData getData(int i);

        int getDataCount();

        List<ContextualData> getDataList();

        ContextualDataOrBuilder getDataOrBuilder(int i);

        List<? extends ContextualDataOrBuilder> getDataOrBuilderList();

        int getRetention();

        int getSc();

        long getSessionduration();
    }

    public static Session getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.f97543x2a9da79b;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Session parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Session parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Session> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session session = (Session) obj;
        if (!getSessionId().equals(session.getSessionId()) || hasContext() != session.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(session.getContext())) && this.unknownFields.equals(session.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public Context getContext() {
        Context context = this.context_;
        if (context == null) {
            return Context.getDefaultInstance();
        }
        return context;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<Session> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getSessionIdBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.sessionId_);
        }
        if (this.context_ != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getContext());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public boolean hasContext() {
        if (this.context_ != null) {
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
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode();
        if (hasContext()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getContext().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKContextProto.f97544xcae50319.ensureFieldAccessorsInitialized(Session.class, Builder.class);
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
        return new Session();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getSessionIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.sessionId_);
        }
        if (this.context_ != null) {
            codedOutputStream.writeMessage(2, getContext());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionOrBuilder {
        private SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> contextBuilder_;
        private Context context_;
        private Object sessionId_;

        private SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.f97543x2a9da79b;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = Session.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public Context getContext() {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context context = this.context_;
                if (context == null) {
                    return Context.getDefaultInstance();
                }
                return context;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return getContextFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public ContextOrBuilder getContextOrBuilder() {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context context = this.context_;
            if (context == null) {
                return Context.getDefaultInstance();
            }
            return context;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.f97543x2a9da79b;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public boolean hasContext() {
            if (this.contextBuilder_ == null && this.context_ == null) {
                return false;
            }
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKContextProto.f97544xcae50319.ensureFieldAccessorsInitialized(Session.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Context context) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context context2 = this.context_;
                if (context2 != null) {
                    this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
                } else {
                    this.context_ = context;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(context);
            }
            return this;
        }

        public Builder setContext(Context context) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                context.getClass();
                this.context_ = context;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(context);
            }
            return this;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session build() {
            Session buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session buildPartial() {
            Session session = new Session(this);
            session.sessionId_ = this.sessionId_;
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                session.context_ = this.context_;
            } else {
                session.context_ = singleFieldBuilderV3.build();
            }
            onBuilt();
            return session;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Session getDefaultInstanceForType() {
            return Session.getDefaultInstance();
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
            this.sessionId_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setContext(Context.Builder builder) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.context_ = builder.build();
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
            if (message instanceof Session) {
                return mergeFrom((Session) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Session session) {
            if (session == Session.getDefaultInstance()) {
                return this;
            }
            if (!session.getSessionId().isEmpty()) {
                this.sessionId_ = session.sessionId_;
                onChanged();
            }
            if (session.hasContext()) {
                mergeContext(session.getContext());
            }
            mergeUnknownFields(((GeneratedMessageV3) session).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Session.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.sdk.Session.access$1900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Session r3 = (io.bidmachine.protobuf.sdk.Session) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Session r4 = (io.bidmachine.protobuf.sdk.Session) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Session.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.sdk.Session$Builder");
        }
    }

    public static Builder newBuilder(Session session) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
    }

    public static Session parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private Session(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Session parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Session parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public Session getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Session parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Session() {
        this.memoizedIsInitialized = (byte) -1;
        this.sessionId_ = "";
    }

    public static Session parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Session parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Session parseFrom(InputStream inputStream) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private Session(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.sessionId_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag != 18) {
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            Context context = this.context_;
                            Context.Builder builder = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) codedInputStream.readMessage(Context.parser(), extensionRegistryLite);
                            this.context_ = context2;
                            if (builder != null) {
                                builder.mergeFrom(context2);
                                this.context_ = builder.buildPartial();
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

    public static Session parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Session parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Session parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
