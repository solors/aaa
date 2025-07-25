package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.common.C13358R;
import com.facebook.internal.WebDialog;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginTargetApp;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p978t3.WebViewRenderException;

/* compiled from: WebDialog.kt */
@Metadata
/* loaded from: classes4.dex */
public class WebDialog extends Dialog {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = -872415232;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_THEME = C13358R.C13365style.com_facebook_activity_theme;
    public static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    @NotNull
    private static final String DISPLAY_TOUCH = "touch";
    @NotNull
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5d;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    @NotNull
    private static final String PLATFORM_DIALOG_PATH_REGEX = "^/(v\\d+\\.\\d+/)??dialog/.*";
    @Nullable
    private static InitCallback initCallback;
    private static volatile int webDialogTheme;
    @Nullable
    private FrameLayout contentFrameLayout;
    @Nullable
    private ImageView crossImageView;
    @NotNull
    private String expectedRedirectUrl;
    private boolean isDetached;
    private boolean isListenerCalled;
    private boolean isPageFinished;
    @Nullable
    private OnCompleteListener onCompleteListener;
    @Nullable
    private ProgressDialog spinner;
    @Nullable
    private AsyncTaskC13454b uploadTask;
    @Nullable
    private String url;
    @Nullable
    private WebView webView;
    @Nullable
    private WindowManager.LayoutParams windowParams;

    /* compiled from: WebDialog.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public interface InitCallback {
        void onInit(@Nullable WebView webView);
    }

    /* compiled from: WebDialog.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public interface OnCompleteListener {
        void onComplete(@Nullable Bundle bundle, @Nullable FacebookException facebookException);
    }

    /* compiled from: WebDialog.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WebDialog.kt */
    @Metadata
    /* renamed from: com.facebook.internal.WebDialog$a */
    /* loaded from: classes4.dex */
    public final class C13453a extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ WebDialog f24736a;

