package com.p551my.tracker.miniapps;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder */
/* loaded from: classes7.dex */
public abstract class MiniAppEventBuilder {

    /* renamed from: a */
    final int f68455a;

    /* renamed from: b */
    final String f68456b;

    /* renamed from: c */
    final String f68457c;

    /* renamed from: d */
    String f68458d;

    /* renamed from: e */
    String f68459e;

    /* renamed from: f */
    String f68460f;

    /* renamed from: g */
    Map<String, String> f68461g;

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$CloseEventBuilder */
    /* loaded from: classes7.dex */
    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$CustomEventBuilder */
    /* loaded from: classes7.dex */
    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f68460f = str3;
        }

        public CustomEventBuilder withCustomUserId(String str) {
            this.f68459e = str;
            return this;
        }

        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.f68461g = map;
            return this;
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$EventBuilder */
    /* loaded from: classes7.dex */
    public static final class EventBuilder {

        /* renamed from: a */
        final String f68462a;

        /* renamed from: b */
        final String f68463b;

        EventBuilder(String str, String str2) {
            this.f68462a = str;
            this.f68463b = str2;
        }

        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f68462a, this.f68463b);
        }

        public CustomEventBuilder customEvent(String str) {
            return new CustomEventBuilder(this.f68462a, this.f68463b, str);
        }

        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f68462a, this.f68463b);
        }

        public OpenEventBuilder openEvent(String str) {
            return new OpenEventBuilder(this.f68462a, this.f68463b, str);
        }

        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f68462a, this.f68463b);
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$OpenEventBuilder */
    /* loaded from: classes7.dex */
    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f68458d = str3;
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$UserEventBuilder */
    /* loaded from: classes7.dex */
    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i, String str, String str2) {
            super(i, str, str2);
        }

        public UserEventBuilder withCustomUserId(String str) {
            this.f68459e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i, String str, String str2) {
        this.f68455a = i;
        this.f68456b = str;
        this.f68457c = str2;
    }

    public static EventBuilder newEventBuilder(String str, String str2) {
        return new EventBuilder(str, str2);
    }

    public final MiniAppEvent build() {
        TreeMap treeMap;
        if (this.f68461g == null) {
            treeMap = null;
        } else {
            treeMap = new TreeMap(this.f68461g);
        }
        return new MiniAppEvent(this.f68455a, this.f68456b, this.f68457c, this.f68458d, this.f68459e, this.f68460f, treeMap);
    }
}
