package com.amazon.device.simplesignin;

import android.content.Context;
import android.util.Log;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.p107a.SimpleSignInManager;
import java.util.Map;
import lombok.NonNull;

/* loaded from: classes2.dex */
public final class SimpleSignInService {
    public static final String SDK_VERSION = "1.0.0";
    private static final String TAG = "SimpleSignInService";

    static {
        Log.i(SimpleSignInService.class.getSimpleName(), "Amazon Simple Sign-In SDK initializing. SDK version : 1.0.0");
    }

    public static String getSDKMode() {
        return SimpleSignInManager.m102335a().m102328b();
    }

    public static RequestId getUserAndLinks(@NonNull String str) {
        if (str != null) {
            return SimpleSignInManager.m102335a().m102330a(str);
        }
        throw new NullPointerException("identityProviderName is marked non-null but is null");
    }

    public static RequestId linkUserAccount(@NonNull LinkUserAccountRequest linkUserAccountRequest) {
        if (linkUserAccountRequest != null) {
            return SimpleSignInManager.m102335a().m102332a(linkUserAccountRequest);
        }
        throw new NullPointerException("linkUserAccountRequest is marked non-null but is null");
    }

    public static RequestId recordMetricEvent(@NonNull SSIEventRequest sSIEventRequest) {
        if (sSIEventRequest != null) {
            return SimpleSignInManager.m102335a().m102331a(sSIEventRequest);
        }
        throw new NullPointerException("ssiEventRequest is marked non-null but is null");
    }

    public static void registerResponseHandler(@NonNull Context context, @NonNull ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        if (context != null) {
            if (iSimpleSignInResponseHandler != null) {
                SimpleSignInManager.m102335a().m102333a(context, iSimpleSignInResponseHandler);
                return;
            }
            throw new NullPointerException("responseHandler is marked non-null but is null");
        }
        throw new NullPointerException("appContext is marked non-null but is null");
    }

    public static RequestId showLoginSelection(@NonNull Map<String, String> map) {
        if (map != null) {
            return SimpleSignInManager.m102335a().m102329a(map);
        }
        throw new NullPointerException("loginNames is marked non-null but is null");
    }
}
