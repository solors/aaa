package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ii */
/* loaded from: classes6.dex */
public interface InterfaceC20100ii extends InterfaceC19778dl<Integer, Integer> {

    @Metadata
    /* renamed from: com.ironsource.ii$a */
    /* loaded from: classes6.dex */
    public static final class C20101a {
        @NotNull

        /* renamed from: a */
        public static final C20101a f50595a = new C20101a();

        /* renamed from: b */
        public static final int f50596b = 2201;

        /* renamed from: c */
        public static final int f50597c = 2203;

        /* renamed from: d */
        public static final int f50598d = 2005;

        /* renamed from: e */
        public static final int f50599e = 2210;

        /* renamed from: f */
        public static final int f50600f = 2006;

        /* renamed from: g */
        public static final int f50601g = 2204;

        /* renamed from: h */
        public static final int f50602h = 2507;

        /* renamed from: i */
        public static final int f50603i = 2211;

        /* renamed from: j */
        public static final int f50604j = 2212;

        private C20101a() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.ii$b */
    /* loaded from: classes6.dex */
    public static final class C20102b {
        @NotNull

        /* renamed from: a */
        public static final C20102b f50605a = new C20102b();

        /* renamed from: b */
        public static final int f50606b = 2002;

        /* renamed from: c */
        public static final int f50607c = 2003;

        /* renamed from: d */
        public static final int f50608d = 2200;

        /* renamed from: e */
        public static final int f50609e = 2503;

        /* renamed from: f */
        public static final int f50610f = 2300;

        private C20102b() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.ii$c */
    /* loaded from: classes6.dex */
    public static final class C20103c implements InterfaceC20100ii {
        @NotNull
        /* renamed from: a */
        public Integer m57977a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = 2503;
            } else if (i == 401) {
                i2 = 2201;
            } else if (i == 410) {
                i2 = 2211;
            } else if (i != 411) {
                switch (i) {
                    case 101:
                        i2 = 82500;
                        break;
                    case 102:
                        i2 = 82510;
                        break;
                    case 103:
                        i2 = 82301;
                        break;
                    case 104:
                        i2 = 82300;
                        break;
                    case 105:
                        i2 = 82002;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case 110:
                                i2 = 83004;
                                break;
                            case 111:
                                i2 = 82302;
                                break;
                            case 112:
                                i2 = C20104d.f50620j;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 2002;
                                        break;
                                    case 202:
                                        i2 = 2003;
                                        break;
                                    case 203:
                                        i2 = 2200;
                                        break;
                                    case 204:
                                        i2 = 2300;
                                        break;
                                    default:
                                        switch (i) {
                                            case 403:
                                                i2 = 2203;
                                                break;
                                            case 404:
                                                i2 = 2005;
                                                break;
                                            case 405:
                                                i2 = 2210;
                                                break;
                                            case 406:
                                                i2 = 2006;
                                                break;
                                            case 407:
                                                i2 = 2204;
                                                break;
                                            case 408:
                                                i2 = 2507;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i);
                                        }
                                }
                        }
                }
            } else {
                i2 = 2212;
            }
            return Integer.valueOf(i2);
        }

        @Override // com.ironsource.InterfaceC19778dl
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo53929a(Integer num) {
            return m57977a(num.intValue());
        }
    }

    @Metadata
    /* renamed from: com.ironsource.ii$d */
    /* loaded from: classes6.dex */
    public static final class C20104d {
        @NotNull

        /* renamed from: a */
        public static final C20104d f50611a = new C20104d();

        /* renamed from: b */
        public static final int f50612b = 82500;

        /* renamed from: c */
        public static final int f50613c = 82510;

        /* renamed from: d */
        public static final int f50614d = 82300;

        /* renamed from: e */
        public static final int f50615e = 82002;

        /* renamed from: f */
        public static final int f50616f = 83004;

        /* renamed from: g */
        public static final int f50617g = 88002;

        /* renamed from: h */
        public static final int f50618h = 82301;

        /* renamed from: i */
        public static final int f50619i = 82302;

        /* renamed from: j */
        public static final int f50620j = 82076;

        private C20104d() {
        }
    }
}
