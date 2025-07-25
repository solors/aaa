package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class MessagingClientEventExtension {

    /* renamed from: b */
    private static final MessagingClientEventExtension f43400b = new Builder().build();

    /* renamed from: a */
    private final MessagingClientEvent f43401a;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private MessagingClientEvent f43402a = null;

        Builder() {
        }

        public MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.f43402a);
        }

        public Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.f43402a = messagingClientEvent;
            return this;
        }
    }

    MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.f43401a = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return f43400b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.f43401a;
        if (messagingClientEvent == null) {
            return MessagingClientEvent.getDefaultInstance();
        }
        return messagingClientEvent;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "messagingClientEvent")
    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.f43401a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
