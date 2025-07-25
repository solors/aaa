package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConfigContainer {
    public static final String ROLLOUT_METADATA_AFFECTED_KEYS = "affectedParameterKeys";
    public static final String ROLLOUT_METADATA_ID = "rolloutId";
    public static final String ROLLOUT_METADATA_VARIANT_ID = "variantId";

    /* renamed from: h */
    private static final Date f43465h = new Date(0);

    /* renamed from: a */
    private JSONObject f43466a;

    /* renamed from: b */
    private JSONObject f43467b;

    /* renamed from: c */
    private Date f43468c;

    /* renamed from: d */
    private JSONArray f43469d;

    /* renamed from: e */
    private JSONObject f43470e;

    /* renamed from: f */
    private long f43471f;

    /* renamed from: g */
    private JSONArray f43472g;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        private JSONObject f43473a;

        /* renamed from: b */
        private Date f43474b;

        /* renamed from: c */
        private JSONArray f43475c;

        /* renamed from: d */
        private JSONObject f43476d;

        /* renamed from: e */
        private long f43477e;

        /* renamed from: f */
        private JSONArray f43478f;

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.f43473a, this.f43474b, this.f43475c, this.f43476d, this.f43477e, this.f43478f);
        }

        public Builder replaceConfigsWith(Map<String, String> map) {
            this.f43473a = new JSONObject(map);
            return this;
        }

        public Builder withAbtExperiments(JSONArray jSONArray) {
            try {
                this.f43475c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withFetchTime(Date date) {
            this.f43474b = date;
            return this;
        }

        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
            try {
                this.f43476d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withRolloutMetadata(JSONArray jSONArray) {
            try {
                this.f43478f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withTemplateVersionNumber(long j) {
            this.f43477e = j;
            return this;
        }

        private Builder() {
            this.f43473a = new JSONObject();
            this.f43474b = ConfigContainer.f43465h;
            this.f43475c = new JSONArray();
            this.f43476d = new JSONObject();
            this.f43477e = 0L;
            this.f43478f = new JSONArray();
        }

        public Builder replaceConfigsWith(JSONObject jSONObject) {
            try {
                this.f43473a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder(ConfigContainer configContainer) {
            this.f43473a = configContainer.getConfigs();
            this.f43474b = configContainer.getFetchTime();
            this.f43475c = configContainer.getAbtExperiments();
            this.f43476d = configContainer.getPersonalizationMetadata();
            this.f43477e = configContainer.getTemplateVersionNumber();
            this.f43478f = configContainer.getRolloutMetadata();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ConfigContainer m66417b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* renamed from: c */
    private Map<String, Map<String, String>> m66416c() throws JSONException {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getRolloutMetadata().length(); i++) {
            JSONObject jSONObject = getRolloutMetadata().getJSONObject(i);
            String string = jSONObject.getString(ROLLOUT_METADATA_ID);
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray(ROLLOUT_METADATA_AFFECTED_KEYS);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string3 = jSONArray.getString(i2);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    private static ConfigContainer m66415d(JSONObject jSONObject) throws JSONException {
        return m66417b(new JSONObject(jSONObject.toString()));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigContainer)) {
            return false;
        }
        return this.f43466a.toString().equals(((ConfigContainer) obj).toString());
    }

    public JSONArray getAbtExperiments() {
        return this.f43469d;
    }

    public Set<String> getChangedParams(ConfigContainer configContainer) throws JSONException {
        JSONObject configs = m66415d(configContainer.f43466a).getConfigs();
        Map<String, Map<String, String>> m66416c = m66416c();
        Map<String, Map<String, String>> m66416c2 = configContainer.m66416c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = getConfigs().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!configContainer.getConfigs().has(next)) {
                hashSet.add(next);
            } else if (!getConfigs().get(next).equals(configContainer.getConfigs().get(next))) {
                hashSet.add(next);
            } else if ((getPersonalizationMetadata().has(next) && !configContainer.getPersonalizationMetadata().has(next)) || (!getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next))) {
                hashSet.add(next);
            } else if (getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next) && !getPersonalizationMetadata().getJSONObject(next).toString().equals(configContainer.getPersonalizationMetadata().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (m66416c.containsKey(next) != m66416c2.containsKey(next)) {
                hashSet.add(next);
            } else if (m66416c.containsKey(next) && m66416c2.containsKey(next) && !m66416c.get(next).equals(m66416c2.get(next))) {
                hashSet.add(next);
            } else {
                configs.remove(next);
            }
        }
        Iterator<String> keys2 = configs.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject getConfigs() {
        return this.f43467b;
    }

    public Date getFetchTime() {
        return this.f43468c;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.f43470e;
    }

    public JSONArray getRolloutMetadata() {
        return this.f43472g;
    }

    public long getTemplateVersionNumber() {
        return this.f43471f;
    }

    public int hashCode() {
        return this.f43466a.hashCode();
    }

    public String toString() {
        return this.f43466a.toString();
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f43467b = jSONObject;
        this.f43468c = date;
        this.f43469d = jSONArray;
        this.f43470e = jSONObject2;
        this.f43471f = j;
        this.f43472g = jSONArray2;
        this.f43466a = jSONObject3;
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }
}
