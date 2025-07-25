package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigRealtimeHandler configRealtimeHandler;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    @Nullable
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;
    private final RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcMetadata = configMetadataClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, @Nullable ConfigContainer configContainer2) {
        if (configContainer2 != null && configContainer.getFetchTime().equals(configContainer2.getFetchTime())) {
            return false;
        }
        return true;
    }

    public /* synthetic */ Task lambda$activate$2(Task task, Task task2, Task task3) throws Exception {
        if (task.isSuccessful() && task.getResult() != null) {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (task2.isSuccessful() && !isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.i
                {
                    FirebaseRemoteConfig.this = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    boolean processActivatePutTask;
                    processActivatePutTask = FirebaseRemoteConfig.this.processActivatePutTask(task4);
                    return Boolean.valueOf(processActivatePutTask);
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task, Task task2) throws Exception {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    public static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        return Tasks.forResult(null);
    }

    public /* synthetic */ Task lambda$fetchAndActivate$1(Void r1) throws Exception {
        return activate();
    }

    public /* synthetic */ Void lambda$reset$6() throws Exception {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcMetadata.clear();
        return null;
    }

    public /* synthetic */ Void lambda$setConfigSettingsAsync$5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
        this.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    public static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) throws Exception {
        return Tasks.forResult(null);
    }

    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (task.isSuccessful()) {
            this.fetchedConfigsCache.clear();
            ConfigContainer result = task.getResult();
            if (result != null) {
                updateAbtWithActivatedExperiments(result.getAbtExperiments());
                this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(result);
                return true;
            }
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.a
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task lambda$setDefaultsWithStringsMapAsync$7;
                    lambda$setDefaultsWithStringsMapAsync$7 = FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
                    return lambda$setDefaultsWithStringsMapAsync$7;
                }
            });
        } catch (JSONException e) {
            Log.e(TAG, "The provided defaults map could not be processed.", e);
            return Tasks.forResult(null);
        }
    }

    @VisibleForTesting
    static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @NonNull
    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return Tasks.whenAllComplete(task, task2).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.j
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task lambda$activate$2;
                lambda$activate$2 = FirebaseRemoteConfig.this.lambda$activate$2(task, task2, task3);
                return lambda$activate$2;
            }
        });
    }

    @NonNull
    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        return this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    @NonNull
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task call = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.e
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.this.getInfo();
            }
        });
        return Tasks.whenAllComplete(task, task2, task3, call, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                FirebaseRemoteConfigInfo lambda$ensureInitialized$0;
                lambda$ensureInitialized$0 = FirebaseRemoteConfig.lambda$ensureInitialized$0(call, task4);
                return lambda$ensureInitialized$0;
            }
        });
    }

    @NonNull
    public Task<Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$fetch$3;
                lambda$fetch$3 = FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$3;
            }
        });
    }

    @NonNull
    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.h
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$fetchAndActivate$1;
                lambda$fetchAndActivate$1 = FirebaseRemoteConfig.this.lambda$fetchAndActivate$1((Void) obj);
                return lambda$fetchAndActivate$1;
            }
        });
    }

    @NonNull
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(@NonNull String str) {
        return this.getHandler.getDouble(str);
    }

    @NonNull
    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcMetadata.getInfo();
    }

    @NonNull
    public Set<String> getKeysByPrefix(@NonNull String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(@NonNull String str) {
        return this.getHandler.getLong(str);
    }

    public RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        return this.rolloutsStateSubscriptionsHandler;
    }

    @NonNull
    public String getString(@NonNull String str) {
        return this.getHandler.getString(str);
    }

    @NonNull
    public FirebaseRemoteConfigValue getValue(@NonNull String str) {
        return this.getHandler.getValue(str);
    }

    @NonNull
    public Task<Void> reset() {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.c
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$reset$6;
                lambda$reset$6 = FirebaseRemoteConfig.this.lambda$reset$6();
                return lambda$reset$6;
            }
        });
    }

    public void schedule(Runnable runnable) {
        this.executor.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.g
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$setConfigSettingsAsync$5;
                lambda$setConfigSettingsAsync$5 = FirebaseRemoteConfig.this.lambda$setConfigSettingsAsync$5(firebaseRemoteConfigSettings);
                return lambda$setConfigSettingsAsync$5;
            }
        });
    }

    public void setConfigUpdateBackgroundState(boolean z) {
        this.configRealtimeHandler.setBackgroundState(z);
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@NonNull Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(hashMap);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    @VisibleForTesting
    void updateAbtWithActivatedExperiments(@NonNull JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException e) {
            Log.w(TAG, "Could not update ABT experiments.", e);
        } catch (JSONException e2) {
            Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e2);
        }
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).m66451e();
    }

    @NonNull
    public Task<Void> fetch(long j) {
        return this.fetchHandler.fetch(j).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$fetch$4;
                lambda$fetch$4 = FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$4;
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@XmlRes int i) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }
}
