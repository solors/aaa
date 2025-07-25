package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface HeartBeatInfo {

    /* loaded from: classes4.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: b */
        private final int f43041b;

        HeartBeat(int i) {
            this.f43041b = i;
        }

        public int getCode() {
            return this.f43041b;
        }
    }

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String str);
}
