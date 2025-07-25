package com.pubmatic.sdk.monitor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.Html;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.p552ot.pubsub.p553a.C26484a;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.monitor.IPOBMonitorService;
import com.pubmatic.sdk.monitor.POBActivityLifeCycleMonitor;
import com.pubmatic.sdk.monitor.POBMonitorView;
import com.pubmatic.sdk.monitor.POBMonitorWebView;
import com.pubmatic.sdk.webrendering.p566ui.POBFullScreenDialog;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes7.dex */
public class POBMonitor {
    private static final String PACKAGE_NAME = "com.pubmatic.openwrapapp";
    private static final String SERVER_DOMAIN = "https://ads.pubmatic.com";
    private static final String SERVICE_ACTION = "com.pubmatic.openwrapapp.POBMonitorService";
    private static final String TAG = "POBMonitor";
    private static final String URL_PATH = "/openbidsdk/monitor/app.html";
    private static Application application;
    @Nullable
    private static C26752i monitorData;
    @Nullable
    private static ServiceConnection serviceConnection;
    @Nullable
    private POBFullScreenDialog dialog;
    private POBActivityLifeCycleMonitor monitorUIDelegate;
    @Nullable
    private POBMonitorView monitorView;
    @Nullable
    private POBMonitorView previousMonitorView;
    private Point touchPointLocation;
    @Nullable
    private POBMonitorWebView webView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$a */
    /* loaded from: classes7.dex */
    public class RunnableC26744a implements Runnable {
        RunnableC26744a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMonitor.internalLoad();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$b */
    /* loaded from: classes7.dex */
    public class RunnableC26745b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C26752i f70362a;

        /* renamed from: b */
        final /* synthetic */ String f70363b;

