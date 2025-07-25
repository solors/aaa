package gatewayprotocol.p687v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.SessionCountersOuterClass */
/* loaded from: classes9.dex */
public final class SessionCountersOuterClass {

    /* renamed from: gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters */
    /* loaded from: classes9.dex */
    public static final class SessionCounters extends GeneratedMessageLite<SessionCounters, Builder> implements SessionCountersOrBuilder {
        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        private static final SessionCounters DEFAULT_INSTANCE;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile Parser<SessionCounters> PARSER;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int loadRequestsAdm_;
        private int loadRequests_;

        /* renamed from: gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<SessionCounters, Builder> implements SessionCountersOrBuilder {
            /* synthetic */ Builder(C33282a c33282a) {
                this();
            }

            public Builder clearBannerImpressions() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerImpressions();
                return this;
            }

            public Builder clearBannerLoadRequests() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerLoadRequests();
                return this;
            }

            public Builder clearBannerRequestsAdm() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerRequestsAdm();
                return this;
            }

            public Builder clearLoadRequests() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLoadRequests();
                return this;
            }

            public Builder clearLoadRequestsAdm() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLoadRequestsAdm();
                return this;
            }

            @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerImpressions() {
                return ((SessionCounters) this.instance).getBannerImpressions();
            }

            @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerLoadRequests() {
                return ((SessionCounters) this.instance).getBannerLoadRequests();
            }

            @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerRequestsAdm() {
                return ((SessionCounters) this.instance).getBannerRequestsAdm();
            }

            @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequests() {
                return ((SessionCounters) this.instance).getLoadRequests();
            }

            @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequestsAdm() {
                return ((SessionCounters) this.instance).getLoadRequestsAdm();
            }

            public Builder setBannerImpressions(int i) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerImpressions(i);
                return this;
            }

            public Builder setBannerLoadRequests(int i) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerLoadRequests(i);
                return this;
            }

            public Builder setBannerRequestsAdm(int i) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerRequestsAdm(i);
                return this;
            }

            public Builder setLoadRequests(int i) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLoadRequests(i);
                return this;
            }

            public Builder setLoadRequestsAdm(int i) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLoadRequestsAdm(i);
                return this;
            }

            private Builder() {
                super(SessionCounters.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionCounters sessionCounters = new SessionCounters();
            DEFAULT_INSTANCE = sessionCounters;
            GeneratedMessageLite.registerDefaultInstance(SessionCounters.class, sessionCounters);
        }

        private SessionCounters() {
        }

        public void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        public void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        public void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        public void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        public void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        public static SessionCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionCounters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setBannerImpressions(int i) {
            this.bannerImpressions_ = i;
        }

        public void setBannerLoadRequests(int i) {
            this.bannerLoadRequests_ = i;
        }

        public void setBannerRequestsAdm(int i) {
            this.bannerRequestsAdm_ = i;
        }

        public void setLoadRequests(int i) {
            this.loadRequests_ = i;
        }

        public void setLoadRequestsAdm(int i) {
            this.loadRequestsAdm_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33282a.f90828a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionCounters();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionCounters> parser = PARSER;
                    if (parser == null) {
                        synchronized (SessionCounters.class) {
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

        @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequests() {
            return this.loadRequests_;
        }

        @Override // gatewayprotocol.p687v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        public static Builder newBuilder(SessionCounters sessionCounters) {
            return DEFAULT_INSTANCE.createBuilder(sessionCounters);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionCounters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionCounters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder */
    /* loaded from: classes9.dex */
    public interface SessionCountersOrBuilder extends MessageLiteOrBuilder {
        int getBannerImpressions();

        int getBannerLoadRequests();

        int getBannerRequestsAdm();

        int getLoadRequests();

        int getLoadRequestsAdm();
    }

    /* renamed from: gatewayprotocol.v1.SessionCountersOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33282a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90828a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90828a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90828a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90828a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90828a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90828a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90828a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90828a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private SessionCountersOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
