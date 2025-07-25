package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GameFeaturesLibrary {
    public static void canCreateShortcut(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.CAN_CREATE_SHORTCUT);
    }

    public static void createShortcut(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.CREATE_SHORTCUT);
    }

    public static void createTournamentAsync(Context context, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable JSONObject jSONObject, DaemonRequest.Callback callback) {
        try {
            DaemonRequest.executeAsync(context, new JSONObject().put(SDKConstants.PARAM_INITIAL_SCORE, i).put("title", str).put("image", str2).put(SDKConstants.PARAM_SORT_ORDER, str3).put(SDKConstants.PARAM_SCORE_FORMAT, str4).put("endTime", num).put("data", jSONObject), callback, SDKMessageEnum.TOURNAMENT_CREATE_ASYNC);
        } catch (JSONException e) {
            SDKLogger.logInternalError(context, SDKMessageEnum.TOURNAMENT_CREATE_ASYNC, e);
        }
    }

    public static void getPayload(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.GET_PAYLOAD);
    }

    public static void getTournamentAsync(Context context, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, (JSONObject) null, callback, SDKMessageEnum.GET_TOURNAMENT_ASYNC);
    }

    public static void getTournamentsAsync(Context context, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, (JSONObject) null, callback, SDKMessageEnum.TOURNAMENT_GET_TOURNAMENTS_ASYNC);
    }

    public static void joinTournamentAsync(Context context, String str, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put(SDKConstants.PARAM_TOURNAMENT_ID, str), callback, SDKMessageEnum.TOURNAMENT_JOIN_ASYNC);
    }

    public static void performHapticFeedback(Context context) {
        DaemonRequest.executeAsync(context, (JSONObject) null, new C13412a(), SDKMessageEnum.PERFORM_HAPTIC_FEEDBACK_ASYNC);
    }

    public static void postSessionScore(Context context, int i, DaemonRequest.Callback callback) {
        try {
            DaemonRequest.executeAsync(context, new JSONObject().put("score", i), callback, SDKMessageEnum.POST_SESSION_SCORE);
        } catch (JSONException e) {
            SDKLogger.logInternalError(context, SDKMessageEnum.POST_SESSION_SCORE, e);
        }
    }

    public static void postSessionScoreAsync(Context context, int i, DaemonRequest.Callback callback) {
        try {
            DaemonRequest.executeAsync(context, new JSONObject().put("score", i), callback, SDKMessageEnum.POST_SESSION_SCORE_ASYNC);
        } catch (JSONException e) {
            SDKLogger.logInternalError(context, SDKMessageEnum.POST_SESSION_SCORE_ASYNC, e);
        }
    }

    public static void postTournamentScoreAsync(Context context, int i, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put("score", i), callback, SDKMessageEnum.TOURNAMENT_POST_SCORE_ASYNC);
    }

    public static void shareTournamentAsync(Context context, @Nullable Integer num, @Nullable JSONObject jSONObject, DaemonRequest.Callback callback) {
        try {
            DaemonRequest.executeAsync(context, new JSONObject().put("score", num).put("data", jSONObject), callback, SDKMessageEnum.TOURNAMENT_SHARE_ASYNC);
        } catch (JSONException e) {
            SDKLogger.logInternalError(context, SDKMessageEnum.TOURNAMENT_SHARE_ASYNC, e);
        }
    }

    /* renamed from: com.facebook.gamingservices.cloudgaming.GameFeaturesLibrary$a */
    /* loaded from: classes3.dex */
    class C13412a implements DaemonRequest.Callback {
        C13412a() {
        }

        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
        }
    }
}
