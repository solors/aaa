package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Any extends GeneratedMessageLite<Any, Builder> implements AnyOrBuilder {
    private static final Any DEFAULT_INSTANCE;
    private static volatile Parser<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    /* renamed from: androidx.datastore.preferences.protobuf.Any$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C17521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f654xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f654xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f654xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f654xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f654xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f654xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f654xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f654xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Any, Builder> implements AnyOrBuilder {
        /* synthetic */ Builder(C17521 c17521) {
            this();
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((Any) this.instance).clearTypeUrl();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Any) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public String getTypeUrl() {
            return ((Any) this.instance).getTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Any) this.instance).getTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getValue() {
            return ((Any) this.instance).getValue();
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((Any) this.instance).setTypeUrl(str);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Any) this.instance).setTypeUrlBytes(byteString);
            return this;
        }

        public Builder setValue(ByteString byteString) {
            copyOnWrite();
            ((Any) this.instance).setValue(byteString);
            return this;
        }

        private Builder() {
            super(Any.DEFAULT_INSTANCE);
        }
    }

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        GeneratedMessageLite.registerDefaultInstance(Any.class, any);
    }

    private Any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Any> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C17521.f654xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Any> parser = PARSER;
                if (parser == null) {
                    synchronized (Any.class) {
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

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    public static Builder newBuilder(Any any) {
        return DEFAULT_INSTANCE.createBuilder(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Any) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Any parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Any parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Any parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Any) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
