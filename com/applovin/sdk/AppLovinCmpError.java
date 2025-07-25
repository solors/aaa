package com.applovin.sdk;

/* loaded from: classes2.dex */
public interface AppLovinCmpError {

    /* loaded from: classes2.dex */
    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);
        

        /* renamed from: a */
        private final int f12881a;

        Code(int i) {
            this.f12881a = i;
        }

        public int getValue() {
            return this.f12881a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
