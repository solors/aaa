package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* compiled from: UserIntent.java */
/* renamed from: com.moloco.sdk.t */
/* loaded from: classes7.dex */
public final class C24490t extends GeneratedMessageLite<C24490t, C24497d> implements MessageLiteOrBuilder {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 3;
    public static final int APP_BACKGROUNDING_INTERACTION_FIELD_NUMBER = 103;
    public static final int APP_FIELD_NUMBER = 5;
    public static final int APP_FOREGROUNDING_INTERACTION_FIELD_NUMBER = 102;
    public static final int CLICK_INTERACTION_FIELD_NUMBER = 101;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 2;
    private static final C24490t DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int IMP_INTERACTION_FIELD_NUMBER = 100;
    public static final int MREF_FIELD_NUMBER = 1;
    public static final int NETWORK_FIELD_NUMBER = 6;
    private static volatile Parser<C24490t> PARSER = null;
    public static final int SDK_FIELD_NUMBER = 7;
    private C24491a app_;
    private long clientTimestamp_;
    private C24504g device_;
    private Object infoExt_;
    private C24512j network_;
    private C24510i sdk_;
    private int infoExtCase_ = 0;
    private String mref_ = "";
    private String advertisingId_ = "";

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$a */
    /* loaded from: classes7.dex */
    public static final class C24491a extends GeneratedMessageLite<C24491a, C24492a> implements MessageLiteOrBuilder {
        private static final C24491a DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<C24491a> PARSER = null;
        public static final int VER_FIELD_NUMBER = 2;
        private String id_ = "";
        private String ver_ = "";

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$a$a */
        /* loaded from: classes7.dex */
        public static final class C24492a extends GeneratedMessageLite.Builder<C24491a, C24492a> implements MessageLiteOrBuilder {
            /* synthetic */ C24492a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24492a m46307b(String str) {
                copyOnWrite();
                ((C24491a) this.instance).m46309e(str);
                return this;
            }

            /* renamed from: c */
            public C24492a m46306c(String str) {
                copyOnWrite();
                ((C24491a) this.instance).m46308f(str);
                return this;
            }

            private C24492a() {
                super(C24491a.DEFAULT_INSTANCE);
            }
        }

        static {
            C24491a c24491a = new C24491a();
            DEFAULT_INSTANCE = c24491a;
            GeneratedMessageLite.registerDefaultInstance(C24491a.class, c24491a);
        }

        private C24491a() {
        }

