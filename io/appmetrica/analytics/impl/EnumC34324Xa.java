package io.appmetrica.analytics.impl;

import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentTransaction;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Xa */
/* loaded from: classes9.dex */
public enum EnumC34324Xa {
    EVENT_TYPE_UNDEFINED(-1, "Unrecognized action"),
    EVENT_TYPE_INIT(0, "First initialization event"),
    EVENT_TYPE_REGULAR(1, "Regular event"),
    EVENT_TYPE_UPDATE_FOREGROUND_TIME(3, "Update foreground time"),
    EVENT_TYPE_ALIVE(7, "App is still alive"),
    EVENT_CLIENT_EXTERNAL_ATTRIBUTION(42, "External attribution event"),
    EVENT_TYPE_SEND_USER_PROFILE(40961, "Send user profile"),
    EVENT_TYPE_SET_USER_PROFILE_ID(40962, "Set user profile ID"),
    EVENT_TYPE_SEND_REVENUE_EVENT(40976, "Send revenue event"),
    EVENT_TYPE_SEND_AD_REVENUE_EVENT(40977, "Send ad revenue event"),
    EVENT_TYPE_SEND_ECOMMERCE_EVENT(41000, "Send e-commerce event"),
    EVENT_TYPE_PURGE_BUFFER(256, "Forcible buffer clearing"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_STARTUP(1536, "Sending the startup due to lack of data"),
    EVENT_TYPE_SEND_REFERRER(FragmentTransaction.TRANSIT_FRAGMENT_OPEN, "Send referrer"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_REQUEST_REFERRER(InputDeviceCompat.SOURCE_TOUCHSCREEN, "Request referrer"),
    EVENT_TYPE_APP_ENVIRONMENT_UPDATED(5376, "App Environment Updated"),
    EVENT_TYPE_APP_ENVIRONMENT_CLEARED(5632, "App Environment Cleared"),
    EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE(5889, "Crash of App, read from file"),
    EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT(5890, "Crash of App, passed to server via intent"),
    EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF(5891, "Crash of App"),
    EVENT_TYPE_EXCEPTION_USER_PROTOBUF(5892, "Error from developer"),
    EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF(5896, "Error from developer with payload"),
    EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF(5897, "Native crash of app from socket"),
    EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF(5898, "Native crash from prev session"),
    EVENT_TYPE_ANR(5968, "ANR"),
    EVENT_TYPE_ACTIVATION(6144, "Activation of metrica"),
    EVENT_TYPE_FIRST_ACTIVATION(6145, "First activation of metrica"),
    EVENT_TYPE_START(6400, "Start of new session"),
    EVENT_TYPE_CUSTOM_EVENT(8192, "Custom event"),
    EVENT_TYPE_SET_SESSION_EXTRA(8193, "Set session extra"),
    EVENT_TYPE_APP_OPEN(8208, "App open event"),
    EVENT_TYPE_APP_UPDATE(8224, "App update event"),
    EVENT_TYPE_PERMISSIONS(12288, "Permissions changed event"),
    EVENT_TYPE_APP_FEATURES(12289, "Features, required by application"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG(16384, "Update pre-activation config"),
    EVENT_TYPE_CLEANUP(12290, "Cleanup database"),
    EVENT_TYPE_WEBVIEW_SYNC(12320, "Counter init event");
    

    /* renamed from: K */
    public static final HashMap f93736K = new HashMap();

    /* renamed from: a */
    public final int f93762a;

    /* renamed from: b */
    public final String f93763b;

    static {
        EnumC34324Xa[] values;
        for (EnumC34324Xa enumC34324Xa : values()) {
            f93736K.put(Integer.valueOf(enumC34324Xa.f93762a), enumC34324Xa);
        }
    }

    EnumC34324Xa(int i, String str) {
        this.f93762a = i;
        this.f93763b = str;
    }

    /* renamed from: a */
    public final int m22103a() {
        return this.f93762a;
    }

    /* renamed from: a */
    public static EnumC34324Xa m22102a(int i) {
        EnumC34324Xa enumC34324Xa = (EnumC34324Xa) f93736K.get(Integer.valueOf(i));
        return enumC34324Xa == null ? EVENT_TYPE_UNDEFINED : enumC34324Xa;
    }
}
