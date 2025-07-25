package p772l6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationManagerCompat;
import com.ironsource.C21114v8;
import com.learnings.unity.push.BuildConfig;
import com.meevii.push.data.NotificationBean;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import com.meevii.push.notification.RemoteNotification;
import com.meevii.push.permission.PushPermissionManager;
import com.meevii.push.provider.HmsContentProvider;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.Calendar;
import java.util.concurrent.CopyOnWriteArrayList;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import p1039x6.DefaultDisplayNotification;
import p636d7.PushUtil;
import p786m6.RemoteChannel;
import p844q6.DataManager;

/* renamed from: l6.d */
/* loaded from: classes5.dex */
public class PushEvent {

    /* renamed from: a */
    private static IEventSend f99987a;

    /* renamed from: b */
    private static CopyOnWriteArrayList<EventCacheModel> f99988b;

    /* renamed from: a */
    private static void m15673a(String str, Bundle bundle) {
        if (f99988b == null) {
            f99988b = new CopyOnWriteArrayList<>();
        }
        f99988b.add(new EventCacheModel(str, bundle));
    }

    /* renamed from: b */
    private static String m15672b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "void";
        }
        return str;
    }

    /* renamed from: c */
    public static void m15671c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString(C21114v8.C21122h.f54038L, m15672b(str));
        m15658p("hms_full_screen_permission", bundle);
    }

    /* renamed from: d */
    public static void m15670d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString("error", str);
        m15658p("hms_full_screen_permission_error", bundle);
    }

    /* renamed from: e */
    public static void m15669e(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString(C21114v8.C21122h.f54038L, m15672b(PushPermissionManager.m47887a().m47886b()));
        bundle.putInt("state", i);
        m15658p("hms_full_screen_permission_result", bundle);
    }

    /* renamed from: f */
    public static void m15668f(IEventSend iEventSend) {
        f99987a = iEventSend;
        if (iEventSend == null) {
            f99987a = new LogEventSend();
        }
        m15659o();
    }

    /* renamed from: g */
    public static void m15667g(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        NotificationBean m25686e;
        DataManager.m12928g().m12922m(context);
        Bundle bundle = new Bundle();
        String str6 = "";
        if (intent != null) {
            str = intent.getStringExtra("hms_source");
            if (intent.hasExtra(RemoteNotification.MEEVII_PUSH_DATA_KEY)) {
                str = "push";
            }
            str3 = intent.getStringExtra("hms_type");
            if ("local".equals(str3)) {
                str6 = intent.getStringExtra("local_push_event_id");
                str2 = intent.getStringExtra("local_push_content_id");
            } else if (!CustomTabsCallback.ONLINE_EXTRAS_KEY.equals(str3) || (m25686e = PushUtil.m25686e(intent)) == null) {
                str2 = "";
            } else {
                str6 = m25686e.m47976l();
                str2 = m25686e.m47978j();
            }
        } else {
            str = null;
            str2 = "";
            str3 = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("source", str);
        } else {
            bundle.putString("source", "normal");
        }
        bundle.putString("type", m15672b(str3));
        bundle.putString("push_id", m15672b(str6));
        bundle.putString("content_id", m15672b(str2));
        long m12926i = DataManager.m12928g().m12926i("hms_app_start_time", 0L);
        boolean z = true;
        if (m12926i > 0) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(m12926i);
            z = true ^ PushUtil.m25683h(calendar, calendar2);
        }
        DataManager.m12928g().m12914u("hms_app_start_time", System.currentTimeMillis());
        if (z) {
            str4 = "yes";
        } else {
            str4 = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
        }
        bundle.putString(C26484a.f69241x, str4);
        if (PushUtil.m25690a(context, DefaultDisplayNotification.DEFAULT_CHANNEL_ID)) {
            str5 = "on";
        } else {
            str5 = "off";
        }
        bundle.putString("permissions", str5);
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        m15658p("hms_app_start", bundle);
    }

    /* renamed from: h */
    public static void m15666h(Intent intent, Context context) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String stringExtra = intent.getStringExtra("hms_type");
        String str6 = "normal_float";
        String str7 = "";
        String str8 = "normal";
        String str9 = "text";
        boolean z = false;
        if ("local".equals(stringExtra)) {
            i = intent.getIntExtra("local_push_notification_id", -1);
            String stringExtra2 = intent.getStringExtra("local_push_event_id");
            String stringExtra3 = intent.getStringExtra("local_push_content_id");
            NotificationContentEntity m25685f = PushUtil.m25685f(intent);
            if (m25685f != null) {
                if (!m25685f.m47920w()) {
                    str6 = "normal";
                }
                str9 = m25685f.m47928o();
                str7 = m25685f.m47923t();
                z = m25685f.m47919x();
                str8 = str6;
            }
            str2 = str9;
            str = stringExtra2;
            str3 = str7;
            str4 = str8;
            str5 = stringExtra3;
        } else {
            NotificationBean m25686e = PushUtil.m25686e(intent);
            if (m25686e == null) {
                str = "";
                str2 = "text";
                i = -1;
                str3 = str;
                str4 = "normal";
                str5 = str3;
            } else {
                i = m25686e.m47972p();
                String m47976l = m25686e.m47976l();
                String m47978j = m25686e.m47978j();
                if (!m25686e.m47969s()) {
                    str6 = "normal";
                }
                String m47973o = m25686e.m47973o();
                String m15369e = RemoteChannel.m15369e(m25686e.m47971q());
                z = m25686e.m47968t();
                str2 = m47973o;
                str5 = m47978j;
                str3 = m15369e;
                str4 = str6;
                str = m47976l;
            }
        }
        if (i != -1) {
            NotificationManagerCompat.from(context).cancel(i);
        }
        m15665i(str, str4, stringExtra, str5, str3, z, str2);
    }

    /* renamed from: i */
    public static void m15665i(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        Bundle bundle = new Bundle();
        bundle.putString("push_id", m15672b(str));
        bundle.putString("type", str3);
        bundle.putString("style", str2);
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString("content_id", m15672b(str4));
        bundle.putString("kind", str6);
        boolean isEmpty = TextUtils.isEmpty(str5);
        String str7 = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
        if (isEmpty) {
            bundle.putString("voice", SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        } else {
            bundle.putString("voice", str5);
        }
        if (z) {
            str7 = "yes";
        }
        bundle.putString("vibration", str7);
        m15658p("hms_push_click", bundle);
    }

    /* renamed from: j */
    public static void m15664j(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putInt("state", i);
        bundle.putString(C21114v8.C21122h.f54038L, m15672b(PushPermissionManager.m47887a().m47884d()));
        m15658p("hms_btn_click", bundle);
    }

    /* renamed from: k */
    public static void m15663k(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putInt("state", i);
        m15658p("hms_guidebtn_click", bundle);
    }

    /* renamed from: l */
    public static void m15662l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString("type", str);
        bundle.putString(C21114v8.C21122h.f54038L, m15672b(str2));
        m15658p("hms_request_permission", bundle);
    }

    /* renamed from: m */
    public static void m15661m(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString("error", str);
        m15658p("hms_request_permission_error", bundle);
    }

    /* renamed from: n */
    public static void m15660n(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("push_id", m15672b(str));
        bundle.putString("type", str2);
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString("content_id", m15672b(str3));
        m15658p("hms_push_receive", bundle);
    }

    /* renamed from: o */
    private static void m15659o() {
        while (true) {
            CopyOnWriteArrayList<EventCacheModel> copyOnWriteArrayList = f99988b;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                EventCacheModel remove = f99988b.remove(0);
                f99987a.sendEvent(remove.m15674b(), remove.m15675a());
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private static void m15658p(String str, Bundle bundle) {
        IEventSend iEventSend = f99987a;
        if (iEventSend != null) {
            iEventSend.sendEvent(str, bundle);
        } else {
            m15673a(str, bundle);
        }
    }

    /* renamed from: q */
    public static void m15657q(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        String str7;
        Bundle bundle = new Bundle();
        bundle.putString("push_id", str);
        bundle.putString("style", str2);
        bundle.putString("type", str3);
        String str8 = "yes";
        if (HmsContentProvider.isAppEnterFront) {
            str7 = "yes";
        } else {
            str7 = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
        }
        bundle.putString("is_started", str7);
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        bundle.putString("content_id", m15672b(str4));
        bundle.putString("kind", str6);
        if (TextUtils.isEmpty(str5)) {
            bundle.putString("voice", SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        } else {
            bundle.putString("voice", str5);
        }
        if (!z) {
            str8 = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
        }
        bundle.putString("vibration", str8);
        m15658p("hms_push_show", bundle);
    }

    /* renamed from: r */
    public static void m15656r(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("push_id", m15672b(str));
        bundle.putInt("reason", i);
        bundle.putString("type", str2);
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        m15658p("hms_push_show_fail", bundle);
    }

    /* renamed from: s */
    public static void m15655s(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("push_id", m15672b(str));
        bundle.putString("type", str3);
        bundle.putString("reason", str2);
        bundle.putString("msg", str4);
        bundle.putString("sdk_version", BuildConfig.VERSION_NAME);
        m15658p("hms_show_unusual", bundle);
    }
}