        /* renamed from: d */
        public static C24492a m46310d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m46309e(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m46308f(String str) {
            str.getClass();
            this.ver_ = str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24491a();
                case 2:
                    return new C24492a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "ver_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24491a> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24491a.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$b */
    /* loaded from: classes7.dex */
    public static final class C24493b extends GeneratedMessageLite<C24493b, C24494a> implements MessageLiteOrBuilder {
        private static final C24493b DEFAULT_INSTANCE;
        private static volatile Parser<C24493b> PARSER;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$b$a */
        /* loaded from: classes7.dex */
        public static final class C24494a extends GeneratedMessageLite.Builder<C24493b, C24494a> implements MessageLiteOrBuilder {
            /* synthetic */ C24494a(UserIntent userIntent) {
                this();
            }

            private C24494a() {
                super(C24493b.DEFAULT_INSTANCE);
            }
        }

        static {
            C24493b c24493b = new C24493b();
            DEFAULT_INSTANCE = c24493b;
            GeneratedMessageLite.registerDefaultInstance(C24493b.class, c24493b);
        }

        private C24493b() {
        }

        /* renamed from: b */
        public static C24494a m46304b() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24493b();
                case 2:
                    return new C24494a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24493b> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24493b.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$c */
    /* loaded from: classes7.dex */
    public static final class C24495c extends GeneratedMessageLite<C24495c, C24496a> implements MessageLiteOrBuilder {
        public static final int BG_TS_MS_FIELD_NUMBER = 1;
        private static final C24495c DEFAULT_INSTANCE;
        private static volatile Parser<C24495c> PARSER;
        private long bgTsMs_;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$c$a */
        /* loaded from: classes7.dex */
        public static final class C24496a extends GeneratedMessageLite.Builder<C24495c, C24496a> implements MessageLiteOrBuilder {
            /* synthetic */ C24496a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24496a m46299b(long j) {
                copyOnWrite();
                ((C24495c) this.instance).m46300d(j);
                return this;
            }

            private C24496a() {
                super(C24495c.DEFAULT_INSTANCE);
            }
        }

        static {
            C24495c c24495c = new C24495c();
            DEFAULT_INSTANCE = c24495c;
            GeneratedMessageLite.registerDefaultInstance(C24495c.class, c24495c);
        }

        private C24495c() {
        }

        /* renamed from: c */
        public static C24496a m46301c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m46300d(long j) {
            this.bgTsMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24495c();
                case 2:
                    return new C24496a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"bgTsMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24495c> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24495c.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$d */
    /* loaded from: classes7.dex */
    public static final class C24497d extends GeneratedMessageLite.Builder<C24490t, C24497d> implements MessageLiteOrBuilder {
        /* synthetic */ C24497d(UserIntent userIntent) {
            this();
        }

        /* renamed from: b */
        public C24497d m46298b(String str) {
            copyOnWrite();
            ((C24490t) this.instance).m46324n(str);
            return this;
        }

        /* renamed from: c */
        public C24497d m46297c(C24491a c24491a) {
            copyOnWrite();
            ((C24490t) this.instance).m46323o(c24491a);
            return this;
        }

        /* renamed from: d */
        public C24497d m46296d(C24493b c24493b) {
            copyOnWrite();
            ((C24490t) this.instance).m46322p(c24493b);
            return this;
        }

        /* renamed from: e */
        public C24497d m46295e(C24495c c24495c) {
            copyOnWrite();
            ((C24490t) this.instance).m46321q(c24495c);
            return this;
        }

        /* renamed from: f */
        public C24497d m46294f(C24502f c24502f) {
            copyOnWrite();
            ((C24490t) this.instance).m46320r(c24502f);
            return this;
        }

        /* renamed from: g */
        public C24497d m46293g(long j) {
            copyOnWrite();
            ((C24490t) this.instance).m46319s(j);
            return this;
        }

        /* renamed from: h */
        public C24497d m46292h(C24504g c24504g) {
            copyOnWrite();
            ((C24490t) this.instance).m46318t(c24504g);
            return this;
        }

        /* renamed from: i */
        public C24497d m46291i(C24508h c24508h) {
            copyOnWrite();
            ((C24490t) this.instance).m46317u(c24508h);
            return this;
        }

        /* renamed from: j */
        public C24497d m46290j(String str) {
            copyOnWrite();
            ((C24490t) this.instance).m46316v(str);
            return this;
        }

        /* renamed from: k */
        public C24497d m46289k(C24512j c24512j) {
            copyOnWrite();
            ((C24490t) this.instance).m46315w(c24512j);
            return this;
        }

        /* renamed from: l */
        public C24497d m46288l(C24510i c24510i) {
            copyOnWrite();
            ((C24490t) this.instance).m46314x(c24510i);
            return this;
        }

        private C24497d() {
            super(C24490t.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$e */
    /* loaded from: classes7.dex */
    public static final class C24498e extends GeneratedMessageLite<C24498e, C24499a> implements MessageLiteOrBuilder {
        private static final C24498e DEFAULT_INSTANCE;
        private static volatile Parser<C24498e> PARSER = null;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private C24516k pos_;
        private C24518l size_;
        private int type_;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$e$a */
        /* loaded from: classes7.dex */
        public static final class C24499a extends GeneratedMessageLite.Builder<C24498e, C24499a> implements MessageLiteOrBuilder {
            /* synthetic */ C24499a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24499a m46279b(C24516k c24516k) {
                copyOnWrite();
                ((C24498e) this.instance).m46282f(c24516k);
                return this;
            }

            /* renamed from: c */
            public C24499a m46278c(C24518l c24518l) {
                copyOnWrite();
                ((C24498e) this.instance).m46281g(c24518l);
                return this;
            }

            /* renamed from: d */
            public C24499a m46277d(EnumC24500b enumC24500b) {
                copyOnWrite();
                ((C24498e) this.instance).m46280h(enumC24500b);
                return this;
            }

            private C24499a() {
                super(C24498e.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$e$b */
        /* loaded from: classes7.dex */
        public enum EnumC24500b implements Internal.EnumLite {
            NONE(0),
            CLOSE(1),
            SKIP(2),
            MUTE(3),
            UNMUTE(4),
            CTA(5),
            REPLAY(6),
            DEC_SKIP(7),
            AD_BADGE(8),
            UNRECOGNIZED(-1);
            

            /* renamed from: n */
            private static final Internal.EnumLiteMap<EnumC24500b> f63251n = new C24501a();

            /* renamed from: b */
            private final int f63253b;

            /* compiled from: UserIntent.java */
            /* renamed from: com.moloco.sdk.t$e$b$a */
            /* loaded from: classes7.dex */
            class C24501a implements Internal.EnumLiteMap<EnumC24500b> {
                C24501a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public EnumC24500b findValueByNumber(int i) {
                    return EnumC24500b.m46275c(i);
                }
            }

            EnumC24500b(int i) {
                this.f63253b = i;
            }

            /* renamed from: c */
            public static EnumC24500b m46275c(int i) {
                switch (i) {
                    case 0:
                        return NONE;
                    case 1:
                        return CLOSE;
                    case 2:
                        return SKIP;
                    case 3:
                        return MUTE;
                    case 4:
                        return UNMUTE;
                    case 5:
                        return CTA;
                    case 6:
                        return REPLAY;
                    case 7:
                        return DEC_SKIP;
                    case 8:
                        return AD_BADGE;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f63253b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            C24498e c24498e = new C24498e();
            DEFAULT_INSTANCE = c24498e;
            GeneratedMessageLite.registerDefaultInstance(C24498e.class, c24498e);
        }

        private C24498e() {
        }

        /* renamed from: e */
        public static C24499a m46283e() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m46282f(C24516k c24516k) {
            c24516k.getClass();
            this.pos_ = c24516k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m46281g(C24518l c24518l) {
            c24518l.getClass();
            this.size_ = c24518l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m46280h(EnumC24500b enumC24500b) {
            this.type_ = enumC24500b.getNumber();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24498e();
                case 2:
                    return new C24499a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"type_", "pos_", "size_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24498e> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24498e.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$f */
    /* loaded from: classes7.dex */
    public static final class C24502f extends GeneratedMessageLite<C24502f, C24503a> implements MessageLiteOrBuilder {
        public static final int BUTTONS_FIELD_NUMBER = 5;
        public static final int CLICK_POS_FIELD_NUMBER = 1;
        private static final C24502f DEFAULT_INSTANCE;
        private static volatile Parser<C24502f> PARSER = null;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 2;
        public static final int VIEW_POS_FIELD_NUMBER = 3;
        public static final int VIEW_SIZE_FIELD_NUMBER = 4;
        private Internal.ProtobufList<C24498e> buttons_ = GeneratedMessageLite.emptyProtobufList();
        private C24516k clickPos_;
        private C24518l screenSize_;
        private C24516k viewPos_;
        private C24518l viewSize_;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$f$a */
        /* loaded from: classes7.dex */
        public static final class C24503a extends GeneratedMessageLite.Builder<C24502f, C24503a> implements MessageLiteOrBuilder {
            /* synthetic */ C24503a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24503a m46260b(Iterable<? extends C24498e> iterable) {
                copyOnWrite();
                ((C24502f) this.instance).m46267g(iterable);
                return this;
            }

            /* renamed from: c */
            public C24503a m46259c(C24516k c24516k) {
                copyOnWrite();
                ((C24502f) this.instance).m46264j(c24516k);
                return this;
            }

            /* renamed from: d */
            public C24503a m46258d(C24518l c24518l) {
                copyOnWrite();
                ((C24502f) this.instance).m46263k(c24518l);
                return this;
            }

            /* renamed from: e */
            public C24503a m46257e(C24516k c24516k) {
                copyOnWrite();
                ((C24502f) this.instance).m46262l(c24516k);
                return this;
            }

            /* renamed from: f */
            public C24503a m46256f(C24518l c24518l) {
                copyOnWrite();
                ((C24502f) this.instance).m46261m(c24518l);
                return this;
            }

            private C24503a() {
                super(C24502f.DEFAULT_INSTANCE);
            }
        }

        static {
            C24502f c24502f = new C24502f();
            DEFAULT_INSTANCE = c24502f;
            GeneratedMessageLite.registerDefaultInstance(C24502f.class, c24502f);
        }

        private C24502f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m46267g(Iterable<? extends C24498e> iterable) {
            m46266h();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.buttons_);
        }

        /* renamed from: h */
        private void m46266h() {
            Internal.ProtobufList<C24498e> protobufList = this.buttons_;
            if (!protobufList.isModifiable()) {
                this.buttons_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        /* renamed from: i */
        public static C24503a m46265i() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m46264j(C24516k c24516k) {
            c24516k.getClass();
            this.clickPos_ = c24516k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m46263k(C24518l c24518l) {
            c24518l.getClass();
            this.screenSize_ = c24518l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m46262l(C24516k c24516k) {
            c24516k.getClass();
            this.viewPos_ = c24516k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public void m46261m(C24518l c24518l) {
            c24518l.getClass();
            this.viewSize_ = c24518l;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24502f();
                case 2:
                    return new C24503a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new Object[]{"clickPos_", "screenSize_", "viewPos_", "viewSize_", "buttons_", C24498e.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24502f> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24502f.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$g */
    /* loaded from: classes7.dex */
    public static final class C24504g extends GeneratedMessageLite<C24504g, C24505a> implements MessageLiteOrBuilder {
        private static final C24504g DEFAULT_INSTANCE;
        public static final int MODEL_FIELD_NUMBER = 3;
        public static final int OS_FIELD_NUMBER = 1;
        public static final int OS_VER_FIELD_NUMBER = 2;
        private static volatile Parser<C24504g> PARSER = null;
        public static final int SCREEN_SCALE_FIELD_NUMBER = 4;
        private int os_;
        private float screenScale_;
        private String osVer_ = "";
        private String model_ = "";

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$g$a */
        /* loaded from: classes7.dex */
        public static final class C24505a extends GeneratedMessageLite.Builder<C24504g, C24505a> implements MessageLiteOrBuilder {
            /* synthetic */ C24505a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24505a m46246b(String str) {
                copyOnWrite();
                ((C24504g) this.instance).setModel(str);
                return this;
            }

            /* renamed from: c */
            public C24505a m46245c(EnumC24506b enumC24506b) {
                copyOnWrite();
                ((C24504g) this.instance).m46249g(enumC24506b);
                return this;
            }

            /* renamed from: d */
            public C24505a m46244d(String str) {
                copyOnWrite();
                ((C24504g) this.instance).m46248h(str);
                return this;
            }

            /* renamed from: e */
            public C24505a m46243e(float f) {
                copyOnWrite();
                ((C24504g) this.instance).m46247i(f);
                return this;
            }

            private C24505a() {
                super(C24504g.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$g$b */
        /* loaded from: classes7.dex */
        public enum EnumC24506b implements Internal.EnumLite {
            UNKNOWN(0),
            ANDROID(1),
            IOS(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: h */
            private static final Internal.EnumLiteMap<EnumC24506b> f63258h = new C24507a();

            /* renamed from: b */
            private final int f63260b;

            /* compiled from: UserIntent.java */
            /* renamed from: com.moloco.sdk.t$g$b$a */
            /* loaded from: classes7.dex */
            class C24507a implements Internal.EnumLiteMap<EnumC24506b> {
                C24507a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public EnumC24506b findValueByNumber(int i) {
                    return EnumC24506b.m46241c(i);
                }
            }

            EnumC24506b(int i) {
                this.f63260b = i;
            }

            /* renamed from: c */
            public static EnumC24506b m46241c(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return IOS;
                    }
                    return ANDROID;
                }
                return UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f63260b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            C24504g c24504g = new C24504g();
            DEFAULT_INSTANCE = c24504g;
            GeneratedMessageLite.registerDefaultInstance(C24504g.class, c24504g);
        }

        private C24504g() {
        }

        /* renamed from: f */
        public static C24505a m46250f() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m46249g(EnumC24506b enumC24506b) {
            this.os_ = enumC24506b.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m46248h(String str) {
            str.getClass();
            this.osVer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public void m46247i(float f) {
            this.screenScale_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24504g();
                case 2:
                    return new C24505a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0001", new Object[]{"os_", "osVer_", "model_", "screenScale_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24504g> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24504g.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$h */
    /* loaded from: classes7.dex */
    public static final class C24508h extends GeneratedMessageLite<C24508h, C24509a> implements MessageLiteOrBuilder {
        private static final C24508h DEFAULT_INSTANCE;
        private static volatile Parser<C24508h> PARSER;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$h$a */
        /* loaded from: classes7.dex */
        public static final class C24509a extends GeneratedMessageLite.Builder<C24508h, C24509a> implements MessageLiteOrBuilder {
            /* synthetic */ C24509a(UserIntent userIntent) {
                this();
            }

            private C24509a() {
                super(C24508h.DEFAULT_INSTANCE);
            }
        }

        static {
            C24508h c24508h = new C24508h();
            DEFAULT_INSTANCE = c24508h;
            GeneratedMessageLite.registerDefaultInstance(C24508h.class, c24508h);
        }

        private C24508h() {
        }

        /* renamed from: b */
        public static C24509a m46238b() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24508h();
                case 2:
                    return new C24509a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24508h> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24508h.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$i */
    /* loaded from: classes7.dex */
    public static final class C24510i extends GeneratedMessageLite<C24510i, C24511a> implements MessageLiteOrBuilder {
        public static final int ADAPTER_VER_FIELD_NUMBER = 2;
        public static final int CORE_VER_FIELD_NUMBER = 1;
        private static final C24510i DEFAULT_INSTANCE;
        private static volatile Parser<C24510i> PARSER;
        private String coreVer_ = "";
        private String adapterVer_ = "";

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$i$a */
        /* loaded from: classes7.dex */
        public static final class C24511a extends GeneratedMessageLite.Builder<C24510i, C24511a> implements MessageLiteOrBuilder {
            /* synthetic */ C24511a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24511a m46233b(String str) {
                copyOnWrite();
                ((C24510i) this.instance).m46234d(str);
                return this;
            }

            private C24511a() {
                super(C24510i.DEFAULT_INSTANCE);
            }
        }

        static {
            C24510i c24510i = new C24510i();
            DEFAULT_INSTANCE = c24510i;
            GeneratedMessageLite.registerDefaultInstance(C24510i.class, c24510i);
        }

        private C24510i() {
        }

        /* renamed from: c */
        public static C24511a m46235c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m46234d(String str) {
            str.getClass();
            this.coreVer_ = str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24510i();
                case 2:
                    return new C24511a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coreVer_", "adapterVer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24510i> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24510i.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$j */
    /* loaded from: classes7.dex */
    public static final class C24512j extends GeneratedMessageLite<C24512j, C24513a> implements MessageLiteOrBuilder {
        public static final int CARRIER_FIELD_NUMBER = 2;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
        private static final C24512j DEFAULT_INSTANCE;
        private static volatile Parser<C24512j> PARSER;
        private String carrier_ = "";
        private int connectionType_;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$j$a */
        /* loaded from: classes7.dex */
        public static final class C24513a extends GeneratedMessageLite.Builder<C24512j, C24513a> implements MessageLiteOrBuilder {
            /* synthetic */ C24513a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24513a m46226b(String str) {
                copyOnWrite();
                ((C24512j) this.instance).m46228e(str);
                return this;
            }

            /* renamed from: c */
            public C24513a m46225c(EnumC24514b enumC24514b) {
                copyOnWrite();
                ((C24512j) this.instance).m46227f(enumC24514b);
                return this;
            }

            private C24513a() {
                super(C24512j.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$j$b */
        /* loaded from: classes7.dex */
        public enum EnumC24514b implements Internal.EnumLite {
            UNKNOWN(0),
            WIFI(1),
            CELLULAR(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: h */
            private static final Internal.EnumLiteMap<EnumC24514b> f63265h = new C24515a();

            /* renamed from: b */
            private final int f63267b;

            /* compiled from: UserIntent.java */
            /* renamed from: com.moloco.sdk.t$j$b$a */
            /* loaded from: classes7.dex */
            class C24515a implements Internal.EnumLiteMap<EnumC24514b> {
                C24515a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public EnumC24514b findValueByNumber(int i) {
                    return EnumC24514b.m46223c(i);
                }
            }

            EnumC24514b(int i) {
                this.f63267b = i;
            }

            /* renamed from: c */
            public static EnumC24514b m46223c(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return CELLULAR;
                    }
                    return WIFI;
                }
                return UNKNOWN;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f63267b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            C24512j c24512j = new C24512j();
            DEFAULT_INSTANCE = c24512j;
            GeneratedMessageLite.registerDefaultInstance(C24512j.class, c24512j);
        }

        private C24512j() {
        }

        /* renamed from: d */
        public static C24513a m46229d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m46228e(String str) {
            str.getClass();
            this.carrier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m46227f(EnumC24514b enumC24514b) {
            this.connectionType_ = enumC24514b.getNumber();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24512j();
                case 2:
                    return new C24513a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"connectionType_", "carrier_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24512j> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24512j.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$k */
    /* loaded from: classes7.dex */
    public static final class C24516k extends GeneratedMessageLite<C24516k, C24517a> implements MessageLiteOrBuilder {
        private static final C24516k DEFAULT_INSTANCE;
        private static volatile Parser<C24516k> PARSER = null;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;

        /* renamed from: x_ */
        private float f63268x_;

        /* renamed from: y_ */
        private float f63269y_;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$k$a */
        /* loaded from: classes7.dex */
        public static final class C24517a extends GeneratedMessageLite.Builder<C24516k, C24517a> implements MessageLiteOrBuilder {
            /* synthetic */ C24517a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24517a m46215b(float f) {
                copyOnWrite();
                ((C24516k) this.instance).m46217e(f);
                return this;
            }

            /* renamed from: c */
            public C24517a m46214c(float f) {
                copyOnWrite();
                ((C24516k) this.instance).m46216f(f);
                return this;
            }

            private C24517a() {
                super(C24516k.DEFAULT_INSTANCE);
            }
        }

        static {
            C24516k c24516k = new C24516k();
            DEFAULT_INSTANCE = c24516k;
            GeneratedMessageLite.registerDefaultInstance(C24516k.class, c24516k);
        }

        private C24516k() {
        }

        /* renamed from: d */
        public static C24517a m46218d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m46217e(float f) {
            this.f63268x_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m46216f(float f) {
            this.f63269y_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24516k();
                case 2:
                    return new C24517a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"x_", "y_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24516k> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24516k.class) {
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

    /* compiled from: UserIntent.java */
    /* renamed from: com.moloco.sdk.t$l */
    /* loaded from: classes7.dex */
    public static final class C24518l extends GeneratedMessageLite<C24518l, C24519a> implements MessageLiteOrBuilder {
        private static final C24518l DEFAULT_INSTANCE;
        public static final int H_FIELD_NUMBER = 2;
        private static volatile Parser<C24518l> PARSER = null;
        public static final int W_FIELD_NUMBER = 1;

        /* renamed from: h_ */
        private float f63270h_;

        /* renamed from: w_ */
        private float f63271w_;

        /* compiled from: UserIntent.java */
        /* renamed from: com.moloco.sdk.t$l$a */
        /* loaded from: classes7.dex */
        public static final class C24519a extends GeneratedMessageLite.Builder<C24518l, C24519a> implements MessageLiteOrBuilder {
            /* synthetic */ C24519a(UserIntent userIntent) {
                this();
            }

            /* renamed from: b */
            public C24519a m46207b(float f) {
                copyOnWrite();
                ((C24518l) this.instance).m46209e(f);
                return this;
            }

            /* renamed from: c */
            public C24519a m46206c(float f) {
                copyOnWrite();
                ((C24518l) this.instance).m46208f(f);
                return this;
            }

            private C24519a() {
                super(C24518l.DEFAULT_INSTANCE);
            }
        }

        static {
            C24518l c24518l = new C24518l();
            DEFAULT_INSTANCE = c24518l;
            GeneratedMessageLite.registerDefaultInstance(C24518l.class, c24518l);
        }

        private C24518l() {
        }

        /* renamed from: d */
        public static C24519a m46210d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m46209e(float f) {
            this.f63270h_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m46208f(float f) {
            this.f63271w_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C24518l();
                case 2:
                    return new C24519a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"w_", "h_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<C24518l> parser = PARSER;
                    if (parser == null) {
                        synchronized (C24518l.class) {
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
        C24490t c24490t = new C24490t();
        DEFAULT_INSTANCE = c24490t;
        GeneratedMessageLite.registerDefaultInstance(C24490t.class, c24490t);
    }

    private C24490t() {
    }

    /* renamed from: m */
    public static C24497d m46325m() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m46324n(String str) {
        str.getClass();
        this.advertisingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m46323o(C24491a c24491a) {
        c24491a.getClass();
        this.app_ = c24491a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m46322p(C24493b c24493b) {
        c24493b.getClass();
        this.infoExt_ = c24493b;
        this.infoExtCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m46321q(C24495c c24495c) {
        c24495c.getClass();
        this.infoExt_ = c24495c;
        this.infoExtCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m46320r(C24502f c24502f) {
        c24502f.getClass();
        this.infoExt_ = c24502f;
        this.infoExtCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m46319s(long j) {
        this.clientTimestamp_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m46318t(C24504g c24504g) {
        c24504g.getClass();
        this.device_ = c24504g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m46317u(C24508h c24508h) {
        c24508h.getClass();
        this.infoExt_ = c24508h;
        this.infoExtCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m46316v(String str) {
        str.getClass();
        this.mref_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m46315w(C24512j c24512j) {
        c24512j.getClass();
        this.network_ = c24512j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m46314x(C24510i c24510i) {
        c24510i.getClass();
        this.sdk_ = c24510i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (UserIntent.f63155a[methodToInvoke.ordinal()]) {
            case 1:
                return new C24490t();
            case 2:
                return new C24497d(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001g\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\td<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"infoExt_", "infoExtCase_", "mref_", "clientTimestamp_", "advertisingId_", "device_", "app_", "network_", "sdk_", C24508h.class, C24502f.class, C24495c.class, C24493b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C24490t> parser = PARSER;
                if (parser == null) {
                    synchronized (C24490t.class) {
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
