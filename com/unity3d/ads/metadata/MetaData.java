package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() != null) {
            return getCategory() + "." + str;
        }
        return str;
    }

    private synchronized boolean set(String str, boolean z) {
        return set(str, Boolean.valueOf(z));
    }

    public void commit() {
        if (StorageManager.init(this._context)) {
            Storage storage = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
            if (getData() != null && storage != null) {
                Iterator<String> keys = getData().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = get(next);
                    if (storage.get(next) != null && (storage.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                        try {
                            obj = Utilities.mergeJsonObjects((JSONObject) obj, (JSONObject) storage.get(next));
                        } catch (Exception e) {
                            DeviceLog.exception("Exception merging JSONs", e);
                        }
                    }
                    storage.set(next, obj);
                }
                storage.writeStorage();
                storage.sendEvent(StorageEvent.SET, getData());
                return;
            }
            return;
        }
        DeviceLog.error("Unity Ads could not commit metadata due to storage error");
    }

    public String getCategory() {
        return this._category;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i) {
        return set(str, Integer.valueOf(i));
    }

    private synchronized boolean set(String str, long j) {
        return set(str, Long.valueOf(j));
    }

    @Override // com.unity3d.services.core.misc.JsonStorage
    public synchronized boolean set(String str, Object obj) {
        boolean z;
        initData();
        if (super.set(getActualKey(str) + ".value", obj)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getActualKey(str));
            sb2.append(".ts");
            z = super.set(sb2.toString(), Long.valueOf(System.currentTimeMillis()));
        }
        return z;
    }
}
