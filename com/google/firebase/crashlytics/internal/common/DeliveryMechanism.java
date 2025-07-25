package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: b */
    private final int f42392b;

    DeliveryMechanism(int i) {
        this.f42392b = i;
    }

    public static DeliveryMechanism determineFrom(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int getId() {
        return this.f42392b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f42392b);
    }
}
