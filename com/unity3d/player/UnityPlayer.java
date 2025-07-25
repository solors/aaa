package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.ironsource.C21114v8;
import com.unity3d.player.C28699C;
import com.unity3d.player.C28738U;
import com.unity3d.player.UnityPermissions;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class UnityPlayer extends FrameLayout implements IUnityPlayerLifecycleEvents {
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final int RUN_STATE_CHANGED_MSG_CODE = 2269;
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    public static Context currentContext;
    private Activity mActivity;
    private Context mContext;
    private C28708I mGlView;
    Handler mHandler;
    private int mInitialScreenOrientation;
    private boolean mIsFullscreen;
    private boolean mMainDisplayOverride;
    private int mNaturalOrientation;
    private OrientationEventListener mOrientationListener;
    private boolean mProcessKillRequested;
    private boolean mQuitting;
    DialogC28698B mSoftInputDialog;
    private C28709J mState;
    private C28738U mVideoPlayerProxy;
    private GoogleARCoreApi m_ARCoreApi;
    private boolean m_AddPhoneCallListener;
    private AudioVolumeHandler m_AudioVolumeHandler;
    private Camera2Wrapper m_Camera2Wrapper;
    private ClipboardManager m_ClipboardManager;
    private final ConcurrentLinkedQueue m_Events;
    private C28741B m_FakeListener;
    private HFPStatus m_HFPStatus;
    private int m_IsNoWindowMode;
    C28745F m_MainThread;
    private NetworkConnectivity m_NetworkConnectivity;
    private OrientationLockListener m_OrientationLockListener;
    private C28743D m_PhoneCallListener;
    private C28699C m_SplashScreen;
    private TelephonyManager m_TelephonyManager;
    private IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Uri m_launchUri;
    private Configuration prevConfig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$A */
    /* loaded from: classes7.dex */
    public class RunnableC28740A implements Runnable {
        RunnableC28740A() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeLowMemory();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$C */
    /* loaded from: classes7.dex */
    public static final class EnumC28742C {

        /* renamed from: a */
        public static final EnumC28742C f74739a = new EnumC28742C("GAINED", 0);

        /* renamed from: b */
        public static final EnumC28742C f74740b = new EnumC28742C("LOST", 1);

        /* renamed from: c */
        public static final EnumC28742C f74741c = new EnumC28742C("DEFERRED", 2);

        private EnumC28742C(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$D */
    /* loaded from: classes7.dex */
    public class C28743D extends PhoneStateListener {
        private C28743D() {
            UnityPlayer.this = r1;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            UnityPlayer unityPlayer = UnityPlayer.this;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            unityPlayer.nativeMuteMasterAudio(z);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$E */
    /* loaded from: classes7.dex */
    public static final class EnumC28744E {

        /* renamed from: a */
        public static final EnumC28744E f74743a = new EnumC28744E("PAUSE", 0);

        /* renamed from: b */
        public static final EnumC28744E f74744b = new EnumC28744E("RESUME", 1);

        /* renamed from: c */
        public static final EnumC28744E f74745c = new EnumC28744E("QUIT", 2);

        /* renamed from: d */
        public static final EnumC28744E f74746d = new EnumC28744E("SURFACE_LOST", 3);

        /* renamed from: e */
        public static final EnumC28744E f74747e = new EnumC28744E("SURFACE_ACQUIRED", 4);

        /* renamed from: f */
        public static final EnumC28744E f74748f = new EnumC28744E("FOCUS_LOST", 5);

        /* renamed from: g */
        public static final EnumC28744E f74749g = new EnumC28744E("FOCUS_GAINED", 6);

        /* renamed from: h */
        public static final EnumC28744E f74750h = new EnumC28744E("NEXT_FRAME", 7);

        /* renamed from: i */
        public static final EnumC28744E f74751i = new EnumC28744E("URL_ACTIVATED", 8);

        /* renamed from: j */
        public static final EnumC28744E f74752j = new EnumC28744E("ORIENTATION_ANGLE_CHANGE", 9);

        private EnumC28744E(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$F */
    /* loaded from: classes7.dex */
    public class C28745F extends Thread {

        /* renamed from: a */
        Handler f74753a;

        /* renamed from: b */
        boolean f74754b;

        /* renamed from: c */
        boolean f74755c;

        /* renamed from: d */
        EnumC28742C f74756d;

        /* renamed from: e */
        int f74757e;

        /* renamed from: f */
        int f74758f;

        /* renamed from: g */
        int f74759g;

        /* renamed from: h */
        int f74760h;

        /* renamed from: com.unity3d.player.UnityPlayer$F$a */
        /* loaded from: classes7.dex */
        class C28746a implements Handler.Callback {
            C28746a() {
                C28745F.this = r1;
            }

            /* renamed from: a */
            private void m37645a() {
                C28745F c28745f = C28745F.this;
                if (c28745f.f74756d == EnumC28742C.f74741c && c28745f.f74755c) {
                    UnityPlayer.this.nativeFocusChanged(true);
                    C28745F.this.f74756d = EnumC28742C.f74739a;
                }
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != UnityPlayer.RUN_STATE_CHANGED_MSG_CODE) {
                    return false;
                }
                EnumC28744E enumC28744E = (EnumC28744E) message.obj;
                EnumC28744E enumC28744E2 = EnumC28744E.f74750h;
                if (enumC28744E == enumC28744E2) {
                    C28745F c28745f = C28745F.this;
                    c28745f.f74757e--;
                    UnityPlayer.this.executeGLThreadJobs();
                    C28745F c28745f2 = C28745F.this;
                    if (!c28745f2.f74754b) {
                        return true;
                    }
                    if (UnityPlayer.this.getHaveAndroidWindowSupport() && !C28745F.this.f74755c) {
                        return true;
                    }
                    C28745F c28745f3 = C28745F.this;
                    int i = c28745f3.f74760h;
                    if (i >= 0) {
                        if (i == 0) {
                            if (UnityPlayer.this.getSplashEnabled()) {
                                UnityPlayer.this.DisableStaticSplashScreen();
                            }
                            UnityPlayer unityPlayer = UnityPlayer.this;
                            if (unityPlayer.mActivity != null && unityPlayer.getAutoReportFullyDrawnEnabled()) {
                                UnityPlayer.this.mActivity.reportFullyDrawn();
                            }
                        }
                        C28745F.this.f74760h--;
                    }
                    if (!UnityPlayer.this.isFinishing() && !UnityPlayer.this.nativeRender()) {
                        UnityPlayer.this.finish();
                    }
                } else if (enumC28744E == EnumC28744E.f74745c) {
                    Looper.myLooper().quit();
                } else if (enumC28744E == EnumC28744E.f74744b) {
                    C28745F.this.f74754b = true;
                } else if (enumC28744E == EnumC28744E.f74743a) {
                    C28745F.this.f74754b = false;
                } else if (enumC28744E == EnumC28744E.f74746d) {
                    C28745F.this.f74755c = false;
                } else {
                    if (enumC28744E == EnumC28744E.f74747e) {
                        C28745F.this.f74755c = true;
                    } else if (enumC28744E == EnumC28744E.f74748f) {
                        C28745F c28745f4 = C28745F.this;
                        if (c28745f4.f74756d == EnumC28742C.f74739a) {
                            UnityPlayer.this.nativeFocusChanged(false);
                        }
                        C28745F.this.f74756d = EnumC28742C.f74740b;
                    } else if (enumC28744E == EnumC28744E.f74749g) {
                        C28745F.this.f74756d = EnumC28742C.f74741c;
                    } else if (enumC28744E == EnumC28744E.f74751i) {
                        UnityPlayer unityPlayer2 = UnityPlayer.this;
                        unityPlayer2.nativeSetLaunchURL(unityPlayer2.getLaunchURL());
                    } else if (enumC28744E == EnumC28744E.f74752j) {
                        C28745F c28745f5 = C28745F.this;
                        UnityPlayer.this.nativeOrientationChanged(c28745f5.f74758f, c28745f5.f74759g);
                    }
                    m37645a();
                }
                C28745F c28745f6 = C28745F.this;
                if (c28745f6.f74754b && c28745f6.f74757e <= 0) {
                    Message.obtain(c28745f6.f74753a, UnityPlayer.RUN_STATE_CHANGED_MSG_CODE, enumC28744E2).sendToTarget();
                    C28745F.this.f74757e++;
                }
                return true;
            }
        }

        private C28745F() {
            UnityPlayer.this = r2;
            this.f74754b = false;
            this.f74755c = false;
            this.f74756d = EnumC28742C.f74740b;
            this.f74757e = 0;
            this.f74760h = 5;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("UnityMain");
            Looper.prepare();
            this.f74753a = new Handler(Looper.myLooper(), new C28746a());
            Looper.loop();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$G */
    /* loaded from: classes7.dex */
    public abstract class AbstractRunnableC28747G implements Runnable {
        private AbstractRunnableC28747G() {
            UnityPlayer.this = r1;
        }

        /* renamed from: a */
        public abstract void mo37644a();

        @Override // java.lang.Runnable
        public final void run() {
            if (!UnityPlayer.this.isFinishing()) {
                mo37644a();
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);
        
        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i) {
            this.value = i;
        }

        public static void setTimeoutForAll(int i) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$a */
    /* loaded from: classes7.dex */
    public class RunnableC28748a implements Runnable {
        RunnableC28748a() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$b */
    /* loaded from: classes7.dex */
    public class RunnableC28749b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityPlayer f74765a;

        /* renamed from: b */
        final /* synthetic */ String f74766b;

        /* renamed from: c */
        final /* synthetic */ int f74767c;

        /* renamed from: d */
        final /* synthetic */ boolean f74768d;

        /* renamed from: e */
        final /* synthetic */ boolean f74769e;

        /* renamed from: f */
        final /* synthetic */ boolean f74770f;

        /* renamed from: g */
        final /* synthetic */ boolean f74771g;

        /* renamed from: h */
        final /* synthetic */ String f74772h;

        /* renamed from: i */
        final /* synthetic */ int f74773i;

        /* renamed from: j */
        final /* synthetic */ boolean f74774j;

        /* renamed from: k */
        final /* synthetic */ boolean f74775k;

        /* renamed from: com.unity3d.player.UnityPlayer$b$a */
        /* loaded from: classes7.dex */
        class DialogInterface$OnCancelListenerC28750a implements DialogInterface.OnCancelListener {
            DialogInterface$OnCancelListenerC28750a() {
                RunnableC28749b.this = r1;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                UnityPlayer.this.nativeSoftInputLostFocus();
                UnityPlayer.this.reportSoftInputStr(null, 1, false);
            }
        }

        RunnableC28749b(UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
            UnityPlayer.this = r1;
            this.f74765a = unityPlayer;
            this.f74766b = str;
            this.f74767c = i;
            this.f74768d = z;
            this.f74769e = z2;
            this.f74770f = z3;
            this.f74771g = z4;
            this.f74772h = str2;
            this.f74773i = i2;
            this.f74774j = z5;
            this.f74775k = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.mSoftInputDialog = new DialogC28698B(UnityPlayer.this.mContext, this.f74765a, this.f74766b, this.f74767c, this.f74768d, this.f74769e, this.f74770f, this.f74771g, this.f74772h, this.f74773i, this.f74774j, this.f74775k);
            UnityPlayer.this.mSoftInputDialog.setOnCancelListener(new DialogInterface$OnCancelListenerC28750a());
            UnityPlayer.this.mSoftInputDialog.show();
            UnityPlayer.this.nativeReportKeyboardConfigChanged();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$c */
    /* loaded from: classes7.dex */
    class RunnableC28751c implements Runnable {
        RunnableC28751c() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C28708I c28708i = UnityPlayer.this.mGlView;
            if (c28708i != null) {
                c28708i.m37738b();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$d */
    /* loaded from: classes7.dex */
    public class RunnableC28752d implements Runnable {
        RunnableC28752d() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.reportSoftInputArea(new Rect());
            UnityPlayer.this.reportSoftInputIsVisible(false);
            DialogC28698B dialogC28698B = UnityPlayer.this.mSoftInputDialog;
            if (dialogC28698B != null) {
                dialogC28698B.dismiss();
                UnityPlayer unityPlayer = UnityPlayer.this;
                unityPlayer.mSoftInputDialog = null;
                unityPlayer.nativeReportKeyboardConfigChanged();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$e */
    /* loaded from: classes7.dex */
    class RunnableC28753e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f74780a;

        RunnableC28753e(String str) {
            UnityPlayer.this = r1;
            this.f74780a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            DialogC28698B dialogC28698B = UnityPlayer.this.mSoftInputDialog;
            if (dialogC28698B != null && (str = this.f74780a) != null) {
                dialogC28698B.m37763a(str);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$f */
    /* loaded from: classes7.dex */
    class RunnableC28754f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f74782a;

        RunnableC28754f(int i) {
            UnityPlayer.this = r1;
            this.f74782a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogC28698B dialogC28698B = UnityPlayer.this.mSoftInputDialog;
            if (dialogC28698B != null) {
                dialogC28698B.m37767a(this.f74782a);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$g */
    /* loaded from: classes7.dex */
    class RunnableC28755g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f74784a;

        RunnableC28755g(boolean z) {
            UnityPlayer.this = r1;
            this.f74784a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogC28698B dialogC28698B = UnityPlayer.this.mSoftInputDialog;
            if (dialogC28698B != null) {
                dialogC28698B.m37761a(this.f74784a);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$h */
    /* loaded from: classes7.dex */
    class RunnableC28756h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f74786a;

        /* renamed from: b */
        final /* synthetic */ int f74787b;

        RunnableC28756h(int i, int i2) {
            UnityPlayer.this = r1;
            this.f74786a = i;
            this.f74787b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogC28698B dialogC28698B = UnityPlayer.this.mSoftInputDialog;
            if (dialogC28698B != null) {
                dialogC28698B.m37766a(this.f74786a, this.f74787b);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$i */
    /* loaded from: classes7.dex */
    public class C28757i extends AbstractRunnableC28747G {

        /* renamed from: b */
        final /* synthetic */ boolean f74789b;

        /* renamed from: c */
        final /* synthetic */ String f74790c;

        /* renamed from: d */
        final /* synthetic */ int f74791d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28757i(boolean z, String str, int i) {
            super();
            UnityPlayer.this = r1;
            this.f74789b = z;
            this.f74790c = str;
            this.f74791d = i;
        }

        @Override // com.unity3d.player.UnityPlayer.AbstractRunnableC28747G
        /* renamed from: a */
        public void mo37644a() {
            if (this.f74789b) {
                UnityPlayer.this.nativeSoftInputCanceled();
            } else {
                String str = this.f74790c;
                if (str != null) {
                    UnityPlayer.this.nativeSetInputString(str);
                }
            }
            if (this.f74791d == 1) {
                UnityPlayer.this.nativeSoftInputClosed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$j */
    /* loaded from: classes7.dex */
    public class C28758j extends AbstractRunnableC28747G {

        /* renamed from: b */
        final /* synthetic */ int f74793b;

        /* renamed from: c */
        final /* synthetic */ int f74794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28758j(int i, int i2) {
            super();
            UnityPlayer.this = r1;
            this.f74793b = i;
            this.f74794c = i2;
        }

        @Override // com.unity3d.player.UnityPlayer.AbstractRunnableC28747G
        /* renamed from: a */
        public void mo37644a() {
            UnityPlayer.this.nativeSetInputSelection(this.f74793b, this.f74794c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$k */
    /* loaded from: classes7.dex */
    public class DialogInterface$OnClickListenerC28759k implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC28759k() {
            UnityPlayer.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            UnityPlayer.this.finish();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$l */
    /* loaded from: classes7.dex */
    public class C28760l extends AbstractRunnableC28747G {

        /* renamed from: b */
        final /* synthetic */ Rect f74797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28760l(Rect rect) {
            super();
            UnityPlayer.this = r1;
            this.f74797b = rect;
        }

        @Override // com.unity3d.player.UnityPlayer.AbstractRunnableC28747G
        /* renamed from: a */
        public void mo37644a() {
            UnityPlayer unityPlayer = UnityPlayer.this;
            Rect rect = this.f74797b;
            unityPlayer.nativeSetInputArea(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$m */
    /* loaded from: classes7.dex */
    public class C28761m extends AbstractRunnableC28747G {

        /* renamed from: b */
        final /* synthetic */ boolean f74799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28761m(boolean z) {
            super();
            UnityPlayer.this = r1;
            this.f74799b = z;
        }

        @Override // com.unity3d.player.UnityPlayer.AbstractRunnableC28747G
        /* renamed from: a */
        public void mo37644a() {
            UnityPlayer.this.nativeSetKeyboardIsVisible(this.f74799b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$n */
    /* loaded from: classes7.dex */
    public class C28762n implements C28738U.InterfaceC28739a {
        C28762n() {
            UnityPlayer.this = r1;
        }

        /* renamed from: a */
        public void m37643a() {
            UnityPlayer.this.mVideoPlayerProxy = null;
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$o */
    /* loaded from: classes7.dex */
    class RunnableC28763o implements Runnable {
        RunnableC28763o() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer unityPlayer;
            Activity activity;
            if (UnityPlayer.this.nativeIsAutorotationOn() && (activity = (unityPlayer = UnityPlayer.this).mActivity) != null) {
                activity.setRequestedOrientation(unityPlayer.mInitialScreenOrientation);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$p */
    /* loaded from: classes7.dex */
    class RunnableC28764p implements Runnable {
        RunnableC28764p() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.setupUnityToBePaused();
            UnityPlayer.this.windowFocusChanged(false);
            UnityPlayer.this.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$q */
    /* loaded from: classes7.dex */
    class C28765q extends OrientationEventListener {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28765q(Context context, int i) {
            super(context, i);
            UnityPlayer.this = r1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            UnityPlayer unityPlayer = UnityPlayer.this;
            C28745F c28745f = unityPlayer.m_MainThread;
            c28745f.f74758f = unityPlayer.mNaturalOrientation;
            c28745f.f74759g = i;
            EnumC28744E enumC28744E = EnumC28744E.f74752j;
            Handler handler = c28745f.f74753a;
            if (handler != null) {
                Message.obtain(handler, UnityPlayer.RUN_STATE_CHANGED_MSG_CODE, enumC28744E).sendToTarget();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$r */
    /* loaded from: classes7.dex */
    class RunnableC28766r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ float f74805a;

        RunnableC28766r(float f) {
            UnityPlayer.this = r1;
            this.f74805a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.mGlView.m37741a(this.f74805a);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$s */
    /* loaded from: classes7.dex */
    class RunnableC28767s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ float f74807a;

        RunnableC28767s(float f) {
            UnityPlayer.this = r1;
            this.f74807a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            WindowManager.LayoutParams attributes = UnityPlayer.this.m_Window.getAttributes();
            attributes.screenBrightness = this.f74807a;
            UnityPlayer.this.m_Window.setAttributes(attributes);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$t */
    /* loaded from: classes7.dex */
    public class RunnableC28768t implements Runnable {
        RunnableC28768t() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer unityPlayer = UnityPlayer.this;
            unityPlayer.removeView(unityPlayer.m_SplashScreen);
            UnityPlayer.this.m_SplashScreen = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$u */
    /* loaded from: classes7.dex */
    public class RunnableC28769u implements Runnable {
        RunnableC28769u() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeSendSurfaceChangedEvent();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$v */
    /* loaded from: classes7.dex */
    public class RunnableC28770v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f74811a;

        /* renamed from: b */
        final /* synthetic */ Surface f74812b;

        /* renamed from: c */
        final /* synthetic */ Semaphore f74813c;

        RunnableC28770v(int i, Surface surface, Semaphore semaphore) {
            UnityPlayer.this = r1;
            this.f74811a = i;
            this.f74812b = surface;
            this.f74813c = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeRecreateGfxState(this.f74811a, this.f74812b);
            this.f74813c.release();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$w */
    /* loaded from: classes7.dex */
    class RunnableC28771w implements Runnable {
        RunnableC28771w() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer unityPlayer = UnityPlayer.this;
            if (unityPlayer.mMainDisplayOverride) {
                unityPlayer.removeView(unityPlayer.mGlView);
            } else if (unityPlayer.mGlView.getParent() == null) {
                UnityPlayer unityPlayer2 = UnityPlayer.this;
                unityPlayer2.addView(unityPlayer2.mGlView);
            } else {
                AbstractC28798u.Log(5, "Couldn't add view, because it's already assigned to another parent");
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$x */
    /* loaded from: classes7.dex */
    public class RunnableC28772x implements Runnable {
        RunnableC28772x() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.destroy();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$y */
    /* loaded from: classes7.dex */
    public class RunnableC28773y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Semaphore f74817a;

        RunnableC28773y(Semaphore semaphore) {
            UnityPlayer.this = r1;
            this.f74817a = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.shutdown();
            this.f74817a.release();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$z */
    /* loaded from: classes7.dex */
    public class RunnableC28774z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Semaphore f74819a;

        RunnableC28774z(Semaphore semaphore) {
            UnityPlayer.this = r1;
            this.f74819a = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnityPlayer.this.nativePause()) {
                UnityPlayer unityPlayer = UnityPlayer.this;
                unityPlayer.mQuitting = true;
                unityPlayer.shutdown();
                UnityPlayer.this.queueDestroy();
            }
            this.f74819a.release();
        }
    }

    static {
        new C28704G().m37750a();
    }

    public UnityPlayer(Context context) {
        this(context, null);
    }

    public void DisableStaticSplashScreen() {
        runOnUiThread(new RunnableC28768t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    private void EarlyEnableFullScreenIfEnabled() {
        View decorView;
        Activity activity = this.mActivity;
        int i = 0;
        i = 0;
        if (activity != null && activity.getWindow() != null && ((getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false)) && (decorView = this.mActivity.getWindow().getDecorView()) != null)) {
            decorView.setSystemUiVisibility(7);
        }
        Activity activity2 = this.mActivity;
        if (activity2 != null && activity2.getWindow() != null && PlatformSupport.PIE_SUPPORT) {
            WindowManager.LayoutParams attributes = activity2.getWindow().getAttributes();
            try {
                ApplicationInfo applicationInfo = activity2.getPackageManager().getApplicationInfo(activity2.getPackageName(), 128);
                if (applicationInfo != null) {
                    i = applicationInfo.metaData.getBoolean("unity.render-outside-safearea");
                }
            } catch (Exception unused) {
            }
            attributes.layoutInDisplayCutoutMode = i;
        }
    }

    private String GetGlViewContentDescription(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    private boolean IsWindowTranslucent() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        if (!C28709J.m37728d()) {
            AbstractC28798u.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
            return;
        }
        try {
            nativeUnitySendMessage(str, str2, str3.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    private void checkResumePlayer() {
        boolean z;
        Activity activity = this.mActivity;
        if (activity != null) {
            z = MultiWindowSupport.isInMultiWindowMode(activity);
        } else {
            z = false;
        }
        if (!this.mState.m37733a(z)) {
            return;
        }
        this.mState.m37729c(true);
        queueGLThreadEvent(new RunnableC28748a());
        C28745F c28745f = this.m_MainThread;
        EnumC28744E enumC28744E = EnumC28744E.f74744b;
        Handler handler = c28745f.f74753a;
        if (handler != null) {
            Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, enumC28744E).sendToTarget();
        }
    }

    public void finish() {
        Activity activity = this.mActivity;
        if (activity != null && !activity.isFinishing()) {
            this.mActivity.finish();
        }
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private ActivityInfo getActivityInfo() {
        return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
    }

    private ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }

    public boolean getAutoReportFullyDrawnEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        if (this.m_IsNoWindowMode == 1) {
            return true;
        }
        return false;
    }

    private boolean getLaunchFullscreen() {
        try {
            return getApplicationInfo().metaData.getBoolean(LAUNCH_FULLSCREEN);
        } catch (Exception unused) {
            return false;
        }
    }

    private int getNaturalOrientation(int i) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation != 0 && rotation != 2) || i != 2) {
            if ((rotation != 1 && rotation != 3) || i != 1) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private String getProcessName() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private static String getUnityNativeLibraryPath(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    private void hidePreservedContent() {
        runOnUiThread(new RunnableC28751c());
    }

    private void hideStatusBar() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    private final native void initJni(Context context);

    private static String loadNative(String str) {
        String str2 = str + "/libmain.so";
        try {
            try {
                try {
                    System.load(str2);
                } catch (UnsatisfiedLinkError unused) {
                    System.loadLibrary(C21114v8.C21122h.f54053Z);
                }
                if (NativeLoader.load(str)) {
                    C28709J.m37726e();
                    return "";
                }
                AbstractC28798u.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
                return "NativeLoader.load failure, Unity libraries were not loaded.";
            } catch (UnsatisfiedLinkError e) {
                return logLoadLibMainError(str2, e.toString());
            }
        } catch (SecurityException e2) {
            return logLoadLibMainError(str2, e2.toString());
        }
    }

    private static String logLoadLibMainError(String str, String str2) {
        String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        AbstractC28798u.Log(6, str3);
        return str3;
    }

    private final native void nativeApplicationUnload();

    private final native boolean nativeDone();

    public final native void nativeFocusChanged(boolean z);

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeHidePreservedContent();

    private final native boolean nativeInjectEvent(InputEvent inputEvent);

    public final native boolean nativeIsAutorotationOn();

    public final native void nativeLowMemory();

    public final native void nativeMuteMasterAudio(boolean z);

    public final native void nativeOrientationChanged(int i, int i2);

    public final native boolean nativePause();

    public final native void nativeRecreateGfxState(int i, Surface surface);

    public final native boolean nativeRender();

    public final native void nativeReportKeyboardConfigChanged();

    private final native void nativeRestartActivityIndicator();

    public final native void nativeResume();

    public final native void nativeSendSurfaceChangedEvent();

    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    public final native void nativeSetInputSelection(int i, int i2);

    public final native void nativeSetInputString(String str);

    public final native void nativeSetKeyboardIsVisible(boolean z);

    public final native void nativeSetLaunchURL(String str);

    public final native void nativeSoftInputCanceled();

    public final native void nativeSoftInputClosed();

    public final native void nativeSoftInputLostFocus();

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private void pauseUnity() {
        Runnable runnableC28774z;
        reportSoftInputStr(null, 1, true);
        if (this.mState.m37730c() && !this.mState.m37732b()) {
            if (C28709J.m37728d()) {
                Semaphore semaphore = new Semaphore(0);
                if (isFinishing()) {
                    runnableC28774z = new RunnableC28773y(semaphore);
                } else {
                    runnableC28774z = new RunnableC28774z(semaphore);
                }
                C28745F c28745f = this.m_MainThread;
                Handler handler = c28745f.f74753a;
                if (handler != null) {
                    Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, EnumC28744E.f74743a).sendToTarget();
                    Message.obtain(c28745f.f74753a, runnableC28774z).sendToTarget();
                }
                try {
                    SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                    if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                        AbstractC28798u.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                    }
                } catch (InterruptedException unused) {
                    AbstractC28798u.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
                }
            }
            this.mState.m37729c(false);
            this.mState.m37725e(true);
            if (this.m_AddPhoneCallListener) {
                this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
            }
        }
    }

    private static void preloadJavaPlugins() {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
        } catch (ClassNotFoundException unused) {
        } catch (LinkageError e) {
            AbstractC28798u.Log(6, "Java class preloading failed: " + e.getMessage());
        }
    }

    public void queueDestroy() {
        AbstractC28798u.Log(4, "Queue Destroy");
        runOnUiThread(new RunnableC28772x());
    }

    private void queueGLThreadEvent(AbstractRunnableC28747G abstractRunnableC28747G) {
        if (isFinishing()) {
            return;
        }
        queueGLThreadEvent((Runnable) abstractRunnableC28747G);
    }

    public void shutdown() {
        this.mProcessKillRequested = nativeDone();
        this.mState.m37727d(false);
    }

    private void swapViews(View view, View view2) {
        boolean z;
        if (!this.mState.m37732b()) {
            setupUnityToBePaused();
            z = true;
        } else {
            z = false;
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof UnityPlayer) || ((UnityPlayer) parent) != this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
                bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == this) {
            view2.setVisibility(8);
            removeView(view2);
        }
        if (z) {
            setupUnityToBeResumed();
        }
    }

    private static void unloadNative() {
        if (!C28709J.m37728d()) {
            return;
        }
        if (NativeLoader.unload()) {
            C28709J.m37724f();
            return;
        }
        throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
    }

    private boolean updateDisplayInternal(int i, Surface surface) {
        if (!C28709J.m37728d() || !this.mState.m37734a()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        RunnableC28770v runnableC28770v = new RunnableC28770v(i, surface, semaphore);
        if (i == 0) {
            if (surface == null) {
                C28745F c28745f = this.m_MainThread;
                Handler handler = c28745f.f74753a;
                if (handler != null) {
                    Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, EnumC28744E.f74746d).sendToTarget();
                    Message.obtain(c28745f.f74753a, runnableC28770v).sendToTarget();
                }
            } else {
                C28745F c28745f2 = this.m_MainThread;
                Handler handler2 = c28745f2.f74753a;
                if (handler2 != null) {
                    Message.obtain(handler2, runnableC28770v).sendToTarget();
                    EnumC28744E enumC28744E = EnumC28744E.f74747e;
                    Handler handler3 = c28745f2.f74753a;
                    if (handler3 != null) {
                        Message.obtain(handler3, RUN_STATE_CHANGED_MSG_CODE, enumC28744E).sendToTarget();
                    }
                }
            }
        } else {
            runnableC28770v.run();
        }
        if (surface == null && i == 0) {
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    AbstractC28798u.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
                    return true;
                }
                return true;
            } catch (InterruptedException unused) {
                AbstractC28798u.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
                return true;
            }
        }
        return true;
    }

    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    public boolean addViewToPlayer(View view, boolean z) {
        C28708I c28708i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (z) {
            c28708i = this.mGlView;
        } else {
            c28708i = null;
        }
        swapViews(view, c28708i);
        boolean z5 = true;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.mGlView.getParent() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.mGlView.getParent() == this) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || (!z3 && !z4)) {
            z5 = false;
        }
        if (!z5) {
            if (!z2) {
                AbstractC28798u.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z3 && !z4) {
                AbstractC28798u.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z5;
    }

    public void configurationChanged(Configuration configuration) {
        int diff = this.prevConfig.diff(configuration);
        if ((diff & 256) != 0 || (diff & 1024) != 0 || (diff & 2048) != 0 || (diff & 128) != 0) {
            nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration);
        C28738U c28738u = this.mVideoPlayerProxy;
        if (c28738u != null) {
            c28738u.m37694b();
        }
    }

    public void destroy() {
        Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.m37755a();
            this.m_Camera2Wrapper = null;
        }
        HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.m37748a();
            this.m_HFPStatus = null;
        }
        NetworkConnectivity networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            networkConnectivity.mo37720a();
            this.m_NetworkConnectivity = null;
        }
        this.mQuitting = true;
        if (!this.mState.m37732b()) {
            setupUnityToBePaused();
        }
        C28745F c28745f = this.m_MainThread;
        EnumC28744E enumC28744E = EnumC28744E.f74745c;
        Handler handler = c28745f.f74753a;
        if (handler != null) {
            Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, enumC28744E).sendToTarget();
        }
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (C28709J.m37728d()) {
            removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
        unloadNative();
    }

    protected void disableLogger() {
        AbstractC28798u.f74898a = true;
    }

    public boolean displayChanged(int i, Surface surface) {
        boolean z;
        if (i == 0) {
            if (surface != null) {
                z = true;
            } else {
                z = false;
            }
            this.mMainDisplayOverride = z;
            runOnUiThread(new RunnableC28771w());
        }
        return updateDisplayInternal(i, surface);
    }

    protected void executeGLThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.m_Events.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }

    protected String getClipboardText() {
        ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            return primaryClip.getItemAt(0).coerceToText(this.mContext).toString();
        }
        return "";
    }

    protected String getKeyboardLayout() {
        DialogC28698B dialogC28698B = this.mSoftInputDialog;
        if (dialogC28698B == null) {
            return null;
        }
        return dialogC28698B.m37768a();
    }

    protected String getLaunchURL() {
        Uri uri = this.m_launchUri;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    protected int getNetworkConnectivity() {
        NetworkConnectivity networkConnectivity;
        NetworkConnectivity networkConnectivity2 = this.m_NetworkConnectivity;
        if (networkConnectivity2 != null) {
            return networkConnectivity2.mo37719b();
        }
        if (PlatformSupport.NOUGAT_SUPPORT) {
            networkConnectivity = new NetworkConnectivityNougat(this.mContext);
        } else {
            networkConnectivity = new NetworkConnectivity(this.mContext);
        }
        this.m_NetworkConnectivity = networkConnectivity;
        return this.m_NetworkConnectivity.mo37719b();
    }

    public String getNetworkProxySettings(String str) {
        String str2;
        String str3;
        if (str.startsWith("http:")) {
            str2 = "http.proxyHost";
            str3 = "http.proxyPort";
        } else {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        String property = System.getProperties().getProperty(str2);
        if (property != null && !"".equals(property)) {
            StringBuilder sb2 = new StringBuilder(property);
            String property2 = System.getProperties().getProperty(str3);
            if (property2 != null && !"".equals(property2)) {
                sb2.append(":");
                sb2.append(property2);
            }
            String property3 = System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !"".equals(property3)) {
                sb2.append('\n');
                sb2.append(property3);
            }
            return sb2.toString();
        }
        return null;
    }

    public float getScreenBrightness() {
        Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        float f = window.getAttributes().screenBrightness;
        if (f < 0.0f) {
            int i = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness", 255);
            if (PlatformSupport.PIE_SUPPORT) {
                return (float) Math.max(0.0d, Math.min(1.0d, ((Math.log(i) * 19.811d) - 9.411d) / 100.0d));
            }
            return i / 255.0f;
        }
        return f;
    }

    public Bundle getSettings() {
        return Bundle.EMPTY;
    }

    protected int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (Exception unused) {
            return 0;
        }
    }

    protected int getUaaLLaunchProcessType() {
        String processName = getProcessName();
        if (processName != null && !processName.equals(this.mContext.getPackageName())) {
            return 1;
        }
        return 0;
    }

    protected void hideSoftInput() {
        postOnUiThread(new RunnableC28752d());
    }

    protected boolean initializeGoogleAr() {
        if (this.m_ARCoreApi == null && this.mActivity != null && getARCoreEnabled()) {
            GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
            this.m_ARCoreApi = googleARCoreApi;
            googleARCoreApi.initializeARCore(this.mActivity);
            if (!this.mState.m37732b()) {
                this.m_ARCoreApi.resumeARCore();
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean injectEvent(InputEvent inputEvent) {
        if (!C28709J.m37728d()) {
            return false;
        }
        return nativeInjectEvent(inputEvent);
    }

    protected boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mQuitting = activity.isFinishing();
        }
        return this.mQuitting;
    }

    protected boolean isUaaLUseCase() {
        String callingPackage;
        Activity activity = this.mActivity;
        if (activity == null || (callingPackage = activity.getCallingPackage()) == null || !callingPackage.equals(this.mContext.getPackageName())) {
            return false;
        }
        return true;
    }

    protected void kill() {
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public void lowMemory() {
        if (!C28709J.m37728d()) {
            return;
        }
        queueGLThreadEvent(new RunnableC28740A());
    }

    public void newIntent(Intent intent) {
        this.m_launchUri = intent.getData();
        C28745F c28745f = this.m_MainThread;
        EnumC28744E enumC28744E = EnumC28744E.f74751i;
        Handler handler = c28745f.f74753a;
        if (handler != null) {
            Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, enumC28744E).sendToTarget();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.mGlView.m37736c()) {
            return injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    public void onPause() {
        MultiWindowSupport.saveMultiWindowMode(this.mActivity);
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBePaused();
    }

    public void onResume() {
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity) && !MultiWindowSupport.isMultiWindowModeChangedToTrue(this.mActivity)) {
            return;
        }
        setupUnityToBeResumed();
    }

    public void onStart() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBeResumed();
    }

    public void onStop() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBePaused();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mGlView.m37736c()) {
            return injectEvent(motionEvent);
        }
        return false;
    }

    public void pause() {
        setupUnityToBePaused();
    }

    protected void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new RunnableC28764p());
    }

    void postOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void quit() {
        destroy();
    }

    public void removeViewFromPlayer(View view) {
        boolean z;
        boolean z2;
        swapViews(this.mGlView, view);
        boolean z3 = true;
        if (view.getParent() == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.mGlView.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            z3 = false;
        }
        if (!z3) {
            if (!z) {
                AbstractC28798u.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
            }
            if (!z2) {
                AbstractC28798u.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
            }
        }
    }

    public void reportError(String str, String str2) {
        AbstractC28798u.Log(6, str + ": " + str2);
    }

    public void reportSoftInputArea(Rect rect) {
        queueGLThreadEvent((AbstractRunnableC28747G) new C28760l(rect));
    }

    public void reportSoftInputIsVisible(boolean z) {
        queueGLThreadEvent((AbstractRunnableC28747G) new C28761m(z));
    }

    public void reportSoftInputSelection(int i, int i2) {
        queueGLThreadEvent((AbstractRunnableC28747G) new C28758j(i, i2));
    }

    public void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        queueGLThreadEvent((AbstractRunnableC28747G) new C28757i(z, str, i));
    }

    protected void requestUserAuthorization(String str) {
        if (str != null && !str.isEmpty() && this.mActivity != null) {
            UnityPermissions.ModalWaitForPermissionResponse modalWaitForPermissionResponse = new UnityPermissions.ModalWaitForPermissionResponse();
            UnityPermissions.requestUserPermissions(this.mActivity, new String[]{str}, modalWaitForPermissionResponse);
            modalWaitForPermissionResponse.waitForResponse();
        }
    }

    public void resume() {
        setupUnityToBeResumed();
    }

    void runOnAnonymousThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    void runOnUiThread(Runnable runnable) {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void sendSurfaceChangedEvent() {
        if (C28709J.m37728d() && this.mState.m37734a()) {
            RunnableC28769u runnableC28769u = new RunnableC28769u();
            Handler handler = this.m_MainThread.f74753a;
            if (handler != null) {
                Message.obtain(handler, runnableC28769u).sendToTarget();
            }
        }
    }

    protected void setCharacterLimit(int i) {
        runOnUiThread(new RunnableC28754f(i));
    }

    protected void setClipboardText(String str) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    protected void setHideInputField(boolean z) {
        runOnUiThread(new RunnableC28755g(z));
    }

    public void setMainSurfaceViewAspectRatio(float f) {
        if (this.mGlView != null) {
            runOnUiThread(new RunnableC28766r(f));
        }
    }

    public void setScreenBrightness(float f) {
        float max = Math.max(0.04f, f);
        if (this.m_Window != null && getScreenBrightness() != max) {
            runOnUiThread(new RunnableC28767s(max));
        }
    }

    protected void setSelection(int i, int i2) {
        runOnUiThread(new RunnableC28756h(i, i2));
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC28753e(str));
    }

    protected void setupUnityToBePaused() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        C28738U c28738u = this.mVideoPlayerProxy;
        if (c28738u != null) {
            c28738u.m37692c();
        }
        AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            audioVolumeHandler.m37769a();
            this.m_AudioVolumeHandler = null;
        }
        OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            orientationLockListener.m37716a();
            this.m_OrientationLockListener = null;
        }
        pauseUnity();
    }

    protected void setupUnityToBeResumed() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.m37725e(false);
        C28738U c28738u = this.mVideoPlayerProxy;
        if (c28738u != null) {
            c28738u.m37690d();
        }
        checkResumePlayer();
        if (C28709J.m37728d()) {
            nativeRestartActivityIndicator();
        }
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && C28709J.m37728d()) {
            this.m_OrientationLockListener = new OrientationLockListener(this.mContext);
        }
        this.prevConfig = getResources().getConfiguration();
    }

    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        postOnUiThread(new RunnableC28749b(this, str, i, z, z2, z3, z4, str2, i2, z5, z6));
    }

    protected boolean showVideoPlayer(String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new C28738U(this);
        }
        boolean m37696a = this.mVideoPlayerProxy.m37696a(this.mContext, str, i, i2, i3, z, i4, i5, new C28762n());
        if (m37696a) {
            runOnUiThread(new RunnableC28763o());
        }
        return m37696a;
    }

    protected boolean skipPermissionsDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    public boolean startOrientationListener(int i) {
        String str;
        if (this.mOrientationListener != null) {
            str = "Orientation Listener already started.";
        } else {
            C28765q c28765q = new C28765q(this.mContext, i);
            this.mOrientationListener = c28765q;
            if (c28765q.canDetectOrientation()) {
                this.mOrientationListener.enable();
                return true;
            }
            str = "Orientation Listener cannot detect orientation.";
        }
        AbstractC28798u.Log(5, str);
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            AbstractC28798u.Log(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    protected void toggleGyroscopeSensor(boolean z) {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z) {
            sensorManager.registerListener(this.m_FakeListener, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.m_FakeListener);
        }
    }

    public void unload() {
        nativeApplicationUnload();
    }

    public void updateGLDisplay(int i, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    public void windowFocusChanged(boolean z) {
        this.mState.m37731b(z);
        if (this.mState.m37734a()) {
            DialogC28698B dialogC28698B = this.mSoftInputDialog;
            if (dialogC28698B == null || dialogC28698B.f74515d) {
                if (z) {
                    C28745F c28745f = this.m_MainThread;
                    EnumC28744E enumC28744E = EnumC28744E.f74749g;
                    Handler handler = c28745f.f74753a;
                    if (handler != null) {
                        Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, enumC28744E).sendToTarget();
                    }
                } else {
                    C28745F c28745f2 = this.m_MainThread;
                    EnumC28744E enumC28744E2 = EnumC28744E.f74748f;
                    Handler handler2 = c28745f2.f74753a;
                    if (handler2 != null) {
                        Message.obtain(handler2, RUN_STATE_CHANGED_MSG_CODE, enumC28744E2).sendToTarget();
                    }
                }
                checkResumePlayer();
            }
        }
    }

    public UnityPlayer(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        super(context);
        this.mHandler = new Handler();
        this.mInitialScreenOrientation = -1;
        this.mMainDisplayOverride = false;
        this.mIsFullscreen = true;
        this.mState = new C28709J();
        this.m_Events = new ConcurrentLinkedQueue();
        this.mOrientationListener = null;
        this.m_MainThread = new C28745F();
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new C28743D();
        this.m_ARCoreApi = null;
        this.m_FakeListener = new C28741B(this);
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_OrientationLockListener = null;
        this.m_launchUri = null;
        this.m_NetworkConnectivity = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputDialog = null;
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        C28704G.m37749a(getUnityNativeLibraryPath(context));
        currentContext = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.mActivity = activity;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
            this.m_launchUri = this.mActivity.getIntent().getData();
        }
        this.mContext = context;
        EarlyEnableFullScreenIfEnabled();
        Configuration configuration = getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && getSplashEnabled()) {
            C28699C c28699c = new C28699C(this.mContext, C28699C.EnumC28700a.values()[getSplashMode()]);
            this.m_SplashScreen = c28699c;
            addView(c28699c);
        }
        preloadJavaPlugins();
        String loadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!C28709J.m37728d()) {
            AbstractC28798u.Log(6, "Your hardware does not support this application.");
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterface$OnClickListenerC28759k());
            AlertDialog create = positiveButton.setMessage("Your hardware does not support this application.\n\n" + loadNative + "\n\n Press OK to quit.").create();
            create.setCancelable(false);
            create.show();
            return;
        }
        initJni(context);
        this.mState.m37727d(true);
        C28708I c28708i = new C28708I(context, this);
        this.mGlView = c28708i;
        addView(c28708i);
        bringChildToFront(this.m_SplashScreen);
        this.mQuitting = false;
        Activity activity2 = this.mActivity;
        if (activity2 != null) {
            this.m_Window = activity2.getWindow();
        }
        hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_MainThread.start();
    }

    public void queueGLThreadEvent(Runnable runnable) {
        if (C28709J.m37728d()) {
            if (Thread.currentThread() == this.m_MainThread) {
                runnable.run();
            } else {
                this.m_Events.add(runnable);
            }
        }
    }

    public View getView() {
        return this;
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.UnityPlayer$B */
    /* loaded from: classes7.dex */
    public class C28741B implements SensorEventListener {
        C28741B(UnityPlayer unityPlayer) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }

    public void init(int i, boolean z) {
    }
}
