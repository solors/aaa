package com.facebook.unity;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class FBLogin {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.unity.FBLogin$a */
    /* loaded from: classes4.dex */
    public class C13595a implements FacebookCallback<LoginResult> {

        /* renamed from: a */
        final /* synthetic */ String f24961a;

        /* renamed from: b */
        final /* synthetic */ UnityMessage f24962b;

        C13595a(String str, UnityMessage unityMessage) {
            this.f24961a = str;
            this.f24962b = unityMessage;
        }

        @Override // com.facebook.FacebookCallback
        /* renamed from: a */
        public void onSuccess(LoginResult loginResult) {
            FBLogin.sendLoginSuccessMessage(loginResult.getAccessToken(), loginResult.getAuthenticationToken(), this.f24961a);
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            this.f24962b.putCancelled();
            this.f24962b.send();
        }

        @Override // com.facebook.FacebookCallback
        public void onError(FacebookException facebookException) {
            Log.w(C13581FB.TAG, "Error occurred, ", facebookException);
            this.f24962b.sendError(facebookException.getMessage());
        }
    }

    public static void addLoginParametersToMessage(UnityMessage unityMessage, AccessToken accessToken, AuthenticationToken authenticationToken, String str) {
        String str2;
        unityMessage.put("key_hash", C13581FB.getKeyHash());
        unityMessage.put("opened", Boolean.TRUE);
        unityMessage.put("access_token", accessToken.getToken());
        if (authenticationToken != null) {
            unityMessage.put("auth_token_string", authenticationToken.getToken());
            unityMessage.put("auth_nonce", authenticationToken.getExpectedNonce());
        }
        unityMessage.put("expiration_timestamp", Long.valueOf(accessToken.getExpires().getTime() / 1000).toString());
        unityMessage.put("user_id", accessToken.getUserId());
        unityMessage.put("permissions", TextUtils.join(",", accessToken.getPermissions()));
        unityMessage.put("declined_permissions", TextUtils.join(",", accessToken.getDeclinedPermissions()));
        if (accessToken.getGraphDomain() != null) {
            str2 = accessToken.getGraphDomain();
        } else {
            str2 = AccessToken.DEFAULT_GRAPH_DOMAIN;
        }
        unityMessage.put("graph_domain", str2);
        if (accessToken.getLastRefresh() != null) {
            unityMessage.put("last_refresh", Long.valueOf(accessToken.getLastRefresh().getTime() / 1000).toString());
        }
        if (str != null && !str.isEmpty()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, str);
        }
    }

    private static void login(String str, FBUnityLoginActivity fBUnityLoginActivity, boolean z, boolean z2) {
        ArrayList arrayList;
        LoginManager loginManager;
        if (!FacebookSdk.isInitialized()) {
            Log.w(C13581FB.TAG, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        unityMessage.put("key_hash", C13581FB.getKeyHash());
        UnityParams parse = UnityParams.parse(str, "couldn't parse login params: " + str);
        String str2 = null;
        if (parse.hasString("scope").booleanValue()) {
            arrayList = new ArrayList(Arrays.asList(parse.getString("scope").split(",")));
        } else {
            arrayList = null;
        }
        if (parse.has(Constants.CALLBACK_ID_KEY)) {
            str2 = parse.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, str2);
        }
        LoginManager.getInstance().registerCallback(fBUnityLoginActivity.getCallbackManager(), new C13595a(str2, unityMessage));
        if (z2) {
            loginManager = LoginManager.getInstance();
        } else {
            loginManager = LoginManager.getInstance();
        }
        if (z) {
            loginManager.logInWithPublishPermissions(fBUnityLoginActivity, arrayList);
        } else {
            loginManager.logInWithReadPermissions(fBUnityLoginActivity, arrayList);
        }
    }

    public static void loginForTVWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, true);
    }

    public static void loginForTVWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, true);
    }

    public static void loginWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, false);
    }

    public static void loginWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, false);
    }

    public static void sendLoginSuccessMessage(AccessToken accessToken, AuthenticationToken authenticationToken, String str) {
        UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        addLoginParametersToMessage(unityMessage, accessToken, authenticationToken, str);
        unityMessage.send();
    }
}
