package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* compiled from: Init.java */
/* renamed from: com.moloco.sdk.i */
/* loaded from: classes7.dex */
public final class C23907i extends GeneratedMessageLite<C23907i, C23916c> implements MessageLiteOrBuilder {
    public static final int AD_SERVER_URL_FIELD_NUMBER = 6;
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BID_TOKEN_CONFIG_FIELD_NUMBER = 12;
    public static final int CONFIGS_FIELD_NUMBER = 16;
    public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 7;
    public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 3;
    public static final int CRASH_REPORTING_CONFIG_FIELD_NUMBER = 15;
    private static final C23907i DEFAULT_INSTANCE;
    public static final int EVENT_COLLECTION_CONFIG_FIELD_NUMBER = 11;
    public static final int EXPERIMENTAL_FEATURE_FLAGS_FIELD_NUMBER = 13;
    public static final int GEO_FIELD_NUMBER = 10;
    public static final int OPERATIONAL_METRICS_CONFIG_FIELD_NUMBER = 14;
    private static volatile Parser<C23907i> PARSER = null;
    public static final int PLATFORM_ID_FIELD_NUMBER = 8;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 2;
    public static final int RESOLVED_REGION_FIELD_NUMBER = 5;
    public static final int VERIFY_BANNER_VISIBLE_FIELD_NUMBER = 9;
    private C23914b bidTokenConfig_;
    private C23897g configs_;
    private C23917d crashReportingConfig_;
    private C23919e eventCollectionConfig_;
    private C23923g geo_;
    private C23925h operationalMetricsConfig_;
    private int resolvedRegion_;
    private boolean verifyBannerVisible_;
    private String appId_ = "";
    private String publisherId_ = "";
    private String countryIso3Code_ = "";
    private Internal.ProtobufList<C23908a> adUnits_ = GeneratedMessageLite.emptyProtobufList();
    private String adServerUrl_ = "";
    private String countryIso2Code_ = "";
    private String platformId_ = "";
    private Internal.ProtobufList<C23921f> experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$a */
    /* loaded from: classes7.dex */
    public static final class C23908a extends GeneratedMessageLite<C23908a, C23909a> implements MessageLiteOrBuilder {
        public static final int AD_FREQUENCY_FIELD_NUMBER = 3;
        public static final int BID_FLOOR_FIELD_NUMBER = 4;
        private static final C23908a DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int NATIVE_FIELD_NUMBER = 6;
        private static volatile Parser<C23908a> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int adFrequency_;
        private float bidFloor_;
        private String id_ = "";
        private String name_ = "";
        private C23912c native_;
        private int type_;

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$a$a */
        /* loaded from: classes7.dex */
        public static final class C23909a extends GeneratedMessageLite.Builder<C23908a, C23909a> implements MessageLiteOrBuilder {
            /* synthetic */ C23909a(Init init) {
                this();
            }

            private C23909a() {
                super(C23908a.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$a$b */
        /* loaded from: classes7.dex */
        public enum EnumC23910b implements Internal.EnumLite {
            INVALID(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE(3),
            REWARD_VIDEO(4),
            MREC(6),
            UNRECOGNIZED(-1);
            

            /* renamed from: k */
            private static final Internal.EnumLiteMap<EnumC23910b> f61947k = new C23911a();

            /* renamed from: b */
            private final int f61949b;

            /* compiled from: Init.java */
            /* renamed from: com.moloco.sdk.i$a$b$a */
            /* loaded from: classes7.dex */
            class C23911a implements Internal.EnumLiteMap<EnumC23910b> {
                C23911a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public EnumC23910b findValueByNumber(int i) {
                    return EnumC23910b.m47352c(i);
                }
            }

            EnumC23910b(int i) {
                this.f61949b = i;
            }

            /* renamed from: c */
            public static EnumC23910b m47352c(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return MREC;
                                }
                                return REWARD_VIDEO;
                            }
                            return NATIVE;
                        }
                        return INTERSTITIAL;
                    }
                    return BANNER;
                }
                return INVALID;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f61949b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$a$c */
        /* loaded from: classes7.dex */
        public static final class C23912c extends GeneratedMessageLite<C23912c, C23913a> implements MessageLiteOrBuilder {
            private static final C23912c DEFAULT_INSTANCE;
            private static volatile Parser<C23912c> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;

