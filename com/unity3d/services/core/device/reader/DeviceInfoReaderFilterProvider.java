package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class DeviceInfoReaderFilterProvider {
    private static final String FILTER_EXCLUDE_KEY = "exclude";
    private static final String UNIFIED_CONFIG_KEY = "unifiedconfig";
    private IJsonStorageReader _storage;

    public DeviceInfoReaderFilterProvider(IJsonStorageReader iJsonStorageReader) {
        this._storage = iJsonStorageReader;
    }

    private List<String> trimWhiteSpaces(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(str.trim());
        }
        return arrayList;
    }

    public List<String> getFilterList() {
        Object opt;
        ArrayList arrayList = new ArrayList();
        IJsonStorageReader iJsonStorageReader = this._storage;
        if (iJsonStorageReader != null && iJsonStorageReader.getData() != null && (opt = this._storage.getData().opt("unifiedconfig")) != null && (opt instanceof JSONObject)) {
            Object opt2 = ((JSONObject) opt).opt("exclude");
            if (opt2 instanceof String) {
                return trimWhiteSpaces(Arrays.asList(((String) opt2).split(",")));
            }
            return arrayList;
        }
        return arrayList;
    }
}
