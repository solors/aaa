package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: BidToken.java */
/* renamed from: com.moloco.sdk.c */
/* loaded from: classes7.dex */
public final class C23858c extends GeneratedMessageLite<C23858c, C23859a> implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_FIELD_NUMBER = 1;
    public static final int CLIENT_TOKEN_CONFIGS_FIELD_NUMBER = 3;
    private static final C23858c DEFAULT_INSTANCE;
    private static volatile Parser<C23858c> PARSER = null;
    public static final int PK_FIELD_NUMBER = 2;
    private C23860b clientTokenConfigs_;
    private String bidToken_ = "";
    private String pk_ = "";

    /* compiled from: BidToken.java */
    /* renamed from: com.moloco.sdk.c$a */
    /* loaded from: classes7.dex */
    public static final class C23859a extends GeneratedMessageLite.Builder<C23858c, C23859a> implements MessageLiteOrBuilder {
        /* synthetic */ C23859a(BidToken bidToken) {
            this();
        }

        private C23859a() {
            super(C23858c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BidToken.java */
    /* renamed from: com.moloco.sdk.c$b */
    /* loaded from: classes7.dex */
    public static final class C23860b extends GeneratedMessageLite<C23860b, C23861a> implements MessageLiteOrBuilder {
        private static final C23860b DEFAULT_INSTANCE;
        public static final int ENABLE_DBT_FIELD_NUMBER = 1;
        private static volatile Parser<C23860b> PARSER;
        private boolean enableDbt_;

        /* compiled from: BidToken.java */
        /* renamed from: com.moloco.sdk.c$b$a */
        /* loaded from: classes7.dex */
        public static final class C23861a extends GeneratedMessageLite.Builder<C23860b, C23861a> implements MessageLiteOrBuilder {
            /* synthetic */ C23861a(BidToken bidToken) {
                this();
            }

            private C23861a() {
                super(C23860b.DEFAULT_INSTANCE);
            }
        }

        static {
            C23860b c23860b = new C23860b();
            DEFAULT_INSTANCE = c23860b;
            GeneratedMessageLite.registerDefaultInstance(C23860b.class, c23860b);
        }

        private C23860b() {
        }

        /* renamed from: b */
        public static C23860b m47602b() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: c */
        public boolean m47601c() {
            return this.enableDbt_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (BidToken.f61738a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23860b();
                case 2:
                    return new C23861a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"enableDbt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23860b> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23860b.class) {
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
    }

    static {
        C23858c c23858c = new C23858c();
        DEFAULT_INSTANCE = c23858c;
        GeneratedMessageLite.registerDefaultInstance(C23858c.class, c23858c);
    }

    private C23858c() {
    }

    /* renamed from: f */
    public static C23858c m47604f(byte[] bArr) throws InvalidProtocolBufferException {
        return (C23858c) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: b */
    public String m47608b() {
        return this.bidToken_;
    }

    /* renamed from: c */
    public C23860b m47607c() {
        C23860b c23860b = this.clientTokenConfigs_;
        if (c23860b == null) {
            return C23860b.m47602b();
        }
        return c23860b;
    }

    /* renamed from: d */
    public String m47606d() {
        return this.pk_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (BidToken.f61738a[methodToInvoke.ordinal()]) {
            case 1:
                return new C23858c();
            case 2:
                return new C23859a(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"bidToken_", "pk_", "clientTokenConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C23858c> parser = PARSER;
                if (parser == null) {
                    synchronized (C23858c.class) {
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

    /* renamed from: e */
    public boolean m47605e() {
        if (this.clientTokenConfigs_ != null) {
            return true;
        }
        return false;
    }
}