            /* compiled from: Init.java */
            /* renamed from: com.moloco.sdk.i$a$c$a */
            /* loaded from: classes7.dex */
            public static final class C23913a extends GeneratedMessageLite.Builder<C23912c, C23913a> implements MessageLiteOrBuilder {
                /* synthetic */ C23913a(Init init) {
                    this();
                }

                private C23913a() {
                    super(C23912c.DEFAULT_INSTANCE);
                }
            }

            static {
                C23912c c23912c = new C23912c();
                DEFAULT_INSTANCE = c23912c;
                GeneratedMessageLite.registerDefaultInstance(C23912c.class, c23912c);
            }

            private C23912c() {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (Init.f61939a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C23912c();
                    case 2:
                        return new C23913a(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<C23912c> parser = PARSER;
                        if (parser == null) {
                            synchronized (C23912c.class) {
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
            C23908a c23908a = new C23908a();
            DEFAULT_INSTANCE = c23908a;
            GeneratedMessageLite.registerDefaultInstance(C23908a.class, c23908a);
        }

        private C23908a() {
        }

        /* renamed from: b */
        public String m47355b() {
            return this.id_;
        }

        /* renamed from: c */
        public EnumC23910b m47354c() {
            EnumC23910b m47352c = EnumC23910b.m47352c(this.type_);
            if (m47352c == null) {
                return EnumC23910b.UNRECOGNIZED;
            }
            return m47352c;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23908a();
                case 2:
                    return new C23909a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0001\u0005Ȉ\u0006\t", new Object[]{"id_", "type_", "adFrequency_", "bidFloor_", "name_", "native_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23908a> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23908a.class) {
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

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$b */
    /* loaded from: classes7.dex */
    public static final class C23914b extends GeneratedMessageLite<C23914b, C23915a> implements MessageLiteOrBuilder {
        public static final int BID_TOKEN_URL_FIELD_NUMBER = 2;
        private static final C23914b DEFAULT_INSTANCE;
        private static volatile Parser<C23914b> PARSER;
        private String bidTokenUrl_ = "";

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$b$a */
        /* loaded from: classes7.dex */
        public static final class C23915a extends GeneratedMessageLite.Builder<C23914b, C23915a> implements MessageLiteOrBuilder {
            /* synthetic */ C23915a(Init init) {
                this();
            }

            private C23915a() {
                super(C23914b.DEFAULT_INSTANCE);
            }
        }

        static {
            C23914b c23914b = new C23914b();
            DEFAULT_INSTANCE = c23914b;
            GeneratedMessageLite.registerDefaultInstance(C23914b.class, c23914b);
        }

        private C23914b() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23914b();
                case 2:
                    return new C23915a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"bidTokenUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23914b> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23914b.class) {
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

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$c */
    /* loaded from: classes7.dex */
    public static final class C23916c extends GeneratedMessageLite.Builder<C23907i, C23916c> implements MessageLiteOrBuilder {
        /* synthetic */ C23916c(Init init) {
            this();
        }

        private C23916c() {
            super(C23907i.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$d */
    /* loaded from: classes7.dex */
    public static final class C23917d extends GeneratedMessageLite<C23917d, C23918a> implements MessageLiteOrBuilder {
        private static final C23917d DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<C23917d> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private String url_ = "";

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$d$a */
        /* loaded from: classes7.dex */
        public static final class C23918a extends GeneratedMessageLite.Builder<C23917d, C23918a> implements MessageLiteOrBuilder {
            /* synthetic */ C23918a(Init init) {
                this();
            }

            private C23918a() {
                super(C23917d.DEFAULT_INSTANCE);
            }
        }

        static {
            C23917d c23917d = new C23917d();
            DEFAULT_INSTANCE = c23917d;
            GeneratedMessageLite.registerDefaultInstance(C23917d.class, c23917d);
        }

        private C23917d() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23917d();
                case 2:
                    return new C23918a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"enabled_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23917d> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23917d.class) {
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

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$e */
    /* loaded from: classes7.dex */
    public static final class C23919e extends GeneratedMessageLite<C23919e, C23920a> implements MessageLiteOrBuilder {
        public static final int APP_BACKGROUND_TRACKING_URL_FIELD_NUMBER = 3;
        public static final int APP_FOREGROUND_TRACKING_URL_FIELD_NUMBER = 4;
        private static final C23919e DEFAULT_INSTANCE;
        public static final int EVENT_COLLECTION_ENABLED_FIELD_NUMBER = 1;
        public static final int MREF_COLLECTION_ENABLED_FIELD_NUMBER = 2;
        private static volatile Parser<C23919e> PARSER;
        private String appBackgroundTrackingUrl_ = "";
        private String appForegroundTrackingUrl_ = "";
        private boolean eventCollectionEnabled_;
        private boolean mrefCollectionEnabled_;

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$e$a */
        /* loaded from: classes7.dex */
        public static final class C23920a extends GeneratedMessageLite.Builder<C23919e, C23920a> implements MessageLiteOrBuilder {
            /* synthetic */ C23920a(Init init) {
                this();
            }

            private C23920a() {
                super(C23919e.DEFAULT_INSTANCE);
            }
        }

        static {
            C23919e c23919e = new C23919e();
            DEFAULT_INSTANCE = c23919e;
            GeneratedMessageLite.registerDefaultInstance(C23919e.class, c23919e);
        }

        private C23919e() {
        }

        /* renamed from: d */
        public static C23919e m47344d() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: b */
        public String m47346b() {
            return this.appBackgroundTrackingUrl_;
        }

        /* renamed from: c */
        public String m47345c() {
            return this.appForegroundTrackingUrl_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23919e();
                case 2:
                    return new C23920a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"eventCollectionEnabled_", "mrefCollectionEnabled_", "appBackgroundTrackingUrl_", "appForegroundTrackingUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23919e> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23919e.class) {
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
        public boolean m47343e() {
            return this.eventCollectionEnabled_;
        }

        /* renamed from: f */
        public boolean m47342f() {
            return this.mrefCollectionEnabled_;
        }
    }

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$f */
    /* loaded from: classes7.dex */
    public static final class C23921f extends GeneratedMessageLite<C23921f, C23922a> implements MessageLiteOrBuilder {
        private static final C23921f DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<C23921f> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String name_ = "";
        private String value_ = "";

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$f$a */
        /* loaded from: classes7.dex */
        public static final class C23922a extends GeneratedMessageLite.Builder<C23921f, C23922a> implements MessageLiteOrBuilder {
            /* synthetic */ C23922a(Init init) {
                this();
            }

            private C23922a() {
                super(C23921f.DEFAULT_INSTANCE);
            }
        }

        static {
            C23921f c23921f = new C23921f();
            DEFAULT_INSTANCE = c23921f;
            GeneratedMessageLite.registerDefaultInstance(C23921f.class, c23921f);
        }

        private C23921f() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23921f();
                case 2:
                    return new C23922a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23921f> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23921f.class) {
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

        public String getName() {
            return this.name_;
        }

        public String getValue() {
            return this.value_;
        }
    }

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$g */
    /* loaded from: classes7.dex */
    public static final class C23923g extends GeneratedMessageLite<C23923g, C23924a> implements MessageLiteOrBuilder {
        public static final int CITY_FIELD_NUMBER = 6;
        public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 2;
        public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 1;
        private static final C23923g DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 4;
        private static volatile Parser<C23923g> PARSER = null;
        public static final int REGION_FIELD_NUMBER = 7;
        public static final int ZIP_CODE_FIELD_NUMBER = 5;
        private float latitude_;
        private float longitude_;
        private String countryIso3Code_ = "";
        private String countryIso2Code_ = "";
        private String zipCode_ = "";
        private String city_ = "";
        private String region_ = "";

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$g$a */
        /* loaded from: classes7.dex */
        public static final class C23924a extends GeneratedMessageLite.Builder<C23923g, C23924a> implements MessageLiteOrBuilder {
            /* synthetic */ C23924a(Init init) {
                this();
            }

            private C23924a() {
                super(C23923g.DEFAULT_INSTANCE);
            }
        }

        static {
            C23923g c23923g = new C23923g();
            DEFAULT_INSTANCE = c23923g;
            GeneratedMessageLite.registerDefaultInstance(C23923g.class, c23923g);
        }

        private C23923g() {
        }

        /* renamed from: b */
        public String m47339b() {
            return this.city_;
        }

        /* renamed from: c */
        public String m47338c() {
            return this.countryIso2Code_;
        }

        /* renamed from: d */
        public String m47337d() {
            return this.countryIso3Code_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23923g();
                case 2:
                    return new C23924a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"countryIso3Code_", "countryIso2Code_", "latitude_", "longitude_", "zipCode_", "city_", "region_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23923g> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23923g.class) {
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
        public float m47336e() {
            return this.latitude_;
        }

        /* renamed from: f */
        public float m47335f() {
            return this.longitude_;
        }

        /* renamed from: g */
        public String m47334g() {
            return this.zipCode_;
        }
    }

    /* compiled from: Init.java */
    /* renamed from: com.moloco.sdk.i$h */
    /* loaded from: classes7.dex */
    public static final class C23925h extends GeneratedMessageLite<C23925h, C23926a> implements MessageLiteOrBuilder {
        private static final C23925h DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<C23925h> PARSER = null;
        public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private int pollingIntervalSeconds_;
        private String url_ = "";

        /* compiled from: Init.java */
        /* renamed from: com.moloco.sdk.i$h$a */
        /* loaded from: classes7.dex */
        public static final class C23926a extends GeneratedMessageLite.Builder<C23925h, C23926a> implements MessageLiteOrBuilder {
            /* synthetic */ C23926a(Init init) {
                this();
            }

            private C23926a() {
                super(C23925h.DEFAULT_INSTANCE);
            }
        }

        static {
            C23925h c23925h = new C23925h();
            DEFAULT_INSTANCE = c23925h;
            GeneratedMessageLite.registerDefaultInstance(C23925h.class, c23925h);
        }

        private C23925h() {
        }

        /* renamed from: b */
        public static C23925h m47332b() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: c */
        public int m47331c() {
            return this.pollingIntervalSeconds_;
        }

        /* renamed from: d */
        public String m47330d() {
            return this.url_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (Init.f61939a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C23925h();
                case 2:
                    return new C23926a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C23925h> parser = PARSER;
                    if (parser == null) {
                        synchronized (C23925h.class) {
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

        public boolean getEnabled() {
            return this.enabled_;
        }
    }

    static {
        C23907i c23907i = new C23907i();
        DEFAULT_INSTANCE = c23907i;
        GeneratedMessageLite.registerDefaultInstance(C23907i.class, c23907i);
    }

    private C23907i() {
    }

    /* renamed from: m */
    public static C23907i m47357m(byte[] bArr) throws InvalidProtocolBufferException {
        return (C23907i) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: b */
    public String m47368b() {
        return this.adServerUrl_;
    }

    /* renamed from: c */
    public List<C23908a> m47367c() {
        return this.adUnits_;
    }

    /* renamed from: d */
    public C23897g m47366d() {
        C23897g c23897g = this.configs_;
        if (c23897g == null) {
            return C23897g.m47381c();
        }
        return c23897g;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (Init.f61939a[methodToInvoke.ordinal()]) {
            case 1:
                return new C23907i();
            case 2:
                return new C23916c(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\t\u000b\t\f\t\r\u001b\u000e\t\u000f\t\u0010\t", new Object[]{"appId_", "publisherId_", "countryIso3Code_", "adUnits_", C23908a.class, "resolvedRegion_", "adServerUrl_", "countryIso2Code_", "platformId_", "verifyBannerVisible_", "geo_", "eventCollectionConfig_", "bidTokenConfig_", "experimentalFeatureFlags_", C23921f.class, "operationalMetricsConfig_", "crashReportingConfig_", "configs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C23907i> parser = PARSER;
                if (parser == null) {
                    synchronized (C23907i.class) {
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
    public String m47365e() {
        return this.countryIso2Code_;
    }

    /* renamed from: f */
    public C23919e m47364f() {
        C23919e c23919e = this.eventCollectionConfig_;
        if (c23919e == null) {
            return C23919e.m47344d();
        }
        return c23919e;
    }

    /* renamed from: g */
    public List<C23921f> m47363g() {
        return this.experimentalFeatureFlags_;
    }

    /* renamed from: h */
    public C23925h m47362h() {
        C23925h c23925h = this.operationalMetricsConfig_;
        if (c23925h == null) {
            return C23925h.m47332b();
        }
        return c23925h;
    }

    /* renamed from: i */
    public boolean m47361i() {
        return this.verifyBannerVisible_;
    }

    /* renamed from: j */
    public boolean m47360j() {
        if (this.configs_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m47359k() {
        if (this.eventCollectionConfig_ != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m47358l() {
        if (this.operationalMetricsConfig_ != null) {
            return true;
        }
        return false;
    }
}
