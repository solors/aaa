package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class RolloutsStateFactory {

    /* renamed from: a */
    ConfigCacheClient f43596a;

    /* renamed from: b */
    ConfigCacheClient f43597b;

    RolloutsStateFactory(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f43596a = configCacheClient;
        this.f43597b = configCacheClient2;
    }

    @NonNull
    /* renamed from: b */
    private String m66312b(@NonNull String str) {
        String m66311c = m66311c(this.f43596a, str);
        if (m66311c != null) {
            return m66311c;
        }
        String m66311c2 = m66311c(this.f43597b, str);
        if (m66311c2 != null) {
            return m66311c2;
        }
        return "";
    }

    @Nullable
    /* renamed from: c */
    private static String m66311c(@NonNull ConfigCacheClient configCacheClient, @NonNull String str) {
        ConfigContainer blocking = configCacheClient.getBlocking();
        if (blocking == null) {
            return null;
        }
        try {
            return blocking.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    public static RolloutsStateFactory create(@NonNull ConfigCacheClient configCacheClient, @NonNull ConfigCacheClient configCacheClient2) {
        return new RolloutsStateFactory(configCacheClient, configCacheClient2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public RolloutsState m66313a(@NonNull ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < rolloutMetadata.length(); i++) {
            try {
                JSONObject jSONObject = rolloutMetadata.getJSONObject(i);
                String string = jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID);
                JSONArray jSONArray = jSONObject.getJSONArray(ConfigContainer.ROLLOUT_METADATA_AFFECTED_KEYS);
                if (jSONArray.length() > 1) {
                    Log.w(FirebaseRemoteConfig.TAG, String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(optString).setParameterValue(m66312b(optString)).setTemplateVersion(templateVersionNumber).build());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return RolloutsState.create(hashSet);
    }
}
