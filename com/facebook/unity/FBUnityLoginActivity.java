package com.facebook.unity;

import android.os.Bundle;
import com.facebook.CallbackManager;

/* loaded from: classes4.dex */
public class FBUnityLoginActivity extends BaseActivity {
    public static final String LOGIN_PARAMS = "login_params";
    public static final String LOGIN_TYPE = "login_type";

    /* loaded from: classes4.dex */
    public enum LoginType {
        READ,
        PUBLISH,
        TV_READ,
        TV_PUBLISH
    }

    /* renamed from: com.facebook.unity.FBUnityLoginActivity$a */
    /* loaded from: classes4.dex */
    static /* synthetic */ class C13601a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24973a;

        static {
            int[] iArr = new int[LoginType.values().length];
            f24973a = iArr;
            try {
                iArr[LoginType.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24973a[LoginType.PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24973a[LoginType.TV_READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24973a[LoginType.TV_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(LOGIN_PARAMS);
        int i = C13601a.f24973a[((LoginType) getIntent().getSerializableExtra(LOGIN_TYPE)).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        FBLogin.loginForTVWithPublishPermissions(stringExtra, this);
                        return;
                    }
                    return;
                }
                FBLogin.loginForTVWithReadPermissions(stringExtra, this);
                return;
            }
            FBLogin.loginWithPublishPermissions(stringExtra, this);
            return;
        }
        FBLogin.loginWithReadPermissions(stringExtra, this);
    }
}
