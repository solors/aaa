package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.r6 */
/* loaded from: classes6.dex */
public interface InterfaceC20741r6 extends InterfaceC19778dl<Integer, Integer> {

    @Metadata
    /* renamed from: com.ironsource.r6$a */
    /* loaded from: classes6.dex */
    public static final class C20742a {
        @NotNull

        /* renamed from: a */
        public static final C20742a f52711a = new C20742a();

        /* renamed from: b */
        public static final int f52712b = 3009;

        /* renamed from: c */
        public static final int f52713c = 3008;

        private C20742a() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.r6$b */
    /* loaded from: classes6.dex */
    public static final class C20743b {
        @NotNull

        /* renamed from: a */
        public static final C20743b f52714a = new C20743b();

        /* renamed from: b */
        public static final int f52715b = 3002;

        /* renamed from: c */
        public static final int f52716c = 3005;

        /* renamed from: d */
        public static final int f52717d = 3300;

        /* renamed from: e */
        public static final int f52718e = 3503;

        private C20743b() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.r6$c */
    /* loaded from: classes6.dex */
    public static final class C20744c implements InterfaceC20741r6 {
        @NotNull
        /* renamed from: a */
        public Integer m55546a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = 3503;
            } else if (i == 405) {
                i2 = 3009;
            } else if (i != 406) {
                switch (i) {
                    case 101:
                        i2 = 83500;
                        break;
                    case 102:
                        i2 = 83510;
                        break;
                    case 103:
                        i2 = C20745d.f52726h;
                        break;
                    case 104:
                        i2 = 83300;
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
                                break;
                            case 112:
                                i2 = 3305;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 3002;
                                        break;
                                    case 202:
                                        i2 = 3005;
                                        break;
                                    case 203:
                                        i2 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i);
                                }
                        }
                    case 105:
                        i2 = 83302;
                        break;
                }
            } else {
                i2 = 3008;
            }
            return Integer.valueOf(i2);
        }

        @Override // com.ironsource.InterfaceC19778dl
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo53929a(Integer num) {
            return m55546a(num.intValue());
        }
    }

    @Metadata
    /* renamed from: com.ironsource.r6$d */
    /* loaded from: classes6.dex */
    public static final class C20745d {
        @NotNull

        /* renamed from: a */
        public static final C20745d f52719a = new C20745d();

        /* renamed from: b */
        public static final int f52720b = 83500;

        /* renamed from: c */
        public static final int f52721c = 83510;

        /* renamed from: d */
        public static final int f52722d = 83300;

        /* renamed from: e */
        public static final int f52723e = 83302;

        /* renamed from: f */
        public static final int f52724f = 83004;

        /* renamed from: g */
        public static final int f52725g = 88002;

        /* renamed from: h */
        public static final int f52726h = 83301;

        /* renamed from: i */
        public static final int f52727i = 83302;

        /* renamed from: j */
        public static final int f52728j = 3305;

        private C20745d() {
        }
    }
}
