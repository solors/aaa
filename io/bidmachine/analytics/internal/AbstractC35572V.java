package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.internal.C35620j0;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.bidmachine.analytics.internal.V */
/* loaded from: classes9.dex */
public abstract class AbstractC35572V {

    /* renamed from: io.bidmachine.analytics.internal.V$a */
    /* loaded from: classes9.dex */
    public /* synthetic */ class C35573a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96390a;

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
            f96390a = iArr;
        }
    }

    /* renamed from: a */
    public static final ErrorReasonAnalytics m20305a(C35620j0.EnumC35621a enumC35621a) {
        switch (C35573a.f96390a[enumC35621a.ordinal()]) {
            case 1:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_INVALID;
            case 2:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED;
            case 3:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT;
            case 4:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT;
            case 5:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_UNDEFINED;
            case 6:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_CONTENT;
            case 7:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT;
            case 8:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_ACCESS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
