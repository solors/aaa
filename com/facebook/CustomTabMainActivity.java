package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.CustomTab;
import com.facebook.internal.InstagramCustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginTargetApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomTabMainActivity.kt */
@Metadata
/* loaded from: classes3.dex */
public final class CustomTabMainActivity extends Activity {
    @Nullable
    private BroadcastReceiver redirectReceiver;
    private boolean shouldCloseCustomTab = true;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_ACTION = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
    @NotNull
    public static final String EXTRA_PARAMS = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
    @NotNull
    public static final String EXTRA_CHROME_PACKAGE = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
    @NotNull
    public static final String EXTRA_URL = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
    @NotNull
    public static final String EXTRA_TARGET_APP = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
    @NotNull
    public static final String REFRESH_ACTION = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
    @NotNull
    public static final String NO_ACTIVITY_EXCEPTION = Intrinsics.m17064q(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* compiled from: CustomTabMainActivity.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle parseResponseUri(String str) {
            Uri parse = Uri.parse(str);
            Utility utility = Utility.INSTANCE;
            Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
            parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
            return parseUrlQueryString;
        }
    }

    /* compiled from: CustomTabMainActivity.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void sendResult(int i, Intent intent) {
        Bundle bundle;
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(EXTRA_URL);
            if (stringExtra != null) {
                bundle = Companion.parseResponseUri(stringExtra);
            } else {
                bundle = new Bundle();
            }
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent createProtocolResultIntent = NativeProtocol.createProtocolResultIntent(intent2, bundle, null);
            if (createProtocolResultIntent != null) {
                intent = createProtocolResultIntent;
            }
            setResult(i, intent);
        } else {
            NativeProtocol nativeProtocol2 = NativeProtocol.INSTANCE;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(i, NativeProtocol.createProtocolResultIntent(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        CustomTab customTab;
        super.onCreate(bundle);
        String str = CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION;
        if (Intrinsics.m17075f(str, getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle != null || (stringExtra = getIntent().getStringExtra(EXTRA_ACTION)) == null) {
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra(EXTRA_PARAMS);
            String stringExtra2 = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
            if (WhenMappings.$EnumSwitchMapping$0[LoginTargetApp.Companion.fromString(getIntent().getStringExtra(EXTRA_TARGET_APP)).ordinal()] == 1) {
                customTab = new InstagramCustomTab(stringExtra, bundleExtra);
            } else {
                customTab = new CustomTab(stringExtra, bundleExtra);
            }
            boolean openCustomTab = customTab.openCustomTab(this, stringExtra2);
            this.shouldCloseCustomTab = false;
            if (!openCustomTab) {
                setResult(0, getIntent().putExtra(NO_ACTIVITY_EXCEPTION, true));
                finish();
                return;
            }
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.REFRESH_ACTION);
                    String str2 = CustomTabMainActivity.EXTRA_URL;
                    intent2.putExtra(str2, intent.getStringExtra(str2));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            this.redirectReceiver = broadcastReceiver;
            LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.m17075f(REFRESH_ACTION, intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.DESTROY_ACTION));
            sendResult(-1, intent);
        } else if (Intrinsics.m17075f(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            sendResult(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            sendResult(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
