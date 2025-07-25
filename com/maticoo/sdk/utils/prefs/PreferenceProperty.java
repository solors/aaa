package com.maticoo.sdk.utils.prefs;

import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public class PreferenceProperty<T> {
    static final String MATICOO_SP_KEY = "zmaticoo_sdk_default";
    private T defaultValue;
    private String name;
    private String spName;
    private Class<T> type;

    public PreferenceProperty(String str, @NonNull T t) {
        this(MATICOO_SP_KEY, str, t.getClass(), t);
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getSpName() {
        return this.spName;
    }

    public Class<T> getType() {
        return this.type;
    }

    public T getValue() {
        return (T) PreferencePropertyCache.getValue(this);
    }

    public void resetValue() {
        PreferencePropertyCache.setValue(this, getDefaultValue());
    }

    public void setValue(T t) {
        PreferencePropertyCache.setValue(this, t);
    }

    public PreferenceProperty(String str, String str2, @NonNull T t) {
        this(str, str2, t.getClass(), t);
    }

    public PreferenceProperty(String str, Class<T> cls) {
        this(MATICOO_SP_KEY, str, cls, null);
    }

    public PreferenceProperty(String str, Class<T> cls, T t) {
        this(MATICOO_SP_KEY, str, cls, t);
    }

    public PreferenceProperty(String str, String str2, Class<T> cls) {
        this(str, str2, cls, null);
    }

    private PreferenceProperty(String str, String str2, Class<T> cls, T t) {
        this.spName = str;
        this.name = str2;
        this.defaultValue = t;
        this.type = cls;
        if (t == null) {
            if (cls != Integer.class && cls != Short.class) {
                if (cls == Long.class) {
                    this.defaultValue = (T) 0L;
                    return;
                } else if (cls == Double.class) {
                    this.defaultValue = (T) Double.valueOf(0.0d);
                    return;
                } else if (cls == Float.class) {
                    this.defaultValue = (T) Float.valueOf(0.0f);
                    return;
                } else if (cls == Boolean.class) {
                    this.defaultValue = (T) Boolean.FALSE;
                    return;
                } else {
                    return;
                }
            }
            this.defaultValue = (T) 0;
        }
    }
}
