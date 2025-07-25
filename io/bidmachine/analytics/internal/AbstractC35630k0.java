package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.internal.C35620j0;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.NoWhenBranchMatchedException;
import p804nd.Result;

/* renamed from: io.bidmachine.analytics.internal.k0 */
/* loaded from: classes9.dex */
public abstract class AbstractC35630k0 {

    /* renamed from: io.bidmachine.analytics.internal.k0$a */
    /* loaded from: classes9.dex */
    public /* synthetic */ class C35631a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96518a;

        static {
            int[] iArr = new int[C35620j0.EnumC35621a.values().length];
            try {
                iArr[C35620j0.EnumC35621a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C35620j0.EnumC35621a.MONITOR_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C35620j0.EnumC35621a.MONITOR_NO_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C35620j0.EnumC35621a.MONITOR_BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C35620j0.EnumC35621a.READER_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C35620j0.EnumC35621a.READER_NO_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C35620j0.EnumC35621a.READER_BAD_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C35620j0.EnumC35621a.READER_NO_ACCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f96518a = iArr;
        }
    }

    /* renamed from: a */
    private static final int m20163a(C35620j0.EnumC35621a enumC35621a) {
        switch (C35631a.f96518a[enumC35621a.ordinal()]) {
            case 1:
                return 2000;
            case 2:
                return 2100;
            case 3:
                return 2101;
            case 4:
                return 2102;
            case 5:
                return 2200;
            case 6:
                return 2201;
            case 7:
                return 2202;
            case 8:
                return 2203;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private static final C35620j0.EnumC35621a m20164a(int i) {
        switch (i) {
            case 2100:
                return C35620j0.EnumC35621a.MONITOR_INVALID;
            case 2101:
                return C35620j0.EnumC35621a.MONITOR_NO_CONTENT;
            case 2102:
                return C35620j0.EnumC35621a.MONITOR_BAD_CONTENT;
            default:
                switch (i) {
                    case 2200:
                        return C35620j0.EnumC35621a.READER_INVALID;
                    case 2201:
                        return C35620j0.EnumC35621a.READER_NO_CONTENT;
                    case 2202:
                        return C35620j0.EnumC35621a.READER_BAD_CONTENT;
                    case 2203:
                        return C35620j0.EnumC35621a.READER_NO_ACCESS;
                    default:
                        return C35620j0.EnumC35621a.UNKNOWN;
                }
        }
    }

    /* renamed from: a */
    public static final JSONObject m20162a(C35620j0 c35620j0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", c35620j0.m20187a());
        jSONObject.put("type", m20163a(c35620j0.m20185c()));
        jSONObject.put("reason", c35620j0.m20186b());
        return jSONObject;
    }

    /* renamed from: a */
    public static final C35620j0 m20161a(JSONObject jSONObject) {
        Object m14549b;
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(new C35620j0(jSONObject.getString("name"), m20164a(jSONObject.getInt("type")), jSONObject.optString("reason")));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (C35620j0) m14549b;
    }
}
