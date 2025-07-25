package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.j */
/* loaded from: classes3.dex */
public abstract class AbstractC9970j {

    /* renamed from: com.chartboost.sdk.impl.j$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9971a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22378a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22379b;

        static {
            int[] iArr = new int[CBError.EnumC10416b.values().length];
            try {
                iArr[CBError.EnumC10416b.f23704c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.EnumC10416b.f23709h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.EnumC10416b.f23710i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.EnumC10416b.f23711j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.EnumC10416b.f23712k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.EnumC10416b.f23713l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CBError.EnumC10416b.f23715n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CBError.EnumC10416b.f23716o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CBError.EnumC10416b.f23717p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CBError.EnumC10416b.f23720s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CBError.EnumC10416b.f23721t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CBError.EnumC10416b.f23723v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CBError.EnumC10416b.f23694B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CBError.EnumC10416b.f23697E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CBError.EnumC10416b.f23698F.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CBError.EnumC10416b.f23699G.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f22378a = iArr;
            int[] iArr2 = new int[CBError.EnumC10415a.values().length];
            try {
                iArr2[CBError.EnumC10415a.f23687b.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CBError.EnumC10415a.f23688c.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f22379b = iArr2;
        }
    }

    /* renamed from: a */
    public static final ClickError m81359a(CBError.EnumC10415a error, String errorMsg) {
        ClickError.Code code;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        int i = C9971a.f22379b[error.ordinal()];
        if (i == 1) {
            code = ClickError.Code.URI_INVALID;
        } else if (i != 2) {
            code = ClickError.Code.INTERNAL;
        } else {
            code = ClickError.Code.URI_UNRECOGNIZED;
        }
        return new ClickError(code, new Exception(errorMsg));
    }

    /* renamed from: a */
    public static final CacheError m81357a(CBError.InterfaceC10418d error) {
        CacheError.Code code;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error == CBError.EnumC10416b.f23704c) {
            code = CacheError.Code.INTERNET_UNAVAILABLE;
        } else if (error == CBError.EnumC10416b.f23705d) {
            code = CacheError.Code.NETWORK_FAILURE;
        } else if (error == CBError.EnumC10416b.f23708g) {
            code = CacheError.Code.NETWORK_FAILURE;
        } else if (error == CBError.EnumC10416b.f23709h) {
            code = CacheError.Code.NO_AD_FOUND;
        } else if (error == CBError.EnumC10416b.f23710i) {
            code = CacheError.Code.SESSION_NOT_STARTED;
        } else if (error == CBError.EnumC10416b.f23718q) {
            code = CacheError.Code.SERVER_ERROR;
        } else if (error == CBError.EnumC10416b.f23719r) {
            code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
        } else if (error == CBError.EnumC10416b.f23724w) {
            code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
        } else if (error == CBError.EnumC10416b.f23696D) {
            code = CacheError.Code.ASSET_DOWNLOAD_FAILURE;
        } else {
            code = error == CBError.EnumC10416b.f23700H ? CacheError.Code.INTERNET_UNAVAILABLE : CacheError.Code.INTERNAL;
        }
        return new CacheError(code, null, 2, null);
    }

    /* renamed from: a */
    public static final ShowError m81358a(CBError.EnumC10416b error) {
        ShowError.Code code;
        Intrinsics.checkNotNullParameter(error, "error");
        switch (C9971a.f22378a[error.ordinal()]) {
            case 1:
                code = ShowError.Code.INTERNET_UNAVAILABLE;
                break;
            case 2:
                code = ShowError.Code.NO_CACHED_AD;
                break;
            case 3:
                code = ShowError.Code.SESSION_NOT_STARTED;
                break;
            case 4:
                code = ShowError.Code.AD_ALREADY_VISIBLE;
                break;
            case 5:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 6:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 7:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 8:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 9:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 10:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 11:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 12:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 13:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 14:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 15:
                code = ShowError.Code.PRESENTATION_FAILURE;
                break;
            case 16:
                code = ShowError.Code.INTERNET_UNAVAILABLE;
                break;
            default:
                code = ShowError.Code.INTERNAL;
                break;
        }
        return new ShowError(code, null, 2, null);
    }
}
