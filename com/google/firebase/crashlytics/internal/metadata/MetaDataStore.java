package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class MetaDataStore {

    /* renamed from: b */
    private static final Charset f42450b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final FileStore f42451a;

    public MetaDataStore(FileStore fileStore) {
        this.f42451a = fileStore;
    }

    /* renamed from: a */
    private static Map<String, String> m67043a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m67035i(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: b */
    private static List<RolloutAssignment> m67042b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.m67012a(string));
            } catch (Exception e) {
                Logger logger = Logger.getLogger();
                logger.m67207w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: c */
    private String m67041c(String str) throws JSONException {
        return m67035i(new JSONObject(str), "userId");
    }

    /* renamed from: d */
    private static String m67040d(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: f */
    private static String m67038f(List<RolloutAssignment> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (JSONException e) {
                Logger.getLogger().m67207w("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: g */
    private static void m67037g(File file) {
        if (file.exists() && file.delete()) {
            Logger logger = Logger.getLogger();
            logger.m67212i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: h */
    private static String m67036h(String str) throws JSONException {
        return new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1

            /* renamed from: a */
            final /* synthetic */ String f42452a;

            {
                this.f42452a = str;
                put("userId", str);
            }
        }.toString();
    }

    /* renamed from: i */
    private static String m67035i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> m67039e(String str, boolean z) {
        File keysFileForSession;
        FileInputStream fileInputStream;
        Exception e;
        if (z) {
            keysFileForSession = getInternalKeysFileForSession(str);
        } else {
            keysFileForSession = getKeysFileForSession(str);
        }
        if (keysFileForSession.exists() && keysFileForSession.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(keysFileForSession);
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th) {
                th = th;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    Map<String, String> m67043a = m67043a(CommonUtils.streamToString(fileInputStream));
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return m67043a;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Logger.getLogger().m67207w("Error deserializing user metadata.", e);
                m67037g(keysFileForSession);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
        }
        m67037g(keysFileForSession);
        return Collections.emptyMap();
    }

    @NonNull
    public File getInternalKeysFileForSession(String str) {
        return this.f42451a.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    @NonNull
    public File getKeysFileForSession(String str) {
        return this.f42451a.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    @NonNull
    public File getRolloutsStateForSession(String str) {
        return this.f42451a.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    @NonNull
    public File getUserDataFileForSession(String str) {
        return this.f42451a.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    public Map<String, String> readKeyData(String str) {
        return m67039e(str, false);
    }

    public List<RolloutAssignment> readRolloutsState(String str) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (rolloutsStateForSession.exists() && rolloutsStateForSession.length() != 0) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(rolloutsStateForSession);
                    try {
                        List<RolloutAssignment> m67042b = m67042b(CommonUtils.streamToString(fileInputStream2));
                        Logger logger = Logger.getLogger();
                        logger.m67216d("Loaded rollouts state:\n" + m67042b + "\nfor session " + str);
                        CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                        return m67042b;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        Logger.getLogger().m67207w("Error deserializing rollouts state.", e);
                        m67037g(rolloutsStateForSession);
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                        return Collections.emptyList();
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            m67037g(rolloutsStateForSession);
            return Collections.emptyList();
        }
    }

    @Nullable
    public String readUserId(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream2 = null;
        if (userDataFileForSession.exists() && userDataFileForSession.length() != 0) {
            try {
                fileInputStream = new FileInputStream(userDataFileForSession);
            } catch (Exception e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    String m67041c = m67041c(CommonUtils.streamToString(fileInputStream));
                    Logger.getLogger().m67216d("Loaded userId " + m67041c + " for session " + str);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return m67041c;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Logger.getLogger().m67207w("Error deserializing user metadata.", e);
                m67037g(userDataFileForSession);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        Logger.getLogger().m67216d("No userId set for session " + str);
        m67037g(userDataFileForSession);
        return null;
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    public void writeRolloutState(String str, List<RolloutAssignment> list) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            m67037g(rolloutsStateForSession);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m67038f = m67038f(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), f42450b));
                try {
                    bufferedWriter2.write(m67038f);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m67207w("Error serializing rollouts state.", e);
                    m67037g(rolloutsStateForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void writeUserData(String str, String str2) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m67036h = m67036h(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), f42450b));
                try {
                    bufferedWriter2.write(m67036h);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m67207w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z) {
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m67040d = m67040d(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), f42450b));
                try {
                    bufferedWriter2.write(m67040d);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m67207w("Error serializing key/value metadata.", e);
                    m67037g(internalKeysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
