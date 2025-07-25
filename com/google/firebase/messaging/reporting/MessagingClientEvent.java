package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class MessagingClientEvent {

    /* renamed from: p */
    private static final MessagingClientEvent f43363p = new Builder().build();

    /* renamed from: a */
    private final long f43364a;

    /* renamed from: b */
    private final String f43365b;

    /* renamed from: c */
    private final String f43366c;

    /* renamed from: d */
    private final MessageType f43367d;

    /* renamed from: e */
    private final SDKPlatform f43368e;

    /* renamed from: f */
    private final String f43369f;

    /* renamed from: g */
    private final String f43370g;

    /* renamed from: h */
    private final int f43371h;

    /* renamed from: i */
    private final int f43372i;

    /* renamed from: j */
    private final String f43373j;

    /* renamed from: k */
    private final long f43374k;

    /* renamed from: l */
    private final Event f43375l;

    /* renamed from: m */
    private final String f43376m;

    /* renamed from: n */
    private final long f43377n;

    /* renamed from: o */
    private final String f43378o;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private long f43379a = 0;

        /* renamed from: b */
        private String f43380b = "";

        /* renamed from: c */
        private String f43381c = "";

        /* renamed from: d */
        private MessageType f43382d = MessageType.UNKNOWN;

        /* renamed from: e */
        private SDKPlatform f43383e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        private String f43384f = "";

        /* renamed from: g */
        private String f43385g = "";

        /* renamed from: h */
        private int f43386h = 0;

        /* renamed from: i */
        private int f43387i = 0;

        /* renamed from: j */
        private String f43388j = "";

        /* renamed from: k */
        private long f43389k = 0;

        /* renamed from: l */
        private Event f43390l = Event.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f43391m = "";

        /* renamed from: n */
        private long f43392n = 0;

        /* renamed from: o */
        private String f43393o = "";

        Builder() {
        }

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.f43379a, this.f43380b, this.f43381c, this.f43382d, this.f43383e, this.f43384f, this.f43385g, this.f43386h, this.f43387i, this.f43388j, this.f43389k, this.f43390l, this.f43391m, this.f43392n, this.f43393o);
        }

        public Builder setAnalyticsLabel(String str) {
            this.f43391m = str;
            return this;
        }

        public Builder setBulkId(long j) {
            this.f43389k = j;
            return this;
        }

        public Builder setCampaignId(long j) {
            this.f43392n = j;
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f43385g = str;
            return this;
        }

        public Builder setComposerLabel(String str) {
            this.f43393o = str;
            return this;
        }

        public Builder setEvent(Event event) {
            this.f43390l = event;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.f43381c = str;
            return this;
        }

        public Builder setMessageId(String str) {
            this.f43380b = str;
            return this;
        }

        public Builder setMessageType(MessageType messageType) {
            this.f43382d = messageType;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f43384f = str;
            return this;
        }

        public Builder setPriority(int i) {
            this.f43386h = i;
            return this;
        }

        public Builder setProjectNumber(long j) {
            this.f43379a = j;
            return this;
        }

        public Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.f43383e = sDKPlatform;
            return this;
        }

        public Builder setTopic(String str) {
            this.f43388j = str;
            return this;
        }

        public Builder setTtl(int i) {
            this.f43387i = i;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: b */
        private final int f43395b;

        Event(int i) {
            this.f43395b = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.f43395b;
        }
    }

    /* loaded from: classes4.dex */
    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: b */
        private final int f43397b;

        MessageType(int i) {
            this.f43397b = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.f43397b;
        }
    }

    /* loaded from: classes4.dex */
    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: b */
        private final int f43399b;

        SDKPlatform(int i) {
            this.f43399b = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.f43399b;
        }
    }

    MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.f43364a = j;
        this.f43365b = str;
        this.f43366c = str2;
        this.f43367d = messageType;
        this.f43368e = sDKPlatform;
        this.f43369f = str3;
        this.f43370g = str4;
        this.f43371h = i;
        this.f43372i = i2;
        this.f43373j = str5;
        this.f43374k = j2;
        this.f43375l = event;
        this.f43376m = str6;
        this.f43377n = j3;
        this.f43378o = str7;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return f43363p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    public String getAnalyticsLabel() {
        return this.f43376m;
    }

    @Protobuf(tag = 11)
    public long getBulkId() {
        return this.f43374k;
    }

    @Protobuf(tag = 14)
    public long getCampaignId() {
        return this.f43377n;
    }

    @Protobuf(tag = 7)
    public String getCollapseKey() {
        return this.f43370g;
    }

    @Protobuf(tag = 15)
    public String getComposerLabel() {
        return this.f43378o;
    }

    @Protobuf(tag = 12)
    public Event getEvent() {
        return this.f43375l;
    }

    @Protobuf(tag = 3)
    public String getInstanceId() {
        return this.f43366c;
    }

    @Protobuf(tag = 2)
    public String getMessageId() {
        return this.f43365b;
    }

    @Protobuf(tag = 4)
    public MessageType getMessageType() {
        return this.f43367d;
    }

    @Protobuf(tag = 6)
    public String getPackageName() {
        return this.f43369f;
    }

    @Protobuf(tag = 8)
    public int getPriority() {
        return this.f43371h;
    }

    @Protobuf(tag = 1)
    public long getProjectNumber() {
        return this.f43364a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform getSdkPlatform() {
        return this.f43368e;
    }

    @Protobuf(tag = 10)
    public String getTopic() {
        return this.f43373j;
    }

    @Protobuf(tag = 9)
    public int getTtl() {
        return this.f43372i;
    }
}