        RunnableC26745b(C26752i c26752i, String str) {
            this.f70362a = c26752i;
            this.f70363b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new POBMonitor(this.f70362a, null).init(this.f70363b);
                POBLog.debug(POBMonitor.TAG, "Monitor console loaded successfully", new Object[0]);
            } catch (Exception e) {
                POBLog.debug(POBMonitor.TAG, e.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$c */
    /* loaded from: classes7.dex */
    public class C26746c implements POBLog.POBLogging {
        C26746c() {
        }

        @Override // com.pubmatic.sdk.common.log.POBLog.POBLogging
        public void log(POBLog.POBLogMessage pOBLogMessage) {
            JSONObject logData = POBMonitor.getLogData(pOBLogMessage);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(logData);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", jSONArray);
            } catch (JSONException unused) {
                POBLog.warn(POBMonitor.TAG, "Not able to push data to js.", new Object[0]);
            }
            if (jSONObject.length() > 0) {
                POBUtils.runOnMainThread(new RunnableC26760a(this, jSONObject));
            } else {
                POBLog.warn(POBMonitor.TAG, "Not able to push data to js.", new Object[0]);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$d */
    /* loaded from: classes7.dex */
    class C26747d implements POBMonitorWebView.InterfaceC26759e {
        C26747d() {
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorWebView.InterfaceC26759e
        /* renamed from: a */
        public void mo40491a() {
            if (POBMonitor.this.monitorUIDelegate.getCurrentActivity() != null) {
                POBMonitor pOBMonitor = POBMonitor.this;
                pOBMonitor.addButton(pOBMonitor.monitorUIDelegate.getCurrentActivity());
            }
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorWebView.InterfaceC26759e
        /* renamed from: b */
        public void mo40490b() {
            POBMonitor.this.invalidateMonitorConsole();
        }
    }

    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$e */
    /* loaded from: classes7.dex */
    class C26748e implements POBActivityLifeCycleMonitor.InterfaceC26743a {
        C26748e() {
        }

        @Override // com.pubmatic.sdk.monitor.POBActivityLifeCycleMonitor.InterfaceC26743a
        /* renamed from: a */
        public void mo40505a(Activity activity) {
            POBMonitor.this.invalidateMonitorConsole();
        }

        @Override // com.pubmatic.sdk.monitor.POBActivityLifeCycleMonitor.InterfaceC26743a
        public void onActivityPaused(Activity activity) {
            POBMonitor.this.clearPreviousMonitorView();
        }

        @Override // com.pubmatic.sdk.monitor.POBActivityLifeCycleMonitor.InterfaceC26743a
        public void onActivityResumed(Activity activity) {
            POBMonitor.this.addButton(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$f */
    /* loaded from: classes7.dex */
    public class C26749f implements POBMonitorView.InterfaceC26754b {

        /* renamed from: a */
        final /* synthetic */ Activity f70367a;

        C26749f(Activity activity) {
            this.f70367a = activity;
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorView.InterfaceC26754b
        /* renamed from: a */
        public void mo40495a() {
            POBMonitor.this.invalidateMonitorConsole();
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorView.InterfaceC26754b
        /* renamed from: b */
        public void mo40494b() {
            POBMonitor.this.showDialog(this.f70367a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$g */
    /* loaded from: classes7.dex */
    public class C26750g implements POBFullScreenDialog.OnDialogCloseListener {
        C26750g() {
        }

        @Override // com.pubmatic.sdk.webrendering.p566ui.POBFullScreenDialog.OnDialogCloseListener
        public void onClose() {
            ViewGroup viewGroup;
            if (POBMonitor.this.webView != null && (viewGroup = (ViewGroup) POBMonitor.this.webView.getParent()) != null) {
                viewGroup.removeView(POBMonitor.this.webView);
            }
            POBMonitor.this.dialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$i */
    /* loaded from: classes7.dex */
    public static class C26752i {

        /* renamed from: a */
        private String f70370a;

        /* renamed from: b */
        private Integer f70371b;
        @Nullable

        /* renamed from: c */
        private String f70372c;

        private C26752i() {
            this.f70370a = "";
            this.f70371b = 0;
        }

        /* synthetic */ C26752i(RunnableC26744a runnableC26744a) {
            this();
        }
    }

    /* synthetic */ POBMonitor(C26752i c26752i, RunnableC26744a runnableC26744a) {
        this(c26752i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(Activity activity) {
        clearPreviousMonitorView();
        C26752i c26752i = monitorData;
        if (c26752i != null && (c26752i.f70371b.intValue() & 1) == 0) {
            return;
        }
        POBMonitorWebView pOBMonitorWebView = this.webView;
        if (pOBMonitorWebView != null && pOBMonitorWebView.isLoaded && activity != null) {
            POBMonitorView pOBMonitorView = new POBMonitorView(activity, this.touchPointLocation);
            this.monitorView = pOBMonitorView;
            pOBMonitorView.setListener(new C26749f(activity));
            this.monitorView.bringToFront();
            this.previousMonitorView = this.monitorView;
            POBLog.debug(TAG, "Touch point attached", new Object[0]);
            return;
        }
        POBLog.debug(TAG, "Not ready yet to attach touch Point", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousMonitorView() {
        POBMonitorView pOBMonitorView = this.previousMonitorView;
        if (pOBMonitorView != null && pOBMonitorView.getParent() != null) {
            this.touchPointLocation = this.previousMonitorView.getTouchPointLocation();
            ((ViewGroup) this.previousMonitorView.getParent()).removeView(this.previousMonitorView);
            this.previousMonitorView = null;
            return;
        }
        this.touchPointLocation = new Point(0, 0);
    }

    private static String encode(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(Html.escapeHtml(str), StandardCharsets.UTF_8.toString()).replaceAll("\\+", "%20").replaceAll("\\%21", "!").replaceAll("\\%27", "'").replaceAll("\\%28", "(").replaceAll("\\%29", ")").replaceAll("\\%7E", "~");
    }

    @Nullable
    @SuppressLint({"PrivateApi"})
    private static Application getApplicationUsingReflection() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            POBLog.debug(TAG, "Exception occurred while fetching the Application Instance. Message -> ", e.getMessage());
            return null;
        }
    }

    @Nullable
    private static C26752i getFromBluetoothDeviceName() {
        try {
            String string = Settings.Secure.getString(application.getContentResolver(), "bluetooth_name");
            POBLog.verbose(TAG, "monitorKey: from Bluetooth - " + string, new Object[0]);
            return process(string);
        } catch (Exception e) {
            POBLog.debug(TAG, "Exception occurs while fetching the bluetooth device name. " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static JSONObject getLogData(POBLog.POBLogMessage pOBLogMessage) {
        try {
            Field logField = getLogField(pOBLogMessage.getClass(), "mLogLevel");
            Field logField2 = getLogField(pOBLogMessage.getClass(), "mMsg");
            Field logField3 = getLogField(pOBLogMessage.getClass(), "mTAG");
            Field logField4 = getLogField(pOBLogMessage.getClass(), "SDK_TAG");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("logLevel", logField.get(pOBLogMessage));
            jSONObject.put("message", encode((String) logField2.get(pOBLogMessage)));
            jSONObject.put("file", logField3.get(pOBLogMessage));
            jSONObject.put("sdk_tag", logField4.get(pOBLogMessage));
            jSONObject.put("line", "");
            jSONObject.put("function", "");
            return jSONObject;
        } catch (Exception e) {
            POBLog.warn(TAG, e.getMessage(), new Object[0]);
            return null;
        }
    }

    private static Field getLogField(Class<?> cls, String str) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init(String str) {
        POBMonitorWebView pOBMonitorWebView = this.webView;
        if (pOBMonitorWebView != null) {
            pOBMonitorWebView.loadUrl(str);
        }
        POBLog.addLogger(logger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void internalLoad() {
        Application applicationUsingReflection = getApplicationUsingReflection();
        if (applicationUsingReflection != null) {
            application = applicationUsingReflection;
            if (monitorData == null) {
                monitorData = getFromBluetoothDeviceName();
            }
            if (monitorData == null) {
                registerToolAppService();
            } else {
                loadMonitorModule();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateMonitorConsole() {
        POBFullScreenDialog pOBFullScreenDialog = this.dialog;
        if (pOBFullScreenDialog != null) {
            pOBFullScreenDialog.dismiss();
            this.dialog = null;
        }
        clearPreviousMonitorView();
        this.monitorView = null;
        this.monitorUIDelegate.reset();
        serviceConnection = null;
    }

    public static void load() {
        POBUtils.runOnBackgroundThread(new RunnableC26744a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadMonitorModule() {
        String str;
        try {
            C26752i c26752i = monitorData;
            if (c26752i != null) {
                String str2 = c26752i.f70372c;
                if (str2 != null) {
                    str = str2 + URL_PATH;
                } else {
                    str = "https://ads.pubmatic.com/openbidsdk/monitor/app.html";
                }
                String format = String.format("%s?plugins=%d&pubId=%s&bundleId=%s&ifa=%s", str, monitorData.f70371b, monitorData.f70370a, application.getPackageName(), Settings.Secure.getString(application.getContentResolver(), C26484a.f69184A));
                OpenWrapSDK.setLogLevel(OpenWrapSDK.LogLevel.All);
                POBUtils.runOnMainThread(new RunnableC26745b(monitorData, format));
            }
        } catch (Exception e) {
            POBLog.debug(TAG, e.getMessage(), new Object[0]);
        }
    }

    private POBLog.POBLogging logger() {
        return new C26746c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static C26752i process(@Nullable String str) {
        String replaceAll;
        if (TextUtils.isEmpty(str) || (replaceAll = str.replaceAll("\"", "")) == null || !replaceAll.startsWith("OB")) {
            return null;
        }
        String[] split = replaceAll.replace("OB", "").split("_");
        if (split.length == 0) {
            return null;
        }
        try {
            C26752i c26752i = new C26752i(null);
            c26752i.f70370a = split[0];
            if (split.length > 1) {
                c26752i.f70371b = Integer.valueOf(Integer.parseInt(split[1]));
            }
            if (split.length > 2) {
                c26752i.f70372c = split[2];
            }
            return c26752i;
        } catch (Exception e) {
            POBLog.debug(TAG, e.getMessage(), new Object[0]);
            return null;
        }
    }

    private static void registerToolAppService() {
        serviceConnection = new ServiceConnectionC26751h();
        try {
            Intent intent = new Intent(SERVICE_ACTION);
            intent.setPackage(PACKAGE_NAME);
            application.bindService(intent, serviceConnection, 1);
        } catch (Exception e) {
            POBLog.debug(TAG, e.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog(Activity activity) {
        if (this.dialog == null && this.webView != null) {
            this.dialog = new POBFullScreenDialog(activity, this.webView, new C26750g());
        }
        POBFullScreenDialog pOBFullScreenDialog = this.dialog;
        if (pOBFullScreenDialog != null) {
            pOBFullScreenDialog.show();
        }
    }

    private POBMonitor(@Nullable C26752i c26752i) {
        this.touchPointLocation = new Point(0, 0);
        monitorData = c26752i;
        try {
            POBMonitorWebView pOBMonitorWebView = new POBMonitorWebView(application.getApplicationContext());
            this.webView = pOBMonitorWebView;
            pOBMonitorWebView.initWebView(new C26747d());
            POBActivityLifeCycleMonitor pOBActivityLifeCycleMonitor = new POBActivityLifeCycleMonitor(application);
            this.monitorUIDelegate = pOBActivityLifeCycleMonitor;
            pOBActivityLifeCycleMonitor.start(new C26748e());
        } catch (Exception unused) {
            POBLog.error(TAG, "Unable to instantiate Web View", new Object[0]);
            invalidateMonitorConsole();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitor$h */
    /* loaded from: classes7.dex */
    public class ServiceConnectionC26751h implements ServiceConnection {
        ServiceConnectionC26751h() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String monitorData;
            IPOBMonitorService asInterface = IPOBMonitorService.Stub.asInterface(iBinder);
            if (asInterface != null) {
                try {
                    monitorData = asInterface.getMonitorData();
                } catch (RemoteException e) {
                    POBLog.debug(POBMonitor.TAG, e.getMessage(), new Object[0]);
                }
                C26752i unused = POBMonitor.monitorData = POBMonitor.process(monitorData);
                POBMonitor.loadMonitorModule();
                POBMonitor.application.unbindService(this);
            }
            monitorData = null;
            C26752i unused2 = POBMonitor.monitorData = POBMonitor.process(monitorData);
            POBMonitor.loadMonitorModule();
            POBMonitor.application.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
