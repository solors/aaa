package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.t9 */
/* loaded from: classes9.dex */
public abstract class AbstractC34905t9 {

    /* renamed from: a */
    public static final Set f95391a;

    /* renamed from: b */
    public static final EnumSet f95392b;

    /* renamed from: c */
    public static final EnumSet f95393c;

    /* renamed from: d */
    public static final EnumSet f95394d;

    /* renamed from: e */
    public static final EnumSet f95395e;

    /* renamed from: f */
    public static final EnumSet f95396f;

    /* renamed from: g */
    public static final EnumSet f95397g;

    /* renamed from: h */
    public static final EnumSet f95398h;

    /* renamed from: i */
    public static final List f95399i;

    /* renamed from: j */
    public static final List f95400j;

    static {
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC34324Xa enumC34324Xa2 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC34324Xa enumC34324Xa3 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC34324Xa enumC34324Xa4 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC34324Xa enumC34324Xa5 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        EnumC34324Xa enumC34324Xa6 = EnumC34324Xa.EVENT_TYPE_ANR;
        f95391a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC34324Xa enumC34324Xa7 = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        EnumC34324Xa enumC34324Xa8 = EnumC34324Xa.EVENT_TYPE_PURGE_BUFFER;
        EnumC34324Xa enumC34324Xa9 = EnumC34324Xa.EVENT_TYPE_SEND_REFERRER;
        EnumC34324Xa enumC34324Xa10 = EnumC34324Xa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC34324Xa enumC34324Xa11 = EnumC34324Xa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC34324Xa enumC34324Xa12 = EnumC34324Xa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC34324Xa enumC34324Xa13 = EnumC34324Xa.EVENT_TYPE_SET_SESSION_EXTRA;
        f95392b = EnumSet.of(enumC34324Xa7, enumC34324Xa8, enumC34324Xa9, enumC34324Xa10, enumC34324Xa11, EnumC34324Xa.EVENT_TYPE_ACTIVATION, enumC34324Xa12, enumC34324Xa13);
        f95393c = EnumSet.of(EnumC34324Xa.EVENT_TYPE_UPDATE_FOREGROUND_TIME, enumC34324Xa4);
        EnumC34324Xa enumC34324Xa14 = EnumC34324Xa.EVENT_TYPE_REGULAR;
        f95394d = EnumSet.of(enumC34324Xa4, enumC34324Xa5, enumC34324Xa3, enumC34324Xa, enumC34324Xa2, EnumC34324Xa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, enumC34324Xa12, enumC34324Xa14, EnumC34324Xa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC34324Xa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC34324Xa.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC34324Xa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC34324Xa8, EnumC34324Xa.EVENT_TYPE_INIT, EnumC34324Xa.EVENT_TYPE_SEND_USER_PROFILE, EnumC34324Xa.EVENT_TYPE_SET_USER_PROFILE_ID, enumC34324Xa9, enumC34324Xa10, enumC34324Xa11, EnumC34324Xa.EVENT_TYPE_FIRST_ACTIVATION, EnumC34324Xa.EVENT_TYPE_START, EnumC34324Xa.EVENT_TYPE_APP_OPEN, EnumC34324Xa.EVENT_TYPE_APP_UPDATE, enumC34324Xa6);
        f95395e = EnumSet.of(enumC34324Xa14);
        f95396f = EnumSet.of(enumC34324Xa14);
        f95397g = EnumSet.of(enumC34324Xa12);
        f95398h = EnumSet.of(EnumC34324Xa.EVENT_TYPE_ALIVE, enumC34324Xa8, enumC34324Xa13);
        f95399i = Arrays.asList(0, 6145, Integer.valueOf((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN), 8224);
        f95400j = Arrays.asList(12290);
    }
}