        public C13453a(WebDialog this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f24736a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView view, @NotNull String url) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (!this.f24736a.isDetached && (progressDialog = this.f24736a.spinner) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f24736a.contentFrameLayout;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webView = this.f24736a.getWebView();
            if (webView != null) {
                webView.setVisibility(0);
            }
            ImageView imageView = this.f24736a.crossImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f24736a.isPageFinished = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NotNull WebView view, @NotNull String url, @Nullable Bitmap bitmap) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Utility utility = Utility.INSTANCE;
            Utility.logd(WebDialog.LOG_TAG, Intrinsics.m17064q("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (!this.f24736a.isDetached && (progressDialog = this.f24736a.spinner) != null) {
                progressDialog.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NotNull WebView view, int i, @NotNull String description, @NotNull String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i, description, failingUrl);
            this.f24736a.sendErrorToListener(new FacebookDialogException(description, i, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f24736a.sendErrorToListener(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x00b5  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull android.webkit.WebView r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.C13453a.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* compiled from: WebDialog.kt */
    @Metadata
    /* renamed from: com.facebook.internal.WebDialog$b */
    /* loaded from: classes4.dex */
    public final class AsyncTaskC13454b extends AsyncTask<Void, Void, String[]> {
        @NotNull

        /* renamed from: a */
        private final String f24737a;
        @NotNull

        /* renamed from: b */
        private final Bundle f24738b;
        @NotNull

        /* renamed from: c */
        private Exception[] f24739c;

        /* renamed from: d */
        final /* synthetic */ WebDialog f24740d;

        public AsyncTaskC13454b(@NotNull WebDialog this$0, @NotNull String action, Bundle parameters) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f24740d = this$0;
            this.f24737a = action;
            this.f24738b = parameters;
            this.f24739c = new Exception[0];
        }

        /* renamed from: c */
        public static final void m78700c(String[] results, int i, AsyncTaskC13454b this$0, CountDownLatch latch, GraphResponse response) {
            FacebookRequestError error;
            String str;
            Intrinsics.checkNotNullParameter(results, "$results");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(latch, "$latch");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                error = response.getError();
                str = "Error staging photo.";
            } catch (Exception e) {
                this$0.f24739c[i] = e;
            }
            if (error != null) {
                String errorMessage = error.getErrorMessage();
                if (errorMessage != null) {
                    str = errorMessage;
                }
                throw new FacebookGraphResponseException(response, str);
            }
            JSONObject jSONObject = response.getJSONObject();
            if (jSONObject != null) {
                String optString = jSONObject.optString("uri");
                if (optString != null) {
                    results[i] = optString;
                    latch.countDown();
                    return;
                }
                throw new FacebookException("Error staging photo.");
            }
            throw new FacebookException("Error staging photo.");
        }

        @Nullable
        /* renamed from: b */
        protected String[] m78701b(@NotNull Void... p0) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(p0, "p0");
                String[] stringArray = this.f24738b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f24739c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((GraphRequestAsyncTask) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i]);
                            if (Utility.isWebUri(uri)) {
                                strArr[i] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: com.facebook.internal.x
                                    @Override // com.facebook.GraphRequest.Callback
                                    public final void onCompleted(GraphResponse graphResponse) {
                                        WebDialog.AsyncTaskC13454b.m78700c(strArr, i, this, countDownLatch, graphResponse);
                                    }
                                };
                                ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                concurrentLinkedQueue.add(ShareInternalUtility.newUploadStagingResourceWithImageRequest(currentAccessToken, uri, callback).executeAsync());
                            }
                            if (i2 > length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((GraphRequestAsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        /* renamed from: d */
        protected void m78699d(@Nullable String[] strArr) {
            List m17399f;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (!CrashShieldHandler.isObjectCrashing(this)) {
                    ProgressDialog progressDialog = this.f24740d.spinner;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    Exception[] excArr = this.f24739c;
                    int length = excArr.length;
                    int i = 0;
                    while (i < length) {
                        Exception exc = excArr[i];
                        i++;
                        if (exc != null) {
                            this.f24740d.sendErrorToListener(exc);
                            return;
                        }
                    }
                    if (strArr != null) {
                        m17399f = _ArraysJvm.m17399f(strArr);
                        if (m17399f.contains(null)) {
                            this.f24740d.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                            return;
                        }
                        Utility utility = Utility.INSTANCE;
                        Utility.putJSONValueInBundle(this.f24738b, "media", new JSONArray((Collection) m17399f));
                        String dialogAuthority = ServerProtocol.getDialogAuthority();
                        Uri buildUri = Utility.buildUri(dialogAuthority, FacebookSdk.getGraphApiVersion() + "/dialog/" + this.f24737a, this.f24738b);
                        this.f24740d.url = buildUri.toString();
                        ImageView imageView = this.f24740d.crossImageView;
                        if (imageView != null) {
                            this.f24740d.setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    this.f24740d.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                return m78701b(voidArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                m78699d(strArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    private final void createCrossImage() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.v
            {
                WebDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebDialog.m110143createCrossImage$lambda5(WebDialog.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(C13358R.C13360drawable.com_facebook_close);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    /* renamed from: createCrossImage$lambda-5 */
    public static final void m110143createCrossImage$lambda5(WebDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    private final int getScaledSize(int i, float f, int i2, int i3) {
        double d;
        int i4 = (int) (i / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 >= i3) {
            d = 0.5d;
        } else {
            d = (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d;
        }
        return (int) (i * d);
    }

    public static final int getWebDialogTheme() {
        return Companion.getWebDialogTheme();
    }

    public static final void initDefaultTheme(@Nullable Context context) {
        Companion.initDefaultTheme(context);
    }

    @NotNull
    public static final WebDialog newInstance(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @Nullable OnCompleteListener onCompleteListener) {
        return Companion.newInstance(context, str, bundle, i, onCompleteListener);
    }

    /* renamed from: onCreate$lambda-4 */
    public static final void m110144onCreate$lambda4(WebDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    public static final void setInitCallback(@Nullable InitCallback initCallback2) {
        Companion.setInitCallback(initCallback2);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void setUpWebView(int i) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.webView = new WebView(getContext()) { // from class: com.facebook.internal.WebDialog$setUpWebView$1
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        InitCallback initCallback2 = initCallback;
        if (initCallback2 != null) {
            initCallback2.onInit(getWebView());
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setWebViewClient(new C13453a(this));
        }
        WebView webView4 = this.webView;
        WebSettings webSettings = null;
        if (webView4 == null) {
            settings = null;
        } else {
            settings = webView4.getSettings();
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.webView;
        if (webView5 != null) {
            String str = this.url;
            if (str != null) {
                webView5.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.webView;
        if (webView8 == null) {
            settings2 = null;
        } else {
            settings2 = webView8.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.webView;
        if (webView9 != null) {
            webSettings = webView9.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        WebView webView10 = this.webView;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.w
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m110145setUpWebView$lambda7;
                    m110145setUpWebView$lambda7 = WebDialog.m110145setUpWebView$lambda7(view, motionEvent);
                    return m110145setUpWebView$lambda7;
                }
            });
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(BACKGROUND_GRAY);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    /* renamed from: setUpWebView$lambda-7 */
    public static final boolean m110145setUpWebView$lambda7(View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
            return false;
        }
        return false;
    }

    public static final void setWebDialogTheme(int i) {
        Companion.setWebDialogTheme(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.onCompleteListener != null && !this.isListenerCalled) {
            sendErrorToListener(new FacebookOperationCanceledException());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Nullable
    public final OnCompleteListener getOnCompleteListener() {
        return this.onCompleteListener;
    }

    @Nullable
    public final WebView getWebView() {
        return this.webView;
    }

    public final boolean isListenerCalled() {
        return this.isListenerCalled;
    }

    public final boolean isPageFinished() {
        return this.isPageFinished;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        this.isDetached = false;
        Utility utility = Utility.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (Utility.mustFixWindowParamsForAutofill(context) && (layoutParams = this.windowParams) != null) {
            IBinder iBinder3 = null;
            if (layoutParams == null) {
                iBinder = null;
            } else {
                iBinder = layoutParams.token;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null) {
                        window = null;
                    } else {
                        window = ownerActivity.getWindow();
                    }
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                Utility.logd(LOG_TAG, Intrinsics.m17064q("Set token on onAttachedToWindow(): ", iBinder3));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(C13358R.C13364string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.u
                {
                    WebDialog.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    WebDialog.m110144onCreate$lambda4(WebDialog.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        resize();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        createCrossImage();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView != null) {
                setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent event) {
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4) {
            WebView webView = this.webView;
            if (webView != null) {
                if (webView == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(webView.canGoBack());
                }
                if (Intrinsics.m17075f(valueOf, Boolean.TRUE)) {
                    WebView webView2 = this.webView;
                    if (webView2 != null) {
                        webView2.goBack();
                        return true;
                    }
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i, event);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        AsyncTask.Status status;
        super.onStart();
        AsyncTaskC13454b asyncTaskC13454b = this.uploadTask;
        if (asyncTaskC13454b != null) {
            if (asyncTaskC13454b == null) {
                status = null;
            } else {
                status = asyncTaskC13454b.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                AsyncTaskC13454b asyncTaskC13454b2 = this.uploadTask;
                if (asyncTaskC13454b2 != null) {
                    asyncTaskC13454b2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        resize();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        AsyncTaskC13454b asyncTaskC13454b = this.uploadTask;
        if (asyncTaskC13454b != null) {
            asyncTaskC13454b.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(@NotNull WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.windowParams = params;
        }
        super.onWindowAttributesChanged(params);
    }

    @VisibleForTesting(otherwise = 4)
    @NotNull
    public Bundle parseResponseUri(@Nullable String str) {
        Uri parse = Uri.parse(str);
        Utility utility = Utility.INSTANCE;
        Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        return parseUrlQueryString;
    }

    public final void resize() {
        int i;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 < i3) {
                i = i2;
            } else {
                i = i3;
            }
            if (i2 < i3) {
                i2 = i3;
            }
            int min = Math.min(getScaledSize(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
            int min2 = Math.min(getScaledSize(i2, displayMetrics.density, 800, MAX_PADDING_SCREEN_HEIGHT), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(min, min2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    protected final void sendErrorToListener(@Nullable Throwable th) {
        FacebookException facebookException;
        if (this.onCompleteListener != null && !this.isListenerCalled) {
            this.isListenerCalled = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            OnCompleteListener onCompleteListener = this.onCompleteListener;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(null, facebookException);
            }
            dismiss();
        }
    }

    protected final void sendSuccessToListener(@Nullable Bundle bundle) {
        OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener != null && !this.isListenerCalled) {
            this.isListenerCalled = true;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(bundle, null);
            }
            dismiss();
        }
    }

    public final void setExpectedRedirectUrl(@NotNull String expectedRedirectUrl) {
        Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.expectedRedirectUrl = expectedRedirectUrl;
    }

    public final void setOnCompleteListener(@Nullable OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    /* compiled from: WebDialog.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWebDialogTheme() {
            Validate.sdkInitialized();
            return WebDialog.webDialogTheme;
        }

        protected final void initDefaultTheme(@Nullable Context context) {
            Bundle bundle;
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo == null) {
                    bundle = null;
                } else {
                    bundle = applicationInfo.metaData;
                }
                if (bundle != null && WebDialog.webDialogTheme == 0) {
                    setWebDialogTheme(applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        @NotNull
        public final WebDialog newInstance(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @Nullable OnCompleteListener onCompleteListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            WebDialog.initDefaultTheme(context);
            return new WebDialog(context, str, bundle, i, LoginTargetApp.FACEBOOK, onCompleteListener, null);
        }

        public final void setInitCallback(@Nullable InitCallback initCallback) {
            WebDialog.initCallback = initCallback;
        }

        public final void setWebDialogTheme(int i) {
            if (i == 0) {
                i = WebDialog.DEFAULT_THEME;
            }
            WebDialog.webDialogTheme = i;
        }

        @NotNull
        public final WebDialog newInstance(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @NotNull LoginTargetApp targetApp, @Nullable OnCompleteListener onCompleteListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            WebDialog.initDefaultTheme(context);
            return new WebDialog(context, str, bundle, i, targetApp, onCompleteListener, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebDialog(@NotNull Context context, @NotNull String url) {
        this(context, url, Companion.getWebDialogTheme());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @NotNull
    public static final WebDialog newInstance(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i, @NotNull LoginTargetApp loginTargetApp, @Nullable OnCompleteListener onCompleteListener) {
        return Companion.newInstance(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    private WebDialog(Context context, String str, int i) {
        super(context, i == 0 ? Companion.getWebDialogTheme() : i);
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        this.url = str;
    }

    private WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
        super(context, i == 0 ? Companion.getWebDialogTheme() : i);
        Uri buildUri;
        String str2 = ServerProtocol.DIALOG_REDIRECT_URI;
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = Utility.isChromeOS(context) ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : str2;
        this.expectedRedirectUrl = str2;
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{FacebookSdk.getSdkVersion()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.onCompleteListener = onCompleteListener;
        if (Intrinsics.m17075f(str, "share") && bundle.containsKey("media")) {
            this.uploadTask = new AsyncTaskC13454b(this, str, bundle);
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[loginTargetApp.ordinal()] == 1) {
            buildUri = Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
        } else {
            String dialogAuthority = ServerProtocol.getDialogAuthority();
            buildUri = Utility.buildUri(dialogAuthority, FacebookSdk.getGraphApiVersion() + "/dialog/" + ((Object) str), bundle);
        }
        this.url = buildUri.toString();
    }

    /* compiled from: WebDialog.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static class Builder {
        @Nullable
        private AccessToken accessToken;
        @Nullable
        private String action;
        @Nullable
        private String applicationId;
        @Nullable
        private Context context;
        @Nullable
        private OnCompleteListener listener;
        @Nullable
        private Bundle parameters;
        private int theme;

        public Builder(@NotNull Context context, @NotNull String action, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            AccessToken.Companion companion = AccessToken.Companion;
            this.accessToken = companion.getCurrentAccessToken();
            if (!companion.isCurrentAccessTokenActive()) {
                String metadataApplicationId = Utility.getMetadataApplicationId(context);
                if (metadataApplicationId != null) {
                    this.applicationId = metadataApplicationId;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            finishInit(context, action, bundle);
        }

        private final void finishInit(Context context, String str, Bundle bundle) {
            this.context = context;
            this.action = str;
            if (bundle != null) {
                this.parameters = bundle;
            } else {
                this.parameters = new Bundle();
            }
        }

        @Nullable
        public WebDialog build() {
            String applicationId;
            AccessToken accessToken = this.accessToken;
            if (accessToken != null) {
                Bundle bundle = this.parameters;
                String str = null;
                if (bundle != null) {
                    if (accessToken == null) {
                        applicationId = null;
                    } else {
                        applicationId = accessToken.getApplicationId();
                    }
                    bundle.putString("app_id", applicationId);
                }
                Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.accessToken;
                    if (accessToken2 != null) {
                        str = accessToken2.getToken();
                    }
                    bundle2.putString("access_token", str);
                }
            } else {
                Bundle bundle3 = this.parameters;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.applicationId);
                }
            }
            Companion companion = WebDialog.Companion;
            Context context = this.context;
            if (context != null) {
                return companion.newInstance(context, this.action, this.parameters, this.theme, this.listener);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @Nullable
        public final String getApplicationId() {
            return this.applicationId;
        }

        @Nullable
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        public final OnCompleteListener getListener() {
            return this.listener;
        }

        @Nullable
        public final Bundle getParameters() {
            return this.parameters;
        }

        public final int getTheme() {
            return this.theme;
        }

        @NotNull
        public final Builder setOnCompleteListener(@Nullable OnCompleteListener onCompleteListener) {
            this.listener = onCompleteListener;
            return this;
        }

        @NotNull
        public final Builder setTheme(int i) {
            this.theme = i;
            return this;
        }

        public Builder(@NotNull Context context, @Nullable String str, @NotNull String action, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            this.applicationId = Validate.notNullOrEmpty(str == null ? Utility.getMetadataApplicationId(context) : str, "applicationId");
            finishInit(context, action, bundle);
        }
    }
}
