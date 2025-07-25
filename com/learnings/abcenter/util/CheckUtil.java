package com.learnings.abcenter.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class CheckUtil {
    public static boolean isCollectionNullOrEmpty(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isListNullOrEmpty(List<?> list) {
        return isCollectionNullOrEmpty(list);
    }

    public static boolean isMapNullOrEmpty(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }
}
