package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public class MessagingAnalytics {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m66610a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(BuildConfig.APPLICATION_ID, 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i(Constants.TAG, "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static MessagingClientEvent m66609b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder messageType = MessagingClientEvent.newBuilder().setTtl(m66595p(extras)).setEvent(event).setInstanceId(m66605f(extras)).setPackageName(m66598m()).setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(m66600k(extras));
        String m66603h = m66603h(extras);
        if (m66603h != null) {
            messageType.setMessageId(m66603h);
        }
        String m66596o = m66596o(extras);
        if (m66596o != null) {
            messageType.setTopic(m66596o);
        }
        String m66608c = m66608c(extras);
        if (m66608c != null) {
            messageType.setCollapseKey(m66608c);
        }
        String m66602i = m66602i(extras);
        if (m66602i != null) {
            messageType.setAnalyticsLabel(m66602i);
        }
        String m66606e = m66606e(extras);
        if (m66606e != null) {
            messageType.setComposerLabel(m66606e);
        }
        long m66597n = m66597n(extras);
        if (m66597n > 0) {
            messageType.setProjectNumber(m66597n);
        }
        return messageType.build();
    }

    @Nullable
    /* renamed from: c */
    static String m66608c(Bundle bundle) {
        return bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @Nullable
    /* renamed from: d */
    static String m66607d(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
    }

    @Nullable
    /* renamed from: e */
    static String m66606e(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    @NonNull
    /* renamed from: f */
    static String m66605f(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.f43179TO);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    /* renamed from: g */
    static String m66604g(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    @Nullable
    /* renamed from: h */
    static String m66603h(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.MSGID);
        if (string == null) {
            return bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        return string;
    }

    @Nullable
    /* renamed from: i */
    static String m66602i(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    @Nullable
    /* renamed from: j */
    static String m66601j(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    @NonNull
    /* renamed from: k */
    static MessagingClientEvent.MessageType m66600k(Bundle bundle) {
        if (bundle != null && NotificationParams.isNotification(bundle)) {
            return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
        }
        return MessagingClientEvent.MessageType.DATA_MESSAGE;
    }

    @NonNull
    /* renamed from: l */
    static String m66599l(Bundle bundle) {
        if (bundle != null && NotificationParams.isNotification(bundle)) {
            return "display";
        }
        return "data";
    }

    public static void logNotificationDismiss(Intent intent) {
        m66591t(Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent.getExtras());
    }

    public static void logNotificationForeground(Intent intent) {
        m66591t(Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent.getExtras());
    }

    public static void logNotificationOpen(Bundle bundle) {
        m66589v(bundle);
        m66591t(Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, bundle);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            m66591t(Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            m66592s(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    @NonNull
    /* renamed from: m */
    static String m66598m() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    @Nullable
    /* renamed from: n */
    static long m66597n(Bundle bundle) {
        if (bundle.containsKey(Constants.MessagePayloadKeys.SENDER_ID)) {
            try {
                return Long.parseLong(bundle.getString(Constants.MessagePayloadKeys.SENDER_ID));
            } catch (NumberFormatException e) {
                Log.w(Constants.TAG, "error parsing project number", e);
            }
        }
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException e2) {
                Log.w(Constants.TAG, "error parsing sender ID", e2);
            }
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            try {
                return Long.parseLong(applicationId);
            } catch (NumberFormatException e3) {
                Log.w(Constants.TAG, "error parsing app ID", e3);
            }
        } else {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w(Constants.TAG, "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    @Nullable
    /* renamed from: o */
    static String m66596o(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.FROM);
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    /* renamed from: p */
    static int m66595p(Bundle bundle) {
        Object obj = bundle.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(Constants.TAG, "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    @Nullable
    /* renamed from: q */
    static String m66594q(Bundle bundle) {
        if (bundle.containsKey(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return bundle.getString(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m66593r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    private static void m66592s(MessagingClientEvent.Event event, Intent intent, @Nullable TransportFactory transportFactory) {
        if (transportFactory == null) {
            Log.e(Constants.TAG, "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        MessagingClientEvent m66609b = m66609b(event, intent);
        if (m66609b == null) {
            return;
        }
        try {
            transportFactory.getTransport(Constants.FirelogAnalytics.FCM_LOG_SOURCE, MessagingClientEventExtension.class, Encoding.m76344of("proto"), new Transformer() { // from class: com.google.firebase.messaging.x
                @Override // com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return ((MessagingClientEventExtension) obj).toByteArray();
                }
            }).send(Event.ofData(MessagingClientEventExtension.newBuilder().setMessagingClientEvent(m66609b).build()));
        } catch (RuntimeException e) {
            Log.w(Constants.TAG, "Failed to send big query analytics payload.", e);
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent != null && !m66593r(intent)) {
            return m66610a();
        }
        return false;
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || m66593r(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    @VisibleForTesting
    /* renamed from: t */
    static void m66591t(String str, Bundle bundle) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m66607d = m66607d(bundle);
            if (m66607d != null) {
                bundle2.putString("_nmid", m66607d);
            }
            String m66606e = m66606e(bundle);
            if (m66606e != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, m66606e);
            }
            String m66602i = m66602i(bundle);
            if (!TextUtils.isEmpty(m66602i)) {
                bundle2.putString("label", m66602i);
            }
            String m66604g = m66604g(bundle);
            if (!TextUtils.isEmpty(m66604g)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, m66604g);
            }
            String m66596o = m66596o(bundle);
            if (m66596o != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_TOPIC, m66596o);
            }
            String m66601j = m66601j(bundle);
            if (m66601j != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(m66601j));
                } catch (NumberFormatException e) {
                    Log.w(Constants.TAG, "Error while parsing timestamp in GCM event", e);
                }
            }
            String m66594q = m66594q(bundle);
            if (m66594q != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(m66594q));
                } catch (NumberFormatException e2) {
                    Log.w(Constants.TAG, "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String m66599l = m66599l(bundle);
            if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, m66599l);
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent("fcm", str, bundle2);
            } else {
                Log.w(Constants.TAG, "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e(Constants.TAG, "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static void m66590u(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences(BuildConfig.APPLICATION_ID, 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    /* renamed from: v */
    private static void m66589v(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (analyticsConnector != null) {
                String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
                analyticsConnector.setUserProperty("fcm", Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                analyticsConnector.logEvent("fcm", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle2);
                return;
            }
            Log.w(Constants.TAG, "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.ENABLED));
    }
}
