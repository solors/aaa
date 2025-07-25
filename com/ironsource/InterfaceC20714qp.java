package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.qp */
/* loaded from: classes6.dex */
public interface InterfaceC20714qp extends InterfaceC19778dl<Integer, Integer> {

    @Metadata
    /* renamed from: com.ironsource.qp$a */
    /* loaded from: classes6.dex */
    public static final class C20715a {
        @NotNull

        /* renamed from: a */
        public static final C20715a f52623a = new C20715a();

        /* renamed from: b */
        public static final int f52624b = 1201;

        /* renamed from: c */
        public static final int f52625c = 1202;

        /* renamed from: d */
        public static final int f52626d = 1005;

        /* renamed from: e */
        public static final int f52627e = 1206;

        /* renamed from: f */
        public static final int f52628f = 1006;

        /* renamed from: g */
        public static final int f52629g = 1203;

        /* renamed from: h */
        public static final int f52630h = 1507;

        /* renamed from: i */
        public static final int f52631i = 1010;

        /* renamed from: j */
        public static final int f52632j = 1210;

        /* renamed from: k */
        public static final int f52633k = 1211;

        private C20715a() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.qp$b */
    /* loaded from: classes6.dex */
    public static final class C20716b {
        @NotNull

        /* renamed from: a */
        public static final C20716b f52634a = new C20716b();

        private C20716b() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.qp$c */
    /* loaded from: classes6.dex */
    public static final class C20717c {
        @NotNull

        /* renamed from: a */
        public static final C20717c f52635a = new C20717c();

        /* renamed from: b */
        public static final int f52636b = 1001;

        /* renamed from: c */
        public static final int f52637c = 1002;

        /* renamed from: d */
        public static final int f52638d = 1200;

        /* renamed from: e */
        public static final int f52639e = 1301;

        /* renamed from: f */
        public static final int f52640f = 1503;

        private C20717c() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.qp$d */
    /* loaded from: classes6.dex */
    public static final class C20718d implements InterfaceC20714qp {
        @NotNull
        /* renamed from: a */
        public Integer m55589a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = 1503;
            } else if (i != 401) {
                switch (i) {
                    case 101:
                        i2 = 81500;
                        break;
                    case 102:
                        i2 = 81510;
                        break;
                    case 103:
                        i2 = 81301;
                        break;
                    case 104:
                        i2 = 81300;
                        break;
                    case 105:
                        i2 = 81002;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case 110:
                                i2 = 83003;
                                break;
                            case 111:
                                i2 = 81302;
                                break;
                            case 112:
                                i2 = C20719e.f52650j;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 1001;
                                        break;
                                    case 202:
                                        i2 = 1002;
                                        break;
                                    case 203:
                                        i2 = 1200;
                                        break;
                                    case 204:
                                        i2 = 1301;
                                        break;
                                    default:
                                        switch (i) {
                                            case 403:
                                                i2 = 1202;
                                                break;
                                            case 404:
                                                i2 = 1005;
                                                break;
                                            case 405:
                                                i2 = 1206;
                                                break;
                                            case 406:
                                                i2 = 1006;
                                                break;
                                            case 407:
                                                i2 = 1203;
                                                break;
                                            case 408:
                                                i2 = 1507;
                                                break;
                                            case 409:
                                                i2 = 1010;
                                                break;
                                            case 410:
                                                i2 = 1210;
                                                break;
                                            case 411:
                                                i2 = 1211;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i);
                                        }
                                }
                        }
                }
            } else {
                i2 = 1201;
            }
            return Integer.valueOf(i2);
        }

        @Override // com.ironsource.InterfaceC19778dl
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo53929a(Integer num) {
            return m55589a(num.intValue());
        }
    }

    @Metadata
    /* renamed from: com.ironsource.qp$e */
    /* loaded from: classes6.dex */
    public static final class C20719e {
        @NotNull

        /* renamed from: a */
        public static final C20719e f52641a = new C20719e();

        /* renamed from: b */
        public static final int f52642b = 81500;

        /* renamed from: c */
        public static final int f52643c = 81510;

        /* renamed from: d */
        public static final int f52644d = 81301;

        /* renamed from: e */
        public static final int f52645e = 81300;

        /* renamed from: f */
        public static final int f52646f = 81002;

        /* renamed from: g */
        public static final int f52647g = 88002;

        /* renamed from: h */
        public static final int f52648h = 83003;

        /* renamed from: i */
        public static final int f52649i = 81302;

        /* renamed from: j */
        public static final int f52650j = 81077;

        private C20719e() {
        }
    }
}
