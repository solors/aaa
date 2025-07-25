package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.explorestack.protobuf.adcom.Ad */
/* loaded from: classes3.dex */
public final class C10729Ad extends GeneratedMessageV3 implements AdOrBuilder {
    public static final int ADOMAIN_FIELD_NUMBER = 2;
    public static final int AUDIT_FIELD_NUMBER = 16;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    public static final int CATTAX_FIELD_NUMBER = 6;
    public static final int CAT_FIELD_NUMBER = 5;
    public static final int DISPLAY_FIELD_NUMBER = 13;
    public static final int EXT_FIELD_NUMBER = 18;
    public static final int EXT_PROTO_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INIT_FIELD_NUMBER = 11;
    public static final int IURL_FIELD_NUMBER = 4;
    public static final int LANG_FIELD_NUMBER = 7;
    public static final int LASTMOD_FIELD_NUMBER = 12;
    public static final int MRATING_FIELD_NUMBER = 10;
    public static final int SECURE_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private LazyStringList adomain_;
    private Audit audit_;
    private LazyStringList bundle_;
    private LazyStringList cat_;
    private int cattax_;
    private Display display_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private volatile Object init_;
    private volatile Object iurl_;
    private volatile Object lang_;
    private volatile Object lastmod_;
    private byte memoizedIsInitialized;
    private int mrating_;
    private boolean secure_;
    private Video video_;
    private static final C10729Ad DEFAULT_INSTANCE = new C10729Ad();
    private static final Parser<C10729Ad> PARSER = new AbstractParser<C10729Ad>() { // from class: com.explorestack.protobuf.adcom.Ad.1
        @Override // com.explorestack.protobuf.Parser
        public C10729Ad parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new C10729Ad(codedInputStream, extensionRegistryLite);
        }
    };

    /* renamed from: com.explorestack.protobuf.adcom.Ad$Audit */
    /* loaded from: classes3.dex */
    public static final class Audit extends GeneratedMessageV3 implements AuditOrBuilder {
        public static final int CORR_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int FEEDBACK_FIELD_NUMBER = 2;
        public static final int INIT_FIELD_NUMBER = 3;
        public static final int LASTMOD_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private C10729Ad corr_;
        private List<Any> extProto_;
        private Struct ext_;
        private LazyStringList feedback_;
        private volatile Object init_;
        private volatile Object lastmod_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final Audit DEFAULT_INSTANCE = new Audit();
        private static final Parser<Audit> PARSER = new AbstractParser<Audit>() { // from class: com.explorestack.protobuf.adcom.Ad.Audit.1
            @Override // com.explorestack.protobuf.Parser
            public Audit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Audit(codedInputStream, extensionRegistryLite);
            }
        };

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Audit$Builder */
        /* loaded from: classes3.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuditOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> corrBuilder_;
            private C10729Ad corr_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private LazyStringList feedback_;
            private Object init_;
            private Object lastmod_;
            private int status_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureFeedbackIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.feedback_ = new LazyStringArrayList(this.feedback_);
                    this.bitField0_ |= 1;
                }
            }

            private SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> getCorrFieldBuilder() {
                if (this.corrBuilder_ == null) {
                    this.corrBuilder_ = new SingleFieldBuilderV3<>(getCorr(), getParentForChildren(), isClean());
                    this.corr_ = null;
                }
                return this.corrBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                boolean z;
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    if ((this.bitField0_ & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllFeedback(Iterable<String> iterable) {
                ensureFeedbackIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.feedback_);
                onChanged();
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Builder addFeedback(String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.add((LazyStringList) str);
                onChanged();
                return this;
            }

            public Builder addFeedbackBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureFeedbackIsMutable();
                this.feedback_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearCorr() {
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                    onChanged();
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
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

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearFeedback() {
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInit() {
                this.init_ = Audit.getDefaultInstance().getInit();
                onChanged();
                return this;
            }

            public Builder clearLastmod() {
                this.lastmod_ = Audit.getDefaultInstance().getLastmod();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public C10729Ad getCorr() {
                SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    C10729Ad c10729Ad = this.corr_;
                    if (c10729Ad == null) {
                        return C10729Ad.getDefaultInstance();
                    }
                    return c10729Ad;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder getCorrBuilder() {
                onChanged();
                return getCorrFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public AdOrBuilder getCorrOrBuilder() {
                SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                C10729Ad c10729Ad = this.corr_;
                if (c10729Ad == null) {
                    return C10729Ad.getDefaultInstance();
                }
                return c10729Ad;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public String getFeedback(int i) {
                return this.feedback_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public ByteString getFeedbackBytes(int i) {
                return this.feedback_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public int getFeedbackCount() {
                return this.feedback_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public String getInit() {
                Object obj = this.init_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.init_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public ByteString getInitBytes() {
                Object obj = this.init_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.init_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public String getLastmod() {
                Object obj = this.lastmod_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastmod_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public ByteString getLastmodBytes() {
                Object obj = this.lastmod_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastmod_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public AuditStatusCode getStatus() {
                AuditStatusCode valueOf = AuditStatusCode.valueOf(this.status_);
                if (valueOf == null) {
                    return AuditStatusCode.UNRECOGNIZED;
                }
                return valueOf;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public boolean hasCorr() {
                if (this.corrBuilder_ == null && this.corr_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public boolean hasExt() {
                if (this.extBuilder_ == null && this.ext_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.f24376xb068ce5e.ensureFieldAccessorsInitialized(Audit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCorr(C10729Ad c10729Ad) {
                SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    C10729Ad c10729Ad2 = this.corr_;
                    if (c10729Ad2 != null) {
                        this.corr_ = C10729Ad.newBuilder(c10729Ad2).mergeFrom(c10729Ad).buildPartial();
                    } else {
                        this.corr_ = c10729Ad;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(c10729Ad);
                }
                return this;
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

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setCorr(C10729Ad c10729Ad) {
                SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    c10729Ad.getClass();
                    this.corr_ = c10729Ad;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(c10729Ad);
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

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, any);
                }
                return this;
            }

            public Builder setFeedback(int i, String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.set(i, (int) str);
                onChanged();
                return this;
            }

            public Builder setInit(String str) {
                str.getClass();
                this.init_ = str;
                onChanged();
                return this;
            }

            public Builder setInitBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.init_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLastmod(String str) {
                str.getClass();
                this.lastmod_ = str;
                onChanged();
                return this;
            }

            public Builder setLastmodBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.lastmod_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStatus(AuditStatusCode auditStatusCode) {
                auditStatusCode.getClass();
                this.status_ = auditStatusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatusValue(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
            public ProtocolStringList getFeedbackList() {
                return this.feedback_.getUnmodifiableView();
            }

            private Builder() {
                this.status_ = 0;
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit build() {
                Audit buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit buildPartial() {
                Audit audit = new Audit(this);
                audit.status_ = this.status_;
                if ((this.bitField0_ & 1) != 0) {
                    this.feedback_ = this.feedback_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                audit.feedback_ = this.feedback_;
                audit.init_ = this.init_;
                audit.lastmod_ = this.lastmod_;
                SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    audit.corr_ = this.corr_;
                } else {
                    audit.corr_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                if (singleFieldBuilderV32 == null) {
                    audit.ext_ = this.ext_;
                } else {
                    audit.ext_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    audit.extProto_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    audit.extProto_ = this.extProto_;
                }
                onBuilt();
                return audit;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Audit getDefaultInstanceForType() {
                return Audit.getDefaultInstance();
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

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                this.status_ = 0;
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.init_ = "";
                this.lastmod_ = "";
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder setCorr(Builder builder) {
                SingleFieldBuilderV3<C10729Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.corr_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
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

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, any);
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
                if (message instanceof Audit) {
                    return mergeFrom((Audit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Audit audit) {
                if (audit == Audit.getDefaultInstance()) {
                    return this;
                }
                if (audit.status_ != 0) {
                    setStatusValue(audit.getStatusValue());
                }
                if (!audit.feedback_.isEmpty()) {
                    if (this.feedback_.isEmpty()) {
                        this.feedback_ = audit.feedback_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeedbackIsMutable();
                        this.feedback_.addAll(audit.feedback_);
                    }
                    onChanged();
                }
                if (!audit.getInit().isEmpty()) {
                    this.init_ = audit.init_;
                    onChanged();
                }
                if (!audit.getLastmod().isEmpty()) {
                    this.lastmod_ = audit.lastmod_;
                    onChanged();
                }
                if (audit.hasCorr()) {
                    mergeCorr(audit.getCorr());
                }
                if (audit.hasExt()) {
                    mergeExt(audit.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!audit.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = audit.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(audit.extProto_);
                        }
                        onChanged();
                    }
                } else if (!audit.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(audit.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = audit.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) audit).unknownFields);
                onChanged();
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
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
            public com.explorestack.protobuf.adcom.C10729Ad.Audit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Audit.access$19500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Audit r3 = (com.explorestack.protobuf.adcom.C10729Ad.Audit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Audit r4 = (com.explorestack.protobuf.adcom.C10729Ad.Audit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Audit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Audit$Builder");
            }
        }

        public static Audit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Audit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Audit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Audit> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Audit)) {
                return super.equals(obj);
            }
            Audit audit = (Audit) obj;
            if (this.status_ != audit.status_ || !getFeedbackList().equals(audit.getFeedbackList()) || !getInit().equals(audit.getInit()) || !getLastmod().equals(audit.getLastmod()) || hasCorr() != audit.hasCorr()) {
                return false;
            }
            if ((hasCorr() && !getCorr().equals(audit.getCorr())) || hasExt() != audit.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(audit.getExt())) && getExtProtoList().equals(audit.getExtProtoList()) && this.unknownFields.equals(audit.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public C10729Ad getCorr() {
            C10729Ad c10729Ad = this.corr_;
            if (c10729Ad == null) {
                return C10729Ad.getDefaultInstance();
            }
            return c10729Ad;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public AdOrBuilder getCorrOrBuilder() {
            return getCorr();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            if (struct == null) {
                return Struct.getDefaultInstance();
            }
            return struct;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public String getFeedback(int i) {
            return this.feedback_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public ByteString getFeedbackBytes(int i) {
            return this.feedback_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public int getFeedbackCount() {
            return this.feedback_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.init_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastmod_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Audit> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            if (this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber()) {
                i = CodedOutputStream.computeEnumSize(1, this.status_) + 0;
            } else {
                i = 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.feedback_.size(); i4++) {
                i3 += GeneratedMessageV3.computeStringSizeNoTag(this.feedback_.getRaw(i4));
            }
            int size = i + i3 + (getFeedbackList().size() * 1);
            if (!getInitBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(4, this.lastmod_);
            }
            if (this.corr_ != null) {
                size += CodedOutputStream.computeMessageSize(5, getCorr());
            }
            for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                size += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i5));
            }
            if (this.ext_ != null) {
                size += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public AuditStatusCode getStatus() {
            AuditStatusCode valueOf = AuditStatusCode.valueOf(this.status_);
            if (valueOf == null) {
                return AuditStatusCode.UNRECOGNIZED;
            }
            return valueOf;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public boolean hasCorr() {
            if (this.corr_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public boolean hasExt() {
            if (this.ext_ != null) {
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
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.status_;
            if (getFeedbackCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getFeedbackList().hashCode();
            }
            int hashCode2 = (((((((hashCode * 37) + 3) * 53) + getInit().hashCode()) * 37) + 4) * 53) + getLastmod().hashCode();
            if (hasCorr()) {
                hashCode2 = (((hashCode2 * 37) + 5) * 53) + getCorr().hashCode();
            }
            if (hasExt()) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.f24376xb068ce5e.ensureFieldAccessorsInitialized(Audit.class, Builder.class);
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
            return new Audit();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            for (int i = 0; i < this.feedback_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.feedback_.getRaw(i));
            }
            if (!getInitBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.lastmod_);
            }
            if (this.corr_ != null) {
                codedOutputStream.writeMessage(5, getCorr());
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Audit audit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audit);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.AuditOrBuilder
        public ProtocolStringList getFeedbackList() {
            return this.feedback_;
        }

        private Audit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Audit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Audit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Audit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Audit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Audit() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.feedback_ = LazyStringArrayList.EMPTY;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
        }

        public static Audit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Audit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Audit parseFrom(InputStream inputStream) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Audit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Audit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.status_ = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.feedback_ = new LazyStringArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.feedback_.add((LazyStringList) readStringRequireUtf8);
                            } else if (readTag == 26) {
                                this.init_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 34) {
                                if (readTag == 42) {
                                    C10729Ad c10729Ad = this.corr_;
                                    Builder builder = c10729Ad != null ? c10729Ad.toBuilder() : null;
                                    C10729Ad c10729Ad2 = (C10729Ad) codedInputStream.readMessage(C10729Ad.parser(), extensionRegistryLite);
                                    this.corr_ = c10729Ad2;
                                    if (builder != null) {
                                        builder.mergeFrom(c10729Ad2);
                                        this.corr_ = builder.buildPartial();
                                    }
                                } else if (readTag == 50) {
                                    boolean z4 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z4) {
                                        this.extProto_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag != 58) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
                                    }
                                }
                            } else {
                                this.lastmod_ = codedInputStream.readStringRequireUtf8();
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
                        this.feedback_ = this.feedback_.getUnmodifiableView();
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Audit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$AuditOrBuilder */
    /* loaded from: classes3.dex */
    public interface AuditOrBuilder extends MessageOrBuilder {
        C10729Ad getCorr();

        AdOrBuilder getCorrOrBuilder();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getFeedback(int i);

        ByteString getFeedbackBytes(int i);

        int getFeedbackCount();

        List<String> getFeedbackList();

        String getInit();

        ByteString getInitBytes();

        String getLastmod();

        ByteString getLastmodBytes();

        AuditStatusCode getStatus();

        int getStatusValue();

        boolean hasCorr();

        boolean hasExt();
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$Builder */
    /* loaded from: classes3.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdOrBuilder {
        private LazyStringList adomain_;
        private SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> auditBuilder_;
        private Audit audit_;
        private int bitField0_;
        private LazyStringList bundle_;
        private LazyStringList cat_;
        private int cattax_;
        private SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> displayBuilder_;
        private Display display_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private Object init_;
        private Object iurl_;
        private Object lang_;
        private Object lastmod_;
        private int mrating_;
        private boolean secure_;
        private SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> videoBuilder_;
        private Video video_;

        private void ensureAdomainIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adomain_ = new LazyStringArrayList(this.adomain_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureBundleIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.bundle_ = new LazyStringArrayList(this.bundle_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureCatIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.cat_ = new LazyStringArrayList(this.cat_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        private SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> getAuditFieldBuilder() {
            if (this.auditBuilder_ == null) {
                this.auditBuilder_ = new SingleFieldBuilderV3<>(getAudit(), getParentForChildren(), isClean());
                this.audit_ = null;
            }
            return this.auditBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
        }

        private SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new SingleFieldBuilderV3<>(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
            boolean z;
            if (this.extProtoBuilder_ == null) {
                List<Any> list = this.extProto_;
                if ((this.bitField0_ & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new SingleFieldBuilderV3<>(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAdomain(String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.add((LazyStringList) str);
            onChanged();
            return this;
        }

        public Builder addAdomainBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAdomainIsMutable();
            this.adomain_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addAllAdomain(Iterable<String> iterable) {
            ensureAdomainIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.adomain_);
            onChanged();
            return this;
        }

        public Builder addAllBundle(Iterable<String> iterable) {
            ensureBundleIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.bundle_);
            onChanged();
            return this;
        }

        public Builder addAllCat(Iterable<String> iterable) {
            ensureCatIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.cat_);
            onChanged();
            return this;
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addBundle(String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.add((LazyStringList) str);
            onChanged();
            return this;
        }

        public Builder addBundleBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureBundleIsMutable();
            this.bundle_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addCat(String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.add((LazyStringList) str);
            onChanged();
            return this;
        }

        public Builder addCatBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureCatIsMutable();
            this.cat_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(any);
            }
            return this;
        }

        public Any.Builder addExtProtoBuilder() {
            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
        }

        public Builder clearAdomain() {
            this.adomain_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearAudit() {
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
                onChanged();
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearCat() {
            this.cat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
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

        public Builder clearExtProto() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearId() {
            this.id_ = C10729Ad.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearInit() {
            this.init_ = C10729Ad.getDefaultInstance().getInit();
            onChanged();
            return this;
        }

        public Builder clearIurl() {
            this.iurl_ = C10729Ad.getDefaultInstance().getIurl();
            onChanged();
            return this;
        }

        public Builder clearLang() {
            this.lang_ = C10729Ad.getDefaultInstance().getLang();
            onChanged();
            return this;
        }

        public Builder clearLastmod() {
            this.lastmod_ = C10729Ad.getDefaultInstance().getLastmod();
            onChanged();
            return this;
        }

        public Builder clearMrating() {
            this.mrating_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getAdomain(int i) {
            return this.adomain_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getAdomainBytes(int i) {
            return this.adomain_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public int getAdomainCount() {
            return this.adomain_.size();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public Audit getAudit() {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 == null) {
                Audit audit = this.audit_;
                if (audit == null) {
                    return Audit.getDefaultInstance();
                }
                return audit;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Audit.Builder getAuditBuilder() {
            onChanged();
            return getAuditFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public AuditOrBuilder getAuditOrBuilder() {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Audit audit = this.audit_;
            if (audit == null) {
                return Audit.getDefaultInstance();
            }
            return audit;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getBundle(int i) {
            return this.bundle_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getBundleBytes(int i) {
            return this.bundle_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public int getBundleCount() {
            return this.bundle_.size();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getCat(int i) {
            return this.cat_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getCatBytes(int i) {
            return this.cat_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public int getCatCount() {
            return this.cat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
            if (valueOf == null) {
                return CategoryTaxonomy.UNRECOGNIZED;
            }
            return valueOf;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public Display getDisplay() {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                Display display = this.display_;
                if (display == null) {
                    return Display.getDefaultInstance();
                }
                return display;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Display.Builder getDisplayBuilder() {
            onChanged();
            return getDisplayFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public DisplayOrBuilder getDisplayOrBuilder() {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Display display = this.display_;
            if (display == null) {
                return Display.getDefaultInstance();
            }
            return display;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
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

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
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

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public Any getExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Any.Builder getExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().getBuilder(i);
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().getBuilderList();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public int getExtProtoCount() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public List<Any> getExtProtoList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.extProto_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.extProto_);
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getInit() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.init_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.init_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getIurl() {
            Object obj = this.iurl_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.iurl_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getIurlBytes() {
            Object obj = this.iurl_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.iurl_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getLang() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public String getLastmod() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastmod_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastmod_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public MediaRating getMrating() {
            MediaRating valueOf = MediaRating.valueOf(this.mrating_);
            if (valueOf == null) {
                return MediaRating.UNRECOGNIZED;
            }
            return valueOf;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public int getMratingValue() {
            return this.mrating_;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public boolean getSecure() {
            return this.secure_;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public Video getVideo() {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Video video = this.video_;
                if (video == null) {
                    return Video.getDefaultInstance();
                }
                return video;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Video.Builder getVideoBuilder() {
            onChanged();
            return getVideoFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public VideoOrBuilder getVideoOrBuilder() {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Video video = this.video_;
            if (video == null) {
                return Video.getDefaultInstance();
            }
            return video;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public boolean hasAudit() {
            if (this.auditBuilder_ == null && this.audit_ == null) {
                return false;
            }
            return true;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public boolean hasDisplay() {
            if (this.displayBuilder_ == null && this.display_ == null) {
                return false;
            }
            return true;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public boolean hasExt() {
            if (this.extBuilder_ == null && this.ext_ == null) {
                return false;
            }
            return true;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public boolean hasVideo() {
            if (this.videoBuilder_ == null && this.video_ == null) {
                return false;
            }
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_fieldAccessorTable.ensureFieldAccessorsInitialized(C10729Ad.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudit(Audit audit) {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 == null) {
                Audit audit2 = this.audit_;
                if (audit2 != null) {
                    this.audit_ = Audit.newBuilder(audit2).mergeFrom(audit).buildPartial();
                } else {
                    this.audit_ = audit;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(audit);
            }
            return this;
        }

        public Builder mergeDisplay(Display display) {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                Display display2 = this.display_;
                if (display2 != null) {
                    this.display_ = Display.newBuilder(display2).mergeFrom(display).buildPartial();
                } else {
                    this.display_ = display;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(display);
            }
            return this;
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

        public Builder mergeVideo(Video video) {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Video video2 = this.video_;
                if (video2 != null) {
                    this.video_ = Video.newBuilder(video2).mergeFrom(video).buildPartial();
                } else {
                    this.video_ = video;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(video);
            }
            return this;
        }

        public Builder removeExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Builder setAdomain(int i, String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.set(i, (int) str);
            onChanged();
            return this;
        }

        public Builder setAudit(Audit audit) {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 == null) {
                audit.getClass();
                this.audit_ = audit;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(audit);
            }
            return this;
        }

        public Builder setBundle(int i, String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.set(i, (int) str);
            onChanged();
            return this;
        }

        public Builder setCat(int i, String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.set(i, (int) str);
            onChanged();
            return this;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            categoryTaxonomy.getClass();
            this.cattax_ = categoryTaxonomy.getNumber();
            onChanged();
            return this;
        }

        public Builder setCattaxValue(int i) {
            this.cattax_ = i;
            onChanged();
            return this;
        }

        public Builder setDisplay(Display display) {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                display.getClass();
                this.display_ = display;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(display);
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

        public Builder setExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.set(i, any);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, any);
            }
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

        public Builder setInit(String str) {
            str.getClass();
            this.init_ = str;
            onChanged();
            return this;
        }

        public Builder setInitBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.init_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIurl(String str) {
            str.getClass();
            this.iurl_ = str;
            onChanged();
            return this;
        }

        public Builder setIurlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.iurl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLang(String str) {
            str.getClass();
            this.lang_ = str;
            onChanged();
            return this;
        }

        public Builder setLangBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.lang_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLastmod(String str) {
            str.getClass();
            this.lastmod_ = str;
            onChanged();
            return this;
        }

        public Builder setLastmodBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.lastmod_ = byteString;
            onChanged();
            return this;
        }

        public Builder setMrating(MediaRating mediaRating) {
            mediaRating.getClass();
            this.mrating_ = mediaRating.getNumber();
            onChanged();
            return this;
        }

        public Builder setMratingValue(int i) {
            this.mrating_ = i;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z) {
            this.secure_ = z;
            onChanged();
            return this;
        }

        public Builder setVideo(Video video) {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                video.getClass();
                this.video_ = video;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(video);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ProtocolStringList getAdomainList() {
            return this.adomain_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ProtocolStringList getBundleList() {
            return this.bundle_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.AdOrBuilder
        public ProtocolStringList getCatList() {
            return this.cat_.getUnmodifiableView();
        }

        private Builder() {
            this.id_ = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.adomain_ = lazyStringList;
            this.bundle_ = lazyStringList;
            this.iurl_ = "";
            this.cat_ = lazyStringList;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public C10729Ad build() {
            C10729Ad buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public C10729Ad buildPartial() {
            C10729Ad c10729Ad = new C10729Ad(this);
            c10729Ad.id_ = this.id_;
            if ((this.bitField0_ & 1) != 0) {
                this.adomain_ = this.adomain_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            c10729Ad.adomain_ = this.adomain_;
            if ((this.bitField0_ & 2) != 0) {
                this.bundle_ = this.bundle_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            c10729Ad.bundle_ = this.bundle_;
            c10729Ad.iurl_ = this.iurl_;
            if ((this.bitField0_ & 4) != 0) {
                this.cat_ = this.cat_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            c10729Ad.cat_ = this.cat_;
            c10729Ad.cattax_ = this.cattax_;
            c10729Ad.lang_ = this.lang_;
            c10729Ad.secure_ = this.secure_;
            c10729Ad.mrating_ = this.mrating_;
            c10729Ad.init_ = this.init_;
            c10729Ad.lastmod_ = this.lastmod_;
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                c10729Ad.display_ = this.display_;
            } else {
                c10729Ad.display_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV32 = this.videoBuilder_;
            if (singleFieldBuilderV32 == null) {
                c10729Ad.video_ = this.video_;
            } else {
                c10729Ad.video_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV33 = this.auditBuilder_;
            if (singleFieldBuilderV33 == null) {
                c10729Ad.audit_ = this.audit_;
            } else {
                c10729Ad.audit_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV34 = this.extBuilder_;
            if (singleFieldBuilderV34 == null) {
                c10729Ad.ext_ = this.ext_;
            } else {
                c10729Ad.ext_ = singleFieldBuilderV34.build();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                c10729Ad.extProto_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                c10729Ad.extProto_ = this.extProto_;
            }
            onBuilt();
            return c10729Ad;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public C10729Ad getDefaultInstanceForType() {
            return C10729Ad.getDefaultInstance();
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

        public Any.Builder addExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.adomain_ = lazyStringList;
            this.bundle_ = lazyStringList;
            this.iurl_ = "";
            this.cat_ = lazyStringList;
            this.bitField0_ = this.bitField0_ & (-2) & (-3) & (-5);
            this.cattax_ = 0;
            this.lang_ = "";
            this.secure_ = false;
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -9;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder setAudit(Audit.Builder builder) {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.audit_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setDisplay(Display.Builder builder) {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.display_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
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

        public Builder setVideo(Video.Builder builder) {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.video_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder addExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(i, any);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, any);
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
            if (message instanceof C10729Ad) {
                return mergeFrom((C10729Ad) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(C10729Ad c10729Ad) {
            if (c10729Ad == C10729Ad.getDefaultInstance()) {
                return this;
            }
            if (!c10729Ad.getId().isEmpty()) {
                this.id_ = c10729Ad.id_;
                onChanged();
            }
            if (!c10729Ad.adomain_.isEmpty()) {
                if (this.adomain_.isEmpty()) {
                    this.adomain_ = c10729Ad.adomain_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdomainIsMutable();
                    this.adomain_.addAll(c10729Ad.adomain_);
                }
                onChanged();
            }
            if (!c10729Ad.bundle_.isEmpty()) {
                if (this.bundle_.isEmpty()) {
                    this.bundle_ = c10729Ad.bundle_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBundleIsMutable();
                    this.bundle_.addAll(c10729Ad.bundle_);
                }
                onChanged();
            }
            if (!c10729Ad.getIurl().isEmpty()) {
                this.iurl_ = c10729Ad.iurl_;
                onChanged();
            }
            if (!c10729Ad.cat_.isEmpty()) {
                if (this.cat_.isEmpty()) {
                    this.cat_ = c10729Ad.cat_;
                    this.bitField0_ &= -5;
                } else {
                    ensureCatIsMutable();
                    this.cat_.addAll(c10729Ad.cat_);
                }
                onChanged();
            }
            if (c10729Ad.cattax_ != 0) {
                setCattaxValue(c10729Ad.getCattaxValue());
            }
            if (!c10729Ad.getLang().isEmpty()) {
                this.lang_ = c10729Ad.lang_;
                onChanged();
            }
            if (c10729Ad.getSecure()) {
                setSecure(c10729Ad.getSecure());
            }
            if (c10729Ad.mrating_ != 0) {
                setMratingValue(c10729Ad.getMratingValue());
            }
            if (!c10729Ad.getInit().isEmpty()) {
                this.init_ = c10729Ad.init_;
                onChanged();
            }
            if (!c10729Ad.getLastmod().isEmpty()) {
                this.lastmod_ = c10729Ad.lastmod_;
                onChanged();
            }
            if (c10729Ad.hasDisplay()) {
                mergeDisplay(c10729Ad.getDisplay());
            }
            if (c10729Ad.hasVideo()) {
                mergeVideo(c10729Ad.getVideo());
            }
            if (c10729Ad.hasAudit()) {
                mergeAudit(c10729Ad.getAudit());
            }
            if (c10729Ad.hasExt()) {
                mergeExt(c10729Ad.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!c10729Ad.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = c10729Ad.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(c10729Ad.extProto_);
                    }
                    onChanged();
                }
            } else if (!c10729Ad.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.addAllMessages(c10729Ad.extProto_);
                } else {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = c10729Ad.extProto_;
                    this.bitField0_ &= -9;
                    this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) c10729Ad).unknownFields);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.id_ = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.adomain_ = lazyStringList;
            this.bundle_ = lazyStringList;
            this.iurl_ = "";
            this.cat_ = lazyStringList;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, builder.build());
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
        public com.explorestack.protobuf.adcom.C10729Ad.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.access$22200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Ad r3 = (com.explorestack.protobuf.adcom.C10729Ad) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Ad r4 = (com.explorestack.protobuf.adcom.C10729Ad) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Builder");
        }
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$Display */
    /* loaded from: classes3.dex */
    public static final class Display extends GeneratedMessageV3 implements DisplayOrBuilder {
        public static final int ADM_FIELD_NUMBER = 8;
        public static final int API_FIELD_NUMBER = 2;
        public static final int BANNER_FIELD_NUMBER = 10;
        public static final int CURL_FIELD_NUMBER = 9;
        public static final int EVENT_FIELD_NUMBER = 12;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int HRATIO_FIELD_NUMBER = 7;
        public static final int H_FIELD_NUMBER = 5;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int NATIVE_FIELD_NUMBER = 11;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int WRATIO_FIELD_NUMBER = 6;
        public static final int W_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private Banner banner_;
        private volatile Object curl_;
        private List<Event> event_;
        private List<Any> extProto_;
        private Struct ext_;

        /* renamed from: h_ */
        private int f24368h_;
        private int hratio_;
        private byte memoizedIsInitialized;
        private LazyStringList mime_;
        private Native native_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;

        /* renamed from: w_ */
        private int f24369w_;
        private int wratio_;
        private static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.1
            @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, DisplayCreativeType> type_converter_ = new Internal.ListAdapter.Converter<Integer, DisplayCreativeType>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.2
            @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType valueOf = DisplayCreativeType.valueOf(num.intValue());
                return valueOf == null ? DisplayCreativeType.UNRECOGNIZED : valueOf;
            }
        };
        private static final Display DEFAULT_INSTANCE = new Display();
        private static final Parser<Display> PARSER = new AbstractParser<Display>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.3
            @Override // com.explorestack.protobuf.Parser
            public Display parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Display(codedInputStream, extensionRegistryLite);
            }
        };

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Banner */
        /* loaded from: classes3.dex */
        public static final class Banner extends GeneratedMessageV3 implements BannerOrBuilder {
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int IMG_FIELD_NUMBER = 1;
            public static final int LINK_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object img_;
            private volatile Object link_;
            private byte memoizedIsInitialized;
            private static final Banner DEFAULT_INSTANCE = new Banner();
            private static final Parser<Banner> PARSER = new AbstractParser<Banner>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Banner.1
                @Override // com.explorestack.protobuf.Parser
                public Banner parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Banner(codedInputStream, extensionRegistryLite);
                }
            };

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.f24377xbef51918;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Banner> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    return super.equals(obj);
                }
                Banner banner = (Banner) obj;
                if (!getImg().equals(banner.getImg()) || !getLink().equals(banner.getLink()) || hasExt() != banner.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(banner.getExt())) && getExtProtoList().equals(banner.getExtProtoList()) && this.unknownFields.equals(banner.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                if (struct == null) {
                    return Struct.getDefaultInstance();
                }
                return struct;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public String getImg() {
                Object obj = this.img_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.img_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public ByteString getImgBytes() {
                Object obj = this.img_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.img_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public String getLink() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.link_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public ByteString getLinkBytes() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.link_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<Banner> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i;
                int i2 = this.memoizedSize;
                if (i2 != -1) {
                    return i2;
                }
                if (!getImgBytes().isEmpty()) {
                    i = GeneratedMessageV3.computeStringSize(1, this.img_) + 0;
                } else {
                    i = 0;
                }
                if (!getLinkBytes().isEmpty()) {
                    i += GeneratedMessageV3.computeStringSize(2, this.link_);
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    i += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    i += CodedOutputStream.computeMessageSize(4, getExt());
                }
                int serializedSize = i + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
            public boolean hasExt() {
                if (this.ext_ != null) {
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
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImg().hashCode()) * 37) + 2) * 53) + getLink().hashCode();
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.f24378xb2a5a796.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
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
                return new Banner();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getImgBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.img_);
                }
                if (!getLinkBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.link_);
                }
                for (int i = 0; i < this.extProto_.size(); i++) {
                    codedOutputStream.writeMessage(3, this.extProto_.get(i));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(4, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Banner$Builder */
            /* loaded from: classes3.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BannerOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object img_;
                private Object link_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.f24377xbef51918;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        List<Any> list = this.extProto_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
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

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder clearImg() {
                    this.img_ = Banner.getDefaultInstance().getImg();
                    onChanged();
                    return this;
                }

                public Builder clearLink() {
                    this.link_ = Banner.getDefaultInstance().getLink();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.f24377xbef51918;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public String getImg() {
                    Object obj = this.img_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.img_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public ByteString getImgBytes() {
                    Object obj = this.img_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.img_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public String getLink() {
                    Object obj = this.link_;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.link_ = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public ByteString getLinkBytes() {
                    Object obj = this.link_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.link_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.BannerOrBuilder
                public boolean hasExt() {
                    if (this.extBuilder_ == null && this.ext_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.f24378xb2a5a796.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
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

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
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

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    }
                    return this;
                }

                public Builder setImg(String str) {
                    str.getClass();
                    this.img_ = str;
                    onChanged();
                    return this;
                }

                public Builder setImgBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.img_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLink(String str) {
                    str.getClass();
                    this.link_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLinkBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.link_ = byteString;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner build() {
                    Banner buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner buildPartial() {
                    Banner banner = new Banner(this);
                    banner.img_ = this.img_;
                    banner.link_ = this.link_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        banner.ext_ = this.ext_;
                    } else {
                        banner.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        banner.extProto_ = repeatedFieldBuilderV3.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        banner.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return banner;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Banner getDefaultInstanceForType() {
                    return Banner.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                    this.img_ = "";
                    this.link_ = "";
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
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

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, any);
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
                    if (message instanceof Banner) {
                        return mergeFrom((Banner) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Banner banner) {
                    if (banner == Banner.getDefaultInstance()) {
                        return this;
                    }
                    if (!banner.getImg().isEmpty()) {
                        this.img_ = banner.img_;
                        onChanged();
                    }
                    if (!banner.getLink().isEmpty()) {
                        this.link_ = banner.link_;
                        onChanged();
                    }
                    if (banner.hasExt()) {
                        mergeExt(banner.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!banner.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = banner.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(banner.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!banner.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(banner.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = banner.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((GeneratedMessageV3) banner).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
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
                public com.explorestack.protobuf.adcom.C10729Ad.Display.Banner.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Banner.access$2800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Banner) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Banner) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Banner.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Banner$Builder");
                }
            }

            public static Builder newBuilder(Banner banner) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private Banner(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Banner getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Banner() {
                this.memoizedIsInitialized = (byte) -1;
                this.img_ = "";
                this.link_ = "";
                this.extProto_ = Collections.emptyList();
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Banner(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.img_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.link_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    if (!(z2 & true)) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag != 34) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
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
                        if (z2 & true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static Banner parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$BannerOrBuilder */
        /* loaded from: classes3.dex */
        public interface BannerOrBuilder extends MessageOrBuilder {
            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getImg();

            ByteString getImgBytes();

            String getLink();

            ByteString getLinkBytes();

            boolean hasExt();
        }

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Builder */
        /* loaded from: classes3.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> bannerBuilder_;
            private Banner banner_;
            private int bitField0_;
            private Object curl_;
            private RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> eventBuilder_;
            private List<Event> event_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;

            /* renamed from: h_ */
            private int f24370h_;
            private int hratio_;
            private LazyStringList mime_;
            private SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> nativeBuilder_;
            private Native native_;
            private List<Integer> type_;

            /* renamed from: w_ */
            private int f24371w_;
            private int wratio_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new LazyStringArrayList(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            private SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> getBannerFieldBuilder() {
                if (this.bannerBuilder_ == null) {
                    this.bannerBuilder_ = new SingleFieldBuilderV3<>(getBanner(), getParentForChildren(), isClean());
                    this.banner_ = null;
                }
                return this.bannerBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;
            }

            private RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> getEventFieldBuilder() {
                boolean z;
                if (this.eventBuilder_ == null) {
                    List<Event> list = this.event_;
                    if ((this.bitField0_ & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.eventBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                boolean z;
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    if ((this.bitField0_ & 16) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> getNativeFieldBuilder() {
                if (this.nativeBuilder_ == null) {
                    this.nativeBuilder_ = new SingleFieldBuilderV3<>(getNative(), getParentForChildren(), isClean());
                    this.native_ = null;
                }
                return this.nativeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                for (ApiFramework apiFramework : iterable) {
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    this.api_.add(Integer.valueOf(num.intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllEvent(Iterable<? extends Event> iterable) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.event_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends DisplayCreativeType> iterable) {
                ensureTypeIsMutable();
                for (DisplayCreativeType displayCreativeType : iterable) {
                    this.type_.add(Integer.valueOf(displayCreativeType.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer num : iterable) {
                    this.type_.add(Integer.valueOf(num.intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addEvent(Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.add(event);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(event);
                }
                return this;
            }

            public Event.Builder addEventBuilder() {
                return getEventFieldBuilder().addBuilder(Event.getDefaultInstance());
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add((LazyStringList) str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.add(byteString);
                onChanged();
                return this;
            }

            public Builder addType(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Display.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBanner() {
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                    onChanged();
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Display.getDefaultInstance().getCurl();
                onChanged();
                return this;
            }

            public Builder clearEvent() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -9;
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

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearH() {
                this.f24370h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHratio() {
                this.hratio_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearNative() {
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                    onChanged();
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.f24371w_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWratio() {
                this.wratio_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adm_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adm_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public ApiFramework getApi(int i) {
                return (ApiFramework) Display.api_converter_.convert(this.api_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, Display.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public Banner getBanner() {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Banner banner = this.banner_;
                    if (banner == null) {
                        return Banner.getDefaultInstance();
                    }
                    return banner;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Banner.Builder getBannerBuilder() {
                onChanged();
                return getBannerFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public BannerOrBuilder getBannerOrBuilder() {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Banner banner = this.banner_;
                if (banner == null) {
                    return Banner.getDefaultInstance();
                }
                return banner;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.curl_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.curl_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public Event getEvent(int i) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Event.Builder getEventBuilder(int i) {
                return getEventFieldBuilder().getBuilder(i);
            }

            public List<Event.Builder> getEventBuilderList() {
                return getEventFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getEventCount() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<Event> getEventList() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.event_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public EventOrBuilder getEventOrBuilder(int i) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<? extends EventOrBuilder> getEventOrBuilderList() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getH() {
                return this.f24370h_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getHratio() {
                return this.hratio_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public String getMime(int i) {
                return this.mime_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public ByteString getMimeBytes(int i) {
                return this.mime_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public Native getNative() {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Native r0 = this.native_;
                    if (r0 == null) {
                        return Native.getDefaultInstance();
                    }
                    return r0;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Native.Builder getNativeBuilder() {
                onChanged();
                return getNativeFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public NativeOrBuilder getNativeOrBuilder() {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Native r0 = this.native_;
                if (r0 == null) {
                    return Native.getDefaultInstance();
                }
                return r0;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public DisplayCreativeType getType(int i) {
                return (DisplayCreativeType) Display.type_converter_.convert(this.type_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<DisplayCreativeType> getTypeList() {
                return new Internal.ListAdapter(this.type_, Display.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getTypeValue(int i) {
                return this.type_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getW() {
                return this.f24371w_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public boolean hasBanner() {
                if (this.bannerBuilder_ == null && this.banner_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public boolean hasExt() {
                if (this.extBuilder_ == null && this.ext_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public boolean hasNative() {
                if (this.nativeBuilder_ == null && this.native_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.f24393x95c152d7.ensureFieldAccessorsInitialized(Display.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBanner(Banner banner) {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Banner banner2 = this.banner_;
                    if (banner2 != null) {
                        this.banner_ = Banner.newBuilder(banner2).mergeFrom(banner).buildPartial();
                    } else {
                        this.banner_ = banner;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(banner);
                }
                return this;
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

            public Builder mergeNative(Native r2) {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Native r0 = this.native_;
                    if (r0 != null) {
                        this.native_ = Native.newBuilder(r0).mergeFrom(r2).buildPartial();
                    } else {
                        this.native_ = r2;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(r2);
                }
                return this;
            }

            public Builder removeEvent(int i) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setBanner(Banner banner) {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    banner.getClass();
                    this.banner_ = banner;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(banner);
                }
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEvent(int i, Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.set(i, event);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, event);
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

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, any);
                }
                return this;
            }

            public Builder setH(int i) {
                this.f24370h_ = i;
                onChanged();
                return this;
            }

            public Builder setHratio(int i) {
                this.hratio_ = i;
                onChanged();
                return this;
            }

            public Builder setMime(int i, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i, (int) str);
                onChanged();
                return this;
            }

            public Builder setNative(Native r2) {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    r2.getClass();
                    this.native_ = r2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(r2);
                }
                return this;
            }

            public Builder setType(int i, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i, int i2) {
                ensureTypeIsMutable();
                this.type_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setW(int i) {
                this.f24371w_ = i;
                onChanged();
                return this;
            }

            public Builder setWratio(int i) {
                this.wratio_ = i;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
            public ProtocolStringList getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display build() {
                Display buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display buildPartial() {
                Display display = new Display(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                display.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                display.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                display.type_ = this.type_;
                display.f24369w_ = this.f24371w_;
                display.f24368h_ = this.f24370h_;
                display.wratio_ = this.wratio_;
                display.hratio_ = this.hratio_;
                display.adm_ = this.adm_;
                display.curl_ = this.curl_;
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    display.banner_ = this.banner_;
                } else {
                    display.banner_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV32 = this.nativeBuilder_;
                if (singleFieldBuilderV32 == null) {
                    display.native_ = this.native_;
                } else {
                    display.native_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    display.event_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -9;
                    }
                    display.event_ = this.event_;
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV33 = this.extBuilder_;
                if (singleFieldBuilderV33 == null) {
                    display.ext_ = this.ext_;
                } else {
                    display.ext_ = singleFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 != null) {
                    display.extProto_ = repeatedFieldBuilderV32.build();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    display.extProto_ = this.extProto_;
                }
                onBuilt();
                return display;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Display getDefaultInstanceForType() {
                return Display.getDefaultInstance();
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

            public Event.Builder addEventBuilder(int i) {
                return getEventFieldBuilder().addBuilder(i, Event.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.f24371w_ = 0;
                this.f24370h_ = 0;
                this.wratio_ = 0;
                this.hratio_ = 0;
                this.adm_ = "";
                this.curl_ = "";
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                return this;
            }

            public Builder setBanner(Banner.Builder builder) {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.banner_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
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

            public Builder setNative(Native.Builder builder) {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.native_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder addEvent(int i, Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i, event);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, event);
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, any);
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
                if (message instanceof Display) {
                    return mergeFrom((Display) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEvent(int i, Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Display display) {
                if (display == Display.getDefaultInstance()) {
                    return this;
                }
                if (!display.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = display.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(display.mime_);
                    }
                    onChanged();
                }
                if (!display.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = display.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(display.api_);
                    }
                    onChanged();
                }
                if (!display.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = display.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(display.type_);
                    }
                    onChanged();
                }
                if (display.getW() != 0) {
                    setW(display.getW());
                }
                if (display.getH() != 0) {
                    setH(display.getH());
                }
                if (display.getWratio() != 0) {
                    setWratio(display.getWratio());
                }
                if (display.getHratio() != 0) {
                    setHratio(display.getHratio());
                }
                if (!display.getAdm().isEmpty()) {
                    this.adm_ = display.adm_;
                    onChanged();
                }
                if (!display.getCurl().isEmpty()) {
                    this.curl_ = display.curl_;
                    onChanged();
                }
                if (display.hasBanner()) {
                    mergeBanner(display.getBanner());
                }
                if (display.hasNative()) {
                    mergeNative(display.getNative());
                }
                if (this.eventBuilder_ == null) {
                    if (!display.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = display.event_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(display.event_);
                        }
                        onChanged();
                    }
                } else if (!display.event_.isEmpty()) {
                    if (!this.eventBuilder_.isEmpty()) {
                        this.eventBuilder_.addAllMessages(display.event_);
                    } else {
                        this.eventBuilder_.dispose();
                        this.eventBuilder_ = null;
                        this.event_ = display.event_;
                        this.bitField0_ &= -9;
                        this.eventBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (display.hasExt()) {
                    mergeExt(display.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!display.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = display.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(display.extProto_);
                        }
                        onChanged();
                    }
                } else if (!display.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(display.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = display.extProto_;
                        this.bitField0_ &= -17;
                        this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) display).unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addEvent(Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addEvent(int i, Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
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
            public com.explorestack.protobuf.adcom.C10729Ad.Display.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.access$15500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Display r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Display r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Builder");
            }
        }

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native */
        /* loaded from: classes3.dex */
        public static final class Native extends GeneratedMessageV3 implements NativeOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int LINK_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<Asset> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private LinkAsset link_;
            private byte memoizedIsInitialized;
            private static final Native DEFAULT_INSTANCE = new Native();
            private static final Parser<Native> PARSER = new AbstractParser<Native>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.1
                @Override // com.explorestack.protobuf.Parser
                public Native parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Native(codedInputStream, extensionRegistryLite);
                }
            };

            /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset */
            /* loaded from: classes3.dex */
            public static final class Asset extends GeneratedMessageV3 implements AssetOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 9;
                public static final int EXT_PROTO_FIELD_NUMBER = 8;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMAGE_FIELD_NUMBER = 4;
                public static final int LINK_FIELD_NUMBER = 7;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAsset data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAsset image_;
                private LinkAsset link_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAsset title_;
                private VideoAsset video_;
                private static final Asset DEFAULT_INSTANCE = new Asset();
                private static final Parser<Asset> PARSER = new AbstractParser<Asset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.1
                    @Override // com.explorestack.protobuf.Parser
                    public Asset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Asset(codedInputStream, extensionRegistryLite);
                    }
                };

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset */
                /* loaded from: classes3.dex */
                public static final class DataAsset extends GeneratedMessageV3 implements DataAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 5;
                    public static final int EXT_PROTO_FIELD_NUMBER = 4;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 3;
                    public static final int VALUE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object value_;
                    private static final DataAsset DEFAULT_INSTANCE = new DataAsset();
                    private static final Parser<DataAsset> PARSER = new AbstractParser<DataAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.1
                        @Override // com.explorestack.protobuf.Parser
                        public DataAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new DataAsset(codedInputStream, extensionRegistryLite);
                        }
                    };

                    public static DataAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.f24379x89a0a5f5;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static Parser<DataAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAsset)) {
                            return super.equals(obj);
                        }
                        DataAsset dataAsset = (DataAsset) obj;
                        if (!getValue().equals(dataAsset.getValue()) || getLen() != dataAsset.getLen() || this.type_ != dataAsset.type_ || hasExt() != dataAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(dataAsset.getExt())) && getExtProtoList().equals(dataAsset.getExtProtoList()) && this.unknownFields.equals(dataAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        if (struct == null) {
                            return Struct.getDefaultInstance();
                        }
                        return struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public StructOrBuilder getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getLen() {
                        return this.len_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Parser<DataAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i;
                        int i2 = this.memoizedSize;
                        if (i2 != -1) {
                            return i2;
                        }
                        if (!getValueBytes().isEmpty()) {
                            i = GeneratedMessageV3.computeStringSize(1, this.value_) + 0;
                        } else {
                            i = 0;
                        }
                        int i3 = this.len_;
                        if (i3 != 0) {
                            i += CodedOutputStream.computeUInt32Size(2, i3);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            i += CodedOutputStream.computeEnumSize(3, this.type_);
                        }
                        for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                            i += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i4));
                        }
                        if (this.ext_ != null) {
                            i += CodedOutputStream.computeMessageSize(5, getExt());
                        }
                        int serializedSize = i + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType valueOf = NativeDataAssetType.valueOf(this.type_);
                        if (valueOf == null) {
                            return NativeDataAssetType.UNRECOGNIZED;
                        }
                        return valueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.value_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                    public boolean hasExt() {
                        if (this.ext_ != null) {
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
                        int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 37) + 2) * 53) + getLen()) * 37) + 3) * 53) + this.type_;
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 5) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.f24380xe190773.ensureFieldAccessorsInitialized(DataAsset.class, Builder.class);
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
                        return new DataAsset();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getValueBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.value_);
                        }
                        int i = this.len_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(2, i);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.writeEnum(3, this.type_);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            codedOutputStream.writeMessage(4, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(5, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset$Builder */
                    /* loaded from: classes3.dex */
                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataAssetOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;
                        private Object value_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.f24379x89a0a5f5;
                        }

                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                List<Any> list = this.extProto_;
                                boolean z = true;
                                if ((this.bitField0_ & 1) == 0) {
                                    z = false;
                                }
                                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addAllMessages(iterable);
                            }
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
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

                        public Builder clearExtProto() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.clear();
                            }
                            return this;
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearValue() {
                            this.value_ = DataAsset.getDefaultInstance().getValue();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return AdcomProto.f24379x89a0a5f5;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public Any getExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessage(i);
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().getBuilder(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().getBuilderList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getExtProtoCount() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.size();
                            }
                            return repeatedFieldBuilderV3.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return Collections.unmodifiableList(this.extProto_);
                            }
                            return repeatedFieldBuilderV3.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public AnyOrBuilder getExtProtoOrBuilder(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                return repeatedFieldBuilderV3.getMessageOrBuilderList();
                            }
                            return Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType valueOf = NativeDataAssetType.valueOf(this.type_);
                            if (valueOf == null) {
                                return NativeDataAssetType.UNRECOGNIZED;
                            }
                            return valueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public String getValue() {
                            Object obj = this.value_;
                            if (!(obj instanceof String)) {
                                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                                this.value_ = stringUtf8;
                                return stringUtf8;
                            }
                            return (String) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public ByteString getValueBytes() {
                            Object obj = this.value_;
                            if (obj instanceof String) {
                                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                                this.value_ = copyFromUtf8;
                                return copyFromUtf8;
                            }
                            return (ByteString) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAssetOrBuilder
                        public boolean hasExt() {
                            if (this.extBuilder_ == null && this.ext_ == null) {
                                return false;
                            }
                            return true;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.f24380xe190773.ensureFieldAccessorsInitialized(DataAsset.class, Builder.class);
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

                        public Builder removeExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.remove(i);
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

                        public Builder setExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, any);
                            }
                            return this;
                        }

                        public Builder setLen(int i) {
                            this.len_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i) {
                            this.type_ = i;
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
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset build() {
                            DataAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset buildPartial() {
                            DataAsset dataAsset = new DataAsset(this);
                            dataAsset.value_ = this.value_;
                            dataAsset.len_ = this.len_;
                            dataAsset.type_ = this.type_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                dataAsset.ext_ = this.ext_;
                            } else {
                                dataAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                dataAsset.extProto_ = repeatedFieldBuilderV3.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAsset;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                        public DataAsset getDefaultInstanceForType() {
                            return DataAsset.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                            this.value_ = "";
                            this.len_ = 0;
                            this.type_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                            } else {
                                repeatedFieldBuilderV3.clear();
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

                        public Builder addExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(i, any);
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
                            if (message instanceof DataAsset) {
                                return mergeFrom((DataAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, builder.build());
                            }
                            return this;
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(DataAsset dataAsset) {
                            if (dataAsset == DataAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!dataAsset.getValue().isEmpty()) {
                                this.value_ = dataAsset.value_;
                                onChanged();
                            }
                            if (dataAsset.getLen() != 0) {
                                setLen(dataAsset.getLen());
                            }
                            if (dataAsset.type_ != 0) {
                                setTypeValue(dataAsset.getTypeValue());
                            }
                            if (dataAsset.hasExt()) {
                                mergeExt(dataAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(dataAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((GeneratedMessageV3) dataAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
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
                        public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAsset.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.DataAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(DataAsset dataAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAsset);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    private DataAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static DataAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public DataAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.value_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static DataAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static DataAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static DataAsset parseFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private DataAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                                this.value_ = codedInputStream.readStringRequireUtf8();
                                            } else if (readTag == 16) {
                                                this.len_ = codedInputStream.readUInt32();
                                            } else if (readTag == 24) {
                                                this.type_ = codedInputStream.readEnum();
                                            } else if (readTag == 34) {
                                                if (!(z2 & true)) {
                                                    this.extProto_ = new ArrayList();
                                                    z2 |= true;
                                                }
                                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                            } else if (readTag != 42) {
                                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                                }
                                            } else {
                                                Struct struct = this.ext_;
                                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                                this.ext_ = struct2;
                                                if (builder != null) {
                                                    builder.mergeFrom(struct2);
                                                    this.ext_ = builder.buildPartial();
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
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                            }
                        }
                    }

                    public static DataAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static DataAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAssetOrBuilder */
                /* loaded from: classes3.dex */
                public interface DataAssetOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    String getValue();

                    ByteString getValueBytes();

                    boolean hasExt();
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset */
                /* loaded from: classes3.dex */
                public static final class ImageAsset extends GeneratedMessageV3 implements ImageAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 6;
                    public static final int EXT_PROTO_FIELD_NUMBER = 5;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int TYPE_FIELD_NUMBER = 4;
                    public static final int URL_FIELD_NUMBER = 1;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;

                    /* renamed from: h_ */
                    private int f24372h_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object url_;

                    /* renamed from: w_ */
                    private int f24373w_;
                    private static final ImageAsset DEFAULT_INSTANCE = new ImageAsset();
                    private static final Parser<ImageAsset> PARSER = new AbstractParser<ImageAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.1
                        @Override // com.explorestack.protobuf.Parser
                        public ImageAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new ImageAsset(codedInputStream, extensionRegistryLite);
                        }
                    };

                    public static ImageAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.f24381xe346a32c;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static Parser<ImageAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAsset)) {
                            return super.equals(obj);
                        }
                        ImageAsset imageAsset = (ImageAsset) obj;
                        if (!getUrl().equals(imageAsset.getUrl()) || getW() != imageAsset.getW() || getH() != imageAsset.getH() || this.type_ != imageAsset.type_ || hasExt() != imageAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(imageAsset.getExt())) && getExtProtoList().equals(imageAsset.getExtProtoList()) && this.unknownFields.equals(imageAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        if (struct == null) {
                            return Struct.getDefaultInstance();
                        }
                        return struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public StructOrBuilder getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getH() {
                        return this.f24372h_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Parser<ImageAsset> getParserForType() {
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
                        int i3 = this.f24373w_;
                        if (i3 != 0) {
                            i += CodedOutputStream.computeUInt32Size(2, i3);
                        }
                        int i4 = this.f24372h_;
                        if (i4 != 0) {
                            i += CodedOutputStream.computeUInt32Size(3, i4);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            i += CodedOutputStream.computeEnumSize(4, this.type_);
                        }
                        for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                            i += CodedOutputStream.computeMessageSize(5, this.extProto_.get(i5));
                        }
                        if (this.ext_ != null) {
                            i += CodedOutputStream.computeMessageSize(6, getExt());
                        }
                        int serializedSize = i + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType valueOf = NativeImageAssetType.valueOf(this.type_);
                        if (valueOf == null) {
                            return NativeImageAssetType.UNRECOGNIZED;
                        }
                        return valueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.url_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getW() {
                        return this.f24373w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public boolean hasExt() {
                        if (this.ext_ != null) {
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
                        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getW()) * 37) + 3) * 53) + getH()) * 37) + 4) * 53) + this.type_;
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 6) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 5) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.f24382x6f25ddaa.ensureFieldAccessorsInitialized(ImageAsset.class, Builder.class);
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
                        return new ImageAsset();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getUrlBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
                        }
                        int i = this.f24373w_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(2, i);
                        }
                        int i2 = this.f24372h_;
                        if (i2 != 0) {
                            codedOutputStream.writeUInt32(3, i2);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.writeEnum(4, this.type_);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            codedOutputStream.writeMessage(5, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(6, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset$Builder */
                    /* loaded from: classes3.dex */
                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImageAssetOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;

                        /* renamed from: h_ */
                        private int f24374h_;
                        private int type_;
                        private Object url_;

                        /* renamed from: w_ */
                        private int f24375w_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.f24381xe346a32c;
                        }

                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                List<Any> list = this.extProto_;
                                boolean z = true;
                                if ((this.bitField0_ & 1) == 0) {
                                    z = false;
                                }
                                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addAllMessages(iterable);
                            }
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
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

                        public Builder clearExtProto() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.clear();
                            }
                            return this;
                        }

                        public Builder clearH() {
                            this.f24374h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearUrl() {
                            this.url_ = ImageAsset.getDefaultInstance().getUrl();
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.f24375w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return AdcomProto.f24381xe346a32c;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public Any getExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessage(i);
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().getBuilder(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().getBuilderList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getExtProtoCount() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.size();
                            }
                            return repeatedFieldBuilderV3.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return Collections.unmodifiableList(this.extProto_);
                            }
                            return repeatedFieldBuilderV3.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public AnyOrBuilder getExtProtoOrBuilder(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                return repeatedFieldBuilderV3.getMessageOrBuilderList();
                            }
                            return Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getH() {
                            return this.f24374h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType valueOf = NativeImageAssetType.valueOf(this.type_);
                            if (valueOf == null) {
                                return NativeImageAssetType.UNRECOGNIZED;
                            }
                            return valueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public String getUrl() {
                            Object obj = this.url_;
                            if (!(obj instanceof String)) {
                                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                                this.url_ = stringUtf8;
                                return stringUtf8;
                            }
                            return (String) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public ByteString getUrlBytes() {
                            Object obj = this.url_;
                            if (obj instanceof String) {
                                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                                this.url_ = copyFromUtf8;
                                return copyFromUtf8;
                            }
                            return (ByteString) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getW() {
                            return this.f24375w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public boolean hasExt() {
                            if (this.extBuilder_ == null && this.ext_ == null) {
                                return false;
                            }
                            return true;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.f24382x6f25ddaa.ensureFieldAccessorsInitialized(ImageAsset.class, Builder.class);
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

                        public Builder removeExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.remove(i);
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

                        public Builder setExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, any);
                            }
                            return this;
                        }

                        public Builder setH(int i) {
                            this.f24374h_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            nativeImageAssetType.getClass();
                            this.type_ = nativeImageAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i) {
                            this.type_ = i;
                            onChanged();
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

                        public Builder setW(int i) {
                            this.f24375w_ = i;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset build() {
                            ImageAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset buildPartial() {
                            ImageAsset imageAsset = new ImageAsset(this);
                            imageAsset.url_ = this.url_;
                            imageAsset.f24373w_ = this.f24375w_;
                            imageAsset.f24372h_ = this.f24374h_;
                            imageAsset.type_ = this.type_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                imageAsset.ext_ = this.ext_;
                            } else {
                                imageAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                imageAsset.extProto_ = repeatedFieldBuilderV3.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                imageAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAsset;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                        public ImageAsset getDefaultInstanceForType() {
                            return ImageAsset.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                            this.f24375w_ = 0;
                            this.f24374h_ = 0;
                            this.type_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                            } else {
                                repeatedFieldBuilderV3.clear();
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

                        public Builder addExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(i, any);
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
                            if (message instanceof ImageAsset) {
                                return mergeFrom((ImageAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, builder.build());
                            }
                            return this;
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAsset imageAsset) {
                            if (imageAsset == ImageAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!imageAsset.getUrl().isEmpty()) {
                                this.url_ = imageAsset.url_;
                                onChanged();
                            }
                            if (imageAsset.getW() != 0) {
                                setW(imageAsset.getW());
                            }
                            if (imageAsset.getH() != 0) {
                                setH(imageAsset.getH());
                            }
                            if (imageAsset.type_ != 0) {
                                setTypeValue(imageAsset.getTypeValue());
                            }
                            if (imageAsset.hasExt()) {
                                mergeExt(imageAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(imageAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((GeneratedMessageV3) imageAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
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
                        public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAsset.access$7300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.ImageAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(ImageAsset imageAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAsset);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    private ImageAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static ImageAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public ImageAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.url_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static ImageAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static ImageAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private ImageAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                                this.url_ = codedInputStream.readStringRequireUtf8();
                                            } else if (readTag == 16) {
                                                this.f24373w_ = codedInputStream.readUInt32();
                                            } else if (readTag == 24) {
                                                this.f24372h_ = codedInputStream.readUInt32();
                                            } else if (readTag == 32) {
                                                this.type_ = codedInputStream.readEnum();
                                            } else if (readTag == 42) {
                                                if (!(z2 & true)) {
                                                    this.extProto_ = new ArrayList();
                                                    z2 |= true;
                                                }
                                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                            } else if (readTag != 50) {
                                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                                }
                                            } else {
                                                Struct struct = this.ext_;
                                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                                this.ext_ = struct2;
                                                if (builder != null) {
                                                    builder.mergeFrom(struct2);
                                                    this.ext_ = builder.buildPartial();
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
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                            }
                        }
                    }

                    public static ImageAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static ImageAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAssetOrBuilder */
                /* loaded from: classes3.dex */
                public interface ImageAssetOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getH();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    String getUrl();

                    ByteString getUrlBytes();

                    int getW();

                    boolean hasExt();
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset */
                /* loaded from: classes3.dex */
                public static final class TitleAsset extends GeneratedMessageV3 implements TitleAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TEXT_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private volatile Object text_;
                    private static final TitleAsset DEFAULT_INSTANCE = new TitleAsset();
                    private static final Parser<TitleAsset> PARSER = new AbstractParser<TitleAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.1
                        @Override // com.explorestack.protobuf.Parser
                        public TitleAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new TitleAsset(codedInputStream, extensionRegistryLite);
                        }
                    };

                    public static TitleAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.f24383xe9d08229;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static Parser<TitleAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAsset)) {
                            return super.equals(obj);
                        }
                        TitleAsset titleAsset = (TitleAsset) obj;
                        if (!getText().equals(titleAsset.getText()) || getLen() != titleAsset.getLen() || hasExt() != titleAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(titleAsset.getExt())) && getExtProtoList().equals(titleAsset.getExtProtoList()) && this.unknownFields.equals(titleAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        if (struct == null) {
                            return Struct.getDefaultInstance();
                        }
                        return struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public StructOrBuilder getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getLen() {
                        return this.len_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Parser<TitleAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i;
                        int i2 = this.memoizedSize;
                        if (i2 != -1) {
                            return i2;
                        }
                        if (!getTextBytes().isEmpty()) {
                            i = GeneratedMessageV3.computeStringSize(1, this.text_) + 0;
                        } else {
                            i = 0;
                        }
                        int i3 = this.len_;
                        if (i3 != 0) {
                            i += CodedOutputStream.computeUInt32Size(2, i3);
                        }
                        for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                            i += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i4));
                        }
                        if (this.ext_ != null) {
                            i += CodedOutputStream.computeMessageSize(4, getExt());
                        }
                        int serializedSize = i + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public String getText() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.text_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public ByteString getTextBytes() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.text_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public boolean hasExt() {
                        if (this.ext_ != null) {
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
                        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 37) + 2) * 53) + getLen();
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.f24384xbc936fa7.ensureFieldAccessorsInitialized(TitleAsset.class, Builder.class);
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
                        return new TitleAsset();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getTextBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.text_);
                        }
                        int i = this.len_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(2, i);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            codedOutputStream.writeMessage(3, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset$Builder */
                    /* loaded from: classes3.dex */
                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TitleAssetOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private Object text_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.f24383xe9d08229;
                        }

                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                List<Any> list = this.extProto_;
                                boolean z = true;
                                if ((this.bitField0_ & 1) == 0) {
                                    z = false;
                                }
                                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addAllMessages(iterable);
                            }
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
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

                        public Builder clearExtProto() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.clear();
                            }
                            return this;
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearText() {
                            this.text_ = TitleAsset.getDefaultInstance().getText();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return AdcomProto.f24383xe9d08229;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public Any getExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessage(i);
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().getBuilder(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().getBuilderList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getExtProtoCount() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.size();
                            }
                            return repeatedFieldBuilderV3.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return Collections.unmodifiableList(this.extProto_);
                            }
                            return repeatedFieldBuilderV3.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public AnyOrBuilder getExtProtoOrBuilder(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                return repeatedFieldBuilderV3.getMessageOrBuilderList();
                            }
                            return Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public String getText() {
                            Object obj = this.text_;
                            if (!(obj instanceof String)) {
                                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                                this.text_ = stringUtf8;
                                return stringUtf8;
                            }
                            return (String) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public ByteString getTextBytes() {
                            Object obj = this.text_;
                            if (obj instanceof String) {
                                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                                this.text_ = copyFromUtf8;
                                return copyFromUtf8;
                            }
                            return (ByteString) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public boolean hasExt() {
                            if (this.extBuilder_ == null && this.ext_ == null) {
                                return false;
                            }
                            return true;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.f24384xbc936fa7.ensureFieldAccessorsInitialized(TitleAsset.class, Builder.class);
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

                        public Builder removeExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.remove(i);
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

                        public Builder setExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, any);
                            }
                            return this;
                        }

                        public Builder setLen(int i) {
                            this.len_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder setText(String str) {
                            str.getClass();
                            this.text_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setTextBytes(ByteString byteString) {
                            byteString.getClass();
                            AbstractMessageLite.checkByteStringIsUtf8(byteString);
                            this.text_ = byteString;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.text_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset build() {
                            TitleAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset buildPartial() {
                            TitleAsset titleAsset = new TitleAsset(this);
                            titleAsset.text_ = this.text_;
                            titleAsset.len_ = this.len_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                titleAsset.ext_ = this.ext_;
                            } else {
                                titleAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                titleAsset.extProto_ = repeatedFieldBuilderV3.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAsset;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                        public TitleAsset getDefaultInstanceForType() {
                            return TitleAsset.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                            this.text_ = "";
                            this.len_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                            } else {
                                repeatedFieldBuilderV3.clear();
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

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.text_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder addExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(i, any);
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
                            if (message instanceof TitleAsset) {
                                return mergeFrom((TitleAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, builder.build());
                            }
                            return this;
                        }

                        public Builder mergeFrom(TitleAsset titleAsset) {
                            if (titleAsset == TitleAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!titleAsset.getText().isEmpty()) {
                                this.text_ = titleAsset.text_;
                                onChanged();
                            }
                            if (titleAsset.getLen() != 0) {
                                setLen(titleAsset.getLen());
                            }
                            if (titleAsset.hasExt()) {
                                mergeExt(titleAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(titleAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((GeneratedMessageV3) titleAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
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
                        public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAsset.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.TitleAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(TitleAsset titleAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAsset);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    private TitleAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public TitleAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.text_ = "";
                        this.extProto_ = Collections.emptyList();
                    }

                    public static TitleAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static TitleAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private TitleAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.text_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 16) {
                                            this.len_ = codedInputStream.readUInt32();
                                        } else if (readTag == 26) {
                                            if (!(z2 & true)) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag != 34) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
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
                                if (z2 & true) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                            }
                        }
                    }

                    public static TitleAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static TitleAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAssetOrBuilder */
                /* loaded from: classes3.dex */
                public interface TitleAssetOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getLen();

                    String getText();

                    ByteString getTextBytes();

                    boolean hasExt();
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset */
                /* loaded from: classes3.dex */
                public static final class VideoAsset extends GeneratedMessageV3 implements VideoAssetOrBuilder {
                    public static final int ADM_FIELD_NUMBER = 1;
                    public static final int CURL_FIELD_NUMBER = 2;
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private volatile Object adm_;
                    private volatile Object curl_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private byte memoizedIsInitialized;
                    private static final VideoAsset DEFAULT_INSTANCE = new VideoAsset();
                    private static final Parser<VideoAsset> PARSER = new AbstractParser<VideoAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.1
                        @Override // com.explorestack.protobuf.Parser
                        public VideoAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new VideoAsset(codedInputStream, extensionRegistryLite);
                        }
                    };

                    public static VideoAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.f24385xef01ce4c;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static Parser<VideoAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof VideoAsset)) {
                            return super.equals(obj);
                        }
                        VideoAsset videoAsset = (VideoAsset) obj;
                        if (!getAdm().equals(videoAsset.getAdm()) || !getCurl().equals(videoAsset.getCurl()) || hasExt() != videoAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(videoAsset.getExt())) && getExtProtoList().equals(videoAsset.getExtProtoList()) && this.unknownFields.equals(videoAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getAdm() {
                        Object obj = this.adm_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adm_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getAdmBytes() {
                        Object obj = this.adm_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.adm_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getCurl() {
                        Object obj = this.curl_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.curl_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getCurlBytes() {
                        Object obj = this.curl_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.curl_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        if (struct == null) {
                            return Struct.getDefaultInstance();
                        }
                        return struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public StructOrBuilder getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Any getExtProto(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        return this.extProto_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Parser<VideoAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i;
                        int i2 = this.memoizedSize;
                        if (i2 != -1) {
                            return i2;
                        }
                        if (!getAdmBytes().isEmpty()) {
                            i = GeneratedMessageV3.computeStringSize(1, this.adm_) + 0;
                        } else {
                            i = 0;
                        }
                        if (!getCurlBytes().isEmpty()) {
                            i += GeneratedMessageV3.computeStringSize(2, this.curl_);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            i += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            i += CodedOutputStream.computeMessageSize(4, getExt());
                        }
                        int serializedSize = i + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public boolean hasExt() {
                        if (this.ext_ != null) {
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
                        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdm().hashCode()) * 37) + 2) * 53) + getCurl().hashCode();
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.f24386x9713e8ca.ensureFieldAccessorsInitialized(VideoAsset.class, Builder.class);
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
                        return new VideoAsset();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getAdmBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.adm_);
                        }
                        if (!getCurlBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 2, this.curl_);
                        }
                        for (int i = 0; i < this.extProto_.size(); i++) {
                            codedOutputStream.writeMessage(3, this.extProto_.get(i));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset$Builder */
                    /* loaded from: classes3.dex */
                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VideoAssetOrBuilder {
                        private Object adm_;
                        private int bitField0_;
                        private Object curl_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.f24385xef01ce4c;
                        }

                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                List<Any> list = this.extProto_;
                                boolean z = true;
                                if ((this.bitField0_ & 1) == 0) {
                                    z = false;
                                }
                                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addAllMessages(iterable);
                            }
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                        }

                        public Builder clearAdm() {
                            this.adm_ = VideoAsset.getDefaultInstance().getAdm();
                            onChanged();
                            return this;
                        }

                        public Builder clearCurl() {
                            this.curl_ = VideoAsset.getDefaultInstance().getCurl();
                            onChanged();
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

                        public Builder clearExtProto() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.clear();
                            }
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getAdm() {
                            Object obj = this.adm_;
                            if (!(obj instanceof String)) {
                                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                                this.adm_ = stringUtf8;
                                return stringUtf8;
                            }
                            return (String) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getAdmBytes() {
                            Object obj = this.adm_;
                            if (obj instanceof String) {
                                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                                this.adm_ = copyFromUtf8;
                                return copyFromUtf8;
                            }
                            return (ByteString) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getCurl() {
                            Object obj = this.curl_;
                            if (!(obj instanceof String)) {
                                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                                this.curl_ = stringUtf8;
                                return stringUtf8;
                            }
                            return (String) obj;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getCurlBytes() {
                            Object obj = this.curl_;
                            if (obj instanceof String) {
                                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                                this.curl_ = copyFromUtf8;
                                return copyFromUtf8;
                            }
                            return (ByteString) obj;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return AdcomProto.f24385xef01ce4c;
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public Any getExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessage(i);
                        }

                        public Any.Builder getExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().getBuilder(i);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().getBuilderList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public int getExtProtoCount() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.size();
                            }
                            return repeatedFieldBuilderV3.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return Collections.unmodifiableList(this.extProto_);
                            }
                            return repeatedFieldBuilderV3.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public AnyOrBuilder getExtProtoOrBuilder(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                return this.extProto_.get(i);
                            }
                            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                return repeatedFieldBuilderV3.getMessageOrBuilderList();
                            }
                            return Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public boolean hasExt() {
                            if (this.extBuilder_ == null && this.ext_ == null) {
                                return false;
                            }
                            return true;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.f24386x9713e8ca.ensureFieldAccessorsInitialized(VideoAsset.class, Builder.class);
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

                        public Builder removeExtProto(int i) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.remove(i);
                            }
                            return this;
                        }

                        public Builder setAdm(String str) {
                            str.getClass();
                            this.adm_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setAdmBytes(ByteString byteString) {
                            byteString.getClass();
                            AbstractMessageLite.checkByteStringIsUtf8(byteString);
                            this.adm_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setCurl(String str) {
                            str.getClass();
                            this.curl_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setCurlBytes(ByteString byteString) {
                            byteString.getClass();
                            AbstractMessageLite.checkByteStringIsUtf8(byteString);
                            this.curl_ = byteString;
                            onChanged();
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

                        public Builder setExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, any);
                            }
                            return this;
                        }

                        private Builder() {
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset build() {
                            VideoAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset buildPartial() {
                            VideoAsset videoAsset = new VideoAsset(this);
                            videoAsset.adm_ = this.adm_;
                            videoAsset.curl_ = this.curl_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                videoAsset.ext_ = this.ext_;
                            } else {
                                videoAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 != null) {
                                videoAsset.extProto_ = repeatedFieldBuilderV3.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                videoAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return videoAsset;
                        }

                        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                        public VideoAsset getDefaultInstanceForType() {
                            return VideoAsset.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i) {
                            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                            this.adm_ = "";
                            this.curl_ = "";
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                            } else {
                                repeatedFieldBuilderV3.clear();
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

                        public Builder addExtProto(int i, Any any) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, any);
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(i, any);
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
                            if (message instanceof VideoAsset) {
                                return mergeFrom((VideoAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i, builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.setMessage(i, builder.build());
                            }
                            return this;
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(VideoAsset videoAsset) {
                            if (videoAsset == VideoAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!videoAsset.getAdm().isEmpty()) {
                                this.adm_ = videoAsset.adm_;
                                onChanged();
                            }
                            if (!videoAsset.getCurl().isEmpty()) {
                                this.curl_ = videoAsset.curl_;
                                onChanged();
                            }
                            if (videoAsset.hasExt()) {
                                mergeExt(videoAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!videoAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = videoAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(videoAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!videoAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(videoAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = videoAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((GeneratedMessageV3) videoAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                repeatedFieldBuilderV3.addMessage(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i, Any.Builder builder) {
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i, builder.build());
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
                        public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAsset.access$8600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.VideoAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(VideoAsset videoAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoAsset);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    private VideoAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static VideoAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public VideoAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static VideoAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private VideoAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.adm_ = "";
                        this.curl_ = "";
                        this.extProto_ = Collections.emptyList();
                    }

                    public static VideoAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.GeneratedMessageV3
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static VideoAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private VideoAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.adm_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 18) {
                                            this.curl_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 26) {
                                            if (!(z2 & true)) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag != 34) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
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
                                if (z2 & true) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                            }
                        }
                    }

                    public static VideoAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static VideoAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAssetOrBuilder */
                /* loaded from: classes3.dex */
                public interface VideoAssetOrBuilder extends MessageOrBuilder {
                    String getAdm();

                    ByteString getAdmBytes();

                    String getCurl();

                    ByteString getCurlBytes();

                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    boolean hasExt();
                }

                public static Asset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.f24387xaadcb19c;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Asset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Parser<Asset> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Asset)) {
                        return super.equals(obj);
                    }
                    Asset asset = (Asset) obj;
                    if (getId() != asset.getId() || getReq() != asset.getReq() || hasTitle() != asset.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(asset.getTitle())) || hasImage() != asset.hasImage()) {
                        return false;
                    }
                    if ((hasImage() && !getImage().equals(asset.getImage())) || hasVideo() != asset.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(asset.getVideo())) || hasData() != asset.hasData()) {
                        return false;
                    }
                    if ((hasData() && !getData().equals(asset.getData())) || hasLink() != asset.hasLink()) {
                        return false;
                    }
                    if ((hasLink() && !getLink().equals(asset.getLink())) || hasExt() != asset.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(asset.getExt())) && getExtProtoList().equals(asset.getExtProtoList()) && this.unknownFields.equals(asset.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public DataAsset getData() {
                    DataAsset dataAsset = this.data_;
                    if (dataAsset == null) {
                        return DataAsset.getDefaultInstance();
                    }
                    return dataAsset;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public DataAssetOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    if (struct == null) {
                        return Struct.getDefaultInstance();
                    }
                    return struct;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public StructOrBuilder getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public Any getExtProto(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public ImageAsset getImage() {
                    ImageAsset imageAsset = this.image_;
                    if (imageAsset == null) {
                        return ImageAsset.getDefaultInstance();
                    }
                    return imageAsset;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public ImageAssetOrBuilder getImageOrBuilder() {
                    return getImage();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public LinkAsset getLink() {
                    LinkAsset linkAsset = this.link_;
                    if (linkAsset == null) {
                        return LinkAsset.getDefaultInstance();
                    }
                    return linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    return getLink();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Parser<Asset> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean getReq() {
                    return this.req_;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i;
                    int i2 = this.memoizedSize;
                    if (i2 != -1) {
                        return i2;
                    }
                    int i3 = this.id_;
                    if (i3 != 0) {
                        i = CodedOutputStream.computeUInt32Size(1, i3) + 0;
                    } else {
                        i = 0;
                    }
                    boolean z = this.req_;
                    if (z) {
                        i += CodedOutputStream.computeBoolSize(2, z);
                    }
                    if (this.title_ != null) {
                        i += CodedOutputStream.computeMessageSize(3, getTitle());
                    }
                    if (this.image_ != null) {
                        i += CodedOutputStream.computeMessageSize(4, getImage());
                    }
                    if (this.video_ != null) {
                        i += CodedOutputStream.computeMessageSize(5, getVideo());
                    }
                    if (this.data_ != null) {
                        i += CodedOutputStream.computeMessageSize(6, getData());
                    }
                    if (this.link_ != null) {
                        i += CodedOutputStream.computeMessageSize(7, getLink());
                    }
                    for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                        i += CodedOutputStream.computeMessageSize(8, this.extProto_.get(i4));
                    }
                    if (this.ext_ != null) {
                        i += CodedOutputStream.computeMessageSize(9, getExt());
                    }
                    int serializedSize = i + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public TitleAsset getTitle() {
                    TitleAsset titleAsset = this.title_;
                    if (titleAsset == null) {
                        return TitleAsset.getDefaultInstance();
                    }
                    return titleAsset;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public TitleAssetOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public VideoAsset getVideo() {
                    VideoAsset videoAsset = this.video_;
                    if (videoAsset == null) {
                        return VideoAsset.getDefaultInstance();
                    }
                    return videoAsset;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public VideoAssetOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean hasData() {
                    if (this.data_ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean hasExt() {
                    if (this.ext_ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean hasImage() {
                    if (this.image_ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean hasLink() {
                    if (this.link_ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean hasTitle() {
                    if (this.title_ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                public boolean hasVideo() {
                    if (this.video_ != null) {
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
                    int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + Internal.hashBoolean(getReq());
                    if (hasTitle()) {
                        hashCode = (((hashCode * 37) + 3) * 53) + getTitle().hashCode();
                    }
                    if (hasImage()) {
                        hashCode = (((hashCode * 37) + 4) * 53) + getImage().hashCode();
                    }
                    if (hasVideo()) {
                        hashCode = (((hashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        hashCode = (((hashCode * 37) + 6) * 53) + getData().hashCode();
                    }
                    if (hasLink()) {
                        hashCode = (((hashCode * 37) + 7) * 53) + getLink().hashCode();
                    }
                    if (hasExt()) {
                        hashCode = (((hashCode * 37) + 9) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        hashCode = (((hashCode * 37) + 8) * 53) + getExtProtoList().hashCode();
                    }
                    int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.f24388xdcbe7c1a.ensureFieldAccessorsInitialized(Asset.class, Builder.class);
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
                    return new Asset();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i = this.id_;
                    if (i != 0) {
                        codedOutputStream.writeUInt32(1, i);
                    }
                    boolean z = this.req_;
                    if (z) {
                        codedOutputStream.writeBool(2, z);
                    }
                    if (this.title_ != null) {
                        codedOutputStream.writeMessage(3, getTitle());
                    }
                    if (this.image_ != null) {
                        codedOutputStream.writeMessage(4, getImage());
                    }
                    if (this.video_ != null) {
                        codedOutputStream.writeMessage(5, getVideo());
                    }
                    if (this.data_ != null) {
                        codedOutputStream.writeMessage(6, getData());
                    }
                    if (this.link_ != null) {
                        codedOutputStream.writeMessage(7, getLink());
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        codedOutputStream.writeMessage(8, this.extProto_.get(i2));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.writeMessage(9, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$Builder */
                /* loaded from: classes3.dex */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetOrBuilder {
                    private int bitField0_;
                    private SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> dataBuilder_;
                    private DataAsset data_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> imageBuilder_;
                    private ImageAsset image_;
                    private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> linkBuilder_;
                    private LinkAsset link_;
                    private boolean req_;
                    private SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> titleBuilder_;
                    private TitleAsset title_;
                    private SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> videoBuilder_;
                    private VideoAsset video_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new SingleFieldBuilderV3<>(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.f24387xaadcb19c;
                    }

                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            List<Any> list = this.extProto_;
                            boolean z = true;
                            if ((this.bitField0_ & 1) == 0) {
                                z = false;
                            }
                            this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> getImageFieldBuilder() {
                        if (this.imageBuilder_ == null) {
                            this.imageBuilder_ = new SingleFieldBuilderV3<>(getImage(), getParentForChildren(), isClean());
                            this.image_ = null;
                        }
                        return this.imageBuilder_;
                    }

                    private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> getLinkFieldBuilder() {
                        if (this.linkBuilder_ == null) {
                            this.linkBuilder_ = new SingleFieldBuilderV3<>(getLink(), getParentForChildren(), isClean());
                            this.link_ = null;
                        }
                        return this.linkBuilder_;
                    }

                    private SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new SingleFieldBuilderV3<>(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    private SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new SingleFieldBuilderV3<>(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                        }
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(any);
                        }
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                    }

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
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

                    public Builder clearExtProto() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearImage() {
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                            onChanged();
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearLink() {
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                            onChanged();
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public DataAsset getData() {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            DataAsset dataAsset = this.data_;
                            if (dataAsset == null) {
                                return DataAsset.getDefaultInstance();
                            }
                            return dataAsset;
                        }
                        return singleFieldBuilderV3.getMessage();
                    }

                    public DataAsset.Builder getDataBuilder() {
                        onChanged();
                        return getDataFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public DataAssetOrBuilder getDataOrBuilder() {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        DataAsset dataAsset = this.data_;
                        if (dataAsset == null) {
                            return DataAsset.getDefaultInstance();
                        }
                        return dataAsset;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return AdcomProto.f24387xaadcb19c;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public Any getExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessage(i);
                    }

                    public Any.Builder getExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().getBuilder(i);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().getBuilderList();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public int getExtProtoCount() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.size();
                        }
                        return repeatedFieldBuilderV3.getCount();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public List<Any> getExtProtoList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return Collections.unmodifiableList(this.extProto_);
                        }
                        return repeatedFieldBuilderV3.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            return repeatedFieldBuilderV3.getMessageOrBuilderList();
                        }
                        return Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public ImageAsset getImage() {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            ImageAsset imageAsset = this.image_;
                            if (imageAsset == null) {
                                return ImageAsset.getDefaultInstance();
                            }
                            return imageAsset;
                        }
                        return singleFieldBuilderV3.getMessage();
                    }

                    public ImageAsset.Builder getImageBuilder() {
                        onChanged();
                        return getImageFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public ImageAssetOrBuilder getImageOrBuilder() {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        ImageAsset imageAsset = this.image_;
                        if (imageAsset == null) {
                            return ImageAsset.getDefaultInstance();
                        }
                        return imageAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public LinkAsset getLink() {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            LinkAsset linkAsset = this.link_;
                            if (linkAsset == null) {
                                return LinkAsset.getDefaultInstance();
                            }
                            return linkAsset;
                        }
                        return singleFieldBuilderV3.getMessage();
                    }

                    public LinkAsset.Builder getLinkBuilder() {
                        onChanged();
                        return getLinkFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public LinkAssetOrBuilder getLinkOrBuilder() {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        LinkAsset linkAsset = this.link_;
                        if (linkAsset == null) {
                            return LinkAsset.getDefaultInstance();
                        }
                        return linkAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public TitleAsset getTitle() {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            TitleAsset titleAsset = this.title_;
                            if (titleAsset == null) {
                                return TitleAsset.getDefaultInstance();
                            }
                            return titleAsset;
                        }
                        return singleFieldBuilderV3.getMessage();
                    }

                    public TitleAsset.Builder getTitleBuilder() {
                        onChanged();
                        return getTitleFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public TitleAssetOrBuilder getTitleOrBuilder() {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        TitleAsset titleAsset = this.title_;
                        if (titleAsset == null) {
                            return TitleAsset.getDefaultInstance();
                        }
                        return titleAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public VideoAsset getVideo() {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            VideoAsset videoAsset = this.video_;
                            if (videoAsset == null) {
                                return VideoAsset.getDefaultInstance();
                            }
                            return videoAsset;
                        }
                        return singleFieldBuilderV3.getMessage();
                    }

                    public VideoAsset.Builder getVideoBuilder() {
                        onChanged();
                        return getVideoFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public VideoAssetOrBuilder getVideoOrBuilder() {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        VideoAsset videoAsset = this.video_;
                        if (videoAsset == null) {
                            return VideoAsset.getDefaultInstance();
                        }
                        return videoAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean hasData() {
                        if (this.dataBuilder_ == null && this.data_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean hasExt() {
                        if (this.extBuilder_ == null && this.ext_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean hasImage() {
                        if (this.imageBuilder_ == null && this.image_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean hasLink() {
                        if (this.linkBuilder_ == null && this.link_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean hasTitle() {
                        if (this.titleBuilder_ == null && this.title_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.AssetOrBuilder
                    public boolean hasVideo() {
                        if (this.videoBuilder_ == null && this.video_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.f24388xdcbe7c1a.ensureFieldAccessorsInitialized(Asset.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAsset dataAsset) {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            DataAsset dataAsset2 = this.data_;
                            if (dataAsset2 != null) {
                                this.data_ = DataAsset.newBuilder(dataAsset2).mergeFrom(dataAsset).buildPartial();
                            } else {
                                this.data_ = dataAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(dataAsset);
                        }
                        return this;
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

                    public Builder mergeImage(ImageAsset imageAsset) {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            ImageAsset imageAsset2 = this.image_;
                            if (imageAsset2 != null) {
                                this.image_ = ImageAsset.newBuilder(imageAsset2).mergeFrom(imageAsset).buildPartial();
                            } else {
                                this.image_ = imageAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(imageAsset);
                        }
                        return this;
                    }

                    public Builder mergeLink(LinkAsset linkAsset) {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            LinkAsset linkAsset2 = this.link_;
                            if (linkAsset2 != null) {
                                this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                            } else {
                                this.link_ = linkAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(linkAsset);
                        }
                        return this;
                    }

                    public Builder mergeTitle(TitleAsset titleAsset) {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            TitleAsset titleAsset2 = this.title_;
                            if (titleAsset2 != null) {
                                this.title_ = TitleAsset.newBuilder(titleAsset2).mergeFrom(titleAsset).buildPartial();
                            } else {
                                this.title_ = titleAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(titleAsset);
                        }
                        return this;
                    }

                    public Builder mergeVideo(VideoAsset videoAsset) {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            VideoAsset videoAsset2 = this.video_;
                            if (videoAsset2 != null) {
                                this.video_ = VideoAsset.newBuilder(videoAsset2).mergeFrom(videoAsset).buildPartial();
                            } else {
                                this.video_ = videoAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(videoAsset);
                        }
                        return this;
                    }

                    public Builder removeExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.remove(i);
                        }
                        return this;
                    }

                    public Builder setData(DataAsset dataAsset) {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            dataAsset.getClass();
                            this.data_ = dataAsset;
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(dataAsset);
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

                    public Builder setExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, any);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.setMessage(i, any);
                        }
                        return this;
                    }

                    public Builder setId(int i) {
                        this.id_ = i;
                        onChanged();
                        return this;
                    }

                    public Builder setImage(ImageAsset imageAsset) {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            imageAsset.getClass();
                            this.image_ = imageAsset;
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(imageAsset);
                        }
                        return this;
                    }

                    public Builder setLink(LinkAsset linkAsset) {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            linkAsset.getClass();
                            this.link_ = linkAsset;
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(linkAsset);
                        }
                        return this;
                    }

                    public Builder setReq(boolean z) {
                        this.req_ = z;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAsset titleAsset) {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            titleAsset.getClass();
                            this.title_ = titleAsset;
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(titleAsset);
                        }
                        return this;
                    }

                    public Builder setVideo(VideoAsset videoAsset) {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            videoAsset.getClass();
                            this.video_ = videoAsset;
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(videoAsset);
                        }
                        return this;
                    }

                    private Builder() {
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset build() {
                        Asset buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset buildPartial() {
                        Asset asset = new Asset(this);
                        asset.id_ = this.id_;
                        asset.req_ = this.req_;
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            asset.title_ = this.title_;
                        } else {
                            asset.title_ = singleFieldBuilderV3.build();
                        }
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV32 = this.imageBuilder_;
                        if (singleFieldBuilderV32 == null) {
                            asset.image_ = this.image_;
                        } else {
                            asset.image_ = singleFieldBuilderV32.build();
                        }
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV33 = this.videoBuilder_;
                        if (singleFieldBuilderV33 == null) {
                            asset.video_ = this.video_;
                        } else {
                            asset.video_ = singleFieldBuilderV33.build();
                        }
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV34 = this.dataBuilder_;
                        if (singleFieldBuilderV34 == null) {
                            asset.data_ = this.data_;
                        } else {
                            asset.data_ = singleFieldBuilderV34.build();
                        }
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV35 = this.linkBuilder_;
                        if (singleFieldBuilderV35 == null) {
                            asset.link_ = this.link_;
                        } else {
                            asset.link_ = singleFieldBuilderV35.build();
                        }
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV36 = this.extBuilder_;
                        if (singleFieldBuilderV36 == null) {
                            asset.ext_ = this.ext_;
                        } else {
                            asset.ext_ = singleFieldBuilderV36.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            asset.extProto_ = repeatedFieldBuilderV3.build();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            asset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return asset;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public Asset getDefaultInstanceForType() {
                        return Asset.getDefaultInstance();
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

                    public Any.Builder addExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    public Builder setData(DataAsset.Builder builder) {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.data_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
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

                    public Builder setImage(ImageAsset.Builder builder) {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.image_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder setLink(LinkAsset.Builder builder) {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.link_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder setTitle(TitleAsset.Builder builder) {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.title_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder setVideo(VideoAsset.Builder builder) {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.video_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, any);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(i, any);
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
                        if (message instanceof Asset) {
                            return mergeFrom((Asset) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder setExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.setMessage(i, builder.build());
                        }
                        return this;
                    }

                    public Builder mergeFrom(Asset asset) {
                        if (asset == Asset.getDefaultInstance()) {
                            return this;
                        }
                        if (asset.getId() != 0) {
                            setId(asset.getId());
                        }
                        if (asset.getReq()) {
                            setReq(asset.getReq());
                        }
                        if (asset.hasTitle()) {
                            mergeTitle(asset.getTitle());
                        }
                        if (asset.hasImage()) {
                            mergeImage(asset.getImage());
                        }
                        if (asset.hasVideo()) {
                            mergeVideo(asset.getVideo());
                        }
                        if (asset.hasData()) {
                            mergeData(asset.getData());
                        }
                        if (asset.hasLink()) {
                            mergeLink(asset.getLink());
                        }
                        if (asset.hasExt()) {
                            mergeExt(asset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!asset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = asset.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(asset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!asset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(asset.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = asset.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((GeneratedMessageV3) asset).unknownFields);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, builder.build());
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
                    public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.access$11900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Asset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$Builder");
                    }
                }

                public static Builder newBuilder(Asset asset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(asset);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                private Asset(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Asset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Asset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Asset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Asset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Asset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.emptyList();
                }

                public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static Asset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Asset parseFrom(InputStream inputStream) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private Asset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.id_ = codedInputStream.readUInt32();
                                    } else if (readTag != 16) {
                                        if (readTag == 26) {
                                            TitleAsset titleAsset = this.title_;
                                            TitleAsset.Builder builder = titleAsset != null ? titleAsset.toBuilder() : null;
                                            TitleAsset titleAsset2 = (TitleAsset) codedInputStream.readMessage(TitleAsset.parser(), extensionRegistryLite);
                                            this.title_ = titleAsset2;
                                            if (builder != null) {
                                                builder.mergeFrom(titleAsset2);
                                                this.title_ = builder.buildPartial();
                                            }
                                        } else if (readTag == 34) {
                                            ImageAsset imageAsset = this.image_;
                                            ImageAsset.Builder builder2 = imageAsset != null ? imageAsset.toBuilder() : null;
                                            ImageAsset imageAsset2 = (ImageAsset) codedInputStream.readMessage(ImageAsset.parser(), extensionRegistryLite);
                                            this.image_ = imageAsset2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(imageAsset2);
                                                this.image_ = builder2.buildPartial();
                                            }
                                        } else if (readTag == 42) {
                                            VideoAsset videoAsset = this.video_;
                                            VideoAsset.Builder builder3 = videoAsset != null ? videoAsset.toBuilder() : null;
                                            VideoAsset videoAsset2 = (VideoAsset) codedInputStream.readMessage(VideoAsset.parser(), extensionRegistryLite);
                                            this.video_ = videoAsset2;
                                            if (builder3 != null) {
                                                builder3.mergeFrom(videoAsset2);
                                                this.video_ = builder3.buildPartial();
                                            }
                                        } else if (readTag == 50) {
                                            DataAsset dataAsset = this.data_;
                                            DataAsset.Builder builder4 = dataAsset != null ? dataAsset.toBuilder() : null;
                                            DataAsset dataAsset2 = (DataAsset) codedInputStream.readMessage(DataAsset.parser(), extensionRegistryLite);
                                            this.data_ = dataAsset2;
                                            if (builder4 != null) {
                                                builder4.mergeFrom(dataAsset2);
                                                this.data_ = builder4.buildPartial();
                                            }
                                        } else if (readTag == 58) {
                                            LinkAsset linkAsset = this.link_;
                                            LinkAsset.Builder builder5 = linkAsset != null ? linkAsset.toBuilder() : null;
                                            LinkAsset linkAsset2 = (LinkAsset) codedInputStream.readMessage(LinkAsset.parser(), extensionRegistryLite);
                                            this.link_ = linkAsset2;
                                            if (builder5 != null) {
                                                builder5.mergeFrom(linkAsset2);
                                                this.link_ = builder5.buildPartial();
                                            }
                                        } else if (readTag == 66) {
                                            boolean z3 = (z2 ? 1 : 0) & true;
                                            z2 = z2;
                                            if (!z3) {
                                                this.extProto_ = new ArrayList();
                                                z2 = (z2 ? 1 : 0) | true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag != 74) {
                                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                            this.ext_ = struct2;
                                            if (builder6 != null) {
                                                builder6.mergeFrom(struct2);
                                                this.ext_ = builder6.buildPartial();
                                            }
                                        }
                                    } else {
                                        this.req_ = codedInputStream.readBool();
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
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                        }
                    }
                }

                public static Asset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Asset parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Asset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$AssetOrBuilder */
            /* loaded from: classes3.dex */
            public interface AssetOrBuilder extends MessageOrBuilder {
                Asset.DataAsset getData();

                Asset.DataAssetOrBuilder getDataOrBuilder();

                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                int getId();

                Asset.ImageAsset getImage();

                Asset.ImageAssetOrBuilder getImageOrBuilder();

                LinkAsset getLink();

                LinkAssetOrBuilder getLinkOrBuilder();

                boolean getReq();

                Asset.TitleAsset getTitle();

                Asset.TitleAssetOrBuilder getTitleOrBuilder();

                Asset.VideoAsset getVideo();

                Asset.VideoAssetOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImage();

                boolean hasLink();

                boolean hasTitle();

                boolean hasVideo();
            }

            /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset */
            /* loaded from: classes3.dex */
            public static final class LinkAsset extends GeneratedMessageV3 implements LinkAssetOrBuilder {
                public static final int EXT_FIELD_NUMBER = 5;
                public static final int EXT_PROTO_FIELD_NUMBER = 4;
                public static final int TRKR_FIELD_NUMBER = 3;
                public static final int URLFB_FIELD_NUMBER = 2;
                public static final int URL_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private byte memoizedIsInitialized;
                private LazyStringList trkr_;
                private volatile Object url_;
                private volatile Object urlfb_;
                private static final LinkAsset DEFAULT_INSTANCE = new LinkAsset();
                private static final Parser<LinkAsset> PARSER = new AbstractParser<LinkAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.1
                    @Override // com.explorestack.protobuf.Parser
                    public LinkAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new LinkAsset(codedInputStream, extensionRegistryLite);
                    }
                };

                /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset$Builder */
                /* loaded from: classes3.dex */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LinkAssetOrBuilder {
                    private int bitField0_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private LazyStringList trkr_;
                    private Object url_;
                    private Object urlfb_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
                        }
                    }

                    private void ensureTrkrIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.trkr_ = new LazyStringArrayList(this.trkr_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.f24389xad6b82b6;
                    }

                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                        boolean z;
                        if (this.extProtoBuilder_ == null) {
                            List<Any> list = this.extProto_;
                            if ((this.bitField0_ & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                        }
                        return this;
                    }

                    public Builder addAllTrkr(Iterable<String> iterable) {
                        ensureTrkrIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.trkr_);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(any);
                        }
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                    }

                    public Builder addTrkr(String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.add((LazyStringList) str);
                        onChanged();
                        return this;
                    }

                    public Builder addTrkrBytes(ByteString byteString) {
                        byteString.getClass();
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        ensureTrkrIsMutable();
                        this.trkr_.add(byteString);
                        onChanged();
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

                    public Builder clearExtProto() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -3;
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Builder clearTrkr() {
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearUrl() {
                        this.url_ = LinkAsset.getDefaultInstance().getUrl();
                        onChanged();
                        return this;
                    }

                    public Builder clearUrlfb() {
                        this.urlfb_ = LinkAsset.getDefaultInstance().getUrlfb();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return AdcomProto.f24389xad6b82b6;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public Any getExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessage(i);
                    }

                    public Any.Builder getExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().getBuilder(i);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().getBuilderList();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public int getExtProtoCount() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.size();
                        }
                        return repeatedFieldBuilderV3.getCount();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return Collections.unmodifiableList(this.extProto_);
                        }
                        return repeatedFieldBuilderV3.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            return repeatedFieldBuilderV3.getMessageOrBuilderList();
                        }
                        return Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public String getTrkr(int i) {
                        return this.trkr_.get(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getTrkrBytes(int i) {
                        return this.trkr_.getByteString(i);
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public int getTrkrCount() {
                        return this.trkr_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.url_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.url_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrlfb() {
                        Object obj = this.urlfb_;
                        if (!(obj instanceof String)) {
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.urlfb_ = stringUtf8;
                            return stringUtf8;
                        }
                        return (String) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlfbBytes() {
                        Object obj = this.urlfb_;
                        if (obj instanceof String) {
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.urlfb_ = copyFromUtf8;
                            return copyFromUtf8;
                        }
                        return (ByteString) obj;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public boolean hasExt() {
                        if (this.extBuilder_ == null && this.ext_ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.f24390x5edf9334.ensureFieldAccessorsInitialized(LinkAsset.class, Builder.class);
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

                    public Builder removeExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.remove(i);
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

                    public Builder setExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, any);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.setMessage(i, any);
                        }
                        return this;
                    }

                    public Builder setTrkr(int i, String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.set(i, (int) str);
                        onChanged();
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

                    public Builder setUrlfb(String str) {
                        str.getClass();
                        this.urlfb_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfbBytes(ByteString byteString) {
                        byteString.getClass();
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.urlfb_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                    public ProtocolStringList getTrkrList() {
                        return this.trkr_.getUnmodifiableView();
                    }

                    private Builder() {
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset build() {
                        LinkAsset buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset buildPartial() {
                        LinkAsset linkAsset = new LinkAsset(this);
                        linkAsset.url_ = this.url_;
                        linkAsset.urlfb_ = this.urlfb_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.trkr_ = this.trkr_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        linkAsset.trkr_ = this.trkr_;
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            linkAsset.ext_ = this.ext_;
                        } else {
                            linkAsset.ext_ = singleFieldBuilderV3.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            linkAsset.extProto_ = repeatedFieldBuilderV3.build();
                        } else {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            linkAsset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return linkAsset;
                    }

                    @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                    public LinkAsset getDefaultInstanceForType() {
                        return LinkAsset.getDefaultInstance();
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

                    public Any.Builder addExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                        this.urlfb_ = "";
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -2;
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -3;
                        } else {
                            repeatedFieldBuilderV3.clear();
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

                    public Builder addExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, any);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(i, any);
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
                        if (message instanceof LinkAsset) {
                            return mergeFrom((LinkAsset) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder setExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.setMessage(i, builder.build());
                        }
                        return this;
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(LinkAsset linkAsset) {
                        if (linkAsset == LinkAsset.getDefaultInstance()) {
                            return this;
                        }
                        if (!linkAsset.getUrl().isEmpty()) {
                            this.url_ = linkAsset.url_;
                            onChanged();
                        }
                        if (!linkAsset.getUrlfb().isEmpty()) {
                            this.urlfb_ = linkAsset.urlfb_;
                            onChanged();
                        }
                        if (!linkAsset.trkr_.isEmpty()) {
                            if (this.trkr_.isEmpty()) {
                                this.trkr_ = linkAsset.trkr_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureTrkrIsMutable();
                                this.trkr_.addAll(linkAsset.trkr_);
                            }
                            onChanged();
                        }
                        if (linkAsset.hasExt()) {
                            mergeExt(linkAsset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!linkAsset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = linkAsset.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(linkAsset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!linkAsset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(linkAsset.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = linkAsset.extProto_;
                                this.bitField0_ &= -3;
                                this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((GeneratedMessageV3) linkAsset).unknownFields);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, builder.build());
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
                    public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAsset.access$4300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAsset) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset$Builder");
                    }
                }

                public static LinkAsset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.f24389xad6b82b6;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Parser<LinkAsset> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LinkAsset)) {
                        return super.equals(obj);
                    }
                    LinkAsset linkAsset = (LinkAsset) obj;
                    if (!getUrl().equals(linkAsset.getUrl()) || !getUrlfb().equals(linkAsset.getUrlfb()) || !getTrkrList().equals(linkAsset.getTrkrList()) || hasExt() != linkAsset.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(linkAsset.getExt())) && getExtProtoList().equals(linkAsset.getExtProtoList()) && this.unknownFields.equals(linkAsset.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    if (struct == null) {
                        return Struct.getDefaultInstance();
                    }
                    return struct;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public StructOrBuilder getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public Any getExtProto(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    return this.extProto_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Parser<LinkAsset> getParserForType() {
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
                    if (!getUrlfbBytes().isEmpty()) {
                        i += GeneratedMessageV3.computeStringSize(2, this.urlfb_);
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < this.trkr_.size(); i4++) {
                        i3 += GeneratedMessageV3.computeStringSizeNoTag(this.trkr_.getRaw(i4));
                    }
                    int size = i + i3 + (getTrkrList().size() * 1);
                    for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                        size += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i5));
                    }
                    if (this.ext_ != null) {
                        size += CodedOutputStream.computeMessageSize(5, getExt());
                    }
                    int serializedSize = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public String getTrkr(int i) {
                    return this.trkr_.get(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getTrkrBytes(int i) {
                    return this.trkr_.getByteString(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public int getTrkrCount() {
                    return this.trkr_.size();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public String getUrlfb() {
                    Object obj = this.urlfb_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urlfb_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlfbBytes() {
                    Object obj = this.urlfb_;
                    if (obj instanceof String) {
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.urlfb_ = copyFromUtf8;
                        return copyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public boolean hasExt() {
                    if (this.ext_ != null) {
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
                    int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getUrlfb().hashCode();
                    if (getTrkrCount() > 0) {
                        hashCode = (((hashCode * 37) + 3) * 53) + getTrkrList().hashCode();
                    }
                    if (hasExt()) {
                        hashCode = (((hashCode * 37) + 5) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        hashCode = (((hashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
                    }
                    int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.f24390x5edf9334.ensureFieldAccessorsInitialized(LinkAsset.class, Builder.class);
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
                    return new LinkAsset();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getUrlBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
                    }
                    if (!getUrlfbBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.urlfb_);
                    }
                    for (int i = 0; i < this.trkr_.size(); i++) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.trkr_.getRaw(i));
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        codedOutputStream.writeMessage(4, this.extProto_.get(i2));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.writeMessage(5, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static Builder newBuilder(LinkAsset linkAsset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(linkAsset);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.Native.LinkAssetOrBuilder
                public ProtocolStringList getTrkrList() {
                    return this.trkr_;
                }

                private LinkAsset(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static LinkAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public LinkAsset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static LinkAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private LinkAsset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.url_ = "";
                    this.urlfb_ = "";
                    this.trkr_ = LazyStringArrayList.EMPTY;
                    this.extProto_ = Collections.emptyList();
                }

                public static LinkAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.GeneratedMessageV3
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static LinkAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static LinkAsset parseFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private LinkAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.urlfb_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                        if (!(z2 & true)) {
                                            this.trkr_ = new LazyStringArrayList();
                                            z2 |= true;
                                        }
                                        this.trkr_.add((LazyStringList) readStringRequireUtf8);
                                    } else if (readTag == 34) {
                                        if (!(z2 & true)) {
                                            this.extProto_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    } else if (readTag != 42) {
                                        if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                        this.ext_ = struct2;
                                        if (builder != null) {
                                            builder.mergeFrom(struct2);
                                            this.ext_ = builder.buildPartial();
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
                            if (z2 & true) {
                                this.trkr_ = this.trkr_.getUnmodifiableView();
                            }
                            if (z2 & true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                        }
                    }
                }

                public static LinkAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static LinkAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAssetOrBuilder */
            /* loaded from: classes3.dex */
            public interface LinkAssetOrBuilder extends MessageOrBuilder {
                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                String getTrkr(int i);

                ByteString getTrkrBytes(int i);

                int getTrkrCount();

                List<String> getTrkrList();

                String getUrl();

                ByteString getUrlBytes();

                String getUrlfb();

                ByteString getUrlfbBytes();

                boolean hasExt();
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.f24391xab69174d;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Native> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Native)) {
                    return super.equals(obj);
                }
                Native r5 = (Native) obj;
                if (hasLink() != r5.hasLink()) {
                    return false;
                }
                if ((hasLink() && !getLink().equals(r5.getLink())) || !getAssetList().equals(r5.getAssetList()) || hasExt() != r5.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(r5.getExt())) && getExtProtoList().equals(r5.getExtProtoList()) && this.unknownFields.equals(r5.unknownFields)) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public Asset getAsset(int i) {
                return this.asset_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public List<Asset> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public AssetOrBuilder getAssetOrBuilder(int i) {
                return this.asset_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                if (struct == null) {
                    return Struct.getDefaultInstance();
                }
                return struct;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public LinkAsset getLink() {
                LinkAsset linkAsset = this.link_;
                if (linkAsset == null) {
                    return LinkAsset.getDefaultInstance();
                }
                return linkAsset;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public LinkAssetOrBuilder getLinkOrBuilder() {
                return getLink();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<Native> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i;
                int i2 = this.memoizedSize;
                if (i2 != -1) {
                    return i2;
                }
                if (this.link_ != null) {
                    i = CodedOutputStream.computeMessageSize(1, getLink()) + 0;
                } else {
                    i = 0;
                }
                for (int i3 = 0; i3 < this.asset_.size(); i3++) {
                    i += CodedOutputStream.computeMessageSize(2, this.asset_.get(i3));
                }
                for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                    i += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i4));
                }
                if (this.ext_ != null) {
                    i += CodedOutputStream.computeMessageSize(4, getExt());
                }
                int serializedSize = i + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public boolean hasExt() {
                if (this.ext_ != null) {
                    return true;
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
            public boolean hasLink() {
                if (this.link_ != null) {
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
                if (hasLink()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getLink().hashCode();
                }
                if (getAssetCount() > 0) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.f24392x1466a0cb.ensureFieldAccessorsInitialized(Native.class, Builder.class);
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
                return new Native();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.link_ != null) {
                    codedOutputStream.writeMessage(1, getLink());
                }
                for (int i = 0; i < this.asset_.size(); i++) {
                    codedOutputStream.writeMessage(2, this.asset_.get(i));
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    codedOutputStream.writeMessage(3, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(4, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$Native$Builder */
            /* loaded from: classes3.dex */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NativeOrBuilder {
                private RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> assetBuilder_;
                private List<Asset> asset_;
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> linkBuilder_;
                private LinkAsset link_;

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        List<Asset> list = this.asset_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.assetBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.f24391xab69174d;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    boolean z;
                    if (this.extProtoBuilder_ == null) {
                        List<Any> list = this.extProto_;
                        if ((this.bitField0_ & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> getLinkFieldBuilder() {
                    if (this.linkBuilder_ == null) {
                        this.linkBuilder_ = new SingleFieldBuilderV3<>(getLink(), getParentForChildren(), isClean());
                        this.link_ = null;
                    }
                    return this.linkBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends Asset> iterable) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.asset_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder addAsset(Asset asset) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(asset);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(asset);
                    }
                    return this;
                }

                public Asset.Builder addAssetBuilder() {
                    return getAssetFieldBuilder().addBuilder(Asset.getDefaultInstance());
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Builder clearAsset() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.asset_ = Collections.emptyList();
                        this.bitField0_ &= -2;
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

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder clearLink() {
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                        onChanged();
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public Asset getAsset(int i) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Asset.Builder getAssetBuilder(int i) {
                    return getAssetFieldBuilder().getBuilder(i);
                }

                public List<Asset.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public int getAssetCount() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public List<Asset> getAssetList() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.asset_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public AssetOrBuilder getAssetOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.f24391xab69174d;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public LinkAsset getLink() {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        LinkAsset linkAsset = this.link_;
                        if (linkAsset == null) {
                            return LinkAsset.getDefaultInstance();
                        }
                        return linkAsset;
                    }
                    return singleFieldBuilderV3.getMessage();
                }

                public LinkAsset.Builder getLinkBuilder() {
                    onChanged();
                    return getLinkFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    LinkAsset linkAsset = this.link_;
                    if (linkAsset == null) {
                        return LinkAsset.getDefaultInstance();
                    }
                    return linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public boolean hasExt() {
                    if (this.extBuilder_ == null && this.ext_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.adcom.C10729Ad.Display.NativeOrBuilder
                public boolean hasLink() {
                    if (this.linkBuilder_ == null && this.link_ == null) {
                        return false;
                    }
                    return true;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.f24392x1466a0cb.ensureFieldAccessorsInitialized(Native.class, Builder.class);
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

                public Builder mergeLink(LinkAsset linkAsset) {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        LinkAsset linkAsset2 = this.link_;
                        if (linkAsset2 != null) {
                            this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                        } else {
                            this.link_ = linkAsset;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(linkAsset);
                    }
                    return this;
                }

                public Builder removeAsset(int i) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Builder setAsset(int i, Asset asset) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.set(i, asset);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, asset);
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

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    }
                    return this;
                }

                public Builder setLink(LinkAsset linkAsset) {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        linkAsset.getClass();
                        this.link_ = linkAsset;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(linkAsset);
                    }
                    return this;
                }

                private Builder() {
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native build() {
                    Native buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native buildPartial() {
                    Native r0 = new Native(this);
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        r0.link_ = this.link_;
                    } else {
                        r0.link_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        r0.asset_ = repeatedFieldBuilderV3.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        r0.asset_ = this.asset_;
                    }
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        r0.ext_ = this.ext_;
                    } else {
                        r0.ext_ = singleFieldBuilderV32.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 != null) {
                        r0.extProto_ = repeatedFieldBuilderV32.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        r0.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return r0;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Native getDefaultInstanceForType() {
                    return Native.getDefaultInstance();
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

                public Asset.Builder addAssetBuilder(int i) {
                    return getAssetFieldBuilder().addBuilder(i, Asset.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.asset_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV32.clear();
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

                public Builder setLink(LinkAsset.Builder builder) {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.link_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addAsset(int i, Asset asset) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i, asset);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, asset);
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, any);
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
                    if (message instanceof Native) {
                        return mergeFrom((Native) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i, Asset.Builder builder) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(Native r4) {
                    if (r4 == Native.getDefaultInstance()) {
                        return this;
                    }
                    if (r4.hasLink()) {
                        mergeLink(r4.getLink());
                    }
                    if (this.assetBuilder_ == null) {
                        if (!r4.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = r4.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(r4.asset_);
                            }
                            onChanged();
                        }
                    } else if (!r4.asset_.isEmpty()) {
                        if (!this.assetBuilder_.isEmpty()) {
                            this.assetBuilder_.addAllMessages(r4.asset_);
                        } else {
                            this.assetBuilder_.dispose();
                            this.assetBuilder_ = null;
                            this.asset_ = r4.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (r4.hasExt()) {
                        mergeExt(r4.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!r4.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = r4.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(r4.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!r4.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(r4.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = r4.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((GeneratedMessageV3) r4).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(Asset.Builder builder) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addAsset(int i, Asset.Builder builder) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
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
                public com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Display.Native.access$13200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Ad$Display$Native r3 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Ad$Display$Native r4 = (com.explorestack.protobuf.adcom.C10729Ad.Display.Native) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Display.Native.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Builder");
                }
            }

            public static Builder newBuilder(Native r1) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(r1);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            private Native(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Native parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Native getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Native parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Native() {
                this.memoizedIsInitialized = (byte) -1;
                this.asset_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Native parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Native(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    LinkAsset linkAsset = this.link_;
                                    LinkAsset.Builder builder = linkAsset != null ? linkAsset.toBuilder() : null;
                                    LinkAsset linkAsset2 = (LinkAsset) codedInputStream.readMessage(LinkAsset.parser(), extensionRegistryLite);
                                    this.link_ = linkAsset2;
                                    if (builder != null) {
                                        builder.mergeFrom(linkAsset2);
                                        this.link_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.asset_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.asset_.add(codedInputStream.readMessage(Asset.parser(), extensionRegistryLite));
                                } else if (readTag == 26) {
                                    boolean z4 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z4) {
                                        this.extProto_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag != 34) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
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
                        if ((z2 ? 1 : 0) & true) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                    }
                }
            }

            public static Native parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Native parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Display$NativeOrBuilder */
        /* loaded from: classes3.dex */
        public interface NativeOrBuilder extends MessageOrBuilder {
            Native.Asset getAsset(int i);

            int getAssetCount();

            List<Native.Asset> getAssetList();

            Native.AssetOrBuilder getAssetOrBuilder(int i);

            List<? extends Native.AssetOrBuilder> getAssetOrBuilderList();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            Native.LinkAsset getLink();

            Native.LinkAssetOrBuilder getLinkOrBuilder();

            boolean hasExt();

            boolean hasLink();
        }

        public static Display getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Display parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Display) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Display> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return super.equals(obj);
            }
            Display display = (Display) obj;
            if (!getMimeList().equals(display.getMimeList()) || !this.api_.equals(display.api_) || !this.type_.equals(display.type_) || getW() != display.getW() || getH() != display.getH() || getWratio() != display.getWratio() || getHratio() != display.getHratio() || !getAdm().equals(display.getAdm()) || !getCurl().equals(display.getCurl()) || hasBanner() != display.hasBanner()) {
                return false;
            }
            if ((hasBanner() && !getBanner().equals(display.getBanner())) || hasNative() != display.hasNative()) {
                return false;
            }
            if ((hasNative() && !getNative().equals(display.getNative())) || !getEventList().equals(display.getEventList()) || hasExt() != display.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(display.getExt())) && getExtProtoList().equals(display.getExtProtoList()) && this.unknownFields.equals(display.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public ApiFramework getApi(int i) {
            return api_converter_.convert(this.api_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<ApiFramework> getApiList() {
            return new Internal.ListAdapter(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public Banner getBanner() {
            Banner banner = this.banner_;
            if (banner == null) {
                return Banner.getDefaultInstance();
            }
            return banner;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            return getBanner();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public Event getEvent(int i) {
            return this.event_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<Event> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public EventOrBuilder getEventOrBuilder(int i) {
            return this.event_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<? extends EventOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            if (struct == null) {
                return Struct.getDefaultInstance();
            }
            return struct;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getH() {
            return this.f24368h_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getHratio() {
            return this.hratio_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public String getMime(int i) {
            return this.mime_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public ByteString getMimeBytes(int i) {
            return this.mime_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public Native getNative() {
            Native r0 = this.native_;
            if (r0 == null) {
                return Native.getDefaultInstance();
            }
            return r0;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            return getNative();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Display> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.mime_.size(); i3++) {
                i2 += GeneratedMessageV3.computeStringSizeNoTag(this.mime_.getRaw(i3));
            }
            int size = i2 + 0 + (getMimeList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.api_.size(); i5++) {
                i4 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i5).intValue());
            }
            int i6 = size + i4;
            if (!getApiList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i4);
            }
            this.apiMemoizedSerializedSize = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.type_.size(); i8++) {
                i7 += CodedOutputStream.computeEnumSizeNoTag(this.type_.get(i8).intValue());
            }
            int i9 = i6 + i7;
            if (!getTypeList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i7);
            }
            this.typeMemoizedSerializedSize = i7;
            int i10 = this.f24369w_;
            if (i10 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(4, i10);
            }
            int i11 = this.f24368h_;
            if (i11 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(5, i11);
            }
            int i12 = this.wratio_;
            if (i12 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(6, i12);
            }
            int i13 = this.hratio_;
            if (i13 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(7, i13);
            }
            if (!getAdmBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(9, this.curl_);
            }
            if (this.banner_ != null) {
                i9 += CodedOutputStream.computeMessageSize(10, getBanner());
            }
            if (this.native_ != null) {
                i9 += CodedOutputStream.computeMessageSize(11, getNative());
            }
            for (int i14 = 0; i14 < this.event_.size(); i14++) {
                i9 += CodedOutputStream.computeMessageSize(12, this.event_.get(i14));
            }
            for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                i9 += CodedOutputStream.computeMessageSize(13, this.extProto_.get(i15));
            }
            if (this.ext_ != null) {
                i9 += CodedOutputStream.computeMessageSize(14, getExt());
            }
            int serializedSize = i9 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public DisplayCreativeType getType(int i) {
            return type_converter_.convert(this.type_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<DisplayCreativeType> getTypeList() {
            return new Internal.ListAdapter(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getTypeValue(int i) {
            return this.type_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getW() {
            return this.f24369w_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public int getWratio() {
            return this.wratio_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public boolean hasBanner() {
            if (this.banner_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public boolean hasExt() {
            if (this.ext_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public boolean hasNative() {
            if (this.native_ != null) {
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
            if (getMimeCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int w = (((((((((((((((((((((((hashCode * 37) + 4) * 53) + getW()) * 37) + 5) * 53) + getH()) * 37) + 6) * 53) + getWratio()) * 37) + 7) * 53) + getHratio()) * 37) + 8) * 53) + getAdm().hashCode()) * 37) + 9) * 53) + getCurl().hashCode();
            if (hasBanner()) {
                w = (((w * 37) + 10) * 53) + getBanner().hashCode();
            }
            if (hasNative()) {
                w = (((w * 37) + 11) * 53) + getNative().hashCode();
            }
            if (getEventCount() > 0) {
                w = (((w * 37) + 12) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w = (((w * 37) + 14) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w = (((w * 37) + 13) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (w * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.f24393x95c152d7.ensureFieldAccessorsInitialized(Display.class, Builder.class);
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
            return new Display();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.mime_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.mime_.getRaw(i));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.api_.size(); i2++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i2).intValue());
            }
            if (getTypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.typeMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                codedOutputStream.writeEnumNoTag(this.type_.get(i3).intValue());
            }
            int i4 = this.f24369w_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(4, i4);
            }
            int i5 = this.f24368h_;
            if (i5 != 0) {
                codedOutputStream.writeUInt32(5, i5);
            }
            int i6 = this.wratio_;
            if (i6 != 0) {
                codedOutputStream.writeUInt32(6, i6);
            }
            int i7 = this.hratio_;
            if (i7 != 0) {
                codedOutputStream.writeUInt32(7, i7);
            }
            if (!getAdmBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.curl_);
            }
            if (this.banner_ != null) {
                codedOutputStream.writeMessage(10, getBanner());
            }
            if (this.native_ != null) {
                codedOutputStream.writeMessage(11, getNative());
            }
            for (int i8 = 0; i8 < this.event_.size(); i8++) {
                codedOutputStream.writeMessage(12, this.event_.get(i8));
            }
            for (int i9 = 0; i9 < this.extProto_.size(); i9++) {
                codedOutputStream.writeMessage(13, this.extProto_.get(i9));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(14, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Display display) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(display);
        }

        public static Display parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.DisplayOrBuilder
        public ProtocolStringList getMimeList() {
            return this.mime_;
        }

        private Display(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Display parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Display) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Display parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Display getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Display parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Display() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = LazyStringArrayList.EMPTY;
            this.api_ = Collections.emptyList();
            this.type_ = Collections.emptyList();
            this.adm_ = "";
            this.curl_ = "";
            this.event_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        public static Display parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Display parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Display parseFrom(InputStream inputStream) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Display parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Display parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Display(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.mime_ = new LazyStringArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.mime_.add((LazyStringList) readStringRequireUtf8);
                                continue;
                            case 16:
                                int readEnum = codedInputStream.readEnum();
                                boolean z4 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z4) {
                                    this.api_ = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                                continue;
                            case 18:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                z2 = z2;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!((z2 ? 1 : 0) & true)) {
                                        this.api_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum2));
                                    z2 = z2;
                                }
                                codedInputStream.popLimit(pushLimit);
                                continue;
                            case 24:
                                int readEnum3 = codedInputStream.readEnum();
                                boolean z5 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z5) {
                                    this.type_ = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.type_.add(Integer.valueOf(readEnum3));
                                continue;
                            case 26:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                z2 = z2;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (!((z2 ? 1 : 0) & true)) {
                                        this.type_ = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    this.type_.add(Integer.valueOf(readEnum4));
                                    z2 = z2;
                                }
                                codedInputStream.popLimit(pushLimit2);
                                continue;
                            case 32:
                                this.f24369w_ = codedInputStream.readUInt32();
                                continue;
                            case 40:
                                this.f24368h_ = codedInputStream.readUInt32();
                                continue;
                            case 48:
                                this.wratio_ = codedInputStream.readUInt32();
                                continue;
                            case 56:
                                this.hratio_ = codedInputStream.readUInt32();
                                continue;
                            case 66:
                                this.adm_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 74:
                                this.curl_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 82:
                                Banner banner = this.banner_;
                                Banner.Builder builder = banner != null ? banner.toBuilder() : null;
                                Banner banner2 = (Banner) codedInputStream.readMessage(Banner.parser(), extensionRegistryLite);
                                this.banner_ = banner2;
                                if (builder != null) {
                                    builder.mergeFrom(banner2);
                                    this.banner_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                Native r3 = this.native_;
                                Native.Builder builder2 = r3 != null ? r3.toBuilder() : null;
                                Native r32 = (Native) codedInputStream.readMessage(Native.parser(), extensionRegistryLite);
                                this.native_ = r32;
                                if (builder2 != null) {
                                    builder2.mergeFrom(r32);
                                    this.native_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 98:
                                boolean z6 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z6) {
                                    this.event_ = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.event_.add(codedInputStream.readMessage(Event.parser(), extensionRegistryLite));
                                continue;
                            case 106:
                                boolean z7 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z7) {
                                    this.extProto_ = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                continue;
                            case 114:
                                Struct struct = this.ext_;
                                Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(struct2);
                                    this.ext_ = builder3.buildPartial();
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
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if ((z2 ? 1 : 0) & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$DisplayOrBuilder */
    /* loaded from: classes3.dex */
    public interface DisplayOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        Display.Banner getBanner();

        Display.BannerOrBuilder getBannerOrBuilder();

        String getCurl();

        ByteString getCurlBytes();

        Event getEvent(int i);

        int getEventCount();

        List<Event> getEventList();

        EventOrBuilder getEventOrBuilder(int i);

        List<? extends EventOrBuilder> getEventOrBuilderList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        int getH();

        int getHratio();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        Display.Native getNative();

        Display.NativeOrBuilder getNativeOrBuilder();

        DisplayCreativeType getType(int i);

        int getTypeCount();

        List<DisplayCreativeType> getTypeList();

        int getTypeValue(int i);

        List<Integer> getTypeValueList();

        int getW();

        int getWratio();

        boolean hasBanner();

        boolean hasExt();

        boolean hasNative();
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$Event */
    /* loaded from: classes3.dex */
    public static final class Event extends GeneratedMessageV3 implements EventOrBuilder {
        public static final int API_FIELD_NUMBER = 3;
        public static final int CDATA_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private MapField<String, String> cdata_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private int method_;
        private int type_;
        private volatile Object url_;
        private static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Ad.Event.1
            @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        private static final Event DEFAULT_INSTANCE = new Event();
        private static final Parser<Event> PARSER = new AbstractParser<Event>() { // from class: com.explorestack.protobuf.adcom.Ad.Event.2
            @Override // com.explorestack.protobuf.Parser
            public Event parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Event(codedInputStream, extensionRegistryLite);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.explorestack.protobuf.adcom.Ad$Event$CdataDefaultEntryHolder */
        /* loaded from: classes3.dex */
        public static final class CdataDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry;

            static {
                Descriptors.Descriptor descriptor = AdcomProto.f24394x268e1e57;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }

            private CdataDefaultEntryHolder() {
            }
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetCdata() {
            MapField<String, String> mapField = this.cdata_;
            if (mapField == null) {
                return MapField.emptyMapField(CdataDefaultEntryHolder.defaultEntry);
            }
            return mapField;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Event> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public boolean containsCdata(String str) {
            str.getClass();
            return internalGetCdata().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (this.type_ != event.type_ || this.method_ != event.method_ || !this.api_.equals(event.api_) || !getUrl().equals(event.getUrl()) || !internalGetCdata().equals(event.internalGetCdata()) || hasExt() != event.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(event.getExt())) && getExtProtoList().equals(event.getExtProtoList()) && this.unknownFields.equals(event.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public ApiFramework getApi(int i) {
            return api_converter_.convert(this.api_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public List<ApiFramework> getApiList() {
            return new Internal.ListAdapter(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        @Deprecated
        public Map<String, String> getCdata() {
            return getCdataMap();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public int getCdataCount() {
            return internalGetCdata().getMap().size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public Map<String, String> getCdataMap() {
            return internalGetCdata().getMap();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public String getCdataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> map = internalGetCdata().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return str2;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public String getCdataOrThrow(String str) {
            str.getClass();
            Map<String, String> map = internalGetCdata().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            if (struct == null) {
                return Struct.getDefaultInstance();
            }
            return struct;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public EventTrackingMethod getMethod() {
            EventTrackingMethod valueOf = EventTrackingMethod.valueOf(this.method_);
            if (valueOf == null) {
                return EventTrackingMethod.UNRECOGNIZED;
            }
            return valueOf;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public int getMethodValue() {
            return this.method_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Event> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                i = CodedOutputStream.computeEnumSize(1, this.type_) + 0;
            } else {
                i = 0;
            }
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                i += CodedOutputStream.computeEnumSize(2, this.method_);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.api_.size(); i4++) {
                i3 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i4).intValue());
            }
            int i5 = i + i3;
            if (!getApiList().isEmpty()) {
                i5 = i5 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i3);
            }
            this.apiMemoizedSerializedSize = i3;
            if (!getUrlBytes().isEmpty()) {
                i5 += GeneratedMessageV3.computeStringSize(4, this.url_);
            }
            for (Map.Entry<String, String> entry : internalGetCdata().getMap().entrySet()) {
                i5 += CodedOutputStream.computeMessageSize(5, CdataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            for (int i6 = 0; i6 < this.extProto_.size(); i6++) {
                i5 += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i6));
            }
            if (this.ext_ != null) {
                i5 += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = i5 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public EventType getType() {
            EventType valueOf = EventType.valueOf(this.type_);
            if (valueOf == null) {
                return EventType.UNRECOGNIZED;
            }
            return valueOf;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
        public boolean hasExt() {
            if (this.ext_ != null) {
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
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + this.method_;
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.api_.hashCode();
            }
            int hashCode2 = (((hashCode * 37) + 4) * 53) + getUrl().hashCode();
            if (!internalGetCdata().getMap().isEmpty()) {
                hashCode2 = (((hashCode2 * 37) + 5) * 53) + internalGetCdata().hashCode();
            }
            if (hasExt()) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.f24396xb023293f.ensureFieldAccessorsInitialized(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected MapField internalGetMapField(int i) {
            if (i == 5) {
                return internalGetCdata();
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
            return new Event();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                codedOutputStream.writeEnum(2, this.method_);
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i = 0; i < this.api_.size(); i++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i).intValue());
            }
            if (!getUrlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.url_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCdata(), CdataDefaultEntryHolder.defaultEntry, 5);
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Event$Builder */
        /* loaded from: classes3.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private MapField<String, String> cdata_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int method_;
            private int type_;
            private Object url_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                boolean z;
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    if ((this.bitField0_ & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private MapField<String, String> internalGetCdata() {
                MapField<String, String> mapField = this.cdata_;
                if (mapField == null) {
                    return MapField.emptyMapField(CdataDefaultEntryHolder.defaultEntry);
                }
                return mapField;
            }

            private MapField<String, String> internalGetMutableCdata() {
                onChanged();
                if (this.cdata_ == null) {
                    this.cdata_ = MapField.newMapField(CdataDefaultEntryHolder.defaultEntry);
                }
                if (!this.cdata_.isMutable()) {
                    this.cdata_ = this.cdata_.copy();
                }
                return this.cdata_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                for (ApiFramework apiFramework : iterable) {
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    this.api_.add(Integer.valueOf(num.intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCdata() {
                internalGetMutableCdata().getMutableMap().clear();
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

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearMethod() {
                this.method_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = Event.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public boolean containsCdata(String str) {
                str.getClass();
                return internalGetCdata().getMap().containsKey(str);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public ApiFramework getApi(int i) {
                return (ApiFramework) Event.api_converter_.convert(this.api_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, Event.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            @Deprecated
            public Map<String, String> getCdata() {
                return getCdataMap();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public int getCdataCount() {
                return internalGetCdata().getMap().size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public Map<String, String> getCdataMap() {
                return internalGetCdata().getMap();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public String getCdataOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> map = internalGetCdata().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                return str2;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public String getCdataOrThrow(String str) {
                str.getClass();
                Map<String, String> map = internalGetCdata().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public EventTrackingMethod getMethod() {
                EventTrackingMethod valueOf = EventTrackingMethod.valueOf(this.method_);
                if (valueOf == null) {
                    return EventTrackingMethod.UNRECOGNIZED;
                }
                return valueOf;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public int getMethodValue() {
                return this.method_;
            }

            @Deprecated
            public Map<String, String> getMutableCdata() {
                return internalGetMutableCdata().getMutableMap();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public EventType getType() {
                EventType valueOf = EventType.valueOf(this.type_);
                if (valueOf == null) {
                    return EventType.UNRECOGNIZED;
                }
                return valueOf;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.EventOrBuilder
            public boolean hasExt() {
                if (this.extBuilder_ == null && this.ext_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.f24396xb023293f.ensureFieldAccessorsInitialized(Event.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected MapField internalGetMapField(int i) {
                if (i == 5) {
                    return internalGetCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected MapField internalGetMutableMapField(int i) {
                if (i == 5) {
                    return internalGetMutableCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i);
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

            public Builder putAllCdata(Map<String, String> map) {
                internalGetMutableCdata().getMutableMap().putAll(map);
                return this;
            }

            public Builder putCdata(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCdata().getMutableMap().put(str, str2);
                return this;
            }

            public Builder removeCdata(String str) {
                str.getClass();
                internalGetMutableCdata().getMutableMap().remove(str);
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
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

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, any);
                }
                return this;
            }

            public Builder setMethod(EventTrackingMethod eventTrackingMethod) {
                eventTrackingMethod.getClass();
                this.method_ = eventTrackingMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setMethodValue(int i) {
                this.method_ = i;
                onChanged();
                return this;
            }

            public Builder setType(EventType eventType) {
                eventType.getClass();
                this.type_ = eventType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
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
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.url_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event build() {
                Event buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event buildPartial() {
                Event event = new Event(this);
                event.type_ = this.type_;
                event.method_ = this.method_;
                if ((this.bitField0_ & 1) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -2;
                }
                event.api_ = this.api_;
                event.url_ = this.url_;
                event.cdata_ = internalGetCdata();
                event.cdata_.makeImmutable();
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    event.ext_ = this.ext_;
                } else {
                    event.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    event.extProto_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    event.extProto_ = this.extProto_;
                }
                onBuilt();
                return event;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Event getDefaultInstanceForType() {
                return Event.getDefaultInstance();
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

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.url_ = "";
                internalGetMutableCdata().clear();
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    repeatedFieldBuilderV3.clear();
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

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, any);
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
                if (message instanceof Event) {
                    return mergeFrom((Event) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.url_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (event.type_ != 0) {
                    setTypeValue(event.getTypeValue());
                }
                if (event.method_ != 0) {
                    setMethodValue(event.getMethodValue());
                }
                if (!event.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = event.api_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(event.api_);
                    }
                    onChanged();
                }
                if (!event.getUrl().isEmpty()) {
                    this.url_ = event.url_;
                    onChanged();
                }
                internalGetMutableCdata().mergeFrom(event.internalGetCdata());
                if (event.hasExt()) {
                    mergeExt(event.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!event.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = event.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(event.extProto_);
                        }
                        onChanged();
                    }
                } else if (!event.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(event.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = event.extProto_;
                        this.bitField0_ &= -5;
                        this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) event).unknownFields);
                onChanged();
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
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
            public com.explorestack.protobuf.adcom.C10729Ad.Event.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Event.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Event r3 = (com.explorestack.protobuf.adcom.C10729Ad.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Event r4 = (com.explorestack.protobuf.adcom.C10729Ad.Event) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Event.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Event$Builder");
            }
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Event(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Event() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.method_ = 0;
            this.api_ = Collections.emptyList();
            this.url_ = "";
            this.extProto_ = Collections.emptyList();
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
        private Event(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.type_ = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.method_ = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                if (!(z2 & true)) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                            } else if (readTag == 26) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!(z2 & true)) {
                                        this.api_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum2));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 34) {
                                this.url_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                if (!(z2 & true)) {
                                    this.cdata_ = MapField.newMapField(CdataDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CdataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.cdata_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (readTag == 50) {
                                if (!(z2 & true)) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag != 58) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
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
                    if (z2 & true) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (z2 & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$EventOrBuilder */
    /* loaded from: classes3.dex */
    public interface EventOrBuilder extends MessageOrBuilder {
        boolean containsCdata(String str);

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        @Deprecated
        Map<String, String> getCdata();

        int getCdataCount();

        Map<String, String> getCdataMap();

        String getCdataOrDefault(String str, String str2);

        String getCdataOrThrow(String str);

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        EventTrackingMethod getMethod();

        int getMethodValue();

        EventType getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasExt();
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$Video */
    /* loaded from: classes3.dex */
    public static final class Video extends GeneratedMessageV3 implements VideoOrBuilder {
        public static final int ADM_FIELD_NUMBER = 4;
        public static final int API_FIELD_NUMBER = 2;
        public static final int CURL_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private volatile Object curl_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private LazyStringList mime_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Ad.Video.1
            @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, VideoCreativeType> type_converter_ = new Internal.ListAdapter.Converter<Integer, VideoCreativeType>() { // from class: com.explorestack.protobuf.adcom.Ad.Video.2
            @Override // com.explorestack.protobuf.Internal.ListAdapter.Converter
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType valueOf = VideoCreativeType.valueOf(num.intValue());
                return valueOf == null ? VideoCreativeType.UNRECOGNIZED : valueOf;
            }
        };
        private static final Video DEFAULT_INSTANCE = new Video();
        private static final Parser<Video> PARSER = new AbstractParser<Video>() { // from class: com.explorestack.protobuf.adcom.Ad.Video.3
            @Override // com.explorestack.protobuf.Parser
            public Video parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Video(codedInputStream, extensionRegistryLite);
            }
        };

        /* renamed from: com.explorestack.protobuf.adcom.Ad$Video$Builder */
        /* loaded from: classes3.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VideoOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private int bitField0_;
            private Object curl_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private LazyStringList mime_;
            private List<Integer> type_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new LazyStringArrayList(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                boolean z;
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    if ((this.bitField0_ & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                for (ApiFramework apiFramework : iterable) {
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    this.api_.add(Integer.valueOf(num.intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends VideoCreativeType> iterable) {
                ensureTypeIsMutable();
                for (VideoCreativeType videoCreativeType : iterable) {
                    this.type_.add(Integer.valueOf(videoCreativeType.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer num : iterable) {
                    this.type_.add(Integer.valueOf(num.intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add((LazyStringList) str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.add(byteString);
                onChanged();
                return this;
            }

            public Builder addType(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Video.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Video.getDefaultInstance().getCurl();
                onChanged();
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

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearMime() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adm_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adm_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public ApiFramework getApi(int i) {
                return (ApiFramework) Video.api_converter_.convert(this.api_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, Video.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.curl_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.curl_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public String getMime(int i) {
                return this.mime_.get(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public ByteString getMimeBytes(int i) {
                return this.mime_.getByteString(i);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public VideoCreativeType getType(int i) {
                return (VideoCreativeType) Video.type_converter_.convert(this.type_.get(i));
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public List<VideoCreativeType> getTypeList() {
                return new Internal.ListAdapter(this.type_, Video.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public int getTypeValue(int i) {
                return this.type_.get(i).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public boolean hasExt() {
                if (this.extBuilder_ == null && this.ext_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.f24397x29a951be.ensureFieldAccessorsInitialized(Video.class, Builder.class);
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

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
                onChanged();
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

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, any);
                }
                return this;
            }

            public Builder setMime(int i, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i, (int) str);
                onChanged();
                return this;
            }

            public Builder setType(int i, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i, int i2) {
                ensureTypeIsMutable();
                this.type_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
            public ProtocolStringList getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video build() {
                Video buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video buildPartial() {
                Video video = new Video(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                video.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                video.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                video.type_ = this.type_;
                video.adm_ = this.adm_;
                video.curl_ = this.curl_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    video.ext_ = this.ext_;
                } else {
                    video.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    video.extProto_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    video.extProto_ = this.extProto_;
                }
                onBuilt();
                return video;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Video getDefaultInstanceForType() {
                return Video.getDefaultInstance();
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

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
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
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.adm_ = "";
                this.curl_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    repeatedFieldBuilderV3.clear();
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

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, any);
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
                if (message instanceof Video) {
                    return mergeFrom((Video) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Video video) {
                if (video == Video.getDefaultInstance()) {
                    return this;
                }
                if (!video.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = video.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(video.mime_);
                    }
                    onChanged();
                }
                if (!video.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = video.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(video.api_);
                    }
                    onChanged();
                }
                if (!video.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = video.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(video.type_);
                    }
                    onChanged();
                }
                if (!video.getAdm().isEmpty()) {
                    this.adm_ = video.adm_;
                    onChanged();
                }
                if (!video.getCurl().isEmpty()) {
                    this.curl_ = video.curl_;
                    onChanged();
                }
                if (video.hasExt()) {
                    mergeExt(video.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!video.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = video.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(video.extProto_);
                        }
                        onChanged();
                    }
                } else if (!video.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(video.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = video.extProto_;
                        this.bitField0_ &= -9;
                        this.extProtoBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) video).unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
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
            public com.explorestack.protobuf.adcom.C10729Ad.Video.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.C10729Ad.Video.access$17500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Video r3 = (com.explorestack.protobuf.adcom.C10729Ad.Video) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Video r4 = (com.explorestack.protobuf.adcom.C10729Ad.Video) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.C10729Ad.Video.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Video$Builder");
            }
        }

        public static Video getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Video) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Video> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return super.equals(obj);
            }
            Video video = (Video) obj;
            if (!getMimeList().equals(video.getMimeList()) || !this.api_.equals(video.api_) || !this.type_.equals(video.type_) || !getAdm().equals(video.getAdm()) || !getCurl().equals(video.getCurl()) || hasExt() != video.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(video.getExt())) && getExtProtoList().equals(video.getExtProtoList()) && this.unknownFields.equals(video.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public ApiFramework getApi(int i) {
            return api_converter_.convert(this.api_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public List<ApiFramework> getApiList() {
            return new Internal.ListAdapter(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            if (struct == null) {
                return Struct.getDefaultInstance();
            }
            return struct;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public String getMime(int i) {
            return this.mime_.get(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public ByteString getMimeBytes(int i) {
            return this.mime_.getByteString(i);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Video> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.mime_.size(); i3++) {
                i2 += GeneratedMessageV3.computeStringSizeNoTag(this.mime_.getRaw(i3));
            }
            int size = i2 + 0 + (getMimeList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.api_.size(); i5++) {
                i4 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i5).intValue());
            }
            int i6 = size + i4;
            if (!getApiList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i4);
            }
            this.apiMemoizedSerializedSize = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.type_.size(); i8++) {
                i7 += CodedOutputStream.computeEnumSizeNoTag(this.type_.get(i8).intValue());
            }
            int i9 = i6 + i7;
            if (!getTypeList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i7);
            }
            this.typeMemoizedSerializedSize = i7;
            if (!getAdmBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(5, this.curl_);
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                i9 += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                i9 += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = i9 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public VideoCreativeType getType(int i) {
            return type_converter_.convert(this.type_.get(i));
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public List<VideoCreativeType> getTypeList() {
            return new Internal.ListAdapter(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public int getTypeValue(int i) {
            return this.type_.get(i).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public boolean hasExt() {
            if (this.ext_ != null) {
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
            if (getMimeCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int hashCode2 = (((((((hashCode * 37) + 4) * 53) + getAdm().hashCode()) * 37) + 5) * 53) + getCurl().hashCode();
            if (hasExt()) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.f24397x29a951be.ensureFieldAccessorsInitialized(Video.class, Builder.class);
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
            return new Video();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.mime_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.mime_.getRaw(i));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.api_.size(); i2++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i2).intValue());
            }
            if (getTypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.typeMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                codedOutputStream.writeEnumNoTag(this.type_.get(i3).intValue());
            }
            if (!getAdmBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.curl_);
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Video video) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(video);
        }

        public static Video parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.adcom.C10729Ad.VideoOrBuilder
        public ProtocolStringList getMimeList() {
            return this.mime_;
        }

        private Video(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Video parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Video) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Video getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Video parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Video() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = LazyStringArrayList.EMPTY;
            this.api_ = Collections.emptyList();
            this.type_ = Collections.emptyList();
            this.adm_ = "";
            this.curl_ = "";
            this.extProto_ = Collections.emptyList();
        }

        public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Video parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Video parseFrom(InputStream inputStream) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Video parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Video(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.mime_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.mime_.add((LazyStringList) readStringRequireUtf8);
                            } else if (readTag == 16) {
                                int readEnum = codedInputStream.readEnum();
                                if (!(z2 & true)) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                            } else if (readTag == 18) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!(z2 & true)) {
                                        this.api_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum2));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 24) {
                                int readEnum3 = codedInputStream.readEnum();
                                if (!(z2 & true)) {
                                    this.type_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.type_.add(Integer.valueOf(readEnum3));
                            } else if (readTag == 26) {
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (!(z2 & true)) {
                                        this.type_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.type_.add(Integer.valueOf(readEnum4));
                                }
                                codedInputStream.popLimit(pushLimit2);
                            } else if (readTag == 34) {
                                this.adm_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.curl_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                if (!(z2 & true)) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag != 58) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
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
                    if (z2 & true) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (z2 & true) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (z2 & true) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    if (z2 & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Video parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.explorestack.protobuf.adcom.Ad$VideoOrBuilder */
    /* loaded from: classes3.dex */
    public interface VideoOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        String getCurl();

        ByteString getCurlBytes();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        VideoCreativeType getType(int i);

        int getTypeCount();

        List<VideoCreativeType> getTypeList();

        int getTypeValue(int i);

        List<Integer> getTypeValueList();

        boolean hasExt();
    }

    public static C10729Ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C10729Ad parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (C10729Ad) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static C10729Ad parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<C10729Ad> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10729Ad)) {
            return super.equals(obj);
        }
        C10729Ad c10729Ad = (C10729Ad) obj;
        if (!getId().equals(c10729Ad.getId()) || !getAdomainList().equals(c10729Ad.getAdomainList()) || !getBundleList().equals(c10729Ad.getBundleList()) || !getIurl().equals(c10729Ad.getIurl()) || !getCatList().equals(c10729Ad.getCatList()) || this.cattax_ != c10729Ad.cattax_ || !getLang().equals(c10729Ad.getLang()) || getSecure() != c10729Ad.getSecure() || this.mrating_ != c10729Ad.mrating_ || !getInit().equals(c10729Ad.getInit()) || !getLastmod().equals(c10729Ad.getLastmod()) || hasDisplay() != c10729Ad.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(c10729Ad.getDisplay())) || hasVideo() != c10729Ad.hasVideo()) {
            return false;
        }
        if ((hasVideo() && !getVideo().equals(c10729Ad.getVideo())) || hasAudit() != c10729Ad.hasAudit()) {
            return false;
        }
        if ((hasAudit() && !getAudit().equals(c10729Ad.getAudit())) || hasExt() != c10729Ad.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(c10729Ad.getExt())) && getExtProtoList().equals(c10729Ad.getExtProtoList()) && this.unknownFields.equals(c10729Ad.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getAdomain(int i) {
        return this.adomain_.get(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getAdomainBytes(int i) {
        return this.adomain_.getByteString(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public int getAdomainCount() {
        return this.adomain_.size();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public Audit getAudit() {
        Audit audit = this.audit_;
        if (audit == null) {
            return Audit.getDefaultInstance();
        }
        return audit;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public AuditOrBuilder getAuditOrBuilder() {
        return getAudit();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getBundle(int i) {
        return this.bundle_.get(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getBundleBytes(int i) {
        return this.bundle_.getByteString(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public int getBundleCount() {
        return this.bundle_.size();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getCat(int i) {
        return this.cat_.get(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getCatBytes(int i) {
        return this.cat_.getByteString(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public int getCatCount() {
        return this.cat_.size();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
        if (valueOf == null) {
            return CategoryTaxonomy.UNRECOGNIZED;
        }
        return valueOf;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public int getCattaxValue() {
        return this.cattax_;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public Display getDisplay() {
        Display display = this.display_;
        if (display == null) {
            return Display.getDefaultInstance();
        }
        return display;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public DisplayOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        if (struct == null) {
            return Struct.getDefaultInstance();
        }
        return struct;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public StructOrBuilder getExtOrBuilder() {
        return getExt();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public Any getExtProto(int i) {
        return this.extProto_.get(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public AnyOrBuilder getExtProtoOrBuilder(int i) {
        return this.extProto_.get(i);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getInit() {
        Object obj = this.init_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.init_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getInitBytes() {
        Object obj = this.init_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getIurl() {
        Object obj = this.iurl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.iurl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getIurlBytes() {
        Object obj = this.iurl_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iurl_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getLang() {
        Object obj = this.lang_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lang_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getLangBytes() {
        Object obj = this.lang_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public String getLastmod() {
        Object obj = this.lastmod_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lastmod_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ByteString getLastmodBytes() {
        Object obj = this.lastmod_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public MediaRating getMrating() {
        MediaRating valueOf = MediaRating.valueOf(this.mrating_);
        if (valueOf == null) {
            return MediaRating.UNRECOGNIZED;
        }
        return valueOf;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public int getMratingValue() {
        return this.mrating_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<C10729Ad> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public boolean getSecure() {
        return this.secure_;
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
        int i3 = 0;
        for (int i4 = 0; i4 < this.adomain_.size(); i4++) {
            i3 += GeneratedMessageV3.computeStringSizeNoTag(this.adomain_.getRaw(i4));
        }
        int size = i + i3 + (getAdomainList().size() * 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.bundle_.size(); i6++) {
            i5 += GeneratedMessageV3.computeStringSizeNoTag(this.bundle_.getRaw(i6));
        }
        int size2 = size + i5 + (getBundleList().size() * 1);
        if (!getIurlBytes().isEmpty()) {
            size2 += GeneratedMessageV3.computeStringSize(4, this.iurl_);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.cat_.size(); i8++) {
            i7 += GeneratedMessageV3.computeStringSizeNoTag(this.cat_.getRaw(i8));
        }
        int size3 = size2 + i7 + (getCatList().size() * 1);
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size3 += CodedOutputStream.computeEnumSize(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            size3 += GeneratedMessageV3.computeStringSize(7, this.lang_);
        }
        boolean z = this.secure_;
        if (z) {
            size3 += CodedOutputStream.computeBoolSize(9, z);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            size3 += CodedOutputStream.computeEnumSize(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            size3 += GeneratedMessageV3.computeStringSize(11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            size3 += GeneratedMessageV3.computeStringSize(12, this.lastmod_);
        }
        if (this.display_ != null) {
            size3 += CodedOutputStream.computeMessageSize(13, getDisplay());
        }
        if (this.video_ != null) {
            size3 += CodedOutputStream.computeMessageSize(14, getVideo());
        }
        if (this.audit_ != null) {
            size3 += CodedOutputStream.computeMessageSize(16, getAudit());
        }
        for (int i9 = 0; i9 < this.extProto_.size(); i9++) {
            size3 += CodedOutputStream.computeMessageSize(17, this.extProto_.get(i9));
        }
        if (this.ext_ != null) {
            size3 += CodedOutputStream.computeMessageSize(18, getExt());
        }
        int serializedSize = size3 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public Video getVideo() {
        Video video = this.video_;
        if (video == null) {
            return Video.getDefaultInstance();
        }
        return video;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public VideoOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public boolean hasAudit() {
        if (this.audit_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public boolean hasDisplay() {
        if (this.display_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public boolean hasExt() {
        if (this.ext_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public boolean hasVideo() {
        if (this.video_ != null) {
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
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode();
        if (getAdomainCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getAdomainList().hashCode();
        }
        if (getBundleCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getBundleList().hashCode();
        }
        int hashCode2 = (((hashCode * 37) + 4) * 53) + getIurl().hashCode();
        if (getCatCount() > 0) {
            hashCode2 = (((hashCode2 * 37) + 5) * 53) + getCatList().hashCode();
        }
        int hashCode3 = (((((((((((((((((((((((hashCode2 * 37) + 6) * 53) + this.cattax_) * 37) + 7) * 53) + getLang().hashCode()) * 37) + 9) * 53) + Internal.hashBoolean(getSecure())) * 37) + 10) * 53) + this.mrating_) * 37) + 11) * 53) + getInit().hashCode()) * 37) + 12) * 53) + getLastmod().hashCode();
        if (hasDisplay()) {
            hashCode3 = (((hashCode3 * 37) + 13) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            hashCode3 = (((hashCode3 * 37) + 14) * 53) + getVideo().hashCode();
        }
        if (hasAudit()) {
            hashCode3 = (((hashCode3 * 37) + 16) * 53) + getAudit().hashCode();
        }
        if (hasExt()) {
            hashCode3 = (((hashCode3 * 37) + 18) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            hashCode3 = (((hashCode3 * 37) + 17) * 53) + getExtProtoList().hashCode();
        }
        int hashCode4 = (hashCode3 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_fieldAccessorTable.ensureFieldAccessorsInitialized(C10729Ad.class, Builder.class);
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
        return new C10729Ad();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
        }
        for (int i = 0; i < this.adomain_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.adomain_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.bundle_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.bundle_.getRaw(i2));
        }
        if (!getIurlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.iurl_);
        }
        for (int i3 = 0; i3 < this.cat_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.cat_.getRaw(i3));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            codedOutputStream.writeEnum(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.lang_);
        }
        boolean z = this.secure_;
        if (z) {
            codedOutputStream.writeBool(9, z);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            codedOutputStream.writeEnum(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.lastmod_);
        }
        if (this.display_ != null) {
            codedOutputStream.writeMessage(13, getDisplay());
        }
        if (this.video_ != null) {
            codedOutputStream.writeMessage(14, getVideo());
        }
        if (this.audit_ != null) {
            codedOutputStream.writeMessage(16, getAudit());
        }
        for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
            codedOutputStream.writeMessage(17, this.extProto_.get(i4));
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(18, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(C10729Ad c10729Ad) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c10729Ad);
    }

    public static C10729Ad parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ProtocolStringList getAdomainList() {
        return this.adomain_;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ProtocolStringList getBundleList() {
        return this.bundle_;
    }

    @Override // com.explorestack.protobuf.adcom.AdOrBuilder
    public ProtocolStringList getCatList() {
        return this.cat_;
    }

    private C10729Ad(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C10729Ad parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (C10729Ad) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static C10729Ad parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public C10729Ad getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static C10729Ad parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private C10729Ad() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
        this.adomain_ = lazyStringList;
        this.bundle_ = lazyStringList;
        this.iurl_ = "";
        this.cat_ = lazyStringList;
        this.cattax_ = 0;
        this.lang_ = "";
        this.mrating_ = 0;
        this.init_ = "";
        this.lastmod_ = "";
        this.extProto_ = Collections.emptyList();
    }

    public static C10729Ad parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static C10729Ad parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static C10729Ad parseFrom(InputStream inputStream) throws IOException {
        return (C10729Ad) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static C10729Ad parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (C10729Ad) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static C10729Ad parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (C10729Ad) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static C10729Ad parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (C10729Ad) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10729Ad(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            boolean z3 = (z2 ? 1 : 0) & true;
                            z2 = z2;
                            if (!z3) {
                                this.adomain_ = new LazyStringArrayList();
                                z2 = (z2 ? 1 : 0) | true;
                            }
                            this.adomain_.add((LazyStringList) readStringRequireUtf8);
                            continue;
                        case 26:
                            String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                            boolean z4 = (z2 ? 1 : 0) & true;
                            z2 = z2;
                            if (!z4) {
                                this.bundle_ = new LazyStringArrayList();
                                z2 = (z2 ? 1 : 0) | true;
                            }
                            this.bundle_.add((LazyStringList) readStringRequireUtf82);
                            continue;
                        case 34:
                            this.iurl_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 42:
                            String readStringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                            boolean z5 = (z2 ? 1 : 0) & true;
                            z2 = z2;
                            if (!z5) {
                                this.cat_ = new LazyStringArrayList();
                                z2 = (z2 ? 1 : 0) | true;
                            }
                            this.cat_.add((LazyStringList) readStringRequireUtf83);
                            continue;
                        case 48:
                            this.cattax_ = codedInputStream.readEnum();
                            continue;
                        case 58:
                            this.lang_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 72:
                            this.secure_ = codedInputStream.readBool();
                            continue;
                        case 80:
                            this.mrating_ = codedInputStream.readEnum();
                            continue;
                        case 90:
                            this.init_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 98:
                            this.lastmod_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 106:
                            Display display = this.display_;
                            Display.Builder builder = display != null ? display.toBuilder() : null;
                            Display display2 = (Display) codedInputStream.readMessage(Display.parser(), extensionRegistryLite);
                            this.display_ = display2;
                            if (builder != null) {
                                builder.mergeFrom(display2);
                                this.display_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                        case 114:
                            Video video = this.video_;
                            Video.Builder builder2 = video != null ? video.toBuilder() : null;
                            Video video2 = (Video) codedInputStream.readMessage(Video.parser(), extensionRegistryLite);
                            this.video_ = video2;
                            if (builder2 != null) {
                                builder2.mergeFrom(video2);
                                this.video_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                        case 130:
                            Audit audit = this.audit_;
                            Audit.Builder builder3 = audit != null ? audit.toBuilder() : null;
                            Audit audit2 = (Audit) codedInputStream.readMessage(Audit.parser(), extensionRegistryLite);
                            this.audit_ = audit2;
                            if (builder3 != null) {
                                builder3.mergeFrom(audit2);
                                this.audit_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                        case 138:
                            boolean z6 = (z2 ? 1 : 0) & true;
                            z2 = z2;
                            if (!z6) {
                                this.extProto_ = new ArrayList();
                                z2 = (z2 ? 1 : 0) | true;
                            }
                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            continue;
                        case 146:
                            Struct struct = this.ext_;
                            Struct.Builder builder4 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct2;
                            if (builder4 != null) {
                                builder4.mergeFrom(struct2);
                                this.ext_ = builder4.buildPartial();
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
                    this.adomain_ = this.adomain_.getUnmodifiableView();
                }
                if ((z2 ? 1 : 0) & true) {
                    this.bundle_ = this.bundle_.getUnmodifiableView();
                }
                if ((z2 ? 1 : 0) & true) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if ((z2 ? 1 : 0) & true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }
}
